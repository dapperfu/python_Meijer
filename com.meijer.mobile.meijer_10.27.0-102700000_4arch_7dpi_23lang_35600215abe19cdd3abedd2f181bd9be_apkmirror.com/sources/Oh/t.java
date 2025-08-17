package Oh;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15860s0;
import ni.P0;
import p1.C16193g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b²\u0006\u000e\u0010\b\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "isSaveEnabled", "Lkotlin/Function0;", "", "onClick", "b", "(LJi/M;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "enableSave", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class t {
    public static final void b(final LocalThemeScope localThemeScope, final boolean z10, final Function0<Unit> onClick, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1841302126);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1841302126, i11, -1, "com.meijer.mobile.accounts.ux.composables.preferences.SavePreferenceButton (SavePreferenceButton.kt:25)");
            }
            int i12 = i11;
            P0.k(localThemeScope, C15860s0.f151792a, C16193g.c(Fh.h.f10499D4, composerStartRestartGroup, 0), onClick, null, C16193g.c(Fh.h.f10499D4, composerStartRestartGroup, 0), true, 0L, z10, composerStartRestartGroup, 1572864 | LocalThemeScope.f15770g | (i12 & 14) | (C15860s0.f151793b << 3) | ((i12 << 3) & 7168) | ((i12 << 21) & 234881024), 72);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oh.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t.c(localThemeScope, z10, onClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, boolean z10, Function0 function0, int i10, Composer composer, int i11) {
        b(localThemeScope, z10, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
