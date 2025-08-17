package com.google.android.gms.internal.pal;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class zzacf extends IOException {
    zzacf() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzacf(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    zzacf(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
