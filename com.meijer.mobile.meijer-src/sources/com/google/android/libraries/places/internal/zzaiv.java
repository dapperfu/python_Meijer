package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzaiv implements zzbak {
    static final zzbak zza = new zzaiv();

    private zzaiv() {
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i10) {
        zzaiw zzaiwVar;
        switch (i10) {
            case 0:
                zzaiwVar = zzaiw.CONTENT_UNDEFINED;
                break;
            case 1:
                zzaiwVar = zzaiw.PHOTO;
                break;
            case 2:
                zzaiwVar = zzaiw.ADDRESS;
                break;
            case 3:
                zzaiwVar = zzaiw.RATING;
                break;
            case 4:
                zzaiwVar = zzaiw.TYPE;
                break;
            case 5:
                zzaiwVar = zzaiw.PRICE;
                break;
            case 6:
                zzaiwVar = zzaiw.ACCESSIBILITY;
                break;
            case 7:
                zzaiwVar = zzaiw.MAPS_LINK;
                break;
            case 8:
                zzaiwVar = zzaiw.DIRECTIONS_LINK;
                break;
            case 9:
                zzaiwVar = zzaiw.OPEN_NOW_STATUS;
                break;
            case 10:
                zzaiwVar = zzaiw.SUMMARY;
                break;
            case 11:
                zzaiwVar = zzaiw.OPENING_HOURS;
                break;
            case 12:
                zzaiwVar = zzaiw.WEBSITE;
                break;
            case 13:
                zzaiwVar = zzaiw.PHONE_NUMBER;
                break;
            case 14:
                zzaiwVar = zzaiw.TYPE_SPECIFIC_HIGHLIGHTS;
                break;
            case 15:
                zzaiwVar = zzaiw.REVIEWS;
                break;
            case 16:
                zzaiwVar = zzaiw.PLUS_CODE;
                break;
            case 17:
                zzaiwVar = zzaiw.FEATURES;
                break;
            default:
                zzaiwVar = null;
                break;
        }
        return zzaiwVar != null;
    }
}
