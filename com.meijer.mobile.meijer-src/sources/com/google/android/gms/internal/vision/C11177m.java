package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11177m extends O0<C11177m, a> implements InterfaceC11214y1 {
    private static final C11177m zzd;
    private static volatile I1<C11177m> zze;
    private X0<C11203v> zzc = O0.o();

    /* renamed from: com.google.android.gms.internal.vision.m$a */
    public static final class a extends O0.b<C11177m, a> implements InterfaceC11214y1 {
        private a() {
            super(C11177m.zzd);
        }

        /* synthetic */ a(C11215z c11215z) {
            this();
        }
    }

    static {
        C11177m c11177m = new C11177m();
        zzd = c11177m;
        O0.k(C11177m.class, c11177m);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.m>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11177m> i12;
        C11215z c11215z = null;
        switch (C11215z.f85521a[i10 - 1]) {
            case 1:
                return new C11177m();
            case 2:
                return new a(c11215z);
            case 3:
                return O0.i(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C11203v.class});
            case 4:
                return zzd;
            case 5:
                I1<C11177m> i13 = zze;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11177m.class) {
                    try {
                        I1<C11177m> i14 = zze;
                        i12 = i14;
                        if (i14 == null) {
                            ?? aVar = new O0.a(zzd);
                            zze = aVar;
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

    private C11177m() {
    }
}
