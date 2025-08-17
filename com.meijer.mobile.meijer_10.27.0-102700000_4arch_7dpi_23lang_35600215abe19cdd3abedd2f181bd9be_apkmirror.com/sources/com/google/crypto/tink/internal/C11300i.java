package com.google.crypto.tink.internal;

import Ue.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.Z;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.internal.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C11300i<P> implements Ie.k<P> {

    /* renamed from: a, reason: collision with root package name */
    final String f88204a;

    /* renamed from: b, reason: collision with root package name */
    final Class<P> f88205b;

    /* renamed from: c, reason: collision with root package name */
    final y.c f88206c;

    /* renamed from: d, reason: collision with root package name */
    final Z<? extends Q> f88207d;

    public static <P> Ie.k<P> e(String str, Class<P> cls, y.c cVar, Z<? extends Q> z10) {
        return new C11300i(str, cls, cVar, z10);
    }

    @Override // Ie.k
    public final Class<P> a() {
        return this.f88205b;
    }

    @Override // Ie.k
    public final String c() {
        return this.f88204a;
    }

    @Override // Ie.k
    public P d(AbstractC11312h abstractC11312h) throws GeneralSecurityException {
        return (P) t.c().b(w.c().f(G.b(this.f88204a, abstractC11312h, this.f88206c, Ue.I.RAW, null), Ie.i.a()), this.f88205b);
    }

    C11300i(String str, Class<P> cls, y.c cVar, Z<? extends Q> z10) {
        this.f88207d = z10;
        this.f88204a = str;
        this.f88205b = cls;
        this.f88206c = cVar;
    }

    @Override // Ie.k
    public final Ue.y b(AbstractC11312h abstractC11312h) throws GeneralSecurityException {
        G g10 = (G) w.c().n(p.f().c(w.c().h(H.b(Ue.A.f0().y(this.f88204a).z(abstractC11312h).x(Ue.I.RAW).build())), null), G.class, Ie.i.a());
        return Ue.y.f0().y(g10.f()).z(g10.g()).x(g10.d()).build();
    }
}
