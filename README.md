## Python
# 데이터분석

  

## 데이터와 정보

  

- 데이터: 객관적 사실을 수집하여 모아놓은 자료

  

- 정보: 데이터를 가공하여 의미가 도출 된것

  

## 데이터분석 절차

* 데이터분석 기획 &rarr; 데이터 수집 &rarr; 데이터 전처리&rarr; 데이터 탐색/시각화 데이터 해석
	- 데이터분석 기획
		- 문제정의 : 해결하고 싶은 문제
		- 데이터 정의 : 분석에 필요한 데이터 속성 정의
		- 분석 목적 : 현상 파악, 원인 분석, 추세분석/예측
---
### 데이터 수집

#### 데이터 수집방법

- 기업의 데이터베이스

- 공공데이터
	- 공공 데이터 포멧 종류
		 * CSV : 데이터를 콤마(,)로 구분 `이름,국어,영어,수학`
		 * XLSX : 엑셀 저장 포멧 `A|100 B|200 C|300 D|400`
		 * JSON: Key : value 구조 `"firstName" :  "John", "lastname" : "Jones"`
		 * XML : 마크업 언어 `< food > < name > 바나나 < /name > ` 
		 * 오픈API : 개발자를 위한 인터페이스 

- 민간데이터

- 웹스크래핑

- 설문

- 센서데이터
-----
### 데이터 전처리

* 필요한 속성만 추출
* 결측치 식별/처리
	* 결측지 대치방법
	  * 대표값으로 대치 : 중간값, 최빈값, 평균값
	  * 주변값으로 대치 : 이전값, 다음값
	  * 결측치 삭제
		  - 결측지가 있는행 삭제
		 * 결측지가 많은 열(속성) 삭제

* 자료형 변경
	* 숫자로 처리해야하는 자료가 문자형으로 되어있는 경우
	* 시계열 데이터 분석에서 날짜시간으로 처리할 자료가 문자형으로 되어 있는 경우

* 조건에 따라 데이터 추출
* 이상값 식별/처리
* 테이블 변경
	* 테이블 형태 변경
		* 행/열 변경
		* 컬럼명/인덱스 변경
		* 새로운 속성(컬럼)추가
		* 여러 데이터 연결
		* 데이터 그룹핑
---
### 데이터 탐색/시각화
- 통계적 특성을 이해, 시각화
---
### 데이터해석
- 인사이트 도출
	* 현상파악
	* 원인도출
	* 추세파악/예측
