package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11206w extends O0<C11206w, a> implements InterfaceC11214y1 {
    private static final C11206w zzh;
    private static volatile I1<C11206w> zzi;
    private int zzc;
    private C11177m zzd;
    private int zze;
    private C11189q zzf;
    private C11174l zzg;

    /* renamed from: com.google.android.gms.internal.vision.w$a */
    public static final class a extends O0.b<C11206w, a> implements InterfaceC11214y1 {
        private a() {
            super(C11206w.zzh);
        }

        /* synthetic */ a(C11215z c11215z) {
            this();
        }
    }

    static {
        C11206w c11206w = new C11206w();
        zzh = c11206w;
        O0.k(C11206w.class, c11206w);
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.w>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11206w> i12;
        C11215z c11215z = null;
        switch (C11215z.f85521a[i10 - 1]) {
            case 1:
                return new C11206w();
            case 2:
                return new a(c11215z);
            case 3:
                return O0.i(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                I1<C11206w> i13 = zzi;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11206w.class) {
                    try {
                        I1<C11206w> i14 = zzi;
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

    private C11206w() {
    }
}
