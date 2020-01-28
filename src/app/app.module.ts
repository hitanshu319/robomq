import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatTableModule } from '@angular/material';
import {
MatInputModule,
  MatCardModule,
  MatButtonModule,
  MatToolbarModule,
  MatExpansionModule
  } from '@angular/material';

import { AppComponent } from './app.component';
import { TableListComponent } from './table-list/table-list.component';
import { TableCreateComponent } from './table-create/table-create.component';


@NgModule({
  declarations: [
    AppComponent,
    TableListComponent,
    TableCreateComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    BrowserAnimationsModule,
    MatTableModule,
    MatInputModule,
    MatCardModule,
    MatButtonModule,
    MatToolbarModule,
    MatExpansionModule
  ],
   providers: [],
   bootstrap: [AppComponent]
})
export class AppModule { }
