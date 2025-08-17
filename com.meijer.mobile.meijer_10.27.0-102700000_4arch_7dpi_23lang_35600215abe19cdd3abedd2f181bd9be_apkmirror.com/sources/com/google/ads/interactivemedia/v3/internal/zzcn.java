package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes4.dex */
public final class zzcn extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private float zzc;
    private final zzcz zzd;

    private final float zzc() {
        AudioManager audioManager = this.zzb;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f10 = streamVolume / streamMaxVolume;
            if (f10 > 1.0f) {
                return 1.0f;
            }
        }
        return f10;
    }

    private final void zzd() {
        this.zzd.zze(this.zzc);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }

    public zzcn(Handler handler, Context context, zzcl zzclVar, zzcz zzczVar) {
        super(handler);
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService("audio");
        this.zzd = zzczVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fZzc = zzc();
        if (fZzc != this.zzc) {
            this.zzc = fZzc;
            zzd();
        }
    }

    public final void zza() {
        this.zzc = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }
}
