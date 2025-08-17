package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class C1<T> implements O1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC11083w1 f84286a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC11030f2<?, ?> f84287b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f84288c;

    /* renamed from: d, reason: collision with root package name */
    private final C0<?> f84289d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2 A[EDGE_INSN: B:61:0x00c2->B:33:0x00c2 BREAK  A[LOOP:1: B:17:0x0069->B:64:0x0069], SYNTHETIC] */
    @Override // com.google.android.gms.internal.vision.O1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(T r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.vision.C11020d0 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C1.d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.d0):void");
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final T zza() {
        return (T) this.f84286a.zzq().zze();
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final void zzb(T t10, T t11) {
        P1.o(this.f84287b, t10, t11);
        if (this.f84288c) {
            P1.m(this.f84289d, t10, t11);
        }
    }

    static <T> C1<T> e(AbstractC11030f2<?, ?> abstractC11030f2, C0<?> c02, InterfaceC11083w1 interfaceC11083w1) {
        return new C1<>(abstractC11030f2, c02, interfaceC11083w1);
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final boolean a(T t10) {
        return this.f84289d.b(t10).r();
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final boolean b(T t10, T t11) {
        if (!this.f84287b.f(t10).equals(this.f84287b.f(t11))) {
            return false;
        }
        if (this.f84288c) {
            return this.f84289d.b(t10).equals(this.f84289d.b(t11));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final void c(T t10, C2 c22) throws IOException {
        Iterator itO = this.f84289d.b(t10).o();
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            I0 i02 = (I0) entry.getKey();
            if (i02.zzc() != z2.MESSAGE || i02.zzd() || i02.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C11017c1) {
                c22.h(i02.zza(), ((C11017c1) entry).a().d());
            } else {
                c22.h(i02.zza(), entry.getValue());
            }
        }
        AbstractC11030f2<?, ?> abstractC11030f2 = this.f84287b;
        abstractC11030f2.g(abstractC11030f2.f(t10), c22);
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final int zza(T t10) {
        int iHashCode = this.f84287b.f(t10).hashCode();
        return this.f84288c ? (iHashCode * 53) + this.f84289d.b(t10).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final void zzc(T t10) {
        this.f84287b.j(t10);
        this.f84289d.g(t10);
    }

    private C1(AbstractC11030f2<?, ?> abstractC11030f2, C0<?> c02, InterfaceC11083w1 interfaceC11083w1) {
        this.f84287b = abstractC11030f2;
        this.f84288c = c02.e(interfaceC11083w1);
        this.f84289d = c02;
        this.f84286a = interfaceC11083w1;
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final int zzb(T t10) {
        AbstractC11030f2<?, ?> abstractC11030f2 = this.f84287b;
        int iK = abstractC11030f2.k(abstractC11030f2.f(t10));
        return this.f84288c ? iK + this.f84289d.b(t10).s() : iK;
    }
}
