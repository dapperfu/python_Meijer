package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zzff {
    private final String zza;
    private final int zzb;
    private final zzfe zzc;
    private final boolean zzd;
    private final int zze;

    public final String zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzfe zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zze;
    }

    public zzff(WifiInfo wifiInfo, ScanResult scanResult) {
        zzfe zzfeVar;
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i10 = scanResult.level;
        int i11 = scanResult.frequency;
        if (TextUtils.isEmpty(str2)) {
            zzfeVar = zzfe.OTHER;
        } else {
            String upperCase = str2.toUpperCase(Locale.getDefault());
            zzfeVar = (upperCase.equals("[ESS]") || upperCase.equals("[IBSS]")) ? zzfe.NONE : upperCase.matches(".*WPA[0-9]*-PSK.*") ? zzfe.PSK : upperCase.matches(".*WPA[0-9]*-EAP.*") ? zzfe.EAP : zzfe.OTHER;
        }
        boolean z10 = false;
        if (wifiInfo != null && !TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z10 = true;
        }
        this.zza = str;
        this.zzb = i10;
        this.zzc = zzfeVar;
        this.zzd = z10;
        this.zze = i11;
    }
}
