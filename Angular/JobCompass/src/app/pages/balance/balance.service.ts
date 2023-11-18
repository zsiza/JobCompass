// balance.service.ts

import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class BalanceService {
  private balanceSubject = new BehaviorSubject<number>(0);
  balance$ = this.balanceSubject.asObservable();

  updateBalance(amount: number): void {
    const currentBalance = this.balanceSubject.value;
    const newBalance = currentBalance + amount;
    this.balanceSubject.next(newBalance);
  }
  getCurrentBalance(): number {
    return this.balanceSubject.value;
  }
}