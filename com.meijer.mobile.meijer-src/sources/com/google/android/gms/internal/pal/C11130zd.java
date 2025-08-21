package com.google.android.gms.internal.pal;

@Deprecated
/* renamed from: com.google.android.gms.internal.pal.zd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11130zd extends B0 implements InterfaceC10831h1 {
    private static final C11130zd zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    public final int t() {
        return this.zzg;
    }

    public final String v() {
        return this.zzi;
    }

    public final String w() {
        return this.zze;
    }

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        return this.zzh;
    }

    static {
        C11130zd c11130zd = new C11130zd();
        zzb = c11130zd;
        B0.j(C11130zd.class, c11130zd);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C11130zd();
        }
        C11098xd c11098xd = null;
        if (i11 == 4) {
            return new C11114yd(c11098xd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C11130zd() {
    }
}
