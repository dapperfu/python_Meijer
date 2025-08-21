package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.N;
import com.adobe.marketing.mobile.identity.IdentityExtension;
import g6.C14328a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<? extends AbstractC6578l> f63497a = IdentityExtension.class;

    class a implements InterfaceC6568b<C6574h> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6543a f63498a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6543a f63499b;

        a(InterfaceC6543a interfaceC6543a, InterfaceC6543a interfaceC6543a2) {
            this.f63498a = interfaceC6543a;
            this.f63499b = interfaceC6543a2;
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6568b
        public void b(C6569c c6569c) {
            InterfaceC6543a interfaceC6543a = this.f63498a;
            if (interfaceC6543a instanceof InterfaceC6568b) {
                ((InterfaceC6568b) interfaceC6543a).b(c6569c);
            }
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6543a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(C6574h c6574h) {
            this.f63499b.a(c6574h);
        }
    }

    public static void d(final InterfaceC6543a<String> interfaceC6543a) {
        if (interfaceC6543a == null) {
            R5.t.f("Identity", "Identity", "getIdentifiers : callback shouldn't be null.", new Object[0]);
        } else {
            R5.t.e("Identity", "Identity", "getExperienceCloudId : Processing the request to get ECID.", new Object[0]);
            b(null, interfaceC6543a, new InterfaceC6543a() { // from class: com.adobe.marketing.mobile.q
                @Override // com.adobe.marketing.mobile.InterfaceC6543a
                public final void a(Object obj) {
                    interfaceC6543a.a(C14328a.o(((C6574h) obj).o(), "mid", ""));
                }
            });
        }
    }

    public static void e(Map<String, String> map, N.a aVar) {
        if (map == null || map.isEmpty()) {
            R5.t.f("Identity", "Identity", "syncIdentifiers(ids, state) : Unable to sync Visitor identifiers, provided map was null or empty", new Object[0]);
            return;
        }
        R5.t.e("Identity", "Identity", "syncIdentifiers(ids, state) : Processing a request to sync Visitor identifiers.", new Object[0]);
        HashMap map2 = new HashMap();
        map2.put("visitoridentifiers", map);
        map2.put("authenticationstate", Integer.valueOf(aVar.e()));
        map2.put("forcesync", Boolean.FALSE);
        map2.put("issyncevent", Boolean.TRUE);
        C6574h c6574hA = new C6574h.b("IdentityRequestIdentity", "com.adobe.eventType.identity", "com.adobe.eventSource.requestIdentity").d(map2).a();
        B.e(c6574hA);
        R5.t.e("Identity", "Identity", "dispatchIDSyncEvent : Identity Sync event has been added to event hub : %s", c6574hA);
    }

    private static <T> void b(Map<String, Object> map, InterfaceC6543a<T> interfaceC6543a, InterfaceC6543a<C6574h> interfaceC6543a2) {
        C6574h c6574hA = map == null ? new C6574h.b("IdentityRequestIdentity", "com.adobe.eventType.identity", "com.adobe.eventSource.requestIdentity").a() : new C6574h.b("IdentityRequestIdentity", "com.adobe.eventType.identity", "com.adobe.eventSource.requestIdentity").d(map).a();
        B.f(c6574hA, 500L, new a(interfaceC6543a, interfaceC6543a2));
        R5.t.e("Identity", "Identity", "createIdentityRequestWithOneTimeCallbackWithCallbackParam : Identity request event has been added to the event hub : %s", c6574hA);
    }

    public static String c() {
        return "3.0.2";
    }
}
