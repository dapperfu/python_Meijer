package lb;

import android.content.Context;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class e<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final d<T> f149569a;

    /* renamed from: b, reason: collision with root package name */
    private final d<T> f149570b;

    private e(g<T> gVar, f<T> fVar) {
        this.f149569a = gVar;
        this.f149570b = fVar;
    }

    @Override // lb.d
    public final synchronized C15478a<T> a(String str) {
        C15478a<T> c15478aA;
        c15478aA = this.f149569a.a(str);
        if (c15478aA == null && (c15478aA = this.f149570b.a(str)) != null) {
            this.f149569a.a(str, c15478aA);
        }
        return c15478aA;
    }

    @Override // lb.d
    public final synchronized void b() {
        this.f149569a.b();
        this.f149570b.b();
    }

    @Override // lb.d
    public final Collection<C15478a<T>> c() {
        Collection<C15478a<T>> collectionC = this.f149569a.c();
        if (collectionC != null && collectionC.size() != 0) {
            return collectionC;
        }
        Collection<C15478a<T>> collectionC2 = this.f149570b.c();
        if (collectionC2 != null && collectionC2.size() > 0) {
            for (C15478a<T> c15478a : collectionC2) {
                this.f149569a.a(c15478a.e(), c15478a);
            }
        }
        return collectionC2;
    }

    public e(Context context, String str, Class<T> cls) {
        this(new g(), new f(context, str, cls));
    }

    @Override // lb.d
    public final synchronized void b(String str) {
        this.f149569a.b(str);
        this.f149570b.b(str);
    }

    @Override // lb.d
    public final synchronized void a(String str, C15478a<T> c15478a) {
        try {
            if (this.f149569a.a() > 0) {
                this.f149569a.a(str, c15478a);
            }
            this.f149570b.a(str, c15478a);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // lb.d
    public final synchronized int a() {
        int iA;
        iA = this.f149569a.a();
        if (iA == 0) {
            iA = this.f149570b.a();
        }
        return iA;
    }
}
