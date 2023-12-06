import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from "@angular/common/http";
import { User } from "./user";
import { environment } from "src/environments/environment";

@Injectable({providedIn: 'root'})
export class UserService {
    private apiServerUrl = environment.apiBaseUrl;

    constructor(private http: HttpClient) { }

    public getUsers(): Observable<User[]> {
        return this.http.get<User[]>(`${this.apiServerUrl}/jobcompass_user/all`);
    }

    public addUser(user: User): Observable<User> {
        return this.http.post<User>(`${this.apiServerUrl}/jobcompass_user/add`, user);
    }

    public updateUser(user: User): Observable<User> {
        return this.http.put<User>(`${this.apiServerUrl}/jobcompass_user/update`, user);
    }

    public deleteUser(userid: number): Observable<void> {
        return this.http.delete<void>(`${this.apiServerUrl}/jobcompass_user/delete/${userid}`);
    }

    login(username: string, password: string): Observable<any> {
        const loginData = { username, password };
        return this.http.post(`${this.apiServerUrl}/login`, loginData);
      }
}