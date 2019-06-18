# JavaScript



### JavaScript 특징

1. 인터프리트 언어 - 컴파일 과정을 거치지 않고 바로 실행시킬 수 있는 언어
2. 동적 타이핑 = 변수의 자료형을 선언하지 않고도 변수 사용 가능
3. 구조적 프로그래밍 지원 - C언어의 구조적 프로그래밍을 지원(if-else, while, for 등)
4. 객체 지향 언어
5. 함수형 프로그래밍 지원 - 함수는 일급 객체이다
6. 프로토타입 기반 - 상속을 위해 클래스 개념 대신에 프로토타입을 사용한다



### JavaScript 용도

* 내부 자바스크립트

```html
<head>
    <title>JavaScript</title>
    <script>
    
    </script>
</head>
```

* 외부 자바스크립트

```html
<script src="j1.js">
```

* 인라인 자바스크립트 

  ```html
  <h1 onclick="alert('OK');">JavaScript Test</h1>
  ```

* 주석  - // , /*   */



### 자료형(data type)

```javascript
//1. number
var v1 = 10;
var v2 = 10.1;
//2. boolean
var v3 = true;
//3. string
var v4 = 'abc';
var v5 = "abc";
//4. JavaScript object
//JSON(JavaScript Object Notation)
var v6 = {name:'k1',size:1000,
		  go:function(){},
		  stop:function(){}};
//5. fucntion
var v7 = function(){};
//6. array
var v8 = [1,2,3,'a'];
//7. undefined
var v9;
//8. null
var v10 = null; //type은 object

alert(typeof(v6)); // 해당 변수의 타입을 출력
```



### 연산자

```javascript
var a = 10;
var b = '20';

alert(a*b); // string 연산 가능  a*b =200 (/ 가능)
alert(a+parseInt(b)); // (+,- 는 형변환)
```

### 연산

```javascript
	var p1 = prompt('Input Number1..?'); // 입력 값은 모두 string
	var p2 = prompt('Input Number2..?');
	var result = parseInt(p1) + Number(p2); // parseInt, Number 둘다 가능
	alert(result);
```

```html
<script>
	function calc() {
		var num1 = document.getElementById('n1').value;
		var num2 = document.getElementById('n2').value;
		var sum = Number(num1) + Number(num2);
		var r = document.getElementById('result');
		r.style.color = 'red';
		r.innerHTML =  + sum;
		
		var rr = document.getElementById('rr');
		rr.value = sum;
	};
</script>
</head>
<body>
	<form>
		NUMBER1<input type="number" id="n1"><br> Number2<input
			type="number" id="n2"><br> Result<input
			readonly="readonly" type="number" id="rr"><br> <input
			type="button" value="Calc" onclick="calc();">

	</form>
	<h1 id="result"></h1>
</body>
</html>
```



