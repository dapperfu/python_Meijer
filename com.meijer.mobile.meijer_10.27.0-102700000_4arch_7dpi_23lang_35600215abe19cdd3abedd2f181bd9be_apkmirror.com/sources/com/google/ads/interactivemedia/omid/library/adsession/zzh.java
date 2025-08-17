package com.google.ads.interactivemedia.omid.library.adsession;

/* loaded from: classes4.dex */
public enum zzh {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String zzj;

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzj;
    }

    zzh(String str) {
        this.zzj = str;
    }
}
