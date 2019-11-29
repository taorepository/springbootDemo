package com.example.demo.Controller;

import com.example.demo.common.IAppInstance;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2019/9/3.
 */
@RestController
@RequestMapping(value = IAppInstance.APP_NAME)
public class DemoController {
    @RequestMapping("/")
    public String first(){
        return "11111111";
    }

    @RequestMapping("/json")
    public String json(@RequestBody JSONObject jsonParam){
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "@ResponseBody");
        result.put("data", jsonParam);

        return result.toString();
    }
}
