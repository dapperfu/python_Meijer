package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ls0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8686ls0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C8686ls0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private Su0 zzd = Gu0.s();

    public final int c0() {
        return this.zzc;
    }

    public final List h0() {
        return this.zzd;
    }

    static {
        C8686ls0 c8686ls0 = new C8686ls0();
        zza = c8686ls0;
        Gu0.E(C8686ls0.class, c8686ls0);
    }

    public static C8260hs0 d0() {
        return (C8260hs0) zza.n();
    }

    public static C8686ls0 g0(InputStream inputStream, C9225qu0 c9225qu0) throws IOException {
        return (C8686ls0) Gu0.O(zza, inputStream, c9225qu0);
    }

    public final int b0() {
        return this.zzd.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C8472js0 e0(int i10) {
        return (C8472js0) this.zzd.get(i10);
    }

    private C8686ls0() {
    }

    static /* synthetic */ void i0(C8686ls0 c8686ls0, C8472js0 c8472js0) {
        c8472js0.getClass();
        Su0 su0 = c8686ls0.zzd;
        if (!su0.zzc()) {
            c8686ls0.zzd = Gu0.t(su0);
        }
        c8686ls0.zzd.add(c8472js0);
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
                                    synchronized (C8686ls0.class) {
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
                    return new C8260hs0(c8579ks0);
                }
                return new C8686ls0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", C8472js0.class});
        }
        return (byte) 1;
    }
}
