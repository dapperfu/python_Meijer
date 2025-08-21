package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public abstract class FetchPhotoResponse {
    @RecentlyNonNull
    public abstract Bitmap getBitmap();

    @RecentlyNonNull
    public static FetchPhotoResponse newInstance(@RecentlyNonNull Bitmap bitmap) {
        return new zzc(bitmap);
    }
}
