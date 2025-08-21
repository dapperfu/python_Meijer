package com.google.android.libraries.places.api.net;

import android.net.Uri;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes6.dex */
public abstract class FetchResolvedPhotoUriResponse {
    @RecentlyNonNull
    public static FetchResolvedPhotoUriResponse newInstance(@RecentlyNonNull Uri uri) {
        return new zzi(uri);
    }

    @RecentlyNullable
    public abstract Uri getUri();
}
