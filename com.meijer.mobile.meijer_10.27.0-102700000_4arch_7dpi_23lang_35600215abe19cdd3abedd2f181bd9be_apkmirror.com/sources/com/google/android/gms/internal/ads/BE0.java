package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class BE0 implements InterfaceC9374sF0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9664v0 f65488a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC9130q0 f65489b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC9236r0 f65490c;

    public BE0(InterfaceC9664v0 interfaceC9664v0) {
        this.f65488a = interfaceC9664v0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9374sF0
    public final long zzb() {
        InterfaceC9236r0 interfaceC9236r0 = this.f65490c;
        if (interfaceC9236r0 != null) {
            return interfaceC9236r0.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9374sF0
    public final void zze() {
        if (this.f65489b != null) {
            this.f65489b = null;
        }
        this.f65490c = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9374sF0
    public final void a(long j10, long j11) {
        InterfaceC9130q0 interfaceC9130q0 = this.f65489b;
        interfaceC9130q0.getClass();
        interfaceC9130q0.a(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9374sF0
    public final void b(InterfaceC9685vA0 interfaceC9685vA0, Uri uri, Map map, long j10, long j11, InterfaceC9450t0 interfaceC9450t0) throws IOException {
        C7955f0 c7955f0 = new C7955f0(interfaceC9685vA0, j10, j11);
        this.f65490c = c7955f0;
        if (this.f65489b != null) {
            return;
        }
        InterfaceC9130q0[] interfaceC9130q0ArrA = this.f65488a.a(uri, map);
        int length = interfaceC9130q0ArrA.length;
        C7598bh0 c7598bh0O = AbstractC7917eh0.o(length);
        if (length == 1) {
            this.f65489b = interfaceC9130q0ArrA[0];
        } else {
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                InterfaceC9130q0 interfaceC9130q0 = interfaceC9130q0ArrA[i10];
                try {
                } catch (EOFException unused) {
                    if (this.f65489b != null || c7955f0.zzf() == j10) {
                    }
                } catch (Throwable th2) {
                    C8086gC.f(this.f65489b != null || c7955f0.zzf() == j10);
                    c7955f0.zzj();
                    throw th2;
                }
                if (interfaceC9130q0.c(c7955f0)) {
                    this.f65489b = interfaceC9130q0;
                    C8086gC.f(true);
                    c7955f0.zzj();
                    break;
                } else {
                    c7598bh0O.i(interfaceC9130q0.zzd());
                    boolean z10 = this.f65489b != null || c7955f0.zzf() == j10;
                    C8086gC.f(z10);
                    c7955f0.zzj();
                    i10++;
                }
            }
            if (this.f65489b == null) {
                Iterator it = C9733vh0.b(AbstractC7917eh0.s(interfaceC9130q0ArrA), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.AE0
                    @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                    public final Object apply(Object obj) {
                        InterfaceC9130q0 interfaceC9130q02 = (InterfaceC9130q0) obj;
                        interfaceC9130q02.zzc();
                        return interfaceC9130q02.getClass().getSimpleName();
                    }
                }).iterator();
                StringBuilder sb2 = new StringBuilder();
                C9729vf0.c(sb2, it, ", ");
                throw new zzwk("None of the available extractors (" + sb2.toString() + ") could read the stream.", uri, c7598bh0O.j());
            }
        }
        this.f65489b.d(interfaceC9450t0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9374sF0
    public final int c(N0 n02) throws IOException {
        InterfaceC9130q0 interfaceC9130q0 = this.f65489b;
        interfaceC9130q0.getClass();
        InterfaceC9236r0 interfaceC9236r0 = this.f65490c;
        interfaceC9236r0.getClass();
        return interfaceC9130q0.b(interfaceC9236r0, n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9374sF0
    public final void zzc() {
        InterfaceC9130q0 interfaceC9130q0 = this.f65489b;
        if (interfaceC9130q0 != null && (interfaceC9130q0 instanceof Z2)) {
            ((Z2) interfaceC9130q0).e();
        }
    }
}
