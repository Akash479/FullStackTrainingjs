import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class DataShare {

  constructor() { 
  }
  email:any;

  username:any;

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

  getUsername(){
    return this.username;
}
setUsername(username:any){
    this.username=username;
}


 
}
