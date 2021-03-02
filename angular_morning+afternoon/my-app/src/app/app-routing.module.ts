import { NgModule } from '@angular/core';
import { RowsComponent } from './rows/rows.component';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [
  
  { path: 'rows', component: RowsComponent },
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }