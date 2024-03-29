import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  constructor(private _http: HttpClient) { }

  getAllCategories(): Observable<object> {
    return this._http.get(`http://localhost:8080/categories`, {withCredentials: true})
  }
}
