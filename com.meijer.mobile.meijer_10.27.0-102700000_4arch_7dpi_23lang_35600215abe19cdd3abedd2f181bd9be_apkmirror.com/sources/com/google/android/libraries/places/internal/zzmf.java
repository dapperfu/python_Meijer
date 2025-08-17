package com.google.android.libraries.places.internal;

import Be.p;
import com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zzmf {
    private volatile String zza;
    private volatile Locale zzb;
    private volatile boolean zzc;
    private PlacesAppCheckTokenProvider zzd;

    public final synchronized void zza(String str, Locale locale) {
        p.r(str, "API Key must not be null.");
        p.e(!str.isEmpty(), "API Key must not be empty.");
        this.zza = str;
        this.zzb = locale;
        this.zzc = false;
    }

    public final synchronized void zzb(String str, Locale locale) {
        zza(str, locale);
        this.zzc = true;
    }

    public final synchronized boolean zzc() {
        return this.zza != null;
    }

    public final void zzd(PlacesAppCheckTokenProvider placesAppCheckTokenProvider) {
        if (this.zzd == null) {
            this.zzd = placesAppCheckTokenProvider;
        }
    }

    public final synchronized void zze() {
        this.zza = null;
        this.zzb = null;
        this.zzc = false;
        this.zzd = null;
    }

    public final synchronized String zzf() {
        p.x(zzc(), "ApiConfig must be initialized.");
        p.q(this.zza);
        return this.zza;
    }

    public final synchronized Locale zzg() {
        try {
            p.x(zzc(), "ApiConfig must be initialized.");
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zzb == null ? Locale.getDefault() : this.zzb;
    }

    public final boolean zzh() {
        return this.zzc;
    }

    public final PlacesAppCheckTokenProvider zzi() {
        p.x(zzc(), "ApiConfig must be initialized.");
        return this.zzd;
    }
}
