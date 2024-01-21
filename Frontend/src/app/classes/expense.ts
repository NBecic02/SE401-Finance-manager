import {User} from "./user";
import {Category} from "./category";

export class Expense {
  expenseId?: number
  date: string
  shop: string
  cost: number
  category?: Category
}
