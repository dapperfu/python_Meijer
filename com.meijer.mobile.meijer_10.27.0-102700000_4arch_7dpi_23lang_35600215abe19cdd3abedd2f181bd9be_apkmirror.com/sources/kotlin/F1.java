package kotlin;

import V0.C5346q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.z1;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0012\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0011J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0014\u0010\u000eJ-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0015\u0010\u000eJ\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lx0/F1;", "", "", "enabled", "Landroidx/compose/runtime/z1;", "LV0/q0;", "g", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "a", "e", "error", "Lh0/j;", "interactionSource", "f", "(ZZLh0/j;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "isError", "c", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "h", "d", "b", "i", "j", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface F1 {
    z1<C5346q0> a(boolean z10, Composer composer, int i10);

    @Deprecated
    z1<C5346q0> c(boolean z10, boolean z11, Composer composer, int i10);

    @Deprecated
    z1<C5346q0> d(boolean z10, boolean z11, Composer composer, int i10);

    z1<C5346q0> e(boolean z10, Composer composer, int i10);

    z1<C5346q0> f(boolean z10, boolean z11, h0.j jVar, Composer composer, int i10);

    z1<C5346q0> g(boolean z10, Composer composer, int i10);

    z1<C5346q0> i(boolean z10, boolean z11, h0.j jVar, Composer composer, int i10);

    z1<C5346q0> j(boolean z10, Composer composer, int i10);

    default z1<C5346q0> b(boolean z10, boolean z11, h0.j jVar, Composer composer, int i10) {
        composer.startReplaceGroup(454310320);
        if (ComposerKt.M()) {
            ComposerKt.U(454310320, i10, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:155)");
        }
        z1<C5346q0> z1VarD = d(z10, z11, composer, (i10 & 126) | ((i10 >> 3) & 896));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarD;
    }

    default z1<C5346q0> h(boolean z10, boolean z11, h0.j jVar, Composer composer, int i10) {
        composer.startReplaceGroup(-1036335134);
        if (ComposerKt.M()) {
            ComposerKt.U(-1036335134, i10, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:124)");
        }
        z1<C5346q0> z1VarC = c(z10, z11, composer, (i10 & 126) | ((i10 >> 3) & 896));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarC;
    }
}
