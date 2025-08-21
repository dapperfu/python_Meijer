package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* loaded from: classes.dex */
class V extends W {
    @Override // w.U.a
    public Size[] b(int i10) {
        return this.f166398a.getOutputSizes(i10);
    }

    V(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }
}
