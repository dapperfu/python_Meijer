package km;

import Ji.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import ji.R0;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15874z0;
import ni.P0;
import si.C16977b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a_\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "bodyText", "button1Label", "button2Label", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "button1Action", "button2Action", "onDismissRequest", "b", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: km.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15177b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: km.b$a */
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142029a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f142030b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f142031c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f142032d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f142033e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f142034f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f142035g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f142036h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: km.b$a$a, reason: collision with other inner class name */
        static final class C2251a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f142037a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f142038b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0 f142039c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f142040d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f142041e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f142042f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f142043g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f142044h;

            C2251a(Modifier modifier, LocalThemeScope localThemeScope, R0 r02, String str, String str2, Function0<Unit> function0, String str3, Function0<Unit> function02) {
                this.f142037a = modifier;
                this.f142038b = localThemeScope;
                this.f142039c = r02;
                this.f142040d = str;
                this.f142041e = str2;
                this.f142042f = function0;
                this.f142043g = str3;
                this.f142044h = function02;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1373443342, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.AlertDialogNoTitle.<anonymous>.<anonymous> (AlertDialogNoTitle.kt:50)");
                }
                Modifier modifierI = D.i(this.f142037a, this.f142038b.getAdsSpacing().getFive().getDp());
                LocalThemeScope localThemeScope = this.f142038b;
                R0 r02 = this.f142039c;
                String str = this.f142040d;
                String str2 = this.f142041e;
                Function0<Unit> function0 = this.f142042f;
                String str3 = this.f142043g;
                Function0<Unit> function02 = this.f142044h;
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion.k(), composer, 0);
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                C14802K.a(J.i(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                q1.Label labelY = q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null);
                int i11 = LocalThemeScope.f15770g;
                ri.j.h(localThemeScope, labelY, str, null, composer, i11 | (q1.Label.f140080j << 3), 4);
                C14802K.a(J.i(companion3, localThemeScope.getAdsSpacing().getSix().getDp()), composer, 0);
                Modifier modifierH = J.h(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = G.b(c5658d.c(), companion.l(), composer, 6);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
                Function0<InterfaceC5811g> function0A2 = companion2.a();
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
                D1.c(composerA2, measurePolicyB, companion2.e());
                D1.c(composerA2, interfaceC5742sR2, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                C15874z0 c15874z0 = C15874z0.f151826a;
                int i12 = C15874z0.f151827b;
                P0.k(localThemeScope, c15874z0, str2, function0, null, null, false, 0L, false, composer, i11 | (i12 << 3), 248);
                P0.k(localThemeScope, c15874z0, str3, function02, null, null, false, 0L, false, composer, i11 | (i12 << 3), 248);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, Modifier modifier, String str, String str2, Function0<Unit> function02, String str3, Function0<Unit> function03) {
            this.f142029a = localThemeScope;
            this.f142030b = function0;
            this.f142031c = modifier;
            this.f142032d = str;
            this.f142033e = str2;
            this.f142034f = function02;
            this.f142035g = str3;
            this.f142036h = function03;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-536223135, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.AlertDialogNoTitle.<anonymous> (AlertDialogNoTitle.kt:49)");
            }
            C16977b.b(this.f142029a, Assemble.getModalTemplate(), this.f142030b, null, ComposableLambdaKt.c(1373443342, true, new C2251a(this.f142031c, this.f142029a, Assemble, this.f142032d, this.f142033e, this.f142034f, this.f142035g, this.f142036h), composer, 54), composer, LocalThemeScope.f15770g | 24576 | (q1.ModalTemplate.f140108d << 3), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r14, final java.lang.String r15, final java.lang.String r16, final java.lang.String r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C15177b.b(Ji.M, java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, String str3, Modifier modifier, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, str3, modifier, function0, function02, function03, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
