package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11046k extends O0<C11046k, a> implements InterfaceC11089y1 {
    private static final V0<Integer, P> zzd = new A();
    private static final C11046k zze;
    private static volatile I1<C11046k> zzf;
    private W0 zzc = O0.n();

    /* renamed from: com.google.android.gms.internal.vision.k$a */
    public static final class a extends O0.b<C11046k, a> implements InterfaceC11089y1 {
        private a() {
            super(C11046k.zze);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.A, com.google.android.gms.internal.vision.V0<java.lang.Integer, com.google.android.gms.internal.vision.P>] */
    static {
        C11046k c11046k = new C11046k();
        zze = c11046k;
        O0.k(C11046k.class, c11046k);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.k>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11046k> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11046k();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", P.b()});
            case 4:
                return zze;
            case 5:
                I1<C11046k> i13 = zzf;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11046k.class) {
                    try {
                        I1<C11046k> i14 = zzf;
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

    private C11046k() {
    }
}
