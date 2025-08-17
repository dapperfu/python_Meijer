package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import w.U;

/* loaded from: classes.dex */
class W implements U.a {

    /* renamed from: a, reason: collision with root package name */
    final StreamConfigurationMap f165187a;

    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    @Override // w.U.a
    public StreamConfigurationMap a() {
        return this.f165187a;
    }

    @Override // w.U.a
    public int[] c() {
        try {
            return this.f165187a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e10) {
            C.P.m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e10);
            return null;
        }
    }

    @Override // w.U.a
    public Size[] d(int i10) {
        return a.a(this.f165187a, i10);
    }

    W(StreamConfigurationMap streamConfigurationMap) {
        this.f165187a = streamConfigurationMap;
    }
}
