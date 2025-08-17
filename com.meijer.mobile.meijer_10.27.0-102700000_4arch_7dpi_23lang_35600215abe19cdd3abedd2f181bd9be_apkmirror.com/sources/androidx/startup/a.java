package androidx.startup;

import D4.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f58700d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f58701e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f58704c;

    /* renamed from: b, reason: collision with root package name */
    final Set<Class<? extends D4.a<?>>> f58703b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map<Class<?>, Object> f58702a = new HashMap();

    public static a e(Context context) {
        if (f58700d == null) {
            synchronized (f58701e) {
                try {
                    if (f58700d == null) {
                        f58700d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f58700d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void a(Bundle bundle) throws ClassNotFoundException {
        String string = this.f58704c.getString(b.f5031a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (D4.a.class.isAssignableFrom(cls)) {
                            this.f58703b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends D4.a<?>>> it = this.f58703b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    void b(Class<? extends InitializationProvider> cls) {
        try {
            try {
                G4.a.c("Startup");
                a(this.f58704c.getPackageManager().getProviderInfo(new ComponentName(this.f58704c, cls), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new StartupException(e10);
            }
        } finally {
            G4.a.f();
        }
    }

    <T> T c(Class<? extends D4.a<?>> cls) {
        T t10;
        synchronized (f58701e) {
            try {
                t10 = (T) this.f58702a.get(cls);
                if (t10 == null) {
                    t10 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public boolean g(Class<? extends D4.a<?>> cls) {
        return this.f58703b.contains(cls);
    }

    a(Context context) {
        this.f58704c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends D4.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (G4.a.h()) {
            try {
                G4.a.c(cls.getSimpleName());
            } catch (Throwable th2) {
                G4.a.f();
                throw th2;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f58702a.containsKey(cls)) {
                set.add(cls);
                try {
                    D4.a<?> aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class<? extends D4.a<?>>> listB = aVarNewInstance.b();
                    if (!listB.isEmpty()) {
                        for (Class<? extends D4.a<?>> cls2 : listB) {
                            if (!this.f58702a.containsKey(cls2)) {
                                d(cls2, set);
                            }
                        }
                    }
                    t10 = (T) aVarNewInstance.a(this.f58704c);
                    set.remove(cls);
                    this.f58702a.put(cls, t10);
                } catch (Throwable th3) {
                    throw new StartupException(th3);
                }
            } else {
                t10 = (T) this.f58702a.get(cls);
            }
            G4.a.f();
            return t10;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    public <T> T f(Class<? extends D4.a<T>> cls) {
        return (T) c(cls);
    }
}
