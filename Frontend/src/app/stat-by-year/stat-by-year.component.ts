import {Component, OnInit} from '@angular/core';
import {StatByYear} from "../classes/stat-by-year";
import {Color, ScaleType} from "@swimlane/ngx-charts";
import {StatisticsService} from "../services/statistics.service";

@Component({
  selector: 'app-stat-by-year',
  templateUrl: './stat-by-year.component.html',
  styleUrls: ['./stat-by-year.component.css']
})
export class StatByYearComponent implements OnInit {
  statsByYear: StatByYear[] = [
    {year: "2030", cost: 0},
    {year: "2029", cost: 0},
    {year: "2028", cost: 0},
    {year: "2027", cost: 0},
    {year: "2026", cost: 0},
    {year: "2025", cost: 0},
    {year: "2024", cost: 0},
    {year: "2023", cost: 0}
  ]

  statsByYearChart: any[] = [
    {name: "2030", value: 0},
    {name: "2029", value: 0},
    {name: "2028", value: 0},
    {name: "2027", value: 0},
    {name: "2026", value: 0},
    {name: "2025", value: 0},
    {name: "2024", value: 0},
    {name: "2023", value: 0}
  ]

  gradient: boolean = false;
  showLegend: boolean = false;
  showLabels: boolean = true;
  xLabel: string = $localize`Godina`;
  yLabel: string = $localize`Trošak`;
  colorScheme: Color = {
    name: "MyColor",
    selectable: true,
    group: ScaleType.Linear,
    domain: ['#fc9803'],
  };
  xAxis: boolean = true
  yAxis: boolean = true
  showXAxisLabel: boolean = true
  showYAxisLabel: boolean = true

  constructor(private _statisticsService: StatisticsService) {
  }

  ngOnInit(): void {
    this.getStatistics()
  }

  getStatistics() {
    this._statisticsService.getStatsByYear().subscribe(stats => {
      for (const [key, value] of Object.entries(stats)) {

        this.statsByYear.forEach(stat => {
          if (key === stat.year) {
            stat.cost = value;
          }
        })

        this.statsByYearChart.forEach(stat => {
          if (key === stat.name) {
            stat.value = value;
          }
        })
      }
      this.updateChart();
    })
  }

  updateChart() {
    this.statsByYear = [...this.statsByYear];
    this.statsByYearChart = [...this.statsByYearChart];
  }

}
