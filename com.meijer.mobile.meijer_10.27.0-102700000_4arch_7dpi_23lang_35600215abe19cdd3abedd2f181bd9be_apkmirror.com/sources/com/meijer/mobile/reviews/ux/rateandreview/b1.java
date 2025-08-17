package com.meijer.mobile.reviews.ux.rateandreview;

import Ji.C;
import Ji.LocalThemeScope;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.compose.ui.focus.C5763f;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.input.KeyboardType;
import b5.C6197c;
import com.meijer.mobile.reviews.ux.rateandreview.b1;
import j0.InterfaceC14800I;
import java.util.List;
import ji.DefaultTextArea;
import ji.DefaultTextInputs;
import ji.InterfaceC14918V;
import ji.InterfaceC14919W;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l0.InterfaceC15343c;
import l5.C15372h;
import p1.C16193g;
import pi.C16307b;
import r0.C16692i;
import r1.C16699g;
import r1.C16705m;
import zi.C18504m0;
import zi.G1;
import zi.H1;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u001aw\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u001a\u0010\u0015¨\u0006\u001e²\u0006\u000e\u0010\u001b\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/reviews/ux/rateandreview/a0;", "decorator", "Lkotlin/Function1;", "", "", "updateReviewInputString", "updateReviewTitleInputString", "Lkotlin/Function0;", "onAddPhotoClicked", "onReviewGuidelinesClicked", "onPhoneGuideLinesClicked", "l", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/reviews/ux/rateandreview/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "headerResource", "", "showShowRequiredDescription", "f", "(LJi/M;Landroidx/compose/ui/Modifier;IZLandroidx/compose/runtime/Composer;II)V", "j", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "labelResource", "shouldShowOptionalLabel", "h", "showOptional", "lastAction", "showRequiredDescription", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class b1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f116233b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.b1$a$a, reason: collision with other inner class name */
        static final class C1870a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116234a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ji.j1 f116235b;

            C1870a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                this.f116234a = localThemeScope;
                this.f116235b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2142615184, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.PhotosListFooter.<anonymous>.<anonymous>.<anonymous>.<anonymous> (YourReviewSection.kt:427)");
                }
                C16307b.b(this.f116234a, this.f116235b.getIcons().getEnabledIcon(), C.a.C0245a.f15333e, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3) | (C.a.C0245a.f15334f << 6), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f116232a = localThemeScope;
            this.f116233b = function0;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-650816989, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.PhotosListFooter.<anonymous>.<anonymous>.<anonymous> (YourReviewSection.kt:423)");
            }
            LocalThemeScope localThemeScope = this.f116232a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, Modifier.INSTANCE, false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f116233b);
            final Function0<Unit> function0 = this.f116233b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.a1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b1.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(2142615184, true, new C1870a(this.f116232a, Assemble), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14918V, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f116236a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RateAndReviewDecorator f116237b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f116238c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f116239d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f116240e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116241f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f116242g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f116243h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f116244i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f116245a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116246b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC14918V f116247c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f116248d;

            a(InterfaceC5730l0<String> interfaceC5730l0, LocalThemeScope localThemeScope, InterfaceC14918V interfaceC14918V, Context context) {
                this.f116245a = interfaceC5730l0;
                this.f116246b = localThemeScope;
                this.f116247c = interfaceC14918V;
                this.f116248d = context;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(String str, Context context, r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.o(semantics, str);
                r1.s.g0(semantics, "For " + context.getString(Lp.c.f18613S));
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                String strC;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-37921863, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.YourReviewSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (YourReviewSection.kt:181)");
                }
                if (StringsKt.r0(this.f116245a.getValue())) {
                    composer.startReplaceGroup(-153737556);
                    strC = C16193g.c(Lp.c.f18617U, composer, 0);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-153607790);
                    strC = C16193g.c(Lp.c.f18619V, composer, 0);
                    composer.P();
                }
                final String str = strC;
                LocalThemeScope localThemeScope = this.f116246b;
                q1.Label infoBlockMessage = this.f116247c.getLabels().getInfoBlockMessage();
                Modifier modifier = this.f116247c.getLabels().getInfoBlockMessage().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(str) | composer.D(this.f116248d);
                final Context context = this.f116248d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.j1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return b1.b.a.c(str, context, (r1.u) obj);
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
        public static final boolean t() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC5730l0<String> interfaceC5730l0, RateAndReviewDecorator rateAndReviewDecorator, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5772o interfaceC5772o, Context context, LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, String str, InterfaceC5730l0<Boolean> interfaceC5730l03) {
            this.f116236a = interfaceC5730l0;
            this.f116237b = rateAndReviewDecorator;
            this.f116238c = interfaceC5730l02;
            this.f116239d = interfaceC5772o;
            this.f116240e = context;
            this.f116241f = localThemeScope;
            this.f116242g = function1;
            this.f116243h = str;
            this.f116244i = interfaceC5730l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC5730l0 interfaceC5730l0, Function1 function1, String it) {
            Intrinsics.j(it, "it");
            interfaceC5730l0.setValue(it);
            function1.invoke(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(InterfaceC14918V interfaceC14918V, String str, RateAndReviewDecorator rateAndReviewDecorator, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, LocalThemeScope localThemeScope, Context context, G1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14918V.getLabels().getPlaceholder(), str);
            if (rateAndReviewDecorator.w() && (((Boolean) interfaceC5730l0.getValue()).booleanValue() || rateAndReviewDecorator.getShouldShowAllErrorStateAfterClickSubmit())) {
                AdsInputField.f(interfaceC14918V.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-37921863, true, new a(interfaceC5730l02, localThemeScope, interfaceC14918V, context)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextArea p(final InterfaceC5772o interfaceC5772o, q1.f.TextArea template) {
            Intrinsics.j(template, "template");
            return q1.f.TextArea.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.h(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), new C5693z(null, null, new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b1.b.q(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, 59, null), false, 0, null, null, null, 3999, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                interfaceC5730l0.setValue(Boolean.TRUE);
            } else if (((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
                interfaceC5730l02.setValue(Boolean.TRUE);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(RateAndReviewDecorator rateAndReviewDecorator, Context context, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, rateAndReviewDecorator.q().b(context) + ". For " + context.getString(Lp.c.f18613S));
            SemanticsConfiguration semanticsConfiguration = semantics instanceof SemanticsConfiguration ? (SemanticsConfiguration) semantics : null;
            if (semanticsConfiguration != null && ((Boolean) semanticsConfiguration.o(SemanticsProperties.INSTANCE.getFocused(), new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.i1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(b1.b.t());
                }
            })).booleanValue()) {
                r1.s.n0(semantics, C16699g.INSTANCE.b());
            }
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14918V interfaceC14918V, Composer composer, Integer num) {
            k(interfaceC14918V, composer, num.intValue());
            return Unit.f142422a;
        }

        public final void k(final InterfaceC14918V Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-336721585, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.YourReviewSection.<anonymous>.<anonymous>.<anonymous> (YourReviewSection.kt:133)");
            }
            String value = this.f116236a.getValue();
            DefaultTextArea defaultTextAreaC = Assemble.getInputFields();
            boolean z10 = this.f116237b.w() && (this.f116238c.getValue().booleanValue() || this.f116237b.getShouldShowAllErrorStateAfterClickSubmit());
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f116239d);
            final InterfaceC5772o interfaceC5772o = this.f116239d;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.c1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b1.b.p(interfaceC5772o, (q1.f.TextArea) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextArea textAreaE = Cr.f.e(defaultTextAreaC, z10, false, false, (Function1) objB, 6, null);
            Modifier modifierI = androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(114));
            composer.startReplaceGroup(-1633490746);
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f116244i;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f116238c;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.d1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b1.b.r(interfaceC5730l0, interfaceC5730l02, (androidx.compose.ui.focus.E) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierA = C5761d.a(modifierI, (Function1) objB2);
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(this.f116237b) | composer.D(this.f116240e);
            final RateAndReviewDecorator rateAndReviewDecorator = this.f116237b;
            final Context context = this.f116240e;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.e1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b1.b.s(rateAndReviewDecorator, context, (r1.u) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierD = C16705m.d(modifierA, false, (Function1) objB3, 1, null);
            LocalThemeScope localThemeScope = this.f116241f;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f116242g);
            final InterfaceC5730l0<String> interfaceC5730l03 = this.f116236a;
            final Function1<String, Unit> function1 = this.f116242g;
            Object objB4 = composer.B();
            if (zV || objB4 == companion.a()) {
                objB4 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.f1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b1.b.l(interfaceC5730l03, function1, (String) obj);
                    }
                };
                composer.t(objB4);
            }
            Function1 function12 = (Function1) objB4;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD3 = composer.D(Assemble) | composer.V(this.f116243h) | composer.D(this.f116237b) | composer.D(this.f116241f) | composer.D(this.f116240e);
            final String str = this.f116243h;
            final RateAndReviewDecorator rateAndReviewDecorator2 = this.f116237b;
            final InterfaceC5730l0<Boolean> interfaceC5730l04 = this.f116238c;
            final InterfaceC5730l0<String> interfaceC5730l05 = this.f116236a;
            final LocalThemeScope localThemeScope2 = this.f116241f;
            final Context context2 = this.f116240e;
            Object objB5 = composer.B();
            if (zD3 || objB5 == companion.a()) {
                Function1 function13 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.g1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b1.b.o(Assemble, str, rateAndReviewDecorator2, interfaceC5730l04, interfaceC5730l05, localThemeScope2, context2, (G1) obj);
                    }
                };
                composer.t(function13);
                objB5 = function13;
            }
            composer.P();
            C18504m0.g(localThemeScope, value, modifierD, null, textAreaE, function12, (Function1) objB5, composer, LocalThemeScope.f15770g | (q1.f.TextArea.f140025m << 12), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116249a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f116250b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116251a;

            a(LocalThemeScope localThemeScope) {
                this.f116251a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1885441399, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.YourReviewSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (YourReviewSection.kt:211)");
                }
                LocalThemeScope localThemeScope = this.f116251a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f116251a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 381, null), C16193g.c(Lp.c.f18626Z, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f116249a = localThemeScope;
            this.f116250b = function0;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1146403036, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.YourReviewSection.<anonymous>.<anonymous>.<anonymous> (YourReviewSection.kt:207)");
            }
            LocalThemeScope localThemeScope = this.f116249a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, Modifier.INSTANCE, false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f116250b);
            final Function0<Unit> function0 = this.f116250b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.k1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b1.c.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1885441399, true, new a(this.f116249a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f116253b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RateAndReviewDecorator f116254c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f116255d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f116256e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f116257f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f116258g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f116259h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f116260i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f116261j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f116262a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116263b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f116264c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f116265d;

            a(InterfaceC5730l0<String> interfaceC5730l0, LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, Context context) {
                this.f116262a = interfaceC5730l0;
                this.f116263b = localThemeScope;
                this.f116264c = interfaceC14919W;
                this.f116265d = context;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(String str, Context context, r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.o(semantics, str);
                r1.s.g0(semantics, "For " + context.getString(Lp.c.f18670v0));
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                String strC;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-588301416, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.YourReviewSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (YourReviewSection.kt:289)");
                }
                if (StringsKt.r0(this.f116262a.getValue())) {
                    composer.startReplaceGroup(1674145255);
                    strC = C16193g.c(Lp.c.f18666t0, composer, 0);
                    composer.P();
                } else {
                    composer.startReplaceGroup(1674280973);
                    strC = C16193g.c(Lp.c.f18668u0, composer, 0);
                    composer.P();
                }
                final String str = strC;
                LocalThemeScope localThemeScope = this.f116263b;
                q1.Label infoBlockMessage = this.f116264c.getLabels().getInfoBlockMessage();
                Modifier modifier = this.f116264c.getLabels().getInfoBlockMessage().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(str) | composer.D(this.f116265d);
                final Context context = this.f116265d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.s1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return b1.d.a.c(str, context, (r1.u) obj);
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
        public static final boolean t() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0, RateAndReviewDecorator rateAndReviewDecorator, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5772o interfaceC5772o, Context context, Function1<? super String, Unit> function1, String str, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04) {
            this.f116252a = localThemeScope;
            this.f116253b = interfaceC5730l0;
            this.f116254c = rateAndReviewDecorator;
            this.f116255d = interfaceC5730l02;
            this.f116256e = interfaceC5772o;
            this.f116257f = context;
            this.f116258g = function1;
            this.f116259h = str;
            this.f116260i = interfaceC5730l03;
            this.f116261j = interfaceC5730l04;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC5730l0 interfaceC5730l0, Function1 function1, String it) {
            Intrinsics.j(it, "it");
            interfaceC5730l0.setValue(it);
            function1.invoke(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(InterfaceC14919W interfaceC14919W, String str, RateAndReviewDecorator rateAndReviewDecorator, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, LocalThemeScope localThemeScope, Context context, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), str);
            if (rateAndReviewDecorator.x() && (((Boolean) interfaceC5730l0.getValue()).booleanValue() || rateAndReviewDecorator.getShouldShowAllErrorStateAfterClickSubmit())) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-588301416, true, new a(interfaceC5730l02, localThemeScope, interfaceC14919W, context)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput p(final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.h(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), new C5693z(null, null, new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.q1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b1.d.q(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, 59, null), false, 0, null, null, null, 3999, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            if (onFocusChanged.a()) {
                interfaceC5730l0.setValue(Boolean.TRUE);
            } else if (((Boolean) interfaceC5730l02.getValue()).booleanValue()) {
                interfaceC5730l03.setValue(Boolean.TRUE);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(RateAndReviewDecorator rateAndReviewDecorator, Context context, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, rateAndReviewDecorator.p().b(context) + ". For " + context.getString(Lp.c.f18670v0));
            SemanticsConfiguration semanticsConfiguration = semantics instanceof SemanticsConfiguration ? (SemanticsConfiguration) semantics : null;
            if (semanticsConfiguration != null && ((Boolean) semanticsConfiguration.o(SemanticsProperties.INSTANCE.getFocused(), new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.r1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(b1.d.t());
                }
            })).booleanValue()) {
                r1.s.n0(semantics, C16699g.INSTANCE.b());
            }
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
                ComposerKt.U(85673134, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.YourReviewSection.<anonymous>.<anonymous>.<anonymous> (YourReviewSection.kt:242)");
            }
            LocalThemeScope localThemeScope = this.f116252a;
            String value = this.f116253b.getValue();
            DefaultTextInputs defaultTextInputsC = Assemble.getInputFields();
            boolean z10 = this.f116254c.x() && (this.f116255d.getValue().booleanValue() || this.f116254c.getShouldShowAllErrorStateAfterClickSubmit());
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f116256e);
            final InterfaceC5772o interfaceC5772o = this.f116256e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.l1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b1.d.p(interfaceC5772o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(defaultTextInputsC, z10, false, false, (Function1) objB, 6, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f116260i;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f116261j;
            final InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f116255d;
            Object objB2 = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB2 == companion2.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.m1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b1.d.r(interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, (androidx.compose.ui.focus.E) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierA = C5761d.a(companion, (Function1) objB2);
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(this.f116254c) | composer.D(this.f116257f);
            final RateAndReviewDecorator rateAndReviewDecorator = this.f116254c;
            final Context context = this.f116257f;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion2.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.n1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b1.d.s(rateAndReviewDecorator, context, (r1.u) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierD = C16705m.d(modifierA, false, (Function1) objB3, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f116258g);
            final InterfaceC5730l0<String> interfaceC5730l04 = this.f116253b;
            final Function1<String, Unit> function1 = this.f116258g;
            Object objB4 = composer.B();
            if (zV || objB4 == companion2.a()) {
                objB4 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.o1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b1.d.l(interfaceC5730l04, function1, (String) obj);
                    }
                };
                composer.t(objB4);
            }
            Function1 function12 = (Function1) objB4;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD3 = composer.D(Assemble) | composer.V(this.f116259h) | composer.D(this.f116254c) | composer.D(this.f116252a) | composer.D(this.f116257f);
            final String str = this.f116259h;
            final RateAndReviewDecorator rateAndReviewDecorator2 = this.f116254c;
            final InterfaceC5730l0<Boolean> interfaceC5730l05 = this.f116255d;
            final InterfaceC5730l0<String> interfaceC5730l06 = this.f116253b;
            final LocalThemeScope localThemeScope2 = this.f116252a;
            final Context context2 = this.f116257f;
            Object objB5 = composer.B();
            if (zD3 || objB5 == companion2.a()) {
                Function1 function13 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.p1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b1.d.o(Assemble, str, rateAndReviewDecorator2, interfaceC5730l05, interfaceC5730l06, localThemeScope2, context2, (H1) obj);
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
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f116267b;

        e(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f116266a = localThemeScope;
            this.f116267b = function0;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1003535934, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.YourReviewSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (YourReviewSection.kt:343)");
            }
            b1.j(this.f116266a, null, this.f116267b, composer, LocalThemeScope.f15770g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116268a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f116269b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116270a;

            a(LocalThemeScope localThemeScope) {
                this.f116270a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1761509131, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.YourReviewSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (YourReviewSection.kt:359)");
                }
                LocalThemeScope localThemeScope = this.f116270a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f116270a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 381, null), C16193g.c(Lp.c.f18677z, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        f(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f116268a = localThemeScope;
            this.f116269b = function0;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(498386270, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.YourReviewSection.<anonymous>.<anonymous>.<anonymous> (YourReviewSection.kt:355)");
            }
            LocalThemeScope localThemeScope = this.f116268a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, Modifier.INSTANCE, false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f116269b);
            final Function0<Unit> function0 = this.f116269b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.t1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b1.f.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1761509131, true, new a(this.f116268a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final g f116271f = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Uri uri) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f116272f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f116273g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function1 function1, List list) {
            super(1);
            this.f116272f = function1;
            this.f116273g = list;
        }

        public final Object a(int i10) {
            return this.f116272f.invoke(this.f116273g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class i extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f116274f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116275g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f116276h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List list, LocalThemeScope localThemeScope, Context context) {
            super(4);
            this.f116274f = list;
            this.f116275g = localThemeScope;
            this.f116276h = context;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (composer.V(interfaceC15343c) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            Uri uri = (Uri) this.f116274f.get(i10);
            composer.startReplaceGroup(-323619515);
            C6197c.e(new C15372h.a(this.f116276h).f(uri).c(), null, Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), T0.e.a(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(72)), C16692i.c(this.f116275g.getAdsCornerRadii().getRadius03().getDp())), null, null, null, InterfaceC5784k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 12582960, 0, 8048);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r28, androidx.compose.ui.Modifier r29, final int r30, boolean r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.b1.f(Ji.M, androidx.compose.ui.Modifier, int, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, int i10, boolean z10, int i11, int i12, Composer composer, int i13) {
        f(localThemeScope, modifier, i10, z10, composer, androidx.compose.runtime.J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ji.LocalThemeScope r30, androidx.compose.ui.Modifier r31, final int r32, final boolean r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.b1.h(Ji.M, androidx.compose.ui.Modifier, int, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, int i10, boolean z10, int i11, int i12, Composer composer, int i13) {
        h(localThemeScope, modifier, i10, z10, composer, androidx.compose.runtime.J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.b1.j(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7 A[PHI: r16
      0x00c7: PHI (r16v21 int) = (r16v0 int), (r16v3 int), (r16v4 int) binds: [B:58:0x00c5, B:65:0x00d7, B:64:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ji.LocalThemeScope r53, androidx.compose.ui.Modifier r54, com.meijer.mobile.reviews.ux.rateandreview.RateAndReviewDecorator r55, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r56, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r57, final kotlin.jvm.functions.Function0<kotlin.Unit> r58, final kotlin.jvm.functions.Function0<kotlin.Unit> r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, androidx.compose.runtime.Composer r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 2026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.b1.l(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.reviews.ux.rateandreview.a0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(RateAndReviewDecorator rateAndReviewDecorator, LocalThemeScope localThemeScope, Context context, Function0 function0, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List<Uri> listC = rateAndReviewDecorator.c();
        LazyRow.i(listC.size(), null, new h(g.f116271f, listC), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new i(listC, localThemeScope, context)));
        if (rateAndReviewDecorator.c().size() < 6) {
            l0.w.g(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(-1003535934, true, new e(localThemeScope, function0)), 3, null);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, RateAndReviewDecorator rateAndReviewDecorator, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, rateAndReviewDecorator, function1, function12, function0, function02, function03, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
