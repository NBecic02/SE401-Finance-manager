import { Component } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {CategoryObject} from "../classes/category-object";
import {Router} from "@angular/router";
import {ExpensesService} from "../services/expenses.service";
import {CategoryService} from "../services/category.service";
import {NgbDateStruct} from "@ng-bootstrap/ng-bootstrap";

@Component({
  selector: 'app-expense-dialog',
  standalone: false,
  imports: [],
  templateUrl: './expense-dialog.component.html',
  styleUrl: './expense-dialog.component.css'
})
export class ExpenseDialogComponent {
  model: NgbDateStruct;
  form: FormGroup;
  categoryObject: CategoryObject;

  constructor(private _formBuilder: FormBuilder,
              private _expensesService: ExpensesService,
              private _router: Router,
              private categoryService: CategoryService) {
  }

  ngOnInit(): void {
    this.buildForm()
    this.getAllCategories();
  }
  buildForm() {
    this.form = this._formBuilder.group({
      date: new FormControl("", Validators.required),
      shop: new FormControl("", Validators.required),
      expense: new FormControl("", Validators.required),
      category: new FormControl("", Validators.required)
    })
  }
  submitForm() {
    if (this.form.valid) {
      let date = this.form.value.date;
      const dateString = new Date(`${date.month}-${date.day}-${date.year}`);
      this._expensesService.createExpense({
        date: dateString.toISOString(),
        cost: this.form.value.expense,
        shop: this.form.value.shop,
        category: this.form.value.category
      }).subscribe(expense => {
        this._router.navigate([""])
      }, error => {
        alert("Error has occurred")
      })
    }
  }

  getAllCategories(){
    this.categoryService.getAllCategories().subscribe(data => {
      this.categoryObject = data;
    })
  }
  goBack() {
    this._router.navigate([""])
  }
}
