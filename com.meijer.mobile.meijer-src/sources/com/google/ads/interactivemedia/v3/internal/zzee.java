package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzee extends zzea {
    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzeb, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    public zzee(zzdt zzdtVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzdtVar, hashSet, jSONObject, j10);
    }

    private final void zzc(String str) {
        zzcr zzcrVarZza = zzcr.zza();
        if (zzcrVarZza != null) {
            for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zzcrVarZza.zzc()) {
                if (((zzea) this).zza.contains(zzeVar.zzi())) {
                    zzeVar.zzh().zzd(str, this.zzc);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.zzeb
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
