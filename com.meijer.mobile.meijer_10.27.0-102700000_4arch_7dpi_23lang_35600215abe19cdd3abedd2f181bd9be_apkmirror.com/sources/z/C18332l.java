package z;

import F.v0;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;

/* renamed from: z.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18332l {

    /* renamed from: a, reason: collision with root package name */
    private final ExtraCroppingQuirk f171382a;

    public C18332l() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class));
    }

    C18332l(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f171382a = extraCroppingQuirk;
    }

    public Size a(Size size) {
        Size sizeC;
        ExtraCroppingQuirk extraCroppingQuirk = this.f171382a;
        return (extraCroppingQuirk == null || (sizeC = extraCroppingQuirk.c(v0.b.PRIV)) == null || sizeC.getWidth() * sizeC.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizeC;
    }
}
