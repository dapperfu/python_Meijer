package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11186p extends O0<C11186p, a> implements InterfaceC11214y1 {
    private static final C11186p zzj;
    private static volatile I1<C11186p> zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.p$a */
    public static final class a extends O0.b<C11186p, a> implements InterfaceC11214y1 {
        private a() {
            super(C11186p.zzj);
        }

        /* synthetic */ a(C11215z c11215z) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$b */
    public enum b implements R0 {
        CLASSIFICATION_UNKNOWN(0),
        CLASSIFICATION_NONE(1),
        CLASSIFICATION_ALL(2);


        /* renamed from: e, reason: collision with root package name */
        private static final U0<b> f85457e = new F();

        /* renamed from: a, reason: collision with root package name */
        private final int f85459a;

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
            return G.f85138a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f85459a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.R0
        public final int zza() {
            return this.f85459a;
        }

        b(int i10) {
            this.f85459a = i10;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$c */
    public enum c implements R0 {
        LANDMARK_UNKNOWN(0),
        LANDMARK_NONE(1),
        LANDMARK_ALL(2),
        LANDMARK_CONTOUR(3);


        /* renamed from: f, reason: collision with root package name */
        private static final U0<c> f85464f = new I();

        /* renamed from: a, reason: collision with root package name */
        private final int f85466a;

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
            return H.f85148a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f85466a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.R0
        public final int zza() {
            return this.f85466a;
        }

        c(int i10) {
            this.f85466a = i10;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$d */
    public enum d implements R0 {
        MODE_UNKNOWN(0),
        MODE_ACCURATE(1),
        MODE_FAST(2),
        MODE_SELFIE(3);


        /* renamed from: f, reason: collision with root package name */
        private static final U0<d> f85471f = new J();

        /* renamed from: a, reason: collision with root package name */
        private final int f85473a;

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
            return K.f85225a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f85473a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.R0
        public final int zza() {
            return this.f85473a;
        }

        d(int i10) {
            this.f85473a = i10;
        }
    }

    static {
        C11186p c11186p = new C11186p();
        zzj = c11186p;
        O0.k(C11186p.class, c11186p);
    }

    /* JADX WARN: Type inference failed for: r11v12, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.p>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11186p> i12;
        C11215z c11215z = null;
        switch (C11215z.f85521a[i10 - 1]) {
            case 1:
                return new C11186p();
            case 2:
                return new a(c11215z);
            case 3:
                return O0.i(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", d.b(), "zze", c.b(), "zzf", b.b(), "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                I1<C11186p> i13 = zzk;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11186p.class) {
                    try {
                        I1<C11186p> i14 = zzk;
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

    private C11186p() {
    }
}
