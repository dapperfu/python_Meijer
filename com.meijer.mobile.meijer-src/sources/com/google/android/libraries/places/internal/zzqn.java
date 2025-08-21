package com.google.android.libraries.places.internal;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
final class zzqn {
    private static final zzqn zza;
    private final UUID zzb;
    private final AtomicLong zzc;

    static zzqn zza() {
        return zza;
    }

    final long zzb() {
        AtomicLong atomicLong;
        long j10;
        do {
            atomicLong = this.zzc;
            j10 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j10, ((25214903917L * (((j10 * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
        return (((int) (r5 >>> 16)) << 32) + ((int) (r3 >>> 16));
    }

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zza = new zzqn(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    zzqn(UUID uuid, long j10) {
        this.zzb = uuid;
        this.zzc = new AtomicLong((j10 ^ 25214903917L) & 281474976710655L);
    }

    public final UUID zzc() {
        long jZzb = zzb() & (-61441);
        long jZzb2 = zzb() >>> 2;
        UUID uuid = this.zzb;
        return new UUID(jZzb ^ uuid.getMostSignificantBits(), jZzb2 ^ uuid.getLeastSignificantBits());
    }
}
