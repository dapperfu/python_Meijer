package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9938xd extends Gu0<C9938xd, C9617ud> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C9938xd zzi;
    private static volatile InterfaceC9868wv0<C9938xd> zzj;
    private int zzk;
    private int zzm;
    private int zzn;
    private long zzo;
    private long zzv;
    private int zzw;
    private Su0<C9403sd> zzl = Gu0.s();
    private String zzp = "";
    private String zzu = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(int i10) {
        this.zzk |= 1;
        this.zzm = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(long j10) {
        this.zzk |= 32;
        this.zzv = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i10) {
        this.zzk |= 2;
        this.zzn = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(long j10) {
        this.zzk |= 4;
        this.zzo = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(int i10) {
        this.zzk |= 64;
        this.zzw = i10;
    }

    static {
        C9938xd c9938xd = new C9938xd();
        zzi = c9938xd;
        Gu0.E(C9938xd.class, c9938xd);
    }

    private void o0() {
        Su0<C9403sd> su0 = this.zzl;
        if (su0.zzc()) {
            return;
        }
        this.zzl = Gu0.t(su0);
    }

    public static C9617ud s0() {
        return zzi.n();
    }

    private C9938xd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(Iterable<? extends C9403sd> iterable) {
        o0();
        Ht0.g(iterable, this.zzl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(String str) {
        str.getClass();
        this.zzk |= 8;
        this.zzp = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(String str) {
        str.getClass();
        this.zzk |= 16;
        this.zzu = str;
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
                                InterfaceC9868wv0<C9938xd> interfaceC9868wv0 = zzj;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9938xd.class) {
                                        try {
                                            bu0 = zzj;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzi);
                                                zzj = bu0;
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
                        return zzi;
                    }
                    return new C9617ud();
                }
                return new C9938xd();
            }
            return Gu0.x(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", C9403sd.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
        }
        return (byte) 1;
    }
}
