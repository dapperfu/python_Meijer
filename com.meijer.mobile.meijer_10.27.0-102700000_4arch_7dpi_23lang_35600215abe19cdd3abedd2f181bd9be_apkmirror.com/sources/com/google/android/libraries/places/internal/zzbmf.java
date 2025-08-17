package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class zzbmf implements zzbwk {
    zzbmf() {
    }

    @Override // com.google.android.libraries.places.internal.zzbwk
    public final long zza() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
}
