package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class zzyg {
    public static zzvw zza(zzacc zzaccVar) throws zzwa {
        boolean z10;
        try {
            try {
                zzaccVar.zzr();
                z10 = false;
            } catch (EOFException e10) {
                e = e10;
                z10 = true;
            }
            try {
                return (zzvw) zzabh.zzV.read(zzaccVar);
            } catch (EOFException e11) {
                e = e11;
                if (z10) {
                    return zzvy.zza;
                }
                throw new zzwe(e);
            }
        } catch (zzacf e12) {
            throw new zzwe(e12);
        } catch (IOException e13) {
            throw new zzvx(e13);
        } catch (NumberFormatException e14) {
            throw new zzwe(e14);
        }
    }
}
