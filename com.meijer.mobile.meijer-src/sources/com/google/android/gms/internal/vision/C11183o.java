package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11183o extends O0<C11183o, b> implements InterfaceC11214y1 {
    private static final C11183o zzl;
    private static volatile I1<C11183o> zzm;
    private int zzc;
    private int zzg;
    private long zzi;
    private long zzj;
    private String zzd = "";
    private String zze = "";
    private X0<String> zzf = O0.o();
    private String zzh = "";
    private X0<C11206w> zzk = O0.o();

    /* renamed from: com.google.android.gms.internal.vision.o$a */
    public enum a implements R0 {
        RESULT_UNKNOWN(0),
        RESULT_SUCCESS(1),
        RESULT_FAIL(2),
        RESULT_SKIPPED(3);


        /* renamed from: f, reason: collision with root package name */
        private static final U0<a> f85448f = new E();

        /* renamed from: a, reason: collision with root package name */
        private final int f85450a;

        public static a a(int i10) {
            if (i10 == 0) {
                return RESULT_UNKNOWN;
            }
            if (i10 == 1) {
                return RESULT_SUCCESS;
            }
            if (i10 == 2) {
                return RESULT_FAIL;
            }
            if (i10 != 3) {
                return null;
            }
            return RESULT_SKIPPED;
        }

        public static T0 b() {
            return D.f85130a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f85450a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.R0
        public final int zza() {
            return this.f85450a;
        }

        a(int i10) {
            this.f85450a = i10;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.o$b */
    public static final class b extends O0.b<C11183o, b> implements InterfaceC11214y1 {
        private b() {
            super(C11183o.zzl);
        }

        /* synthetic */ b(C11215z c11215z) {
            this();
        }

        public final b k(long j10) {
            if (this.f85247c) {
                g();
                this.f85247c = false;
            }
            ((C11183o) this.f85246b).q(j10);
            return this;
        }

        public final b l(Iterable<? extends C11206w> iterable) {
            if (this.f85247c) {
                g();
                this.f85247c = false;
            }
            ((C11183o) this.f85246b).u(iterable);
            return this;
        }

        public final b m(String str) {
            if (this.f85247c) {
                g();
                this.f85247c = false;
            }
            ((C11183o) this.f85246b).v(str);
            return this;
        }

        public final b n(long j10) {
            if (this.f85247c) {
                g();
                this.f85247c = false;
            }
            ((C11183o) this.f85246b).x(j10);
            return this;
        }
    }

    static {
        C11183o c11183o = new C11183o();
        zzl = c11183o;
        O0.k(C11183o.class, c11183o);
    }

    public static b p() {
        return zzl.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(long j10) {
        this.zzc |= 16;
        this.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(Iterable<? extends C11206w> iterable) {
        X0<C11206w> x02 = this.zzk;
        if (!x02.zza()) {
            this.zzk = O0.g(x02);
        }
        X.b(iterable, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(long j10) {
        this.zzc |= 32;
        this.zzj = j10;
    }

    /* JADX WARN: Type inference failed for: r12v12, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.o>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11183o> i12;
        C11215z c11215z = null;
        switch (C11215z.f85521a[i10 - 1]) {
            case 1:
                return new C11183o();
            case 2:
                return new b(c11215z);
            case 3:
                return O0.i(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", a.b(), "zzh", "zzi", "zzj", "zzk", C11206w.class});
            case 4:
                return zzl;
            case 5:
                I1<C11183o> i13 = zzm;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11183o.class) {
                    try {
                        I1<C11183o> i14 = zzm;
                        i12 = i14;
                        if (i14 == null) {
                            ?? aVar = new O0.a(zzl);
                            zzm = aVar;
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

    private C11183o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }
}
