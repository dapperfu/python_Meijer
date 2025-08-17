package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.target.TargetExtension;
import com.adobe.marketing.mobile.util.DataReaderException;
import f6.C13845a;
import f6.C13848d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class L {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f62022b;

    /* renamed from: a, reason: collision with root package name */
    public static final Class<? extends AbstractC6453l> f62021a = TargetExtension.class;

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<String, com.adobe.marketing.mobile.target.v> f62023c = new ConcurrentHashMap<>();

    public static String b() {
        return "3.0.2";
    }

    private static void c() {
        if (f62022b) {
            return;
        }
        B.m("com.adobe.eventType.target", "com.adobe.eventSource.responseContent", new InterfaceC6418a() { // from class: com.adobe.marketing.mobile.K
            @Override // com.adobe.marketing.mobile.InterfaceC6418a
            public final void a(Object obj) {
                L.a((C6449h) obj);
            }
        });
        f62022b = true;
    }

    public static void d(List<com.adobe.marketing.mobile.target.v> list, com.adobe.marketing.mobile.target.o oVar) {
        if (list == null || list.isEmpty()) {
            Q5.t.f("Target", "Target", "Failed to retrieve Target location content (%s).", "The provided request list for mboxes is empty or null");
            return;
        }
        ArrayList<com.adobe.marketing.mobile.target.v> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (com.adobe.marketing.mobile.target.v vVar : arrayList) {
            if (vVar != null) {
                InterfaceC6418a<String> interfaceC6418aB = vVar.b();
                vVar.c();
                if (f6.i.a(vVar.e())) {
                    Q5.t.f("Target", "Target", "Failed to retrieve Target location content (%s), returning default content.", "Mbox name must not be empty or null");
                    String strD = vVar.d();
                    if (interfaceC6418aB != null) {
                        interfaceC6418aB.a(strD);
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
            Q5.t.f("Target", "Target", "Failed to retrieve Target location content (%s).", "The provided request list for mboxes does not contain valid requests");
            return;
        }
        c();
        HashMap map2 = new HashMap();
        map2.put("request", arrayList2);
        if (oVar != null) {
            map2.put("targetparams", oVar.g());
        }
        C6449h c6449hA = new C6449h.b("TargetLoadRequest", "com.adobe.eventType.target", "com.adobe.eventSource.requestContent").d(map2).a();
        for (Map.Entry entry : map.entrySet()) {
            f62023c.put(c6449hA.x() + "-" + ((String) entry.getKey()), (com.adobe.marketing.mobile.target.v) entry.getValue());
        }
        B.e(c6449hA);
    }

    public static /* synthetic */ void a(C6449h c6449h) {
        String strE;
        if (c6449h.q().equals("TargetRequestResponse")) {
            Map<String, Object> mapO = c6449h.o();
            if (C13848d.a(mapO)) {
                Q5.t.a("Target", "Target", "Cannot find target request, response event data is null or empty.", new Object[0]);
                return;
            }
            String strE2 = null;
            try {
                strE = C13845a.e(mapO, "responseEventId");
            } catch (DataReaderException e10) {
                Q5.t.a("Target", "Target", "Cannot find target request, responseEventId is invalid (%s).", e10.getLocalizedMessage());
                strE = null;
            }
            if (f6.i.a(strE)) {
                Q5.t.a("Target", "Target", "Cannot find target request, responseEventId is not available.", new Object[0]);
                return;
            }
            try {
                strE2 = C13845a.e(mapO, "responsePairId");
            } catch (DataReaderException e11) {
                Q5.t.a("Target", "Target", "Cannot find target request, responsePairId is invalid (%s).", e11.getLocalizedMessage());
            }
            if (f6.i.a(strE2)) {
                Q5.t.a("Target", "Target", "Cannot find target request, responsePairId is not available.", new Object[0]);
                return;
            }
            String str = strE + "-" + strE2;
            com.adobe.marketing.mobile.target.v vVar = f62023c.get(str);
            if (vVar == null) {
                Q5.t.f("Target", "Target", "Missing target request for (%s)", str);
                return;
            }
            InterfaceC6418a<String> interfaceC6418aB = vVar.b();
            vVar.c();
            if (interfaceC6418aB != null) {
                try {
                    interfaceC6418aB.a(C13845a.o(mapO, "content", vVar.d()));
                } catch (Exception e12) {
                    Q5.t.f("Target", "Target", "Exception (%s) when calling provided AdobeCallback.", e12.getLocalizedMessage());
                }
            }
        }
    }
}
