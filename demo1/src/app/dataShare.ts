import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class DataShare {

  constructor() { 
  }
  email:any;

  authFlag:any;

  getAuthFlag(){
    return this.authFlag;
}
setAuthFlag(authFlag:any){
    this.authFlag=authFlag;
}

  getEmail(){
      return this.email;
  }
  setEmail(email:any){
      this.email=email;
  }

 
}
