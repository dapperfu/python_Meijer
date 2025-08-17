package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11061p extends O0<C11061p, a> implements InterfaceC11089y1 {
    private static final C11061p zzj;
    private static volatile I1<C11061p> zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.p$a */
    public static final class a extends O0.b<C11061p, a> implements InterfaceC11089y1 {
        private a() {
            super(C11061p.zzj);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$b */
    public enum b implements R0 {
        CLASSIFICATION_UNKNOWN(0),
        CLASSIFICATION_NONE(1),
        CLASSIFICATION_ALL(2);


        /* renamed from: e, reason: collision with root package name */
        private static final U0<b> f84617e = new F();

        /* renamed from: a, reason: collision with root package name */
        private final int f84619a;

        public static b a(int i10) {
            if (i10 == 0) {
                return CLASSIFICATION_UNKNOWN;
            }
            if (i10 == 1) {
                return CLASSIFICATION_NONE;
            }
            if (i10 != 2) {
                return null;
            }
            return CLASSIFICATION_ALL;
        }

        public static T0 b() {
            return G.f84298a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f84619a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.R0
        public final int zza() {
            return this.f84619a;
        }

        b(int i10) {
            this.f84619a = i10;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$c */
    public enum c implements R0 {
        LANDMARK_UNKNOWN(0),
        LANDMARK_NONE(1),
        LANDMARK_ALL(2),
        LANDMARK_CONTOUR(3);


        /* renamed from: f, reason: collision with root package name */
        private static final U0<c> f84624f = new I();

        /* renamed from: a, reason: collision with root package name */
        private final int f84626a;

        public static c a(int i10) {
            if (i10 == 0) {
                return LANDMARK_UNKNOWN;
            }
            if (i10 == 1) {
                return LANDMARK_NONE;
            }
            if (i10 == 2) {
                return LANDMARK_ALL;
            }
            if (i10 != 3) {
                return null;
            }
            return LANDMARK_CONTOUR;
        }

        public static T0 b() {
            return H.f84308a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f84626a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.R0
        public final int zza() {
            return this.f84626a;
        }

        c(int i10) {
            this.f84626a = i10;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$d */
    public enum d implements R0 {
        MODE_UNKNOWN(0),
        MODE_ACCURATE(1),
        MODE_FAST(2),
        MODE_SELFIE(3);


        /* renamed from: f, reason: collision with root package name */
        private static final U0<d> f84631f = new J();

        /* renamed from: a, reason: collision with root package name */
        private final int f84633a;

        public static d a(int i10) {
            if (i10 == 0) {
                return MODE_UNKNOWN;
            }
            if (i10 == 1) {
                return MODE_ACCURATE;
            }
            if (i10 == 2) {
                return MODE_FAST;
            }
            if (i10 != 3) {
                return null;
            }
            return MODE_SELFIE;
        }

        public static T0 b() {
            return K.f84385a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f84633a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.R0
        public final int zza() {
            return this.f84633a;
        }

        d(int i10) {
            this.f84633a = i10;
        }
    }

    static {
        C11061p c11061p = new C11061p();
        zzj = c11061p;
        O0.k(C11061p.class, c11061p);
    }

    /* JADX WARN: Type inference failed for: r11v12, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.p>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11061p> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11061p();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", d.b(), "zze", c.b(), "zzf", b.b(), "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                I1<C11061p> i13 = zzk;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11061p.class) {
                    try {
                        I1<C11061p> i14 = zzk;
                        i12 = i14;
                        if (i14 == null) {
                            ?? aVar = new O0.a(zzj);
                            zzk = aVar;
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

    private C11061p() {
    }
}
