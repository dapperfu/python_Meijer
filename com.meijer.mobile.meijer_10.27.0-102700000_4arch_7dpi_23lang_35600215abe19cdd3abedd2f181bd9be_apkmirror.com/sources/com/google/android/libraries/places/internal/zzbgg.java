package com.google.android.libraries.places.internal;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class zzbgg implements Comparable {
    public static final /* synthetic */ int zza = 0;
    private static final zzbgf zzb = new zzbge(null);
    private static final long zzc;
    private static final long zzd;
    private static final long zze;
    private final zzbgf zzf;
    private final long zzg;
    private volatile boolean zzh;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbgg)) {
            return false;
        }
        zzbgg zzbggVar = (zzbgg) obj;
        return this.zzf == zzbggVar.zzf && this.zzg == zzbggVar.zzg;
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        zzc = nanos;
        zzd = -nanos;
        zze = TimeUnit.SECONDS.toNanos(1L);
    }

    public static zzbgg zza(long j10, TimeUnit timeUnit) {
        zzbgf zzbgfVar = zzb;
        Objects.requireNonNull(timeUnit, "units");
        return new zzbgg(zzbgfVar, System.nanoTime(), timeUnit.toNanos(j10), true);
    }

    public final int hashCode() {
        return Objects.hash(this.zzf, Long.valueOf(this.zzg));
    }

    public final String toString() {
        long jZzc = zzc(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jZzc);
        long j10 = zze;
        long j11 = jAbs / j10;
        long jAbs2 = Math.abs(jZzc) % j10;
        StringBuilder sb2 = new StringBuilder();
        if (jZzc < 0) {
            sb2.append('-');
        }
        sb2.append(j11);
        if (jAbs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb2.append("s from now");
        zzbgf zzbgfVar = this.zzf;
        if (zzbgfVar != zzb) {
            String string = zzbgfVar.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 10);
            sb3.append(" (ticker=");
            sb3.append(string);
            sb3.append(")");
            sb2.append(sb3.toString());
        }
        return sb2.toString();
    }

    public final boolean zzb() {
        if (!this.zzh) {
            if (this.zzg - System.nanoTime() > 0) {
                return false;
            }
            this.zzh = true;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbgg zzbggVar) {
        zzbgf zzbgfVar = this.zzf;
        zzbgf zzbgfVar2 = zzbggVar.zzf;
        if (zzbgfVar == zzbgfVar2) {
            return Long.compare(this.zzg, zzbggVar.zzg);
        }
        String string = zzbgfVar.toString();
        String string2 = zzbgfVar2.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 14 + string2.length() + 58);
        sb2.append("Tickers (");
        sb2.append(string);
        sb2.append(" and ");
        sb2.append(string2);
        sb2.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb2.toString());
    }

    private zzbgg(zzbgf zzbgfVar, long j10, long j11, boolean z10) {
        boolean z11;
        this.zzf = zzbgfVar;
        long jMin = Math.min(zzc, Math.max(zzd, j11));
        this.zzg = j10 + jMin;
        if (jMin <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzh = z11;
    }

    public final long zzc(TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        if (!this.zzh && this.zzg - jNanoTime <= 0) {
            this.zzh = true;
        }
        return timeUnit.convert(this.zzg - jNanoTime, TimeUnit.NANOSECONDS);
    }
}
