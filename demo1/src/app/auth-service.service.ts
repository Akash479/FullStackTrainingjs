import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { DataShare } from './dataShare';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService  implements CanActivate{

  constructor(private DataShare:DataShare) { }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean  {
    if(this.DataShare.getAuthFlag()){
      return true;
    }else{
      alert(' You have No acess, First Login')
      return false;

    }
    
  }
}
