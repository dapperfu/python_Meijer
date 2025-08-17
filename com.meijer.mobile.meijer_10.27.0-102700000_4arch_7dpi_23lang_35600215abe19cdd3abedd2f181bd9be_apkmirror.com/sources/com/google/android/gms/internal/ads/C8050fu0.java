package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8050fu0 implements Bv0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7943eu0 f74188a;

    /* renamed from: b, reason: collision with root package name */
    private int f74189b;

    /* renamed from: c, reason: collision with root package name */
    private int f74190c;

    /* renamed from: d, reason: collision with root package name */
    private int f74191d = 0;

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void a(Object obj, Hv0 hv0, C9225qu0 c9225qu0) throws IOException {
        i(2);
        g(obj, hv0, c9225qu0);
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void b(Object obj, Hv0 hv0, C9225qu0 c9225qu0) throws IOException {
        i(3);
        f(obj, hv0, c9225qu0);
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final boolean zzN() throws IOException {
        i(0);
        return this.f74188a.b();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final double zza() throws IOException {
        i(1);
        return this.f74188a.g();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final float zzb() throws IOException {
        i(5);
        return this.f74188a.h();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzd() {
        return this.f74189b;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zze() throws IOException {
        i(0);
        return this.f74188a.k();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzf() throws IOException {
        i(5);
        return this.f74188a.l();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzg() throws IOException {
        i(0);
        return this.f74188a.m();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzh() throws IOException {
        i(5);
        return this.f74188a.n();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzi() throws IOException {
        i(0);
        return this.f74188a.o();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzj() throws IOException {
        i(0);
        return this.f74188a.q();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final long zzk() throws IOException {
        i(1);
        return this.f74188a.r();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final long zzl() throws IOException {
        i(0);
        return this.f74188a.s();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final long zzm() throws IOException {
        i(1);
        return this.f74188a.t();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final long zzn() throws IOException {
        i(0);
        return this.f74188a.u();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final long zzo() throws IOException {
        i(0);
        return this.f74188a.v();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final Zt0 zzp() throws IOException {
        i(2);
        return this.f74188a.w();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final String zzr() throws IOException {
        i(2);
        return this.f74188a.x();
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final String zzs() throws IOException {
        i(2);
        return this.f74188a.y();
    }

    private final void f(Object obj, Hv0 hv0, C9225qu0 c9225qu0) throws IOException {
        int i10 = this.f74190c;
        this.f74190c = ((this.f74189b >>> 3) << 3) | 4;
        try {
            hv0.b(obj, this, c9225qu0);
            if (this.f74189b == this.f74190c) {
            } else {
                throw new zzgyg("Failed to parse the message.");
            }
        } finally {
            this.f74190c = i10;
        }
    }

    private final void g(Object obj, Hv0 hv0, C9225qu0 c9225qu0) throws IOException {
        AbstractC7943eu0 abstractC7943eu0 = this.f74188a;
        int iQ = abstractC7943eu0.q();
        if (abstractC7943eu0.f73946a >= abstractC7943eu0.f73947b) {
            throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = abstractC7943eu0.j(iQ);
        this.f74188a.f73946a++;
        hv0.b(obj, this, c9225qu0);
        this.f74188a.z(0);
        r5.f73946a--;
        this.f74188a.A(iJ);
    }

    private final void h(int i10) throws IOException {
        if (this.f74188a.i() != i10) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void i(int i10) throws IOException {
        if ((this.f74189b & 7) != i10) {
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

    public static C8050fu0 l(AbstractC7943eu0 abstractC7943eu0) {
        C8050fu0 c8050fu0 = abstractC7943eu0.f73948c;
        return c8050fu0 != null ? c8050fu0 : new C8050fu0(abstractC7943eu0);
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    @Deprecated
    public final void c(List list, Hv0 hv0, C9225qu0 c9225qu0) throws IOException {
        int iP;
        int i10 = this.f74189b;
        if ((i10 & 7) != 3) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = hv0.zze();
            f(objZze, hv0, c9225qu0);
            hv0.zzf(objZze);
            list.add(objZze);
            if (this.f74188a.a() || this.f74191d != 0) {
                return;
            } else {
                iP = this.f74188a.p();
            }
        } while (iP == i10);
        this.f74191d = iP;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void d(List list, Hv0 hv0, C9225qu0 c9225qu0) throws IOException {
        int iP;
        int i10 = this.f74189b;
        if ((i10 & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = hv0.zze();
            g(objZze, hv0, c9225qu0);
            hv0.zzf(objZze);
            list.add(objZze);
            if (this.f74188a.a() || this.f74191d != 0) {
                return;
            } else {
                iP = this.f74188a.p();
            }
        } while (iP == i10);
        this.f74191d = iP;
    }

    public final void e(List list, boolean z10) throws IOException {
        int iP;
        int iP2;
        if ((this.f74189b & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof InterfaceC7626bv0) && !z10) {
            InterfaceC7626bv0 interfaceC7626bv0 = (InterfaceC7626bv0) list;
            do {
                zzp();
                interfaceC7626bv0.zzb();
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            do {
                list.add(z10 ? zzs() : zzr());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzA(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C7945ev0) {
            C7945ev0 c7945ev0 = (C7945ev0) list;
            int i10 = this.f74189b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ = this.f74188a.q();
                k(iQ);
                int i11 = iQ + this.f74188a.i();
                do {
                    c7945ev0.h(this.f74188a.r());
                } while (this.f74188a.i() < i11);
                return;
            }
            do {
                c7945ev0.h(this.f74188a.r());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ2 = this.f74188a.q();
                k(iQ2);
                int i13 = iQ2 + this.f74188a.i();
                do {
                    list.add(Long.valueOf(this.f74188a.r()));
                } while (this.f74188a.i() < i13);
                return;
            }
            do {
                list.add(Long.valueOf(this.f74188a.r()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzB(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C9973xu0) {
            C9973xu0 c9973xu0 = (C9973xu0) list;
            int i10 = this.f74189b & 7;
            if (i10 == 2) {
                int iQ = this.f74188a.q();
                j(iQ);
                int i11 = this.f74188a.i() + iQ;
                do {
                    c9973xu0.h(this.f74188a.h());
                } while (this.f74188a.i() < i11);
                return;
            }
            if (i10 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                c9973xu0.h(this.f74188a.h());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 == 2) {
                int iQ2 = this.f74188a.q();
                j(iQ2);
                int i13 = this.f74188a.i() + iQ2;
                do {
                    list.add(Float.valueOf(this.f74188a.h()));
                } while (this.f74188a.i() < i13);
                return;
            }
            if (i12 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.f74188a.h()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzD(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f74189b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu0 = this.f74188a;
                int i11 = abstractC7943eu0.i() + abstractC7943eu0.q();
                do {
                    hu0.zzi(this.f74188a.m());
                } while (this.f74188a.i() < i11);
                h(i11);
                return;
            }
            do {
                hu0.zzi(this.f74188a.m());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu02 = this.f74188a;
                int i13 = abstractC7943eu02.i() + abstractC7943eu02.q();
                do {
                    list.add(Integer.valueOf(this.f74188a.m()));
                } while (this.f74188a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f74188a.m()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzE(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C7945ev0) {
            C7945ev0 c7945ev0 = (C7945ev0) list;
            int i10 = this.f74189b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu0 = this.f74188a;
                int i11 = abstractC7943eu0.i() + abstractC7943eu0.q();
                do {
                    c7945ev0.h(this.f74188a.s());
                } while (this.f74188a.i() < i11);
                h(i11);
                return;
            }
            do {
                c7945ev0.h(this.f74188a.s());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu02 = this.f74188a;
                int i13 = abstractC7943eu02.i() + abstractC7943eu02.q();
                do {
                    list.add(Long.valueOf(this.f74188a.s()));
                } while (this.f74188a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Long.valueOf(this.f74188a.s()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzG(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f74189b & 7;
            if (i10 == 2) {
                int iQ = this.f74188a.q();
                j(iQ);
                int i11 = this.f74188a.i() + iQ;
                do {
                    hu0.zzi(this.f74188a.n());
                } while (this.f74188a.i() < i11);
                return;
            }
            if (i10 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                hu0.zzi(this.f74188a.n());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 == 2) {
                int iQ2 = this.f74188a.q();
                j(iQ2);
                int i13 = this.f74188a.i() + iQ2;
                do {
                    list.add(Integer.valueOf(this.f74188a.n()));
                } while (this.f74188a.i() < i13);
                return;
            }
            if (i12 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.f74188a.n()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzH(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C7945ev0) {
            C7945ev0 c7945ev0 = (C7945ev0) list;
            int i10 = this.f74189b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ = this.f74188a.q();
                k(iQ);
                int i11 = iQ + this.f74188a.i();
                do {
                    c7945ev0.h(this.f74188a.t());
                } while (this.f74188a.i() < i11);
                return;
            }
            do {
                c7945ev0.h(this.f74188a.t());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ2 = this.f74188a.q();
                k(iQ2);
                int i13 = iQ2 + this.f74188a.i();
                do {
                    list.add(Long.valueOf(this.f74188a.t()));
                } while (this.f74188a.i() < i13);
                return;
            }
            do {
                list.add(Long.valueOf(this.f74188a.t()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzI(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f74189b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu0 = this.f74188a;
                int i11 = abstractC7943eu0.i() + abstractC7943eu0.q();
                do {
                    hu0.zzi(this.f74188a.o());
                } while (this.f74188a.i() < i11);
                h(i11);
                return;
            }
            do {
                hu0.zzi(this.f74188a.o());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu02 = this.f74188a;
                int i13 = abstractC7943eu02.i() + abstractC7943eu02.q();
                do {
                    list.add(Integer.valueOf(this.f74188a.o()));
                } while (this.f74188a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f74188a.o()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzJ(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C7945ev0) {
            C7945ev0 c7945ev0 = (C7945ev0) list;
            int i10 = this.f74189b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu0 = this.f74188a;
                int i11 = abstractC7943eu0.i() + abstractC7943eu0.q();
                do {
                    c7945ev0.h(this.f74188a.u());
                } while (this.f74188a.i() < i11);
                h(i11);
                return;
            }
            do {
                c7945ev0.h(this.f74188a.u());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu02 = this.f74188a;
                int i13 = abstractC7943eu02.i() + abstractC7943eu02.q();
                do {
                    list.add(Long.valueOf(this.f74188a.u()));
                } while (this.f74188a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Long.valueOf(this.f74188a.u()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzL(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f74189b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu0 = this.f74188a;
                int i11 = abstractC7943eu0.i() + abstractC7943eu0.q();
                do {
                    hu0.zzi(this.f74188a.q());
                } while (this.f74188a.i() < i11);
                h(i11);
                return;
            }
            do {
                hu0.zzi(this.f74188a.q());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu02 = this.f74188a;
                int i13 = abstractC7943eu02.i() + abstractC7943eu02.q();
                do {
                    list.add(Integer.valueOf(this.f74188a.q()));
                } while (this.f74188a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f74188a.q()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzM(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C7945ev0) {
            C7945ev0 c7945ev0 = (C7945ev0) list;
            int i10 = this.f74189b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu0 = this.f74188a;
                int i11 = abstractC7943eu0.i() + abstractC7943eu0.q();
                do {
                    c7945ev0.h(this.f74188a.v());
                } while (this.f74188a.i() < i11);
                h(i11);
                return;
            }
            do {
                c7945ev0.h(this.f74188a.v());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu02 = this.f74188a;
                int i13 = abstractC7943eu02.i() + abstractC7943eu02.q();
                do {
                    list.add(Long.valueOf(this.f74188a.v()));
                } while (this.f74188a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Long.valueOf(this.f74188a.v()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final int zzc() throws IOException {
        int iP = this.f74191d;
        if (iP != 0) {
            this.f74189b = iP;
            this.f74191d = 0;
        } else {
            iP = this.f74188a.p();
            this.f74189b = iP;
        }
        return (iP == 0 || iP == this.f74190c) ? a.e.API_PRIORITY_OTHER : iP >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzv(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Ot0) {
            Ot0 ot0 = (Ot0) list;
            int i10 = this.f74189b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu0 = this.f74188a;
                int i11 = abstractC7943eu0.i() + abstractC7943eu0.q();
                do {
                    ot0.f(this.f74188a.b());
                } while (this.f74188a.i() < i11);
                h(i11);
                return;
            }
            do {
                ot0.f(this.f74188a.b());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu02 = this.f74188a;
                int i13 = abstractC7943eu02.i() + abstractC7943eu02.q();
                do {
                    list.add(Boolean.valueOf(this.f74188a.b()));
                } while (this.f74188a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.f74188a.b()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzw(List list) throws IOException {
        int iP;
        if ((this.f74189b & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.f74188a.a()) {
                return;
            } else {
                iP = this.f74188a.p();
            }
        } while (iP == this.f74189b);
        this.f74191d = iP;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzx(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof C8797mu0) {
            C8797mu0 c8797mu0 = (C8797mu0) list;
            int i10 = this.f74189b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ = this.f74188a.q();
                k(iQ);
                int i11 = iQ + this.f74188a.i();
                do {
                    c8797mu0.h(this.f74188a.g());
                } while (this.f74188a.i() < i11);
                return;
            }
            do {
                c8797mu0.h(this.f74188a.g());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iQ2 = this.f74188a.q();
                k(iQ2);
                int i13 = iQ2 + this.f74188a.i();
                do {
                    list.add(Double.valueOf(this.f74188a.g()));
                } while (this.f74188a.i() < i13);
                return;
            }
            do {
                list.add(Double.valueOf(this.f74188a.g()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzy(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f74189b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu0 = this.f74188a;
                int i11 = abstractC7943eu0.i() + abstractC7943eu0.q();
                do {
                    hu0.zzi(this.f74188a.k());
                } while (this.f74188a.i() < i11);
                h(i11);
                return;
            }
            do {
                hu0.zzi(this.f74188a.k());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC7943eu0 abstractC7943eu02 = this.f74188a;
                int i13 = abstractC7943eu02.i() + abstractC7943eu02.q();
                do {
                    list.add(Integer.valueOf(this.f74188a.k()));
                } while (this.f74188a.i() < i13);
                h(i13);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f74188a.k()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.Bv0
    public final void zzz(List list) throws IOException {
        int iP;
        int iP2;
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int i10 = this.f74189b & 7;
            if (i10 == 2) {
                int iQ = this.f74188a.q();
                j(iQ);
                int i11 = this.f74188a.i() + iQ;
                do {
                    hu0.zzi(this.f74188a.l());
                } while (this.f74188a.i() < i11);
                return;
            }
            if (i10 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                hu0.zzi(this.f74188a.l());
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP2 = this.f74188a.p();
                }
            } while (iP2 == this.f74189b);
        } else {
            int i12 = this.f74189b & 7;
            if (i12 == 2) {
                int iQ2 = this.f74188a.q();
                j(iQ2);
                int i13 = this.f74188a.i() + iQ2;
                do {
                    list.add(Integer.valueOf(this.f74188a.l()));
                } while (this.f74188a.i() < i13);
                return;
            }
            if (i12 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.f74188a.l()));
                if (this.f74188a.a()) {
                    return;
                } else {
                    iP = this.f74188a.p();
                }
            } while (iP == this.f74189b);
            iP2 = iP;
        }
        this.f74191d = iP2;
    }

    private C8050fu0(AbstractC7943eu0 abstractC7943eu0) {
        Tu0.c(abstractC7943eu0, "input");
        this.f74188a = abstractC7943eu0;
        abstractC7943eu0.f73948c = this;
    }
}
