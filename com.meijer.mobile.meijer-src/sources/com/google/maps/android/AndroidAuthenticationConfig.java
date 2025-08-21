package com.google.maps.android;

/* loaded from: classes8.dex */
public class AndroidAuthenticationConfig {
    public static AndroidAuthenticationConfig EMPTY = new AndroidAuthenticationConfig(null, null);
    public final String certFingerprint;
    public final String packageName;

    public AndroidAuthenticationConfig(String str, String str2) {
        this.packageName = str;
        this.certFingerprint = str2;
    }
}
