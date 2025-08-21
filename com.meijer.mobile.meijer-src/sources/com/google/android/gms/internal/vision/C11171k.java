package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11171k extends O0<C11171k, a> implements InterfaceC11214y1 {
    private static final V0<Integer, P> zzd = new A();
    private static final C11171k zze;
    private static volatile I1<C11171k> zzf;
    private W0 zzc = O0.n();

    /* renamed from: com.google.android.gms.internal.vision.k$a */
    public static final class a extends O0.b<C11171k, a> implements InterfaceC11214y1 {
        private a() {
            super(C11171k.zze);
        }

        /* synthetic */ a(C11215z c11215z) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.A, com.google.android.gms.internal.vision.V0<java.lang.Integer, com.google.android.gms.internal.vision.P>] */
    static {
        C11171k c11171k = new C11171k();
        zze = c11171k;
        O0.k(C11171k.class, c11171k);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.k>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11171k> i12;
        C11215z c11215z = null;
        switch (C11215z.f85521a[i10 - 1]) {
            case 1:
                return new C11171k();
            case 2:
                return new a(c11215z);
            case 3:
                return O0.i(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", P.b()});
            case 4:
                return zze;
            case 5:
                I1<C11171k> i13 = zzf;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11171k.class) {
                    try {
                        I1<C11171k> i14 = zzf;
                        i12 = i14;
                        if (i14 == null) {
                            ?? aVar = new O0.a(zze);
                            zzf = aVar;
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

    private C11171k() {
    }
}
