package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzagg extends RuntimeException {
    public zzagg(zzafb zzafbVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzaeg zza() {
        return new zzaeg(getMessage());
    }
}
