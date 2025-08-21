package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzcp implements zzcs {
    private static final zzcp zza = new zzcp(new zzct());
    private Date zzb;
    private boolean zzc;
    private final zzct zzd;
    private boolean zze;

    private zzcp(zzct zzctVar) {
        this.zzd = zzctVar;
    }

    public static zzcp zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcs
    public final void zzc(boolean z10) {
        if (!this.zze && z10) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzcr.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((com.google.ads.interactivemedia.omid.library.adsession.zze) it.next()).zzh().zzg(zzb());
                    }
                }
            }
        }
        this.zze = z10;
    }

    public final void zzd(Context context) {
        if (this.zzc) {
            return;
        }
        this.zzd.zzd(context);
        this.zzd.zze(this);
        this.zzd.zzf();
        this.zze = this.zzd.zza;
        this.zzc = true;
    }
}
