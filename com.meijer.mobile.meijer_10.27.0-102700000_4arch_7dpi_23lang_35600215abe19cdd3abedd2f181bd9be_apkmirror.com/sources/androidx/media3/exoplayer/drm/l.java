package androidx.media3.exoplayer.drm;

import a3.C5569i;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import d3.C13466a;
import g3.InterfaceC14195b;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class l implements DrmSession {

    /* renamed from: a, reason: collision with root package name */
    private final DrmSession.DrmSessionException f56120a;

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public InterfaceC14195b d() {
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
        return C5569i.f43832a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public DrmSession.DrmSessionException getError() {
        return this.f56120a;
    }

    public l(DrmSession.DrmSessionException drmSessionException) {
        this.f56120a = (DrmSession.DrmSessionException) C13466a.e(drmSessionException);
    }
}
