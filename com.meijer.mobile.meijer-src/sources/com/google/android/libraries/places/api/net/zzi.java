package com.google.android.libraries.places.api.net;

import android.net.Uri;

/* loaded from: classes6.dex */
final class zzi extends FetchResolvedPhotoUriResponse {
    private final Uri zza;

    zzi(Uri uri) {
        this.zza = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FetchResolvedPhotoUriResponse)) {
            return false;
        }
        FetchResolvedPhotoUriResponse fetchResolvedPhotoUriResponse = (FetchResolvedPhotoUriResponse) obj;
        Uri uri = this.zza;
        return uri == null ? fetchResolvedPhotoUriResponse.getUri() == null : uri.equals(fetchResolvedPhotoUriResponse.getUri());
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse
    public final Uri getUri() {
        return this.zza;
    }

    public final int hashCode() {
        Uri uri = this.zza;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35);
        sb2.append("FetchResolvedPhotoUriResponse{uri=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
