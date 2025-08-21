package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11200u extends O0<C11200u, a> implements InterfaceC11214y1 {
    private static final C11200u zzf;
    private static volatile I1<C11200u> zzg;
    private int zzc;
    private long zzd;
    private long zze;

    /* renamed from: com.google.android.gms.internal.vision.u$a */
    public static final class a extends O0.b<C11200u, a> implements InterfaceC11214y1 {
        private a() {
            super(C11200u.zzf);
        }

        /* synthetic */ a(C11215z c11215z) {
            this();
        }
    }

    static {
        C11200u c11200u = new C11200u();
        zzf = c11200u;
        O0.k(C11200u.class, c11200u);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.u>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11200u> i12;
        C11215z c11215z = null;
        switch (C11215z.f85521a[i10 - 1]) {
            case 1:
                return new C11200u();
            case 2:
                return new a(c11215z);
            case 3:
                return O0.i(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                I1<C11200u> i13 = zzg;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11200u.class) {
                    try {
                        I1<C11200u> i14 = zzg;
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

    private C11200u() {
    }
}
