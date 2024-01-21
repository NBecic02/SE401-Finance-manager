import { Component } from '@angular/core';
import {ExpenseStatByShop} from "../classes/expense-stat-by-shop";
import {LegendPosition} from "@swimlane/ngx-charts";
import {StatisticsService} from "../services/statistics.service";

@Component({
  selector: 'app-expense-stat-by-source',
  templateUrl: './expense-stat-by-source.component.html',
  styleUrls: ['./expense-stat-by-source.component.css']
})
export class ExpenseStatBySourceComponent {
  statsByShop: ExpenseStatByShop[] = []

  statsByShopPie: { name: string, value: number }[] = []

  gradient: boolean = true;
  showLegend: boolean = true;
  showLabels: boolean = true;
  isDoughnut: boolean = false;
  legendPosition: LegendPosition = LegendPosition.Right;
  colorScheme: string = "picnic"

  constructor(private _statisticsService: StatisticsService) {
  }

  ngOnInit(): void {
    this.getStatistics()
  }

  getStatistics() {
    this._statisticsService.expenseGetStatByShop().subscribe(stats => {
      for (const [key, value] of Object.entries(stats)) {
        let stat: ExpenseStatByShop = {
          shop: key,
          cost: value
        }

        let statPie: { name: string, value: number } = {
          name: key,
          value: value
        }

        this.statsByShop.push(stat);
        this.statsByShop = [...this.statsByShop]

        this.statsByShopPie.push(statPie);
        this.statsByShopPie = [...this.statsByShopPie]
      }
    })
  }
}
