package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11081w extends O0<C11081w, a> implements InterfaceC11089y1 {
    private static final C11081w zzh;
    private static volatile I1<C11081w> zzi;
    private int zzc;
    private C11052m zzd;
    private int zze;
    private C11064q zzf;
    private C11049l zzg;

    /* renamed from: com.google.android.gms.internal.vision.w$a */
    public static final class a extends O0.b<C11081w, a> implements InterfaceC11089y1 {
        private a() {
            super(C11081w.zzh);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }
    }

    static {
        C11081w c11081w = new C11081w();
        zzh = c11081w;
        O0.k(C11081w.class, c11081w);
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.w>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11081w> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11081w();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                I1<C11081w> i13 = zzi;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11081w.class) {
                    try {
                        I1<C11081w> i14 = zzi;
                        i12 = i14;
                        if (i14 == null) {
                            ?? aVar = new O0.a(zzh);
                            zzi = aVar;
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

    private C11081w() {
    }
}
