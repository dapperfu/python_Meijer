package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends d.b {
    @Override // d.b
    protected void a(int i10, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i10 == 0 && bundle != null && bundle.containsKey("media_item")) {
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
