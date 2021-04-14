import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(
    private http:HttpClient
  ) { 
  }


  getData(url:any) :Observable<any>{
    return this.http.get(url);
  }
  postData(url:any, formData:any):Observable<any>{
    return this.http.post(url,formData);
  }
}
