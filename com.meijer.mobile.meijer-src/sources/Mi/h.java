package Mi;

import Ki.LocalThemeScope;
import Ki.Q;
import Mi.h;
import P0.e;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import j0.InterfaceC14913q;
import java.util.List;
import ki.ChipButtons;
import ki.InterfaceC15139H;
import ki.InterfaceC15166e0;
import ki.InterfaceC15205y;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16185n1;
import oi.o1;
import si.j;
import wi.s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\t\u001a:\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001aP\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001az\u0010 \u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0019*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001c\u001a\u00028\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u00012!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b \u0010!¨\u0006#²\u0006\u0016\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00198\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lkotlin/Function1;", "Lj0/f;", "", "Lkotlin/ExtensionFunctionType;", "debugControls", "Lkotlin/Function0;", "content", "f", "(LKi/M;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "text", "", "checked", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/ParameterName;", "name", "isChecked", "onCheckedChange", "o", "(LKi/M;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "label", "h", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "T", "", "options", "state", "itemText", "item", "onItemSelected", "j", "(LKi/M;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectedItem", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14913q, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f20239a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<T> f20240b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<T> f20241c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<T, String> f20242d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f20243e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Mi.h$a$a, reason: collision with other inner class name */
        static final class C0351a implements Function3<InterfaceC15139H, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<T> f20244a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<T> f20245b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<T, String> f20246c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f20247d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<T, Unit> f20248e;

            /* JADX WARN: Multi-variable type inference failed */
            C0351a(List<? extends T> list, InterfaceC5872l0<T> interfaceC5872l0, Function1<? super T, String> function1, LocalThemeScope localThemeScope, Function1<? super T, Unit> function12) {
                this.f20244a = list;
                this.f20245b = interfaceC5872l0;
                this.f20246c = function1;
                this.f20247d = localThemeScope;
                this.f20248e = function12;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(boolean z10, InterfaceC15139H interfaceC15139H, Function1 function1, Object obj, o1 AcresChip) {
                Intrinsics.j(AcresChip, "$this$AcresChip");
                AcresChip.d(z10 ? interfaceC15139H.getLabels().getEnabledSelectedLabel() : interfaceC15139H.getLabels().getEnabledRestingLabel(), (String) function1.invoke(obj));
                return Unit.f143329a;
            }

            public final void c(final InterfaceC15139H Assemble, Composer composer, int i10) {
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
                Iterable iterable = this.f20244a;
                final InterfaceC5872l0<T> interfaceC5872l0 = this.f20245b;
                final Function1<T, String> function1 = this.f20246c;
                LocalThemeScope localThemeScope = this.f20247d;
                final Function1 function12 = this.f20248e;
                for (final Object obj : iterable) {
                    composer.startReplaceGroup(953467297);
                    final boolean zE = Intrinsics.e(obj, h.l(interfaceC5872l0));
                    ChipButtons buttons = Assemble.getButtons();
                    q1.d.ChipButton enabledSelected = zE ? buttons.getEnabledSelected() : buttons.getEnabledResting();
                    String strInvoke = function1.invoke(obj);
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(obj) | composer.V(function12);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Mi.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h.a.C0351a.d(obj, function12, interfaceC5872l0);
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
                        objB2 = new Function1() { // from class: Mi.g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return h.a.C0351a.e(zE, Assemble, function1, obj, (o1) obj2);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    C16185n1.e(localThemeScope, null, function0, enabledSelected, strInvoke, zE, (Function1) objB2, composer, 0, 1);
                    C14890K.a(J.z(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                    composer.P();
                    function12 = function12;
                    i11 = 4;
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15139H interfaceC15139H, Composer composer, Integer num) {
                c(interfaceC15139H, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(Object obj, Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
                h.m(interfaceC5872l0, obj);
                function1.invoke(obj);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, List<? extends T> list, InterfaceC5872l0<T> interfaceC5872l0, Function1<? super T, String> function1, Function1<? super T, Unit> function12) {
            this.f20239a = localThemeScope;
            this.f20240b = list;
            this.f20241c = interfaceC5872l0;
            this.f20242d = function1;
            this.f20243e = function12;
        }

        public final void a(InterfaceC14913q FlowRow, Composer composer, int i10) {
            Intrinsics.j(FlowRow, "$this$FlowRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1420453956, i10, -1, "com.meijer.mobile.android_acres_library.preview.AdsPreviewStateSelector.<anonymous>.<anonymous> (AdsPreview.kt:276)");
            }
            LocalThemeScope localThemeScope = this.f20239a;
            Q.e(localThemeScope, InterfaceC15205y.a.C2257a.f142541a, ComposableLambdaKt.c(32277039, true, new C0351a(this.f20240b, this.f20241c, this.f20242d, localThemeScope, this.f20243e), composer, 54), composer, 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14913q interfaceC14913q, Composer composer, Integer num) {
            a(interfaceC14913q, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15166e0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f20249a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20250b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC14888I f20251c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f20252d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f20253e;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, String str, InterfaceC14888I interfaceC14888I, boolean z10, Function1<? super Boolean, Unit> function1) {
            this.f20249a = localThemeScope;
            this.f20250b = str;
            this.f20251c = interfaceC14888I;
            this.f20252d = z10;
            this.f20253e = function1;
        }

        public final void a(InterfaceC15166e0 Assemble, Composer composer, int i10) {
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
            j.h(this.f20249a, Assemble.getLabels().getItemLabelEnabled(), this.f20250b, null, composer, 0, 4);
            C14890K.a(InterfaceC14888I.b(this.f20251c, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 0);
            s.b(this.f20249a, Assemble.getToggleButtons().getTrailingToggleButton(), this.f20252d, false, false, this.f20253e, composer, 0, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15166e0 interfaceC15166e0, Composer composer, Integer num) {
            a(interfaceC15166e0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @SuppressLint({"AlwaysProvideAModifier"})
    public static final void f(final LocalThemeScope localThemeScope, final Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> debugControls, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10) {
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
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierI = D.i(androidx.compose.foundation.b.d(J.h(companion, 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), localThemeScope.getAdsSpacing().getThree().getDp());
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composerStartRestartGroup, 0);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyA2, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            debugControls.invoke(c14903g, composerStartRestartGroup, Integer.valueOf((i11 & 112) | 6));
            composerStartRestartGroup.v();
            C14890K.a(androidx.compose.foundation.b.d(J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), localThemeScope.getAdsColors().getAdsColorInverse().getColor(), null, 2, null), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = D1.a(composerStartRestartGroup);
            D1.c(composerA3, measurePolicyG, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            content.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 14));
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Mi.a
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
        return Unit.f143329a;
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
    public static final void h(final Ki.LocalThemeScope r27, final java.lang.String r28, java.lang.String r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mi.h.h(Ki.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, str, str2, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final <T> void j(final Ki.LocalThemeScope r28, final java.lang.String r29, final java.util.List<? extends T> r30, final T r31, androidx.compose.ui.Modifier r32, kotlin.jvm.functions.Function1<? super T, java.lang.String> r33, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mi.h.j(Ki.M, java.lang.String, java.util.List, java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, String str, List list, Object obj, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, str, list, obj, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void o(final Ki.LocalThemeScope r16, final java.lang.String r17, final boolean r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mi.h.o(Ki.M, java.lang.String, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, String str, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, str, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(Object obj) {
        return String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T l(InterfaceC5872l0<T> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void m(InterfaceC5872l0<T> interfaceC5872l0, T t10) {
        interfaceC5872l0.setValue(t10);
    }
}
