import React from 'react'

export class Hello extends React.Component {
  render () {
    return (
        <div>
          {/*<h1>Hello</h1>*/}
            <p> one extra</p>
          <p>{()=>`hello mama on ${new Date().toString()}`}</p>
        </div>
    )
  }
}
