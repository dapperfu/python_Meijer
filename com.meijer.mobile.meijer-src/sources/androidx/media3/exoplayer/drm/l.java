package androidx.media3.exoplayer.drm;

import a3.C5652i;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import d3.C13599a;
import g3.InterfaceC14324b;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class l implements DrmSession {

    /* renamed from: a, reason: collision with root package name */
    private final DrmSession.DrmSessionException f56344a;

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public InterfaceC14324b d() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void e(h.a aVar) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map<String, String> f() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void g(h.a aVar) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean h(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID a() {
        return C5652i.f44650a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public DrmSession.DrmSessionException getError() {
        return this.f56344a;
    }

    public l(DrmSession.DrmSessionException drmSessionException) {
        this.f56344a = (DrmSession.DrmSessionException) C13599a.e(drmSessionException);
    }
}
