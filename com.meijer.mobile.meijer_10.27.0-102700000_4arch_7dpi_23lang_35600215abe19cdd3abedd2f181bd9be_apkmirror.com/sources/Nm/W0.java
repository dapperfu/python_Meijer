package Nm;

import Ji.LocalThemeScope;
import Nm.W0;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14802K;
import j0.C14815g;
import java.util.Locale;
import ji.q1;
import kotlin.C17985y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import si.C16977b;
import yr.C18299z;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aU\u0010\t\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onViewStatusClicked", "onDoneClicked", "onAddAnotherClicked", "onDismissRequest", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class W0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<ji.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f22378a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22379b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22380c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22381d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22382e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Nm.W0$a$a, reason: collision with other inner class name */
        static final class C0363a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f22383a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ji.R0 f22384b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22385c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22386d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22387e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Nm.W0$a$a$a, reason: collision with other inner class name */
            static final class C0364a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f22388a;

                C0364a(LocalThemeScope localThemeScope) {
                    this.f22388a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(911763333, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationSuccessModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelfRemediationSuccessModal.kt:77)");
                    }
                    LocalThemeScope localThemeScope = this.f22388a;
                    Ji.I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
                    q1.Label label = new q1.Label(C18299z.f(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f22388a.getAdsSpacing().getTwo().getDp()), "view_status_button", null, 2, null), this.f22388a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, seven, null, 380, null);
                    String upperCase = C16193g.c(com.meijer.mobile.meijer.Y.f99887We, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Nm.W0$a$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f22389a;

                b(LocalThemeScope localThemeScope) {
                    this.f22389a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-420016260, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationSuccessModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelfRemediationSuccessModal.kt:92)");
                    }
                    LocalThemeScope localThemeScope = this.f22389a;
                    Ji.I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
                    q1.Label label = new q1.Label(C18299z.f(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f22389a.getAdsSpacing().getTwo().getDp()), "add_another_button", null, 2, null), this.f22389a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, seven, null, 380, null);
                    String upperCase = C16193g.c(com.meijer.mobile.meijer.Y.f99849Ue, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Nm.W0$a$a$c */
            static final class c implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f22390a;

                c(LocalThemeScope localThemeScope) {
                    this.f22390a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1819462275, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationSuccessModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelfRemediationSuccessModal.kt:107)");
                    }
                    LocalThemeScope localThemeScope = this.f22390a;
                    Ji.I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
                    q1.Label label = new q1.Label(C18299z.f(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f22390a.getAdsSpacing().getTwo().getDp()), "done_button", null, 2, null), this.f22390a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, seven, null, 380, null);
                    String upperCase = C16193g.c(com.meijer.mobile.meijer.Y.f99458A3, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            C0363a(LocalThemeScope localThemeScope, ji.R0 r02, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
                this.f22383a = localThemeScope;
                this.f22384b = r02;
                this.f22385c = function0;
                this.f22386d = function02;
                this.f22387e = function03;
            }

            public final void d(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(909623091, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationSuccessModal.<anonymous>.<anonymous>.<anonymous> (SelfRemediationSuccessModal.kt:55)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, this.f22383a.getAdsSpacing().getSix().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f22383a;
                ji.R0 r02 = this.f22384b;
                final Function0<Unit> function0 = this.f22385c;
                final Function0<Unit> function02 = this.f22386d;
                final Function0<Unit> function03 = this.f22387e;
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getSix().getDp()), composer, 0);
                q1.Label heading = r02.getLabels().getHeading();
                String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99830Te, composer, 0);
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, heading, strC, null, composer, i11 | (i12 << 3), 4);
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                ri.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null), C16193g.c(com.meijer.mobile.meijer.Y.f99868Ve, composer, 0), null, composer, i11 | (i12 << 3), 4);
                e.b bVarJ = companion2.j();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), bVarJ, composer, 48);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
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
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function0);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Nm.T0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W0.a.C0363a.e(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                float f10 = 0;
                C17985y.b((Function0) objB, null, false, null, 0L, 0L, null, H1.h.p(f10), null, ComposableLambdaKt.c(911763333, true, new C0364a(localThemeScope), composer, 54), composer, 817889280, 382);
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(function02);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Nm.U0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W0.a.C0363a.f(function02);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C17985y.b((Function0) objB2, null, false, null, 0L, 0L, null, H1.h.p(f10), null, ComposableLambdaKt.c(-420016260, true, new b(localThemeScope), composer, 54), composer, 817889280, 382);
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(function03);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: Nm.V0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W0.a.C0363a.g(function03);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C17985y.b((Function0) objB3, null, false, null, 0L, 0L, null, H1.h.p(f10), null, ComposableLambdaKt.c(-1819462275, true, new c(localThemeScope), composer, 54), composer, 817889280, 382);
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
            this.f22378a = localThemeScope;
            this.f22379b = function0;
            this.f22380c = function02;
            this.f22381d = function03;
            this.f22382e = function04;
        }

        public final void b(ji.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(736814534, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationSuccessModal.<anonymous>.<anonymous> (SelfRemediationSuccessModal.kt:51)");
            }
            LocalThemeScope localThemeScope = this.f22378a;
            q1.ModalTemplate modalTemplateP = Assemble.getModalTemplate();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f22379b);
            final Function0<Unit> function0 = this.f22379b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Nm.S0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W0.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C16977b.b(localThemeScope, modalTemplateP, (Function0) objB, null, ComposableLambdaKt.c(909623091, true, new C0363a(this.f22378a, Assemble, this.f22380c, this.f22381d, this.f22382e), composer, 54), composer, LocalThemeScope.f15770g | 24576 | (q1.ModalTemplate.f140108d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nm.W0.b(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, function0, function02, function03, function04, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
