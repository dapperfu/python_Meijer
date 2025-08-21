package com.google.ads.interactivemedia.v3.impl;

import android.view.View;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import com.google.ads.interactivemedia.v3.internal.zzfl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzbt implements AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, zzae {
    private final zzbi zza;
    private final WebView zzb;
    private final zzfl zzc;
    private View zzd;
    private String zze;
    private com.google.ads.interactivemedia.omid.library.adsession.zza zzi;
    private boolean zzg = false;
    private String zzh = null;
    private final Set zzf = new HashSet();

    public final void zzb(View view) {
        this.zzd = view;
    }

    public final void zzc(String str) {
        this.zzh = str;
    }

    public final void zzd(boolean z10) {
        this.zzg = true;
    }

    public final void zze(String str) {
        this.zze = str;
    }

    private final void zzh(List list) {
        com.google.ads.interactivemedia.v3.impl.data.zzcd zzcdVarBuild;
        if (list == null) {
            zzcdVarBuild = null;
        } else if (list.isEmpty()) {
            return;
        } else {
            zzcdVarBuild = com.google.ads.interactivemedia.v3.impl.data.zzcd.builder().friendlyObstructions(list).build();
        }
        this.zza.zzn(new JavaScriptMessage(JavaScriptMessage.MsgChannel.omid, JavaScriptMessage.MsgType.registerFriendlyObstructions, this.zze, zzcdVarBuild));
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
    public final void onAdError(AdErrorEvent adErrorEvent) {
        com.google.ads.interactivemedia.omid.library.adsession.zza zzaVar;
        if (!this.zzc.zzc() || (zzaVar = this.zzi) == null) {
            return;
        }
        zzaVar.zzc();
        this.zzi = null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
    public final void onAdEvent(AdEvent adEvent) {
        if (this.zzc.zzc()) {
            AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
            int iOrdinal = adEvent.getType().ordinal();
            if (iOrdinal == 3 || iOrdinal == 14) {
                zzg();
                return;
            }
            if (iOrdinal == 15 && this.zzc.zzc() && this.zzi == null && this.zzd != null) {
                com.google.ads.interactivemedia.omid.library.adsession.zzf zzfVar = com.google.ads.interactivemedia.omid.library.adsession.zzf.DEFINED_BY_JAVASCRIPT;
                com.google.ads.interactivemedia.omid.library.adsession.zzh zzhVar = com.google.ads.interactivemedia.omid.library.adsession.zzh.DEFINED_BY_JAVASCRIPT;
                com.google.ads.interactivemedia.omid.library.adsession.zzi zziVar = com.google.ads.interactivemedia.omid.library.adsession.zzi.JAVASCRIPT;
                com.google.ads.interactivemedia.omid.library.adsession.zzb zzbVarZza = com.google.ads.interactivemedia.omid.library.adsession.zzb.zza(zzfVar, zzhVar, zziVar, zziVar, true);
                WebView webView = this.zzb;
                com.google.ads.interactivemedia.omid.library.adsession.zza zzaVarZza = com.google.ads.interactivemedia.omid.library.adsession.zza.zza(zzbVarZza, com.google.ads.interactivemedia.omid.library.adsession.zzc.zzb(com.google.ads.interactivemedia.omid.library.adsession.zzj.zza("Google1", "3.35.1"), webView, this.zzh, "{ssai:" + (true != this.zzg ? "false" : "true") + "}"));
                zzaVarZza.zzd(this.zzd);
                for (FriendlyObstruction friendlyObstruction : this.zzf) {
                    zzaVarZza.zzb(friendlyObstruction.getView(), friendlyObstruction.getPurpose().getOmidPurpose(), friendlyObstruction.getDetailedReason());
                }
                zzh(new ArrayList(this.zzf));
                zzaVarZza.zzf();
                this.zzi = zzaVarZza;
            }
        }
    }

    public final void zza(FriendlyObstruction friendlyObstruction) {
        if (this.zzf.contains(friendlyObstruction)) {
            return;
        }
        this.zzf.add(friendlyObstruction);
        com.google.ads.interactivemedia.omid.library.adsession.zza zzaVar = this.zzi;
        if (zzaVar != null) {
            zzaVar.zzb(friendlyObstruction.getView(), friendlyObstruction.getPurpose().getOmidPurpose(), friendlyObstruction.getDetailedReason());
            zzh(Arrays.asList(friendlyObstruction));
        }
    }

    public final void zzf() {
        this.zzf.clear();
        com.google.ads.interactivemedia.omid.library.adsession.zza zzaVar = this.zzi;
        if (zzaVar == null) {
            return;
        }
        zzaVar.zze();
        zzh(null);
    }

    public final boolean zzg() {
        com.google.ads.interactivemedia.omid.library.adsession.zza zzaVar;
        if (!this.zzc.zzc() || (zzaVar = this.zzi) == null) {
            return false;
        }
        zzaVar.zzc();
        this.zzi = null;
        return true;
    }

    zzbt(zzbi zzbiVar, WebView webView, zzfl zzflVar) {
        this.zza = zzbiVar;
        this.zzb = webView;
        this.zzc = zzflVar;
    }
}
