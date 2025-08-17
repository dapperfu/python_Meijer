package n6;

import androidx.collection.LruCache;
import g6.C14209i;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f151049b = new g();

    /* renamed from: a, reason: collision with root package name */
    private final LruCache<String, C14209i> f151050a = new LruCache<>(20);

    public static g b() {
        return f151049b;
    }

    public C14209i a(String str) {
        if (str == null) {
            return null;
        }
        return this.f151050a.d(str);
    }

    public void c(String str, C14209i c14209i) {
        if (str == null) {
            return;
        }
        this.f151050a.f(str, c14209i);
    }

    g() {
    }
}
