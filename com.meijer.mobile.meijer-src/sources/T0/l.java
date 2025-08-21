package T0;

import V0.C5456e1;
import V0.D1;
import V0.x1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aF\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "LH1/h;", "elevation", "LV0/D1;", "shape", "", "clip", "LV0/q0;", "ambientColor", "spotColor", "a", "(Landroidx/compose/ui/Modifier;FLV0/D1;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class l {
    public static final Modifier a(Modifier modifier, float f10, D1 d12, boolean z10, long j10, long j11) {
        return (H1.h.o(f10, H1.h.p((float) 0)) > 0 || z10) ? modifier.then(new ShadowGraphicsLayerElement(f10, d12, z10, j10, j11, null)) : modifier;
    }

    public static /* synthetic */ Modifier b(Modifier modifier, float f10, D1 d12, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        D1 d1A = (i10 & 2) != 0 ? x1.a() : d12;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (H1.h.o(f10, H1.h.p(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return a(modifier, f10, d1A, z11, (i10 & 8) != 0 ? C5456e1.a() : j10, (i10 & 16) != 0 ? C5456e1.a() : j11);
    }
}
