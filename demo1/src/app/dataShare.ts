import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class DataShare {

  constructor() { 
  }
  email:any;

  getEmail(){
      return this.email;
  }
  setEmail(email:any){
      this.email=email;
  }

 
}
