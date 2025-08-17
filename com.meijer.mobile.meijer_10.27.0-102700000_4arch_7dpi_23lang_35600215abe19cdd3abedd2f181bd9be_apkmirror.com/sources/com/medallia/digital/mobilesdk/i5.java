package com.medallia.digital.mobilesdk;

import android.media.MediaMetadataRetriever;
import java.io.IOException;

/* loaded from: classes7.dex */
class i5 extends MediaMetadataRetriever implements AutoCloseable {
    i5() {
    }

    @Override // android.media.MediaMetadataRetriever, java.lang.AutoCloseable
    public void close() throws IOException {
        super.release();
    }
}
