// eslint-disable-next-line @typescript-eslint/no-unused-vars
import styles from './app.module.css';
import './app.css';
import React from 'react';

import {GymRecord} from '../entities/GymRecord';

import VerticalContainer from '../vertical-container/VerticalContainer';

import ReadContentBox from "../content-box/ReadContentBox";




export function App() {
    const [records, setRecords] = React.useState<GymRecord[]>([]);

    React.useEffect(() =>{
        fetch("http://localhost:8080/gym/records",{
        method: "GET"
        }).then(response => {
            if(response.status == 200){
            return response.json();
            }
        return null;

        }).then(data =>{
            if (data !== null ){
                setRecords(data);
                }

                })
         },   []);
  return (
    <div className="main-component">
        <div>
        <VerticalContainer>
        {
                 <div>
                     <h2>Create</h2>
                 </div>
        }
        </VerticalContainer>
        </div>
                              <div>
        <VerticalContainer>
                          {
                              <div>
                                 <h2>Read</h2>
                                  {
                                      records.map(record => <ReadContentBox
                                          key={`${record.id}`}
                                          content={record}/>)
                                  }
                               </div>
                          }
                      </VerticalContainer>
                              </div>
        <div>
         <VerticalContainer>
                          {
                               <div>
                                  <h2>Update</h2>
                                </div>
                          }
                      </VerticalContainer>
         </div>
         <div>
          <VerticalContainer>
                         {
                                <div>
                                   <h2>Delete</h2>
                                  </div>
                         }
                  </VerticalContainer>
     </div>
    </div>
  );
}

export default App;
