package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* loaded from: classes6.dex */
public final class r extends O0<r, a> implements InterfaceC11089y1 {
    private static final r zzg;
    private static volatile I1<r> zzh;
    private int zzc;
    private C11069s zzd;
    private C11075u zze;
    private X0<C11058o> zzf = O0.o();

    public static final class a extends O0.b<r, a> implements InterfaceC11089y1 {
        private a() {
            super(r.zzg);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }

        public final a k(C11069s c11069s) {
            if (this.f84407c) {
                g();
                this.f84407c = false;
            }
            ((r) this.f84406b).s(c11069s);
            return this;
        }

        public final a l(Iterable<? extends C11058o> iterable) {
            if (this.f84407c) {
                g();
                this.f84407c = false;
            }
            ((r) this.f84406b).t(iterable);
            return this;
        }
    }

    static {
        r rVar = new r();
        zzg = rVar;
        O0.k(r.class, rVar);
    }

    public static a p() {
        return zzg.m();
    }

    private final void v() {
        X0<C11058o> x02 = this.zzf;
        if (x02.zza()) {
            return;
        }
        this.zzf = O0.g(x02);
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.r>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<r> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new r();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", C11058o.class});
            case 4:
                return zzg;
            case 5:
                I1<r> i13 = zzh;
                if (i13 != null) {
                    return i13;
                }
                synchronized (r.class) {
                    try {
                        I1<r> i14 = zzh;
                        i12 = i14;
                        if (i14 == null) {
                            ?? aVar = new O0.a(zzg);
                            zzh = aVar;
                            i12 = aVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return i12;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(C11069s c11069s) {
        c11069s.getClass();
        this.zzd = c11069s;
        this.zzc |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(Iterable<? extends C11058o> iterable) {
        v();
        X.b(iterable, this.zzf);
    }
}
