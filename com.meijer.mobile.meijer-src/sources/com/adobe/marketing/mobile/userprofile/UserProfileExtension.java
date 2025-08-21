package com.adobe.marketing.mobile.userprofile;

import R5.t;
import com.adobe.marketing.mobile.AbstractC6578l;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.InterfaceC6581o;
import com.adobe.marketing.mobile.M;
import g6.C14328a;
import g6.i;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class UserProfileExtension extends AbstractC6578l {

    /* renamed from: b, reason: collision with root package name */
    private c f63581b;

    private void j(List<String> list, C6574h c6574h) {
        this.f63581b.a(list);
        if (this.f63581b.f()) {
            v(c6574h);
        }
    }

    private void k(Map<String, Object> map, C6574h c6574h) {
        try {
            String strE = C14328a.e(map, "key");
            if (i.a(strE)) {
                t.a("UserProfile", "UserProfileExtension", "Invalid delete key from the user profile consequence", new Object[0]);
                return;
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(strE);
            j(arrayList, c6574h);
        } catch (Exception unused) {
            t.b("UserProfile", "UserProfileExtension", "Could not extract the profile update request data from the rule consequence details.", new Object[0]);
        }
    }

    private void r(Map<String, Object> map, C6574h c6574h) {
        try {
            String strE = C14328a.e(map, "key");
            Object obj = map.get("value");
            if (i.a(strE)) {
                t.a("UserProfile", "UserProfileExtension", "Invalid write key from the user profile consequence", new Object[0]);
                return;
            }
            Object objT = obj == null ? null : t(strE, obj);
            HashMap map2 = new HashMap();
            map2.put(strE, objT);
            u(map2, c6574h);
        } catch (Exception unused) {
            t.b("UserProfile", "UserProfileExtension", "Could not extract the profile update request data from the rule consequence details.", new Object[0]);
        }
    }

    private boolean s() {
        if (this.f63581b != null) {
            return true;
        }
        try {
            c cVar = new c();
            this.f63581b = cVar;
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
        Map<String, Object> mapD = this.f63581b.d(str);
        if (mapD == null) {
            mapD = new HashMap<>();
        }
        String strValueOf = String.valueOf(obj);
        mapD.put(strValueOf, Integer.valueOf(C14328a.m(mapD, strValueOf, 0) + 1));
        return mapD;
    }

    private void u(Map<String, Object> map, C6574h c6574h) {
        this.f63581b.h(map);
        if (this.f63581b.f()) {
            v(c6574h);
        }
    }

    private void v(C6574h c6574h) {
        HashMap map = new HashMap();
        c cVar = this.f63581b;
        if (cVar != null) {
            map.put("userprofiledata", cVar.c());
        }
        a().b(map, c6574h);
        a().c(new C6574h.b("UserProfile Response Event", "com.adobe.eventType.userProfile", "com.adobe.eventSource.responseProfile").d(map).a());
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String b() {
        return "UserProfile";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String e() {
        return "com.adobe.module.userProfile";
    }

    void l(C6574h c6574h) {
        try {
            List<String> listH = C14328a.h(String.class, c6574h.o(), "userprofileremovekeys");
            if (listH.size() > 0) {
                j(listH, c6574h);
            }
        } catch (Exception e10) {
            t.b("UserProfile", "UserProfileExtension", "Could not extract the profile request data from the Event - (%s)", e10);
        }
    }

    void m(C6574h c6574h) {
        HashMap map = new HashMap();
        try {
            List<String> listH = C14328a.h(String.class, c6574h.o(), "userprofilegetattributes");
            if (listH == null || listH.size() <= 0) {
                return;
            }
            for (String str : listH) {
                Object objB = this.f63581b.b(str);
                if (objB != null) {
                    map.put(str, objB);
                }
            }
            HashMap map2 = new HashMap();
            map2.put("userprofilegetattributes", map);
            a().c(new C6574h.b("UserProfile Response Event", "com.adobe.eventType.userProfile", "com.adobe.eventSource.responseProfile").d(map2).c(c6574h).a());
        } catch (Exception e10) {
            t.b("UserProfile", "UserProfileExtension", "Could not find specific data from persisted profile data - (%s)", e10);
        }
    }

    void n(C6574h c6574h) {
        if (this.f63581b == null) {
            t.a("UserProfile", "UserProfileExtension", "Unable to work with Persisted profile data.", new Object[0]);
            return;
        }
        Map<String, Object> mapO = c6574h.o();
        if (mapO == null || mapO.isEmpty()) {
            t.a("UserProfile", "UserProfileExtension", "Unexpected Null/empty Value (Event data). Ignoring event", new Object[0]);
            return;
        }
        if (mapO.containsKey("userprofileupdatekey")) {
            p(c6574h);
        } else if (mapO.containsKey("userprofilegetattributes")) {
            m(c6574h);
        } else {
            t.a("UserProfile", "UserProfileExtension", "No update/get request key in eventData. Ignoring event", new Object[0]);
        }
    }

    void o(C6574h c6574h) {
        if (this.f63581b == null) {
            t.a("UserProfile", "UserProfileExtension", "Unable to work with Persisted profile data.", new Object[0]);
            return;
        }
        Map<String, Object> mapO = c6574h.o();
        if (mapO == null || mapO.isEmpty()) {
            t.a("UserProfile", "UserProfileExtension", "Unexpected Null Value (event data), discarding the user profile request reset event.", new Object[0]);
        } else if (mapO.containsKey("userprofileremovekeys")) {
            l(c6574h);
        } else {
            t.a("UserProfile", "UserProfileExtension", "No remove request key in eventData. Ignoring event", new Object[0]);
        }
    }

    void p(C6574h c6574h) {
        try {
            Map<String, Object> mapJ = C14328a.j(Object.class, c6574h.o(), "userprofileupdatekey");
            if (mapJ.size() > 0) {
                u(mapJ, c6574h);
            }
        } catch (Exception unused) {
            t.b("UserProfile", "UserProfileExtension", "Could not extract the profile update request data from the Event.", new Object[0]);
        }
    }

    void q(C6574h c6574h) {
        if (this.f63581b == null) {
            t.a("UserProfile", "UserProfileExtension", "Unable to work with Persisted profile data.", new Object[0]);
            return;
        }
        try {
            Map mapJ = C14328a.j(Object.class, c6574h.o(), "triggeredconsequence");
            if (mapJ != null && !mapJ.isEmpty() && "csp".equals(C14328a.e(mapJ, "type"))) {
                String strE = C14328a.e(mapJ, PreferencesHelper.PREF_ID);
                Map<String, Object> mapJ2 = C14328a.j(Object.class, mapJ, "detail");
                if (mapJ2 != null && !mapJ2.isEmpty()) {
                    t.a("UserProfile", "UserProfileExtension", "Processing UserProfileExtension Consequence with id (%s)", strE);
                    String strE2 = C14328a.e(mapJ2, "operation");
                    if ("write".equals(strE2)) {
                        r(mapJ2, c6574h);
                        return;
                    } else if ("delete".equals(strE2)) {
                        k(mapJ2, c6574h);
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

    protected UserProfileExtension(AbstractC6579m abstractC6579m) {
        super(abstractC6579m);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String f() {
        return M.a();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected void g() {
        a().h("com.adobe.eventType.userProfile", "com.adobe.eventSource.requestProfile", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.userprofile.d
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63584a.n(c6574h);
            }
        });
        a().h("com.adobe.eventType.userProfile", "com.adobe.eventSource.requestReset", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.userprofile.e
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63585a.o(c6574h);
            }
        });
        a().h("com.adobe.eventType.rulesEngine", "com.adobe.eventSource.responseContent", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.userprofile.f
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63586a.q(c6574h);
            }
        });
        if (s() && !this.f63581b.c().isEmpty()) {
            v(null);
        }
    }
}
