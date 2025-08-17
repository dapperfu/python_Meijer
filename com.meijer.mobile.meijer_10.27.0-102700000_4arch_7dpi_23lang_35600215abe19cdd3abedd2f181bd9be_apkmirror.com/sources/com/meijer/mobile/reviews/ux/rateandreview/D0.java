package com.meijer.mobile.reviews.ux.rateandreview;

import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.compose.ui.focus.C5763f;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.meijer.mobile.reviews.ux.rateandreview.D0;
import j0.C14801J;
import ji.DefaultTextInputs;
import ji.InterfaceC14914Q;
import ji.InterfaceC14919W;
import ji.q1;
import ji.s1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p1.C16193g;
import r1.C16699g;
import r1.C16705m;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aG\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/reviews/ux/rateandreview/a0;", "decorator", "Lkotlin/Function1;", "", "", "updateNameInputString", "updateEmailInputString", "updateLocationInputString", "", "onTermsCheckboxClicked", "Lkotlin/Function0;", "onTermsAndConditionsClicked", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/reviews/ux/rateandreview/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "isTermsChecked", "e", "(LJi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class D0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115953a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f115954b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RateAndReviewDecorator f115955c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f115956d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f115957e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f115958f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f115959g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f115960h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f115961i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.D0$a$a, reason: collision with other inner class name */
        static final class C1861a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f115962a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f115963b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f115964c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f115965d;

            C1861a(InterfaceC5730l0<String> interfaceC5730l0, LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, String str) {
                this.f115962a = interfaceC5730l0;
                this.f115963b = localThemeScope;
                this.f115964c = interfaceC14919W;
                this.f115965d = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(String str, String str2, r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.o(semantics, str);
                r1.s.g0(semantics, "For " + str2);
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                String strA;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-524372794, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TellUsAboutYourselfSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TellUsAboutYourselfSection.kt:167)");
                }
                if (StringsKt.r0(this.f115962a.getValue())) {
                    composer.startReplaceGroup(-793755578);
                    strA = C6408b.a(AbstractC5607a.INSTANCE.d(Lp.c.f18667u, new Object[0]), composer, AbstractC5607a.f45514b);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-793601167);
                    strA = C6408b.a(AbstractC5607a.INSTANCE.d(Lp.c.f18663s, new Object[0]), composer, AbstractC5607a.f45514b);
                    composer.P();
                }
                final String str = strA;
                LocalThemeScope localThemeScope = this.f115963b;
                q1.Label infoBlockMessage = this.f115964c.getLabels().getInfoBlockMessage();
                Modifier modifier = this.f115964c.getLabels().getInfoBlockMessage().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(str) | composer.V(this.f115965d);
                final String str2 = this.f115965d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.C0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return D0.a.C1861a.c(str, str2, (r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ri.j.h(localThemeScope, q1.Label.y(infoBlockMessage, modifier.then(C16705m.d(companion, false, (Function1) objB, 1, null)), null, null, null, 0, false, 0, null, null, 510, null), str, null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean s() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0, RateAndReviewDecorator rateAndReviewDecorator, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5772o interfaceC5772o, String str, String str2, Function1<? super String, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l03) {
            this.f115953a = localThemeScope;
            this.f115954b = interfaceC5730l0;
            this.f115955c = rateAndReviewDecorator;
            this.f115956d = interfaceC5730l02;
            this.f115957e = interfaceC5772o;
            this.f115958f = str;
            this.f115959g = str2;
            this.f115960h = function1;
            this.f115961i = interfaceC5730l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(RateAndReviewDecorator rateAndReviewDecorator, InterfaceC5730l0 interfaceC5730l0, InterfaceC14919W interfaceC14919W, InterfaceC5730l0 interfaceC5730l02, LocalThemeScope localThemeScope, String str, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            if (rateAndReviewDecorator.u() && (((Boolean) interfaceC5730l0.getValue()).booleanValue() || rateAndReviewDecorator.getShouldShowAllErrorStateAfterClickSubmit())) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-524372794, true, new C1861a(interfaceC5730l02, localThemeScope, interfaceC14919W, str)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput o(final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.h(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), new C5693z(null, null, new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.B0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return D0.a.p(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, 59, null), false, 0, null, null, null, 3999, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                interfaceC5730l0.setValue(Boolean.TRUE);
            } else if (((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
                interfaceC5730l02.setValue(Boolean.TRUE);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(String str, String str2, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str + ". For " + str2);
            SemanticsConfiguration semanticsConfiguration = semantics instanceof SemanticsConfiguration ? (SemanticsConfiguration) semantics : null;
            if (semanticsConfiguration != null && ((Boolean) semanticsConfiguration.o(SemanticsProperties.INSTANCE.getFocused(), new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.A0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(D0.a.s());
                }
            })).booleanValue()) {
                r1.s.n0(semantics, C16699g.INSTANCE.b());
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(InterfaceC5730l0 interfaceC5730l0, Function1 function1, String it) {
            Intrinsics.j(it, "it");
            interfaceC5730l0.setValue(it);
            function1.invoke(it);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            k(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }

        public final void k(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(408015324, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TellUsAboutYourselfSection.<anonymous>.<anonymous>.<anonymous> (TellUsAboutYourselfSection.kt:125)");
            }
            LocalThemeScope localThemeScope = this.f115953a;
            String value = this.f115954b.getValue();
            DefaultTextInputs defaultTextInputsC = Assemble.getInputFields();
            boolean z10 = this.f115955c.u() && (this.f115956d.getValue().booleanValue() || this.f115955c.getShouldShowAllErrorStateAfterClickSubmit());
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f115957e);
            final InterfaceC5772o interfaceC5772o = this.f115957e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.v0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.a.o(interfaceC5772o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(defaultTextInputsC, z10, false, false, (Function1) objB, 6, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f115961i;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f115956d;
            Object objB2 = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB2 == companion2.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.w0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.a.q(interfaceC5730l0, interfaceC5730l02, (androidx.compose.ui.focus.E) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierA = C5761d.a(companion, (Function1) objB2);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f115958f) | composer.V(this.f115959g);
            final String str = this.f115958f;
            final String str2 = this.f115959g;
            Object objB3 = composer.B();
            if (zV || objB3 == companion2.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.x0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.a.r(str, str2, (r1.u) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierD = C16705m.d(modifierA, false, (Function1) objB3, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(this.f115960h);
            final InterfaceC5730l0<String> interfaceC5730l03 = this.f115954b;
            final Function1<String, Unit> function1 = this.f115960h;
            Object objB4 = composer.B();
            if (zV2 || objB4 == companion2.a()) {
                objB4 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.y0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.a.t(interfaceC5730l03, function1, (String) obj);
                    }
                };
                composer.t(objB4);
            }
            Function1 function12 = (Function1) objB4;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = composer.D(this.f115955c) | composer.D(Assemble) | composer.D(this.f115953a) | composer.V(this.f115959g);
            final RateAndReviewDecorator rateAndReviewDecorator = this.f115955c;
            final InterfaceC5730l0<Boolean> interfaceC5730l04 = this.f115956d;
            final InterfaceC5730l0<String> interfaceC5730l05 = this.f115954b;
            final LocalThemeScope localThemeScope2 = this.f115953a;
            final String str3 = this.f115959g;
            Object objB5 = composer.B();
            if (zD2 || objB5 == companion2.a()) {
                Function1 function13 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.z0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.a.l(rateAndReviewDecorator, interfaceC5730l04, Assemble, interfaceC5730l05, localThemeScope2, str3, (H1) obj);
                    }
                };
                composer.t(function13);
                objB5 = function13;
            }
            composer.P();
            C18504m0.i(localThemeScope, value, textInputF, modifierD, function12, (Function1) objB5, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115966a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f115967b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RateAndReviewDecorator f115968c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f115969d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f115970e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f115971f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f115972g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f115973h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f115974a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f115975b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f115976c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f115977d;

            a(InterfaceC5730l0<String> interfaceC5730l0, LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, String str) {
                this.f115974a = interfaceC5730l0;
                this.f115975b = localThemeScope;
                this.f115976c = interfaceC14919W;
                this.f115977d = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(String str, String str2, r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.o(semantics, str);
                r1.s.g0(semantics, "For " + str2);
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                String strA;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(479125629, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TellUsAboutYourselfSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TellUsAboutYourselfSection.kt:235)");
                }
                if (StringsKt.r0(this.f115974a.getValue())) {
                    composer.startReplaceGroup(1455384971);
                    strA = C6408b.a(AbstractC5607a.INSTANCE.d(Lp.c.f18643i, new Object[0]), composer, AbstractC5607a.f45514b);
                    composer.P();
                } else {
                    composer.startReplaceGroup(1455543257);
                    strA = C6408b.a(AbstractC5607a.INSTANCE.d(Lp.c.f18645j, new Object[0]), composer, AbstractC5607a.f45514b);
                    composer.P();
                }
                final String str = strA;
                LocalThemeScope localThemeScope = this.f115975b;
                q1.Label infoBlockMessage = this.f115976c.getLabels().getInfoBlockMessage();
                Modifier modifier = this.f115976c.getLabels().getInfoBlockMessage().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(str) | composer.V(this.f115977d);
                final String str2 = this.f115977d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.L0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return D0.b.a.c(str, str2, (r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ri.j.h(localThemeScope, q1.Label.y(infoBlockMessage, modifier.then(C16705m.d(companion, false, (Function1) objB, 1, null)), null, null, null, 0, false, 0, null, null, 510, null), str, null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean s() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0, RateAndReviewDecorator rateAndReviewDecorator, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5772o interfaceC5772o, String str, Function1<? super String, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l03) {
            this.f115966a = localThemeScope;
            this.f115967b = interfaceC5730l0;
            this.f115968c = rateAndReviewDecorator;
            this.f115969d = interfaceC5730l02;
            this.f115970e = interfaceC5772o;
            this.f115971f = str;
            this.f115972g = function1;
            this.f115973h = interfaceC5730l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC14919W interfaceC14919W, String str, RateAndReviewDecorator rateAndReviewDecorator, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), str);
            if (rateAndReviewDecorator.t() && (((Boolean) interfaceC5730l0.getValue()).booleanValue() || rateAndReviewDecorator.getShouldShowAllErrorStateAfterClickSubmit())) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(479125629, true, new a(interfaceC5730l02, localThemeScope, interfaceC14919W, str)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput o(final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.c(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), new C5693z(null, null, new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.K0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return D0.b.p(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, 59, null), false, 0, null, null, null, 3999, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                interfaceC5730l0.setValue(Boolean.TRUE);
            } else if (((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
                interfaceC5730l02.setValue(Boolean.TRUE);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(RateAndReviewDecorator rateAndReviewDecorator, String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, rateAndReviewDecorator.getEmailInputString() + ". For " + str);
            SemanticsConfiguration semanticsConfiguration = semantics instanceof SemanticsConfiguration ? (SemanticsConfiguration) semantics : null;
            if (semanticsConfiguration != null && ((Boolean) semanticsConfiguration.o(SemanticsProperties.INSTANCE.getFocused(), new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.J0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(D0.b.s());
                }
            })).booleanValue()) {
                r1.s.n0(semantics, C16699g.INSTANCE.b());
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(InterfaceC5730l0 interfaceC5730l0, Function1 function1, String it) {
            Intrinsics.j(it, "it");
            interfaceC5730l0.setValue(it);
            function1.invoke(it);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            k(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }

        public final void k(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1144057837, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TellUsAboutYourselfSection.<anonymous>.<anonymous>.<anonymous> (TellUsAboutYourselfSection.kt:191)");
            }
            LocalThemeScope localThemeScope = this.f115966a;
            String value = this.f115967b.getValue();
            DefaultTextInputs defaultTextInputsC = Assemble.getInputFields();
            boolean z10 = this.f115968c.t() && (this.f115969d.getValue().booleanValue() || this.f115968c.getShouldShowAllErrorStateAfterClickSubmit());
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f115970e);
            final InterfaceC5772o interfaceC5772o = this.f115970e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.E0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.b.o(interfaceC5772o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(defaultTextInputsC, z10, false, false, (Function1) objB, 6, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f115973h;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f115969d;
            Object objB2 = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB2 == companion2.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.F0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.b.q(interfaceC5730l0, interfaceC5730l02, (androidx.compose.ui.focus.E) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierA = C5761d.a(companion, (Function1) objB2);
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(this.f115968c) | composer.V(this.f115971f);
            final RateAndReviewDecorator rateAndReviewDecorator = this.f115968c;
            final String str = this.f115971f;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion2.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.G0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.b.r(rateAndReviewDecorator, str, (r1.u) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierD = C16705m.d(modifierA, false, (Function1) objB3, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f115972g);
            final InterfaceC5730l0<String> interfaceC5730l03 = this.f115967b;
            final Function1<String, Unit> function1 = this.f115972g;
            Object objB4 = composer.B();
            if (zV || objB4 == companion2.a()) {
                objB4 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.H0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.b.t(interfaceC5730l03, function1, (String) obj);
                    }
                };
                composer.t(objB4);
            }
            Function1 function12 = (Function1) objB4;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD3 = composer.D(Assemble) | composer.V(this.f115971f) | composer.D(this.f115968c) | composer.D(this.f115966a);
            final String str2 = this.f115971f;
            final RateAndReviewDecorator rateAndReviewDecorator2 = this.f115968c;
            final InterfaceC5730l0<Boolean> interfaceC5730l04 = this.f115969d;
            final InterfaceC5730l0<String> interfaceC5730l05 = this.f115967b;
            final LocalThemeScope localThemeScope2 = this.f115966a;
            Object objB5 = composer.B();
            if (zD3 || objB5 == companion2.a()) {
                Function1 function13 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.I0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.b.l(Assemble, str2, rateAndReviewDecorator2, interfaceC5730l04, interfaceC5730l05, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(function13);
                objB5 = function13;
            }
            composer.P();
            C18504m0.i(localThemeScope, value, textInputF, modifierD, function12, (Function1) objB5, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115978a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f115979b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f115980c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f115981d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f115982e;

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0, Context context, Function1<? super String, Unit> function1, String str) {
            this.f115978a = localThemeScope;
            this.f115979b = interfaceC5730l0;
            this.f115980c = context;
            this.f115981d = function1;
            this.f115982e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput g(q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.h(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), null, false, 0, null, null, null, 4063, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5730l0 interfaceC5730l0, Context context, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, ((String) interfaceC5730l0.getValue()) + ". For " + context.getString(Lp.c.f18618U0));
            SemanticsConfiguration semanticsConfiguration = semantics instanceof SemanticsConfiguration ? (SemanticsConfiguration) semantics : null;
            if (semanticsConfiguration != null && ((Boolean) semanticsConfiguration.o(SemanticsProperties.INSTANCE.getFocused(), new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.Q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(D0.c.l());
                }
            })).booleanValue()) {
                r1.s.n0(semantics, C16699g.INSTANCE.b());
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(InterfaceC5730l0 interfaceC5730l0, Function1 function1, String it) {
            Intrinsics.j(it, "it");
            interfaceC5730l0.setValue(it);
            function1.invoke(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC14919W interfaceC14919W, String str, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), str);
            return Unit.f142422a;
        }

        public final void f(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(319580180, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TellUsAboutYourselfSection.<anonymous>.<anonymous>.<anonymous> (TellUsAboutYourselfSection.kt:263)");
            }
            LocalThemeScope localThemeScope = this.f115978a;
            String value = this.f115979b.getValue();
            DefaultTextInputs defaultTextInputsC = Assemble.getInputFields();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.M0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.c.g((q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(defaultTextInputsC, false, false, false, (Function1) objB, 7, null);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f115980c);
            final InterfaceC5730l0<String> interfaceC5730l0 = this.f115979b;
            final Context context = this.f115980c;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.N0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.c.k(interfaceC5730l0, context, (r1.u) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierD = C16705m.d(companion2, false, (Function1) objB2, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f115981d);
            final InterfaceC5730l0<String> interfaceC5730l02 = this.f115979b;
            final Function1<String, Unit> function1 = this.f115981d;
            Object objB3 = composer.B();
            if (zV || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.O0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.c.o(interfaceC5730l02, function1, (String) obj);
                    }
                };
                composer.t(objB3);
            }
            Function1 function12 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(Assemble) | composer.V(this.f115982e);
            final String str = this.f115982e;
            Object objB4 = composer.B();
            if (zD2 || objB4 == companion.a()) {
                objB4 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.P0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.c.p(Assemble, str, (H1) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C18504m0.i(localThemeScope, value, textInputF, modifierD, function12, (Function1) objB4, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            f(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f115983a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115984b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f115985c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f115986d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f115987e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115988f;

        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, LocalThemeScope localThemeScope, String str, boolean z10, Function1<? super Boolean, Unit> function1, Function0<Unit> function0) {
            this.f115983a = modifier;
            this.f115984b = localThemeScope;
            this.f115985c = str;
            this.f115986d = z10;
            this.f115987e = function1;
            this.f115988f = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(String str, boolean z10, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            r1.s.t0(semantics, z10);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1, boolean z10) {
            function1.invoke(Boolean.valueOf(!z10));
            return Unit.f142422a;
        }

        public final void e(InterfaceC14914Q Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1363071629, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TermsAndConditionsPart.<anonymous> (TellUsAboutYourselfSection.kt:343)");
            }
            Modifier modifierC = androidx.compose.foundation.layout.A.c(this.f115983a, H1.h.p(-4), 0.0f, 2, null);
            LocalThemeScope localThemeScope = this.f115984b;
            final String str = this.f115985c;
            final boolean z10 = this.f115986d;
            final Function1<Boolean, Unit> function1 = this.f115987e;
            Modifier modifier = this.f115983a;
            final Function0<Unit> function0 = this.f115988f;
            C5658d.e eVarG = C5658d.f48555a.g();
            e.Companion companion = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, companion.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14801J c14801j = C14801J.f139030a;
            q1.s.Checkbox leadingToggleButton = Assemble.getToggleButtons().getLeadingToggleButton();
            Modifier modifier2 = Assemble.getToggleButtons().getLeadingToggleButton().getModifier();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(str) | composer.a(z10);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.R0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.d.f(str, z10, (r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierD = C16705m.d(modifier2, false, (Function1) objB, 1, null);
            Role roleJ = Role.j(Role.INSTANCE.c());
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(function1) | composer.a(z10);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.S0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return D0.d.g(function1, z10);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            q1.s.Checkbox checkboxY = q1.s.Checkbox.y(leadingToggleButton, ClickableKt.d(modifierD, false, null, roleJ, (Function0) objB2, 3, null), false, null, null, 14, null);
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(function1);
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.T0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return D0.d.k(function1, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            int i11 = LocalThemeScope.f15770g;
            vi.s.b(localThemeScope, checkboxY, z10, false, false, (Function1) objB3, composer, i11 | (q1.s.Checkbox.f140173e << 3), 12);
            q1.Label labelY = q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null), c14801j.d(androidx.compose.foundation.layout.A.c(Modifier.INSTANCE, H1.h.p(-6), 0.0f, 2, null), companion.i()), null, null, null, 0, false, 0, null, null, 510, null);
            String strC = C16193g.c(Lp.c.f18655o, composer, 0);
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, labelY, strC, null, composer, i11 | (i12 << 3), 4);
            Modifier modifierD2 = c14801j.d(modifier, companion.i());
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(function0);
            Object objB4 = composer.B();
            if (zV4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.U0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return D0.d.l(function0);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            ri.j.h(localThemeScope, new q1.Label(ClickableKt.d(modifierD2, false, null, null, (Function0) objB4, 7, null), localThemeScope.getAdsColors().getAdsColorEnabled01(), F1.k.INSTANCE.d(), null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 376, null), C16193g.c(Lp.c.f18610Q0, composer, 0), null, composer, i11 | (i12 << 3), 4);
            ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.c(Lp.c.f18592H0, composer, 0), null, composer, i11 | (i12 << 3), 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
            e(interfaceC14914Q, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Function1 function1, boolean z10) {
            function1.invoke(Boolean.valueOf(z10));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r54, androidx.compose.ui.Modifier r55, final com.meijer.mobile.reviews.ux.rateandreview.RateAndReviewDecorator r56, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r57, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r58, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r59, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r60, final kotlin.jvm.functions.Function0<kotlin.Unit> r61, androidx.compose.runtime.Composer r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.D0.c(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.reviews.ux.rateandreview.a0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, Modifier modifier, RateAndReviewDecorator rateAndReviewDecorator, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, rateAndReviewDecorator, function1, function12, function13, function14, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void e(final LocalThemeScope localThemeScope, Modifier modifier, final boolean z10, final Function1<? super Boolean, Unit> onTermsCheckboxClicked, final Function0<Unit> onTermsAndConditionsClicked, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onTermsCheckboxClicked, "onTermsCheckboxClicked");
        Intrinsics.j(onTermsAndConditionsClicked, "onTermsAndConditionsClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1852571985);
        if ((i11 & Integer.MIN_VALUE) != 0) {
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
            i12 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onTermsCheckboxClicked) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onTermsAndConditionsClicked) ? 16384 : 8192;
        }
        int i14 = i12;
        if ((i14 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-1852571985, i14, -1, "com.meijer.mobile.reviews.ux.rateandreview.TermsAndConditionsPart (TellUsAboutYourselfSection.kt:340)");
            }
            Ji.Q.e(localThemeScope, s1.b.f140196a, ComposableLambdaKt.c(-1363071629, true, new d(modifier3, localThemeScope, C16193g.c(Lp.c.f18606O0, composerStartRestartGroup, 0), z10, onTermsCheckboxClicked, onTermsAndConditionsClicked), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i14 & 14) | (s1.b.f140197b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.reviews.ux.rateandreview.u0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return D0.f(localThemeScope, modifier2, z10, onTermsCheckboxClicked, onTermsAndConditionsClicked, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, z10, function1, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
