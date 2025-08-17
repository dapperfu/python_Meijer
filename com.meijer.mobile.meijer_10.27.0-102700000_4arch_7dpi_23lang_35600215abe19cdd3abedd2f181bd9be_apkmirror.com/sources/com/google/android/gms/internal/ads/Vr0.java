package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Vr0 extends Gu0 implements InterfaceC9227qv0 {
    private static final Vr0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;

    public static Vr0 f0() {
        return zza;
    }

    public final int b0() {
        return this.zzd;
    }

    public final Lr0 c0() {
        int i10 = this.zzc;
        Lr0 lr0 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? null : Lr0.SHA224 : Lr0.SHA512 : Lr0.SHA256 : Lr0.SHA384 : Lr0.SHA1 : Lr0.UNKNOWN_HASH;
        return lr0 == null ? Lr0.UNRECOGNIZED : lr0;
    }

    static {
        Vr0 vr0 = new Vr0();
        zza = vr0;
        Gu0.E(Vr0.class, vr0);
    }

    public static Tr0 d0() {
        return (Tr0) zza.n();
    }

    private Vr0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Ur0 ur0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (Vr0.class) {
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
                    return new Tr0(ur0);
                }
                return new Vr0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
