package sc;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.fullstory.FS;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sc.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16931k implements InterfaceC16925e {

    /* renamed from: a, reason: collision with root package name */
    private final a f160410a;

    /* renamed from: b, reason: collision with root package name */
    private final C16929i f160411b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, InterfaceC16933m> f160412c;

    /* renamed from: sc.k$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f160413a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f160414b = null;

        private Map<String, String> c() {
            if (this.f160414b == null) {
                this.f160414b = a(this.f160413a);
            }
            return this.f160414b;
        }

        private static Bundle d(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    FS.log_w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                FS.log_w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                FS.log_w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        InterfaceC16924d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC16924d) Class.forName(str2).asSubclass(InterfaceC16924d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                FS.log_w("BackendRegistry", String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                FS.log_w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                FS.log_w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                FS.log_w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                FS.log_w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }

        a(Context context) {
            this.f160413a = context;
        }

        private Map<String, String> a(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                FS.log_w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }
    }

    C16931k(Context context, C16929i c16929i) {
        this(new a(context), c16929i);
    }

    @Override // sc.InterfaceC16925e
    public synchronized InterfaceC16933m a(String str) {
        if (this.f160412c.containsKey(str)) {
            return this.f160412c.get(str);
        }
        InterfaceC16924d interfaceC16924dB = this.f160410a.b(str);
        if (interfaceC16924dB == null) {
            return null;
        }
        InterfaceC16933m interfaceC16933mCreate = interfaceC16924dB.create(this.f160411b.a(str));
        this.f160412c.put(str, interfaceC16933mCreate);
        return interfaceC16933mCreate;
    }

    C16931k(a aVar, C16929i c16929i) {
        this.f160412c = new HashMap();
        this.f160410a = aVar;
        this.f160411b = c16929i;
    }
}
