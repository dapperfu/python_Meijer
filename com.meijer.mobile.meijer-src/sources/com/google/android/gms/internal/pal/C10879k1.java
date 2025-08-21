package com.google.android.gms.internal.pal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.pal.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10879k1 implements InterfaceC11006s1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10815g1 f84043a;

    /* renamed from: b, reason: collision with root package name */
    private final J1 f84044b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f84045c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC10974q0 f84046d;

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final void a(Object obj, byte[] bArr, int i10, int i11, N n10) throws IOException {
        B0 b02 = (B0) obj;
        if (b02.zzc == K1.c()) {
            b02.zzc = K1.e();
        }
        throw null;
    }

    static C10879k1 d(J1 j12, AbstractC10974q0 abstractC10974q0, InterfaceC10815g1 interfaceC10815g1) {
        return new C10879k1(j12, abstractC10974q0, interfaceC10815g1);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final void b(Object obj, InterfaceC10749c2 interfaceC10749c2) throws IOException {
        this.f84046d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final void c(Object obj, InterfaceC10990r1 interfaceC10990r1, C10958p0 c10958p0) throws IOException {
        boolean zC;
        J1 j12 = this.f84044b;
        AbstractC10974q0 abstractC10974q0 = this.f84046d;
        Object objC = j12.c(obj);
        C11037u0 c11037u0B = abstractC10974q0.b(obj);
        while (interfaceC10990r1.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = interfaceC10990r1.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objC2 = abstractC10974q0.c(c10958p0, this.f84043a, iZzd >>> 3);
                        if (objC2 != null) {
                            abstractC10974q0.f(interfaceC10990r1, objC2, c10958p0, c11037u0B);
                        } else {
                            zC = j12.q(objC, interfaceC10990r1);
                        }
                    } else {
                        zC = interfaceC10990r1.c();
                    }
                    if (!zC) {
                        j12.n(obj, objC);
                        return;
                    }
                } else {
                    Object objC3 = null;
                    int iZzj = 0;
                    AbstractC10730b0 abstractC10730b0Zzp = null;
                    while (interfaceC10990r1.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = interfaceC10990r1.zzd();
                        if (iZzd2 == 16) {
                            iZzj = interfaceC10990r1.zzj();
                            objC3 = abstractC10974q0.c(c10958p0, this.f84043a, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objC3 != null) {
                                abstractC10974q0.f(interfaceC10990r1, objC3, c10958p0, c11037u0B);
                            } else {
                                abstractC10730b0Zzp = interfaceC10990r1.zzp();
                            }
                        } else if (!interfaceC10990r1.c()) {
                            break;
                        }
                    }
                    if (interfaceC10990r1.zzd() != 12) {
                        throw zzadi.b();
                    }
                    if (abstractC10730b0Zzp != null) {
                        if (objC3 != null) {
                            abstractC10974q0.g(abstractC10730b0Zzp, objC3, c10958p0, c11037u0B);
                        } else {
                            j12.k(objC, iZzj, abstractC10730b0Zzp);
                        }
                    }
                }
            } catch (Throwable th2) {
                j12.n(obj, objC);
                throw th2;
            }
        }
        j12.n(obj, objC);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final int zza(Object obj) {
        J1 j12 = this.f84044b;
        int iB = j12.b(j12.d(obj));
        if (!this.f84045c) {
            return iB;
        }
        this.f84046d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final int zzb(Object obj) {
        int iHashCode = this.f84044b.d(obj).hashCode();
        if (!this.f84045c) {
            return iHashCode;
        }
        this.f84046d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final Object zze() {
        return this.f84043a.F().B();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final void zzf(Object obj) {
        this.f84044b.m(obj);
        this.f84046d.e(obj);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final void zzg(Object obj, Object obj2) {
        C11038u1.f(this.f84044b, obj, obj2);
        if (this.f84045c) {
            C11038u1.e(this.f84046d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final boolean zzk(Object obj, Object obj2) {
        if (!this.f84044b.d(obj).equals(this.f84044b.d(obj2))) {
            return false;
        }
        if (!this.f84045c) {
            return true;
        }
        this.f84046d.a(obj);
        this.f84046d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final boolean zzl(Object obj) {
        this.f84046d.a(obj);
        throw null;
    }

    private C10879k1(J1 j12, AbstractC10974q0 abstractC10974q0, InterfaceC10815g1 interfaceC10815g1) {
        this.f84044b = j12;
        this.f84045c = abstractC10974q0.h(interfaceC10815g1);
        this.f84046d = abstractC10974q0;
        this.f84043a = interfaceC10815g1;
    }
}
