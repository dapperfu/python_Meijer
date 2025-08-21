package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzef extends zzea {
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzdl.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzeb, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    public zzef(zzdt zzdtVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzdtVar, hashSet, jSONObject, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.zzeb
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzcr zzcrVarZza;
        if (!TextUtils.isEmpty(str) && (zzcrVarZza = zzcr.zza()) != null) {
            for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zzcrVarZza.zzc()) {
                if (((zzea) this).zza.contains(zzeVar.zzi())) {
                    zzeVar.zzh().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
