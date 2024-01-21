import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Question} from "../classes/question";

@Injectable({
  providedIn: 'root'
})
export class QuestionsService {

  constructor(private _http: HttpClient) { }

  getAllQuestions(): Observable<object> {
    return this._http.get(`http://localhost:8080/questions`, {withCredentials: true})
  }

  getQuestionById(id: number): Observable<object> {
    return this._http.get(`http://localhost:8080/questions/${id}`, {withCredentials: true})
  }

  createQuestion(question: Question) {
    return this._http.post("http://localhost:8080/questions", JSON.stringify(question),
      {withCredentials: true, headers: new HttpHeaders().set('Content-Type', 'application/json; charset=utf-8')})
  }

  updateQuestion(id: number, question: Question) {
    return this._http.put(`http://localhost:8080/questions/${id}`, JSON.stringify(question),
      {withCredentials: true, headers: new HttpHeaders().set('Content-Type', 'application/json; charset=utf-8')});
  }

  deleteQuestion(id: number) {
    return this._http.delete(`http://localhost:8080/questions/${id}`, {withCredentials: true})
  }
}
