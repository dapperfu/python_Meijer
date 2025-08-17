package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zw0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10191zw0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C10191zw0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzv;
    private long zzw;
    private boolean zzy;
    private String zzf = "";
    private Su0 zzg = Gu0.s();
    private String zzl = "";
    private Su0 zzu = Gu0.s();
    private Ou0 zzx = Gu0.o();
    private Ou0 zzz = Gu0.o();

    static {
        C10191zw0 c10191zw0 = new C10191zw0();
        zza = c10191zw0;
        Gu0.E(C10191zw0.class, c10191zw0);
    }

    private C10191zw0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Nx0 nx0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C10191zw0.class) {
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
                    return new C9442sw0(nx0);
                }
                return new C10191zw0();
            }
            return Gu0.x(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzc", "zzd", C10084yw0.f80313a, "zze", "zzf", "zzg", "zzh", C9870ww0.f79619a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", C9763vw0.class, "zzv", "zzw", "zzx", C8694lw0.a(), "zzy", "zzz", C9977xw0.f79892a});
        }
        return (byte) 1;
    }
}
