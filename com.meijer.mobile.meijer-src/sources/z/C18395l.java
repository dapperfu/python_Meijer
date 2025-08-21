package z;

import F.v0;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;

/* renamed from: z.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18395l {

    /* renamed from: a, reason: collision with root package name */
    private final ExtraCroppingQuirk f172178a;

    public C18395l() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class));
    }

    C18395l(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f172178a = extraCroppingQuirk;
    }

    public Size a(Size size) {
        Size sizeC;
        ExtraCroppingQuirk extraCroppingQuirk = this.f172178a;
        return (extraCroppingQuirk == null || (sizeC = extraCroppingQuirk.c(v0.b.PRIV)) == null || sizeC.getWidth() * sizeC.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizeC;
    }
}
