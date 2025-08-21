package o6;

import androidx.collection.LruCache;
import h6.C14478i;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f153651b = new g();

    /* renamed from: a, reason: collision with root package name */
    private final LruCache<String, C14478i> f153652a = new LruCache<>(20);

    public static g b() {
        return f153651b;
    }

    public C14478i a(String str) {
        if (str == null) {
            return null;
        }
        return this.f153652a.d(str);
    }

    public void c(String str, C14478i c14478i) {
        if (str == null) {
            return;
        }
        this.f153652a.f(str, c14478i);
    }

    g() {
    }
}
