package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class E8 extends Gu0 implements InterfaceC9352qv0 {
    private static final E8 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static /* synthetic */ void d0(E8 e82) {
        e82.zzc &= -9;
        e82.zzg = -1L;
    }

    static /* synthetic */ void e0(E8 e82, long j10) {
        e82.zzc |= 8;
        e82.zzg = j10;
    }

    static /* synthetic */ void f0(E8 e82, long j10) {
        e82.zzc |= 32;
        e82.zzi = j10;
    }

    static /* synthetic */ void g0(E8 e82, long j10) {
        e82.zzc |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        e82.zzp = j10;
    }

    static /* synthetic */ void h0(E8 e82, long j10) {
        e82.zzc |= 512;
        e82.zzm = j10;
    }

    static /* synthetic */ void i0(E8 e82, long j10) {
        e82.zzc |= RecyclerView.m.FLAG_MOVED;
        e82.zzo = j10;
    }

    static /* synthetic */ void j0(E8 e82, long j10) {
        e82.zzc |= 4;
        e82.zzf = j10;
    }

    static /* synthetic */ void k0(E8 e82, long j10) {
        e82.zzc |= 16;
        e82.zzh = j10;
    }

    static /* synthetic */ void l0(E8 e82, long j10) {
        e82.zzc |= 128;
        e82.zzk = j10;
    }

    static /* synthetic */ void m0(E8 e82, long j10) {
        e82.zzc |= 131072;
        e82.zzy = j10;
    }

    static /* synthetic */ void n0(E8 e82, long j10) {
        e82.zzc |= 1;
        e82.zzd = j10;
    }

    static /* synthetic */ void o0(E8 e82, long j10) {
        e82.zzc |= 262144;
        e82.zzz = j10;
    }

    static /* synthetic */ void p0(E8 e82, long j10) {
        e82.zzc |= 2;
        e82.zze = j10;
    }

    static /* synthetic */ void q0(E8 e82, long j10) {
        e82.zzc |= 256;
        e82.zzl = j10;
    }

    static /* synthetic */ void r0(E8 e82, long j10) {
        e82.zzc |= 32768;
        e82.zzw = j10;
    }

    static /* synthetic */ void s0(E8 e82, long j10) {
        e82.zzc |= 65536;
        e82.zzx = j10;
    }

    static /* synthetic */ void t0(E8 e82, long j10) {
        e82.zzc |= 8192;
        e82.zzu = j10;
    }

    static /* synthetic */ void u0(E8 e82, long j10) {
        e82.zzc |= 16384;
        e82.zzv = j10;
    }

    static /* synthetic */ void v0(E8 e82, int i10) {
        e82.zzn = i10 - 1;
        e82.zzc |= 1024;
    }

    static /* synthetic */ void w0(E8 e82, int i10) {
        e82.zzj = i10 - 1;
        e82.zzc |= 64;
    }

    static {
        E8 e82 = new E8();
        zza = e82;
        Gu0.E(E8.class, e82);
    }

    public static D8 b0() {
        return (D8) zza.n();
    }

    private E8() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Y8 y82 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (E8.class) {
                                        try {
                                            bu0 = zzb;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zza);
                                                zzb = bu0;
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
                        return zza;
                    }
                    return new D8(y82);
                }
                return new E8();
            }
            Mu0 mu0 = O8.f69849a;
            return Gu0.x(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", mu0, "zzk", "zzl", "zzm", "zzn", mu0, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
        }
        return (byte) 1;
    }
}
