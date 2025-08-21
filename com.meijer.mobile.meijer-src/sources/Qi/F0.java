package Qi;

import Ki.LocalThemeScope;
import android.annotation.SuppressLint;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14900d;
import kotlin.C17959M0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mi.C15726h;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u001a)\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\t\u0010\u0007\u001a)\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\n\u0010\u0007\u001a)\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a)\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\f\u0010\u0007\u001a)\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"LKi/M;", "Lx0/M0;", "sheetState", "Lkotlin/Function0;", "", "content", "S", "(LKi/M;Lx0/M0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "c0", "W", "i0", "D", "J", "O", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class F0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28507a;

        a(LocalThemeScope localThemeScope) {
            this.f28507a = localThemeScope;
        }

        public final void a(InterfaceC14900d AcresBottomSheet, Composer composer, int i10) {
            Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(768739866, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CustomContentBottomSheet.<anonymous> (BottomSheetShowcase.kt:386)");
            }
            C15726h.l(this.f28507a, "Custom content can be placed here.", composer, 48, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            a(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28508a;

        b(LocalThemeScope localThemeScope) {
            this.f28508a = localThemeScope;
        }

        public final void a(InterfaceC14900d AcresBottomSheet, Composer composer, int i10) {
            Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-967344039, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CustomContentWithFooterBottomSheet.<anonymous> (BottomSheetShowcase.kt:403)");
            }
            C15726h.l(this.f28508a, "Custom content can be placed here.", composer, 48, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            a(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28509a;

        c(LocalThemeScope localThemeScope) {
            this.f28509a = localThemeScope;
        }

        public final void a(InterfaceC14900d AcresBottomSheet, Composer composer, int i10) {
            Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(184454311, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CustomContentWithHeaderBottomSheet.<anonymous> (BottomSheetShowcase.kt:419)");
            }
            C15726h.l(this.f28509a, "Custom content can be placed here.", composer, 48, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            a(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @SuppressLint({"ComposableLambdaParameterNaming"})
    public static final void D(final LocalThemeScope localThemeScope, final C17959M0 sheetState, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(sheetState, "sheetState");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(330181655);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(sheetState) : composerStartRestartGroup.D(sheetState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(330181655, i11, -1, "com.meijer.mobile.androidacres.showcase.components.CustomContentBottomSheet (BottomSheetShowcase.kt:375)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function0() { // from class: Qi.s0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.E();
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new Function0() { // from class: Qi.t0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.F();
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            Function0 function02 = (Function0) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = new Function0() { // from class: Qi.u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.G();
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            Function0 function03 = (Function0) objB3;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion.a()) {
                objB4 = new Function0() { // from class: Qi.v0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.H();
                    }
                };
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C15726h.j(localThemeScope, null, sheetState, "Heading", "This is a sentence case description. Multiple lines are permitted to convey important information but brevity is encouraged.", "Primary Action", "Secondary Action", function0, function02, function03, (Function0) objB4, false, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.c(768739866, true, new a(localThemeScope), composerStartRestartGroup, 54), false, function2, composer2, (i11 & 14) | 920349696 | (C17959M0.f168297e << 6) | ((i11 << 3) & 896), ((i11 << 15) & 29360128) | 196614, 48129);
            content = function2;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.w0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return F0.I(localThemeScope, sheetState, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, C17959M0 c17959m0, Function2 function2, int i10, Composer composer, int i11) {
        D(localThemeScope, c17959m0, function2, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void J(final LocalThemeScope localThemeScope, final C17959M0 sheetState, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(sheetState, "sheetState");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1438447082);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(sheetState) : composerStartRestartGroup.D(sheetState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1438447082, i11, -1, "com.meijer.mobile.androidacres.showcase.components.CustomContentWithFooterBottomSheet (BottomSheetShowcase.kt:396)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function0() { // from class: Qi.f0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.K();
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new Function0() { // from class: Qi.g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.L();
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            Function0 function02 = (Function0) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = new Function0() { // from class: Qi.h0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.M();
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C15726h.j(localThemeScope, null, sheetState, null, null, null, "Secondary Action", null, function0, function02, (Function0) objB3, false, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.c(-967344039, true, new b(localThemeScope), composerStartRestartGroup, 54), false, function2, composer2, (i11 & 14) | 907542528 | (C17959M0.f168297e << 6) | ((i11 << 3) & 896), ((i11 << 15) & 29360128) | 196614, 48221);
            content = function2;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return F0.N(localThemeScope, sheetState, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(LocalThemeScope localThemeScope, C17959M0 c17959m0, Function2 function2, int i10, Composer composer, int i11) {
        J(localThemeScope, c17959m0, function2, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void O(final LocalThemeScope localThemeScope, final C17959M0 sheetState, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(sheetState, "sheetState");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-286648732);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(sheetState) : composerStartRestartGroup.D(sheetState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-286648732, i11, -1, "com.meijer.mobile.androidacres.showcase.components.CustomContentWithHeaderBottomSheet (BottomSheetShowcase.kt:413)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function0() { // from class: Qi.p0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.P();
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new Function0() { // from class: Qi.q0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.Q();
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C15726h.j(localThemeScope, null, sheetState, "Heading", null, null, null, null, null, function0, (Function0) objB2, false, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.c(184454311, true, new c(localThemeScope), composerStartRestartGroup, 54), false, function2, composer2, (i11 & 14) | 805309440 | (C17959M0.f168297e << 6) | ((i11 << 3) & 896), ((i11 << 15) & 29360128) | 196614, 48377);
            content = function2;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.r0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return F0.R(localThemeScope, sheetState, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(LocalThemeScope localThemeScope, C17959M0 c17959m0, Function2 function2, int i10, Composer composer, int i11) {
        O(localThemeScope, c17959m0, function2, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void S(final LocalThemeScope localThemeScope, final C17959M0 sheetState, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(sheetState, "sheetState");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2130241214);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(sheetState) : composerStartRestartGroup.D(sheetState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2130241214, i11, -1, "com.meijer.mobile.androidacres.showcase.components.DefaultBottomSheet (BottomSheetShowcase.kt:302)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function0() { // from class: Qi.z0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.T();
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new Function0() { // from class: Qi.A0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.U();
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C15726h.j(localThemeScope, null, sheetState, "Heading", "This is the default bottom sheet description. It provides more context about this modal.", null, null, null, null, function0, (Function0) objB2, false, 0.0f, 0.0f, 0.0f, null, false, function2, composer2, (i11 & 14) | 805334016 | (C17959M0.f168297e << 6) | ((i11 << 3) & 896), ((i11 << 15) & 29360128) | 6, 64753);
            content = function2;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.B0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return F0.V(localThemeScope, sheetState, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(LocalThemeScope localThemeScope, C17959M0 c17959m0, Function2 function2, int i10, Composer composer, int i11) {
        S(localThemeScope, c17959m0, function2, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void W(final LocalThemeScope localThemeScope, final C17959M0 sheetState, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(sheetState, "sheetState");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-83931316);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(sheetState) : composerStartRestartGroup.D(sheetState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-83931316, i11, -1, "com.meijer.mobile.androidacres.showcase.components.FooterOnlyBottomSheet (BottomSheetShowcase.kt:338)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function0() { // from class: Qi.C0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.X();
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new Function0() { // from class: Qi.D0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.Y();
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            Function0 function02 = (Function0) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = new Function0() { // from class: Qi.E0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.Z();
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            Function0 function03 = (Function0) objB3;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion.a()) {
                objB4 = new Function0() { // from class: Qi.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.a0();
                    }
                };
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C15726h.j(localThemeScope, null, sheetState, null, "This bottom sheet contains both a header and a footer. It includes actions and additional details.", "Primary Action", "Secondary Action", function0, function02, function03, (Function0) objB4, false, 0.0f, 0.0f, 0.0f, null, false, function2, composer2, (i11 & 14) | 920346624 | (C17959M0.f168297e << 6) | ((i11 << 3) & 896), ((i11 << 15) & 29360128) | 6, 64517);
            content = function2;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return F0.b0(localThemeScope, sheetState, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(LocalThemeScope localThemeScope, C17959M0 c17959m0, Function2 function2, int i10, Composer composer, int i11) {
        W(localThemeScope, c17959m0, function2, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void c0(final LocalThemeScope localThemeScope, final C17959M0 sheetState, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(sheetState, "sheetState");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(338785082);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(sheetState) : composerStartRestartGroup.D(sheetState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(338785082, i11, -1, "com.meijer.mobile.androidacres.showcase.components.HeaderAndFooterBottomSheet (BottomSheetShowcase.kt:318)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function0() { // from class: Qi.j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.g0();
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new Function0() { // from class: Qi.k0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.h0();
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            Function0 function02 = (Function0) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = new Function0() { // from class: Qi.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.d0();
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            Function0 function03 = (Function0) objB3;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion.a()) {
                objB4 = new Function0() { // from class: Qi.m0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.e0();
                    }
                };
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C15726h.j(localThemeScope, null, sheetState, "Heading", "This bottom sheet contains both a header and a footer. It includes actions and additional details.", "Primary Action", "Secondary Action", function0, function02, function03, (Function0) objB4, false, 0.0f, 0.0f, 0.0f, null, false, function2, composer2, (i11 & 14) | 920349696 | (C17959M0.f168297e << 6) | ((i11 << 3) & 896), ((i11 << 15) & 29360128) | 6, 64513);
            content = function2;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return F0.f0(localThemeScope, sheetState, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(LocalThemeScope localThemeScope, C17959M0 c17959m0, Function2 function2, int i10, Composer composer, int i11) {
        c0(localThemeScope, c17959m0, function2, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0() {
        return Unit.f143329a;
    }

    public static final void i0(final LocalThemeScope localThemeScope, final C17959M0 sheetState, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(sheetState, "sheetState");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(825820271);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(sheetState) : composerStartRestartGroup.D(sheetState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(825820271, i11, -1, "com.meijer.mobile.androidacres.showcase.components.SecondryActionButtonsBottomSheet (BottomSheetShowcase.kt:357)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function0() { // from class: Qi.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.j0();
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new Function0() { // from class: Qi.n0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.k0();
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            Function0 function02 = (Function0) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = new Function0() { // from class: Qi.x0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.l0();
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C15726h.j(localThemeScope, null, sheetState, null, "This bottom sheet contains both a header and a footer. It includes actions and additional details.", null, "Secondary Action", null, function0, function02, (Function0) objB3, false, 0.0f, 0.0f, 0.0f, null, false, function2, composer2, (i11 & 14) | 907567104 | (C17959M0.f168297e << 6) | ((i11 << 3) & 896), ((i11 << 15) & 29360128) | 6, 64597);
            content = function2;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.y0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return F0.m0(localThemeScope, sheetState, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(LocalThemeScope localThemeScope, C17959M0 c17959m0, Function2 function2, int i10, Composer composer, int i11) {
        i0(localThemeScope, c17959m0, function2, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
