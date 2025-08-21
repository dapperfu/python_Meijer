package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class zzhag extends RuntimeException {
    public zzhag(InterfaceC9245pv0 interfaceC9245pv0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgyg a() {
        return new zzgyg(getMessage());
    }
}
