package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11069s extends O0<C11069s, b> implements InterfaceC11089y1 {
    private static final C11069s zzi;
    private static volatile I1<C11069s> zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    /* renamed from: com.google.android.gms.internal.vision.s$a */
    public enum a implements R0 {
        FORMAT_UNKNOWN(0),
        FORMAT_LUMINANCE(1),
        FORMAT_RGB8(2),
        FORMAT_MONOCHROME(3);


        /* renamed from: f, reason: collision with root package name */
        private static final U0<a> f84643f = new M();

        /* renamed from: a, reason: collision with root package name */
        private final int f84645a;

        public static a a(int i10) {
            if (i10 == 0) {
                return FORMAT_UNKNOWN;
            }
            if (i10 == 1) {
                return FORMAT_LUMINANCE;
            }
            if (i10 == 2) {
                return FORMAT_RGB8;
            }
            if (i10 != 3) {
                return null;
            }
            return FORMAT_MONOCHROME;
        }

        public static T0 b() {
            return L.f84391a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f84645a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.R0
        public final int zza() {
            return this.f84645a;
        }

        a(int i10) {
            this.f84645a = i10;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.s$b */
    public static final class b extends O0.b<C11069s, b> implements InterfaceC11089y1 {
        private b() {
            super(C11069s.zzi);
        }

        /* synthetic */ b(C11090z c11090z) {
            this();
        }

        public final b k(long j10) {
            if (this.f84407c) {
                g();
                this.f84407c = false;
            }
            ((C11069s) this.f84406b).q(j10);
            return this;
        }

        public final b l(long j10) {
            if (this.f84407c) {
                g();
                this.f84407c = false;
            }
            ((C11069s) this.f84406b).t(j10);
            return this;
        }

        public final b m(long j10) {
            if (this.f84407c) {
                g();
                this.f84407c = false;
            }
            ((C11069s) this.f84406b).v(j10);
            return this;
        }

        public final b n(long j10) {
            if (this.f84407c) {
                g();
                this.f84407c = false;
            }
            ((C11069s) this.f84406b).x(j10);
            return this;
        }
    }

    static {
        C11069s c11069s = new C11069s();
        zzi = c11069s;
        O0.k(C11069s.class, c11069s);
    }

    public static b p() {
        return zzi.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(long j10) {
        this.zzc |= 2;
        this.zze = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(long j10) {
        this.zzc |= 4;
        this.zzf = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(long j10) {
        this.zzc |= 8;
        this.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(long j10) {
        this.zzc |= 16;
        this.zzh = j10;
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.s>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11069s> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11069s();
            case 2:
                return new b(c11090z);
            case 3:
                return O0.i(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", a.b(), "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                I1<C11069s> i13 = zzj;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11069s.class) {
                    try {
                        I1<C11069s> i14 = zzj;
                        i12 = i14;
                        if (i14 == null) {
                            ?? aVar = new O0.a(zzi);
                            zzj = aVar;
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

    private C11069s() {
    }
}
