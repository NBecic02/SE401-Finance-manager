import {User} from "./user";
import {Category} from "./category";

export class Income {
  incomeId?: number
  date: string
  source: string
  earning: number
  user?: User
  category?: Category
}
