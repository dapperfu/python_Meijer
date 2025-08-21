package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zztv {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zztz zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.libraries.places.internal.zztz] */
    static {
        zzua zzuaVar;
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                zzuaVar = new zzua();
                break;
            }
            zzuaVar = null;
            try {
                zzuaVar = (zztz) Class.forName(zza[i10]).asSubclass(zztz.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzuaVar != null) {
                break;
            } else {
                i10++;
            }
        }
        zzb = zzuaVar;
    }

    public static StackTraceElement zza(Class cls, int i10) {
        zztw.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
