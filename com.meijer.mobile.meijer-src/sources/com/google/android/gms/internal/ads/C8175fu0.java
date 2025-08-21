package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8175fu0 implements Bv0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8068eu0 f75028a;

    /* renamed from: b, reason: collision with root package name */
    private int f75029b;

    /* renamed from: c, reason: collision with root package name */
    private int f75030c;

    /* renamed from: d, reason: collision with root package name */
    private int f75031d = 0;

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void a(Object obj, Hv0 hv0, C9350qu0 c9350qu0) throws IOException {
        i(2);
        g(obj, hv0, c9350qu0);
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void b(Object obj, Hv0 hv0, C9350qu0 c9350qu0) throws IOException {
        i(3);
        f(obj, hv0, c9350qu0);
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final boolean zzN() throws IOException {
        i(0);
        return this.f75028a.b();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final double zza() throws IOException {
        i(1);
        return this.f75028a.g();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final float zzb() throws IOException {
        i(5);
        return this.f75028a.h();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzd() {
        return this.f75029b;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zze() throws IOException {
        i(0);
        return this.f75028a.k();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzf() throws IOException {
        i(5);
        return this.f75028a.l();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzg() throws IOException {
        i(0);
        return this.f75028a.m();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzh() throws IOException {
        i(5);
        return this.f75028a.n();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzi() throws IOException {
        i(0);
        return this.f75028a.o();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzj() throws IOException {
        i(0);
        return this.f75028a.q();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final long zzk() throws IOException {
        i(1);
        return this.f75028a.r();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final long zzl() throws IOException {
        i(0);
        return this.f75028a.s();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final long zzm() throws IOException {
        i(1);
        return this.f75028a.t();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final long zzn() throws IOException {
        i(0);
        return this.f75028a.u();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final long zzo() throws IOException {
        i(0);
        return this.f75028a.v();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final Zt0 zzp() throws IOException {
        i(2);
        return this.f75028a.w();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final String zzr() throws IOException {
        i(2);
        return this.f75028a.x();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final String zzs() throws IOException {
        i(2);
        return this.f75028a.y();
    }

    private final void f(Object obj, Hv0 hv0, C9350qu0 c9350qu0) throws IOException {
        int i10 = this.f75030c;
        this.f75030c = ((this.f75029b >>> 3) << 3) | 4;
        try {
            hv0.b(obj, this, c9350qu0);
            if (this.f75029b == this.f75030c) {
            } else {
                throw new zzgyg("Failed to parse the message.");
            }
        } finally {
            this.f75030c = i10;
        }
    }

    private final void g(Object obj, Hv0 hv0, C9350qu0 c9350qu0) throws IOException {
        AbstractC8068eu0 abstractC8068eu0 = this.f75028a;
        int iQ = abstractC8068eu0.q();
        if (abstractC8068eu0.f74786a >= abstractC8068eu0.f74787b) {
            throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = abstractC8068eu0.j(iQ);
        this.f75028a.f74786a++;
        hv0.b(obj, this, c9350qu0);
        this.f75028a.z(0);
        r5.f74786a--;
        this.f75028a.A(iJ);
    }

    private final void h(int i10) throws IOException {
        if (this.f75028a.i() != i10) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void i(int i10) throws IOException {
        if ((this.f75029b & 7) != i10) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
    }

    private static final void j(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw new zzgyg("Failed to parse the message.");
        }
    }

    private static final void k(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw new zzgyg("Failed to parse the message.");
        }
    }

    public static C8175fu0 l(AbstractC8068eu0 abstractC8068eu0) {
        C8175fu0 c8175fu0 = abstractC8068eu0.f74788c;
        return c8175fu0 != null ? c8175fu0 : new C8175fu0(abstractC8068eu0);
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    @Deprecated
    public final void c(List list, Hv0 hv0, C9350qu0 c9350qu0) throws IOException {
        int iP;
        int i10 = this.f75029b;
        if ((i10 & 7) != 3) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = hv0.zze();
            f(objZze, hv0, c9350qu0);
            hv0.zzf(objZze);
            list.add(objZze);
            if (this.f75028a.a() || this.f75031d != 0) {
                return;
            } else {
                iP = this.f75028a.p();
            }
        } while (iP == i10);
        this.f75031d = iP;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void d(List list, Hv0 hv0, C9350qu0 c9350qu0) throws IOException {
        int iP;
        int i10 = this.f75029b;
        if ((i10 & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = hv0.zze();
            g(objZze, hv0, c9350qu0);
            hv0.zzf(objZze);
            list.add(objZze);
            if (this.f75028a.a() || this.f75031d != 0) {
                return;
            } else {
                iP = this.f75028a.p();
            }
        } while (iP == i10);
        this.f75031d = iP;
    }

    public final void e(List list, boolean z10) throws IOException {
        int iP;
        int iP2;
        if ((this.f75029b & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof InterfaceC7751bv0) && !z10) {
            InterfaceC7751bv0 interfaceC7751bv0 = (InterfaceC7751bv0) list;
            do {
                zzp();
                interfaceC7751bv0.zzb();
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            do {
                list.add(z10 ? zzs() : zzr());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzA(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C8070ev0) {
            C8070ev0 c8070ev0 = (C8070ev0) list;
            int i10 = this.f75029b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ = this.f75028a.q();
                k(iQ);
                int i11 = iQ + this.f75028a.i();
                do {
                    c8070ev0.h(this.f75028a.r());
                } while (this.f75028a.i() < i11);
                return;
            }
            do {
                c8070ev0.h(this.f75028a.r());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ2 = this.f75028a.q();
                k(iQ2);
                int i13 = iQ2 + this.f75028a.i();
                do {
                    list.add(Long.valueOf(this.f75028a.r()));
                } while (this.f75028a.i() < i13);
                return;
            }
            do {
                list.add(Long.valueOf(this.f75028a.r()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzB(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C10098xu0) {
            C10098xu0 c10098xu0 = (C10098xu0) list;
            int i10 = this.f75029b & 7;
            if (i10 == 2) {
                int iQ = this.f75028a.q();
                j(iQ);
                int i11 = this.f75028a.i() + iQ;
                do {
                    c10098xu0.h(this.f75028a.h());
                } while (this.f75028a.i() < i11);
                return;
            }
            if (i10 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                c10098xu0.h(this.f75028a.h());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 == 2) {
                int iQ2 = this.f75028a.q();
                j(iQ2);
                int i13 = this.f75028a.i() + iQ2;
                do {
                    list.add(Float.valueOf(this.f75028a.h()));
                } while (this.f75028a.i() < i13);
                return;
            }
            if (i12 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.f75028a.h()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzD(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f75029b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu0 = this.f75028a;
                int i11 = abstractC8068eu0.i() + abstractC8068eu0.q();
                do {
                    hu0.zzi(this.f75028a.m());
                } while (this.f75028a.i() < i11);
                h(i11);
                return;
            }
            do {
                hu0.zzi(this.f75028a.m());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu02 = this.f75028a;
                int i13 = abstractC8068eu02.i() + abstractC8068eu02.q();
                do {
                    list.add(Integer.valueOf(this.f75028a.m()));
                } while (this.f75028a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f75028a.m()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzE(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C8070ev0) {
            C8070ev0 c8070ev0 = (C8070ev0) list;
            int i10 = this.f75029b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu0 = this.f75028a;
                int i11 = abstractC8068eu0.i() + abstractC8068eu0.q();
                do {
                    c8070ev0.h(this.f75028a.s());
                } while (this.f75028a.i() < i11);
                h(i11);
                return;
            }
            do {
                c8070ev0.h(this.f75028a.s());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu02 = this.f75028a;
                int i13 = abstractC8068eu02.i() + abstractC8068eu02.q();
                do {
                    list.add(Long.valueOf(this.f75028a.s()));
                } while (this.f75028a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Long.valueOf(this.f75028a.s()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzG(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f75029b & 7;
            if (i10 == 2) {
                int iQ = this.f75028a.q();
                j(iQ);
                int i11 = this.f75028a.i() + iQ;
                do {
                    hu0.zzi(this.f75028a.n());
                } while (this.f75028a.i() < i11);
                return;
            }
            if (i10 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                hu0.zzi(this.f75028a.n());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 == 2) {
                int iQ2 = this.f75028a.q();
                j(iQ2);
                int i13 = this.f75028a.i() + iQ2;
                do {
                    list.add(Integer.valueOf(this.f75028a.n()));
                } while (this.f75028a.i() < i13);
                return;
            }
            if (i12 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.f75028a.n()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzH(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C8070ev0) {
            C8070ev0 c8070ev0 = (C8070ev0) list;
            int i10 = this.f75029b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ = this.f75028a.q();
                k(iQ);
                int i11 = iQ + this.f75028a.i();
                do {
                    c8070ev0.h(this.f75028a.t());
                } while (this.f75028a.i() < i11);
                return;
            }
            do {
                c8070ev0.h(this.f75028a.t());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ2 = this.f75028a.q();
                k(iQ2);
                int i13 = iQ2 + this.f75028a.i();
                do {
                    list.add(Long.valueOf(this.f75028a.t()));
                } while (this.f75028a.i() < i13);
                return;
            }
            do {
                list.add(Long.valueOf(this.f75028a.t()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzI(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f75029b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu0 = this.f75028a;
                int i11 = abstractC8068eu0.i() + abstractC8068eu0.q();
                do {
                    hu0.zzi(this.f75028a.o());
                } while (this.f75028a.i() < i11);
                h(i11);
                return;
            }
            do {
                hu0.zzi(this.f75028a.o());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu02 = this.f75028a;
                int i13 = abstractC8068eu02.i() + abstractC8068eu02.q();
                do {
                    list.add(Integer.valueOf(this.f75028a.o()));
                } while (this.f75028a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f75028a.o()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzJ(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C8070ev0) {
            C8070ev0 c8070ev0 = (C8070ev0) list;
            int i10 = this.f75029b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu0 = this.f75028a;
                int i11 = abstractC8068eu0.i() + abstractC8068eu0.q();
                do {
                    c8070ev0.h(this.f75028a.u());
                } while (this.f75028a.i() < i11);
                h(i11);
                return;
            }
            do {
                c8070ev0.h(this.f75028a.u());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu02 = this.f75028a;
                int i13 = abstractC8068eu02.i() + abstractC8068eu02.q();
                do {
                    list.add(Long.valueOf(this.f75028a.u()));
                } while (this.f75028a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Long.valueOf(this.f75028a.u()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzL(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f75029b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu0 = this.f75028a;
                int i11 = abstractC8068eu0.i() + abstractC8068eu0.q();
                do {
                    hu0.zzi(this.f75028a.q());
                } while (this.f75028a.i() < i11);
                h(i11);
                return;
            }
            do {
                hu0.zzi(this.f75028a.q());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu02 = this.f75028a;
                int i13 = abstractC8068eu02.i() + abstractC8068eu02.q();
                do {
                    list.add(Integer.valueOf(this.f75028a.q()));
                } while (this.f75028a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f75028a.q()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzM(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C8070ev0) {
            C8070ev0 c8070ev0 = (C8070ev0) list;
            int i10 = this.f75029b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu0 = this.f75028a;
                int i11 = abstractC8068eu0.i() + abstractC8068eu0.q();
                do {
                    c8070ev0.h(this.f75028a.v());
                } while (this.f75028a.i() < i11);
                h(i11);
                return;
            }
            do {
                c8070ev0.h(this.f75028a.v());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu02 = this.f75028a;
                int i13 = abstractC8068eu02.i() + abstractC8068eu02.q();
                do {
                    list.add(Long.valueOf(this.f75028a.v()));
                } while (this.f75028a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Long.valueOf(this.f75028a.v()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzc() throws IOException {
        int iP = this.f75031d;
        if (iP != 0) {
            this.f75029b = iP;
            this.f75031d = 0;
        } else {
            iP = this.f75028a.p();
            this.f75029b = iP;
        }
        return (iP == 0 || iP == this.f75030c) ? a.e.API_PRIORITY_OTHER : iP >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzv(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Ot0) {
            Ot0 ot0 = (Ot0) list;
            int i10 = this.f75029b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu0 = this.f75028a;
                int i11 = abstractC8068eu0.i() + abstractC8068eu0.q();
                do {
                    ot0.f(this.f75028a.b());
                } while (this.f75028a.i() < i11);
                h(i11);
                return;
            }
            do {
                ot0.f(this.f75028a.b());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu02 = this.f75028a;
                int i13 = abstractC8068eu02.i() + abstractC8068eu02.q();
                do {
                    list.add(Boolean.valueOf(this.f75028a.b()));
                } while (this.f75028a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.f75028a.b()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzw(List list) throws IOException {
        int iP;
        if ((this.f75029b & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.f75028a.a()) {
                return;
            } else {
                iP = this.f75028a.p();
            }
        } while (iP == this.f75029b);
        this.f75031d = iP;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzx(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C8922mu0) {
            C8922mu0 c8922mu0 = (C8922mu0) list;
            int i10 = this.f75029b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ = this.f75028a.q();
                k(iQ);
                int i11 = iQ + this.f75028a.i();
                do {
                    c8922mu0.h(this.f75028a.g());
                } while (this.f75028a.i() < i11);
                return;
            }
            do {
                c8922mu0.h(this.f75028a.g());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ2 = this.f75028a.q();
                k(iQ2);
                int i13 = iQ2 + this.f75028a.i();
                do {
                    list.add(Double.valueOf(this.f75028a.g()));
                } while (this.f75028a.i() < i13);
                return;
            }
            do {
                list.add(Double.valueOf(this.f75028a.g()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzy(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f75029b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu0 = this.f75028a;
                int i11 = abstractC8068eu0.i() + abstractC8068eu0.q();
                do {
                    hu0.zzi(this.f75028a.k());
                } while (this.f75028a.i() < i11);
                h(i11);
                return;
            }
            do {
                hu0.zzi(this.f75028a.k());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC8068eu0 abstractC8068eu02 = this.f75028a;
                int i13 = abstractC8068eu02.i() + abstractC8068eu02.q();
                do {
                    list.add(Integer.valueOf(this.f75028a.k()));
                } while (this.f75028a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f75028a.k()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzz(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f75029b & 7;
            if (i10 == 2) {
                int iQ = this.f75028a.q();
                j(iQ);
                int i11 = this.f75028a.i() + iQ;
                do {
                    hu0.zzi(this.f75028a.l());
                } while (this.f75028a.i() < i11);
                return;
            }
            if (i10 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                hu0.zzi(this.f75028a.l());
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP2 = this.f75028a.p();
                }
            } while (iP2 == this.f75029b);
        } else {
            int i12 = this.f75029b & 7;
            if (i12 == 2) {
                int iQ2 = this.f75028a.q();
                j(iQ2);
                int i13 = this.f75028a.i() + iQ2;
                do {
                    list.add(Integer.valueOf(this.f75028a.l()));
                } while (this.f75028a.i() < i13);
                return;
            }
            if (i12 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.f75028a.l()));
                if (this.f75028a.a()) {
                    return;
                } else {
                    iP = this.f75028a.p();
                }
            } while (iP == this.f75029b);
            iP2 = iP;
        }
        this.f75031d = iP2;
    }

    private C8175fu0(AbstractC8068eu0 abstractC8068eu0) {
        Tu0.c(abstractC8068eu0, "input");
        this.f75028a = abstractC8068eu0;
        abstractC8068eu0.f74788c = this;
    }
}
