package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9085pe extends Gu0<C9085pe, C8978oe> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C9085pe zzc;
    private static volatile InterfaceC9868wv0<C9085pe> zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z10) {
        this.zze |= 1;
        this.zzf = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i10) {
        this.zze |= 2;
        this.zzg = i10;
    }

    public boolean f0() {
        return this.zzf;
    }

    static {
        C9085pe c9085pe = new C9085pe();
        zzc = c9085pe;
        Gu0.E(C9085pe.class, c9085pe);
    }

    public static C8978oe d0() {
        return zzc.n();
    }

    private C9085pe() {
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
                                InterfaceC9868wv0<C9085pe> interfaceC9868wv0 = zzd;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9085pe.class) {
                                        try {
                                            bu0 = zzd;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzc);
                                                zzd = bu0;
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
                        return zzc;
                    }
                    return new C8978oe();
                }
                return new C9085pe();
            }
            return Gu0.x(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
