package com.adobe.marketing.mobile;

import J5.q;
import android.app.Activity;
import android.app.Application;
import com.adobe.marketing.mobile.C6574h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class B {
    public static void f(C6574h c6574h, long j10, InterfaceC6568b<C6574h> interfaceC6568b) {
        if (interfaceC6568b == null) {
            R5.t.b("MobileCore", "MobileCore", "Failed to dispatchEventWithResponseCallback - callback is null", new Object[0]);
            return;
        }
        if (c6574h == null) {
            R5.t.b("MobileCore", "MobileCore", "Failed to dispatchEventWithResponseCallback - event is null", new Object[0]);
            interfaceC6568b.b(C6569c.f63211c);
        } else {
            q.Companion aVar = J5.q.INSTANCE;
            aVar.a().g0(c6574h, j10, interfaceC6568b);
            aVar.a().E(c6574h);
        }
    }

    public static void b(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            R5.t.b("MobileCore", "MobileCore", "collectData: Could not dispatch generic data event, data is null or empty.", new Object[0]);
        } else {
            e(new C6574h.b("Collect Data", "com.adobe.eventType.generic.data", "com.adobe.eventSource.os").d(map).a());
        }
    }

    public static void c(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            R5.t.b("MobileCore", "MobileCore", "Could not trigger PII, the data is null or empty.", new Object[0]);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("contextdata", map);
        e(new C6574h.b("Collect PII", "com.adobe.eventType.generic.pii", "com.adobe.eventSource.requestContent").d(map2).a());
    }

    public static void d(String str) {
        if (str == null) {
            R5.t.b("MobileCore", "MobileCore", "configureWithAppID failed - appId is null.", new Object[0]);
            return;
        }
        HashMap map = new HashMap();
        map.put("config.appId", str);
        e(new C6574h.b("Configure with App ID", "com.adobe.eventType.configuration", "com.adobe.eventSource.requestContent").d(map).a());
    }

    public static void e(C6574h c6574h) {
        if (c6574h == null) {
            R5.t.b("MobileCore", "MobileCore", "Failed to dispatchEvent - event is null", new Object[0]);
        } else {
            J5.q.INSTANCE.a().E(c6574h);
        }
    }

    public static String g() {
        O oV = J5.q.INSTANCE.a().V();
        if (oV == O.NONE) {
            return "3.5.0";
        }
        return "3.5.0-" + oV.e();
    }

    public static int i() {
        return H5.a.f13419a.a();
    }

    public static int j() {
        return H5.a.f13419a.b();
    }

    public static void k() {
        HashMap map = new HashMap();
        map.put("action", "pause");
        e(new C6574h.b("Lifecycle Pause", "com.adobe.eventType.generic.lifecycle", "com.adobe.eventSource.requestContent").d(map).a());
    }

    public static void l(Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.put("action", "start");
        map2.put("additionalcontextdata", map);
        e(new C6574h.b("Lifecycle Resume", "com.adobe.eventType.generic.lifecycle", "com.adobe.eventSource.requestContent").d(map2).a());
    }

    public static void m(String str, String str2, InterfaceC6543a<C6574h> interfaceC6543a) {
        if (interfaceC6543a == null) {
            R5.t.b("MobileCore", "MobileCore", "Failed to registerEventListener - callback is null", "Unexpected Null Value");
        } else if (str == null || str2 == null) {
            R5.t.b("MobileCore", "MobileCore", "Failed to registerEventListener - event type/source is null", new Object[0]);
        } else {
            J5.q.INSTANCE.a().d0(str, str2, interfaceC6543a);
        }
    }

    public static void n(List<Class<? extends AbstractC6578l>> list, InterfaceC6543a<?> interfaceC6543a) {
        C.f62824l.c(list, interfaceC6543a);
    }

    public static void o(String str) {
        HashMap map = new HashMap();
        map.put("advertisingidentifier", str);
        e(new C6574h.b("Set Advertising Identifier", "com.adobe.eventType.generic.identity", "com.adobe.eventSource.requestContent").d(map).a());
    }

    public static void p(Application application) {
        if (application == null) {
            R5.t.b("MobileCore", "MobileCore", "setApplication failed - application is null", new Object[0]);
        } else {
            C.f62824l.d(application);
        }
    }

    public static void q(A a10) {
        if (a10 == null) {
            R5.t.b("MobileCore", "MobileCore", "setLogLevel failed - mode is null", new Object[0]);
        } else {
            R5.t.d(a10);
        }
    }

    public static void r(String str) {
        HashMap map = new HashMap();
        map.put("pushidentifier", str);
        e(new C6574h.b("Set Push Identifier", "com.adobe.eventType.generic.identity", "com.adobe.eventSource.requestContent").d(map).a());
    }

    public static void s(String str, Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (str == null) {
            str = "";
        }
        map2.put("action", str);
        if (map == null) {
            map = new HashMap<>();
        }
        map2.put("contextdata", map);
        e(new C6574h.b("Analytics Track", "com.adobe.eventType.generic.track", "com.adobe.eventSource.requestContent").d(map2).a());
    }

    public static void t(String str, Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (str == null) {
            str = "";
        }
        map2.put("state", str);
        if (map == null) {
            map = new HashMap<>();
        }
        map2.put("contextdata", map);
        e(new C6574h.b("Analytics Track", "com.adobe.eventType.generic.track", "com.adobe.eventSource.requestContent").d(map2).a());
    }

    public static void u(Map<String, Object> map) {
        if (map == null) {
            R5.t.b("MobileCore", "MobileCore", "updateConfiguration failed - configMap is null.", new Object[0]);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("config.update", map);
        e(new C6574h.b("Configuration Update", "com.adobe.eventType.configuration", "com.adobe.eventSource.requestContent").d(map2).a());
    }

    static void a(Activity activity) {
        Map<String, Object> mapC = H5.b.c(activity);
        if (mapC != null && !mapC.isEmpty()) {
            e(new C6574h.b("Collect Data", "com.adobe.eventType.generic.data", "com.adobe.eventSource.os").d(mapC).a());
        } else {
            R5.t.a("MobileCore", "MobileCore", "collectData: Could not dispatch generic data event, data is null or empty.", new Object[0]);
        }
    }

    public static Application h() {
        return R5.K.f().a().b();
    }
}
