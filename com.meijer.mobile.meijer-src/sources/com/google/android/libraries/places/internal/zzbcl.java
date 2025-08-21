package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbcl extends RuntimeException {
    public zzbcl(zzbbl zzbblVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzbar zza() {
        return new zzbar(getMessage());
    }
}
