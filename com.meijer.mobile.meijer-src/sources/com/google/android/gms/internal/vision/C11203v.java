package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11203v extends O0<C11203v, a> implements InterfaceC11214y1 {
    private static final C11203v zzf;
    private static volatile I1<C11203v> zzg;
    private int zzc;
    private int zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.vision.v$a */
    public static final class a extends O0.b<C11203v, a> implements InterfaceC11214y1 {
        private a() {
            super(C11203v.zzf);
        }

        /* synthetic */ a(C11215z c11215z) {
            this();
        }
    }

    static {
        C11203v c11203v = new C11203v();
        zzf = c11203v;
        O0.k(C11203v.class, c11203v);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.v>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11203v> i12;
        C11215z c11215z = null;
        switch (C11215z.f85521a[i10 - 1]) {
            case 1:
                return new C11203v();
            case 2:
                return new a(c11215z);
            case 3:
                return O0.i(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                I1<C11203v> i13 = zzg;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11203v.class) {
                    try {
                        I1<C11203v> i14 = zzg;
                        i12 = i14;
                        if (i14 == null) {
                            ?? aVar = new O0.a(zzf);
                            zzg = aVar;
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

    private C11203v() {
    }
}
