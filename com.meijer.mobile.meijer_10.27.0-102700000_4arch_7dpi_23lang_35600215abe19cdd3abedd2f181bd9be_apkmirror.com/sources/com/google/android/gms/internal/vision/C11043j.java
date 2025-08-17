package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* renamed from: com.google.android.gms.internal.vision.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11043j extends O0<C11043j, a> implements InterfaceC11089y1 {
    private static final C11043j zzf;
    private static volatile I1<C11043j> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* renamed from: com.google.android.gms.internal.vision.j$a */
    public static final class a extends O0.b<C11043j, a> implements InterfaceC11089y1 {
        private a() {
            super(C11043j.zzf);
        }

        /* synthetic */ a(C11090z c11090z) {
            this();
        }

        public final a k(String str) {
            if (this.f84407c) {
                g();
                this.f84407c = false;
            }
            ((C11043j) this.f84406b).r(str);
            return this;
        }

        public final a l(String str) {
            if (this.f84407c) {
                g();
                this.f84407c = false;
            }
            ((C11043j) this.f84406b).u(str);
            return this;
        }
    }

    static {
        C11043j c11043j = new C11043j();
        zzf = c11043j;
        O0.k(C11043j.class, c11043j);
    }

    public static a p() {
        return zzf.m();
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.I1<com.google.android.gms.internal.vision.j>, com.google.android.gms.internal.vision.O0$a] */
    @Override // com.google.android.gms.internal.vision.O0
    protected final Object h(int i10, Object obj, Object obj2) {
        I1<C11043j> i12;
        C11090z c11090z = null;
        switch (C11090z.f84681a[i10 - 1]) {
            case 1:
                return new C11043j();
            case 2:
                return new a(c11090z);
            case 3:
                return O0.i(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                I1<C11043j> i13 = zzg;
                if (i13 != null) {
                    return i13;
                }
                synchronized (C11043j.class) {
                    try {
                        I1<C11043j> i14 = zzg;
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

    private C11043j() {
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
