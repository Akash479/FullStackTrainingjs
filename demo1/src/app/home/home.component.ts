import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';
import { GET_ALL_DATA } from '../constant';
import { DataShare } from '../dataShare';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  uName:any;
  listOfData:any;
  isVisible = false;
  Subject:any;
  marks:any;
  date:any;
  constructor(private api:ApiService,
    private dataShare:DataShare
    ) { }

  ngOnInit(): void {
this.uName=this.dataShare.getUsername();
    this.api.getData(GET_ALL_DATA+this.uName).subscribe(res=>{
console.log(res)
    })
  }
  showModal(): void {
    this.isVisible = true;
  }

  handleOk(): void {
    console.log('Button ok clicked!');
    this.isVisible = false;
  }

  handleCancel(): void {
    console.log('Button cancel clicked!');
    this.isVisible = false;
  }
}
