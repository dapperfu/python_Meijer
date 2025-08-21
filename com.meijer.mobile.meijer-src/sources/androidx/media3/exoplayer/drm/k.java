package androidx.media3.exoplayer.drm;

import a3.o;
import android.media.MediaDrmException;
import androidx.media3.exoplayer.drm.m;
import g3.InterfaceC14324b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements m {
    @Override // androidx.media3.exoplayer.drm.m
    public int f() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void i(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void k(m.b bVar) {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void release() {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.d b() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void d(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void e(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public InterfaceC14324b g(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean h(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.a m(byte[] bArr, List<o.b> list, int i10, HashMap<String, String> map) {
        throw new IllegalStateException();
    }
}
