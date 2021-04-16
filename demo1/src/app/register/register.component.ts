import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, NgForm, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { NzFormTooltipIcon } from 'ng-zorro-antd/form';
import { ApiService } from '../api.service';
import { SAVE_USER } from '../constant';
import { DataShare } from '../dataShare';
import { saveUser } from '../models/saveUser';
import { commonFiles } from '../providers';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
 

 
  validateForm!: FormGroup;
  constructor(private DataShare:DataShare,
    private fb: FormBuilder,
    private router:Router,
    private commonFiles:commonFiles,
    private ApiService:ApiService
    ) {
    this.validateForm = this.fb.group({
      email: [null, [Validators.email, Validators.required]],
      password: [null, [Validators.required]],
      checkPassword: [null, [Validators.required, this.confirmationValidator]],
      nickname: [null, [Validators.required]],
      phoneNumberPrefix: ['+86'],
      phoneNumber: [null, [Validators.required]],
     
      agree: [false]
    });
   }

  ngOnInit(): void {
   console.log("dadRegister")
  }
  captchaTooltipIcon: NzFormTooltipIcon = {
    type: 'info-circle',
    theme: 'twotone'
  };
  submitForm(): void {
    if(this.validateForm.invalid){
      for (const i in this.validateForm.controls) {
        this.validateForm.controls[i].markAsDirty();
        this.validateForm.controls[i].updateValueAndValidity();
      }
    }else{
      let formData= this.validateForm.value;
      const saveUserr = new saveUser(formData.nickname,formData.phoneNumber,formData.password,formData.checkPassword,formData.email)
      this.ApiService.postData(SAVE_USER,saveUserr).subscribe(res=>{
        this.commonFiles.notificationMessage(res.messsage);
        this.router.navigateByUrl("/login");
      })
        
    }
    
  }

  updateConfirmValidator(): void {
    /** wait for refresh value */
    Promise.resolve().then(() => this.validateForm.controls.checkPassword.updateValueAndValidity());
  }

  confirmationValidator = (control: FormControl): { [s: string]: boolean } => {
    if (!control.value) {
      return { required: true };
    } else if (control.value !== this.validateForm.controls.password.value) {
      return { confirm: true, error: true };
    }
    return {};
  };

  getCaptcha(e: MouseEvent): void {
    e.preventDefault();
  }

 
}
