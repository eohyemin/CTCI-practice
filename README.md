# Cracking The Coding Interview 

[TOC]

## 자료구조

### 01 배열과 문자열

#### 해시테이블

효율적 탐색을 위한 자료구조로 key-value값이 대응된다.

* 구현 방식: linked list와 hash code function

* [key-value]를 해시테이블에 넣을 때 과정

  1. key의 해시코드값 계산

     key의 자료형이 int, long일 경우 키의 개수는 무한한데 반해 int 개수는 유한하기 때문에 충돌 가능

     서로 다른 두 개의 키가 같은 해시 코드를 가르킬 수 있음

  2. 해시코드를 이용해 배열의 인덱스를 구한다

     hash(key) % array_length의 방식 사용

  3. 배열의 각 인덱스에는, key-value로 이루어진 연결리스트 존재한다. key-value를 해당 인덱스에 저장

     충돌에 대비해 반드시 연결리스트 이용

* key값에 상응하는 value 찾는 과정
  1. 주어진 key 값으로 해시코드 계산
  2. 해시코드 값으로 인덱스 계산
  3. 인덱스에서 key에 상응하는 value를 연결리스트에서 탐색한다



#### ArrayList와 가변 크기 배열

동적 가변 크기 기능이 내재되어 있는 배열과 비슷한 자료구조 필요할 때 사용한다.

ArrayList는 필요에 따라 크기를 변화시키면서 O(1)의 접근시간을 유지한다.





