package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzbvv extends zzbvt {
    private zzbvv() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final boolean zza(zzbvw zzbvwVar, int i10, int i11) {
        synchronized (zzbvwVar) {
            try {
                if (zzbvwVar.zza() != 0) {
                    return false;
                }
                zzbvwVar.zzb(-1);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final void zzb(zzbvw zzbvwVar, int i10) {
        synchronized (zzbvwVar) {
            zzbvwVar.zzb(0);
        }
    }

    /* synthetic */ zzbvv(byte[] bArr) {
        super(null);
    }
}
