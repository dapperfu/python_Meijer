package com.google.crypto.tink.internal;

import We.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.Z;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.internal.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C11425i<P> implements Ke.k<P> {

    /* renamed from: a, reason: collision with root package name */
    final String f89044a;

    /* renamed from: b, reason: collision with root package name */
    final Class<P> f89045b;

    /* renamed from: c, reason: collision with root package name */
    final y.c f89046c;

    /* renamed from: d, reason: collision with root package name */
    final Z<? extends Q> f89047d;

    public static <P> Ke.k<P> e(String str, Class<P> cls, y.c cVar, Z<? extends Q> z10) {
        return new C11425i(str, cls, cVar, z10);
    }

    @Override // Ke.k
    public final Class<P> a() {
        return this.f89045b;
    }

    @Override // Ke.k
    public final String c() {
        return this.f89044a;
    }

    @Override // Ke.k
    public P d(AbstractC11437h abstractC11437h) throws GeneralSecurityException {
        return (P) t.c().b(w.c().f(G.b(this.f89044a, abstractC11437h, this.f89046c, We.I.RAW, null), Ke.i.a()), this.f89045b);
    }

    C11425i(String str, Class<P> cls, y.c cVar, Z<? extends Q> z10) {
        this.f89047d = z10;
        this.f89044a = str;
        this.f89045b = cls;
        this.f89046c = cVar;
    }

    @Override // Ke.k
    public final We.y b(AbstractC11437h abstractC11437h) throws GeneralSecurityException {
        G g10 = (G) w.c().n(p.f().c(w.c().h(H.b(We.A.f0().y(this.f89044a).z(abstractC11437h).x(We.I.RAW).build())), null), G.class, Ke.i.a());
        return We.y.f0().y(g10.f()).z(g10.g()).x(g10.d()).build();
    }
}
