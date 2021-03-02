import {Component,OnInit} from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
@Component({
    selector: 'app-rows',
    templateUrl: './rows.component.html',
    styleUrls: ['./rows.component.scss']
})
export class RowsComponent implements OnInit{
    userForm:FormGroup;
    listData: any;
    constructor(private fb:FormBuilder){


        this.listData=[];
        this.userForm=this.fb.group({
            firstname :['',Validators.required],
            lastname :['',Validators.required],
            contactNo :['',Validators.required],
            dob :['',Validators.required],
            city :['',Validators.required],
            pincode :['',Validators.required]
        })
    }

    public addItem() : void{
        this.listData.push(this.userForm.value);
        this.userForm.reset();
    }

    reset(){
        this.userForm.reset();
    }
    removeItem(element){
        this.listData.forEach((value,index)=>{
            if(value==element)
            this.listData.splice(index,1);
        });

    }



    ngOnInit(){

    }
}