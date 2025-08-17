package Oi;

import Ji.LocalThemeScope;
import Oi.z;
import P0.e;
import V0.r1;
import X0.Stroke;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13457y;
import ii.C14730a;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.C14924a0;
import ji.R0;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mi.C15634c;
import ni.C15860s0;
import ni.C15866v0;
import ni.E0;
import ni.P0;
import p1.C16190d;
import pi.C16307b;
import si.C16977b;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u001a!\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a!\u0010\u0007\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a!\u0010\b\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b\b\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b\t\u0010\u0005\u001a!\u0010\n\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b\n\u0010\u0005\u001a!\u0010\u000b\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b\u000b\u0010\u0005\u001a!\u0010\r\u001a\u00020\u0002*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b\r\u0010\u0005¨\u0006\u000e"}, d2 = {"LJi/M;", "Lkotlin/Function0;", "", "onDismissRequest", "w", "(LJi/M;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "s", "k", "q", "i", "o", "m", "onConfirm", "u", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23924a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f23925b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Oi.z$a$a, reason: collision with other inner class name */
        static final class C0414a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23926a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0 f23927b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f23928c;

            C0414a(LocalThemeScope localThemeScope, R0 r02, Function0<Unit> function0) {
                this.f23926a = localThemeScope;
                this.f23927b = r02;
                this.f23928c = function0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1915843549, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalSuperSimple.<anonymous>.<anonymous> (ModalShowcase.kt:492)");
                }
                LocalThemeScope localThemeScope = this.f23926a;
                R0 r02 = this.f23927b;
                Function0<Unit> function0 = this.f23928c;
                Modifier.Companion companion = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
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
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion, 1.0f, false, 2, null), composer, 0);
                ni.P p10 = ni.P.f151555a;
                String contentDescription = r02.getButtons().getDismissIcon().getContentDescription();
                if (contentDescription == null) {
                    contentDescription = "";
                }
                P0.i(localThemeScope, p10, function0, r02.getButtons().getDismissIcon().getIcon(), contentDescription, null, false, false, 0L, composer, 48, 240);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer, 0);
                composer.v();
                C5658d.f fVarO = c5658d.o(localThemeScope.getAdsSpacing().getFive().getDp());
                e.b bVarG = companion2.g();
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), 2, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(fVarO, bVarG, composer, 48);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM2);
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
                D1.c(composerA3, measurePolicyA2, companion3.e());
                D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                ri.j.h(localThemeScope, r02.getLabels().getHeading(), "Heading Not Exceeding Two Lines", null, composer, 384, 4);
                ri.j.h(localThemeScope, r02.getLabels().getBody(), "This should be a full sentence or two.  Blah blah this is more stuff.  Let's hope it wraps enough. ", null, composer, 384, 4);
                composer.v();
                composer.v();
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f23924a = localThemeScope;
            this.f23925b = function0;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2008354154, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalSuperSimple.<anonymous> (ModalShowcase.kt:488)");
            }
            LocalThemeScope localThemeScope = this.f23924a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f23925b;
            C16977b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(1915843549, true, new C0414a(this.f23924a, Assemble, function0), composer, 54), composer, 24576, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23929a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f23930b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23931a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0 f23932b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f23933c;

            a(LocalThemeScope localThemeScope, R0 r02, Function0<Unit> function0) {
                this.f23931a = localThemeScope;
                this.f23932b = r02;
                this.f23933c = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d() {
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e() {
                return Unit.f142422a;
            }

            public final void c(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1536314843, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithBullets.<anonymous>.<anonymous> (ModalShowcase.kt:321)");
                }
                LocalThemeScope localThemeScope = this.f23931a;
                R0 r02 = this.f23932b;
                Function0<Unit> function0 = this.f23933c;
                Modifier.Companion companion = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
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
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion, 1.0f, false, 2, null), composer, 0);
                ni.P p10 = ni.P.f151555a;
                String contentDescription = r02.getButtons().getDismissIcon().getContentDescription();
                if (contentDescription == null) {
                    contentDescription = "";
                }
                P0.i(localThemeScope, p10, function0, r02.getButtons().getDismissIcon().getIcon(), contentDescription, null, false, false, 0L, composer, 48, 240);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer, 0);
                composer.v();
                C5658d.f fVarO = c5658d.o(localThemeScope.getAdsSpacing().getFive().getDp());
                e.b bVarG = companion2.g();
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 2, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(fVarO, bVarG, composer, 48);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM2);
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
                D1.c(composerA3, measurePolicyA2, companion3.e());
                D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                ri.j.h(localThemeScope, r02.getLabels().getHeading(), "Heading Not Exceeding Two Lines", null, composer, 384, 4);
                ri.j.h(localThemeScope, r02.getLabels().getBody(), "This should be a full sentence or two.  Blah blah this is more stuff.  Let's hope it wraps enough. ", null, composer, 384, 4);
                composer.v();
                C5658d.f fVarO2 = c5658d.o(localThemeScope.getAdsSpacing().getFour().getDp());
                e.b bVarG2 = companion2.g();
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), 2, null);
                MeasurePolicy measurePolicyA3 = C5665k.a(fVarO2, bVarG2, composer, 48);
                int iA4 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierM3);
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
                D1.c(composerA4, measurePolicyA3, companion3.e());
                D1.c(composerA4, interfaceC5742sR4, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion3.f());
                C15634c.b(localThemeScope, r02.getLabels().getBody(), "This bullet point takes up two lines because it is extra informative.", 0.0f, 0.0f, 0L, composer, 384, 28);
                C15634c.b(localThemeScope, r02.getLabels().getBody(), "This bullet takes up two lines too (see how it wraps so awesomely).", 0.0f, 0.0f, 0L, composer, 384, 28);
                composer.v();
                C5658d.f fVarO3 = c5658d.o(localThemeScope.getAdsSpacing().getFour().getDp());
                Modifier modifierL = androidx.compose.foundation.layout.D.l(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
                MeasurePolicy measurePolicyA4 = C5665k.a(fVarO3, companion2.k(), composer, 0);
                int iA5 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR5 = composer.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierL);
                Function0<InterfaceC5811g> function0A5 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A5);
                } else {
                    composer.s();
                }
                Composer composerA5 = D1.a(composer);
                D1.c(composerA5, measurePolicyA4, companion3.e());
                D1.c(composerA5, interfaceC5742sR5, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                D1.c(composerA5, modifierE5, companion3.f());
                C15860s0 c15860s0 = C15860s0.f151792a;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objB == companion4.a()) {
                    objB = new Function0() { // from class: Oi.A
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.b.a.d();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                P0.k(localThemeScope, c15860s0, "Confirm", (Function0) objB, null, "Confirm", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                C15866v0 c15866v0 = C15866v0.f151806a;
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion4.a()) {
                    objB2 = new Function0() { // from class: Oi.B
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.b.a.e();
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                P0.k(localThemeScope, c15866v0, "Cancel", (Function0) objB2, null, "Cancel", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f23929a = localThemeScope;
            this.f23930b = function0;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1628825448, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithBullets.<anonymous> (ModalShowcase.kt:317)");
            }
            LocalThemeScope localThemeScope = this.f23929a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f23930b;
            C16977b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(1536314843, true, new a(this.f23929a, Assemble, function0), composer, 54), composer, 24576, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23934a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f23935b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23936a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0 f23937b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f23938c;

            a(LocalThemeScope localThemeScope, R0 r02, Function0<Unit> function0) {
                this.f23936a = localThemeScope;
                this.f23937b = r02;
                this.f23938c = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e() {
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f() {
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(LocalThemeScope localThemeScope, X0.f drawBehind) {
                Intrinsics.j(drawBehind, "$this$drawBehind");
                long color = localThemeScope.getAdsColors().getAdsColorDanger().getColor();
                Stroke stroke = new Stroke(2.0f, 0.0f, 0, 0, r1.INSTANCE.a(new float[]{16.0f, 16.0f}, 0.0f), 14, null);
                float fI1 = drawBehind.I1(localThemeScope.getAdsCornerRadii().getRadius04().getDp());
                X0.f.U0(drawBehind, color, 0L, 0L, U0.a.b((Float.floatToRawIntBits(fI1) << 32) | (Float.floatToRawIntBits(fI1) & 4294967295L)), stroke, 0.0f, null, 0, 230, null);
                return Unit.f142422a;
            }

            public final void d(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1562034998, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithCustomComponent.<anonymous>.<anonymous> (ModalShowcase.kt:616)");
                }
                final LocalThemeScope localThemeScope = this.f23936a;
                R0 r02 = this.f23937b;
                Function0<Unit> function0 = this.f23938c;
                Modifier.Companion companion = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
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
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion, 1.0f, false, 2, null), composer, 0);
                ni.P p10 = ni.P.f151555a;
                String contentDescription = r02.getButtons().getDismissIcon().getContentDescription();
                if (contentDescription == null) {
                    contentDescription = "";
                }
                P0.i(localThemeScope, p10, function0, r02.getButtons().getDismissIcon().getIcon(), contentDescription, null, false, false, 0L, composer, 48, 240);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer, 0);
                composer.v();
                C5658d.f fVarO = c5658d.o(localThemeScope.getAdsSpacing().getFive().getDp());
                e.b bVarG = companion2.g();
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), 2, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(fVarO, bVarG, composer, 48);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM2);
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
                D1.c(composerA3, measurePolicyA2, companion3.e());
                D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                ri.j.h(localThemeScope, r02.getLabels().getHeading(), "Heading Not Exceeding Two Lines", null, composer, 384, 4);
                ri.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null), StringsKt.M("This should be a full sentence or two.  Blah blah this is more stuff.  Let's hope it wraps enough. ", 3), null, composer, 0, 4);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(localThemeScope);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Oi.C
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return z.c.a.g(localThemeScope, (X0.f) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierB = androidx.compose.ui.draw.b.b(companion, (Function1) objB);
                MeasurePolicy measurePolicyG = C5662h.g(companion2.e(), false);
                int iA4 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierB);
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
                D1.c(composerA4, measurePolicyG, companion3.e());
                D1.c(composerA4, interfaceC5742sR4, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion3.f());
                C5664j c5664j = C5664j.f48612a;
                Modifier modifierI = androidx.compose.foundation.layout.D.i(q1.h.c.f140075a.getModifier(), localThemeScope.getAdsSpacing().getThree().getDp());
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.b(), companion2.l(), composer, 6);
                int iA5 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR5 = composer.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierI);
                Function0<InterfaceC5811g> function0A5 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A5);
                } else {
                    composer.s();
                }
                Composer composerA5 = D1.a(composer);
                D1.c(composerA5, measurePolicyB2, companion3.e());
                D1.c(composerA5, interfaceC5742sR5, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                D1.c(composerA5, modifierE5, companion3.f());
                ri.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), r02.getLabels().getHeading().getModifier().then(androidx.compose.foundation.layout.D.k(companion, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), "Replace this “Custom Content” Frame Instance with your own from your local file.", null, composer, 384, 4);
                composer.v();
                composer.v();
                composer.v();
                C5658d.f fVarO2 = c5658d.o(localThemeScope.getAdsSpacing().getFour().getDp());
                Modifier modifierL = androidx.compose.foundation.layout.D.l(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
                MeasurePolicy measurePolicyA3 = C5665k.a(fVarO2, companion2.k(), composer, 0);
                int iA6 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR6 = composer.r();
                Modifier modifierE6 = androidx.compose.ui.b.e(composer, modifierL);
                Function0<InterfaceC5811g> function0A6 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A6);
                } else {
                    composer.s();
                }
                Composer composerA6 = D1.a(composer);
                D1.c(composerA6, measurePolicyA3, companion3.e());
                D1.c(composerA6, interfaceC5742sR6, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B6 = companion3.b();
                if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                    composerA6.t(Integer.valueOf(iA6));
                    composerA6.n(Integer.valueOf(iA6), function2B6);
                }
                D1.c(composerA6, modifierE6, companion3.f());
                C15860s0 c15860s0 = C15860s0.f151792a;
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objB2 == companion4.a()) {
                    objB2 = new Function0() { // from class: Oi.D
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.c.a.e();
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                P0.k(localThemeScope, c15860s0, "Confirm", (Function0) objB2, null, "Confirm", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                C15866v0 c15866v0 = C15866v0.f151806a;
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                if (objB3 == companion4.a()) {
                    objB3 = new Function0() { // from class: Oi.E
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.c.a.f();
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                P0.k(localThemeScope, c15866v0, "Cancel", (Function0) objB3, null, "Cancel", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f23934a = localThemeScope;
            this.f23935b = function0;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1079607357, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithCustomComponent.<anonymous> (ModalShowcase.kt:612)");
            }
            LocalThemeScope localThemeScope = this.f23934a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f23935b;
            C16977b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(1562034998, true, new a(this.f23934a, Assemble, function0), composer, 54), composer, 24576, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23939a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f23940b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23941a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0 f23942b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f23943c;

            a(LocalThemeScope localThemeScope, R0 r02, Function0<Unit> function0) {
                this.f23941a = localThemeScope;
                this.f23942b = r02;
                this.f23943c = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d() {
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e() {
                return Unit.f142422a;
            }

            public final void c(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1029429208, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithIllustration.<anonymous>.<anonymous> (ModalShowcase.kt:538)");
                }
                e.Companion companion = P0.e.INSTANCE;
                e.b bVarG = companion.g();
                LocalThemeScope localThemeScope = this.f23941a;
                R0 r02 = this.f23942b;
                Function0<Unit> function0 = this.f23943c;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), bVarG, composer, 48);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
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
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
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
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion2, 1.0f, false, 2, null), composer, 0);
                ni.P p10 = ni.P.f151555a;
                String contentDescription = r02.getButtons().getDismissIcon().getContentDescription();
                if (contentDescription == null) {
                    contentDescription = "";
                }
                P0.i(localThemeScope, p10, function0, r02.getButtons().getDismissIcon().getIcon(), contentDescription, null, false, false, 0L, composer, 48, 240);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer, 0);
                composer.v();
                C5658d.f fVarO = c5658d.o(localThemeScope.getAdsSpacing().getFive().getDp());
                e.b bVarG2 = companion.g();
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion2, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), 2, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(fVarO, bVarG2, composer, 48);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM2);
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
                D1.c(composerA3, measurePolicyA2, companion3.e());
                D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                C13457y.a(C16190d.c(C14730a.f137878a, composer, 0), "Placeholder Image", androidx.compose.foundation.layout.J.v(companion2, H1.h.p(96)), null, InterfaceC5784k.INSTANCE.a(), 0.0f, null, composer, 25008, 104);
                ri.j.h(localThemeScope, r02.getLabels().getHeading(), "Heading Not Exceeding Two Lines", null, composer, 384, 4);
                ri.j.h(localThemeScope, r02.getLabels().getBody(), "This should be a full sentence or two.  Blah blah this is more stuff.  Let's hope it wraps enough. ", null, composer, 384, 4);
                composer.v();
                C5658d.f fVarO2 = c5658d.o(localThemeScope.getAdsSpacing().getFour().getDp());
                Modifier modifierL = androidx.compose.foundation.layout.D.l(companion2, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
                MeasurePolicy measurePolicyA3 = C5665k.a(fVarO2, companion.k(), composer, 0);
                int iA4 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierL);
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
                D1.c(composerA4, measurePolicyA3, companion3.e());
                D1.c(composerA4, interfaceC5742sR4, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion3.f());
                C15860s0 c15860s0 = C15860s0.f151792a;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objB == companion4.a()) {
                    objB = new Function0() { // from class: Oi.F
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.d.a.d();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                P0.k(localThemeScope, c15860s0, "Confirm", (Function0) objB, null, "Confirm", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                C15866v0 c15866v0 = C15866v0.f151806a;
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion4.a()) {
                    objB2 = new Function0() { // from class: Oi.G
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.d.a.e();
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                P0.k(localThemeScope, c15866v0, "Cancel", (Function0) objB2, null, "Cancel", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f23939a = localThemeScope;
            this.f23940b = function0;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(936062571, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithIllustration.<anonymous> (ModalShowcase.kt:534)");
            }
            LocalThemeScope localThemeScope = this.f23939a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f23940b;
            C16977b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(1029429208, true, new a(this.f23939a, Assemble, function0), composer, 54), composer, 24576, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f23945b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23946a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0 f23947b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f23948c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Oi.z$e$a$a, reason: collision with other inner class name */
            static final class C0415a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f23949a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ R0 f23950b;

                C0415a(LocalThemeScope localThemeScope, R0 r02) {
                    this.f23949a = localThemeScope;
                    this.f23950b = r02;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-896926535, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithPhoto.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ModalShowcase.kt:436)");
                    }
                    C16307b.b(this.f23949a, this.f23950b.getButtons().getDismissIcon(), null, null, composer, 0, 6);
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

            a(LocalThemeScope localThemeScope, R0 r02, Function0<Unit> function0) {
                this.f23946a = localThemeScope;
                this.f23947b = r02;
                this.f23948c = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d() {
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e() {
                return Unit.f142422a;
            }

            public final void c(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1383239396, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithPhoto.<anonymous>.<anonymous> (ModalShowcase.kt:412)");
                }
                e.Companion companion = P0.e.INSTANCE;
                e.b bVarG = companion.g();
                LocalThemeScope localThemeScope = this.f23946a;
                R0 r02 = this.f23947b;
                Function0<Unit> function0 = this.f23948c;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), bVarG, composer, 48);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
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
                MeasurePolicy measurePolicyG = C5662h.g(companion.o(), false);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
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
                D1.c(composerA2, measurePolicyG, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C13457y.a(C16190d.c(C14730a.f137878a, composer, 0), "Placeholder Image", C5664j.f48612a.g(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), companion.e()), null, InterfaceC5784k.INSTANCE.d(), 0.0f, null, composer, 24624, 104);
                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion.k(), composer, 0);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion2);
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
                D1.c(composerA3, measurePolicyA2, companion3.e());
                D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                float f10 = 8;
                C14802K.a(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), composer, 6);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion.l(), composer, 0);
                int iA4 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, companion2);
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
                D1.c(composerA4, measurePolicyB, companion3.e());
                D1.c(composerA4, interfaceC5742sR4, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion3.f());
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion2, 1.0f, false, 2, null), composer, 0);
                E0.b(localThemeScope, r02.getButtons().getDismiss(), function0, ComposableLambdaKt.c(-896926535, true, new C0415a(localThemeScope, r02), composer, 54), composer, 3072);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, H1.h.p(f10), 0.0f, 11, null), composer, 6);
                composer.v();
                composer.v();
                composer.v();
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, H1.h.p(32), 0.0f, 0.0f, 13, null), composer, 6);
                float f11 = 24;
                ri.j.h(localThemeScope, q1.Label.y(r02.getLabels().getHeading(), r02.getLabels().getHeading().getModifier().then(androidx.compose.foundation.layout.D.k(companion2, H1.h.p(f11), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), "Heading Not Exceeding Two Lines", null, composer, 384, 4);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, H1.h.p(16), 7, null), composer, 6);
                ri.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), r02.getLabels().getBody().getModifier().then(androidx.compose.foundation.layout.D.k(companion2, H1.h.p(f11), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), "This should be a full sentence or two.  Blah blah this is more stuff.  Let's hope it wraps enough. ", null, composer, 384, 4);
                C5658d.f fVarO = c5658d.o(localThemeScope.getAdsSpacing().getFour().getDp());
                Modifier modifierI = androidx.compose.foundation.layout.D.i(companion2, localThemeScope.getAdsSpacing().getSeven().getDp());
                MeasurePolicy measurePolicyA3 = C5665k.a(fVarO, companion.k(), composer, 0);
                int iA5 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR5 = composer.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierI);
                Function0<InterfaceC5811g> function0A5 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A5);
                } else {
                    composer.s();
                }
                Composer composerA5 = D1.a(composer);
                D1.c(composerA5, measurePolicyA3, companion3.e());
                D1.c(composerA5, interfaceC5742sR5, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                D1.c(composerA5, modifierE5, companion3.f());
                C15860s0 c15860s0 = C15860s0.f151792a;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objB == companion4.a()) {
                    objB = new Function0() { // from class: Oi.H
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.e.a.d();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                P0.k(localThemeScope, c15860s0, "Confirm", (Function0) objB, null, "Confirm", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                C15866v0 c15866v0 = C15866v0.f151806a;
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion4.a()) {
                    objB2 = new Function0() { // from class: Oi.I
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.e.a.e();
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                P0.k(localThemeScope, c15866v0, "Cancel", (Function0) objB2, null, "Cancel", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        e(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f23944a = localThemeScope;
            this.f23945b = function0;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-900462103, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithPhoto.<anonymous> (ModalShowcase.kt:408)");
            }
            LocalThemeScope localThemeScope = this.f23944a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f23945b;
            C16977b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(-1383239396, true, new a(this.f23944a, Assemble, function0), composer, 54), composer, 24576, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23951a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f23952b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23953a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0 f23954b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f23955c;

            a(LocalThemeScope localThemeScope, R0 r02, Function0<Unit> function0) {
                this.f23953a = localThemeScope;
                this.f23954b = r02;
                this.f23955c = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d() {
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e() {
                return Unit.f142422a;
            }

            public final void c(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1394139681, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithWarningIcon.<anonymous>.<anonymous> (ModalShowcase.kt:248)");
                }
                e.Companion companion = P0.e.INSTANCE;
                e.b bVarG = companion.g();
                LocalThemeScope localThemeScope = this.f23953a;
                R0 r02 = this.f23954b;
                Function0<Unit> function0 = this.f23955c;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), bVarG, composer, 48);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
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
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
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
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion2, 1.0f, false, 2, null), composer, 0);
                ni.P p10 = ni.P.f151555a;
                String contentDescription = r02.getButtons().getDismissIcon().getContentDescription();
                if (contentDescription == null) {
                    contentDescription = "";
                }
                P0.i(localThemeScope, p10, function0, r02.getButtons().getDismissIcon().getIcon(), contentDescription, null, false, false, 0L, composer, 48, 240);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer, 0);
                composer.v();
                C5658d.f fVarO = c5658d.o(localThemeScope.getAdsSpacing().getFive().getDp());
                e.b bVarG2 = companion.g();
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion2, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), 2, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(fVarO, bVarG2, composer, 48);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM2);
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
                D1.c(composerA3, measurePolicyA2, companion3.e());
                D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                C16307b.b(localThemeScope, r02.getIcons().getWarningIcon(), null, null, composer, 0, 6);
                ri.j.h(localThemeScope, r02.getLabels().getHeading(), "Heading Not Exceeding Two Lines", null, composer, 384, 4);
                ri.j.h(localThemeScope, r02.getLabels().getBody(), "This should be a full sentence or two.  Blah blah this is more stuff.  Let's hope it wraps enough. ", null, composer, 384, 4);
                composer.v();
                C5658d.f fVarO2 = c5658d.o(localThemeScope.getAdsSpacing().getFour().getDp());
                Modifier modifierL = androidx.compose.foundation.layout.D.l(companion2, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
                MeasurePolicy measurePolicyA3 = C5665k.a(fVarO2, companion.k(), composer, 0);
                int iA4 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierL);
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
                D1.c(composerA4, measurePolicyA3, companion3.e());
                D1.c(composerA4, interfaceC5742sR4, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion3.f());
                C15860s0 c15860s0 = C15860s0.f151792a;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objB == companion4.a()) {
                    objB = new Function0() { // from class: Oi.J
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.f.a.d();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                P0.k(localThemeScope, c15860s0, "Confirm", (Function0) objB, null, "Confirm", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                C15866v0 c15866v0 = C15866v0.f151806a;
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion4.a()) {
                    objB2 = new Function0() { // from class: Oi.K
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.f.a.e();
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                P0.k(localThemeScope, c15866v0, "Cancel", (Function0) objB2, null, "Cancel", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        f(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f23951a = localThemeScope;
            this.f23952b = function0;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1397151508, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithWarningIcon.<anonymous> (ModalShowcase.kt:244)");
            }
            LocalThemeScope localThemeScope = this.f23951a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f23952b;
            C16977b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(-1394139681, true, new a(this.f23951a, Assemble, function0), composer, 54), composer, 24576, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23956a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f23957b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23958a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0 f23959b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f23960c;

            a(LocalThemeScope localThemeScope, R0 r02, Function0<Unit> function0) {
                this.f23958a = localThemeScope;
                this.f23959b = r02;
                this.f23960c = function0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(484378995, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.NonDismissibleModal.<anonymous>.<anonymous> (ModalShowcase.kt:725)");
                }
                LocalThemeScope localThemeScope = this.f23958a;
                R0 r02 = this.f23959b;
                Function0<Unit> function0 = this.f23960c;
                Modifier.Companion companion = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                C5658d.f fVarO = c5658d.o(localThemeScope.getAdsSpacing().getFive().getDp());
                e.b bVarG = companion2.g();
                Modifier modifierL = androidx.compose.foundation.layout.D.l(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
                MeasurePolicy measurePolicyA2 = C5665k.a(fVarO, bVarG, composer, 48);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierL);
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
                D1.c(composerA2, measurePolicyA2, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                ri.j.h(localThemeScope, r02.getLabels().getHeading(), "Heading Not Exceeding Two Lines", null, composer, 384, 4);
                ri.j.h(localThemeScope, r02.getLabels().getBody(), "This should be a full sentence or two.  Blah blah this is more stuff.  Let's hope it wraps enough. ", null, composer, 384, 4);
                composer.v();
                Modifier modifierL2 = androidx.compose.foundation.layout.D.l(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
                MeasurePolicy measurePolicyA3 = C5665k.a(c5658d.h(), companion2.k(), composer, 0);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierL2);
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
                D1.c(composerA3, measurePolicyA3, companion3.e());
                D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                P0.k(localThemeScope, C15860s0.f151792a, "Confirm", function0, null, "Confirm", true, 0L, false, composer, 1769904, HttpResponseStatus.SUCCESS_OK);
                composer.v();
                composer.v();
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

        g(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f23956a = localThemeScope;
            this.f23957b = function0;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-901191482, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.NonDismissibleModal.<anonymous> (ModalShowcase.kt:716)");
            }
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            androidx.compose.ui.window.h hVar = new androidx.compose.ui.window.h(false, false, false);
            LocalThemeScope localThemeScope = this.f23956a;
            Function0<Unit> function0 = this.f23957b;
            C16977b.b(localThemeScope, modalTemplate, function0, hVar, ComposableLambdaKt.c(484378995, true, new a(localThemeScope, Assemble, function0), composer, 54), composer, 27648, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23961a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f23962b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23963a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0 f23964b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f23965c;

            a(LocalThemeScope localThemeScope, R0 r02, Function0<Unit> function0) {
                this.f23963a = localThemeScope;
                this.f23964b = r02;
                this.f23965c = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d() {
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e() {
                return Unit.f142422a;
            }

            public final void c(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(33645808, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.SimpleModal.<anonymous>.<anonymous> (ModalShowcase.kt:177)");
                }
                LocalThemeScope localThemeScope = this.f23963a;
                R0 r02 = this.f23964b;
                Function0<Unit> function0 = this.f23965c;
                Modifier.Companion companion = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
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
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion, 1.0f, false, 2, null), composer, 0);
                ni.P p10 = ni.P.f151555a;
                String contentDescription = r02.getButtons().getDismissIcon().getContentDescription();
                if (contentDescription == null) {
                    contentDescription = "";
                }
                P0.i(localThemeScope, p10, function0, r02.getButtons().getDismissIcon().getIcon(), contentDescription, null, false, false, 0L, composer, 48, 240);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer, 0);
                composer.v();
                C5658d.f fVarO = c5658d.o(localThemeScope.getAdsSpacing().getFive().getDp());
                e.b bVarG = companion2.g();
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), 2, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(fVarO, bVarG, composer, 48);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM2);
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
                D1.c(composerA3, measurePolicyA2, companion3.e());
                D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                ri.j.h(localThemeScope, r02.getLabels().getHeading(), "Heading Not Exceeding Two Lines", null, composer, 384, 4);
                ri.j.h(localThemeScope, r02.getLabels().getBody(), "This should be a full sentence or two.  Blah blah this is more stuff.  Let's hope it wraps enough. ", null, composer, 384, 4);
                composer.v();
                C5658d.f fVarO2 = c5658d.o(localThemeScope.getAdsSpacing().getFour().getDp());
                Modifier modifierL = androidx.compose.foundation.layout.D.l(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
                MeasurePolicy measurePolicyA3 = C5665k.a(fVarO2, companion2.k(), composer, 0);
                int iA4 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierL);
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
                D1.c(composerA4, measurePolicyA3, companion3.e());
                D1.c(composerA4, interfaceC5742sR4, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion3.f());
                C15860s0 c15860s0 = C15860s0.f151792a;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objB == companion4.a()) {
                    objB = new Function0() { // from class: Oi.L
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.h.a.d();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                P0.k(localThemeScope, c15860s0, "Confirm", (Function0) objB, null, "Confirm", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                C15866v0 c15866v0 = C15866v0.f151806a;
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion4.a()) {
                    objB2 = new Function0() { // from class: Oi.M
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.h.a.e();
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                P0.k(localThemeScope, c15866v0, "Cancel", (Function0) objB2, null, "Cancel", true, 0L, false, composer, 1772976, HttpResponseStatus.SUCCESS_OK);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        h(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f23961a = localThemeScope;
            this.f23962b = function0;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1640151229, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.SimpleModal.<anonymous> (ModalShowcase.kt:173)");
            }
            LocalThemeScope localThemeScope = this.f23961a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f23962b;
            C16977b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(33645808, true, new a(this.f23961a, Assemble, function0), composer, 54), composer, 24576, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void i(final LocalThemeScope localThemeScope, final Function0<Unit> onDismissRequest, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1030943025);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onDismissRequest) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1030943025, i11, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalSuperSimple (ModalShowcase.kt:486)");
            }
            Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(2008354154, true, new a(localThemeScope, onDismissRequest), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.j(localThemeScope, onDismissRequest, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        i(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void k(final LocalThemeScope localThemeScope, final Function0<Unit> onDismissRequest, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1410471731);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onDismissRequest) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1410471731, i11, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithBullets (ModalShowcase.kt:315)");
            }
            Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(1628825448, true, new b(localThemeScope, onDismissRequest), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.l(localThemeScope, onDismissRequest, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        k(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void m(final LocalThemeScope localThemeScope, final Function0<Unit> onDismissRequest, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(1978485800);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onDismissRequest) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1978485800, i11, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithCustomComponent (ModalShowcase.kt:610)");
            }
            Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(-1079607357, true, new c(localThemeScope, onDismissRequest), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.n(localThemeScope, onDismissRequest, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        m(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void o(final LocalThemeScope localThemeScope, final Function0<Unit> onDismissRequest, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(1428505638);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onDismissRequest) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1428505638, i11, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithIllustration (ModalShowcase.kt:532)");
            }
            Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(936062571, true, new d(localThemeScope, onDismissRequest), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.p(localThemeScope, onDismissRequest, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        o(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void q(final LocalThemeScope localThemeScope, final Function0<Unit> onDismissRequest, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-644407154);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onDismissRequest) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-644407154, i11, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithPhoto (ModalShowcase.kt:406)");
            }
            Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(-900462103, true, new e(localThemeScope, onDismissRequest), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.r(localThemeScope, onDismissRequest, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        q(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void s(final LocalThemeScope localThemeScope, final Function0<Unit> onDismissRequest, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-549982255);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onDismissRequest) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-549982255, i11, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalWithWarningIcon (ModalShowcase.kt:242)");
            }
            Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(-1397151508, true, new f(localThemeScope, onDismissRequest), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.t(localThemeScope, onDismissRequest, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        s(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void u(final LocalThemeScope localThemeScope, final Function0<Unit> onConfirm, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onConfirm, "onConfirm");
        Composer composerStartRestartGroup = composer.startRestartGroup(1897083201);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onConfirm) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1897083201, i11, -1, "com.meijer.mobile.androidacres.showcase.assemblies.NonDismissibleModal (ModalShowcase.kt:714)");
            }
            Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(-901191482, true, new g(localThemeScope, onConfirm), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.v(localThemeScope, onConfirm, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        u(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void w(final LocalThemeScope localThemeScope, final Function0<Unit> onDismissRequest, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-842450242);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onDismissRequest) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-842450242, i11, -1, "com.meijer.mobile.androidacres.showcase.assemblies.SimpleModal (ModalShowcase.kt:171)");
            }
            Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(-1640151229, true, new h(localThemeScope, onDismissRequest), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.x(localThemeScope, onDismissRequest, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        w(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
