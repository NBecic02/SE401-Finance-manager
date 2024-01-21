import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ExpenseTableComponent} from './expense-table/expense-table.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {IncomeTableComponent} from './income-table/income-table.component';
import {ExpenseFormComponent} from './expense-form/expense-form.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {IncomeFormComponent} from './income-form/income-form.component';
import {NgxChartsModule, PieChartModule} from "@swimlane/ngx-charts";
import {LoginRegisterComponent} from './login-register/login-register.component';
import {HttpClientModule} from "@angular/common/http";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {ExpensesDialogComponent} from './expenses-dialog/expenses-dialog.component';
import {IncomesDialogComponent} from './incomes-dialog/incomes-dialog.component';
import {YesNoDialogComponent} from './yes-no-dialog/yes-no-dialog.component';
import {HTTP_INTERCEPTORS} from '@angular/common/http';
import {AuthInterceptor} from './interceptor/auth.interceptor';
import {QuestionsComponent} from './questions/questions.component';
import {CdkAccordionModule} from "@angular/cdk/accordion";
import {ExpenseStatBySourceComponent} from "./expense-stat-by-source/expense-stat-by-source.component";
import {ExpenseStatByYearComponent} from "./expense-stat-by-year/expense-stat-by-year.component";
import {ExpenseStatByMonthComponent} from "./expense-stat-by-month/expense-stat-by-month.component";
import {IncomeStatByYearComponent} from "./income-stat-by-year/income-stat-by-year.component";
import {IncomeStatByMonthComponent} from "./income-stat-by-month/income-stat-by-month.component";

@NgModule({
  declarations: [
    AppComponent,
    ExpenseTableComponent,
    IncomeTableComponent,
    ExpenseFormComponent,
    IncomeFormComponent,
    LoginRegisterComponent,
    ExpensesDialogComponent,
    IncomesDialogComponent,
    YesNoDialogComponent,
    QuestionsComponent,
    ExpenseStatByYearComponent,
    ExpenseStatByMonthComponent,
    ExpenseStatBySourceComponent,
    IncomeStatByYearComponent,
    IncomeStatByMonthComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    NgxChartsModule,
    PieChartModule,
    ReactiveFormsModule,
    HttpClientModule,
    CdkAccordionModule,
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi: true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
