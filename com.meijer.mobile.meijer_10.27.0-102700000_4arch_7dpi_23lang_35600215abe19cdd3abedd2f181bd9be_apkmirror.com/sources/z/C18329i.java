package z;

import C.P;
import F.l0;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Iterator;
import java.util.List;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18329i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f171379a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f171380b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f171381c;

    public boolean b() {
        return this.f171379a || this.f171380b || this.f171381c;
    }

    public C18329i(l0 l0Var, l0 l0Var2) {
        this.f171379a = l0Var2.a(TextureViewIsClosedQuirk.class);
        this.f171380b = l0Var.a(PreviewOrientationIncorrectQuirk.class);
        this.f171381c = l0Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void a(List<DeferrableSurface> list) {
        if (b() && list != null) {
            Iterator<DeferrableSurface> it = list.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            P.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
