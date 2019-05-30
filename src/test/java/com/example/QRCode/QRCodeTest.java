package com.example.QRCode;

import com.example.QRCode.factory.QRCodeLogo;
import com.example.QRCode.factory.QRCodeUtil;
import org.junit.Test;

import java.io.File;

/**
 * @Author:Hansn
 * @Date: 2019/5/29 上午8:50
 * Description:
 */
public class QRCodeTest {
    @Test
    public void test() throws Exception {
        // 存放在二维码中的内容
        String text = "www.baidu.com";
        // 嵌入二维码的图片路径
        String imgPath = "./data/bbb.jpg";
        // 生成的二维码的路径及名称
        String destPath = "./data/aaa.jpg";
        //生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);
    }
    @Test
    public void test1(){
        //logo图片保存的位置
        File logoFile = new File("./data/bbb.jpg"); //logo
        //生成的二维码存放的位置
        File QrCodeFile = new File("./data/aaa.jpg");
        //二维码携带的链接或者内容
        String url = "https://www.fangxinqian.cn/redirect.html";
        //二维码的标题
        String note = "";
        QRCodeLogo.drawLogoQRCode(logoFile, QrCodeFile, url, note);
    }
}
