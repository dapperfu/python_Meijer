package Db;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    protected Map<String, Object> f6094a = new ConcurrentHashMap();

    public <T> T c(String str, Class<T> cls) {
        throw null;
    }

    protected void e(String str, Object obj) throws IOException {
        throw null;
    }

    public final <T> T a(String str, Class<T> cls) {
        T t10 = (T) this.f6094a.get(str);
        if (t10 == null) {
            return (T) c(str, cls);
        }
        if (cls.isAssignableFrom(t10.getClass())) {
            return t10;
        }
        throw new IllegalStateException(t10.getClass().getName() + " is not " + cls.getName());
    }

    protected final void d(String str, Object obj) {
        if (obj == null) {
            this.f6094a.remove(str);
        } else {
            this.f6094a.put(str, obj);
        }
    }

    public final void b(String str, Object obj) throws IOException {
        d(str, obj);
        e(str, obj);
    }
}
