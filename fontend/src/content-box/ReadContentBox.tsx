import React from 'react'

import {GymRecord} from "../entities/GymRecord";


interface ContentBoxProps{
    content: GymRecord;
}

const ReadContentBox: React.FC<ContentBoxProps> = ( { content }) => {
          const [record, setRecord] = React.useState<GymRecord>(content);


          return (
              <div className="content-box">
                  <p>Exercise: {record.exercise} </p>
                  <p>Weight: {record.weight} kg</p>
              </div>
          )

}

export default ReadContentBox;
