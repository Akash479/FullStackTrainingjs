import { Injectable } from '@angular/core';
import { NzNotificationService } from 'ng-zorro-antd/notification';
import { BehaviorSubject } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class commonFiles {

  constructor(private notification: NzNotificationService) { 
  }
 
 notificationMessage(message:any){
      this.notification
      .blank(
        message,''
      )
      .onClick.subscribe(() => {
        console.log('notification clicked!');
      });
 }

 
}
