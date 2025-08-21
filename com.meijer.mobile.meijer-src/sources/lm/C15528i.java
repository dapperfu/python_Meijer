package lm;

import F1.j;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import ki.R0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16208z0;
import oi.P0;
import ti.C17265b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aY\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "title", "body", "confirmButtonText", "dismissButtonText", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onDismissRequest", "onConfirm", "b", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: lm.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15528i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lm.i$a */
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149783a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149784b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f149785c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f149786d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f149787e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f149788f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149789g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f149790h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: lm.i$a$a, reason: collision with other inner class name */
        static final class C2308a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f149791a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f149792b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0 f149793c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f149794d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f149795e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f149796f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f149797g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f149798h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f149799i;

            C2308a(Modifier modifier, LocalThemeScope localThemeScope, R0 r02, String str, String str2, String str3, Function0<Unit> function0, String str4, Function0<Unit> function02) {
                this.f149791a = modifier;
                this.f149792b = localThemeScope;
                this.f149793c = r02;
                this.f149794d = str;
                this.f149795e = str2;
                this.f149796f = str3;
                this.f149797g = function0;
                this.f149798h = str4;
                this.f149799i = function02;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(74116465, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.HomeScreenAlertDialog.<anonymous>.<anonymous> (HomeScreenAlertDialog.kt:51)");
                }
                Modifier modifierI = D.i(this.f149791a, this.f149792b.getAdsSpacing().getFive().getDp());
                LocalThemeScope localThemeScope = this.f149792b;
                R0 r02 = this.f149793c;
                String str = this.f149794d;
                String str2 = this.f149795e;
                String str3 = this.f149796f;
                Function0<Unit> function0 = this.f149797g;
                String str4 = this.f149798h;
                Function0<Unit> function02 = this.f149799i;
                C5800d c5800d = C5800d.f48779a;
                C5800d.m mVarH = c5800d.h();
                e.Companion companion = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
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
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                q1.Label heading = r02.getLabels().getHeading();
                j.Companion companion4 = F1.j.INSTANCE;
                q1.Label labelY = q1.Label.y(heading, null, null, null, F1.j.h(companion4.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, labelY, str, null, composer, i11 | (i12 << 3), 4);
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
                si.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(companion4.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null), str2, null, composer, i11 | (i12 << 3), 4);
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getSeven().getDp()), composer, 0);
                C5800d.e eVarC = c5800d.c();
                Modifier modifierH = J.h(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = G.b(eVarC, companion.l(), composer, 6);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
                Function0<InterfaceC5953g> function0A2 = companion2.a();
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
                D1.c(composerA2, measurePolicyB, companion2.e());
                D1.c(composerA2, interfaceC5884sR2, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                C16208z0 c16208z0 = C16208z0.f154285a;
                int i13 = C16208z0.f154286b;
                P0.k(localThemeScope, c16208z0, str3, function0, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
                P0.k(localThemeScope, c16208z0, str4, function02, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
                composer.v();
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, Modifier modifier, String str, String str2, String str3, Function0<Unit> function02, String str4) {
            this.f149783a = localThemeScope;
            this.f149784b = function0;
            this.f149785c = modifier;
            this.f149786d = str;
            this.f149787e = str2;
            this.f149788f = str3;
            this.f149789g = function02;
            this.f149790h = str4;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(336902974, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.HomeScreenAlertDialog.<anonymous> (HomeScreenAlertDialog.kt:47)");
            }
            LocalThemeScope localThemeScope = this.f149783a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f149784b;
            C17265b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(74116465, true, new C2308a(this.f149785c, this.f149783a, Assemble, this.f149786d, this.f149787e, this.f149788f, this.f149789g, this.f149790h, function0), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r14, final java.lang.String r15, final java.lang.String r16, final java.lang.String r17, final java.lang.String r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.C15528i.b(Ki.M, java.lang.String, java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, str3, str4, modifier, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
