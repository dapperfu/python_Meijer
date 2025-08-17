package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class zzafh extends RuntimeException {
    public zzafh(InterfaceC10690g1 interfaceC10690g1) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzadi a() {
        return new zzadi(getMessage());
    }
}
