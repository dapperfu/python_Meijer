package com.google.android.gms.internal.pal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.pal.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10754k1 implements InterfaceC10881s1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10690g1 f83203a;

    /* renamed from: b, reason: collision with root package name */
    private final J1 f83204b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f83205c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC10849q0 f83206d;

    @Override // com.google.android.gms.internal.pal.InterfaceC10881s1
    public final void a(Object obj, byte[] bArr, int i10, int i11, N n10) throws IOException {
        B0 b02 = (B0) obj;
        if (b02.zzc == K1.c()) {
            b02.zzc = K1.e();
        }
        throw null;
    }

    static C10754k1 d(J1 j12, AbstractC10849q0 abstractC10849q0, InterfaceC10690g1 interfaceC10690g1) {
        return new C10754k1(j12, abstractC10849q0, interfaceC10690g1);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10881s1
    public final void b(Object obj, InterfaceC10624c2 interfaceC10624c2) throws IOException {
        this.f83206d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10881s1
    public final void c(Object obj, InterfaceC10865r1 interfaceC10865r1, C10833p0 c10833p0) throws IOException {
        boolean zC;
        J1 j12 = this.f83204b;
        AbstractC10849q0 abstractC10849q0 = this.f83206d;
        Object objC = j12.c(obj);
        C10912u0 c10912u0B = abstractC10849q0.b(obj);
        while (interfaceC10865r1.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = interfaceC10865r1.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objC2 = abstractC10849q0.c(c10833p0, this.f83203a, iZzd >>> 3);
                        if (objC2 != null) {
                            abstractC10849q0.f(interfaceC10865r1, objC2, c10833p0, c10912u0B);
                        } else {
                            zC = j12.q(objC, interfaceC10865r1);
                        }
                    } else {
                        zC = interfaceC10865r1.c();
                    }
                    if (!zC) {
                        j12.n(obj, objC);
                        return;
                    }
                } else {
                    Object objC3 = null;
                    int iZzj = 0;
                    AbstractC10605b0 abstractC10605b0Zzp = null;
                    while (interfaceC10865r1.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = interfaceC10865r1.zzd();
                        if (iZzd2 == 16) {
                            iZzj = interfaceC10865r1.zzj();
                            objC3 = abstractC10849q0.c(c10833p0, this.f83203a, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objC3 != null) {
                                abstractC10849q0.f(interfaceC10865r1, objC3, c10833p0, c10912u0B);
                            } else {
                                abstractC10605b0Zzp = interfaceC10865r1.zzp();
                            }
                        } else if (!interfaceC10865r1.c()) {
                            break;
                        }
                    }
                    if (interfaceC10865r1.zzd() != 12) {
                        throw zzadi.b();
                    }
                    if (abstractC10605b0Zzp != null) {
                        if (objC3 != null) {
                            abstractC10849q0.g(abstractC10605b0Zzp, objC3, c10833p0, c10912u0B);
                        } else {
                            j12.k(objC, iZzj, abstractC10605b0Zzp);
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

    @Override // com.google.android.gms.internal.pal.InterfaceC10881s1
    public final int zza(Object obj) {
        J1 j12 = this.f83204b;
        int iB = j12.b(j12.d(obj));
        if (!this.f83205c) {
            return iB;
        }
        this.f83206d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10881s1
    public final int zzb(Object obj) {
        int iHashCode = this.f83204b.d(obj).hashCode();
        if (!this.f83205c) {
            return iHashCode;
        }
        this.f83206d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10881s1
    public final Object zze() {
        return this.f83203a.F().B();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10881s1
    public final void zzf(Object obj) {
        this.f83204b.m(obj);
        this.f83206d.e(obj);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10881s1
    public final void zzg(Object obj, Object obj2) {
        C10913u1.f(this.f83204b, obj, obj2);
        if (this.f83205c) {
            C10913u1.e(this.f83206d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10881s1
    public final boolean zzk(Object obj, Object obj2) {
        if (!this.f83204b.d(obj).equals(this.f83204b.d(obj2))) {
            return false;
        }
        if (!this.f83205c) {
            return true;
        }
        this.f83206d.a(obj);
        this.f83206d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10881s1
    public final boolean zzl(Object obj) {
        this.f83206d.a(obj);
        throw null;
    }

    private C10754k1(J1 j12, AbstractC10849q0 abstractC10849q0, InterfaceC10690g1 interfaceC10690g1) {
        this.f83204b = j12;
        this.f83205c = abstractC10849q0.h(interfaceC10690g1);
        this.f83206d = abstractC10849q0;
        this.f83203a = interfaceC10690g1;
    }
}
