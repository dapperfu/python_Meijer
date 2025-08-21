package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.gms.internal.ads.Je, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6983Je extends Gu0<C6983Je, C6949Ie> implements InterfaceC9352qv0 {
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private static final C6983Je zzn;
    private static volatile InterfaceC9993wv0<C6983Je> zzo;
    private C6711Be zzA;
    private C6847Fe zzB;
    private C9208pd zzC;
    private C8566jd zzD;
    private C10063xd zzE;
    private C9210pe zzF;
    private C7929de zzG;
    private int zzp;
    private int zzu;
    private int zzw;
    private C6981Jd zzy;
    private String zzv = "";
    private int zzx = 1000;
    private Ru0 zzz = Gu0.q();

    public String k0() {
        return this.zzv;
    }

    static {
        C6983Je c6983Je = new C6983Je();
        zzn = c6983Je;
        Gu0.E(C6983Je.class, c6983Je);
    }

    private void p0() {
        Ru0 ru0 = this.zzz;
        if (ru0.zzc()) {
            return;
        }
        this.zzz = Gu0.r(ru0);
    }

    public static C6949Ie v0() {
        return zzn.n();
    }

    public C8566jd t0() {
        C8566jd c8566jd = this.zzD;
        return c8566jd == null ? C8566jd.h0() : c8566jd;
    }

    public C6711Be u0() {
        C6711Be c6711Be = this.zzA;
        return c6711Be == null ? C6711Be.g0() : c6711Be;
    }

    private C6983Je() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(Iterable<? extends Long> iterable) {
        p0();
        Ht0.g(iterable, this.zzz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.zzp |= 2;
        this.zzv = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(C10063xd c10063xd) {
        c10063xd.getClass();
        this.zzE = c10063xd;
        this.zzp |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(C9210pe c9210pe) {
        c9210pe.getClass();
        this.zzF = c9210pe;
        this.zzp |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        this.zzz = Gu0.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(C8566jd c8566jd) {
        c8566jd.getClass();
        this.zzD = c8566jd;
        this.zzp |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(C7929de c7929de) {
        c7929de.getClass();
        this.zzG = c7929de;
        this.zzp |= RecyclerView.m.FLAG_MOVED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(C6711Be c6711Be) {
        c6711Be.getClass();
        this.zzA = c6711Be;
        this.zzp |= 32;
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
                                InterfaceC9993wv0<C6983Je> interfaceC9993wv0 = zzo;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C6983Je.class) {
                                        try {
                                            bu0 = zzo;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzn);
                                                zzo = bu0;
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
                        return zzn;
                    }
                    return new C6949Ie();
                }
                return new C6983Je();
            }
            return Gu0.x(zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", EnumC6881Ge.b(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
        }
        return (byte) 1;
    }
}
