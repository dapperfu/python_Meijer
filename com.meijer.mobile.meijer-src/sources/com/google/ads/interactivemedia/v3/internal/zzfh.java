package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import java.net.MalformedURLException;

/* loaded from: classes4.dex */
public final class zzfh {
    private final zzvr zza;

    public final JavaScriptMessage zzb(String str) {
        com.google.ads.interactivemedia.v3.impl.data.zzbv zzbvVar = (com.google.ads.interactivemedia.v3.impl.data.zzbv) this.zza.zze(str, com.google.ads.interactivemedia.v3.impl.data.zzbv.class);
        if (zzbvVar.sid != null) {
            return new JavaScriptMessage(JavaScriptMessage.MsgChannel.zza(zzbvVar.name), JavaScriptMessage.MsgType.zza(zzbvVar.type), zzbvVar.sid, this.zza.zze(zzbvVar.data, com.google.ads.interactivemedia.v3.impl.data.zzbu.class));
        }
        throw new NullPointerException("Session id must be provided in message.");
    }

    public final String zzc(JavaScriptMessage javaScriptMessage) {
        zzro zzroVar = new zzro();
        zzroVar.zza("type", javaScriptMessage.zzb());
        zzroVar.zza("sid", javaScriptMessage.zzd());
        if (javaScriptMessage.zzc() != null) {
            zzroVar.zza("data", javaScriptMessage.zzc());
        }
        return String.format("%s('%s', %s);", "javascript:adsense.mobileads.afmanotify.receiveMessage", javaScriptMessage.zza(), this.zza.zzf(zzroVar.zzc()));
    }

    public zzfh() {
        zzvs zzvsVar = new zzvs();
        zzvsVar.zzb(UiElement.class, com.google.ads.interactivemedia.v3.impl.data.zzcl.GSON_TYPE_ADAPTER);
        zzvsVar.zzd();
        zzvsVar.zzb(CompanionAdSlot.class, new zzfg(this));
        zzvsVar.zzc(new zzpu());
        this.zza = zzvsVar.zza();
    }

    public final JavaScriptMessage zza(String str) throws MalformedURLException {
        Uri uri = Uri.parse(str);
        String path = uri.getPath();
        if (path != null) {
            String strSubstring = path.substring(1);
            if (uri.getQueryParameter("sid") != null) {
                return new JavaScriptMessage(JavaScriptMessage.MsgChannel.zza(strSubstring), JavaScriptMessage.MsgType.zza(uri.getQueryParameter("type")), uri.getQueryParameter("sid"), this.zza.zze(uri.getQueryParameter("data"), com.google.ads.interactivemedia.v3.impl.data.zzbu.class));
            }
            throw new MalformedURLException("Session id must be provided in message.");
        }
        throw new MalformedURLException("URL must have message.");
    }
}
