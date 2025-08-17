package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zzdf {
    private final String zza;
    private zzeh zzb;
    private long zzc;
    private int zzd;

    public void zzi(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar, com.google.ads.interactivemedia.omid.library.adsession.zzc zzcVar) {
        zzj(zzeVar, zzcVar, null);
    }

    public void zzn() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView zza() {
        return (WebView) this.zzb.get();
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String str, long j10) {
        if (j10 < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzcy.zza().zzg(zza(), this.zza, str);
    }

    public final void zzg(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzdl.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzcy.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(String str, long j10) {
        if (j10 >= this.zzc) {
            this.zzd = 2;
            zzcy.zza().zzg(zza(), this.zza, str);
        }
    }

    public final void zzk(boolean z10) {
        if (this.zzb.get() != 0) {
            zzcy.zza().zzh(zza(), this.zza, true != z10 ? "backgrounded" : "foregrounded");
        }
    }

    final void zzm(WebView webView) {
        this.zzb = new zzeh(webView);
    }

    public zzdf(String str) {
        zzb();
        this.zza = str;
        this.zzb = new zzeh(null);
    }

    public final void zzb() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }

    public final void zze() {
        zzcy.zza().zzc(zza(), this.zza);
    }

    public final void zzf(com.google.ads.interactivemedia.omid.library.adsession.zzb zzbVar) {
        zzcy.zza().zzd(zza(), this.zza, zzbVar.zzb());
    }

    protected final void zzj(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar, com.google.ads.interactivemedia.omid.library.adsession.zzc zzcVar, JSONObject jSONObject) throws JSONException {
        String strZzi = zzeVar.zzi();
        JSONObject jSONObject2 = new JSONObject();
        zzdl.zze(jSONObject2, "environment", "app");
        zzdl.zze(jSONObject2, "adSessionType", zzcVar.zzc());
        JSONObject jSONObject3 = new JSONObject();
        zzdl.zze(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzdl.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzdl.zze(jSONObject3, "os", "Android");
        zzdl.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzdl.zze(jSONObject2, "deviceCategory", zzdk.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzdl.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzdl.zze(jSONObject4, "partnerName", zzcVar.zzd().zzb());
        zzdl.zze(jSONObject4, "partnerVersion", zzcVar.zzd().zzc());
        zzdl.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzdl.zze(jSONObject5, "libraryVersion", "1.4.10-google_20240110");
        zzdl.zze(jSONObject5, "appId", zzcw.zzb().zza().getApplicationContext().getPackageName());
        zzdl.zze(jSONObject2, "app", jSONObject5);
        if (zzcVar.zze() != null) {
            zzdl.zze(jSONObject2, "contentUrl", zzcVar.zze());
        }
        zzdl.zze(jSONObject2, "customReferenceData", zzcVar.zzf());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzcVar.zzg().iterator();
        if (!it.hasNext()) {
            zzcy.zza().zzi(zza(), strZzi, jSONObject2, jSONObject6, jSONObject);
        } else {
            throw null;
        }
    }

    public final void zzl(float f10) {
        zzcy.zza().zze(zza(), this.zza, f10);
    }
}
