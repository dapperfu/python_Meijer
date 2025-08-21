package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends d.b {
    @Override // d.b
    protected void a(int i10, Bundle bundle) {
        Parcelable[] parcelableArray;
        MediaSessionCompat.a(bundle);
        if (i10 == 0 && bundle != null && bundle.containsKey("search_results") && (parcelableArray = bundle.getParcelableArray("search_results")) != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
            throw null;
        }
        throw null;
    }
}
