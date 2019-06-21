# jQuery

### CDN(Content Delivery Network)

* 다운로드 하지 않고 jQuery를 사용하는 방법



```javascript
		$(document).ready(function () {
			$('h1').text('-----');
			$('#hh').html('<a href="">Click</a>');
			$('.ch').text('Class');
			$('input[type="text"]').css('background','gray');
			$('input[name="pwd"]').css('');
            $('h1').eq(0).css('color','red'); //원하는 요소
			$('h1:not(h1:eq(3))').css('color','red'); // not 빼고 나머지
		});
```

```javascript
		$(document).ready(function () {
			$('a:first').click(function () {
				$('button').hide();
			});										//hide, show
			$('a:last').click(function () {
				$('button').show();
			});
			$('a').hover(function () {
				$('h1').text('Mouse Enter');
			}, function () {					//hover
				$('h1').text('Mouse Leave');
			});

			$('input').on(
				{
					focus: function () {					//background
						$(this).css('background', 'gray');
					},
					keyup: function () {
						alert($(this).val());
					},
					blur: function () {
						$(this).css('background', 'white');
					}
				}
			)
		});
```

```javascript
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

	<style>
		div {
			width: 300px;

			border: 3px solid blue;
			margin-top: 50px;

		}

		.hh {
			color: red;
			font-size: 1.2em;
			background: pink;
		}

		.dd {
			width: 200px;
			color: white;
			border: 3px dotted red;
			background: blue;
		}
	</style>
	<script>
		var cnt = 0;
		$(document).ready(function () {
			$('button:eq(0)').click(function () {
				$('div').append('<h3>Append' + cnt + '</h3>');
				cnt++;
			});
			$('button:eq(1)').click(function () {
				$('div').prepend('<h3>Prepend' + cnt + '</h3>');
				cnt++;
			});
			$('button:eq(2)').click(function () {
				$('div').after('<h3>After' + cnt + '</h3>');
				cnt++;
			});
			$('button:eq(3)').click(function () {
				$('div').before('<h3>Before' + cnt + '</h3>');
				cnt++;
			});
			$('button:eq(4)').click(function () {
				$('div').empty();

			});
			$('button:eq(5)').click(function () {
				$('div').remove();

			});
			$('button:eq(6)').click(function () {
				$('div').addClass('dd');
				$('h1').addClass('hh');
			});
			$('button:eq(7)').click(function () {
				$('div').removeClass('dd');
				$('h1').removeClass('hh');

			});
		});
	</script>
</head>

```

### 배열

```javascript
var d=[4,1,2,3,5,6];
$(document).ready(function(){
	$(d).each(function(idx,item){ //each = 배열의 인덱스 만큼 돌린다.
		alert(idx+'-'+item);
	});
});

////////////////////////////////////////////////////////////////////
	var d = [{ img: 'm1.jpg', id: "id01", name: "이말숙" },
		{ img: 'm2.jpg', id: "id02", name: "김말숙" },
		{ img: 'm3.jpg', id: "id03", name: "정말숙" },
		{ img: 'm4.jpg', id: "id04", name: "황말숙" },
		{ img: 'm5.jpg', id: "id05", name: "오말숙" }
		];
		$(document).ready(function () {

			$(d).each(function (idx, item) {
				var result = '';
				//result += '<h1>'+item.id+' '+item.name+'</h1>';
				//	$('div').append(result);
				result = '<img src="' + item.img + '">' + item.id + ' ' + item.name + '<br>';
				$('div').append(result);
			});

		});
```

