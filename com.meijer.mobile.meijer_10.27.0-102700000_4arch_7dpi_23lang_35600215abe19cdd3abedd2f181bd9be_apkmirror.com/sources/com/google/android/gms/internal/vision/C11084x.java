package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11084x extends O0<C11084x, a> implements InterfaceC11089y1 {
    private static final C11084x zzi;
    private static volatile I1<C11084x> zzj;
    private int zzc;
    private C11055n zzd;
    private C11072t zze;
    private r zzf;
    private int zzg;
    private boolean zzh;

    /* renamed from: com.google.android.gms.internal.vision.x$a */
    public static final class a extends O0.b<C11084x, a> implements InterfaceC11089y1 {
        private a() {
            super(C11084x.zzi);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }

        public final a k(r rVar) {
            if (this.f84407c) {
                g();
                this.f84407c = false;
            }
            ((C11084x) this.f84406b).q(rVar);
            return this;
        }
    }

    static {
        C11084x c11084x = new C11084x();
        zzi = c11084x;
        O0.k(C11084x.class, c11084x);
    }

    public static a p() {
        return zzi.m();
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.x>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11084x> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11084x();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                I1<C11084x> i13 = zzj;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11084x.class) {
                    try {
                        I1<C11084x> i14 = zzj;
                        i12 = i14;
                        if (i14 == null) {
                            ?? aVar = new O0.a(zzi);
                            zzj = aVar;
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

    private C11084x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(r rVar) {
        rVar.getClass();
        this.zzf = rVar;
        this.zzc |= 4;
    }
}
