package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8441jd extends Gu0<C8441jd, C8336id> implements InterfaceC9227qv0 {
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
    private static final C8441jd zzl;
    private static volatile InterfaceC9868wv0<C8441jd> zzm;
    private C6993Ne zzA;
    private C7061Pe zzB;
    private int zzn;
    private int zzo;
    private C9726ve zzu;
    private C9940xe zzv;
    private C10154ze zzx;
    private C10152zd zzy;
    private C9296rd zzz;
    private int zzp = 1000;
    private Su0<C9512te> zzw = Gu0.s();
    private Su0<C6924Ld> zzC = Gu0.s();

    public static C8441jd h0() {
        return zzl;
    }

    static {
        C8441jd c8441jd = new C8441jd();
        zzl = c8441jd;
        Gu0.E(C8441jd.class, c8441jd);
    }

    public C9940xe d0() {
        C9940xe c9940xe = this.zzv;
        return c9940xe == null ? C9940xe.e0() : c9940xe;
    }

    private C8441jd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(EnumC8122gd enumC8122gd) {
        this.zzo = enumC8122gd.zza();
        this.zzn |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(C9940xe c9940xe) {
        c9940xe.getClass();
        this.zzv = c9940xe;
        this.zzn |= 8;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7095Qe c7095Qe = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0<C8441jd> interfaceC9868wv0 = zzm;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C8441jd.class) {
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
                                return interfaceC9868wv0;
                            }
                            throw null;
                        }
                        return zzl;
                    }
                    return new C8336id();
                }
                return new C8441jd();
            }
            return Gu0.x(zzl, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", EnumC8122gd.b(), "zzp", EnumC6756Ge.b(), "zzu", "zzv", "zzw", C9512te.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", C6924Ld.class});
        }
        return (byte) 1;
    }
}
