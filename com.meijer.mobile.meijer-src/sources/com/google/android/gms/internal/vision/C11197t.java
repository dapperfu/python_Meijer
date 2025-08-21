package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11197t extends O0<C11197t, a> implements InterfaceC11214y1 {
    private static final C11197t zzj;
    private static volatile I1<C11197t> zzk;
    private int zzc;
    private long zze;
    private C11168j zzf;
    private C11186p zzh;
    private C11171k zzi;
    private String zzd = "";
    private String zzg = "";

    /* renamed from: com.google.android.gms.internal.vision.t$a */
    public static final class a extends O0.b<C11197t, a> implements InterfaceC11214y1 {
        private a() {
            super(C11197t.zzj);
        }

        /* synthetic */ a(C11215z c11215z) {
            this();
        }
    }

    static {
        C11197t c11197t = new C11197t();
        zzj = c11197t;
        O0.k(C11197t.class, c11197t);
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.t>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11197t> i12;
        C11215z c11215z = null;
        switch (C11215z.f85521a[i10 - 1]) {
            case 1:
                return new C11197t();
            case 2:
                return new a(c11215z);
            case 3:
                return O0.i(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                I1<C11197t> i13 = zzk;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11197t.class) {
                    try {
                        I1<C11197t> i14 = zzk;
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

    private C11197t() {
    }
}
