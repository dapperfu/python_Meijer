package Am;

import Am.p0;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14814f;
import java.util.List;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16088n;
import ss.C17037o;
import ts.ProductCardDecorator;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lts/a;", "oosProducts", "", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class p0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<ProductCardDecorator> f1027a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1028b;

        a(List<ProductCardDecorator> list, LocalThemeScope localThemeScope) {
            this.f1027a = list;
            this.f1028b = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p() {
            return Unit.f142422a;
        }

        public final void f(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Composer composer2 = composer;
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1465597913, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.OutOfStockBottomSheetContent.<anonymous> (OutOfStockBottomSheetContent.kt:32)");
            }
            int i11 = 0;
            for (ProductCardDecorator productCardDecorator : this.f1027a) {
                int i12 = i11 + 1;
                LocalThemeScope localThemeScope = this.f1028b;
                composer2.startReplaceGroup(1849434622);
                Object objB = composer2.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new Function0() { // from class: Am.k0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p0.a.g();
                        }
                    };
                    composer2.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer2.P();
                composer2.startReplaceGroup(1849434622);
                Object objB2 = composer2.B();
                if (objB2 == companion.a()) {
                    objB2 = new Function0() { // from class: Am.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p0.a.k();
                        }
                    };
                    composer2.t(objB2);
                }
                Function0 function02 = (Function0) objB2;
                composer2.P();
                composer2.startReplaceGroup(1849434622);
                Object objB3 = composer2.B();
                if (objB3 == companion.a()) {
                    objB3 = new Function0() { // from class: Am.m0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p0.a.l();
                        }
                    };
                    composer2.t(objB3);
                }
                Function0 function03 = (Function0) objB3;
                composer2.P();
                composer2.startReplaceGroup(1849434622);
                Object objB4 = composer2.B();
                if (objB4 == companion.a()) {
                    objB4 = new Function0() { // from class: Am.n0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p0.a.o();
                        }
                    };
                    composer2.t(objB4);
                }
                Function0 function04 = (Function0) objB4;
                composer2.P();
                composer2.startReplaceGroup(1849434622);
                Object objB5 = composer2.B();
                if (objB5 == companion.a()) {
                    objB5 = new Function0() { // from class: Am.o0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p0.a.p();
                        }
                    };
                    composer2.t(objB5);
                }
                composer2.P();
                C17037o.v(localThemeScope, productCardDecorator, i11, null, false, null, function0, function02, function03, 11.0d, false, function04, (Function0) objB5, null, false, false, false, false, false, 0, false, false, false, null, composer, 920346624 | LocalThemeScope.f15770g | (ProductCardDecorator.f162061C << 3), 14156214, 54, 6713348);
                composer2 = composer;
                i11 = i12;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            f(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, Modifier modifier, final List<ProductCardDecorator> oosProducts, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(oosProducts, "oosProducts");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1411962737);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(oosProducts) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1411962737, i12, -1, "com.meijer.mobile.meijer.activity.checkout.composables.OutOfStockBottomSheetContent (OutOfStockBottomSheetContent.kt:26)");
            }
            C16088n.e(localThemeScope, new q1.Column(androidx.compose.foundation.layout.J.h(modifier, 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(1465597913, true, new a(oosProducts, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Am.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p0.c(localThemeScope, modifier2, oosProducts, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, List list, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, list, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
