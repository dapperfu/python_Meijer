package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11055n extends O0<C11055n, a> implements InterfaceC11089y1 {
    private static final C11055n zzl;
    private static volatile I1<C11055n> zzm;
    private int zzc;
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private String zzd = "";
    private String zzj = "";

    /* renamed from: com.google.android.gms.internal.vision.n$a */
    public static final class a extends O0.b<C11055n, a> implements InterfaceC11089y1 {
        private a() {
            super(C11055n.zzl);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.n$b */
    public enum b implements R0 {
        REASON_UNKNOWN(0),
        REASON_MISSING(1),
        REASON_UPGRADE(2),
        REASON_INVALID(3);


        /* renamed from: f, reason: collision with root package name */
        private static final U0<b> f84599f = new B();

        /* renamed from: a, reason: collision with root package name */
        private final int f84601a;

        public static b a(int i10) {
            if (i10 == 0) {
                return REASON_UNKNOWN;
            }
            if (i10 == 1) {
                return REASON_MISSING;
            }
            if (i10 == 2) {
                return REASON_UPGRADE;
            }
            if (i10 != 3) {
                return null;
            }
            return REASON_INVALID;
        }

        public static T0 b() {
            return C.f84285a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f84601a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.R0
        public final int zza() {
            return this.f84601a;
        }

        b(int i10) {
            this.f84601a = i10;
        }
    }

    static {
        C11055n c11055n = new C11055n();
        zzl = c11055n;
        O0.k(C11055n.class, c11055n);
    }

    /* JADX WARN: Type inference failed for: r11v12, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.n>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11055n> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11055n();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", b.b(), "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                I1<C11055n> i13 = zzm;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11055n.class) {
                    try {
                        I1<C11055n> i14 = zzm;
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

    private C11055n() {
    }
}
