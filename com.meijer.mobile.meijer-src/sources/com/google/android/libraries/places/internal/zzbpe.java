package com.google.android.libraries.places.internal;

import De.p;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class zzbpe implements zzbik {
    zzbpe() {
    }

    @Override // com.google.android.libraries.places.internal.zzbik
    public final /* bridge */ /* synthetic */ String zzb(Object obj) {
        Long l10 = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l10.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l10.longValue() < 100000000) {
            new StringBuilder(String.valueOf(l10).length() + 1);
            return String.valueOf(l10).concat("n");
        }
        if (l10.longValue() < 100000000000L) {
            long micros = timeUnit.toMicros(l10.longValue());
            StringBuilder sb2 = new StringBuilder(String.valueOf(micros).length() + 1);
            sb2.append(micros);
            sb2.append("u");
            return sb2.toString();
        }
        if (l10.longValue() < 100000000000000L) {
            long millis = timeUnit.toMillis(l10.longValue());
            StringBuilder sb3 = new StringBuilder(String.valueOf(millis).length() + 1);
            sb3.append(millis);
            sb3.append("m");
            return sb3.toString();
        }
        if (l10.longValue() < 100000000000000000L) {
            long seconds = timeUnit.toSeconds(l10.longValue());
            StringBuilder sb4 = new StringBuilder(String.valueOf(seconds).length() + 1);
            sb4.append(seconds);
            sb4.append("S");
            return sb4.toString();
        }
        if (l10.longValue() < 6000000000000000000L) {
            long minutes = timeUnit.toMinutes(l10.longValue());
            StringBuilder sb5 = new StringBuilder(String.valueOf(minutes).length() + 1);
            sb5.append(minutes);
            sb5.append("M");
            return sb5.toString();
        }
        long hours = timeUnit.toHours(l10.longValue());
        StringBuilder sb6 = new StringBuilder(String.valueOf(hours).length() + 1);
        sb6.append(hours);
        sb6.append("H");
        return sb6.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbik
    public final /* bridge */ /* synthetic */ Object zza(String str) throws NumberFormatException {
        boolean z10;
        boolean z11 = true;
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p.e(z10, "empty timeout");
        if (str.length() > 9) {
            z11 = false;
        }
        p.e(z11, "bad timeout format");
        long j10 = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt != 'H') {
            if (cCharAt != 'M') {
                if (cCharAt != 'S') {
                    if (cCharAt != 'u') {
                        if (cCharAt != 'm') {
                            if (cCharAt == 'n') {
                                return Long.valueOf(j10);
                            }
                            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
                        }
                        return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j10));
                    }
                    return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j10));
                }
                return Long.valueOf(TimeUnit.SECONDS.toNanos(j10));
            }
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j10));
        }
        return Long.valueOf(TimeUnit.HOURS.toNanos(j10));
    }
}
