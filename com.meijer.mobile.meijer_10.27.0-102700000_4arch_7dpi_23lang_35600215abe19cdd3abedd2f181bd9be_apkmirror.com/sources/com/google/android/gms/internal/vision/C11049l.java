package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11049l extends O0<C11049l, a> implements InterfaceC11089y1 {
    private static final C11049l zzg;
    private static volatile I1<C11049l> zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    /* renamed from: com.google.android.gms.internal.vision.l$a */
    public static final class a extends O0.b<C11049l, a> implements InterfaceC11089y1 {
        private a() {
            super(C11049l.zzg);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }
    }

    static {
        C11049l c11049l = new C11049l();
        zzg = c11049l;
        O0.k(C11049l.class, c11049l);
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.l>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11049l> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11049l();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", P.b(), "zze", S.b(), "zzf"});
            case 4:
                return zzg;
            case 5:
                I1<C11049l> i13 = zzh;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11049l.class) {
                    try {
                        I1<C11049l> i14 = zzh;
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

    private C11049l() {
    }
}
