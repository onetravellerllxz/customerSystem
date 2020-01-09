package com.eiisys.userManagementSystem.VO;

import com.eiisys.userManagementSystem.enums.LoginStatus;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 当时明月在
 * @create 2020/1/8
 * @since 1.0.0
 */
public class ResultVO implements Serializable {
    /**
     * 返回msg，object，以及token
     * 返回的code为默认
     *
     * @param message
     * @param data
     * @param jwtToken
     * @return
     */
    public final static Map<String, Object> success(Object message, Object data, String jwtToken, Boolean success) {
        Map<String, Object> map = new HashMap<>();
        map.put("jwtToken", jwtToken);
        map.put("code", LoginStatus.SUCCESS.getCode());
        map.put("message", message);
        map.put("success", success);
        return map;
    }

    public final static Map<String, Object> result(LoginStatus respCode, Boolean success) {
        return getStringObjectMap(respCode, success);
    }

    private static Map<String, Object> getStringObjectMap(LoginStatus respCode, Boolean success) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", respCode.getCode());
        map.put("message", respCode.getMessage());
        map.put("data", null);
        map.put("success", success);
        return map;
    }


}
