package org.wso2.carbon.mediator;
import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
public class SynapseMessageContextMediator extends AbstractMediator {
    public boolean mediate(MessageContext msgCtx) {
        org.apache.axis2.context.MessageContext axis2MessageCtx =
                ((Axis2MessageContext) msgCtx).getAxis2MessageContext();
        if (axis2MessageCtx.getMessageID() != null) {
            log.info("Cert: " + axis2MessageCtx.getProperty("ssl.client.auth.cert.X509"));
        }
        return true;
    }
}