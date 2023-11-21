export interface User {
    id: number;
    firstName: string;
    lastName: string;
    username: string;
    email: string;
    password: string;
    profileId: number;
    admin: boolean;
    sellerId: number;
    balance: number;
    online: boolean;
}