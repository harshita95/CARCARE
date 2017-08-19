

import {Injectable} from "@angular/core";

@Injectable()
export class DataService {

    public _dataSession : number = 1;

    public getValue() {
        return this._dataSession;
    }

    public setValue(value:any) {
        this._dataSession=value;
    }
    constructor() {
    }
}

