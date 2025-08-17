package com.google.ads.interactivemedia.omid.library.adsession;

import android.view.View;
import com.google.ads.interactivemedia.v3.internal.zzcp;
import com.google.ads.interactivemedia.v3.internal.zzcr;
import com.google.ads.interactivemedia.v3.internal.zzcv;
import com.google.ads.interactivemedia.v3.internal.zzcz;
import com.google.ads.interactivemedia.v3.internal.zzdf;
import com.google.ads.interactivemedia.v3.internal.zzdg;
import com.google.ads.interactivemedia.v3.internal.zzdj;
import com.google.ads.interactivemedia.v3.internal.zzdp;
import com.google.ads.interactivemedia.v3.internal.zzeg;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class zze extends zza {
    private final zzc zza;
    private final zzcv zzb;
    private zzeg zzc;
    private zzdf zzd;
    private boolean zze;
    private boolean zzf;
    private final String zzg;

    public final zzdf zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzg;
    }

    public final List zzj() {
        return this.zzb.zza();
    }

    public final boolean zzk() {
        return this.zze && !this.zzf;
    }

    private final void zzl(View view) {
        this.zzc = new zzeg(view);
    }

    @Override // com.google.ads.interactivemedia.omid.library.adsession.zza
    public final void zzb(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, friendlyObstructionPurpose, str);
    }

    @Override // com.google.ads.interactivemedia.omid.library.adsession.zza
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        zze();
        this.zzf = true;
        this.zzd.zze();
        zzcr.zza().zze(this);
        this.zzd.zzc();
        this.zzd = null;
    }

    @Override // com.google.ads.interactivemedia.omid.library.adsession.zza
    public final void zzd(View view) {
        if (this.zzf) {
            return;
        }
        zzdp.zzb(view, "AdView is null");
        if (zzg() != view) {
            zzl(view);
            this.zzd.zzb();
            Collection<zze> collectionZzc = zzcr.zza().zzc();
            if (collectionZzc == null || collectionZzc.isEmpty()) {
                return;
            }
            for (zze zzeVar : collectionZzc) {
                if (zzeVar != this && zzeVar.zzg() == view) {
                    zzeVar.zzc.clear();
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.omid.library.adsession.zza
    public final void zze() {
        if (this.zzf) {
            return;
        }
        this.zzb.zzc();
    }

    @Override // com.google.ads.interactivemedia.omid.library.adsession.zza
    public final void zzf() {
        if (this.zze) {
            return;
        }
        this.zze = true;
        zzcr.zza().zzf(this);
        this.zzd.zzl(zzcz.zzb().zza());
        this.zzd.zzg(zzcp.zza().zzb());
        this.zzd.zzi(this, this.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzg() {
        return (View) this.zzc.get();
    }

    zze(zzb zzbVar, zzc zzcVar) {
        String string = UUID.randomUUID().toString();
        this.zzb = new zzcv();
        this.zze = false;
        this.zzf = false;
        this.zza = zzcVar;
        this.zzg = string;
        zzl(null);
        if (zzcVar.zzc() != zzd.HTML && zzcVar.zzc() != zzd.JAVASCRIPT) {
            this.zzd = new zzdj(string, zzcVar.zzh(), null);
        } else {
            this.zzd = new zzdg(string, zzcVar.zza());
        }
        this.zzd.zzn();
        zzcr.zza().zzd(this);
        this.zzd.zzf(zzbVar);
    }
}
