package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzazx implements zzbbj {
    private static final zzazx zza = new zzazx();

    private zzazx() {
    }

    public static zzazx zza() {
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbbj
    public final boolean zzb(Class cls) {
        return zzbae.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.libraries.places.internal.zzbbj
    public final zzbbi zzc(Class cls) {
        if (!zzbae.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzbbi) zzbae.zzbm(cls.asSubclass(zzbae.class)).zzb(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
