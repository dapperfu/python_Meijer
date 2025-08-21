package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes6.dex */
public final class zzti extends zzsx {
    public static final /* synthetic */ int zza = 0;
    private static final Set zzb;
    private static final zzsq zzc;
    private static final zztg zzd;

    public static zztg zzb() {
        return zzd;
    }

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzsa.zza, zzsf.zza, zzsg.zza)));
        zzb = setUnmodifiableSet;
        zzc = zzst.zza(setUnmodifiableSet).zzb();
        zzd = new zztg(null);
    }

    /* synthetic */ zzti(String str, String str2, boolean z10, int i10, Level level, Set set, zzsq zzsqVar, byte[] bArr) {
        super(str2);
        if (str2.length() > 23) {
            int i11 = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i11 = length;
                    break;
                }
            }
            str2 = str2.substring(i11 + 1);
        }
        String strConcat = "".concat(String.valueOf(str2));
        strConcat.substring(0, Math.min(strConcat.length(), 23));
    }
}
