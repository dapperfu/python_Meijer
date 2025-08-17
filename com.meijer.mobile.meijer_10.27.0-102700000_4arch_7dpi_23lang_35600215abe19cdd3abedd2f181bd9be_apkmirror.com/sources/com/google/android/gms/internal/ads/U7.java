package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class U7 extends Gu0 implements InterfaceC9227qv0 {
    private static final U7 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private Su0 zzo = Gu0.s();

    static /* synthetic */ void e0(U7 u72, String str) {
        u72.zzc |= 16;
        u72.zzh = str;
    }

    static /* synthetic */ void f0(U7 u72, String str) {
        u72.zzc |= 1024;
        u72.zzn = str;
    }

    static /* synthetic */ void h0(U7 u72, long j10) {
        u72.zzc |= 2;
        u72.zze = j10;
    }

    static /* synthetic */ void j0(U7 u72, int i10) {
        u72.zzp = i10 - 1;
        u72.zzc |= RecyclerView.m.FLAG_MOVED;
    }

    static {
        U7 u72 = new U7();
        zza = u72;
        Gu0.E(U7.class, u72);
    }

    public static Q7 b0() {
        return (Q7) zza.n();
    }

    private U7() {
    }

    static /* synthetic */ void d0(U7 u72, String str) {
        str.getClass();
        u72.zzc |= 1;
        u72.zzd = str;
    }

    static /* synthetic */ void g0(U7 u72, String str) {
        str.getClass();
        u72.zzc |= 8;
        u72.zzg = str;
    }

    static /* synthetic */ void i0(U7 u72, String str) {
        str.getClass();
        u72.zzc |= 4;
        u72.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    V7 v72 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (U7.class) {
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
                    return new Q7(v72);
                }
                return new U7();
            }
            return Gu0.x(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", S7.class, "zzp", T7.f70304a});
        }
        return (byte) 1;
    }
}
