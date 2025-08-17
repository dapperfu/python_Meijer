package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11075u extends O0<C11075u, a> implements InterfaceC11089y1 {
    private static final C11075u zzf;
    private static volatile I1<C11075u> zzg;
    private int zzc;
    private long zzd;
    private long zze;

    /* renamed from: com.google.android.gms.internal.vision.u$a */
    public static final class a extends O0.b<C11075u, a> implements InterfaceC11089y1 {
        private a() {
            super(C11075u.zzf);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }
    }

    static {
        C11075u c11075u = new C11075u();
        zzf = c11075u;
        O0.k(C11075u.class, c11075u);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.u>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11075u> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11075u();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                I1<C11075u> i13 = zzg;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11075u.class) {
                    try {
                        I1<C11075u> i14 = zzg;
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

    private C11075u() {
    }
}
