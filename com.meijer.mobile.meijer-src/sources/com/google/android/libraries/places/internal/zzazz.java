package com.google.android.libraries.places.internal;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class zzazz extends zzayo {
    private final zzbae zza;

    public zzazz(zzbae zzbaeVar) {
        this.zza = zzbaeVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbbt
    public final /* synthetic */ Object zzb(zzazc zzazcVar, zzazp zzazpVar) throws zzbar {
        int i10 = zzbae.zzd;
        zzbae zzbaeVarZzbg = this.zza.zzbg();
        try {
            zzbbz zzbbzVarZzb = zzbbv.zza().zzb(zzbaeVarZzbg.getClass());
            zzbbzVarZzb.zzg(zzbaeVarZzbg, zzazd.zza(zzazcVar), zzazpVar);
            zzbbzVarZzb.zzh(zzbaeVarZzbg);
            return zzbaeVarZzbg;
        } catch (zzbar e10) {
            if (e10.zzb()) {
                throw new zzbar(e10);
            }
            throw e10;
        } catch (zzbcl e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzbar) {
                throw ((zzbar) e12.getCause());
            }
            throw new zzbar(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzbar) {
                throw ((zzbar) e13.getCause());
            }
            throw e13;
        }
    }
}
