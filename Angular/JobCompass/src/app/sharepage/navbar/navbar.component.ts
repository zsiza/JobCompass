//navbar.component.ts

import { Component, OnInit } from '@angular/core';
import { BalanceService } from 'src/app/pages/balance/balance.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css'],
})
export class NavbarComponent implements OnInit {
  currentBalance: number = 0;

  constructor(private balanceService: BalanceService) {}

  ngOnInit(): void {
    this.balanceService.balance$.subscribe((balance: number) => {
      this.currentBalance = balance;
    });
  }
}