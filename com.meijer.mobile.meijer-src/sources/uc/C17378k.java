package uc;

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

/* renamed from: uc.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C17378k implements InterfaceC17372e {

    /* renamed from: a, reason: collision with root package name */
    private final a f163896a;

    /* renamed from: b, reason: collision with root package name */
    private final C17376i f163897b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, InterfaceC17380m> f163898c;

    /* renamed from: uc.k$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f163899a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f163900b = null;

        private Map<String, String> c() {
            if (this.f163900b == null) {
                this.f163900b = a(this.f163899a);
            }
            return this.f163900b;
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

        InterfaceC17371d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC17371d) Class.forName(str2).asSubclass(InterfaceC17371d.class).getDeclaredConstructor(null).newInstance(null);
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
            this.f163899a = context;
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

    C17378k(Context context, C17376i c17376i) {
        this(new a(context), c17376i);
    }

    @Override // uc.InterfaceC17372e
    public synchronized InterfaceC17380m a(String str) {
        if (this.f163898c.containsKey(str)) {
            return this.f163898c.get(str);
        }
        InterfaceC17371d interfaceC17371dB = this.f163896a.b(str);
        if (interfaceC17371dB == null) {
            return null;
        }
        InterfaceC17380m interfaceC17380mCreate = interfaceC17371dB.create(this.f163897b.a(str));
        this.f163898c.put(str, interfaceC17380mCreate);
        return interfaceC17380mCreate;
    }

    C17378k(a aVar, C17376i c17376i) {
        this.f163898c = new HashMap();
        this.f163896a = aVar;
        this.f163897b = c17376i;
    }
}
