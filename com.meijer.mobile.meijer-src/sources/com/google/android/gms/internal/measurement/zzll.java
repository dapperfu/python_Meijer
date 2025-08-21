package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zzll extends IOException {
    zzll() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzll(long j10, long j11, int i10, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10))), th2);
    }

    zzll(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
