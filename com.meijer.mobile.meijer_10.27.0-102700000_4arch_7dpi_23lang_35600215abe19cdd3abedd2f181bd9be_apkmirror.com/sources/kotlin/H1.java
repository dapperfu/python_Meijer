package kotlin;

import V0.C5346q0;
import V0.SolidColor;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.BorderStroke;
import kotlin.C6317c;
import kotlin.C6327j;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "isError", "Lh0/j;", "interactionSource", "Lx0/F1;", "colors", "LH1/h;", "focusedBorderThickness", "unfocusedBorderThickness", "Landroidx/compose/runtime/z1;", "Ld0/h;", "b", "(ZZLh0/j;Lx0/F1;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "focused", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class H1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final z1<BorderStroke> b(boolean z10, boolean z11, h0.j jVar, F1 f12, float f10, float f11, Composer composer, int i10) {
        float f13;
        z1<H1.h> z1VarP;
        if (ComposerKt.M()) {
            ComposerKt.U(1097899920, i10, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:970)");
        }
        z1<Boolean> z1VarA = h0.f.a(jVar, composer, (i10 >> 6) & 14);
        z1<C5346q0> z1VarI = f12.i(z10, z11, jVar, composer, i10 & 8190);
        if (c(z1VarA)) {
            f13 = f10;
        } else {
            f13 = f11;
        }
        if (z10) {
            composer.startReplaceGroup(773088894);
            z1VarP = C6317c.c(f13, C6327j.l(BinsView.TOTE_WIDTH_DP, 0, null, 6, null), null, null, composer, 48, 12);
            composer.P();
        } else {
            composer.startReplaceGroup(773193116);
            z1VarP = o1.p(H1.h.l(f11), composer, (i10 >> 15) & 14);
            composer.P();
        }
        z1<BorderStroke> z1VarP2 = o1.p(new BorderStroke(z1VarP.getValue().getValue(), new SolidColor(z1VarI.getValue().getValue(), null), null), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarP2;
    }

    private static final boolean c(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }
}
