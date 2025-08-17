package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final f3.g f56096a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f56097b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f56098c;

    /* renamed from: d, reason: collision with root package name */
    public final long f56099d;

    public MediaDrmCallbackException(f3.g gVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th2) {
        super(th2);
        this.f56096a = gVar;
        this.f56097b = uri;
        this.f56098c = map;
        this.f56099d = j10;
    }
}
