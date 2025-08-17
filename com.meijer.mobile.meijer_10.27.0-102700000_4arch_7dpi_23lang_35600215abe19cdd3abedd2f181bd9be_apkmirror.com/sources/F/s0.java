package F;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;

/* loaded from: classes.dex */
public final class s0 extends DeferrableSurface {

    /* renamed from: o, reason: collision with root package name */
    private final Surface f10027o;

    @Override // androidx.camera.core.impl.DeferrableSurface
    public com.google.common.util.concurrent.q<Surface> o() {
        return I.n.p(this.f10027o);
    }
}
