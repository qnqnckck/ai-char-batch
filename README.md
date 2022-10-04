# ai-charge-batch
[![Build Status](https://travis-ci.org/dwyl/esta.svg?branch=master)](https://travis-ci.org/)

## 프로젝트 설명
아래의 2개의 배치를 포함한다.
1. STEP 1 - ORDERS 테이블에 주소를 area 테이블을 참조하여 주소 ID에 맞춰 데이터 전처리 배치
2. STEP 2 - 타 프로젝트 제공(AI 모델)
3. STEP 3 - AI_CHARGES 당일 생성된 것을 제외하고 데이터 삭제 및 AI_CHARGES_HISTORY 테이블에 적재  


## 사용법
ENV 추가 설정시 PROFILE=prd 적용

### STEP1 수행
1. 일 배치 수행시 환경변수 (전일 데이터만  AI_ORDERS 테이블로 전처리)

| 환경 변수명       |    값     |
|:---------|:--------:|
| JOB_NAME     | AI_STEP1 | 
| IS_ALL       |  false   | 
| SPECIFIC_DAY |    0     |

2. 초기화시 ORDERS에 전체 데이터 전처리  

| 환경 변수명       |    값     |
|:---------|:--------:|
| JOB_NAME     | AI_STEP1 | 
| IS_ALL       |   true   | 
| SPECIFIC_DAY |    0     |

3. 특정일만 보정처리 - 포맷(YYYYMMDD)

| 환경 변수명     |    값     |
|:-------------|:--------:|
| JOB_NAME     | AI_STEP1 | 
| IS_ALL       |  false   | 
| SPECIFIC_DAY | 20221003 |

### STEP3 수행
1. 일 배치

| 환경 변수명     |    값     |
|:-------------|:--------:|
| JOB_NAME     | AI_STEP3 | 
| IS_ALL       |  false   | 
| SPECIFIC_DAY |    0     |