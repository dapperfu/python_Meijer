package Ih;

import Ih.w;
import Ih.y;
import Ji.LocalThemeScope;
import V0.C5346q0;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import kotlin.C17906T0;
import kotlin.C6165d;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16692i;
import r1.C16705m;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\u0007¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "LIh/y$b;", "passwordStrength", "Landroidx/compose/ui/Modifier;", "modifier", "", "i", "(LJi/M;LIh/y$b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "strength", "e", "", "visibility", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class w {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y.b f14033a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14034b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f14035c;

        a(y.b bVar, LocalThemeScope localThemeScope, Modifier modifier) {
            this.f14033a = bVar;
            this.f14034b = localThemeScope;
            this.f14035c = modifier;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.w(semantics);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.w(semantics);
            return Unit.f142422a;
        }

        public final void c(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            C5346q0 c5346q0M;
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-713124147, i10, -1, "com.meijer.mobile.accounts.ux.composables.PasswordStrengthBar.<anonymous> (PasswordStrengthIndicator.kt:82)");
            }
            y.b bVar = this.f14033a;
            if (Intrinsics.e(bVar, y.b.a.f14052c)) {
                c5346q0M = C5346q0.m(this.f14034b.getAdsColors().getAdsColorSupportError().getColor());
            } else if (Intrinsics.e(bVar, y.b.d.f14055c)) {
                c5346q0M = C5346q0.m(this.f14034b.getAdsColors().getAdsColorSupportWarning().getColor());
            } else if (Intrinsics.e(bVar, y.b.c.f14054c)) {
                c5346q0M = C5346q0.m(this.f14034b.getAdsColors().getAdsColorSupportSuccess().getColor());
            } else {
                if (!Intrinsics.e(bVar, y.b.C0221b.f14053c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c5346q0M = null;
            }
            if (c5346q0M != null) {
                Modifier modifier = this.f14035c;
                LocalThemeScope localThemeScope = this.f14034b;
                y.b bVar2 = this.f14033a;
                long value = c5346q0M.getValue();
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.o(localThemeScope.getAdsSpacing().getThree().getDp()), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifier);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierA = T0.e.a(companion2, C16692i.c(localThemeScope.getAdsSpacing().getTwo().getDp()));
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objB == companion3.a()) {
                    objB = new Function1() { // from class: Ih.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return w.a.d((r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C17906T0.g(1.0f, C16705m.d(modifierA, false, (Function1) objB, 1, null), value, localThemeScope.getAdsColors().getAdsColorActiveTransparent().getColor(), 0, composer, 6, 16);
                y.b.c cVar = y.b.c.f14054c;
                float f10 = Intrinsics.e(bVar2, cVar) ? 1.0f : 0.0f;
                Modifier modifierA2 = T0.e.a(companion2, C16692i.c(localThemeScope.getAdsCornerRadii().getRadius02().getDp()));
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion3.a()) {
                    objB2 = new Function1() { // from class: Ih.v
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return w.a.e((r1.u) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C17906T0.g(f10, C16705m.d(modifierA2, false, (Function1) objB2, 1, null), Intrinsics.e(bVar2, cVar) ? localThemeScope.getAdsColors().getAdsColorSupportSuccess().getColor() : localThemeScope.getAdsColors().getAdsColorActiveTransparent().getColor(), localThemeScope.getAdsColors().getAdsColorActiveTransparent().getColor(), 0, composer, 0, 16);
                composer.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            c(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(y.b bVar) {
        return !Intrinsics.e(bVar, y.b.C0221b.f14053c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, y.b bVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, bVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ji.LocalThemeScope r28, final Ih.y.b r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ih.w.i(Ji.M, Ih.y$b, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, y.b bVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, bVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final void e(final LocalThemeScope localThemeScope, final y.b bVar, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1295530843);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(bVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1295530843, i12, -1, "com.meijer.mobile.accounts.ux.composables.PasswordStrengthBar (PasswordStrengthIndicator.kt:76)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new Function0() { // from class: Ih.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(w.f(bVar));
                    }
                });
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C6165d.f(g((z1) objB), null, null, null, null, ComposableLambdaKt.c(-713124147, true, new a(bVar, localThemeScope, modifier), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 30);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ih.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.h(localThemeScope, bVar, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean g(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }
}
