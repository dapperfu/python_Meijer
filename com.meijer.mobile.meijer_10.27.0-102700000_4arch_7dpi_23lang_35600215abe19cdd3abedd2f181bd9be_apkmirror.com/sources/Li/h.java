package Li;

import Ji.LocalThemeScope;
import Ji.Q;
import Li.h;
import P0.e;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import j0.InterfaceC14825q;
import java.util.List;
import ji.ChipButtons;
import ji.InterfaceC14905H;
import ji.InterfaceC14932e0;
import ji.InterfaceC14971y;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15851n1;
import ni.o1;
import ri.j;
import vi.s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\t\u001a:\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001aP\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001az\u0010 \u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0019*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001c\u001a\u00028\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u00012!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b \u0010!¨\u0006#²\u0006\u0016\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00198\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lkotlin/Function1;", "Lj0/f;", "", "Lkotlin/ExtensionFunctionType;", "debugControls", "Lkotlin/Function0;", "content", "f", "(LJi/M;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "text", "", "checked", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/ParameterName;", "name", "isChecked", "onCheckedChange", "o", "(LJi/M;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "label", "h", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "T", "", "options", "state", "itemText", "item", "onItemSelected", "j", "(LJi/M;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectedItem", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14825q, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18430a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<T> f18431b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<T> f18432c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<T, String> f18433d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f18434e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Li.h$a$a, reason: collision with other inner class name */
        static final class C0309a implements Function3<InterfaceC14905H, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<T> f18435a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<T> f18436b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<T, String> f18437c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18438d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<T, Unit> f18439e;

            /* JADX WARN: Multi-variable type inference failed */
            C0309a(List<? extends T> list, InterfaceC5730l0<T> interfaceC5730l0, Function1<? super T, String> function1, LocalThemeScope localThemeScope, Function1<? super T, Unit> function12) {
                this.f18435a = list;
                this.f18436b = interfaceC5730l0;
                this.f18437c = function1;
                this.f18438d = localThemeScope;
                this.f18439e = function12;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(boolean z10, InterfaceC14905H interfaceC14905H, Function1 function1, Object obj, o1 AcresChip) {
                Intrinsics.j(AcresChip, "$this$AcresChip");
                AcresChip.d(z10 ? interfaceC14905H.getLabels().getEnabledSelectedLabel() : interfaceC14905H.getLabels().getEnabledRestingLabel(), (String) function1.invoke(obj));
                return Unit.f142422a;
            }

            public final void c(final InterfaceC14905H Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                int i11 = 4;
                int i12 = (i10 & 6) == 0 ? i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2) : i10;
                if ((i12 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(32277039, i12, -1, "com.meijer.mobile.android_acres_library.preview.AdsPreviewStateSelector.<anonymous>.<anonymous>.<anonymous> (AdsPreview.kt:277)");
                }
                Iterable iterable = this.f18435a;
                final InterfaceC5730l0<T> interfaceC5730l0 = this.f18436b;
                final Function1<T, String> function1 = this.f18437c;
                LocalThemeScope localThemeScope = this.f18438d;
                final Function1 function12 = this.f18439e;
                for (final Object obj : iterable) {
                    composer.startReplaceGroup(953467297);
                    final boolean zE = Intrinsics.e(obj, h.l(interfaceC5730l0));
                    ChipButtons buttons = Assemble.getButtons();
                    q1.d.ChipButton enabledSelected = zE ? buttons.getEnabledSelected() : buttons.getEnabledResting();
                    String strInvoke = function1.invoke(obj);
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(obj) | composer.V(function12);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Li.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h.a.C0309a.d(obj, function12, interfaceC5730l0);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(-1224400529);
                    boolean zA = composer.a(zE) | ((i12 & 14) == i11 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.V(function1) | composer.D(obj);
                    Object objB2 = composer.B();
                    if (zA || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: Li.g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return h.a.C0309a.e(zE, Assemble, function1, obj, (o1) obj2);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    C15851n1.e(localThemeScope, null, function0, enabledSelected, strInvoke, zE, (Function1) objB2, composer, 0, 1);
                    C14802K.a(J.z(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                    composer.P();
                    function12 = function12;
                    i11 = 4;
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14905H interfaceC14905H, Composer composer, Integer num) {
                c(interfaceC14905H, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(Object obj, Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
                h.m(interfaceC5730l0, obj);
                function1.invoke(obj);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, List<? extends T> list, InterfaceC5730l0<T> interfaceC5730l0, Function1<? super T, String> function1, Function1<? super T, Unit> function12) {
            this.f18430a = localThemeScope;
            this.f18431b = list;
            this.f18432c = interfaceC5730l0;
            this.f18433d = function1;
            this.f18434e = function12;
        }

        public final void a(InterfaceC14825q FlowRow, Composer composer, int i10) {
            Intrinsics.j(FlowRow, "$this$FlowRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1420453956, i10, -1, "com.meijer.mobile.android_acres_library.preview.AdsPreviewStateSelector.<anonymous>.<anonymous> (AdsPreview.kt:276)");
            }
            LocalThemeScope localThemeScope = this.f18430a;
            Q.e(localThemeScope, InterfaceC14971y.a.C2218a.f140286a, ComposableLambdaKt.c(32277039, true, new C0309a(this.f18431b, this.f18432c, this.f18433d, localThemeScope, this.f18434e), composer, 54), composer, 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14825q interfaceC14825q, Composer composer, Integer num) {
            a(interfaceC14825q, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14932e0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18440a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f18441b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC14800I f18442c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f18443d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f18444e;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, String str, InterfaceC14800I interfaceC14800I, boolean z10, Function1<? super Boolean, Unit> function1) {
            this.f18440a = localThemeScope;
            this.f18441b = str;
            this.f18442c = interfaceC14800I;
            this.f18443d = z10;
            this.f18444e = function1;
        }

        public final void a(InterfaceC14932e0 Assemble, Composer composer, int i10) {
            int i11;
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(211946843, i11, -1, "com.meijer.mobile.android_acres_library.preview.AdsPreviewToggleButton.<anonymous>.<anonymous> (AdsPreview.kt:111)");
            }
            j.h(this.f18440a, Assemble.getLabels().getItemLabelEnabled(), this.f18441b, null, composer, 0, 4);
            C14802K.a(InterfaceC14800I.b(this.f18442c, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 0);
            s.b(this.f18440a, Assemble.getToggleButtons().getTrailingToggleButton(), this.f18443d, false, false, this.f18444e, composer, 0, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14932e0 interfaceC14932e0, Composer composer, Integer num) {
            a(interfaceC14932e0, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @SuppressLint({"AlwaysProvideAModifier"})
    public static final void f(final LocalThemeScope localThemeScope, final Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> debugControls, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(debugControls, "debugControls");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1889797294);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(debugControls) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1889797294, i11, -1, "com.meijer.mobile.android_acres_library.preview.AdsPreview (AdsPreview.kt:59)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            Modifier modifierI = D.i(androidx.compose.foundation.b.d(J.h(companion, 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), localThemeScope.getAdsSpacing().getThree().getDp());
            MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion2.k(), composerStartRestartGroup, 0);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyA2, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            debugControls.invoke(c14815g, composerStartRestartGroup, Integer.valueOf((i11 & 112) | 6));
            composerStartRestartGroup.v();
            C14802K.a(androidx.compose.foundation.b.d(J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), localThemeScope.getAdsColors().getAdsColorInverse().getColor(), null, 2, null), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA3 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = D1.a(composerStartRestartGroup);
            D1.c(composerA3, measurePolicyG, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            content.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 14));
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Li.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.g(localThemeScope, debugControls, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Function3 function3, Function2 function2, int i10, Composer composer, int i11) {
        f(localThemeScope, function3, function2, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ji.LocalThemeScope r27, final java.lang.String r28, java.lang.String r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.h.h(Ji.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, str, str2, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    @android.annotation.SuppressLint({"AlwaysProvideAModifier", "ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void j(final Ji.LocalThemeScope r28, final java.lang.String r29, final java.util.List<? extends T> r30, final T r31, androidx.compose.ui.Modifier r32, kotlin.jvm.functions.Function1<? super T, java.lang.String> r33, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.h.j(Ji.M, java.lang.String, java.util.List, java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, String str, List list, Object obj, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, str, list, obj, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ji.LocalThemeScope r16, final java.lang.String r17, final boolean r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.h.o(Ji.M, java.lang.String, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, String str, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, str, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(Object obj) {
        return String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T l(InterfaceC5730l0<T> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void m(InterfaceC5730l0<T> interfaceC5730l0, T t10) {
        interfaceC5730l0.setValue(t10);
    }
}
