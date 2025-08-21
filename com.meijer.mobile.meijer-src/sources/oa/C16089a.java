package oa;

import I9.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pa.ButtonClicked;
import qa.C16616a;

/* renamed from: oa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16089a {
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

    public static Map<String, Object> c(C16616a c16616a) {
        HashMap map = new HashMap();
        map.put("campaignId", c16616a.a());
        map.put("timestamp", p.a(c16616a.b()));
        return map;
    }

    public static List<Map<String, Object>> d(List<C16616a> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<C16616a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c(it.next()));
        }
        return arrayList;
    }
}
