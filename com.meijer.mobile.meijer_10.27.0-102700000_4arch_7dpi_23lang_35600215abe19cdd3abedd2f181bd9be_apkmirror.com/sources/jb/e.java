package jb;

import android.content.Context;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class e<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final d<T> f139555a;

    /* renamed from: b, reason: collision with root package name */
    private final d<T> f139556b;

    private e(g<T> gVar, f<T> fVar) {
        this.f139555a = gVar;
        this.f139556b = fVar;
    }

    @Override // jb.d
    public final synchronized C14879a<T> a(String str) {
        C14879a<T> c14879aA;
        c14879aA = this.f139555a.a(str);
        if (c14879aA == null && (c14879aA = this.f139556b.a(str)) != null) {
            this.f139555a.a(str, c14879aA);
        }
        return c14879aA;
    }

    @Override // jb.d
    public final synchronized void b() {
        this.f139555a.b();
        this.f139556b.b();
    }

    @Override // jb.d
    public final Collection<C14879a<T>> c() {
        Collection<C14879a<T>> collectionC = this.f139555a.c();
        if (collectionC != null && collectionC.size() != 0) {
            return collectionC;
        }
        Collection<C14879a<T>> collectionC2 = this.f139556b.c();
        if (collectionC2 != null && collectionC2.size() > 0) {
            for (C14879a<T> c14879a : collectionC2) {
                this.f139555a.a(c14879a.e(), c14879a);
            }
        }
        return collectionC2;
    }

    public e(Context context, String str, Class<T> cls) {
        this(new g(), new f(context, str, cls));
    }

    @Override // jb.d
    public final synchronized void b(String str) {
        this.f139555a.b(str);
        this.f139556b.b(str);
    }

    @Override // jb.d
    public final synchronized void a(String str, C14879a<T> c14879a) {
        try {
            if (this.f139555a.a() > 0) {
                this.f139555a.a(str, c14879a);
            }
            this.f139556b.a(str, c14879a);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // jb.d
    public final synchronized int a() {
        int iA;
        iA = this.f139555a.a();
        if (iA == 0) {
            iA = this.f139556b.a();
        }
        return iA;
    }
}
