package F;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;

/* loaded from: classes.dex */
public final class T extends DeferrableSurface {

    /* renamed from: o, reason: collision with root package name */
    private final Surface f9916o;

    public T(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f9916o = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public com.google.common.util.concurrent.q<Surface> o() {
        return I.n.p(this.f9916o);
    }

    public T(Surface surface) {
        this.f9916o = surface;
    }
}
