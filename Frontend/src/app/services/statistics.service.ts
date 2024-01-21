import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class StatisticsService {

  constructor(private _http: HttpClient) {
  }

  expenseGetStatByShop() {
    return this._http.get("http://localhost:8080/expense-statistic-by-shop", {withCredentials: true});
  }

  expenseGetStatsByMonth() {
    return this._http.get("http://localhost:8080/expense-statistic-by-month", {withCredentials: true});
  }

  expenseGetStatsByYear() {
    return this._http.get("http://localhost:8080/expense-statistic-by-year", {withCredentials: true});
  }

  incomeGetStatsByMonth() {
    return this._http.get("http://localhost:8080/income-statistic-by-month", {withCredentials: true});
  }

  incomeGetStatsByYear() {
    return this._http.get("http://localhost:8080/income-statistic-by-year", {withCredentials: true});
  }
}
