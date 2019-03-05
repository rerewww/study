# localStorage, sessionStorage
- **HTML5**에서 추가된 저장소이다.
- key - value 형태이다.
- Internet Explorer: 10MB
- 나머지 브라우저는 5MB 공간을 사용한다.
 
>두 가지의 차이점은 데이터의 영구성이다.
localStorage data는 사용자가 지우지 않는 한 브라우저에 남아있다.
sessionStorage data는 이름 그대로 세션이 유지된 상태에서 스토리지에 저장하기 때문에 세션이 종료되면 sessionStorage data는 모두 사라진다.

#### 브라우저가 지원하는지 확인 방법


```javascript
if (typeof(Storage) !== "undefined") {
  // Code for localStorage/sessionStorage.
} else {
  // Sorry! No Web Storage support..
}
```

### localStorage
- Storage 객체를 상속받는다.
- window.localStorage
- 데이터 저장: setItem(key, value)
- 데이터 가져오기: getITem(key)
- **주의점**
    - object value는 [object Object] 저장이 되므로, JSON.stringify를 통해 문자열로 만든 다음 저장을 해주면 된다.
    ~~~javascript
    localStorage.setItem('test', {a:'b'})
    localStorage.getItem('test') //"[object Object]"

    localStorage.setItem('test', JSON.stringify({a:'b'}))
    localStorage.getItem('test')
    ~~~
    
    
### sessionStorage
- Storage 객체를 상속받는다.
- window.sessionStorage
- 데이터 저장: setItem(key, value)
- 데이터 가져오기: getITem(key)
- 주의점은 localStorage와 동일하다.
- **추가적으로 데이터가 영구적으로 보관되지 않는다.**
    - **브라우저 혹은 탭을 닫으면 데이터는 사라진다.**

참고
- https://www.w3schools.com/html/html5_webstorage.asp
