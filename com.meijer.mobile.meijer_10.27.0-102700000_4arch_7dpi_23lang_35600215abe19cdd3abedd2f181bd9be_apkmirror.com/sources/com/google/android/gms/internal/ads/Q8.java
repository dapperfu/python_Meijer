package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Q8 extends Gu0 implements InterfaceC9227qv0 {
    private static final Q8 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private long zzf;
    private long zzh;
    private String zzd = "";
    private String zze = "";
    private String zzg = "D";

    static /* synthetic */ void d0(Q8 q82, String str) {
        q82.zzc |= 1;
        q82.zzd = "1.671910402";
    }

    static /* synthetic */ void g0(Q8 q82, long j10) {
        q82.zzc |= 4;
        q82.zzf = j10;
    }

    static /* synthetic */ void h0(Q8 q82, long j10) {
        q82.zzc |= 16;
        q82.zzh = j10;
    }

    static {
        Q8 q82 = new Q8();
        zza = q82;
        Gu0.E(Q8.class, q82);
    }

    public static P8 b0() {
        return (P8) zza.n();
    }

    private Q8() {
    }

    static /* synthetic */ void e0(Q8 q82, String str) {
        str.getClass();
        q82.zzc |= 2;
        q82.zze = str;
    }

    static /* synthetic */ void f0(Q8 q82, String str) {
        str.getClass();
        q82.zzc |= 8;
        q82.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Y8 y82 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (Q8.class) {
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
                                return interfaceC9868wv0;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new P8(y82);
                }
                return new Q8();
            }
            return Gu0.x(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
