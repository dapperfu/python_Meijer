package Ma;

import com.google.maps.internal.HttpHeaders;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final PredictRequestContext f19700a;

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put(HttpHeaders.USER_AGENT, "EmarsysSDK|osversion:" + this.f19700a.getDeviceInfo().getOsVersion() + "|platform:" + this.f19700a.getDeviceInfo().j());
        String strA = this.f19700a.getKeyValueStore().a("xp");
        String strA2 = this.f19700a.getKeyValueStore().a("predict_visitor_id");
        StringBuilder sb2 = new StringBuilder();
        if (strA != null) {
            sb2.append("xp=");
            sb2.append(strA);
            sb2.append(";");
        }
        if (strA2 != null) {
            sb2.append("cdv=");
            sb2.append(strA2);
        }
        if (strA == null && strA2 == null) {
            return map;
        }
        map.put("Cookie", sb2.toString());
        return map;
    }

    public a(PredictRequestContext predictRequestContext) {
        I9.b.c(predictRequestContext, "RequestContext must not be null!");
        this.f19700a = predictRequestContext;
    }
}
