package un;

import Ji.LocalThemeScope;
import Ji.Q;
import Ji.T;
import P0.e;
import Qh.C5088h;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.URLSpan;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5763f;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
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
import d0.C13457y;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import ji.DefaultTextInputs;
import ji.InterfaceC14914Q;
import ji.InterfaceC14919W;
import ji.q1;
import ji.s1;
import kotlin.C18153w;
import kotlin.C6165d;
import kotlin.FontWeight;
import kotlin.InterfaceC6166e;
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
import ni.C15862t0;
import ni.P0;
import p1.C16190d;
import p1.C16193g;
import u1.InterfaceC17212d;
import un.t;
import vk.C17590a;
import wn.AbstractC17841a;
import xn.C18072a;
import yr.C18299z;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aI\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010\u001c\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u000e*\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010%\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&¨\u0006*²\u0006\u000e\u0010'\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010(\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010(\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lxn/a$b;", "viewState", "Lkotlin/Function1;", "Lwn/a;", "", "onAction", "f", "(LJi/M;Landroidx/compose/ui/Modifier;Lxn/a$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "errorString", "Lkotlin/Pair;", "Landroidx/compose/ui/text/AnnotatedString;", "N", "(Ljava/lang/String;)Lkotlin/Pair;", "exception", "p", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "fieldLabel", "Landroidx/compose/foundation/text/z;", "keyboardActions", "", "displayError", "onTextChange", "s", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/foundation/text/z;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "j", "O", "(Ljava/lang/String;)Landroidx/compose/ui/text/AnnotatedString;", "optInTerms", "termsAndConditions", "LV0/q0;", "hyperLinkColor", "Lu1/d;", "linkInteractionListener", "P", "(Ljava/lang/String;Ljava/lang/String;JLu1/d;)Landroidx/compose/ui/text/AnnotatedString;", "isTermsAndConditionsChecked", "value", "isError", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f163177a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18072a.ViewState f163178b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f163179c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC17841a, Unit> f163180d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f163181e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: un.t$a$a, reason: collision with other inner class name */
        static final class C2580a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f163182a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC17841a, Unit> f163183b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f163184c;

            /* JADX WARN: Multi-variable type inference failed */
            C2580a(LocalThemeScope localThemeScope, Function1<? super AbstractC17841a, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f163182a = localThemeScope;
                this.f163183b = function1;
                this.f163184c = interfaceC5730l0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void e(Function1 function1, androidx.compose.ui.text.f it) {
                Intrinsics.j(it, "it");
                if ((it instanceof f.a) && Intrinsics.e(((f.a) it).getTag(), "termsAndConditions")) {
                    function1.invoke(AbstractC17841a.d.f166230a);
                }
            }

            public final void c(InterfaceC14914Q Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-474203585, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.AvailableMccSignUpCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AvailableMccSignUpCard.kt:201)");
                }
                LocalThemeScope localThemeScope = this.f163182a;
                q1.s.Checkbox leadingToggleButton = Assemble.getToggleButtons().getLeadingToggleButton();
                boolean zG = t.g(this.f163184c);
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f163183b);
                final Function1<AbstractC17841a, Unit> function1 = this.f163183b;
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f163184c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: un.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return t.a.C2580a.d(function1, interfaceC5730l0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f15770g;
                vi.s.b(localThemeScope, leadingToggleButton, zG, false, false, (Function1) objB, composer, (q1.s.Checkbox.f140173e << 3) | i11, 12);
                LocalThemeScope localThemeScope2 = this.f163182a;
                q1.Label label = new q1.Label(C18299z.f(Modifier.INSTANCE, "mcc_terms_text", null, 2, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 382, null);
                String strC = C16193g.c(Y.f99785R7, composer, 0);
                String strC2 = C16193g.c(Y.f99490Bg, composer, 0);
                long color = this.f163182a.getAdsColors().getAdsColorBrandPrimary().getColor();
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(this.f163183b);
                final Function1<AbstractC17841a, Unit> function12 = this.f163183b;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new InterfaceC17212d() { // from class: un.s
                        @Override // u1.InterfaceC17212d
                        public final void a(androidx.compose.ui.text.f fVar) {
                            t.a.C2580a.e(function12, fVar);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                ri.j.g(localThemeScope2, label, t.P(strC, strC2, color, (InterfaceC17212d) objB2), null, null, composer, i11 | (q1.Label.f140080j << 3), 12);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
                c(interfaceC14914Q, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(Function1 function1, InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                t.h(interfaceC5730l0, z10);
                function1.invoke(new AbstractC17841a.AcceptTermsAndConditions(t.g(interfaceC5730l0)));
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f163185a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C18072a.ViewState f163186b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC17841a, Unit> f163187c;

            /* JADX WARN: Multi-variable type inference failed */
            b(LocalThemeScope localThemeScope, C18072a.ViewState viewState, Function1<? super AbstractC17841a, Unit> function1) {
                this.f163185a = localThemeScope;
                this.f163186b = viewState;
                this.f163187c = function1;
            }

            public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.M()) {
                    ComposerKt.U(-825211145, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.AvailableMccSignUpCard.<anonymous>.<anonymous>.<anonymous> (AvailableMccSignUpCard.kt:121)");
                }
                LocalThemeScope localThemeScope = this.f163185a;
                RetrofitException exception = this.f163186b.getException();
                rk.b errorType = exception != null ? exception.getErrorType() : null;
                composer.startReplaceGroup(1541043323);
                String errorString = errorType != null ? errorType.getErrorString((Context) composer.o(AndroidCompositionLocals_androidKt.g())) : null;
                composer.P();
                t.p(localThemeScope, null, errorString, this.f163187c, composer, LocalThemeScope.f15770g, 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
                a(interfaceC6166e, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f163188a;

            c(LocalThemeScope localThemeScope) {
                this.f163188a = localThemeScope;
            }

            public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1613945874, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.AvailableMccSignUpCard.<anonymous>.<anonymous>.<anonymous> (AvailableMccSignUpCard.kt:129)");
                }
                LocalThemeScope localThemeScope = this.f163188a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f163188a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), C16193g.c(Y.f99957a8, composer, 0), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f163188a.getAdsSpacing().getThree().getDp()), composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
                a(interfaceC6166e, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, C18072a.ViewState viewState, InterfaceC5772o interfaceC5772o, Function1<? super AbstractC17841a, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f163177a = localThemeScope;
            this.f163178b = viewState;
            this.f163179c = interfaceC5772o;
            this.f163180d = function1;
            this.f163181e = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Function1 function1, String value) {
            Intrinsics.j(value, "value");
            function1.invoke(new AbstractC17841a.UpdateLastFourDigits(value));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Function1 function1, LocalDate localDate) {
            if (localDate != null) {
                function1.invoke(new AbstractC17841a.UpdateDateOfBirth(localDate));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(Function1 function1) {
            function1.invoke(AbstractC17841a.f.f166232a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function1 function1, String str) {
            function1.invoke(new AbstractC17841a.CallHelpLine(str));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(Function1 function1, String value) {
            Intrinsics.j(value, "value");
            function1.invoke(new AbstractC17841a.UpdateFirstName(value));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(Function1 function1, String value) {
            Intrinsics.j(value, "value");
            function1.invoke(new AbstractC17841a.UpdateLastName(value));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            o(composer, num.intValue());
            return Unit.f142422a;
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
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f163177a.getAdsSpacing().getFive().getDp());
            e.Companion companion2 = P0.e.INSTANCE;
            e.b bVarG = companion2.g();
            LocalThemeScope localThemeScope = this.f163177a;
            C18072a.ViewState viewState = this.f163178b;
            final InterfaceC5772o interfaceC5772o = this.f163179c;
            final Function1<AbstractC17841a, Unit> function1 = this.f163180d;
            InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f163181e;
            C5658d c5658d = C5658d.f48555a;
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), bVarG, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            C13457y.a(C16190d.c(S.f98716c0, composer, 0), null, androidx.compose.foundation.layout.J.z(companion, H1.h.p(BinsView.TOTE_HEIGHT_DP)), null, null, 0.0f, null, composer, 432, BinsView.TOTE_HEIGHT_DP);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 373, null);
            String strC = C16193g.c(Y.f99997c8, composer, 0);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C6165d.e(c14815g, viewState.getDisplayError(), null, null, null, null, ComposableLambdaKt.c(-825211145, true, new b(localThemeScope, viewState, function1), composer, 54), composer, 1572870, 30);
            C6165d.e(c14815g, !viewState.getDisplayError(), null, null, null, null, ComposableLambdaKt.c(-1613945874, true, new c(localThemeScope), composer, 54), composer, 1572870, 30);
            ri.j.g(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), t.O(C16193g.c(Y.f99614I7, composer, 0)), null, null, composer, i11 | (i12 << 3), 12);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(C18299z.f(companion, "mcc_signup_firstname", null, 2, null));
            String strC2 = C16193g.c(Y.f100048f, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(interfaceC5772o);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: un.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.p(interfaceC5772o, (InterfaceC5692y) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C5693z c5693z = new C5693z((Function1) objB, null, null, null, null, null, 62, null);
            boolean displayError = viewState.getDisplayError();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function1);
            Object objB2 = composer.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: un.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.u(function1, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            t.s(localThemeScope, modifierFsMask, strC2, c5693z, displayError, (Function1) objB2, composer, i11, 0);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Modifier modifierFsMask2 = FullStoryAnnotationsKt.fsMask(C18299z.f(companion, "mcc_signup_lastname", null, 2, null));
            String strC3 = C16193g.c(Y.f100068g, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(interfaceC5772o);
            Object objB3 = composer.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: un.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.v(interfaceC5772o, (InterfaceC5692y) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C5693z c5693z2 = new C5693z((Function1) objB3, null, null, null, null, null, 62, null);
            boolean displayError2 = viewState.getDisplayError();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(function1);
            Object objB4 = composer.B();
            if (zV2 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function1() { // from class: un.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.w(function1, (String) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            t.s(localThemeScope, modifierFsMask2, strC3, c5693z2, displayError2, (Function1) objB4, composer, i11, 0);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Modifier modifierFsMask3 = FullStoryAnnotationsKt.fsMask(C18299z.f(companion, "mcc_signup_card_digits", null, 2, null));
            String strC4 = C16193g.c(Y.f100455z7, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zD3 = composer.D(interfaceC5772o);
            Object objB5 = composer.B();
            if (zD3 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new Function1() { // from class: un.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.x(interfaceC5772o, (InterfaceC5692y) obj);
                    }
                };
                composer.t(objB5);
            }
            composer.P();
            C5693z c5693z3 = new C5693z((Function1) objB5, null, null, null, null, null, 62, null);
            boolean displayError3 = viewState.getDisplayError();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(function1);
            Object objB6 = composer.B();
            if (zV3 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new Function1() { // from class: un.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.q(function1, (String) obj);
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            t.j(localThemeScope, modifierFsMask3, strC4, c5693z3, displayError3, (Function1) objB6, composer, i11, 0);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            String strC5 = C16193g.c(Y.f99690M7, composer, 0);
            DateTimeFormatter dateTimeFormatterL = C17590a.f164803a.l();
            LocalDate dateOfBirth = viewState.getDateOfBirth();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, 0, androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 119, null);
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(function1);
            Object objB7 = composer.B();
            if (zV4 || objB7 == Composer.INSTANCE.a()) {
                objB7 = new Function1() { // from class: un.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.a.r(function1, (LocalDate) obj);
                    }
                };
                composer.t(objB7);
            }
            composer.P();
            C5088h.d(localThemeScope, strC5, dateOfBirth, null, false, dateTimeFormatterL, keyboardOptions, (Function1) objB7, composer, i11 | 1572864, 12);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Modifier modifierF = C18299z.f(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), localThemeScope.getAdsSpacing().getOne().getDp()), "mcc_terms", null, 2, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierF);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            Q.e(localThemeScope, s1.b.f140196a, ComposableLambdaKt.c(-474203585, true, new C2580a(localThemeScope, function1, interfaceC5730l0), composer, 54), composer, i11 | 384 | (s1.b.f140197b << 3));
            composer.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierK);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyG, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            C15862t0 c15862t0 = C15862t0.f151797a;
            String strC6 = C16193g.c(Y.f99774Qf, composer, 0);
            boolean zJ = viewState.j();
            Modifier modifierF2 = C18299z.f(companion, "mcc_sign_up_submit", null, 2, null);
            composer.startReplaceGroup(5004770);
            boolean zV5 = composer.V(function1);
            Object objB8 = composer.B();
            if (zV5 || objB8 == Composer.INSTANCE.a()) {
                objB8 = new Function0() { // from class: un.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t.a.s(function1);
                    }
                };
                composer.t(objB8);
            }
            composer.P();
            P0.k(localThemeScope, c15862t0, strC6, (Function0) objB8, modifierF2, null, true, 0L, zJ, composer, i11 | 1572864 | (C15862t0.f151798b << 3), 80);
            composer.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA4 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5811g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = D1.a(composer);
            D1.c(composerA4, measurePolicyB2, companion3.e());
            D1.c(composerA4, interfaceC5742sR4, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 383, null), C16193g.c(Y.f99766Q7, composer, 0), null, composer, i11 | (i12 << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getOne().getDp()), composer, 0);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 381, null), C16193g.c(Y.f99671L7, composer, 0), null, composer, i11 | (i12 << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getOne().getDp()), composer, 0);
            final String strC7 = C16193g.c(Y.f100028e, composer, 0);
            Ji.I one = localThemeScope.getAdsTypography().getDetail().getOne();
            T adsColorLink = localThemeScope.getAdsColors().getAdsColorLink();
            composer.startReplaceGroup(-1633490746);
            boolean zV6 = composer.V(function1) | composer.V(strC7);
            Object objB9 = composer.B();
            if (zV6 || objB9 == Composer.INSTANCE.a()) {
                objB9 = new Function0() { // from class: un.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t.a.t(function1, strC7);
                    }
                };
                composer.t(objB9);
            }
            composer.P();
            ri.j.h(localThemeScope, new q1.Label(ClickableKt.d(companion, false, null, null, (Function0) objB9, 7, null), adsColorLink, null, null, 0, false, 0, one, null, 380, null), strC7, null, composer, i11 | (i12 << 3), 4);
            composer.v();
            C14802K.a(androidx.compose.foundation.layout.D.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f163189a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5693z f163190b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f163191c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f163192d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f163193e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f163194f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f163195g;

        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, C5693z c5693z, LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l0, String str, InterfaceC5730l0<String> interfaceC5730l02) {
            this.f163189a = modifier;
            this.f163190b = c5693z;
            this.f163191c = localThemeScope;
            this.f163192d = function1;
            this.f163193e = interfaceC5730l0;
            this.f163194f = str;
            this.f163195g = interfaceC5730l02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput e(C5693z c5693z, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), c5693z, true, 0, null, null, null, 3871, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, String it) {
            Intrinsics.j(it, "it");
            t.l(interfaceC5730l0, StringsKt.J1(it, 4));
            function1.invoke(t.k(interfaceC5730l0));
            t.n(interfaceC5730l02, false);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC14919W interfaceC14919W, String str, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), str);
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1112217801, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.CardNumberInputField.<anonymous> (AvailableMccSignUpCard.kt:396)");
            }
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(this.f163189a);
            String strK = t.k(this.f163195g);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            boolean zM = t.m(this.f163193e);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f163190b);
            final C5693z c5693z = this.f163190b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: un.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.b.e(c5693z, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, zM, false, false, (Function1) objB, 6, null);
            LocalThemeScope localThemeScope = this.f163191c;
            composer.startReplaceGroup(-1746271574);
            boolean zV2 = composer.V(this.f163192d) | composer.V(this.f163193e);
            final Function1<String, Unit> function1 = this.f163192d;
            final InterfaceC5730l0<String> interfaceC5730l0 = this.f163195g;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f163193e;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: un.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.b.f(function1, interfaceC5730l0, interfaceC5730l02, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(Assemble) | composer.V(this.f163194f);
            final String str = this.f163194f;
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: un.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.b.g(Assemble, str, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C18504m0.i(localThemeScope, strK, textInputF, modifierFsMask, function12, (Function1) objB3, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            d(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f163196a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5693z f163197b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f163198c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f163199d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f163200e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f163201f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f163202g;

        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, C5693z c5693z, LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l0, String str, InterfaceC5730l0<String> interfaceC5730l02) {
            this.f163196a = modifier;
            this.f163197b = c5693z;
            this.f163198c = localThemeScope;
            this.f163199d = function1;
            this.f163200e = interfaceC5730l0;
            this.f163201f = str;
            this.f163202g = interfaceC5730l02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput e(C5693z c5693z, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.h(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), c5693z, true, 0, null, null, null, 3871, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, String it) {
            Intrinsics.j(it, "it");
            t.u(interfaceC5730l0, StringsKt.J1(it, 25));
            function1.invoke(t.t(interfaceC5730l0));
            t.w(interfaceC5730l02, false);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC14919W interfaceC14919W, String str, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), str);
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1704925099, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.TextInputField.<anonymous> (AvailableMccSignUpCard.kt:361)");
            }
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(this.f163196a);
            String strT = t.t(this.f163202g);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            boolean zV = t.v(this.f163200e);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f163197b);
            final C5693z c5693z = this.f163197b;
            Object objB = composer.B();
            if (zV2 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: un.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.c.e(c5693z, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, zV, false, false, (Function1) objB, 6, null);
            LocalThemeScope localThemeScope = this.f163198c;
            composer.startReplaceGroup(-1746271574);
            boolean zV3 = composer.V(this.f163199d) | composer.V(this.f163200e);
            final Function1<String, Unit> function1 = this.f163199d;
            final InterfaceC5730l0<String> interfaceC5730l0 = this.f163202g;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f163200e;
            Object objB2 = composer.B();
            if (zV3 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: un.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.c.f(function1, interfaceC5730l0, interfaceC5730l02, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(Assemble) | composer.V(this.f163201f);
            final String str = this.f163201f;
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: un.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.c.g(Assemble, str, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C18504m0.i(localThemeScope, strT, textInputF, modifierFsMask, function12, (Function1) objB3, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            d(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
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
        bVar.g(StringsKt.y1(spannableStringValueOf.subSequence(0, spanStart).toString()).toString());
        bVar.g(StringsKt.y1(spannableStringValueOf.subSequence(spanEnd, spannableStringValueOf.length()).toString()).toString());
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
        bVar.a(new SpanStyle(0L, 0L, FontWeight.INSTANCE.e(), C18153w.c(C18153w.INSTANCE.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), 0, str.length());
        return bVar.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString P(String str, String str2, long j10, InterfaceC17212d interfaceC17212d) {
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        bVar.g(str);
        int iL = bVar.l(new f.a("termsAndConditions", new u1.w(new SpanStyle(j10, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), null, null, null, 14, null), interfaceC17212d));
        try {
            bVar.g(str2);
            Unit unit = Unit.f142422a;
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
    public static final void f(final Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final xn.C18072a.ViewState r21, final kotlin.jvm.functions.Function1<? super wn.AbstractC17841a, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: un.t.f(Ji.M, androidx.compose.ui.Modifier, xn.a$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, C18072a.ViewState viewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, viewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void j(Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final java.lang.String r18, final androidx.compose.foundation.text.C5693z r19, boolean r20, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: un.t.j(Ji.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.foundation.text.z, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, String str, C5693z c5693z, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, str, c5693z, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void p(final Ji.LocalThemeScope r28, androidx.compose.ui.Modifier r29, final java.lang.String r30, final kotlin.jvm.functions.Function1<? super wn.AbstractC17841a, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: un.t.p(Ji.M, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, str, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, Pair pair) {
        function1.invoke(new AbstractC17841a.ErrorMessageClicked((String) pair.d()));
        return Unit.f142422a;
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
    public static final void s(Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final java.lang.String r18, final androidx.compose.foundation.text.C5693z r19, boolean r20, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: un.t.s(Ji.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.foundation.text.z, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, String str, C5693z c5693z, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, modifier, str, c5693z, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
