
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;


public class JavaCodeSnippet {

    /*
     * Your AWS Access Key ID, as taken from the AWS Your Account page.
     */
    private static final String AWS_ACCESS_KEY_ID = "AKIAJJIMJNQRD2RFGFCQ";

    /*
     * Your AWS Secret Key corresponding to the above ID, as taken from the AWS
     * Your Account page.
     */
    private static final String AWS_SECRET_KEY = "1ZmFTRPxnbo/kV8GpS2rUGWO2HWgSGkL2VrazfQu";

    /*
     * Use the end-point according to the region you are interested in.
     */
    private static final String ENDPOINT = "webservices.amazon.com";

    public static void main(String[] args) {

        /*
         * Set up the signed requests helper.
         */
        SignedRequestsHelper helper;

        try {
            helper = SignedRequestsHelper.getInstance(ENDPOINT, AWS_ACCESS_KEY_ID, AWS_SECRET_KEY);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        String requestUrl = null;

        Map<String, String> params = new HashMap<String, String>();

        params.put("Service", "AWSECommerceService");
        params.put("Operation", "ItemSearch");
        params.put("AWSAccessKeyId", "AKIAJJIMJNQRD2RFGFCQ");
        params.put("AssociateTag", "goodea09-20");
        params.put("SearchIndex", "Electronics");
        params.put("Keywords", "iphone");
        params.put("ResponseGroup", "Images,ItemAttributes,Offers");
        params.put("Sort", "price");

        requestUrl = helper.sign(params);

        System.out.println("Signed URL: \"" + requestUrl + "\"");
    }
}


