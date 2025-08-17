package com.meijer.mobile.reviews.ux.rateandreview;

import Ji.LocalThemeScope;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity;
import e.C13589e;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import java.util.Locale;
import ji.q1;
import kotlin.C17921a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00020\u0006*\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/RateTermsAndConditionsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "", "u1", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LJi/M;", "Lkotlin/Function0;", "onAgreeClicked", "s1", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "v", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RateTermsAndConditionsActivity extends Hilt_RateTermsAndConditionsActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f116108w = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116109a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f116110b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f116111c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity$a$a, reason: collision with other inner class name */
        static final class C1866a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116112a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ji.j1 f116113b;

            C1866a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                this.f116112a = localThemeScope;
                this.f116113b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-514001565, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity.BottomButton.<anonymous>.<anonymous>.<anonymous> (RateTermsAndConditionsActivity.kt:89)");
                }
                LocalThemeScope localThemeScope = this.f116112a;
                q1.Label enabledLabel = this.f116113b.a().getEnabledLabel();
                String upperCase = C16193g.c(Lp.c.f18653n, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        a(LocalThemeScope localThemeScope, Modifier modifier, Function0<Unit> function0) {
            this.f116109a = localThemeScope;
            this.f116110b = modifier;
            this.f116111c = function0;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1515170122, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity.BottomButton.<anonymous>.<anonymous> (RateTermsAndConditionsActivity.kt:83)");
            }
            LocalThemeScope localThemeScope = this.f116109a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.d().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(this.f116110b, 0.0f, 1, null), H1.h.p(16)), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f116111c);
            final Function0<Unit> function0 = this.f116111c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.f0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RateTermsAndConditionsActivity.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-514001565, true, new C1866a(this.f116109a, Assemble), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/RateTermsAndConditionsActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent a(Context context) {
            Intrinsics.j(context, "context");
            return new Intent(context, (Class<?>) RateTermsAndConditionsActivity.class);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f116114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RateTermsAndConditionsActivity f116115b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116116a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ RateTermsAndConditionsActivity f116117b;

            a(LocalThemeScope localThemeScope, RateTermsAndConditionsActivity rateTermsAndConditionsActivity) {
                this.f116116a = localThemeScope;
                this.f116117b = rateTermsAndConditionsActivity;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(757961541, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity.RateTermsAndConditionsScreen.<anonymous>.<anonymous> (RateTermsAndConditionsActivity.kt:54)");
                }
                String strC = C16193g.c(Lp.c.f18601M, composer, 0);
                String strC2 = C16193g.c(Lp.c.f18614S0, composer, 0);
                LocalThemeScope localThemeScope = this.f116116a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f116117b);
                final RateTermsAndConditionsActivity rateTermsAndConditionsActivity = this.f116117b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RateTermsAndConditionsActivity.c.a.c(rateTermsAndConditionsActivity);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C12784m0.d(localThemeScope, null, strC, (Function0) objB, strC2, true, composer, LocalThemeScope.f15770g | 196608, 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(RateTermsAndConditionsActivity rateTermsAndConditionsActivity) {
                rateTermsAndConditionsActivity.finish();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RateTermsAndConditionsActivity f116118a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116119b;

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(RateTermsAndConditionsActivity rateTermsAndConditionsActivity) {
                rateTermsAndConditionsActivity.setResult(-1);
                rateTermsAndConditionsActivity.finish();
                return Unit.f142422a;
            }

            b(RateTermsAndConditionsActivity rateTermsAndConditionsActivity, LocalThemeScope localThemeScope) {
                this.f116118a = rateTermsAndConditionsActivity;
                this.f116119b = localThemeScope;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-78833402, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity.RateTermsAndConditionsScreen.<anonymous>.<anonymous> (RateTermsAndConditionsActivity.kt:62)");
                }
                RateTermsAndConditionsActivity rateTermsAndConditionsActivity = this.f116118a;
                LocalThemeScope localThemeScope = this.f116119b;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f116118a);
                final RateTermsAndConditionsActivity rateTermsAndConditionsActivity2 = this.f116118a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.h0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RateTermsAndConditionsActivity.c.b.c(rateTermsAndConditionsActivity2);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                rateTermsAndConditionsActivity.s1(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f15770g, 1);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity$c$c, reason: collision with other inner class name */
        static final class C1867c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116120a;

            C1867c(LocalThemeScope localThemeScope) {
                this.f116120a = localThemeScope;
            }

            public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) throws Resources.NotFoundException {
                Intrinsics.j(paddingValues, "paddingValues");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(paddingValues) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1920598274, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity.RateTermsAndConditionsScreen.<anonymous>.<anonymous> (RateTermsAndConditionsActivity.kt:68)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues);
                LocalThemeScope localThemeScope = this.f116120a;
                MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.h()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyG, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C5664j c5664j = C5664j.f48612a;
                C12784m0.h(localThemeScope, null, composer, LocalThemeScope.f15770g, 1);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) throws Resources.NotFoundException {
                a(interfaceC14794C, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(Modifier modifier, RateTermsAndConditionsActivity rateTermsAndConditionsActivity) {
            this.f116114a = modifier;
            this.f116115b = rateTermsAndConditionsActivity;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1501956544, i11, -1, "com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity.RateTermsAndConditionsScreen.<anonymous> (RateTermsAndConditionsActivity.kt:51)");
            }
            C17921a1.a(this.f116114a, null, ComposableLambdaKt.c(757961541, true, new a(AdsTheme, this.f116115b), composer, 54), ComposableLambdaKt.c(-78833402, true, new b(this.f116115b, AdsTheme), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1920598274, true, new C1867c(AdsTheme), composer, 54), composer, 3456, 12582912, 131058);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RateTermsAndConditionsActivity f116122a;

            a(RateTermsAndConditionsActivity rateTermsAndConditionsActivity) {
                this.f116122a = rateTermsAndConditionsActivity;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-232693751, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity.onCreate.<anonymous>.<anonymous> (RateTermsAndConditionsActivity.kt:43)");
                }
                this.f116122a.u1(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer, 0, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2106484602, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity.onCreate.<anonymous> (RateTermsAndConditionsActivity.kt:42)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-232693751, true, new a(RateTermsAndConditionsActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v1(RateTermsAndConditionsActivity rateTermsAndConditionsActivity, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        rateTermsAndConditionsActivity.u1(modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s1(final Ji.LocalThemeScope r15, androidx.compose.ui.Modifier r16, final kotlin.jvm.functions.Function0<kotlin.Unit> r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity.s1(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t1(RateTermsAndConditionsActivity rateTermsAndConditionsActivity, LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        rateTermsAndConditionsActivity.s1(localThemeScope, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(25574385);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(25574385, i12, -1, "com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity.RateTermsAndConditionsScreen (RateTermsAndConditionsActivity.kt:49)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(1501956544, true, new c(modifier, this), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.reviews.ux.rateandreview.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RateTermsAndConditionsActivity.v1(this.f116281a, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.meijer.mobile.reviews.ux.rateandreview.Hilt_RateTermsAndConditionsActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(2106484602, true, new d()), 1, null);
    }
}
