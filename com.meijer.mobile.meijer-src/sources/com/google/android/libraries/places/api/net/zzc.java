package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;

/* loaded from: classes6.dex */
final class zzc extends FetchPhotoResponse {
    private final Bitmap zza;

    @Override // com.google.android.libraries.places.api.net.FetchPhotoResponse
    public final Bitmap getBitmap() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPhotoResponse) {
            return this.zza.equals(((FetchPhotoResponse) obj).getBitmap());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 27);
        sb2.append("FetchPhotoResponse{bitmap=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    zzc(Bitmap bitmap) {
        if (bitmap != null) {
            this.zza = bitmap;
            return;
        }
        throw new NullPointerException("Null bitmap");
    }
}
