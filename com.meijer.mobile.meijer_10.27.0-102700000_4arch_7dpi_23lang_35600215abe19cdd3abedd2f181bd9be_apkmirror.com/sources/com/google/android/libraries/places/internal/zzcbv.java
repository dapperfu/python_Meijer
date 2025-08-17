package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzcbv {
    private static final zzcbu zza = new zzcbu(new byte[0], 0, 0, false, false);
    private static final int zzb;
    private static final AtomicReference[] zzc;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        zzb = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        zzc = atomicReferenceArr;
    }

    @JvmStatic
    public static final void zzb(zzcbu segment) {
        Intrinsics.j(segment, "segment");
        if (segment.zzf != null || segment.zzg != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.zzd) {
            return;
        }
        AtomicReference atomicReferenceZzc = zzc();
        zzcbu zzcbuVar = zza;
        zzcbu zzcbuVar2 = (zzcbu) atomicReferenceZzc.getAndSet(zzcbuVar);
        if (zzcbuVar2 != zzcbuVar) {
            int i10 = zzcbuVar2 != null ? zzcbuVar2.zzc : 0;
            if (i10 >= 65536) {
                atomicReferenceZzc.set(zzcbuVar2);
                return;
            }
            segment.zzf = zzcbuVar2;
            segment.zzb = 0;
            segment.zzc = i10 + 8192;
            atomicReferenceZzc.set(segment);
        }
    }

    @JvmStatic
    public static final zzcbu zza() {
        AtomicReference atomicReferenceZzc = zzc();
        zzcbu zzcbuVar = zza;
        zzcbu zzcbuVar2 = (zzcbu) atomicReferenceZzc.getAndSet(zzcbuVar);
        if (zzcbuVar2 == zzcbuVar) {
            return new zzcbu();
        }
        if (zzcbuVar2 == null) {
            atomicReferenceZzc.set(null);
            return new zzcbu();
        }
        atomicReferenceZzc.set(zzcbuVar2.zzf);
        zzcbuVar2.zzf = null;
        zzcbuVar2.zzc = 0;
        return zzcbuVar2;
    }

    private static final AtomicReference zzc() {
        return zzc[(int) (Thread.currentThread().getId() & (zzb - 1))];
    }
}
