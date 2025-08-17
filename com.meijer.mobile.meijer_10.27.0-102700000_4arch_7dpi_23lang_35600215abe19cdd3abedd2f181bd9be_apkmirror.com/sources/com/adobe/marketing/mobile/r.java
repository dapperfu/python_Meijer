package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.N;
import com.adobe.marketing.mobile.identity.IdentityExtension;
import f6.C13845a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<? extends AbstractC6453l> f62658a = IdentityExtension.class;

    class a implements InterfaceC6443b<C6449h> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6418a f62659a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6418a f62660b;

        a(InterfaceC6418a interfaceC6418a, InterfaceC6418a interfaceC6418a2) {
            this.f62659a = interfaceC6418a;
            this.f62660b = interfaceC6418a2;
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6443b
        public void b(C6444c c6444c) {
            InterfaceC6418a interfaceC6418a = this.f62659a;
            if (interfaceC6418a instanceof InterfaceC6443b) {
                ((InterfaceC6443b) interfaceC6418a).b(c6444c);
            }
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6418a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(C6449h c6449h) {
            this.f62660b.a(c6449h);
        }
    }

    public static void d(final InterfaceC6418a<String> interfaceC6418a) {
        if (interfaceC6418a == null) {
            Q5.t.f("Identity", "Identity", "getIdentifiers : callback shouldn't be null.", new Object[0]);
        } else {
            Q5.t.e("Identity", "Identity", "getExperienceCloudId : Processing the request to get ECID.", new Object[0]);
            b(null, interfaceC6418a, new InterfaceC6418a() { // from class: com.adobe.marketing.mobile.q
                @Override // com.adobe.marketing.mobile.InterfaceC6418a
                public final void a(Object obj) {
                    interfaceC6418a.a(C13845a.o(((C6449h) obj).o(), "mid", ""));
                }
            });
        }
    }

    public static void e(Map<String, String> map, N.a aVar) {
        if (map == null || map.isEmpty()) {
            Q5.t.f("Identity", "Identity", "syncIdentifiers(ids, state) : Unable to sync Visitor identifiers, provided map was null or empty", new Object[0]);
            return;
        }
        Q5.t.e("Identity", "Identity", "syncIdentifiers(ids, state) : Processing a request to sync Visitor identifiers.", new Object[0]);
        HashMap map2 = new HashMap();
        map2.put("visitoridentifiers", map);
        map2.put("authenticationstate", Integer.valueOf(aVar.e()));
        map2.put("forcesync", Boolean.FALSE);
        map2.put("issyncevent", Boolean.TRUE);
        C6449h c6449hA = new C6449h.b("IdentityRequestIdentity", "com.adobe.eventType.identity", "com.adobe.eventSource.requestIdentity").d(map2).a();
        B.e(c6449hA);
        Q5.t.e("Identity", "Identity", "dispatchIDSyncEvent : Identity Sync event has been added to event hub : %s", c6449hA);
    }

    private static <T> void b(Map<String, Object> map, InterfaceC6418a<T> interfaceC6418a, InterfaceC6418a<C6449h> interfaceC6418a2) {
        C6449h c6449hA = map == null ? new C6449h.b("IdentityRequestIdentity", "com.adobe.eventType.identity", "com.adobe.eventSource.requestIdentity").a() : new C6449h.b("IdentityRequestIdentity", "com.adobe.eventType.identity", "com.adobe.eventSource.requestIdentity").d(map).a();
        B.f(c6449hA, 500L, new a(interfaceC6418a, interfaceC6418a2));
        Q5.t.e("Identity", "Identity", "createIdentityRequestWithOneTimeCallbackWithCallbackParam : Identity request event has been added to the event hub : %s", c6449hA);
    }

    public static String c() {
        return "3.0.2";
    }
}
