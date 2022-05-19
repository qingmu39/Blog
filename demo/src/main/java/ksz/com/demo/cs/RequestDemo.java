package ksz.com.demo.cs;

import com.baidubce.http.ApiExplorerClient;
import com.baidubce.http.HttpMethodName;
import com.baidubce.model.ApiExplorerRequest;
import com.baidubce.model.ApiExplorerResponse;

// 文章分类 示例代码
public class RequestDemo {
    public static void main(String[] args) {
        String path = "https://aip.baidubce.com/rpc/2.0/nlp/v1/topic";
        ApiExplorerRequest request = new ApiExplorerRequest(HttpMethodName.POST, path);


        // 设置header参数
        request.addHeaderParameter("Content-Type", "application/json;charset=UTF-8");

        // 设置query参数
        request.addQueryParameter("access_token", "24.d531d4a3486a0ab41526f396d9c7dc4b.2592000.1653991463.282335-26140277");
        request.addQueryParameter("charset", "UTF-8");

        // 设置jsonBody参数
        String jsonBody = "{\n\t\"title\":\"乌克兰向其亲属发送遗体照\",\n\t\"content\": \"（观察者网讯）当地时间15日，美国《华盛顿邮报》刊发了一篇题为《乌克兰扫描俄罗斯阵亡人员面部并联系其母亲》的报道，称乌克兰通过面部识别软件，对阵亡或被俘的俄罗斯士兵进行了超过8600次面部识别搜索，并联系了数百名死者家属。   美国《华盛顿邮报》：乌克兰扫描俄罗斯阵亡人员面部并联系其母亲 据《华盛顿邮报》称，自俄乌冲突爆发后，乌克兰人开始支持使用美国科技公司Clearview AI的面部识别软件，认为这是一种残忍但有效的方式，可以在俄罗斯国内煽动异见，打消俄其他作战人员的积极性，并加速结束俄乌战争。 目前，乌克兰官员已经对死亡或被俘的俄罗斯士兵进行了超过8600次面部识别搜索，并利用面部扫描来识别尸体。Clearview AI的创始人兼首席执行官霍安·同-代特（Hoan Ton-That）告诉《华盛顿邮报》，乌克兰5个政府机构的340多名官员现在可以随时免费使用该工具进行面部识别搜索。 现在，Clearview的员工每周（有时是每天）都通过Zoom对乌克兰警察和军官进行培训。他们中的一些人会在战场上使用Clearview应用软件扫描俄士兵面部，还有一些人在驻守检查站或外出巡逻时登录Zoom进行培训。同-代特称，当乌克兰人目睹了他们可以从一次尸体扫描中收集到多少数据——包括死者家庭照片、社交媒体帖子和社交关系等时，他们感到十分惊讶。  3月31日，一名乌克兰士兵在基辅郊外拍摄一名阵亡的俄罗斯士兵 据同-代特称，上个月，Clearview公司首次向乌克兰国防部提供服务。先前，该系统主要被美国警察和联邦调查人员使用，以确认嫌疑人或证人的照片是否与数据库中的图片相匹配，该数据库有200亿张图片，均是从社交媒体和公共互联网上获取。 其中，数据库10%的资源来自俄罗斯最大的社交网络VKontakte（简称VK），因此，乌方可以依托Clearview公司的数据库，在战场上扫描阵亡或被俘的俄罗斯士兵。 Clearview还与《华盛顿邮报》分享了该公司与3个乌克兰政府机构交流的电子邮件，以证实该软件确实正在被乌方使用，这3个机构包括乌克兰国家警察、乌克兰国防部。 在一份电子邮件中，乌国防部的一名代表称，他们已经通过扫描阵亡士兵的脸部照片对Clearview进行了测试，当该软件链接到阵亡士兵的俄罗斯VK和Instagram账户时，他们“感到惊喜”。 同-代特称，在乌军方的鼓励下，乌克兰其他政府机构也测试了这项技术。同-代特还称，乌克兰已使用Clearview软件来确认军事检查站人员的身份，核实某个乌克兰人是否有可能是俄罗斯的“渗透者”或“破坏者”。\"\n}";
        request.setJsonBody(jsonBody);

        ApiExplorerClient client = new ApiExplorerClient();

        try {
            ApiExplorerResponse response = client.sendRequest(request);
            // 返回结果格式为Json字符串
            System.out.println(response.getResult() + ".........");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}