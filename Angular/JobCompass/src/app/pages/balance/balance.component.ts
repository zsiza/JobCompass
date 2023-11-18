// balance.component.ts

import { Component, OnInit } from '@angular/core';
import { BalanceService } from './balance.service';

@Component({
  selector: 'app-balance',
  templateUrl: './balance.component.html',
  styleUrls: ['./balance.component.css'],
})
export class BalanceComponent implements OnInit {
  currentBalance: number=0;

  constructor(private balanceService: BalanceService) {}

  ngOnInit(): void {
    this.balanceService.balance$.subscribe((balance) => {
      this.currentBalance = balance;
    });
  }

  selectAmount(amount: number): void {
    this.balanceService.updateBalance(amount);
  }
}