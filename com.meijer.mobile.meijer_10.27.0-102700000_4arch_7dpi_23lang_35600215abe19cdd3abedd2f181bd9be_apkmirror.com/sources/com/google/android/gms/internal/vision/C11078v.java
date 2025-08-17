package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11078v extends O0<C11078v, a> implements InterfaceC11089y1 {
    private static final C11078v zzf;
    private static volatile I1<C11078v> zzg;
    private int zzc;
    private int zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.vision.v$a */
    public static final class a extends O0.b<C11078v, a> implements InterfaceC11089y1 {
        private a() {
            super(C11078v.zzf);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }
    }

    static {
        C11078v c11078v = new C11078v();
        zzf = c11078v;
        O0.k(C11078v.class, c11078v);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.v>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11078v> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11078v();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                I1<C11078v> i13 = zzg;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11078v.class) {
                    try {
                        I1<C11078v> i14 = zzg;
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

    private C11078v() {
    }
}
