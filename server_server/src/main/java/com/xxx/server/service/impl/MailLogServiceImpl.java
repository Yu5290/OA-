package com.xxx.server.service.impl;

import com.xxx.server.pojo.MailLog;
import com.xxx.server.mapper.MailLogMapper;
import com.xxx.server.service.IMailLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lcy
 * @since 2022-12-08
 */
@Service
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
