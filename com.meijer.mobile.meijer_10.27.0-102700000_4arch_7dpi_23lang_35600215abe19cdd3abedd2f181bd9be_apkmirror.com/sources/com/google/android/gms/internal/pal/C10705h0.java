package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.pal.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10705h0 implements InterfaceC10865r1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC10689g0 f83142a;

    /* renamed from: b, reason: collision with root package name */
    private int f83143b;

    /* renamed from: c, reason: collision with root package name */
    private int f83144c;

    /* renamed from: d, reason: collision with root package name */
    private int f83145d = 0;

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    @Deprecated
    public final Object b(InterfaceC10881s1 interfaceC10881s1, C10833p0 c10833p0) throws IOException {
        j(3);
        return g(interfaceC10881s1, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final Object d(InterfaceC10881s1 interfaceC10881s1, C10833p0 c10833p0) throws IOException {
        j(2);
        return h(interfaceC10881s1, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final boolean zzN() throws IOException {
        j(0);
        return this.f83142a.j();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final double zza() throws IOException {
        j(1);
        return Double.longBitsToDouble(((C10656e0) this.f83142a).r());
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final float zzb() throws IOException {
        j(5);
        return Float.intBitsToFloat(((C10656e0) this.f83142a).p());
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final int zzd() {
        return this.f83143b;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final int zze() throws IOException {
        j(0);
        return ((C10656e0) this.f83142a).q();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final int zzf() throws IOException {
        j(5);
        return ((C10656e0) this.f83142a).p();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final int zzg() throws IOException {
        j(0);
        return ((C10656e0) this.f83142a).q();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final int zzh() throws IOException {
        j(5);
        return ((C10656e0) this.f83142a).p();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final int zzi() throws IOException {
        j(0);
        return AbstractC10689g0.l(((C10656e0) this.f83142a).q());
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final int zzj() throws IOException {
        j(0);
        return ((C10656e0) this.f83142a).q();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final long zzk() throws IOException {
        j(1);
        return ((C10656e0) this.f83142a).r();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final long zzl() throws IOException {
        j(0);
        return ((C10656e0) this.f83142a).s();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final long zzm() throws IOException {
        j(1);
        return ((C10656e0) this.f83142a).r();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final long zzn() throws IOException {
        j(0);
        return AbstractC10689g0.m(((C10656e0) this.f83142a).s());
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final long zzo() throws IOException {
        j(0);
        return ((C10656e0) this.f83142a).s();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final AbstractC10605b0 zzp() throws IOException {
        j(2);
        return this.f83142a.d();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final String zzt() throws IOException {
        j(2);
        return this.f83142a.e();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final String zzu() throws IOException {
        j(2);
        return this.f83142a.f();
    }

    private final Object g(InterfaceC10881s1 interfaceC10881s1, C10833p0 c10833p0) throws IOException {
        int i10 = this.f83144c;
        this.f83144c = ((this.f83143b >>> 3) << 3) | 4;
        try {
            Object objZze = interfaceC10881s1.zze();
            interfaceC10881s1.c(objZze, this, c10833p0);
            interfaceC10881s1.zzf(objZze);
            if (this.f83143b == this.f83144c) {
                return objZze;
            }
            throw zzadi.g();
        } finally {
            this.f83144c = i10;
        }
    }

    private final Object h(InterfaceC10881s1 interfaceC10881s1, C10833p0 c10833p0) throws IOException {
        int iQ = ((C10656e0) this.f83142a).q();
        AbstractC10689g0 abstractC10689g0 = this.f83142a;
        if (abstractC10689g0.f83132a >= abstractC10689g0.f83133b) {
            throw new zzadi("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iB = abstractC10689g0.b(iQ);
        Object objZze = interfaceC10881s1.zze();
        this.f83142a.f83132a++;
        interfaceC10881s1.c(objZze, this, c10833p0);
        interfaceC10881s1.zzf(objZze);
        this.f83142a.g(0);
        r5.f83132a--;
        this.f83142a.h(iB);
        return objZze;
    }

    private final void i(int i10) throws IOException {
        if (this.f83142a.a() != i10) {
            throw zzadi.i();
        }
    }

    private final void j(int i10) throws IOException {
        if ((this.f83143b & 7) != i10) {
            throw zzadi.a();
        }
    }

    private static final void k(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw zzadi.g();
        }
    }

    private static final void l(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw zzadi.g();
        }
    }

    public static C10705h0 m(AbstractC10689g0 abstractC10689g0) {
        C10705h0 c10705h0 = abstractC10689g0.f83134c;
        return c10705h0 != null ? c10705h0 : new C10705h0(abstractC10689g0);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    @Deprecated
    public final void a(List list, InterfaceC10881s1 interfaceC10881s1, C10833p0 c10833p0) throws IOException {
        int iC;
        int i10 = this.f83143b;
        if ((i10 & 7) != 3) {
            throw zzadi.a();
        }
        do {
            list.add(g(interfaceC10881s1, c10833p0));
            AbstractC10689g0 abstractC10689g0 = this.f83142a;
            if (abstractC10689g0.i() || this.f83145d != 0) {
                return;
            } else {
                iC = abstractC10689g0.c();
            }
        } while (iC == i10);
        this.f83145d = iC;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final boolean c() throws IOException {
        int i10;
        AbstractC10689g0 abstractC10689g0 = this.f83142a;
        if (abstractC10689g0.i() || (i10 = this.f83143b) == this.f83144c) {
            return false;
        }
        return abstractC10689g0.k(i10);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void e(List list, InterfaceC10881s1 interfaceC10881s1, C10833p0 c10833p0) throws IOException {
        int iC;
        int i10 = this.f83143b;
        if ((i10 & 7) != 2) {
            throw zzadi.a();
        }
        do {
            list.add(h(interfaceC10881s1, c10833p0));
            AbstractC10689g0 abstractC10689g0 = this.f83142a;
            if (abstractC10689g0.i() || this.f83145d != 0) {
                return;
            } else {
                iC = abstractC10689g0.c();
            }
        } while (iC == i10);
        this.f83145d = iC;
    }

    public final void f(List list, boolean z10) throws IOException {
        int iC;
        int iC2;
        if ((this.f83143b & 7) != 2) {
            throw zzadi.a();
        }
        if (!(list instanceof N0) || z10) {
            do {
                list.add(z10 ? zzu() : zzt());
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        N0 n02 = (N0) list;
        do {
            n02.Y0(zzp());
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzA(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof U0)) {
            int i10 = this.f83143b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzadi.a();
                }
                int iQ = ((C10656e0) this.f83142a).q();
                l(iQ);
                int iA = this.f83142a.a() + iQ;
                do {
                    list.add(Long.valueOf(((C10656e0) this.f83142a).r()));
                } while (this.f83142a.a() < iA);
                return;
            }
            do {
                list.add(Long.valueOf(((C10656e0) this.f83142a).r()));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        U0 u02 = (U0) list;
        int i11 = this.f83143b & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw zzadi.a();
            }
            int iQ2 = ((C10656e0) this.f83142a).q();
            l(iQ2);
            int iA2 = this.f83142a.a() + iQ2;
            do {
                u02.e(((C10656e0) this.f83142a).r());
            } while (this.f83142a.a() < iA2);
            return;
        }
        do {
            u02.e(((C10656e0) this.f83142a).r());
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzB(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C10944w0)) {
            int i10 = this.f83143b & 7;
            if (i10 == 2) {
                int iQ = ((C10656e0) this.f83142a).q();
                k(iQ);
                int iA = this.f83142a.a() + iQ;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((C10656e0) this.f83142a).p())));
                } while (this.f83142a.a() < iA);
                return;
            }
            if (i10 != 5) {
                throw zzadi.a();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(((C10656e0) this.f83142a).p())));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        C10944w0 c10944w0 = (C10944w0) list;
        int i11 = this.f83143b & 7;
        if (i11 == 2) {
            int iQ2 = ((C10656e0) this.f83142a).q();
            k(iQ2);
            int iA2 = this.f83142a.a() + iQ2;
            do {
                c10944w0.a(Float.intBitsToFloat(((C10656e0) this.f83142a).p()));
            } while (this.f83142a.a() < iA2);
            return;
        }
        if (i11 != 5) {
            throw zzadi.a();
        }
        do {
            c10944w0.a(Float.intBitsToFloat(((C10656e0) this.f83142a).p()));
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzD(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof D0)) {
            int i10 = this.f83143b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzadi.a();
                }
                int iA = this.f83142a.a() + ((C10656e0) this.f83142a).q();
                do {
                    list.add(Integer.valueOf(((C10656e0) this.f83142a).q()));
                } while (this.f83142a.a() < iA);
                i(iA);
                return;
            }
            do {
                list.add(Integer.valueOf(((C10656e0) this.f83142a).q()));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        D0 d02 = (D0) list;
        int i11 = this.f83143b & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzadi.a();
            }
            int iA2 = this.f83142a.a() + ((C10656e0) this.f83142a).q();
            do {
                d02.f(((C10656e0) this.f83142a).q());
            } while (this.f83142a.a() < iA2);
            i(iA2);
            return;
        }
        do {
            d02.f(((C10656e0) this.f83142a).q());
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzE(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof U0)) {
            int i10 = this.f83143b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzadi.a();
                }
                int iA = this.f83142a.a() + ((C10656e0) this.f83142a).q();
                do {
                    list.add(Long.valueOf(((C10656e0) this.f83142a).s()));
                } while (this.f83142a.a() < iA);
                i(iA);
                return;
            }
            do {
                list.add(Long.valueOf(((C10656e0) this.f83142a).s()));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        U0 u02 = (U0) list;
        int i11 = this.f83143b & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzadi.a();
            }
            int iA2 = this.f83142a.a() + ((C10656e0) this.f83142a).q();
            do {
                u02.e(((C10656e0) this.f83142a).s());
            } while (this.f83142a.a() < iA2);
            i(iA2);
            return;
        }
        do {
            u02.e(((C10656e0) this.f83142a).s());
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzG(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof D0)) {
            int i10 = this.f83143b & 7;
            if (i10 == 2) {
                int iQ = ((C10656e0) this.f83142a).q();
                k(iQ);
                int iA = this.f83142a.a() + iQ;
                do {
                    list.add(Integer.valueOf(((C10656e0) this.f83142a).p()));
                } while (this.f83142a.a() < iA);
                return;
            }
            if (i10 != 5) {
                throw zzadi.a();
            }
            do {
                list.add(Integer.valueOf(((C10656e0) this.f83142a).p()));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        D0 d02 = (D0) list;
        int i11 = this.f83143b & 7;
        if (i11 == 2) {
            int iQ2 = ((C10656e0) this.f83142a).q();
            k(iQ2);
            int iA2 = this.f83142a.a() + iQ2;
            do {
                d02.f(((C10656e0) this.f83142a).p());
            } while (this.f83142a.a() < iA2);
            return;
        }
        if (i11 != 5) {
            throw zzadi.a();
        }
        do {
            d02.f(((C10656e0) this.f83142a).p());
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzH(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof U0)) {
            int i10 = this.f83143b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzadi.a();
                }
                int iQ = ((C10656e0) this.f83142a).q();
                l(iQ);
                int iA = this.f83142a.a() + iQ;
                do {
                    list.add(Long.valueOf(((C10656e0) this.f83142a).r()));
                } while (this.f83142a.a() < iA);
                return;
            }
            do {
                list.add(Long.valueOf(((C10656e0) this.f83142a).r()));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        U0 u02 = (U0) list;
        int i11 = this.f83143b & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw zzadi.a();
            }
            int iQ2 = ((C10656e0) this.f83142a).q();
            l(iQ2);
            int iA2 = this.f83142a.a() + iQ2;
            do {
                u02.e(((C10656e0) this.f83142a).r());
            } while (this.f83142a.a() < iA2);
            return;
        }
        do {
            u02.e(((C10656e0) this.f83142a).r());
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzI(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof D0)) {
            int i10 = this.f83143b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzadi.a();
                }
                int iA = this.f83142a.a() + ((C10656e0) this.f83142a).q();
                do {
                    list.add(Integer.valueOf(AbstractC10689g0.l(((C10656e0) this.f83142a).q())));
                } while (this.f83142a.a() < iA);
                i(iA);
                return;
            }
            do {
                list.add(Integer.valueOf(AbstractC10689g0.l(((C10656e0) this.f83142a).q())));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        D0 d02 = (D0) list;
        int i11 = this.f83143b & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzadi.a();
            }
            int iA2 = this.f83142a.a() + ((C10656e0) this.f83142a).q();
            do {
                d02.f(AbstractC10689g0.l(((C10656e0) this.f83142a).q()));
            } while (this.f83142a.a() < iA2);
            i(iA2);
            return;
        }
        do {
            d02.f(AbstractC10689g0.l(((C10656e0) this.f83142a).q()));
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzJ(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof U0)) {
            int i10 = this.f83143b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzadi.a();
                }
                int iA = this.f83142a.a() + ((C10656e0) this.f83142a).q();
                do {
                    list.add(Long.valueOf(AbstractC10689g0.m(((C10656e0) this.f83142a).s())));
                } while (this.f83142a.a() < iA);
                i(iA);
                return;
            }
            do {
                list.add(Long.valueOf(AbstractC10689g0.m(((C10656e0) this.f83142a).s())));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        U0 u02 = (U0) list;
        int i11 = this.f83143b & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzadi.a();
            }
            int iA2 = this.f83142a.a() + ((C10656e0) this.f83142a).q();
            do {
                u02.e(AbstractC10689g0.m(((C10656e0) this.f83142a).s()));
            } while (this.f83142a.a() < iA2);
            i(iA2);
            return;
        }
        do {
            u02.e(AbstractC10689g0.m(((C10656e0) this.f83142a).s()));
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzL(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof D0)) {
            int i10 = this.f83143b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzadi.a();
                }
                int iA = this.f83142a.a() + ((C10656e0) this.f83142a).q();
                do {
                    list.add(Integer.valueOf(((C10656e0) this.f83142a).q()));
                } while (this.f83142a.a() < iA);
                i(iA);
                return;
            }
            do {
                list.add(Integer.valueOf(((C10656e0) this.f83142a).q()));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        D0 d02 = (D0) list;
        int i11 = this.f83143b & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzadi.a();
            }
            int iA2 = this.f83142a.a() + ((C10656e0) this.f83142a).q();
            do {
                d02.f(((C10656e0) this.f83142a).q());
            } while (this.f83142a.a() < iA2);
            i(iA2);
            return;
        }
        do {
            d02.f(((C10656e0) this.f83142a).q());
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzM(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof U0)) {
            int i10 = this.f83143b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzadi.a();
                }
                int iA = this.f83142a.a() + ((C10656e0) this.f83142a).q();
                do {
                    list.add(Long.valueOf(((C10656e0) this.f83142a).s()));
                } while (this.f83142a.a() < iA);
                i(iA);
                return;
            }
            do {
                list.add(Long.valueOf(((C10656e0) this.f83142a).s()));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        U0 u02 = (U0) list;
        int i11 = this.f83143b & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzadi.a();
            }
            int iA2 = this.f83142a.a() + ((C10656e0) this.f83142a).q();
            do {
                u02.e(((C10656e0) this.f83142a).s());
            } while (this.f83142a.a() < iA2);
            i(iA2);
            return;
        }
        do {
            u02.e(((C10656e0) this.f83142a).s());
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final int zzc() throws IOException {
        int iC = this.f83145d;
        if (iC != 0) {
            this.f83143b = iC;
            this.f83145d = 0;
        } else {
            iC = this.f83142a.c();
            this.f83143b = iC;
        }
        return (iC == 0 || iC == this.f83144c) ? a.e.API_PRIORITY_OTHER : iC >>> 3;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzv(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof P)) {
            int i10 = this.f83143b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzadi.a();
                }
                int iA = this.f83142a.a() + ((C10656e0) this.f83142a).q();
                do {
                    list.add(Boolean.valueOf(this.f83142a.j()));
                } while (this.f83142a.a() < iA);
                i(iA);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.f83142a.j()));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        P p10 = (P) list;
        int i11 = this.f83143b & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzadi.a();
            }
            int iA2 = this.f83142a.a() + ((C10656e0) this.f83142a).q();
            do {
                p10.a(this.f83142a.j());
            } while (this.f83142a.a() < iA2);
            i(iA2);
            return;
        }
        do {
            p10.a(this.f83142a.j());
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzw(List list) throws IOException {
        int iC;
        if ((this.f83143b & 7) != 2) {
            throw zzadi.a();
        }
        do {
            list.add(zzp());
            AbstractC10689g0 abstractC10689g0 = this.f83142a;
            if (abstractC10689g0.i()) {
                return;
            } else {
                iC = abstractC10689g0.c();
            }
        } while (iC == this.f83143b);
        this.f83145d = iC;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzx(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C10785m0)) {
            int i10 = this.f83143b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzadi.a();
                }
                int iQ = ((C10656e0) this.f83142a).q();
                l(iQ);
                int iA = this.f83142a.a() + iQ;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((C10656e0) this.f83142a).r())));
                } while (this.f83142a.a() < iA);
                return;
            }
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(((C10656e0) this.f83142a).r())));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        C10785m0 c10785m0 = (C10785m0) list;
        int i11 = this.f83143b & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw zzadi.a();
            }
            int iQ2 = ((C10656e0) this.f83142a).q();
            l(iQ2);
            int iA2 = this.f83142a.a() + iQ2;
            do {
                c10785m0.a(Double.longBitsToDouble(((C10656e0) this.f83142a).r()));
            } while (this.f83142a.a() < iA2);
            return;
        }
        do {
            c10785m0.a(Double.longBitsToDouble(((C10656e0) this.f83142a).r()));
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzy(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof D0)) {
            int i10 = this.f83143b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzadi.a();
                }
                int iA = this.f83142a.a() + ((C10656e0) this.f83142a).q();
                do {
                    list.add(Integer.valueOf(((C10656e0) this.f83142a).q()));
                } while (this.f83142a.a() < iA);
                i(iA);
                return;
            }
            do {
                list.add(Integer.valueOf(((C10656e0) this.f83142a).q()));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        D0 d02 = (D0) list;
        int i11 = this.f83143b & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzadi.a();
            }
            int iA2 = this.f83142a.a() + ((C10656e0) this.f83142a).q();
            do {
                d02.f(((C10656e0) this.f83142a).q());
            } while (this.f83142a.a() < iA2);
            i(iA2);
            return;
        }
        do {
            d02.f(((C10656e0) this.f83142a).q());
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10865r1
    public final void zzz(List list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof D0)) {
            int i10 = this.f83143b & 7;
            if (i10 == 2) {
                int iQ = ((C10656e0) this.f83142a).q();
                k(iQ);
                int iA = this.f83142a.a() + iQ;
                do {
                    list.add(Integer.valueOf(((C10656e0) this.f83142a).p()));
                } while (this.f83142a.a() < iA);
                return;
            }
            if (i10 != 5) {
                throw zzadi.a();
            }
            do {
                list.add(Integer.valueOf(((C10656e0) this.f83142a).p()));
                AbstractC10689g0 abstractC10689g0 = this.f83142a;
                if (abstractC10689g0.i()) {
                    return;
                } else {
                    iC = abstractC10689g0.c();
                }
            } while (iC == this.f83143b);
            this.f83145d = iC;
            return;
        }
        D0 d02 = (D0) list;
        int i11 = this.f83143b & 7;
        if (i11 == 2) {
            int iQ2 = ((C10656e0) this.f83142a).q();
            k(iQ2);
            int iA2 = this.f83142a.a() + iQ2;
            do {
                d02.f(((C10656e0) this.f83142a).p());
            } while (this.f83142a.a() < iA2);
            return;
        }
        if (i11 != 5) {
            throw zzadi.a();
        }
        do {
            d02.f(((C10656e0) this.f83142a).p());
            AbstractC10689g0 abstractC10689g02 = this.f83142a;
            if (abstractC10689g02.i()) {
                return;
            } else {
                iC2 = abstractC10689g02.c();
            }
        } while (iC2 == this.f83143b);
        this.f83145d = iC2;
    }

    private C10705h0(AbstractC10689g0 abstractC10689g0) {
        J0.f(abstractC10689g0, "input");
        this.f83142a = abstractC10689g0;
        abstractC10689g0.f83134c = this;
    }
}
