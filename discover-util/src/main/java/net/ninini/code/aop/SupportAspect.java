package net.ninini.code.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SupportAspect {

    private static final Logger logger = LoggerFactory.getLogger(SupportAspect.class);

    public static final String SUPPORT_HANDLE_ASPECT_POINTCUT = "@annotation(net.ninini.code.annotation.SupportHandle)";

    //public static final String REQUEST_ASPECT_POINTCUT= "execution(* net.ninini.code.controller..*(..))";


    @Pointcut(SUPPORT_HANDLE_ASPECT_POINTCUT)
    public void pointcut() {
    }

    /**
     * 前置通知
     *
     * @param joinPoint
     */
    @Before(value = "pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        logger.info("=====RequestLog 前置通知开始=====");
    }


    /**
     * @param joinPoint void
     * @throws
     * @Title: doAfter
     * @Description: 后置通知
     * @author HanYu
     */
    @After(value = "pointcut()")
    public void doAfter(JoinPoint joinPoint) {
        logger.info("=====RequestLog 后置通知开始=====");
    }

    /**
     *
     * @Title: doAfter
     * @Description: 抛出异常后通知
     * @param joinPoint
     * @param e
     * void
     * @author HanYu
     * @throws
     */
    //	@AfterThrowing(value = "exceptionAspect()", throwing = "e")
    //	public void doAfter(JoinPoint joinPoint, Exception e) {
    //		logger.info("=====ExceptionAspect 异常通知开始=====");
    //	}

    /**
     * @param pjp void
     * @throws Throwable
     * @throws
     * @Title: doAround
     * @Description: 环绕通知
     * @author HanYu
     */
    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint pjp) {
        Object result = null;
        logger.info("=====RequestLog 环绕通知开始=====");
        try {
            result = pjp.proceed();
        } catch (Throwable e) {
            logger.info("异常");
        }
        return result;
    }
}
