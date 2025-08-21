package Om;

import Ki.LocalThemeScope;
import Om.W0;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14890K;
import j0.C14903g;
import java.util.Locale;
import ki.q1;
import kotlin.C18051y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import ti.C17265b;
import yr.C18370z;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aU\u0010\t\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onViewStatusClicked", "onDoneClicked", "onAddAnotherClicked", "onDismissRequest", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class W0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<ki.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24623a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24624b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24625c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24626d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24627e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Om.W0$a$a, reason: collision with other inner class name */
        static final class C0402a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24628a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.R0 f24629b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f24630c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f24631d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f24632e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Om.W0$a$a$a, reason: collision with other inner class name */
            static final class C0403a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f24633a;

                C0403a(LocalThemeScope localThemeScope) {
                    this.f24633a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(911763333, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationSuccessModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelfRemediationSuccessModal.kt:77)");
                    }
                    LocalThemeScope localThemeScope = this.f24633a;
                    Ki.I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
                    q1.Label label = new q1.Label(C18370z.f(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f24633a.getAdsSpacing().getTwo().getDp()), "view_status_button", null, 2, null), this.f24633a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, seven, null, 380, null);
                    String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f100806Ze, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
            /* renamed from: Om.W0$a$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f24634a;

                b(LocalThemeScope localThemeScope) {
                    this.f24634a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-420016260, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationSuccessModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelfRemediationSuccessModal.kt:92)");
                    }
                    LocalThemeScope localThemeScope = this.f24634a;
                    Ki.I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
                    q1.Label label = new q1.Label(C18370z.f(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f24634a.getAdsSpacing().getTwo().getDp()), "add_another_button", null, 2, null), this.f24634a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, seven, null, 380, null);
                    String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f100768Xe, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
            /* renamed from: Om.W0$a$a$c */
            static final class c implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f24635a;

                c(LocalThemeScope localThemeScope) {
                    this.f24635a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1819462275, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationSuccessModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelfRemediationSuccessModal.kt:107)");
                    }
                    LocalThemeScope localThemeScope = this.f24635a;
                    Ki.I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
                    q1.Label label = new q1.Label(C18370z.f(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f24635a.getAdsSpacing().getTwo().getDp()), "done_button", null, 2, null), this.f24635a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, seven, null, 380, null);
                    String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f100315A3, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            C0402a(LocalThemeScope localThemeScope, ki.R0 r02, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
                this.f24628a = localThemeScope;
                this.f24629b = r02;
                this.f24630c = function0;
                this.f24631d = function02;
                this.f24632e = function03;
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
                Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, this.f24628a.getAdsSpacing().getSix().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f24628a;
                ki.R0 r02 = this.f24629b;
                final Function0<Unit> function0 = this.f24630c;
                final Function0<Unit> function02 = this.f24631d;
                final Function0<Unit> function03 = this.f24632e;
                C5800d c5800d = C5800d.f48779a;
                C5800d.m mVarH = c5800d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getSix().getDp()), composer, 0);
                q1.Label heading = r02.getLabels().getHeading();
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100749We, composer, 0);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, heading, strC, null, composer, i11 | (i12 << 3), 4);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                si.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null), C16338g.c(com.meijer.mobile.meijer.Y.f100787Ye, composer, 0), null, composer, i11 | (i12 << 3), 4);
                e.b bVarJ = companion2.j();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), bVarJ, composer, 48);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
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
                D1.c(composerA2, measurePolicyA2, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function0);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Om.T0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W0.a.C0402a.e(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                float f10 = 0;
                C18051y.b((Function0) objB, null, false, null, 0L, 0L, null, H1.h.p(f10), null, ComposableLambdaKt.c(911763333, true, new C0403a(localThemeScope), composer, 54), composer, 817889280, 382);
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(function02);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Om.U0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W0.a.C0402a.f(function02);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C18051y.b((Function0) objB2, null, false, null, 0L, 0L, null, H1.h.p(f10), null, ComposableLambdaKt.c(-420016260, true, new b(localThemeScope), composer, 54), composer, 817889280, 382);
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(function03);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: Om.V0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W0.a.C0402a.g(function03);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C18051y.b((Function0) objB3, null, false, null, 0L, 0L, null, H1.h.p(f10), null, ComposableLambdaKt.c(-1819462275, true, new c(localThemeScope), composer, 54), composer, 817889280, 382);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
            this.f24623a = localThemeScope;
            this.f24624b = function0;
            this.f24625c = function02;
            this.f24626d = function03;
            this.f24627e = function04;
        }

        public final void b(ki.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(736814534, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationSuccessModal.<anonymous>.<anonymous> (SelfRemediationSuccessModal.kt:51)");
            }
            LocalThemeScope localThemeScope = this.f24623a;
            q1.ModalTemplate modalTemplateP = Assemble.getModalTemplate();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f24624b);
            final Function0<Unit> function0 = this.f24624b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Om.S0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W0.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17265b.b(localThemeScope, modalTemplateP, (Function0) objB, null, ComposableLambdaKt.c(909623091, true, new C0402a(this.f24623a, Assemble, this.f24625c, this.f24626d, this.f24627e), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
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
    public static final void b(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Om.W0.b(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, function0, function02, function03, function04, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
