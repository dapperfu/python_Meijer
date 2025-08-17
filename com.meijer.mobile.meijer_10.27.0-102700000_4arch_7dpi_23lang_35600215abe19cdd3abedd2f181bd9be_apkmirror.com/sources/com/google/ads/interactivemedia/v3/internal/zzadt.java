package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzadt implements zzaez {
    private static final zzadt zza = new zzadt();

    private zzadt() {
    }

    public static zzadt zza() {
        return zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaez
    public final zzaey zzb(Class cls) {
        if (!zzady.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzaey) zzady.zzaA(cls.asSubclass(zzady.class)).zzm(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaez
    public final boolean zzc(Class cls) {
        return zzady.class.isAssignableFrom(cls);
    }
}
