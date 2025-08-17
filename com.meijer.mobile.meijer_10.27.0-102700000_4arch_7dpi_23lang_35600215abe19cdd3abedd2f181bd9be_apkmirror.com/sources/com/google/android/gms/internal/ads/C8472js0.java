package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.js0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8472js0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C8472js0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private Zr0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final int b0() {
        return this.zzf;
    }

    public final Es0 f0() {
        Es0 es0A = Es0.a(this.zzg);
        return es0A == null ? Es0.UNRECOGNIZED : es0A;
    }

    public final boolean j0() {
        return (this.zzc & 1) != 0;
    }

    public final int k0() {
        int i10 = this.zze;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    static {
        C8472js0 c8472js0 = new C8472js0();
        zza = c8472js0;
        Gu0.E(C8472js0.class, c8472js0);
    }

    public static C8366is0 d0() {
        return (C8366is0) zza.n();
    }

    public final Zr0 c0() {
        Zr0 zr0 = this.zzd;
        return zr0 == null ? Zr0.e0() : zr0;
    }

    private C8472js0() {
    }

    static /* synthetic */ void g0(C8472js0 c8472js0, Zr0 zr0) {
        zr0.getClass();
        c8472js0.zzd = zr0;
        c8472js0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8579ks0 c8579ks0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C8472js0.class) {
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
                    return new C8366is0(c8579ks0);
                }
                return new C8472js0();
            }
            return Gu0.x(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
