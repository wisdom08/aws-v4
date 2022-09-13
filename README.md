# AWS-V4: 엘라스틱빈스톡+RDS 배포
- 엘라스틱빈스톡 + RDS (MariaDB)
- prod 배포 설정 파일 5000번 포트
- dev 개발 설정 파일 8081 포트 + h2 인메모리 디비 사용

## 순서
- 엘라스틱빈스톡 생성 (보안키 설정)
- 환경변수 생성
  - RDS_HOSTNAME
  - RDS_DB_NAME
  - RDS_PORT
  - RDS_USERNAME
  - RDS_PASSWORD
- RDS 생성 : 퍼블릭 엑세스 허용
- 로컬 PC ip와 내부 시큐리티 그룹으로만 연결 허용해주자.
- 이번에는 로드밸런서 연결안함

## 참고
[velog: aws-배포-4단계-버전](https://velog.io/@wisdom08/aws-배포-4단계-elastic-beanstalk-RDS)
