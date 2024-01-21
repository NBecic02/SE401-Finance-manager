import {Component, Input, OnInit} from '@angular/core';
import {NgbActiveModal, NgbDateStruct} from "@ng-bootstrap/ng-bootstrap";
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {Expense} from "../classes/expense";
import {CategoryObject} from "../classes/category-object";
import {CategoryService} from "../services/category.service";
import {Category} from "../classes/category";

@Component({
  selector: 'app-expenses-dialog',
  templateUrl: './expenses-dialog.component.html',
  styleUrls: ['./expenses-dialog.component.css']
})
export class ExpensesDialogComponent implements OnInit {
  model: NgbDateStruct;
  form: FormGroup;
  @Input() expense: Expense;
  closeDto: { reason: string, expense: Expense }
  categoryObject: CategoryObject;
  categories: Category[] = [];
  constructor(public activeModal: NgbActiveModal,
              private _formBuilder: FormBuilder,
              private categoryService: CategoryService) {
  }

  ngOnInit(): void {
    this.buildForm()
    this.getAllCategories()
  }

  buildForm() {
    let date = new Date(this.expense.date);
    this.model = {
      year: date.getFullYear(), month: (date.getMonth() + 1), day: date.getDate()
    }

    this.form = this._formBuilder.group({
      date: new FormControl({
        year: date.getFullYear(),
        month: (date.getMonth() + 1),
        day: date.getDate()
      }, Validators.required),
      shop: new FormControl(this.expense.shop, Validators.required),
      expense: new FormControl(this.expense.cost, Validators.required),
      category: new FormControl(this.expense.category.category_name, Validators.required)
    })
  }

  close() {
    let date = this.form.value.date;
    const dateString = new Date(`${date.month}-${date.day}-${date.year}`);
    this.closeDto = {
      reason: "save",
      expense: {
        date: dateString.toISOString(),
        cost: this.form.value.expense,
        shop: this.form.value.shop,
        category: this.form.value.category
      }
    }
    this.activeModal.close(this.closeDto);
  }

  getAllCategories() {
    this.categoryService.getAllCategories().subscribe(data => {
      this.categoryObject = data;
      this.categories = this.categoryObject.categoryList;
    })
  }
}
