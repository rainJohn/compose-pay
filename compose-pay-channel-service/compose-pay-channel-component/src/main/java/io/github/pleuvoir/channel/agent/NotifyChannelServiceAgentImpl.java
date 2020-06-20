package io.github.pleuvoir.channel.agent;

import io.github.pleuvoir.channel.model.request.NotifyParamDTO;
import io.github.pleuvoir.channel.model.response.NotifyParamResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

/**
 * 通道通知服务
 *
 * @author <a href="mailto:fuwei@daojia-inc.com">pleuvoir</a>
 */
@Slf4j
@Component
public class NotifyChannelServiceAgentImpl implements INotifyChannelServiceAgent {

    @Override
    public NotifyParamResultDTO payNotifyReceive(@Valid NotifyParamDTO notifyParamDTO) {
        return null;
    }

}
