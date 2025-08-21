package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zzazg extends IOException {
    zzazg() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzazg(long j10, long j11, int i10, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10))), th2);
    }

    zzazg(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
