package Gr;

import Ki.C;
import Ki.LocalThemeScope;
import V0.C5489q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C18052y0;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p1.C16335d;
import p1.C16338g;
import yr.Q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LKi/M;", "", "isChecked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "b", "(LKi/M;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13156a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f13157b;

        a(boolean z10, LocalThemeScope localThemeScope) {
            this.f13156a = z10;
            this.f13157b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-647518712, i10, -1, "com.meijer.mobile.ui.common.compose.widgets.ShoppingListToggleButton.<anonymous> (ShoppingListToggleButton.kt:37)");
            }
            C18054z0.a(C16335d.c((this.f13156a ? C.j.t.f17139d : C.j.s.f17138d).getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), C16338g.c(this.f13156a ? Q.f171757Y : Q.f171756X, composer, 0), null, this.f13156a ? C5489q0.INSTANCE.j() : this.f13157b.getAdsColors().getAdsColorEnabled01().getColor(), composer, 0, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, final boolean z10, final Function1<? super Boolean, Unit> onCheckedChange, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onCheckedChange, "onCheckedChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1035077943);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(onCheckedChange) ? 256 : 128;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(1035077943, i12, -1, "com.meijer.mobile.ui.common.compose.widgets.ShoppingListToggleButton (ShoppingListToggleButton.kt:31)");
            }
            int i14 = i12 >> 3;
            int i15 = (i14 & 14) | 196608 | (i14 & 112) | (i14 & 896);
            modifier2 = modifier3;
            C18052y0.b(z10, onCheckedChange, modifier2, false, null, ComposableLambdaKt.c(-647518712, true, new a(z10, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, i15, 24);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Gr.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.c(localThemeScope, z10, onCheckedChange, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, boolean z10, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, z10, function1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
