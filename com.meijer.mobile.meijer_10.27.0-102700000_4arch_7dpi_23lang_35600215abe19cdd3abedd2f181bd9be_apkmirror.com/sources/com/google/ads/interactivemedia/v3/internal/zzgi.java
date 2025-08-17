package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;

/* loaded from: classes4.dex */
public final class zzgi {
    private final Context zza;
    private AdsRenderingSettings zzb;

    public zzgi(Context context, AdsRenderingSettings adsRenderingSettings) {
        this.zza = context;
        this.zzb = adsRenderingSettings;
    }

    public final void zza(AdsRenderingSettings adsRenderingSettings) {
        this.zzb = adsRenderingSettings;
    }

    private static final boolean zzc(String str, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public final boolean zzb(String str) {
        if (!zzqm.zzc(str)) {
            Context context = this.zza;
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
            if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo != null) {
                if (this.zzb.getEnableCustomTabs()) {
                    new d.C0965d().a().a(this.zza, Uri.parse(str));
                    return true;
                }
                return zzc(str, this.zza);
            }
            return false;
        }
        return false;
    }
}
