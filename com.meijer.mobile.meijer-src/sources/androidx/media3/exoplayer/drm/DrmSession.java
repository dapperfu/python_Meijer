package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.h;
import g3.InterfaceC14324b;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface DrmSession {
    UUID a();

    default boolean b() {
        return false;
    }

    InterfaceC14324b d();

    void e(h.a aVar);

    Map<String, String> f();

    void g(h.a aVar);

    DrmSessionException getError();

    int getState();

    boolean h(String str);

    public static class DrmSessionException extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f56319a;

        public DrmSessionException(Throwable th2, int i10) {
            super(th2);
            this.f56319a = i10;
        }
    }

    static void c(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.e(null);
        }
        if (drmSession != null) {
            drmSession.g(null);
        }
    }
}
