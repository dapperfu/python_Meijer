package com.meijer.mobile.mperks.ux.claim.autoClaim;

import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Ki.T;
import P0.e;
import V2.CreationExtras;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
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
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.ComponentActivity;
import androidx.view.F;
import androidx.view.I;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import co.AbstractC6537i;
import co.AutoClaimReward;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity;
import com.meijer.mobile.mperks.ux.j0;
import d0.C13590y;
import e.C13737e;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ki.q1;
import ko.AbstractC15303a;
import ko.ClaimTabState;
import ko.z;
import kotlin.C17987a1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p1.C16335d;
import p1.C16338g;
import qi.C16671b;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJA\u0010\u0011\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0019\u0010\u0017J%\u0010\u001b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b!\u0010\tJ\u001d\u0010\"\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\"\u0010\tJ-\u0010&\u001a\u00020\u0007*\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b&\u0010'J%\u0010)\u001a\u00020\u0007*\u00020\u00042\u0006\u0010(\u001a\u00020#2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00064²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00103\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/mperks/ux/claim/autoClaim/AutoClaimDetailsActivity;", "Lcom/meijer/mobile/mperks/ux/MperksFeatureActivity;", "<init>", "()V", "LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Q1", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lco/a;", "autoClaimReward", "", "hasAutoClaimEnrolled", "Lkotlin/Function1;", "Lco/i;", "onResourceAction", "W1", "(LKi/M;Lco/a;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "rewardName", "isConfirmingSwitch", "U1", "(LKi/M;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "description", "K1", "termsAndConditionsText", "b2", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "O1", "M1", "", "imgResource", "stringResource", "I1", "(LKi/M;IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "index", "S1", "(LKi/M;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lko/z;", "D", "Lkotlin/Lazy;", "g2", "()Lko/z;", "claimTabViewModel", "Lko/d;", "claimTabViewState", "lastAction", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AutoClaimDetailsActivity extends Hilt_AutoClaimDetailsActivity {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy claimTabViewModel = new e0(Reflection.b(z.class), new g(this), new f(this), new h(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f114839a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114840b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f114841c;

        a(int i10, LocalThemeScope localThemeScope, int i11) {
            this.f114839a = i10;
            this.f114840b = localThemeScope;
            this.f114841c = i11;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(456442651, i10, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.AutoClaimControlCard.<anonymous> (AutoClaimDetailsActivity.kt:359)");
            }
            e.Companion companion = P0.e.INSTANCE;
            e.b bVarG = companion.g();
            C5800d.f fVarB = C5800d.f48779a.b();
            int i11 = this.f114839a;
            LocalThemeScope localThemeScope = this.f114840b;
            int i12 = this.f114841c;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(fVarB, bVarG, composer, 54);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            float f10 = 12;
            float f11 = 8;
            C13590y.a(C16335d.c(i11, composer, 0), null, J.v(D.m(D.k(companion2, H1.h.p(f10), 0.0f, 2, null), 0.0f, H1.h.p(f11), 0.0f, 0.0f, 13, null), H1.h.p(80)), null, InterfaceC5926k.INSTANCE.a(), 0.0f, null, composer, 25008, 104);
            C14890K.a(J.i(companion2, H1.h.p(16)), composer, 6);
            si.j.h(localThemeScope, new q1.Label(c14903g.c(D.m(D.k(companion2, H1.h.p(f10), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, H1.h.p(f11), 7, null), companion.g()), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 374, null), C16338g.c(i12, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114842a;

        b(LocalThemeScope localThemeScope) {
            this.f114842a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1433101299, i10, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.AutoClaimRewardDetailTopBar.<anonymous> (AutoClaimDetailsActivity.kt:145)");
            }
            LocalThemeScope localThemeScope = this.f114842a;
            si.j.h(localThemeScope, new q1.Label(null, this.f114842a.getAdsColors().getAdsColorInverse(), null, F1.j.h(F1.j.INSTANCE.d()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 373, null), C16338g.c(j0.f115139c, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114843a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoClaimDetailsActivity f114844b;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(AutoClaimDetailsActivity autoClaimDetailsActivity) {
            autoClaimDetailsActivity.setResult(-1);
            autoClaimDetailsActivity.finish();
            return Unit.f143329a;
        }

        c(LocalThemeScope localThemeScope, AutoClaimDetailsActivity autoClaimDetailsActivity) {
            this.f114843a = localThemeScope;
            this.f114844b = autoClaimDetailsActivity;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(959865649, i10, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.AutoClaimRewardDetailTopBar.<anonymous> (AutoClaimDetailsActivity.kt:156)");
            }
            LocalThemeScope localThemeScope = this.f114843a;
            C.f.d dVar = C.f.d.f17051e;
            T adsColorInverse = localThemeScope.getAdsColors().getAdsColorInverse();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f114844b);
            final AutoClaimDetailsActivity autoClaimDetailsActivity = this.f114844b;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.mperks.ux.claim.autoClaim.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AutoClaimDetailsActivity.c.c(autoClaimDetailsActivity);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C16671b.b(localThemeScope, new q1.h.DrawableIcon(dVar, null, null, null, 0.0f, adsColorInverse, D.m(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), H1.h.p(16), 0.0f, 0.0f, 0.0f, 14, null), 30, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114845a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f114846b;

        d(LocalThemeScope localThemeScope, int i10) {
            this.f114845a = localThemeScope;
            this.f114846b = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1564122117, i10, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.AutoClaimStepsCards.<anonymous> (AutoClaimDetailsActivity.kt:404)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 12;
            Modifier modifierJ = D.j(J.h(J.D(companion, null, false, 3, null), 0.0f, 1, null), H1.h.p(16), H1.h.p(f10));
            e.c cVarI = P0.e.INSTANCE.i();
            LocalThemeScope localThemeScope = this.f114845a;
            int i11 = this.f114846b;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAcresGradientBlueStart(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getThree(), null, 381, null);
            String strValueOf = String.valueOf(i11);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strValueOf, null, composer, i12 | (i13 << 3), 4);
            C14890K.a(J.z(companion, H1.h.p(f10)), composer, 6);
            si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), C16338g.c(i11 != 1 ? i11 != 2 ? i11 != 3 ? j0.f115179m : j0.f115205t : j0.f115199r : j0.f115175l, composer, 0), null, composer, i12 | (i13 << 3), 4);
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
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoClaimReward f114848b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AutoClaimDetailsActivity f114849a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AutoClaimReward f114850b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity$e$a$a, reason: collision with other inner class name */
            static final class C1814a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AutoClaimDetailsActivity f114851a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f114852b;

                C1814a(AutoClaimDetailsActivity autoClaimDetailsActivity, LocalThemeScope localThemeScope) {
                    this.f114851a = autoClaimDetailsActivity;
                    this.f114852b = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2137204631, i10, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AutoClaimDetailsActivity.kt:98)");
                    }
                    this.f114851a.Q1(this.f114852b, null, composer, LocalThemeScope.f17314g, 1);
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
            static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AutoClaimReward f114853a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AutoClaimDetailsActivity f114854b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f114855c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<ClaimTabState> f114856d;

                b(AutoClaimReward autoClaimReward, AutoClaimDetailsActivity autoClaimDetailsActivity, LocalThemeScope localThemeScope, z1<ClaimTabState> z1Var) {
                    this.f114853a = autoClaimReward;
                    this.f114854b = autoClaimDetailsActivity;
                    this.f114855c = localThemeScope;
                    this.f114856d = z1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(AutoClaimDetailsActivity autoClaimDetailsActivity, AbstractC6537i action) {
                    Intrinsics.j(action, "action");
                    if (action instanceof AbstractC6537i.AutoClaimEnroll) {
                        AbstractC6537i.AutoClaimEnroll autoClaimEnroll = (AbstractC6537i.AutoClaimEnroll) action;
                        autoClaimDetailsActivity.g2().E(new AbstractC15303a.AutoClaimAction(autoClaimEnroll.getEnroll(), autoClaimEnroll.getAutoClaimType(), autoClaimEnroll.getAutoClaimAmount()));
                    }
                    return Unit.f143329a;
                }

                public final void b(InterfaceC14882C padding, Composer composer, int i10) {
                    Object next;
                    boolean z10;
                    Intrinsics.j(padding, "padding");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(padding) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-947233218, i10, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AutoClaimDetailsActivity.kt:101)");
                    }
                    List<AutoClaimReward> listC = a.c(this.f114856d).c();
                    AutoClaimReward autoClaimReward = this.f114853a;
                    Iterator<T> it = listC.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        AutoClaimReward autoClaimReward2 = (AutoClaimReward) next;
                        if (Intrinsics.e(autoClaimReward2.getAutoClaimType(), autoClaimReward.getAutoClaimType()) && autoClaimReward2.getAutoClaimAmount() == autoClaimReward.getAutoClaimAmount()) {
                            break;
                        }
                    }
                    AutoClaimReward autoClaimReward3 = (AutoClaimReward) next;
                    if (autoClaimReward3 == null) {
                        autoClaimReward3 = this.f114853a;
                    }
                    AutoClaimReward autoClaimReward4 = autoClaimReward3;
                    List<AutoClaimReward> listC2 = a.c(this.f114856d).c();
                    if ((listC2 instanceof Collection) && listC2.isEmpty()) {
                        z10 = false;
                    } else {
                        Iterator<T> it2 = listC2.iterator();
                        while (it2.hasNext()) {
                            if (((AutoClaimReward) it2.next()).getIsSelected()) {
                                z10 = true;
                                break;
                            }
                        }
                        z10 = false;
                    }
                    Modifier modifierH = D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), padding);
                    AutoClaimDetailsActivity autoClaimDetailsActivity = this.f114854b;
                    LocalThemeScope localThemeScope = this.f114855c;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f114854b);
                    final AutoClaimDetailsActivity autoClaimDetailsActivity2 = this.f114854b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.mperks.ux.claim.autoClaim.v
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AutoClaimDetailsActivity.e.a.b.c(autoClaimDetailsActivity2, (AbstractC6537i) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    autoClaimDetailsActivity.W1(localThemeScope, autoClaimReward4, z10, modifierH, (Function1) objB, composer, LocalThemeScope.f17314g, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    b(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(AutoClaimDetailsActivity autoClaimDetailsActivity, AutoClaimReward autoClaimReward) {
                this.f114849a = autoClaimDetailsActivity;
                this.f114850b = autoClaimReward;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(1084188220, i11, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.onCreate.<anonymous>.<anonymous> (AutoClaimDetailsActivity.kt:94)");
                }
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(2137204631, true, new C1814a(this.f114849a, AdsTheme), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-947233218, true, new b(this.f114850b, this.f114849a, AdsTheme, o1.b(this.f114849a.g2().C(), null, composer, 0, 1)), composer, 54), composer, 384, 12582912, 131066);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ClaimTabState c(z1<ClaimTabState> z1Var) {
                return z1Var.getValue();
            }
        }

        e(AutoClaimReward autoClaimReward) {
            this.f114848b = autoClaimReward;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1007903893, i10, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.onCreate.<anonymous> (AutoClaimDetailsActivity.kt:93)");
            }
            K.b(null, ComposableLambdaKt.c(1084188220, true, new a(AutoClaimDetailsActivity.this, this.f114848b), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114857f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f114857f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f114857f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114858f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f114858f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f114858f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f114859f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114860g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f114859f = function0;
            this.f114860g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f114859f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f114860g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J1(AutoClaimDetailsActivity autoClaimDetailsActivity, LocalThemeScope localThemeScope, int i10, int i11, Modifier modifier, int i12, int i13, Composer composer, int i14) {
        autoClaimDetailsActivity.I1(localThemeScope, i10, i11, modifier, composer, J0.a(i12 | 1), i13);
        return Unit.f143329a;
    }

    private final void K1(final LocalThemeScope localThemeScope, final String str, final boolean z10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(675832689);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(675832689, i11, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.AutoClaimDescription (AutoClaimDetailsActivity.kt:460)");
            }
            float f10 = 32;
            q1.Label label = new q1.Label(D.m(Modifier.INSTANCE, H1.h.p(f10), H1.h.p(12), H1.h.p(f10), 0.0f, 8, null), localThemeScope.getAdsColors().getAdsColorText01(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 372, null);
            composerStartRestartGroup.startReplaceGroup(935167895);
            String strC = z10 ? C16338g.c(j0.f115127Y1, composerStartRestartGroup, 0) : StringsKt.C1(str).toString();
            composerStartRestartGroup.P();
            si.j.h(localThemeScope, label, strC, null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.claim.autoClaim.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutoClaimDetailsActivity.L1(this.f114945a, localThemeScope, str, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(AutoClaimDetailsActivity autoClaimDetailsActivity, LocalThemeScope localThemeScope, String str, boolean z10, int i10, Composer composer, int i11) {
        autoClaimDetailsActivity.K1(localThemeScope, str, z10, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N1(AutoClaimDetailsActivity autoClaimDetailsActivity, LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        autoClaimDetailsActivity.M1(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P1(AutoClaimDetailsActivity autoClaimDetailsActivity, LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        autoClaimDetailsActivity.O1(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q1(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r4 = r21
            r0 = 1091712311(0x41123537, float:9.137992)
            r3 = r20
            androidx.compose.runtime.Composer r14 = r3.startRestartGroup(r0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r22 & r3
            if (r3 == 0) goto L18
            r3 = r4 | 6
            goto L31
        L18:
            r3 = r4 & 6
            if (r3 != 0) goto L30
            r3 = r4 & 8
            if (r3 != 0) goto L25
            boolean r3 = r14.V(r2)
            goto L29
        L25:
            boolean r3 = r14.D(r2)
        L29:
            if (r3 == 0) goto L2d
            r3 = 4
            goto L2e
        L2d:
            r3 = 2
        L2e:
            r3 = r3 | r4
            goto L31
        L30:
            r3 = r4
        L31:
            r5 = r22 & 1
            if (r5 == 0) goto L3a
            r3 = r3 | 48
        L37:
            r6 = r19
            goto L4c
        L3a:
            r6 = r4 & 48
            if (r6 != 0) goto L37
            r6 = r19
            boolean r7 = r14.V(r6)
            if (r7 == 0) goto L49
            r7 = 32
            goto L4b
        L49:
            r7 = 16
        L4b:
            r3 = r3 | r7
        L4c:
            r7 = r22 & 2
            if (r7 == 0) goto L53
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L63
        L53:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L63
            boolean r7 = r14.D(r1)
            if (r7 == 0) goto L60
            r7 = 256(0x100, float:3.59E-43)
            goto L62
        L60:
            r7 = 128(0x80, float:1.8E-43)
        L62:
            r3 = r3 | r7
        L63:
            r7 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L75
            boolean r7 = r14.j()
            if (r7 != 0) goto L70
            goto L75
        L70:
            r14.K()
        L73:
            r3 = r6
            goto Lc4
        L75:
            if (r5 == 0) goto L7a
            androidx.compose.ui.Modifier$a r5 = androidx.compose.ui.Modifier.INSTANCE
            r6 = r5
        L7a:
            boolean r5 = androidx.compose.runtime.ComposerKt.M()
            if (r5 == 0) goto L86
            r5 = -1
            java.lang.String r7 = "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.AutoClaimRewardDetailTopBar (AutoClaimDetailsActivity.kt:141)"
            androidx.compose.runtime.ComposerKt.U(r0, r3, r5, r7)
        L86:
            Ki.z r0 = r2.getAdsColors()
            Ki.T r0 = r0.getAdsColorBrandPrimary()
            long r9 = r0.getColor()
            com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity$b r0 = new com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity$b
            r0.<init>(r2)
            r5 = 1433101299(0x556b63f3, float:1.6175907E13)
            r7 = 1
            r8 = 54
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r5, r7, r0, r14, r8)
            com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity$c r0 = new com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity$c
            r0.<init>(r2, r1)
            r11 = 959865649(0x39366331, float:1.7393824E-4)
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r11, r7, r0, r14, r8)
            r0 = r3 & 112(0x70, float:1.57E-43)
            r15 = r0 | 390(0x186, float:5.47E-43)
            r16 = 104(0x68, float:1.46E-43)
            r8 = 0
            r11 = 0
            r13 = 0
            kotlin.C18009i.d(r5, r6, r7, r8, r9, r11, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.M()
            if (r0 == 0) goto L73
            androidx.compose.runtime.ComposerKt.T()
            goto L73
        Lc4:
            androidx.compose.runtime.T0 r6 = r14.l()
            if (r6 == 0) goto Ld4
            com.meijer.mobile.mperks.ux.claim.autoClaim.l r0 = new com.meijer.mobile.mperks.ux.claim.autoClaim.l
            r5 = r22
            r0.<init>()
            r6.a(r0)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.Q1(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R1(AutoClaimDetailsActivity autoClaimDetailsActivity, LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        autoClaimDetailsActivity.Q1(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T1(AutoClaimDetailsActivity autoClaimDetailsActivity, LocalThemeScope localThemeScope, int i10, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        autoClaimDetailsActivity.S1(localThemeScope, i10, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    private final void U1(final LocalThemeScope localThemeScope, final String str, final boolean z10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1090857613);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1090857613, i11, -1, "com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.AutoClaimTitle (AutoClaimDetailsActivity.kt:440)");
            }
            float f10 = 64;
            q1.Label label = new q1.Label(D.m(Modifier.INSTANCE, H1.h.p(f10), 0.0f, H1.h.p(f10), 0.0f, 10, null), localThemeScope.getAdsColors().getAdsColorText01(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getValues().getTwo(), null, 372, null);
            composerStartRestartGroup.startReplaceGroup(342162988);
            String strC = z10 ? C16338g.c(j0.f115130Z1, composerStartRestartGroup, 0) : StringsKt.C1(str).toString();
            composerStartRestartGroup.P();
            si.j.h(localThemeScope, label, strC, null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.claim.autoClaim.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutoClaimDetailsActivity.V1(this.f114934a, localThemeScope, str, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(AutoClaimDetailsActivity autoClaimDetailsActivity, LocalThemeScope localThemeScope, String str, boolean z10, int i10, Composer composer, int i11) {
        autoClaimDetailsActivity.U1(localThemeScope, str, z10, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W1(final Ki.LocalThemeScope r50, final co.AutoClaimReward r51, final boolean r52, androidx.compose.ui.Modifier r53, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.W1(Ki.M, co.a, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(AutoClaimDetailsActivity autoClaimDetailsActivity, LocalThemeScope localThemeScope, AutoClaimReward autoClaimReward, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        autoClaimDetailsActivity.W1(localThemeScope, autoClaimReward, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b2(final Ki.LocalThemeScope r39, final java.lang.String r40, androidx.compose.ui.Modifier r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.b2(Ki.M, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(AutoClaimDetailsActivity autoClaimDetailsActivity, LocalThemeScope localThemeScope, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        autoClaimDetailsActivity.b2(localThemeScope, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z g2() {
        return (z) this.claimTabViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h2(AutoClaimDetailsActivity autoClaimDetailsActivity, F addCallback) {
        Intrinsics.j(addCallback, "$this$addCallback");
        autoClaimDetailsActivity.setResult(-1);
        autoClaimDetailsActivity.finish();
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1(final Ki.LocalThemeScope r20, final int r21, final int r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.I1(Ki.M, int, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M1(final Ki.LocalThemeScope r32, androidx.compose.ui.Modifier r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.M1(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118 A[LOOP:0: B:63:0x0115->B:65:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O1(final Ki.LocalThemeScope r15, androidx.compose.ui.Modifier r16, androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.O1(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S1(final Ki.LocalThemeScope r20, final int r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity.S1(Ki.M, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
        a2(interfaceC5872l0, z10);
        return Unit.f143329a;
    }

    private static final boolean Z1(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void a2(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object obj;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.EXTRA_AUTO_CLAIM", AutoClaimReward.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.EXTRA_AUTO_CLAIM");
            if (!(parcelableExtra instanceof AutoClaimReward)) {
                parcelableExtra = null;
            }
            obj = (AutoClaimReward) parcelableExtra;
        }
        Intrinsics.g(obj);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1007903893, true, new e((AutoClaimReward) obj)), 1, null);
        I.b(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.meijer.mobile.mperks.ux.claim.autoClaim.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AutoClaimDetailsActivity.h2(this.f114908a, (F) obj2);
            }
        }, 3, null);
    }
}
