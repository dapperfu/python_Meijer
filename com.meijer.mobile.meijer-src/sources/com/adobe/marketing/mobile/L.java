package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.target.TargetExtension;
import com.adobe.marketing.mobile.util.DataReaderException;
import g6.C14328a;
import g6.C14331d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class L {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f62861b;

    /* renamed from: a, reason: collision with root package name */
    public static final Class<? extends AbstractC6578l> f62860a = TargetExtension.class;

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<String, com.adobe.marketing.mobile.target.v> f62862c = new ConcurrentHashMap<>();

    public static String b() {
        return "3.0.2";
    }

    private static void c() {
        if (f62861b) {
            return;
        }
        B.m("com.adobe.eventType.target", "com.adobe.eventSource.responseContent", new InterfaceC6543a() { // from class: com.adobe.marketing.mobile.K
            @Override // com.adobe.marketing.mobile.InterfaceC6543a
            public final void a(Object obj) {
                L.a((C6574h) obj);
            }
        });
        f62861b = true;
    }

    public static void d(List<com.adobe.marketing.mobile.target.v> list, com.adobe.marketing.mobile.target.o oVar) {
        if (list == null || list.isEmpty()) {
            R5.t.f("Target", "Target", "Failed to retrieve Target location content (%s).", "The provided request list for mboxes is empty or null");
            return;
        }
        ArrayList<com.adobe.marketing.mobile.target.v> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (com.adobe.marketing.mobile.target.v vVar : arrayList) {
            if (vVar != null) {
                InterfaceC6543a<String> interfaceC6543aB = vVar.b();
                vVar.c();
                if (g6.i.a(vVar.e())) {
                    R5.t.f("Target", "Target", "Failed to retrieve Target location content (%s), returning default content.", "Mbox name must not be empty or null");
                    String strD = vVar.d();
                    if (interfaceC6543aB != null) {
                        interfaceC6543aB.a(strD);
                    }
                } else {
                    String string = UUID.randomUUID().toString();
                    vVar.h(string);
                    map.put(string, vVar);
                    arrayList2.add(vVar.i());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            R5.t.f("Target", "Target", "Failed to retrieve Target location content (%s).", "The provided request list for mboxes does not contain valid requests");
            return;
        }
        c();
        HashMap map2 = new HashMap();
        map2.put("request", arrayList2);
        if (oVar != null) {
            map2.put("targetparams", oVar.g());
        }
        C6574h c6574hA = new C6574h.b("TargetLoadRequest", "com.adobe.eventType.target", "com.adobe.eventSource.requestContent").d(map2).a();
        for (Map.Entry entry : map.entrySet()) {
            f62862c.put(c6574hA.x() + "-" + ((String) entry.getKey()), (com.adobe.marketing.mobile.target.v) entry.getValue());
        }
        B.e(c6574hA);
    }

    public static /* synthetic */ void a(C6574h c6574h) {
        String strE;
        if (c6574h.q().equals("TargetRequestResponse")) {
            Map<String, Object> mapO = c6574h.o();
            if (C14331d.a(mapO)) {
                R5.t.a("Target", "Target", "Cannot find target request, response event data is null or empty.", new Object[0]);
                return;
            }
            String strE2 = null;
            try {
                strE = C14328a.e(mapO, "responseEventId");
            } catch (DataReaderException e10) {
                R5.t.a("Target", "Target", "Cannot find target request, responseEventId is invalid (%s).", e10.getLocalizedMessage());
                strE = null;
            }
            if (g6.i.a(strE)) {
                R5.t.a("Target", "Target", "Cannot find target request, responseEventId is not available.", new Object[0]);
                return;
            }
            try {
                strE2 = C14328a.e(mapO, "responsePairId");
            } catch (DataReaderException e11) {
                R5.t.a("Target", "Target", "Cannot find target request, responsePairId is invalid (%s).", e11.getLocalizedMessage());
            }
            if (g6.i.a(strE2)) {
                R5.t.a("Target", "Target", "Cannot find target request, responsePairId is not available.", new Object[0]);
                return;
            }
            String str = strE + "-" + strE2;
            com.adobe.marketing.mobile.target.v vVar = f62862c.get(str);
            if (vVar == null) {
                R5.t.f("Target", "Target", "Missing target request for (%s)", str);
                return;
            }
            InterfaceC6543a<String> interfaceC6543aB = vVar.b();
            vVar.c();
            if (interfaceC6543aB != null) {
                try {
                    interfaceC6543aB.a(C14328a.o(mapO, "content", vVar.d()));
                } catch (Exception e12) {
                    R5.t.f("Target", "Target", "Exception (%s) when calling provided AdobeCallback.", e12.getLocalizedMessage());
                }
            }
        }
    }
}
