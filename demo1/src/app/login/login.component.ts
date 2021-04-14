import { AfterContentChecked, AfterContentInit, Component, DoCheck, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ApiService } from '../api.service';

import { DataShare } from '../dataShare';
import { commonFiles } from '../providers';
import { SharedService } from '../SharedService';
import { LOGIN_USER } from '../constant';

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
    private commonFiles:commonFiles,
    private api:ApiService) { 
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
      let formData=this.validateForm.value;
      let reqObj={
        userName:formData.userName,
        password:formData.password,
      }

      this.api.postData(LOGIN_USER,reqObj).subscribe(res=>{
        this.commonFiles.notificationMessage(res.message);
      })
     
    }
  
  }
  
}
