package Nm;

import F1.j;
import Ji.LocalThemeScope;
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
import androidx.recyclerview.widget.RecyclerView;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.C14924a0;
import ji.InterfaceC14971y;
import ji.j1;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import r0.C16692i;
import si.C16977b;
import yr.C18299z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJi/M;", "", "errorTitle", "errorMessage", "Lkotlin/Function0;", "", "onDismiss", "b", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<ji.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f22323a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22324b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22325c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f22326d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Nm.M$a$a, reason: collision with other inner class name */
        static final class C0360a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f22327a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f22328b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f22329c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22330d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Nm.M$a$a$a, reason: collision with other inner class name */
            static final class C0361a implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f22331a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f22332b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Nm.M$a$a$a$a, reason: collision with other inner class name */
                static final class C0362a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f22333a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j1 f22334b;

                    C0362a(LocalThemeScope localThemeScope, j1 j1Var) {
                        this.f22333a = localThemeScope;
                        this.f22334b = j1Var;
                    }

                    public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1256615185, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationErrorModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelfRemediationErrorModal.kt:93)");
                        }
                        ri.j.h(this.f22333a, this.f22334b.getLabels().getEnabledLabel(), C16193g.c(com.meijer.mobile.meijer.Y.f99458A3, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

                C0361a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                    this.f22331a = localThemeScope;
                    this.f22332b = function0;
                }

                public final void a(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(98401566, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationErrorModal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelfRemediationErrorModal.kt:84)");
                    }
                    ni.E0.b(this.f22331a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, C16692i.c(H1.h.p(12)), null, null, null, C18299z.f(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), "done_button", null, 2, null), false, null, 887, null), this.f22332b, ComposableLambdaKt.c(1256615185, true, new C0362a(this.f22331a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                    a(j1Var, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C0360a(LocalThemeScope localThemeScope, String str, String str2, Function0<Unit> function0) {
                this.f22327a = localThemeScope;
                this.f22328b = str;
                this.f22329c = str2;
                this.f22330d = function0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1778195656, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationErrorModal.<anonymous>.<anonymous> (SelfRemediationErrorModal.kt:56)");
                }
                float f10 = 16;
                C5658d.f fVarO = C5658d.f48555a.o(H1.h.p(f10));
                e.b bVarG = P0.e.INSTANCE.g();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, H1.h.p(24));
                LocalThemeScope localThemeScope = this.f22327a;
                String str = this.f22328b;
                String str2 = this.f22329c;
                Function0<Unit> function0 = this.f22330d;
                MeasurePolicy measurePolicyA = C5665k.a(fVarO, bVarG, composer, 54);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                Ji.I six = localThemeScope.getAdsTypography().getHeadings().getSix();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                j.Companion companion3 = F1.j.INSTANCE;
                q1.Label label = new q1.Label(modifierH, null, null, F1.j.h(companion3.a()), 0, false, 0, six, null, 374, null);
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, str, null, composer, (i12 << 3) | i11, 4);
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, null, F1.j.h(companion3.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 374, null), str2, null, composer, i11 | (i12 << 3), 4);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), composer, 6);
                Ji.Q.e(localThemeScope, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(98401566, true, new C0361a(localThemeScope, function0), composer, 54), composer, i11 | 384 | (InterfaceC14971y.a.d.f140293b << 3));
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str, String str2) {
            this.f22323a = localThemeScope;
            this.f22324b = function0;
            this.f22325c = str;
            this.f22326d = str2;
        }

        public final void a(ji.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-45677947, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationErrorModal.<anonymous> (SelfRemediationErrorModal.kt:49)");
            }
            LocalThemeScope localThemeScope = this.f22323a;
            q1.ModalTemplate modalTemplateY = q1.ModalTemplate.y(Assemble.getModalTemplate(), androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, H1.h.p(32), 0.0f, 2, null), C16692i.c(H1.h.p(16)), 0.0f, 4, null);
            Function0<Unit> function0 = this.f22324b;
            C16977b.b(localThemeScope, modalTemplateY, function0, null, ComposableLambdaKt.c(-1778195656, true, new C0360a(this.f22323a, this.f22325c, this.f22326d, function0), composer, 54), composer, LocalThemeScope.f15770g | 24576 | (q1.ModalTemplate.f140108d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, final String errorTitle, final String errorMessage, final Function0<Unit> onDismiss, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(errorTitle, "errorTitle");
        Intrinsics.j(errorMessage, "errorMessage");
        Intrinsics.j(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-677016662);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(errorTitle) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(errorMessage) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onDismiss) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-677016662, i11, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationErrorModal (SelfRemediationErrorModal.kt:47)");
            }
            Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(-45677947, true, new a(localThemeScope, onDismiss, errorTitle, errorMessage), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (C14924a0.f139755b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Nm.L
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.c(localThemeScope, errorTitle, errorMessage, onDismiss, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, Function0 function0, int i10, Composer composer, int i11) {
        b(localThemeScope, str, str2, function0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
