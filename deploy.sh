#!/usr/bin
docker build .
aws ecr get-login-password --region ap-northeast-2 | docker login --username lien --password Q=wmFd0A]zrq67j aws_account_id.dkr.ecr.region.amazonaws.com
docker images
docker tag e9ae3c220b23 aws_account_id.dkr.ecr.region.amazonaws.com/my-repository:tag
docker push aws_account_id.dkr.ecr.region.amazonaws.com/my-repository:tag
