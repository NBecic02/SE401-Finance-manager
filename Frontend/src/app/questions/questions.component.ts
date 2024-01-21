import {Component, Inject, LOCALE_ID, OnInit} from '@angular/core';
import {Question} from "../classes/question";
import {Router} from "@angular/router";
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";
import {QuestionService} from "../services/question.service";
import {QuestionObject} from "../classes/question-object";

@Component({
  selector: 'app-questions',
  templateUrl: './questions.component.html',
  styleUrls: ['./questions.component.css']
})
export class QuestionsComponent implements OnInit {
 questions: Question[] = [];
 questionObject: QuestionObject;
  constructor(private _router: Router,
              @Inject(LOCALE_ID) public activeLocale: string,
              private _questionService: QuestionService,
              private _modalService: NgbModal) { }

  ngOnInit(): void {
    this.getAllQuestions();
  }
  getAllQuestions() {
    this._questionService.getAllQuestions().subscribe(data => {
      this.questionObject = data;
    })
  }
}
