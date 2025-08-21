package vn;

import Ai.C2832m0;
import Ai.H1;
import Ki.LocalThemeScope;
import Ki.Q;
import Ki.T;
import P0.e;
import Rh.C5226h;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.URLSpan;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.input.KeyboardType;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.Y;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import ki.DefaultTextInputs;
import ki.InterfaceC15148Q;
import ki.InterfaceC15153W;
import ki.q1;
import ki.s1;
import kotlin.C18280w;
import kotlin.C6304d;
import kotlin.FontWeight;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oi.C16196t0;
import oi.P0;
import p1.C16335d;
import p1.C16338g;
import u1.InterfaceC17339d;
import vn.t;
import wk.C17898a;
import xn.AbstractC18200a;
import yn.C18334a;
import yr.C18370z;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aI\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010\u001c\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u000e*\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010%\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&¨\u0006*²\u0006\u000e\u0010'\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010(\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010(\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lyn/a$b;", "viewState", "Lkotlin/Function1;", "Lxn/a;", "", "onAction", "f", "(LKi/M;Landroidx/compose/ui/Modifier;Lyn/a$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "errorString", "Lkotlin/Pair;", "Landroidx/compose/ui/text/AnnotatedString;", "N", "(Ljava/lang/String;)Lkotlin/Pair;", "exception", "p", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "fieldLabel", "Landroidx/compose/foundation/text/z;", "keyboardActions", "", "displayError", "onTextChange", "s", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/foundation/text/z;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "j", "O", "(Ljava/lang/String;)Landroidx/compose/ui/text/AnnotatedString;", "optInTerms", "termsAndConditions", "LV0/q0;", "hyperLinkColor", "Lu1/d;", "linkInteractionListener", "P", "(Ljava/lang/String;Ljava/lang/String;JLu1/d;)Landroidx/compose/ui/text/AnnotatedString;", "isTermsAndConditionsChecked", "value", "isError", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f166078a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18334a.ViewState f166079b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f166080c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18200a, Unit> f166081d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f166082e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: vn.t$a$a, reason: collision with other inner class name */
        static final class C2626a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f166083a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC18200a, Unit> f166084b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f166085c;

            /* JADX WARN: Multi-variable type inference failed */
            C2626a(LocalThemeScope localThemeScope, Function1<? super AbstractC18200a, Unit> function1, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f166083a = localThemeScope;
                this.f166084b = function1;
                this.f166085c = interfaceC5872l0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void e(Function1 function1, androidx.compose.ui.text.f it) {
                Intrinsics.j(it, "it");
                if ((it instanceof f.a) && Intrinsics.e(((f.a) it).getTag(), "termsAndConditions")) {
                    function1.invoke(AbstractC18200a.d.f170879a);
                }
            }

            public final void c(InterfaceC15148Q Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-474203585, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.AvailableMccSignUpCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AvailableMccSignUpCard.kt:201)");
                }
                LocalThemeScope localThemeScope = this.f166083a;
                q1.s.Checkbox leadingToggleButton = Assemble.getToggleButtons().getLeadingToggleButton();
                boolean zG = t.g(this.f166085c);
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f166084b);
                final Function1<AbstractC18200a, Unit> function1 = this.f166084b;
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f166085c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: vn.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return t.a.C2626a.d(function1, interfaceC5872l0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f17314g;
                wi.s.b(localThemeScope, leadingToggleButton, zG, false, false, (Function1) objB, composer, (q1.s.Checkbox.f142428e << 3) | i11, 12);
                LocalThemeScope localThemeScope2 = this.f166083a;
                q1.Label label = new q1.Label(C18370z.f(Modifier.INSTANCE, "mcc_terms_text", null, 2, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 382, null);
                String strC = C16338g.c(Y.f100704U7, composer, 0);
                String strC2 = C16338g.c(Y.f100408Eg, composer, 0);
                long color = this.f166083a.getAdsColors().getAdsColorBrandPrimary().getColor();
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(this.f166084b);
                final Function1<AbstractC18200a, Unit> function12 = this.f166084b;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new InterfaceC17339d() { // from class: vn.s
                        @Override // u1.InterfaceC17339d
                        public final void a(androidx.compose.ui.text.f fVar) {
                            t.a.C2626a.e(function12, fVar);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                si.j.g(localThemeScope2, label, t.P(strC, strC2, color, (InterfaceC17339d) objB2), null, null, composer, i11 | (q1.Label.f142335j << 3), 12);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
                c(interfaceC15148Q, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(Function1 function1, InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                t.h(interfaceC5872l0, z10);
                function1.invoke(new AbstractC18200a.AcceptTermsAndConditions(t.g(interfaceC5872l0)));
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f166086a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C18334a.ViewState f166087b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC18200a, Unit> f166088c;

            /* JADX WARN: Multi-variable type inference failed */
            b(LocalThemeScope localThemeScope, C18334a.ViewState viewState, Function1<? super AbstractC18200a, Unit> function1) {
                this.f166086a = localThemeScope;
                this.f166087b = viewState;
                this.f166088c = function1;
            }

            public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.M()) {
                    ComposerKt.U(-825211145, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.AvailableMccSignUpCard.<anonymous>.<anonymous>.<anonymous> (AvailableMccSignUpCard.kt:121)");
                }
                LocalThemeScope localThemeScope = this.f166086a;
                RetrofitException exception = this.f166087b.getException();
                sk.b errorType = exception != null ? exception.getErrorType() : null;
                composer.startReplaceGroup(1541043323);
                String errorString = errorType != null ? errorType.getErrorString((Context) composer.o(AndroidCompositionLocals_androidKt.g())) : null;
                composer.P();
                t.p(localThemeScope, null, errorString, this.f166088c, composer, LocalThemeScope.f17314g, 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
                a(interfaceC6305e, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f166089a;

            c(LocalThemeScope localThemeScope) {
                this.f166089a = localThemeScope;
            }

            public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1613945874, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.AvailableMccSignUpCard.<anonymous>.<anonymous>.<anonymous> (AvailableMccSignUpCard.kt:129)");
                }
                LocalThemeScope localThemeScope = this.f166089a;
                si.j.h(localThemeScope, new q1.Label(null, this.f166089a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), C16338g.c(Y.f100879d8, composer, 0), null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
                C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f166089a.getAdsSpacing().getThree().getDp()), composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
                a(interfaceC6305e, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, C18334a.ViewState viewState, InterfaceC5914o interfaceC5914o, Function1<? super AbstractC18200a, Unit> function1, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f166078a = localThemeScope;
            this.f166079b = viewState;
            this.f166080c = interfaceC5914o;
            this.f166081d = function1;
            this.f166082e = interfaceC5872l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5914o.e(C5905f.INSTANCE.a());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Function1 function1, String value) {
            Intrinsics.j(value, "value");
            function1.invoke(new AbstractC18200a.UpdateLastFourDigits(value));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Function1 function1, LocalDate localDate) {
            if (localDate != null) {
                function1.invoke(new AbstractC18200a.UpdateDateOfBirth(localDate));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(Function1 function1) {
            function1.invoke(AbstractC18200a.f.f170881a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function1 function1, String str) {
            function1.invoke(new AbstractC18200a.CallHelpLine(str));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(Function1 function1, String value) {
            Intrinsics.j(value, "value");
            function1.invoke(new AbstractC18200a.UpdateFirstName(value));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5914o.e(C5905f.INSTANCE.a());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(Function1 function1, String value) {
            Intrinsics.j(value, "value");
            function1.invoke(new AbstractC18200a.UpdateLastName(value));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            o(composer, num.intValue());
            return Unit.f143329a;
        }

        public final void o(Composer composer, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2073729751, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.AvailableMccSignUpCard.<anonymous> (AvailableMccSignUpCard.kt:96)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f166078a.getAdsSpacing().getFive().getDp());
            e.Companion companion2 = P0.e.INSTANCE;
            e.b bVarG = companion2.g();
            LocalThemeScope localThemeScope = this.f166078a;
            C18334a.ViewState viewState = this.f166079b;
            final InterfaceC5914o interfaceC5914o = this.f166080c;
            final Function1<AbstractC18200a, Unit> function1 = this.f166081d;
            InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f166082e;
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), bVarG, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            C13590y.a(C16335d.c(S.f99573c0, composer, 0), null, androidx.compose.foundation.layout.J.z(companion, H1.h.p(BinsView.TOTE_HEIGHT_DP)), null, null, 0.0f, null, composer, 432, BinsView.TOTE_HEIGHT_DP);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 373, null);
            String strC = C16338g.c(Y.f100919f8, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C6304d.e(c14903g, viewState.getDisplayError(), null, null, null, null, ComposableLambdaKt.c(-825211145, true, new b(localThemeScope, viewState, function1), composer, 54), composer, 1572870, 30);
            C6304d.e(c14903g, !viewState.getDisplayError(), null, null, null, null, ComposableLambdaKt.c(-1613945874, true, new c(localThemeScope), composer, 54), composer, 1572870, 30);
            si.j.g(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), t.O(C16338g.c(Y.f100533L7, composer, 0)), null, null, composer, i11 | (i12 << 3), 12);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(C18370z.f(companion, "mcc_signup_firstname", null, 2, null));
            String strC2 = C16338g.c(Y.f100910f, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(interfaceC5914o);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: vn.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.p(interfaceC5914o, (InterfaceC5834y) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C5835z c5835z = new C5835z((Function1) objB, null, null, null, null, null, 62, null);
            boolean displayError = viewState.getDisplayError();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function1);
            Object objB2 = composer.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: vn.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.u(function1, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            t.s(localThemeScope, modifierFsMask, strC2, c5835z, displayError, (Function1) objB2, composer, i11, 0);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Modifier modifierFsMask2 = FullStoryAnnotationsKt.fsMask(C18370z.f(companion, "mcc_signup_lastname", null, 2, null));
            String strC3 = C16338g.c(Y.f100930g, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(interfaceC5914o);
            Object objB3 = composer.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: vn.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.v(interfaceC5914o, (InterfaceC5834y) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C5835z c5835z2 = new C5835z((Function1) objB3, null, null, null, null, null, 62, null);
            boolean displayError2 = viewState.getDisplayError();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(function1);
            Object objB4 = composer.B();
            if (zV2 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function1() { // from class: vn.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.w(function1, (String) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            t.s(localThemeScope, modifierFsMask2, strC3, c5835z2, displayError2, (Function1) objB4, composer, i11, 0);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Modifier modifierFsMask3 = FullStoryAnnotationsKt.fsMask(C18370z.f(companion, "mcc_signup_card_digits", null, 2, null));
            String strC4 = C16338g.c(Y.f100359C7, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zD3 = composer.D(interfaceC5914o);
            Object objB5 = composer.B();
            if (zD3 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new Function1() { // from class: vn.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.x(interfaceC5914o, (InterfaceC5834y) obj);
                    }
                };
                composer.t(objB5);
            }
            composer.P();
            C5835z c5835z3 = new C5835z((Function1) objB5, null, null, null, null, null, 62, null);
            boolean displayError3 = viewState.getDisplayError();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(function1);
            Object objB6 = composer.B();
            if (zV3 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new Function1() { // from class: vn.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.q(function1, (String) obj);
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            t.j(localThemeScope, modifierFsMask3, strC4, c5835z3, displayError3, (Function1) objB6, composer, i11, 0);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            String strC5 = C16338g.c(Y.f100609P7, composer, 0);
            DateTimeFormatter dateTimeFormatterL = C17898a.f167225a.l();
            LocalDate dateOfBirth = viewState.getDateOfBirth();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, 0, androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 119, null);
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(function1);
            Object objB7 = composer.B();
            if (zV4 || objB7 == Composer.INSTANCE.a()) {
                objB7 = new Function1() { // from class: vn.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.r(function1, (LocalDate) obj);
                    }
                };
                composer.t(objB7);
            }
            composer.P();
            C5226h.d(localThemeScope, strC5, dateOfBirth, null, false, dateTimeFormatterL, keyboardOptions, (Function1) objB7, composer, i11 | 1572864, 12);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Modifier modifierF = C18370z.f(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), localThemeScope.getAdsSpacing().getOne().getDp()), "mcc_terms", null, 2, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierF);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            Q.e(localThemeScope, s1.b.f142451a, ComposableLambdaKt.c(-474203585, true, new C2626a(localThemeScope, function1, interfaceC5872l0), composer, 54), composer, i11 | 384 | (s1.b.f142452b << 3));
            composer.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierK);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyG, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            C16196t0 c16196t0 = C16196t0.f154256a;
            String strC6 = C16338g.c(Y.f100693Tf, composer, 0);
            boolean zJ = viewState.j();
            Modifier modifierF2 = C18370z.f(companion, "mcc_sign_up_submit", null, 2, null);
            composer.startReplaceGroup(5004770);
            boolean zV5 = composer.V(function1);
            Object objB8 = composer.B();
            if (zV5 || objB8 == Composer.INSTANCE.a()) {
                objB8 = new Function0() { // from class: vn.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t.a.s(function1);
                    }
                };
                composer.t(objB8);
            }
            composer.P();
            P0.k(localThemeScope, c16196t0, strC6, (Function0) objB8, modifierF2, null, true, 0L, zJ, composer, i11 | 1572864 | (C16196t0.f154257b << 3), 80);
            composer.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA4 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = D1.a(composer);
            D1.c(composerA4, measurePolicyB2, companion3.e());
            D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 383, null), C16338g.c(Y.f100685T7, composer, 0), null, composer, i11 | (i12 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getOne().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 381, null), C16338g.c(Y.f100590O7, composer, 0), null, composer, i11 | (i12 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getOne().getDp()), composer, 0);
            final String strC7 = C16338g.c(Y.f100890e, composer, 0);
            Ki.I one = localThemeScope.getAdsTypography().getDetail().getOne();
            T adsColorLink = localThemeScope.getAdsColors().getAdsColorLink();
            composer.startReplaceGroup(-1633490746);
            boolean zV6 = composer.V(function1) | composer.V(strC7);
            Object objB9 = composer.B();
            if (zV6 || objB9 == Composer.INSTANCE.a()) {
                objB9 = new Function0() { // from class: vn.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t.a.t(function1, strC7);
                    }
                };
                composer.t(objB9);
            }
            composer.P();
            si.j.h(localThemeScope, new q1.Label(ClickableKt.d(companion, false, null, null, (Function0) objB9, 7, null), adsColorLink, null, null, 0, false, 0, one, null, 380, null), strC7, null, composer, i11 | (i12 << 3), 4);
            composer.v();
            C14890K.a(androidx.compose.foundation.layout.D.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f166090a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5835z f166091b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f166092c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f166093d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f166094e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f166095f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f166096g;

        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, C5835z c5835z, LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, InterfaceC5872l0<Boolean> interfaceC5872l0, String str, InterfaceC5872l0<String> interfaceC5872l02) {
            this.f166090a = modifier;
            this.f166091b = c5835z;
            this.f166092c = localThemeScope;
            this.f166093d = function1;
            this.f166094e = interfaceC5872l0;
            this.f166095f = str;
            this.f166096g = interfaceC5872l02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput e(C5835z c5835z, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), c5835z, true, 0, null, null, null, 3871, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, String it) {
            Intrinsics.j(it, "it");
            t.l(interfaceC5872l0, StringsKt.N1(it, 4));
            function1.invoke(t.k(interfaceC5872l0));
            t.n(interfaceC5872l02, false);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC15153W interfaceC15153W, String str, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), str);
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1112217801, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.CardNumberInputField.<anonymous> (AvailableMccSignUpCard.kt:396)");
            }
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(this.f166090a);
            String strK = t.k(this.f166096g);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            boolean zM = t.m(this.f166094e);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f166091b);
            final C5835z c5835z = this.f166091b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: vn.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.b.e(c5835z, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, zM, false, false, (Function1) objB, 6, null);
            LocalThemeScope localThemeScope = this.f166092c;
            composer.startReplaceGroup(-1746271574);
            boolean zV2 = composer.V(this.f166093d) | composer.V(this.f166094e);
            final Function1<String, Unit> function1 = this.f166093d;
            final InterfaceC5872l0<String> interfaceC5872l0 = this.f166096g;
            final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f166094e;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: vn.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.b.f(function1, interfaceC5872l0, interfaceC5872l02, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(Assemble) | composer.V(this.f166095f);
            final String str = this.f166095f;
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: vn.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.b.g(Assemble, str, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2832m0.i(localThemeScope, strK, textInputF, modifierFsMask, function12, (Function1) objB3, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            d(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f166097a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5835z f166098b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f166099c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f166100d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f166101e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f166102f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f166103g;

        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, C5835z c5835z, LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, InterfaceC5872l0<Boolean> interfaceC5872l0, String str, InterfaceC5872l0<String> interfaceC5872l02) {
            this.f166097a = modifier;
            this.f166098b = c5835z;
            this.f166099c = localThemeScope;
            this.f166100d = function1;
            this.f166101e = interfaceC5872l0;
            this.f166102f = str;
            this.f166103g = interfaceC5872l02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput e(C5835z c5835z, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.h(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), c5835z, true, 0, null, null, null, 3871, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, String it) {
            Intrinsics.j(it, "it");
            t.u(interfaceC5872l0, StringsKt.N1(it, 25));
            function1.invoke(t.t(interfaceC5872l0));
            t.w(interfaceC5872l02, false);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC15153W interfaceC15153W, String str, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), str);
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1704925099, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.TextInputField.<anonymous> (AvailableMccSignUpCard.kt:361)");
            }
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(this.f166097a);
            String strT = t.t(this.f166103g);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            boolean zV = t.v(this.f166101e);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f166098b);
            final C5835z c5835z = this.f166098b;
            Object objB = composer.B();
            if (zV2 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: vn.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.c.e(c5835z, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, zV, false, false, (Function1) objB, 6, null);
            LocalThemeScope localThemeScope = this.f166099c;
            composer.startReplaceGroup(-1746271574);
            boolean zV3 = composer.V(this.f166100d) | composer.V(this.f166101e);
            final Function1<String, Unit> function1 = this.f166100d;
            final InterfaceC5872l0<String> interfaceC5872l0 = this.f166103g;
            final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f166101e;
            Object objB2 = composer.B();
            if (zV3 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: vn.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.c.f(function1, interfaceC5872l0, interfaceC5872l02, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(Assemble) | composer.V(this.f166102f);
            final String str = this.f166102f;
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: vn.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.c.g(Assemble, str, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2832m0.i(localThemeScope, strT, textInputF, modifierFsMask, function12, (Function1) objB3, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            d(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    private static final Pair<AnnotatedString, Pair<String, String>> N(String str) {
        SpannableString spannableStringValueOf = SpannableString.valueOf(m2.b.a(str, 0, null, null));
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        Object[] spans = spannableStringValueOf.getSpans(0, str.length(), URLSpan.class);
        Intrinsics.i(spans, "getSpans(...)");
        URLSpan uRLSpan = (URLSpan) ArraysKt.f0(spans);
        int spanStart = spannableStringValueOf.getSpanStart(uRLSpan);
        int spanEnd = spannableStringValueOf.getSpanEnd(uRLSpan);
        bVar.g(StringsKt.C1(spannableStringValueOf.subSequence(0, spanStart).toString()).toString());
        bVar.g(StringsKt.C1(spannableStringValueOf.subSequence(spanEnd, spannableStringValueOf.length()).toString()).toString());
        AnnotatedString annotatedStringQ = bVar.q();
        Object[] spans2 = spannableStringValueOf.getSpans(0, str.length(), URLSpan.class);
        Intrinsics.i(spans2, "getSpans(...)");
        URLSpan uRLSpan2 = (URLSpan) ArraysKt.f0(spans2);
        return new Pair<>(annotatedStringQ, new Pair(spannableStringValueOf.subSequence(spannableStringValueOf.getSpanStart(uRLSpan2), spannableStringValueOf.getSpanEnd(uRLSpan2)).toString(), uRLSpan2.getURL()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString O(String str) {
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        bVar.g(str);
        bVar.a(new SpanStyle(0L, 0L, FontWeight.INSTANCE.e(), C18280w.c(C18280w.INSTANCE.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), 0, str.length());
        return bVar.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString P(String str, String str2, long j10, InterfaceC17339d interfaceC17339d) {
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        bVar.g(str);
        int iL = bVar.l(new f.a("termsAndConditions", new u1.w(new SpanStyle(j10, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), null, null, null, 14, null), interfaceC17339d));
        try {
            bVar.g(str2);
            Unit unit = Unit.f143329a;
            bVar.k(iL);
            return bVar.q();
        } catch (Throwable th2) {
            bVar.k(iL);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ki.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final yn.C18334a.ViewState r21, final kotlin.jvm.functions.Function1<? super xn.AbstractC18200a, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.t.f(Ki.M, androidx.compose.ui.Modifier, yn.a$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, C18334a.ViewState viewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, viewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final java.lang.String r18, final androidx.compose.foundation.text.C5835z r19, boolean r20, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.t.j(Ki.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.foundation.text.z, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, String str, C5835z c5835z, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, str, c5835z, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r28, androidx.compose.ui.Modifier r29, final java.lang.String r30, final kotlin.jvm.functions.Function1<? super xn.AbstractC18200a, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.t.p(Ki.M, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, str, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, Pair pair) {
        function1.invoke(new AbstractC18200a.ErrorMessageClicked((String) pair.d()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final java.lang.String r18, final androidx.compose.foundation.text.C5835z r19, boolean r20, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.t.s(Ki.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.foundation.text.z, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, String str, C5835z c5835z, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, modifier, str, c5835z, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
