package Or;

import Ki.LocalThemeScope;
import Ki.Q;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import d0.C13590y;
import j0.C14889J;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import ki.C15207z;
import ki.j1;
import ki.q1;
import kotlin.C18000f;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16335d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aO\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LKi/M;", "", "dialogTitle", "dialogBody", "positiveButtonText", "negativeButtonText", "Lkotlin/Function0;", "", "onAcceptAddToCart", "onDeclineAddToCart", "c", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Or.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C4559c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Or.c$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24963a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24964b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24965c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Or.c$a$a, reason: collision with other inner class name */
        static final class C0414a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24966a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f24967b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f24968c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Or.c$a$a$a, reason: collision with other inner class name */
            static final class C0415a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f24969a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f24970b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f24971c;

                C0415a(LocalThemeScope localThemeScope, j1 j1Var, String str) {
                    this.f24969a = localThemeScope;
                    this.f24970b = j1Var;
                    this.f24971c = str;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(231489248, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ChokingWarningDialog.<anonymous>.<anonymous>.<anonymous> (ChokingWarningDialog.kt:59)");
                    }
                    si.j.h(this.f24969a, this.f24970b.getLabels().getEnabledLabel(), this.f24971c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C0414a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
                this.f24966a = localThemeScope;
                this.f24967b = function0;
                this.f24968c = str;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1824398707, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ChokingWarningDialog.<anonymous>.<anonymous> (ChokingWarningDialog.kt:46)");
                }
                LocalThemeScope localThemeScope = this.f24966a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                float f10 = 16;
                float fP = H1.h.p(f10);
                float fP2 = H1.h.p(f10);
                InterfaceC14882C contentPadding = enabledButton.getContentPadding();
                float top = contentPadding != null ? contentPadding.getTop() : H1.h.p(0);
                InterfaceC14882C contentPadding2 = enabledButton.getContentPadding();
                E0.b(localThemeScope, q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, androidx.compose.foundation.layout.D.d(fP, top, fP2, contentPadding2 != null ? contentPadding2.getBottom() : H1.h.p(0)), null, false, null, 959, null), this.f24967b, ComposableLambdaKt.c(231489248, true, new C0415a(this.f24966a, Assemble, this.f24968c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f24963a = localThemeScope;
            this.f24964b = function0;
            this.f24965c = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1764207887, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ChokingWarningDialog.<anonymous> (ChokingWarningDialog.kt:45)");
            }
            LocalThemeScope localThemeScope = this.f24963a;
            Q.e(localThemeScope, C15207z.f142557a, ComposableLambdaKt.c(1824398707, true, new C0414a(localThemeScope, this.f24964b, this.f24965c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15207z.f142558b << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Or.c$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24972a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24973b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24974c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Or.c$b$a */
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24975a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f24976b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f24977c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Or.c$b$a$a, reason: collision with other inner class name */
            static final class C0416a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f24978a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f24979b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f24980c;

                C0416a(LocalThemeScope localThemeScope, j1 j1Var, String str) {
                    this.f24978a = localThemeScope;
                    this.f24979b = j1Var;
                    this.f24980c = str;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1553914014, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ChokingWarningDialog.<anonymous>.<anonymous>.<anonymous> (ChokingWarningDialog.kt:81)");
                    }
                    si.j.h(this.f24978a, this.f24979b.getLabels().getEnabledLabel(), this.f24980c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
                this.f24975a = localThemeScope;
                this.f24976b = function0;
                this.f24977c = str;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(38995445, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ChokingWarningDialog.<anonymous>.<anonymous> (ChokingWarningDialog.kt:68)");
                }
                LocalThemeScope localThemeScope = this.f24975a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                float f10 = 16;
                float fP = H1.h.p(f10);
                float fP2 = H1.h.p(f10);
                InterfaceC14882C contentPadding = enabledButton.getContentPadding();
                float top = contentPadding != null ? contentPadding.getTop() : H1.h.p(0);
                InterfaceC14882C contentPadding2 = enabledButton.getContentPadding();
                E0.b(localThemeScope, q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, androidx.compose.foundation.layout.D.d(fP, top, fP2, contentPadding2 != null ? contentPadding2.getBottom() : H1.h.p(0)), null, false, null, 959, null), this.f24976b, ComposableLambdaKt.c(-1553914014, true, new C0416a(this.f24975a, Assemble, this.f24977c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f24972a = localThemeScope;
            this.f24973b = function0;
            this.f24974c = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-21195375, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ChokingWarningDialog.<anonymous> (ChokingWarningDialog.kt:67)");
            }
            LocalThemeScope localThemeScope = this.f24972a;
            Q.e(localThemeScope, C15207z.f142557a, ComposableLambdaKt.c(38995445, true, new a(localThemeScope, this.f24973b, this.f24974c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15207z.f142558b << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Or.c$c, reason: collision with other inner class name */
    static final class C0417c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24981a;

        C0417c(String str) {
            this.f24981a = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1233586642, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ChokingWarningDialog.<anonymous> (ChokingWarningDialog.kt:35)");
            }
            String str = this.f24981a;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            C13590y.a(C16335d.c(Cj.i.f4711J1, composer, 0), null, null, null, null, 0.0f, null, composer, 48, 124);
            N1.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Or.c$d */
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24982a;

        d(String str) {
            this.f24982a = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1806598637, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.ChokingWarningDialog.<anonymous> (ChokingWarningDialog.kt:43)");
            }
            N1.b(this.f24982a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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

    public static final void c(final LocalThemeScope localThemeScope, final String dialogTitle, final String dialogBody, final String positiveButtonText, final String negativeButtonText, final Function0<Unit> onAcceptAddToCart, final Function0<Unit> onDeclineAddToCart, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(dialogTitle, "dialogTitle");
        Intrinsics.j(dialogBody, "dialogBody");
        Intrinsics.j(positiveButtonText, "positiveButtonText");
        Intrinsics.j(negativeButtonText, "negativeButtonText");
        Intrinsics.j(onAcceptAddToCart, "onAcceptAddToCart");
        Intrinsics.j(onDeclineAddToCart, "onDeclineAddToCart");
        Composer composerStartRestartGroup = composer.startRestartGroup(235293895);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(dialogTitle) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(dialogBody) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.V(positiveButtonText) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.V(negativeButtonText) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onAcceptAddToCart) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onDeclineAddToCart) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(235293895, i11, -1, "com.meijer.mobile.ui.coupon.composable.detail.ChokingWarningDialog (ChokingWarningDialog.kt:31)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Or.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4559c.d();
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C18000f.a((Function0) objB, ComposableLambdaKt.c(1764207887, true, new a(localThemeScope, onAcceptAddToCart, positiveButtonText), composerStartRestartGroup, 54), null, ComposableLambdaKt.c(-21195375, true, new b(localThemeScope, onDeclineAddToCart, negativeButtonText), composerStartRestartGroup, 54), ComposableLambdaKt.c(1233586642, true, new C0417c(dialogTitle), composerStartRestartGroup, 54), ComposableLambdaKt.c(-1806598637, true, new d(dialogBody), composerStartRestartGroup, 54), null, 0L, 0L, null, composer2, 224310, 964);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Or.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4559c.e(localThemeScope, dialogTitle, dialogBody, positiveButtonText, negativeButtonText, onAcceptAddToCart, onDeclineAddToCart, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, int i10, Composer composer, int i11) {
        c(localThemeScope, str, str2, str3, str4, function0, function02, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
