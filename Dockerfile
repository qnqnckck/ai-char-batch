FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD ai-charge-batch-1.0.jar ai-charge-batch.jar
ENV JOB_NAME NONE
ENV IS_ALL false
ENV SPECIFIC_DAY 0
ENTRYPOINT ["java","-jar","/ai-charge-batch.jar","--JOB_NAME=${JOB_NAME}","--IS_ALL=${IS_ALL}","--SPECIFIC_DAYS=${SPECIFIC_DAYS}"]
