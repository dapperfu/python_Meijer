package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.m;
import java.util.UUID;

/* loaded from: classes.dex */
public interface p {
    byte[] a(UUID uuid, m.a aVar) throws MediaDrmCallbackException;

    byte[] b(UUID uuid, m.d dVar) throws MediaDrmCallbackException;
}
