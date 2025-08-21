package androidx.startup;

import E4.b;
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
    private static volatile a f58886d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f58887e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f58890c;

    /* renamed from: b, reason: collision with root package name */
    final Set<Class<? extends E4.a<?>>> f58889b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map<Class<?>, Object> f58888a = new HashMap();

    public static a e(Context context) {
        if (f58886d == null) {
            synchronized (f58887e) {
                try {
                    if (f58886d == null) {
                        f58886d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f58886d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void a(Bundle bundle) throws ClassNotFoundException {
        String string = this.f58890c.getString(b.f7017a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (E4.a.class.isAssignableFrom(cls)) {
                            this.f58889b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends E4.a<?>>> it = this.f58889b.iterator();
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
                H4.a.c("Startup");
                a(this.f58890c.getPackageManager().getProviderInfo(new ComponentName(this.f58890c, cls), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new StartupException(e10);
            }
        } finally {
            H4.a.f();
        }
    }

    <T> T c(Class<? extends E4.a<?>> cls) {
        T t10;
        synchronized (f58887e) {
            try {
                t10 = (T) this.f58888a.get(cls);
                if (t10 == null) {
                    t10 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public boolean g(Class<? extends E4.a<?>> cls) {
        return this.f58889b.contains(cls);
    }

    a(Context context) {
        this.f58890c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends E4.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (H4.a.h()) {
            try {
                H4.a.c(cls.getSimpleName());
            } catch (Throwable th2) {
                H4.a.f();
                throw th2;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f58888a.containsKey(cls)) {
                set.add(cls);
                try {
                    E4.a<?> aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class<? extends E4.a<?>>> listB = aVarNewInstance.b();
                    if (!listB.isEmpty()) {
                        for (Class<? extends E4.a<?>> cls2 : listB) {
                            if (!this.f58888a.containsKey(cls2)) {
                                d(cls2, set);
                            }
                        }
                    }
                    t10 = (T) aVarNewInstance.a(this.f58890c);
                    set.remove(cls);
                    this.f58888a.put(cls, t10);
                } catch (Throwable th3) {
                    throw new StartupException(th3);
                }
            } else {
                t10 = (T) this.f58888a.get(cls);
            }
            H4.a.f();
            return t10;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    public <T> T f(Class<? extends E4.a<T>> cls) {
        return (T) c(cls);
    }
}
