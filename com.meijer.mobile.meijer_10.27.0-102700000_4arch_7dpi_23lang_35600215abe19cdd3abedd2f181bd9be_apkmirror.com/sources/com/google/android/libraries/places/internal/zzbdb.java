package com.google.android.libraries.places.internal;

import Be.v;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zzbdb {
    public static final /* synthetic */ int zza = 0;
    private static final ThreadLocal zzb;

    private static Method zzb(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        zzbcj zzbcjVarZzf = zzbck.zzf();
        zzbcjVarZzf.zza(-62135596800L);
        zzbcjVarZzf.zzb(0);
        zzbcj zzbcjVarZzf2 = zzbck.zzf();
        zzbcjVarZzf2.zza(253402300799L);
        zzbcjVarZzf2.zzb(999999999);
        zzbcj zzbcjVarZzf3 = zzbck.zzf();
        zzbcjVarZzf3.zza(0L);
        zzbcjVarZzf3.zzb(0);
        zzb = new zzbda();
        zzb("now");
        zzb("getEpochSecond");
        zzb("getNano");
    }

    public static String zza(zzbck zzbckVar) {
        String str;
        long jZzc = zzbckVar.zzc();
        int iZze = zzbckVar.zze();
        if (jZzc >= -62135596800L && jZzc <= 253402300799L && iZze >= 0 && iZze < 1000000000) {
            long jZzc2 = zzbckVar.zzc();
            int iZze2 = zzbckVar.zze();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((SimpleDateFormat) zzb.get()).format(new Date(jZzc2 * 1000)));
            if (iZze2 != 0) {
                sb2.append(".");
                if (iZze2 % 1000000 == 0) {
                    str = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iZze2 / 1000000));
                } else if (iZze2 % 1000 == 0) {
                    str = String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iZze2 / 1000));
                } else {
                    str = String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iZze2));
                }
                sb2.append(str);
            }
            sb2.append("Z");
            return sb2.toString();
        }
        throw new IllegalArgumentException(v.c("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(jZzc), Integer.valueOf(iZze)));
    }
}
