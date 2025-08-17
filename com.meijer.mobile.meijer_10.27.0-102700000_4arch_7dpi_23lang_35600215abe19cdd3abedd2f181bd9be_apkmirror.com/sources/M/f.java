package M;

import C.Y;
import android.media.MediaCodec;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.w;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18753a;

    public void c(List<w.f> list) {
        if (this.f18753a) {
            Collections.sort(list, new Comparator() { // from class: M.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return f.a(this.f18752a, (w.f) obj, (w.f) obj2);
                }
            });
        }
    }

    public f() {
        boolean z10;
        if (androidx.camera.core.internal.compat.quirk.a.b(SurfaceOrderQuirk.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18753a = z10;
    }

    public static /* synthetic */ int a(f fVar, w.f fVar2, w.f fVar3) {
        fVar.getClass();
        return fVar.b(fVar2.f()) - fVar.b(fVar3.f());
    }

    private int b(DeferrableSurface deferrableSurface) {
        if (deferrableSurface.g() == MediaCodec.class) {
            return 2;
        }
        if (deferrableSurface.g() == Y.class) {
            return 0;
        }
        return 1;
    }
}
