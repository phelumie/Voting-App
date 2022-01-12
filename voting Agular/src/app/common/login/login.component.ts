import { ActivatedRoute, Router, Routes } from '@angular/router';
import { NoWhiteSpaceValidator } from './../../validator/no-white-space-validator';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private route:Router) { }

  ngOnInit(): void {
  }

  form=new FormGroup({
    matricNumber:new FormControl('',[Validators.required,NoWhiteSpaceValidator.noWhitespaceValidator]),
    password:new FormControl('',Validators.required),
  });



  get matricNumber(){
    return this.form.get('matricNumber');
  }
  
  get password(){
    return this.form.get('password');
  }

  onSubmit(){
        this.route.navigate(['/vote',this.matricNumber?.value])
  }
}
