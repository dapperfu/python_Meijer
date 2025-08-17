package com.adobe.marketing.mobile.userprofile;

import Q5.t;
import com.adobe.marketing.mobile.AbstractC6453l;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.InterfaceC6456o;
import com.adobe.marketing.mobile.M;
import f6.C13845a;
import f6.i;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class UserProfileExtension extends AbstractC6453l {

    /* renamed from: b, reason: collision with root package name */
    private c f62742b;

    private void j(List<String> list, C6449h c6449h) {
        this.f62742b.a(list);
        if (this.f62742b.f()) {
            v(c6449h);
        }
    }

    private void k(Map<String, Object> map, C6449h c6449h) {
        try {
            String strE = C13845a.e(map, "key");
            if (i.a(strE)) {
                t.a("UserProfile", "UserProfileExtension", "Invalid delete key from the user profile consequence", new Object[0]);
                return;
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(strE);
            j(arrayList, c6449h);
        } catch (Exception unused) {
            t.b("UserProfile", "UserProfileExtension", "Could not extract the profile update request data from the rule consequence details.", new Object[0]);
        }
    }

    private void r(Map<String, Object> map, C6449h c6449h) {
        try {
            String strE = C13845a.e(map, "key");
            Object obj = map.get("value");
            if (i.a(strE)) {
                t.a("UserProfile", "UserProfileExtension", "Invalid write key from the user profile consequence", new Object[0]);
                return;
            }
            Object objT = obj == null ? null : t(strE, obj);
            HashMap map2 = new HashMap();
            map2.put(strE, objT);
            u(map2, c6449h);
        } catch (Exception unused) {
            t.b("UserProfile", "UserProfileExtension", "Could not extract the profile update request data from the rule consequence details.", new Object[0]);
        }
    }

    private boolean s() {
        if (this.f62742b != null) {
            return true;
        }
        try {
            c cVar = new c();
            this.f62742b = cVar;
            return cVar.e();
        } catch (b e10) {
            t.a("UserProfile", "UserProfileExtension", "Unable to work with Persisted profile data - (%s)", e10);
            return false;
        }
    }

    private Object t(String str, Object obj) {
        if (!str.equals("a.triggered") && !str.equals("a.clicked") && !str.equals("a.viewed")) {
            return obj;
        }
        Map<String, Object> mapD = this.f62742b.d(str);
        if (mapD == null) {
            mapD = new HashMap<>();
        }
        String strValueOf = String.valueOf(obj);
        mapD.put(strValueOf, Integer.valueOf(C13845a.m(mapD, strValueOf, 0) + 1));
        return mapD;
    }

    private void u(Map<String, Object> map, C6449h c6449h) {
        this.f62742b.h(map);
        if (this.f62742b.f()) {
            v(c6449h);
        }
    }

    private void v(C6449h c6449h) {
        HashMap map = new HashMap();
        c cVar = this.f62742b;
        if (cVar != null) {
            map.put("userprofiledata", cVar.c());
        }
        a().b(map, c6449h);
        a().c(new C6449h.b("UserProfile Response Event", "com.adobe.eventType.userProfile", "com.adobe.eventSource.responseProfile").d(map).a());
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String b() {
        return "UserProfile";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String e() {
        return "com.adobe.module.userProfile";
    }

    void l(C6449h c6449h) {
        try {
            List<String> listH = C13845a.h(String.class, c6449h.o(), "userprofileremovekeys");
            if (listH.size() > 0) {
                j(listH, c6449h);
            }
        } catch (Exception e10) {
            t.b("UserProfile", "UserProfileExtension", "Could not extract the profile request data from the Event - (%s)", e10);
        }
    }

    void m(C6449h c6449h) {
        HashMap map = new HashMap();
        try {
            List<String> listH = C13845a.h(String.class, c6449h.o(), "userprofilegetattributes");
            if (listH == null || listH.size() <= 0) {
                return;
            }
            for (String str : listH) {
                Object objB = this.f62742b.b(str);
                if (objB != null) {
                    map.put(str, objB);
                }
            }
            HashMap map2 = new HashMap();
            map2.put("userprofilegetattributes", map);
            a().c(new C6449h.b("UserProfile Response Event", "com.adobe.eventType.userProfile", "com.adobe.eventSource.responseProfile").d(map2).c(c6449h).a());
        } catch (Exception e10) {
            t.b("UserProfile", "UserProfileExtension", "Could not find specific data from persisted profile data - (%s)", e10);
        }
    }

    void n(C6449h c6449h) {
        if (this.f62742b == null) {
            t.a("UserProfile", "UserProfileExtension", "Unable to work with Persisted profile data.", new Object[0]);
            return;
        }
        Map<String, Object> mapO = c6449h.o();
        if (mapO == null || mapO.isEmpty()) {
            t.a("UserProfile", "UserProfileExtension", "Unexpected Null/empty Value (Event data). Ignoring event", new Object[0]);
            return;
        }
        if (mapO.containsKey("userprofileupdatekey")) {
            p(c6449h);
        } else if (mapO.containsKey("userprofilegetattributes")) {
            m(c6449h);
        } else {
            t.a("UserProfile", "UserProfileExtension", "No update/get request key in eventData. Ignoring event", new Object[0]);
        }
    }

    void o(C6449h c6449h) {
        if (this.f62742b == null) {
            t.a("UserProfile", "UserProfileExtension", "Unable to work with Persisted profile data.", new Object[0]);
            return;
        }
        Map<String, Object> mapO = c6449h.o();
        if (mapO == null || mapO.isEmpty()) {
            t.a("UserProfile", "UserProfileExtension", "Unexpected Null Value (event data), discarding the user profile request reset event.", new Object[0]);
        } else if (mapO.containsKey("userprofileremovekeys")) {
            l(c6449h);
        } else {
            t.a("UserProfile", "UserProfileExtension", "No remove request key in eventData. Ignoring event", new Object[0]);
        }
    }

    void p(C6449h c6449h) {
        try {
            Map<String, Object> mapJ = C13845a.j(Object.class, c6449h.o(), "userprofileupdatekey");
            if (mapJ.size() > 0) {
                u(mapJ, c6449h);
            }
        } catch (Exception unused) {
            t.b("UserProfile", "UserProfileExtension", "Could not extract the profile update request data from the Event.", new Object[0]);
        }
    }

    void q(C6449h c6449h) {
        if (this.f62742b == null) {
            t.a("UserProfile", "UserProfileExtension", "Unable to work with Persisted profile data.", new Object[0]);
            return;
        }
        try {
            Map mapJ = C13845a.j(Object.class, c6449h.o(), "triggeredconsequence");
            if (mapJ != null && !mapJ.isEmpty() && "csp".equals(C13845a.e(mapJ, "type"))) {
                String strE = C13845a.e(mapJ, PreferencesHelper.PREF_ID);
                Map<String, Object> mapJ2 = C13845a.j(Object.class, mapJ, "detail");
                if (mapJ2 != null && !mapJ2.isEmpty()) {
                    t.a("UserProfile", "UserProfileExtension", "Processing UserProfileExtension Consequence with id (%s)", strE);
                    String strE2 = C13845a.e(mapJ2, "operation");
                    if ("write".equals(strE2)) {
                        r(mapJ2, c6449h);
                        return;
                    } else if ("delete".equals(strE2)) {
                        k(mapJ2, c6449h);
                        return;
                    } else {
                        t.a("UserProfile", "UserProfileExtension", "Invalid UserProfileExtension consequence operation", new Object[0]);
                        return;
                    }
                }
                t.a("UserProfile", "UserProfileExtension", "Unable to process UserProfileExtension Consequence. Invalid detail provided for consequence id (%s)", strE);
            }
        } catch (Exception e10) {
            t.b("UserProfile", "UserProfileExtension", "Could not extract the consequence information from the rules response event - (%s)", e10);
        }
    }

    protected UserProfileExtension(AbstractC6454m abstractC6454m) {
        super(abstractC6454m);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String f() {
        return M.a();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected void g() {
        a().h("com.adobe.eventType.userProfile", "com.adobe.eventSource.requestProfile", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.userprofile.d
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62745a.n(c6449h);
            }
        });
        a().h("com.adobe.eventType.userProfile", "com.adobe.eventSource.requestReset", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.userprofile.e
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62746a.o(c6449h);
            }
        });
        a().h("com.adobe.eventType.rulesEngine", "com.adobe.eventSource.responseContent", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.userprofile.f
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62747a.q(c6449h);
            }
        });
        if (s() && !this.f62742b.c().isEmpty()) {
            v(null);
        }
    }
}
