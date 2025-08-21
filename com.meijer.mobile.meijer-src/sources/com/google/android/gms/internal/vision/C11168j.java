package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11168j extends O0<C11168j, a> implements InterfaceC11214y1 {
    private static final C11168j zzf;
    private static volatile I1<C11168j> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* renamed from: com.google.android.gms.internal.vision.j$a */
    public static final class a extends O0.b<C11168j, a> implements InterfaceC11214y1 {
        private a() {
            super(C11168j.zzf);
        }

        /* synthetic */ a(C11215z c11215z) {
            this();
        }

        public final a k(String str) {
            if (this.f85247c) {
                g();
                this.f85247c = false;
            }
            ((C11168j) this.f85246b).r(str);
            return this;
        }

        public final a l(String str) {
            if (this.f85247c) {
                g();
                this.f85247c = false;
            }
            ((C11168j) this.f85246b).u(str);
            return this;
        }
    }

    static {
        C11168j c11168j = new C11168j();
        zzf = c11168j;
        O0.k(C11168j.class, c11168j);
    }

    public static a p() {
        return zzf.m();
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.j>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11168j> i12;
        C11215z c11215z = null;
        switch (C11215z.f85521a[i10 - 1]) {
            case 1:
                return new C11168j();
            case 2:
                return new a(c11215z);
            case 3:
                return O0.i(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                I1<C11168j> i13 = zzg;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11168j.class) {
                    try {
                        I1<C11168j> i14 = zzg;
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

    private C11168j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }
}
