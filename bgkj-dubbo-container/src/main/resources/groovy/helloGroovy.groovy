import com.alibaba.dubbo.rpc.service.GenericException
import com.alibaba.dubbo.rpc.service.GenericService

/**
 * groovy demo
 */
class helloGroovy implements GenericService {

    @Override
    Object $invoke(String method, String[] parameterTypes, Object[] args) throws GenericException {
        return "reply from helloGroovy " + method + " " +  args[0];
    }
}
