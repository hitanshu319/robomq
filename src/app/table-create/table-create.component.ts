import { Component, EventEmitter, OnInit, Output} from '@angular/core';



@Component({
  selector: 'app-table-create',
  templateUrl: './table-create.component.html',
  styleUrls: ['./table-create.component.css']
})
export class TableCreateComponent  {

id: '';
empName: '';
empSal: '';
empdept: '';
@Output() tableCreated = new EventEmitter();

onAddTable() {
  const getTable = {
    id: this.id,
    empName: this.empName,
    empSal: this.empSal,
    empdept: this.empdept,
  };
  this.tableCreated.emit(getTable);
}
}
