// eslint-disable-next-line @typescript-eslint/no-unused-vars
import styles from './app.module.css';

import VerticalContainer from '../vertical-container/VerticalContainer';
export function App() {
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
