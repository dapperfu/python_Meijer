package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.gms.internal.ads.Je, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6858Je extends Gu0<C6858Je, C6824Ie> implements InterfaceC9227qv0 {
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
    private static final C6858Je zzn;
    private static volatile InterfaceC9868wv0<C6858Je> zzo;
    private C6586Be zzA;
    private C6722Fe zzB;
    private C9083pd zzC;
    private C8441jd zzD;
    private C9938xd zzE;
    private C9085pe zzF;
    private C7804de zzG;
    private int zzp;
    private int zzu;
    private int zzw;
    private C6856Jd zzy;
    private String zzv = "";
    private int zzx = 1000;
    private Ru0 zzz = Gu0.q();

    public String k0() {
        return this.zzv;
    }

    static {
        C6858Je c6858Je = new C6858Je();
        zzn = c6858Je;
        Gu0.E(C6858Je.class, c6858Je);
    }

    private void p0() {
        Ru0 ru0 = this.zzz;
        if (ru0.zzc()) {
            return;
        }
        this.zzz = Gu0.r(ru0);
    }

    public static C6824Ie v0() {
        return zzn.n();
    }

    public C8441jd t0() {
        C8441jd c8441jd = this.zzD;
        return c8441jd == null ? C8441jd.h0() : c8441jd;
    }

    public C6586Be u0() {
        C6586Be c6586Be = this.zzA;
        return c6586Be == null ? C6586Be.g0() : c6586Be;
    }

    private C6858Je() {
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
    public void m0(C9938xd c9938xd) {
        c9938xd.getClass();
        this.zzE = c9938xd;
        this.zzp |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(C9085pe c9085pe) {
        c9085pe.getClass();
        this.zzF = c9085pe;
        this.zzp |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        this.zzz = Gu0.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(C8441jd c8441jd) {
        c8441jd.getClass();
        this.zzD = c8441jd;
        this.zzp |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(C7804de c7804de) {
        c7804de.getClass();
        this.zzG = c7804de;
        this.zzp |= RecyclerView.m.FLAG_MOVED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(C6586Be c6586Be) {
        c6586Be.getClass();
        this.zzA = c6586Be;
        this.zzp |= 32;
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
                                InterfaceC9868wv0<C6858Je> interfaceC9868wv0 = zzo;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C6858Je.class) {
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
                                return interfaceC9868wv0;
                            }
                            throw null;
                        }
                        return zzn;
                    }
                    return new C6824Ie();
                }
                return new C6858Je();
            }
            return Gu0.x(zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", EnumC6756Ge.b(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
        }
        return (byte) 1;
    }
}
