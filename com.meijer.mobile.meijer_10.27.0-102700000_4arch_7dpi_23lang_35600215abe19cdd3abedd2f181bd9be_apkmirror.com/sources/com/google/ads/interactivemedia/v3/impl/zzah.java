package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import com.google.ads.interactivemedia.v3.internal.zzfk;
import com.google.ads.interactivemedia.v3.internal.zzrp;
import java.util.ArrayList;

/* loaded from: classes4.dex */
final class zzah implements zzbh {
    final /* synthetic */ zzak zza;

    zzah(zzak zzakVar) {
        this.zza = zzakVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzbh
    public final void zza(JavaScriptMessage javaScriptMessage) {
        com.google.ads.interactivemedia.v3.impl.data.zzc zzcVar;
        JavaScriptMessage.MsgType msgTypeZzb = javaScriptMessage.zzb();
        com.google.ads.interactivemedia.v3.impl.data.zzbu zzbuVar = (com.google.ads.interactivemedia.v3.impl.data.zzbu) javaScriptMessage.zzc();
        if (zzbuVar == null || (zzcVar = zzbuVar.adData) == null) {
            zzcVar = null;
        }
        AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        JavaScriptMessage.MsgType msgType = JavaScriptMessage.MsgType.activate;
        int iOrdinal = msgTypeZzb.ordinal();
        if (iOrdinal == 1) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.AD_BREAK_ENDED, zzcVar));
            return;
        }
        if (iOrdinal == 2) {
            zzag zzagVar = new zzag(AdEvent.AdEventType.AD_BREAK_FETCH_ERROR, null);
            zzagVar.zzc = zzrp.zze("adBreakTime", zzbuVar.adBreakTime);
            this.zza.zzc(zzagVar);
            return;
        }
        if (iOrdinal == 3) {
            zzag zzagVar2 = new zzag(AdEvent.AdEventType.AD_BREAK_READY, null);
            zzagVar2.zzc = zzrp.zze("adBreakTime", zzbuVar.adBreakTime);
            this.zza.zzc(zzagVar2);
            return;
        }
        if (iOrdinal == 4) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.AD_BREAK_STARTED, zzcVar));
            return;
        }
        if (iOrdinal == 5) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.AD_BUFFERING, null));
            return;
        }
        if (iOrdinal == 12) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.ALL_ADS_COMPLETED, null));
            return;
        }
        if (iOrdinal == 16) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.CLICKED, zzcVar));
            return;
        }
        if (iOrdinal == 18) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.COMPLETED, zzcVar));
            return;
        }
        if (iOrdinal == 25) {
            zzag zzagVar3 = new zzag(AdEvent.AdEventType.CUEPOINTS_CHANGED, null);
            zzagVar3.zzd = new ArrayList();
            for (com.google.ads.interactivemedia.v3.impl.data.zzbf zzbfVar : zzbuVar.cuepoints) {
                zzagVar3.zzd.add(new zzas(zzbfVar.start(), zzbfVar.end(), zzbfVar.played()));
            }
            this.zza.zzc(zzagVar3);
            return;
        }
        if (iOrdinal == 40) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.ICON_FALLBACK_IMAGE_CLOSED, null));
            return;
        }
        if (iOrdinal == 46) {
            if (zzcVar != null) {
                this.zza.zzc(new zzag(AdEvent.AdEventType.LOADED, zzcVar));
                return;
            } else {
                zzfk.zza("Ad loaded message requires adData");
                this.zza.zza(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Ad loaded message did not contain adData.");
                return;
            }
        }
        if (iOrdinal == 51) {
            this.zza.zzn(zzbuVar.url);
            return;
        }
        if (iOrdinal == 55) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.PAUSED, zzcVar));
            return;
        }
        if (iOrdinal == 64) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.RESUMED, zzcVar));
            return;
        }
        if (iOrdinal == 72) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.THIRD_QUARTILE, zzcVar));
            return;
        }
        if (iOrdinal == 20) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED, null));
            return;
        }
        if (iOrdinal == 21) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.CONTENT_RESUME_REQUESTED, null));
            return;
        }
        if (iOrdinal == 31) {
            this.zza.zza(AdError.AdErrorType.PLAY, AdError.AdErrorCode.getErrorCodeByNumber(zzbuVar.errorCode), zzba.zzf(zzbuVar.errorMessage, zzbuVar.innerError));
            return;
        }
        if (iOrdinal == 32) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.FIRST_QUARTILE, zzcVar));
            return;
        }
        if (iOrdinal == 48) {
            zzag zzagVar4 = new zzag(AdEvent.AdEventType.LOG, zzcVar);
            zzagVar4.zzc = zzbuVar.logData.constructMap();
            this.zza.zzc(zzagVar4);
            return;
        }
        if (iOrdinal == 49) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.MIDPOINT, zzcVar));
            return;
        }
        if (iOrdinal == 78) {
            this.zza.zzc(new zzag(AdEvent.AdEventType.TAPPED, zzcVar));
            return;
        }
        if (iOrdinal == 79) {
            zzag zzagVar5 = new zzag(AdEvent.AdEventType.ICON_TAPPED, null);
            if (zzbuVar != null) {
                zzagVar5.zzf = zzbuVar.iconClickFallbackImages;
            }
            this.zza.zzc(zzagVar5);
            return;
        }
        switch (iOrdinal) {
            case 8:
                this.zza.zzc(new zzag(AdEvent.AdEventType.AD_PERIOD_ENDED, null));
                break;
            case 9:
                this.zza.zzc(new zzag(AdEvent.AdEventType.AD_PERIOD_STARTED, null));
                break;
            case 10:
                zzag zzagVar6 = new zzag(AdEvent.AdEventType.AD_PROGRESS, zzcVar);
                zzagVar6.zze = new zzh(zzbuVar.currentTime, zzbuVar.duration, zzbuVar.adPosition, zzbuVar.totalAds, zzbuVar.adBreakDuration, zzbuVar.adPeriodDuration, zzbuVar.adsDurationsMs);
                this.zza.zzc(zzagVar6);
                break;
            default:
                switch (iOrdinal) {
                    case 66:
                        zzag zzagVar7 = new zzag(AdEvent.AdEventType.SKIPPED, null);
                        zzagVar7.zzg = zzbuVar.seekTime;
                        this.zza.zzc(zzagVar7);
                        break;
                    case 67:
                        this.zza.zzc(new zzag(AdEvent.AdEventType.SKIPPABLE_STATE_CHANGED, zzcVar));
                        break;
                    case 68:
                        this.zza.zzc(new zzag(AdEvent.AdEventType.STARTED, zzcVar));
                        break;
                }
        }
    }
}
