package M5;

import com.adobe.marketing.mobile.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class r {
    public static List<N> a(List<Map> list) {
        ArrayList arrayList = new ArrayList();
        for (Map map : list) {
            if (map != null) {
                arrayList.add(new N(String.valueOf(map.get("ID_ORIGIN")), String.valueOf(map.get("ID_TYPE")), String.valueOf(map.get("ID")), N.a.b(Integer.parseInt(String.valueOf(map.get("STATE"))))));
            }
        }
        return arrayList;
    }

    public static Map<String, Object> b(N n10) {
        HashMap map = new HashMap();
        map.put("ID", n10.b());
        map.put("ID_ORIGIN", n10.c());
        map.put("ID_TYPE", n10.d());
        map.put("STATE", Integer.valueOf(n10.a().e()));
        return map;
    }
}
