package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ac0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6549Ac0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C6549Ac0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private Ou0 zzd = Gu0.o();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C6549Ac0 c6549Ac0 = new C6549Ac0();
        zza = c6549Ac0;
        Gu0.E(C6549Ac0.class, c6549Ac0);
    }

    public static C10044yc0 b0() {
        return (C10044yc0) zza.n();
    }

    static /* synthetic */ void e0(C6549Ac0 c6549Ac0, int i10) {
        Ou0 ou0 = c6549Ac0.zzd;
        if (!ou0.zzc()) {
            c6549Ac0.zzd = Gu0.p(ou0);
        }
        c6549Ac0.zzd.zzi(2);
    }

    private C6549Ac0() {
    }

    static /* synthetic */ void d0(C6549Ac0 c6549Ac0, String str) {
        str.getClass();
        c6549Ac0.zzc |= 1;
        c6549Ac0.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C10151zc0 c10151zc0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C6549Ac0.class) {
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
                    return new C10044yc0(c10151zc0);
                }
                return new C6549Ac0();
            }
            return Gu0.x(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", C9937xc0.f79822a, "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
