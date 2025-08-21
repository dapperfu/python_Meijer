package com.google.ads.interactivemedia.v3.api;

/* loaded from: classes4.dex */
public enum FriendlyObstructionPurpose {
    VIDEO_CONTROLS,
    CLOSE_AD,
    NOT_VISIBLE,
    OTHER;

    public com.google.ads.interactivemedia.omid.library.adsession.FriendlyObstructionPurpose getOmidPurpose() {
        return (com.google.ads.interactivemedia.omid.library.adsession.FriendlyObstructionPurpose) Enum.valueOf(com.google.ads.interactivemedia.omid.library.adsession.FriendlyObstructionPurpose.class, name());
    }
}
