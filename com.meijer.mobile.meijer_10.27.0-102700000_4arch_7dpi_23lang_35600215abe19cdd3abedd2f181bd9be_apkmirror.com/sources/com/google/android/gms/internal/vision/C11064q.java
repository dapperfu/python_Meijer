package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11064q extends O0<C11064q, a> implements InterfaceC11089y1 {
    private static final C11064q zzj;
    private static volatile I1<C11064q> zzk;
    private int zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.q$a */
    public static final class a extends O0.b<C11064q, a> implements InterfaceC11089y1 {
        private a() {
            super(C11064q.zzj);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }
    }

    static {
        C11064q c11064q = new C11064q();
        zzj = c11064q;
        O0.k(C11064q.class, c11064q);
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.q>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11064q> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11064q();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                I1<C11064q> i13 = zzk;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11064q.class) {
                    try {
                        I1<C11064q> i14 = zzk;
                        i12 = i14;
                        if (i14 == null) {
                            ?? aVar = new O0.a(zzj);
                            zzk = aVar;
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

    private C11064q() {
    }
}
