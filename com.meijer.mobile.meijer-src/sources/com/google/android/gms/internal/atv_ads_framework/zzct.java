package com.google.android.gms.internal.atv_ads_framework;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class zzct extends IOException {
    zzct() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzct(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    zzct(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
