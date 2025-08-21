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
public class C18392i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f172175a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f172176b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f172177c;

    public boolean b() {
        return this.f172175a || this.f172176b || this.f172177c;
    }

    public C18392i(l0 l0Var, l0 l0Var2) {
        this.f172175a = l0Var2.a(TextureViewIsClosedQuirk.class);
        this.f172176b = l0Var.a(PreviewOrientationIncorrectQuirk.class);
        this.f172177c = l0Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
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
