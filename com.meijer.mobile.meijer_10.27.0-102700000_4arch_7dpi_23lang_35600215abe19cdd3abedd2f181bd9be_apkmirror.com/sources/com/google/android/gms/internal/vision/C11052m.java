package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11052m extends O0<C11052m, a> implements InterfaceC11089y1 {
    private static final C11052m zzd;
    private static volatile I1<C11052m> zze;
    private X0<C11078v> zzc = O0.o();

    /* renamed from: com.google.android.gms.internal.vision.m$a */
    public static final class a extends O0.b<C11052m, a> implements InterfaceC11089y1 {
        private a() {
            super(C11052m.zzd);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }
    }

    static {
        C11052m c11052m = new C11052m();
        zzd = c11052m;
        O0.k(C11052m.class, c11052m);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.m>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11052m> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11052m();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C11078v.class});
            case 4:
                return zzd;
            case 5:
                I1<C11052m> i13 = zze;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11052m.class) {
                    try {
                        I1<C11052m> i14 = zze;
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

    private C11052m() {
    }
}
