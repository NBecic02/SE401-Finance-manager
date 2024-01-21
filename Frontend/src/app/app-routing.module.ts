import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ExpenseTableComponent} from "./expense-table/expense-table.component";
import {IncomeTableComponent} from "./income-table/income-table.component";
import {ExpenseFormComponent} from "./expense-form/expense-form.component";
import {IncomeFormComponent} from "./income-form/income-form.component";
import {LoginRegisterComponent} from "./login-register/login-register.component";
import {UserGuard} from "./user.guard";
import {QuestionsComponent} from "./questions/questions.component";
import {ExpenseStatBySourceComponent} from "./expense-stat-by-source/expense-stat-by-source.component";
import {ExpenseStatByYearComponent} from "./expense-stat-by-year/expense-stat-by-year.component";
import {ExpenseStatByMonthComponent} from "./expense-stat-by-month/expense-stat-by-month.component";
import {IncomeStatByYearComponent} from "./income-stat-by-year/income-stat-by-year.component";
import {IncomeStatByMonthComponent} from "./income-stat-by-month/income-stat-by-month.component";

const routes: Routes = [
  {
    path: "",
    component: ExpenseTableComponent,
    children: [],
    canActivate: [UserGuard]
  },
  {
    path: "incomes",
    component: IncomeTableComponent,
    children: [],
    canActivate: [UserGuard]
  },
  {
    path: "questions",
    component: QuestionsComponent,
    children: [],
    canActivate: [UserGuard]
  },
  {
    path: "add-expense",
    component: ExpenseFormComponent,
    children: [],
    canActivate: [UserGuard]
  },
  {
    path: "add-income",
    component: IncomeFormComponent,
    children: [],
    canActivate: [UserGuard]
  },
  {
    path: "stat-shop",
    component: ExpenseStatBySourceComponent,
    children: [],
    canActivate: [UserGuard]
  },
  {
    path: "stat-year",
    component: ExpenseStatByYearComponent,
    children: [],
    canActivate: [UserGuard]
  },
  {
    path: "stat-month",
    component: ExpenseStatByMonthComponent,
    children: [],
    canActivate: [UserGuard]
  },
  {
    path: "income-stat-year",
    component: IncomeStatByYearComponent,
    children: [],
    canActivate: [UserGuard]
  },
  {
    path: "income-stat-month",
    component: IncomeStatByMonthComponent,
    children: [],
    canActivate: [UserGuard]
  },
  {
    path: "login",
    component: LoginRegisterComponent,
    children: []
  },
  {
    path: "**",
    component: LoginRegisterComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {onSameUrlNavigation: "reload"})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
