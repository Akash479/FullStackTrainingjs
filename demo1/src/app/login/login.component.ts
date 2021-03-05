import { AfterContentChecked, AfterContentInit, Component, DoCheck, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

import { DataShare } from '../dataShare';
import { SharedService } from '../SharedService';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit,OnChanges,DoCheck,AfterContentInit,AfterContentChecked,OnDestroy {

  validateForm:any;
  loginEmail:any;
  emaillog:any;
  constructor(
    private formBuilder:FormBuilder,private dataShare:DataShare,
    private shareService:SharedService) { 
      this.validateForm=this.formBuilder.group({
        userName:['ashok'],
        password:['1234'],
        remember:['']
      })
      this.loginEmail="test@123.gmail.com"
      this.dataShare.setEmail(this.loginEmail);
      this.loginEmail="esss.gmail";
    }
  ngOnDestroy(): void {
    console.log("ngOnDestroy")
    this.shareService.EmailValue.unsubscribe();
  }
  ngAfterContentChecked(): void {
    console.log("ngAfterContentChecked()")
  }
  ngAfterContentInit(): void {
    console.log("ngAfterContentInit()")
  }
  ngDoCheck(): void {
  console.log("DO Check")
  }
  ngOnChanges(changes: SimpleChanges): void {
    console.log("ng On Chnages")
  }

  ngOnInit(): void {
    console.log('ngOnInit')
  }
  loginMethod(){
    let uName= this.validateForm.controls['userName'].value;
    let password= this.validateForm.controls['password'].value;

    alert(' UserName is: '+uName+' '+'Password is: '+password);
  }
  submitEmail(){
this.shareService.EmailValue.next(this.emaillog);
  }
}
