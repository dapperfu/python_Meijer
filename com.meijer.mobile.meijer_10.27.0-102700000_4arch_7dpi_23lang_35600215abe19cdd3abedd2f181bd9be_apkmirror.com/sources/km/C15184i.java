package km;

import F1.j;
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

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aY\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "title", "body", "confirmButtonText", "dismissButtonText", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onDismissRequest", "onConfirm", "b", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: km.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15184i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: km.i$a */
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142100a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f142101b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f142102c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f142103d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f142104e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f142105f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f142106g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f142107h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: km.i$a$a, reason: collision with other inner class name */
        static final class C2254a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f142108a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f142109b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0 f142110c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f142111d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f142112e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f142113f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f142114g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f142115h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f142116i;

            C2254a(Modifier modifier, LocalThemeScope localThemeScope, R0 r02, String str, String str2, String str3, Function0<Unit> function0, String str4, Function0<Unit> function02) {
                this.f142108a = modifier;
                this.f142109b = localThemeScope;
                this.f142110c = r02;
                this.f142111d = str;
                this.f142112e = str2;
                this.f142113f = str3;
                this.f142114g = function0;
                this.f142115h = str4;
                this.f142116i = function02;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(74116465, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.HomeScreenAlertDialog.<anonymous>.<anonymous> (HomeScreenAlertDialog.kt:51)");
                }
                Modifier modifierI = D.i(this.f142108a, this.f142109b.getAdsSpacing().getFive().getDp());
                LocalThemeScope localThemeScope = this.f142109b;
                R0 r02 = this.f142110c;
                String str = this.f142111d;
                String str2 = this.f142112e;
                String str3 = this.f142113f;
                Function0<Unit> function0 = this.f142114g;
                String str4 = this.f142115h;
                Function0<Unit> function02 = this.f142116i;
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
                q1.Label heading = r02.getLabels().getHeading();
                j.Companion companion4 = F1.j.INSTANCE;
                q1.Label labelY = q1.Label.y(heading, null, null, null, F1.j.h(companion4.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null);
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, labelY, str, null, composer, i11 | (i12 << 3), 4);
                C14802K.a(J.i(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
                ri.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(companion4.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null), str2, null, composer, i11 | (i12 << 3), 4);
                C14802K.a(J.i(companion3, localThemeScope.getAdsSpacing().getSeven().getDp()), composer, 0);
                C5658d.e eVarC = c5658d.c();
                Modifier modifierH = J.h(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = G.b(eVarC, companion.l(), composer, 6);
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
                int i13 = C15874z0.f151827b;
                P0.k(localThemeScope, c15874z0, str3, function0, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
                P0.k(localThemeScope, c15874z0, str4, function02, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, Modifier modifier, String str, String str2, String str3, Function0<Unit> function02, String str4) {
            this.f142100a = localThemeScope;
            this.f142101b = function0;
            this.f142102c = modifier;
            this.f142103d = str;
            this.f142104e = str2;
            this.f142105f = str3;
            this.f142106g = function02;
            this.f142107h = str4;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(336902974, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.HomeScreenAlertDialog.<anonymous> (HomeScreenAlertDialog.kt:47)");
            }
            LocalThemeScope localThemeScope = this.f142100a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f142101b;
            C16977b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(74116465, true, new C2254a(this.f142102c, this.f142100a, Assemble, this.f142103d, this.f142104e, this.f142105f, this.f142106g, this.f142107h, function0), composer, 54), composer, LocalThemeScope.f15770g | 24576 | (q1.ModalTemplate.f140108d << 3), 4);
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
    public static final void b(final Ji.LocalThemeScope r14, final java.lang.String r15, final java.lang.String r16, final java.lang.String r17, final java.lang.String r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C15184i.b(Ji.M, java.lang.String, java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, str3, str4, modifier, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
