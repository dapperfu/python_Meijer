package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class BE0 implements InterfaceC9499sF0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9789v0 f66328a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC9255q0 f66329b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC9361r0 f66330c;

    public BE0(InterfaceC9789v0 interfaceC9789v0) {
        this.f66328a = interfaceC9789v0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9499sF0
    public final long zzb() {
        InterfaceC9361r0 interfaceC9361r0 = this.f66330c;
        if (interfaceC9361r0 != null) {
            return interfaceC9361r0.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9499sF0
    public final void zze() {
        if (this.f66329b != null) {
            this.f66329b = null;
        }
        this.f66330c = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9499sF0
    public final void a(long j10, long j11) {
        InterfaceC9255q0 interfaceC9255q0 = this.f66329b;
        interfaceC9255q0.getClass();
        interfaceC9255q0.a(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9499sF0
    public final void b(InterfaceC9810vA0 interfaceC9810vA0, Uri uri, Map map, long j10, long j11, InterfaceC9575t0 interfaceC9575t0) throws IOException {
        C8080f0 c8080f0 = new C8080f0(interfaceC9810vA0, j10, j11);
        this.f66330c = c8080f0;
        if (this.f66329b != null) {
            return;
        }
        InterfaceC9255q0[] interfaceC9255q0ArrA = this.f66328a.a(uri, map);
        int length = interfaceC9255q0ArrA.length;
        C7723bh0 c7723bh0O = AbstractC8042eh0.o(length);
        if (length == 1) {
            this.f66329b = interfaceC9255q0ArrA[0];
        } else {
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                InterfaceC9255q0 interfaceC9255q0 = interfaceC9255q0ArrA[i10];
                try {
                } catch (EOFException unused) {
                    if (this.f66329b != null || c8080f0.zzf() == j10) {
                    }
                } catch (Throwable th2) {
                    C8211gC.f(this.f66329b != null || c8080f0.zzf() == j10);
                    c8080f0.zzj();
                    throw th2;
                }
                if (interfaceC9255q0.c(c8080f0)) {
                    this.f66329b = interfaceC9255q0;
                    C8211gC.f(true);
                    c8080f0.zzj();
                    break;
                } else {
                    c7723bh0O.i(interfaceC9255q0.zzd());
                    boolean z10 = this.f66329b != null || c8080f0.zzf() == j10;
                    C8211gC.f(z10);
                    c8080f0.zzj();
                    i10++;
                }
            }
            if (this.f66329b == null) {
                Iterator it = C9858vh0.b(AbstractC8042eh0.s(interfaceC9255q0ArrA), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.AE0
                    @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                    public final Object apply(Object obj) {
                        InterfaceC9255q0 interfaceC9255q02 = (InterfaceC9255q0) obj;
                        interfaceC9255q02.zzc();
                        return interfaceC9255q02.getClass().getSimpleName();
                    }
                }).iterator();
                StringBuilder sb2 = new StringBuilder();
                C9854vf0.c(sb2, it, ", ");
                throw new zzwk("None of the available extractors (" + sb2.toString() + ") could read the stream.", uri, c7723bh0O.j());
            }
        }
        this.f66329b.d(interfaceC9575t0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9499sF0
    public final int c(N0 n02) throws IOException {
        InterfaceC9255q0 interfaceC9255q0 = this.f66329b;
        interfaceC9255q0.getClass();
        InterfaceC9361r0 interfaceC9361r0 = this.f66330c;
        interfaceC9361r0.getClass();
        return interfaceC9255q0.b(interfaceC9361r0, n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9499sF0
    public final void zzc() {
        InterfaceC9255q0 interfaceC9255q0 = this.f66329b;
        if (interfaceC9255q0 != null && (interfaceC9255q0 instanceof Z2)) {
            ((Z2) interfaceC9255q0).e();
        }
    }
}
