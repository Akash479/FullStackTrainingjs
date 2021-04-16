import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ApiService } from '../api.service';
import { DELETE_SUBJECTS, GET_ALL_DATA,SAVE_SUBJECTS_DATA } from '../constant';
import { DataShare } from '../dataShare';
import { subject } from '../models/subjectModel';

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
  User:any;
  id:any;
  constructor(private api:ApiService,
    private dataShare:DataShare,
    private router:Router
    ) { }

  ngOnInit(): void {
    this.uName=this.dataShare.getUsername();
    if( this.uName){
      this.retrivalSubjects();
    }else{
      this.router.navigateByUrl("/login");
    }


  }
  retrivalSubjects(){
    this.api.getData(GET_ALL_DATA+this.uName).subscribe((res:any)=>{
      this.listOfData=res.sm;
          })
  }
  showModal(): void {
    this.id =0;
    this.isVisible = true;
  }

  handleOk(): void {
    console.log('Button ok clicked!');
    this.isVisible = false;
    this.id =this.id !=0? this.id : 0;
    let reqObj= new subject(this.id,this.Subject,this.marks,this.date);
    this.api.postData(SAVE_SUBJECTS_DATA,reqObj).subscribe(res=>{
      this.retrivalSubjects();
    })

  }
  handleCancel(): void {
    console.log('Button cancel clicked!');
    this.isVisible = false;
  }
  edit(data:any){
    this.isVisible = true;
    this.Subject = data.subjName;
    this.date= data.date;
    this.marks= data.marks;
    this.id= data.id;
  }
  delete(id:any){
    this.api.getData(DELETE_SUBJECTS+id).subscribe(res=>{
      this.retrivalSubjects();
    })
  }
}
