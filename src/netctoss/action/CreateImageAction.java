package netctoss.action;

import netctoss.util.ImageUtil;
import org.apache.struts2.ServletActionContext;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by 热带雨林 on 2019/1/20.
 */
public class CreateImageAction {
    private InputStream imageStream;

    public String execute() throws IOException {
        //生成图片
        Map<String, BufferedImage> map = ImageUtil.createImage();
        //获取验证码，存入session
        String code = map.keySet().iterator().next();
        ServletActionContext.getRequest().getSession().setAttribute("imageCode", code);
        //获取图片，转换成输入流
        BufferedImage image = map.get(code);
        imageStream = ImageUtil.getInputStream(image);
        return "success";
    }

    public InputStream getImageStream() {
        return imageStream;
    }

    public void setImageStream(InputStream imageStream) {
        this.imageStream = imageStream;
    }
}
