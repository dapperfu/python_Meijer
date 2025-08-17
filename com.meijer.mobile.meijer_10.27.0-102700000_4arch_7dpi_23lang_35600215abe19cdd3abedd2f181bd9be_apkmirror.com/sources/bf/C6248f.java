package bf;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.fullstory.FS;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bf.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6248f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f60166a;

    /* renamed from: b, reason: collision with root package name */
    private final c<T> f60167b;

    /* renamed from: bf.f$b */
    private static class b implements c<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends Service> f60168a;

        private b(Class<? extends Service> cls) {
            this.f60168a = cls;
        }

        private Bundle b(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    FS.log_w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f60168a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                FS.log_w("ComponentDiscovery", this.f60168a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                FS.log_w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // bf.C6248f.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                FS.log_w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: bf.f$c */
    interface c<T> {
        List<String> a(T t10);
    }

    public static C6248f<Context> c(Context context, Class<? extends Service> cls) {
        return new C6248f<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar d(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            FS.log_w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e13);
        }
    }

    public List<If.b<ComponentRegistrar>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f60167b.a(this.f60166a)) {
            arrayList.add(new If.b() { // from class: bf.e
                @Override // If.b
                public final Object get() {
                    return C6248f.d(str);
                }
            });
        }
        return arrayList;
    }

    C6248f(T t10, c<T> cVar) {
        this.f60166a = t10;
        this.f60167b = cVar;
    }
}
