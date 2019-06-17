# Git 사용법

## I. Git 사용

1. 커멘드 사용법
   - mv 움직임파일 보낼곳 -> 파일 이동
   - cd TIL/ -> TIL 폴더 들어가기
   - cd .. -> 하나 나오기
   - mkdir 폴더이름 -> 폴더생성

2.  Git 사용

   - git init

   - git status -> 상태 보기(관리 되지 않는 폴더 검색)

   - git add [파일명/] -> 관리폴더 추가

   - git commit -m "넣을 메세지" -> 저장본 생성

   - git log ->저장내역 검색

   - ```git remote add origin https://github.com/ByunghoonLee1222/TIL.git
     git remote add origin https://github.com/ByunghoonLee1222/TIL.git
     ```

   - ```git push -u origin master
     git push -u origin master
     ```

## II. 이미 만들어진 프로젝트에 추가하는 순서

git add [파일명]

git add .

git commit -m "메세지"

git push -u origin master

