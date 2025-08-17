package ma;

import G9.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import na.ButtonClicked;
import oa.C16008a;

/* renamed from: ma.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15579a {
    public static Map<String, Object> a(ButtonClicked buttonClicked) {
        HashMap map = new HashMap();
        map.put("campaignId", buttonClicked.getCampaignId());
        map.put("buttonId", buttonClicked.getButtonId());
        map.put("timestamp", p.a(buttonClicked.getTimestamp()));
        return map;
    }

    public static List<Map<String, Object>> b(List<ButtonClicked> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ButtonClicked> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    public static Map<String, Object> c(C16008a c16008a) {
        HashMap map = new HashMap();
        map.put("campaignId", c16008a.a());
        map.put("timestamp", p.a(c16008a.b()));
        return map;
    }

    public static List<Map<String, Object>> d(List<C16008a> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<C16008a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c(it.next()));
        }
        return arrayList;
    }
}
