import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {ReactiveFormsModule} from '@angular/forms';

import { LoginComponent } from './login/login.component';
import { DemoNgZorroAntdModule } from './ng.zorro';
import { NZ_ICONS } from 'ng-zorro-antd/icon';
import { IconDefinition } from '@ant-design/icons-angular';
import * as AllIcons from '@ant-design/icons-angular/icons';
const antDesignIcons = AllIcons as {
  [key: string]: IconDefinition;
};
const icons: IconDefinition[] = Object.keys(antDesignIcons).map(key => antDesignIcons[key])

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    DemoNgZorroAntdModule,
    ReactiveFormsModule

  ],
  providers: [{ provide: NZ_ICONS, useValue: icons }],
  bootstrap: [AppComponent]
})
export class AppModule { }
