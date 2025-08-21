package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8566jd extends Gu0<C8566jd, C8461id> implements InterfaceC9352qv0 {
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private static final C8566jd zzl;
    private static volatile InterfaceC9993wv0<C8566jd> zzm;
    private C7118Ne zzA;
    private C7186Pe zzB;
    private int zzn;
    private int zzo;
    private C9851ve zzu;
    private C10065xe zzv;
    private C10279ze zzx;
    private C10277zd zzy;
    private C9421rd zzz;
    private int zzp = 1000;
    private Su0<C9637te> zzw = Gu0.s();
    private Su0<C7049Ld> zzC = Gu0.s();

    public static C8566jd h0() {
        return zzl;
    }

    static {
        C8566jd c8566jd = new C8566jd();
        zzl = c8566jd;
        Gu0.E(C8566jd.class, c8566jd);
    }

    public C10065xe d0() {
        C10065xe c10065xe = this.zzv;
        return c10065xe == null ? C10065xe.e0() : c10065xe;
    }

    private C8566jd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(EnumC8247gd enumC8247gd) {
        this.zzo = enumC8247gd.zza();
        this.zzn |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(C10065xe c10065xe) {
        c10065xe.getClass();
        this.zzv = c10065xe;
        this.zzn |= 8;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7220Qe c7220Qe = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0<C8566jd> interfaceC9993wv0 = zzm;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C8566jd.class) {
                                        try {
                                            bu0 = zzm;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzl);
                                                zzm = bu0;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    return bu0;
                                }
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zzl;
                    }
                    return new C8461id();
                }
                return new C8566jd();
            }
            return Gu0.x(zzl, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", EnumC8247gd.b(), "zzp", EnumC6881Ge.b(), "zzu", "zzv", "zzw", C9637te.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", C7049Ld.class});
        }
        return (byte) 1;
    }
}
