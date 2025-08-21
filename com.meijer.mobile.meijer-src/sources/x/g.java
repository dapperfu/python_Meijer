package x;

import C.C3037w;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;
import w.B;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final a f167700a;

    interface a {
        DynamicRangeProfiles a();

        Set<C3037w> b();

        Set<C3037w> c(C3037w c3037w);
    }

    public static g a(B b10) {
        g gVarE = Build.VERSION.SDK_INT >= 33 ? e(f.a(b10.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return gVarE == null ? i.f167702a : gVarE;
    }

    public static g e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        o2.i.j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new g(new h(dynamicRangeProfiles));
    }

    public Set<C3037w> b(C3037w c3037w) {
        return this.f167700a.c(c3037w);
    }

    public Set<C3037w> c() {
        return this.f167700a.b();
    }

    public DynamicRangeProfiles d() {
        o2.i.j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f167700a.a();
    }

    g(a aVar) {
        this.f167700a = aVar;
    }
}
