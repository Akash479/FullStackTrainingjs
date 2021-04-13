import { AfterContentChecked, AfterContentInit, Component, DoCheck, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

import { DataShare } from '../dataShare';
import { commonFiles } from '../providers';
import { SharedService } from '../SharedService';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  validateForm:any;
  loginEmail:any;
  emaillog:any;
  constructor(
    private formBuilder:FormBuilder,private dataShare:DataShare,
    private shareService:SharedService, private router:Router,
    private commonFiles:commonFiles) { 
      this.validateForm=this.formBuilder.group({
        userName:['',Validators.required],
        password:['',Validators.required],
        remember:['']
      })
     
    }
  


  ngOnInit(): void {
    console.log('ngOnInit')
  }
  redirectTo(){
this.router.navigateByUrl('/register');
  }
  loginMethod(){
    if(this.validateForm.invalid){
      this.commonFiles.notificationMessage(" Please Fill the Fields");
    }else{
      this.commonFiles.notificationMessage("Login Success");
    }
  
  }
  
}
