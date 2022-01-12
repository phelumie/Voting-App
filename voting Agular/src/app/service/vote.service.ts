import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VoteService {
private aspirantsUrl:string ="http://localhost:8080/aspirants";
private sendvotes:string ="http://localhost:8080/saveVotes";
private postUrl:string ="http://localhost:8080/posts";
  
constructor(private http:HttpClient) {
   }

   
   sendVotes(votes:any){
    return this.http.post(`${this.sendvotes}`,votes);
   }

   getPosts():Observable<any[]>{
     return this.http.get<any>(`${this.postUrl}`);
   }
   getAspirantsList():Observable<any>{
     return this.http.get<any>(`${this.aspirantsUrl}`);

   }
}

