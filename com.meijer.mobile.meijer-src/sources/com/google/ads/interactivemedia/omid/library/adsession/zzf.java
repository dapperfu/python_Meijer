package com.google.ads.interactivemedia.omid.library.adsession;

/* loaded from: classes4.dex */
public enum zzf {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");

    private final String zzg;

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzg;
    }

    zzf(String str) {
        this.zzg = str;
    }
}
