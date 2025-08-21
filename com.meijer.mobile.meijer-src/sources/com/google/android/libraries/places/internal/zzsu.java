package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
final class zzsu {
    private static final zzsw zza = zzb(zzsw.zzd);

    private static zzsw zzb(String[] strArr) {
        zzta zztaVar;
        try {
            zztaVar = zztb.zza;
        } catch (NoClassDefFoundError unused) {
            zztaVar = null;
        }
        if (zztaVar != null) {
            return zztaVar;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzsw) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th2) {
                th = th2;
                sb2.append('\n');
                sb2.append(str);
                sb2.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb2.append(th);
            }
        }
        throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
    }
}
