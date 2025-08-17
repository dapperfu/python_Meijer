package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
public enum zzbjs {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);

    private final int zzr;
    private final byte[] zzs;

    public final int zza() {
        return this.zzr;
    }

    final /* synthetic */ byte[] zzc() {
        return this.zzs;
    }

    zzbjs(int i10) {
        this.zzr = i10;
        this.zzs = Integer.toString(i10).getBytes(StandardCharsets.US_ASCII);
    }

    public final zzbjv zzb() {
        return (zzbjv) zzbjv.zzl.get(this.zzr);
    }
}
