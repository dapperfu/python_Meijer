package Bm;

import Bm.L;
import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import com.fullstory.compose.FullStoryAnnotationsKt;
import j0.C14889J;
import j0.C14890K;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import ki.C15161c;
import ki.InterfaceC15148Q;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.P0;
import p1.C16338g;
import pi.C16453n;
import qi.C16671b;
import r0.C16806i;
import r1.C16819m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aY\u0010\f\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/l0;", "", "isChecked", "isSPCEnabled", "displayError", "Lkotlin/Function0;", "", "onAgreeClicked", "onReadAgreementClick", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/l0;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3236a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f3237b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3238c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f3239d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f3240e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f3241f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f3242g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f3243h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Bm.L$a$a, reason: collision with other inner class name */
        static final class C0068a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f3244a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15148Q f3245b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Modifier f3246c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f3247d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f3248e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f3249f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f3250g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f3251h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f3252i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Bm.L$a$a$a, reason: collision with other inner class name */
            static final class C0069a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f3253a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f3254b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f3255c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f3256d;

                C0069a(boolean z10, LocalThemeScope localThemeScope, Function0<Unit> function0, boolean z11) {
                    this.f3253a = z10;
                    this.f3254b = localThemeScope;
                    this.f3255c = function0;
                    this.f3256d = z11;
                }

                public final void d(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                    Composer composer2;
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1593881534, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.ContactInformationAgreementSection.<anonymous>.<anonymous>.<anonymous> (ContactInformationAgreementSection.kt:112)");
                    }
                    if (this.f3253a) {
                        composer.startReplaceGroup(1833719398);
                        LocalThemeScope localThemeScope = this.f3254b;
                        Ki.I one = localThemeScope.getAdsTypography().getDetail().getOne();
                        int iF = F1.j.INSTANCE.f();
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composer.startReplaceGroup(5004770);
                        boolean zV = composer.V(this.f3255c);
                        final Function0<Unit> function0 = this.f3255c;
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Bm.I
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return L.a.C0068a.C0069a.e(function0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsAttribute(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), "Button", "click read terms and conditions"), null, null, F1.j.h(iF), 0, false, 0, one, null, 374, null);
                        String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101326zg, composer, 0);
                        int i11 = LocalThemeScope.f17314g;
                        si.j.h(localThemeScope, label, strC, null, composer, i11 | (q1.Label.f142335j << 3), 4);
                        oi.A0 a02 = oi.A0.f153872a;
                        String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f100747Wc, composer, 0);
                        Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(companion, "Button", "click read terms and conditions");
                        LocalThemeScope localThemeScope2 = this.f3254b;
                        composer.startReplaceGroup(5004770);
                        boolean zV2 = composer.V(this.f3255c);
                        final Function0<Unit> function02 = this.f3255c;
                        Object objB2 = composer.B();
                        if (zV2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: Bm.J
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return L.a.C0068a.C0069a.f(function02);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        P0.k(localThemeScope2, a02, strC2, (Function0) objB2, modifierFsAttribute, null, false, 0L, false, composer, i11 | (oi.A0.f153873b << 3), 240);
                        composer2 = composer;
                        composer2.P();
                    } else {
                        composer.startReplaceGroup(1834960266);
                        LocalThemeScope localThemeScope3 = this.f3254b;
                        Ki.I one2 = localThemeScope3.getAdsTypography().getDetail().getOne();
                        int iF2 = F1.j.INSTANCE.f();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composer.startReplaceGroup(5004770);
                        boolean zV3 = composer.V(this.f3255c);
                        final Function0<Unit> function03 = this.f3255c;
                        Object objB3 = composer.B();
                        if (zV3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function0() { // from class: Bm.K
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return L.a.C0068a.C0069a.g(function03);
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        q1.Label label2 = new q1.Label(ClickableKt.d(companion2, false, null, null, (Function0) objB3, 7, null), null, null, F1.j.h(iF2), 0, false, 0, one2, null, 374, null);
                        composer.startReplaceGroup(1583227047);
                        LocalThemeScope localThemeScope4 = this.f3254b;
                        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
                        composer.startReplaceGroup(1583228044);
                        int iN = bVar.n(new SpanStyle(localThemeScope4.getAdsColors().getAdsColorText01().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                        try {
                            bVar.g(C16338g.c(com.meijer.mobile.meijer.Y.f100348Bg, composer, 0));
                            Unit unit = Unit.f143329a;
                            bVar.k(iN);
                            composer.P();
                            composer.startReplaceGroup(1583235530);
                            iN = bVar.n(new SpanStyle(localThemeScope4.getAdsColors().getAdsColorBrandPrimary().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                            try {
                                bVar.g(" ");
                                bVar.g(C16338g.c(com.meijer.mobile.meijer.Y.f100388Dg, composer, 0));
                                bVar.g(" ");
                                bVar.k(iN);
                                composer.P();
                                composer.startReplaceGroup(1583245838);
                                iN = bVar.n(new SpanStyle(localThemeScope4.getAdsColors().getAdsColorText01().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                                try {
                                    bVar.g(C16338g.c(com.meijer.mobile.meijer.Y.f100368Cg, composer, 0));
                                    bVar.k(iN);
                                    composer.P();
                                    AnnotatedString annotatedStringQ = bVar.q();
                                    composer.P();
                                    si.j.g(localThemeScope3, label2, annotatedStringQ, null, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 12);
                                    composer2 = composer;
                                    composer2.P();
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    }
                    composer2.startReplaceGroup(1583256426);
                    if (this.f3256d) {
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        C14890K.a(androidx.compose.foundation.layout.J.i(companion3, this.f3254b.getAdsSpacing().getTwo().getDp()), composer2, 0);
                        Modifier modifierD = androidx.compose.foundation.b.d(T0.e.a(companion3, C16806i.c(this.f3254b.getAdsSpacing().getFour().getDp())), this.f3254b.getAdsColors().getAdsColorSupportErrorBg().getColor(), null, 2, null);
                        LocalThemeScope localThemeScope5 = this.f3254b;
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer2, 0);
                        int iA = C5859f.a(composer2, 0);
                        InterfaceC5884s interfaceC5884sR = composer2.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierD);
                        InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
                        Function0<InterfaceC5953g> function0A = companion4.a();
                        if (composer2.k() == null) {
                            C5859f.c();
                        }
                        composer2.F();
                        if (composer2.getInserting()) {
                            composer2.I(function0A);
                        } else {
                            composer2.s();
                        }
                        Composer composerA = D1.a(composer2);
                        D1.c(composerA, measurePolicyB, companion4.e());
                        D1.c(composerA, interfaceC5884sR, companion4.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion4.f());
                        C14889J c14889j = C14889J.f139620a;
                        q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.e.f17096d, null, null, null, 0.0f, null, androidx.compose.foundation.layout.D.m(companion3, localThemeScope5.getAdsSpacing().getFive().getDp(), localThemeScope5.getAdsSpacing().getFour().getDp(), 0.0f, 0.0f, 12, null), 62, null);
                        int i12 = LocalThemeScope.f17314g;
                        C16671b.b(localThemeScope5, drawableIcon, null, null, composer2, i12 | (q1.h.DrawableIcon.f142322h << 3), 6);
                        si.j.h(localThemeScope5, new q1.Label(androidx.compose.foundation.layout.D.l(companion3, localThemeScope5.getAdsSpacing().getThree().getDp(), localThemeScope5.getAdsSpacing().getFour().getDp(), localThemeScope5.getAdsSpacing().getFive().getDp(), localThemeScope5.getAdsSpacing().getFour().getDp()), null, null, null, 0, false, 0, localThemeScope5.getAdsTypography().getBody().getTwo(), null, 382, null), C16338g.c(com.meijer.mobile.meijer.Y.f100393E1, composer2, 0), null, composer2, i12 | (q1.Label.f142335j << 3), 4);
                        composer2.v();
                    }
                    composer2.P();
                    if (!this.f3253a) {
                        C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f3254b.getAdsSpacing().getThree().getDp()), composer2, 0);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    d(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }
            }

            C0068a(LocalThemeScope localThemeScope, InterfaceC15148Q interfaceC15148Q, Modifier modifier, String str, InterfaceC5872l0<Boolean> interfaceC5872l0, Function0<Unit> function0, boolean z10, boolean z11, Function0<Unit> function02) {
                this.f3244a = localThemeScope;
                this.f3245b = interfaceC15148Q;
                this.f3246c = modifier;
                this.f3247d = str;
                this.f3248e = interfaceC5872l0;
                this.f3249f = function0;
                this.f3250g = z10;
                this.f3251h = z11;
                this.f3252i = function02;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(String str, InterfaceC5872l0 interfaceC5872l0, r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.s0(semantics, Role.INSTANCE.c());
                r1.s.g0(semantics, str);
                r1.s.G0(semantics, t1.b.a(((Boolean) interfaceC5872l0.getValue()).booleanValue()));
                return Unit.f143329a;
            }

            public final void c(InterfaceC14888I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1695722956, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.ContactInformationAgreementSection.<anonymous>.<anonymous> (ContactInformationAgreementSection.kt:78)");
                }
                LocalThemeScope localThemeScope = this.f3244a;
                q1.s.Checkbox leadingToggleButton = this.f3245b.getToggleButtons().getLeadingToggleButton();
                Modifier modifier = this.f3246c;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f3247d) | composer.V(this.f3248e);
                final String str = this.f3247d;
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f3248e;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Bm.G
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return L.a.C0068a.d(str, interfaceC5872l0, (r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierV = androidx.compose.foundation.layout.J.v(FullStoryAnnotationsKt.fsAttribute(C16819m.c(modifier, true, (Function1) objB), "Button", "agreed to sms terms and conditions"), this.f3244a.getAdsSpacing().getSix().getDp());
                Ki.T adsColorEnabled01 = this.f3244a.getAdsColors().getAdsColorEnabled01();
                Ki.T adsColorSupportError = this.f3244a.getAdsColors().getAdsColorSupportError();
                if (!this.f3250g) {
                    adsColorSupportError = null;
                }
                if (adsColorSupportError == null) {
                    adsColorSupportError = this.f3244a.getAdsColors().getAdsColorUIBorder01();
                }
                q1.s.Checkbox checkboxY = q1.s.Checkbox.y(leadingToggleButton, modifierV, false, null, new C15161c(adsColorEnabled01, adsColorSupportError, this.f3244a.getAdsColors().getAdsColorInverse(), this.f3244a.getAdsColors().getAdsColorsDisabled()), 6, null);
                boolean zBooleanValue = this.f3248e.getValue().booleanValue();
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(this.f3248e) | composer.V(this.f3249f);
                final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f3248e;
                final Function0<Unit> function0 = this.f3249f;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: Bm.H
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return L.a.C0068a.e(interfaceC5872l02, function0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                int i11 = LocalThemeScope.f17314g;
                wi.s.b(localThemeScope, checkboxY, zBooleanValue, false, false, (Function1) objB2, composer, i11 | (q1.s.Checkbox.f142428e << 3), 12);
                C16453n.e(this.f3244a, q1.Column.y(this.f3245b.getContainers().getList(), androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, this.f3244a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), null, null, 6, null), ComposableLambdaKt.c(-1593881534, true, new C0069a(this.f3251h, this.f3244a, this.f3252i, this.f3250g), composer, 54), composer, i11 | 384 | (q1.Column.f142240d << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                c(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(InterfaceC5872l0 interfaceC5872l0, Function0 function0, boolean z10) {
                interfaceC5872l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5872l0.getValue()).booleanValue()));
                function0.invoke();
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Modifier modifier, String str, InterfaceC5872l0<Boolean> interfaceC5872l0, Function0<Unit> function0, boolean z10, boolean z11, Function0<Unit> function02) {
            this.f3236a = localThemeScope;
            this.f3237b = modifier;
            this.f3238c = str;
            this.f3239d = interfaceC5872l0;
            this.f3240e = function0;
            this.f3241f = z10;
            this.f3242g = z11;
            this.f3243h = function02;
        }

        public final void a(InterfaceC15148Q Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-437044724, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.ContactInformationAgreementSection.<anonymous> (ContactInformationAgreementSection.kt:73)");
            }
            C16453n.i(this.f3236a, q1.Row.y(Assemble.getContainers().getItem(), androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f3236a.getAdsSpacing().getFive().getDp()), null, null, 6, null), ComposableLambdaKt.c(1695722956, true, new C0068a(this.f3236a, Assemble, this.f3237b, this.f3238c, this.f3239d, this.f3240e, this.f3241f, this.f3242g, this.f3243h), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Row.f142392d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
            a(interfaceC15148Q, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r14, androidx.compose.ui.Modifier r15, final androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r16, boolean r17, final boolean r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bm.L.b(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.l0, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, InterfaceC5872l0 interfaceC5872l0, boolean z10, boolean z11, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, interfaceC5872l0, z10, z11, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
