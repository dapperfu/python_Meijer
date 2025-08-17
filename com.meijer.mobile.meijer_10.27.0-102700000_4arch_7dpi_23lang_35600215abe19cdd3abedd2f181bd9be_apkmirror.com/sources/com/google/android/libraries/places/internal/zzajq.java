package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzajq implements zzbak {
    static final zzbak zza = new zzajq();

    private zzajq() {
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i10) {
        zzajr zzajrVar;
        switch (i10) {
            case 0:
                zzajrVar = zzajr.CONTENT_UNDEFINED;
                break;
            case 1:
                zzajrVar = zzajr.PHOTO;
                break;
            case 2:
                zzajrVar = zzajr.ADDRESS;
                break;
            case 3:
                zzajrVar = zzajr.RATING;
                break;
            case 4:
                zzajrVar = zzajr.TYPE;
                break;
            case 5:
                zzajrVar = zzajr.PRICE;
                break;
            case 6:
                zzajrVar = zzajr.ACCESSIBILITY;
                break;
            case 7:
                zzajrVar = zzajr.OPEN_NOW_STATUS;
                break;
            default:
                zzajrVar = null;
                break;
        }
        return zzajrVar != null;
    }
}
