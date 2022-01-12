import { VoteService } from './../../service/vote.service';
import { Component, OnInit } from '@angular/core';
import { Form, FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-voting-page',
  templateUrl: './voting-page.component.html',
  styleUrls: ['./voting-page.component.css']
})
export class VotingPageComponent implements OnInit {
  aspirants: any[] = [];
  posts: any[] = [];
  
  form:FormGroup=new FormGroup({
    president:new FormControl(),
    vicePresident:new FormControl(),
    generalSecretary:new FormControl(),
    pro:new FormControl(),
    sportDirector:new FormControl(),
    librarian:new FormControl(),
  })

  formName=Object.keys(this.form.controls);
  


  constructor(private VoteService:VoteService) { }
  ngOnInit(): void {
    this.getAspirants();
    this.getPosts();

  }
    onSubmit( ){
    this.sendVotes();
    alert("You have sucessfully submitted");
    this.form.reset();
  }
  









get president(){
  return this.form.get('president')?.value;
}

get vicePresident(){
  return this.form.get('vicePresident')?.value;
}

get generalSecretary(){
  return this.form.get('generalSecretary')?.value;
}

  private getAspirants(){
    this.VoteService.getAspirantsList().subscribe(data=>{
      this.aspirants=data;
      console.log(data);
    })
  }

  getPosts() {
    this.VoteService.getPosts().subscribe(
      data=>{
        this.posts=data;
      }
    )
    }

  private sendVotes(){
    this.VoteService.sendVotes(this.form.value).subscribe();

  }

}
