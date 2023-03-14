package com.xxx.server.service.impl;

import com.xxx.server.pojo.Oplog;
import com.xxx.server.mapper.OplogMapper;
import com.xxx.server.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
