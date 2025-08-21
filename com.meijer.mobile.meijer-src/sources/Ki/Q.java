package Ki;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import ki.InterfaceC15167f;
import ki.w1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00032\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\u000b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aH\u0010\r\u001a\u00020\u0005\"\u0012\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lki/f;", "T", "LKi/M;", "Lkotlin/Function1;", "variant", "", "Lkotlin/ExtensionFunctionType;", "content", "f", "(LKi/M;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lki/w1;", "e", "(LKi/M;Lki/w1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "d", "(LKi/M;Lki/f;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lki/f;", "T", "LKi/M;", "it", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class a<T> implements w1<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<LocalThemeScope, T> f17333a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super LocalThemeScope, ? extends T> function1) {
            this.f17333a = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: (LKi/M;Landroidx/compose/runtime/Composer;I)TT; */
        @Override // ki.w1
        public final InterfaceC15167f q(LocalThemeScope it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            composer.startReplaceGroup(-425434940);
            if (ComposerKt.M()) {
                ComposerKt.U(-425434940, i10, -1, "com.meijer.mobile.android_acres_library.foundations.v2.Assemble.<no name provided>.generateAssembly (LocalThemeScope.kt:50)");
            }
            InterfaceC15167f interfaceC15167f = (InterfaceC15167f) this.f17333a.invoke(it);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC15167f;
        }
    }

    public static final <T extends InterfaceC15167f & w1<T>> void d(final LocalThemeScope localThemeScope, final T variant, final Function3<? super T, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(variant, "variant");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(846434729);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(variant) : composerStartRestartGroup.D(variant) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(846434729, i11, -1, "com.meijer.mobile.android_acres_library.foundations.v2.Assemble (LocalThemeScope.kt:65)");
            }
            int i12 = i11 >> 3;
            content.invoke(((w1) variant).q(localThemeScope, composerStartRestartGroup, (i11 & 112) | (i11 & 14) | ((i12 & 8) << 3)), composerStartRestartGroup, Integer.valueOf(i12 & BinsView.TOTE_HEIGHT_DP));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ki.P
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Q.i(localThemeScope, variant, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <T extends InterfaceC15167f> void e(final LocalThemeScope localThemeScope, final w1<T> variant, final Function3<? super T, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(variant, "variant");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2055630906);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(variant) : composerStartRestartGroup.D(variant) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2055630906, i11, -1, "com.meijer.mobile.android_acres_library.foundations.v2.Assemble (LocalThemeScope.kt:57)");
            }
            content.invoke(variant.q(localThemeScope, composerStartRestartGroup, i11 & 126), composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 112));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ki.N
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Q.h(localThemeScope, variant, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <T extends InterfaceC15167f> void f(final LocalThemeScope localThemeScope, final Function1<? super LocalThemeScope, ? extends T> variant, final Function3<? super T, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(variant, "variant");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-897417970);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(variant) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-897417970, i11, -1, "com.meijer.mobile.android_acres_library.foundations.v2.Assemble (LocalThemeScope.kt:49)");
            }
            content.invoke(new a(variant).q(localThemeScope, composerStartRestartGroup, i11 & 14), composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 112));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ki.O
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Q.g(localThemeScope, variant, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Function1 function1, Function3 function3, int i10, Composer composer, int i11) {
        f(localThemeScope, function1, function3, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, w1 w1Var, Function3 function3, int i10, Composer composer, int i11) {
        e(localThemeScope, w1Var, function3, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, InterfaceC15167f interfaceC15167f, Function3 function3, int i10, Composer composer, int i11) {
        d(localThemeScope, interfaceC15167f, function3, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
