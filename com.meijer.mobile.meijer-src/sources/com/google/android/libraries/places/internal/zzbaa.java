package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public class zzbaa extends zzazy implements zzbbm {
    @Override // com.google.android.libraries.places.internal.zzazy, com.google.android.libraries.places.internal.zzbbk
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbab zzF() {
        if (!((zzbab) this.zza).zzbd()) {
            return (zzbab) this.zza;
        }
        ((zzbab) this.zza).zzb.zzb();
        return (zzbab) super.zzF();
    }

    protected zzbaa(zzbab zzbabVar) {
        super(zzbabVar);
    }

    @Override // com.google.android.libraries.places.internal.zzazy
    protected final void zzz() {
        super.zzz();
        if (((zzbab) this.zza).zzb != zzazu.zza()) {
            zzbab zzbabVar = (zzbab) this.zza;
            zzbabVar.zzb = zzbabVar.zzb.clone();
        }
    }
}
