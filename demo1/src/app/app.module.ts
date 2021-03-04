import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {ReactiveFormsModule,FormsModule} from '@angular/forms';

import { LoginComponent } from './login/login.component';
import { DemoNgZorroAntdModule } from './ng.zorro';
import { NZ_ICONS } from 'ng-zorro-antd/icon';
import { IconDefinition } from '@ant-design/icons-angular';
import * as AllIcons from '@ant-design/icons-angular/icons';
import { ConverionPipe } from './converion.pipe';
import { RegisterComponent } from './register/register.component';
import { HttpClientModule } from '@angular/common/http';
import { UserDirective } from './user.directive';
import { MobilesComponent } from './mobiles/mobiles.component';
import { SamsunngComponent } from './samsunng/samsunng.component';
import { NokiaComponent } from './nokia/nokia.component';
import { employee } from './dataObect';

const antDesignIcons = AllIcons as {
  [key: string]: IconDefinition;
};
const icons: IconDefinition[] = Object.keys(antDesignIcons).map(key => antDesignIcons[key])

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ConverionPipe,
    RegisterComponent,
    UserDirective,
    MobilesComponent,
    SamsunngComponent,
    NokiaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    DemoNgZorroAntdModule,
    ReactiveFormsModule,
    FormsModule,
    BrowserAnimationsModule,
    HttpClientModule

  ],
  providers: [{ provide: NZ_ICONS, useValue: icons },employee],
  bootstrap: [AppComponent]
})
export class AppModule { }
