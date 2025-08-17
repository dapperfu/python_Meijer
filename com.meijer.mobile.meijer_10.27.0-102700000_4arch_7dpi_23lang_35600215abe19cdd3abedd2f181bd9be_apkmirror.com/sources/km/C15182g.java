package km;

import F1.t;
import Ji.C;
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
import km.C15182g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15874z0;
import ni.P0;
import pi.C16307b;
import si.C16977b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aY\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "headingText", "bodyText", "cancelText", "acceptText", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onCancel", "onAccept", "b", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: km.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15182g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: km.g$a */
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f142077b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f142078c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f142079d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f142080e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f142081f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f142082g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: km.g$a$a, reason: collision with other inner class name */
        static final class C2253a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f142083a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f142084b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f142085c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f142086d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f142087e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f142088f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f142089g;

            C2253a(Modifier modifier, LocalThemeScope localThemeScope, String str, String str2, String str3, Function0<Unit> function0, String str4) {
                this.f142083a = modifier;
                this.f142084b = localThemeScope;
                this.f142085c = str;
                this.f142086d = str2;
                this.f142087e = str3;
                this.f142088f = function0;
                this.f142089g = str4;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1523918565, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.ChokeWarningAlert.<anonymous>.<anonymous> (ChokeWarningAlert.kt:56)");
                }
                Modifier modifierK = D.k(this.f142083a, this.f142084b.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f142084b;
                String str = this.f142085c;
                String str2 = this.f142086d;
                String str3 = this.f142087e;
                Function0<Unit> function0 = this.f142088f;
                String str4 = this.f142089g;
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
                C14802K.a(J.i(companion3, localThemeScope.getAdsSpacing().getSix().getDp()), composer, 0);
                MeasurePolicy measurePolicyB = G.b(c5658d.g(), companion.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion3);
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
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.n.f15565d, null, null, null, 0.0f, null, null, 126, null);
                int i11 = LocalThemeScope.f15770g;
                C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | 3072 | (q1.h.DrawableIcon.f140067h << 3), 2);
                C14802K.a(J.z(companion3, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
                q1.Label label = new q1.Label(null, null, null, null, t.INSTANCE.b(), false, 2, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, HttpResponseStatus.REDIRECTION_SEE_OTHER, null);
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, str2, null, composer, i11 | (i12 << 3), 4);
                composer.v();
                C14802K.a(J.i(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null), str, null, composer, i11 | (i12 << 3), 4);
                C14802K.a(J.i(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
                Modifier modifierH = J.h(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyB2 = G.b(c5658d.c(), companion.l(), composer, 6);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH);
                Function0<InterfaceC5811g> function0A3 = companion2.a();
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
                D1.c(composerA3, measurePolicyB2, companion2.e());
                D1.c(composerA3, interfaceC5742sR3, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion2.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion2.f());
                C15874z0 c15874z0 = C15874z0.f151826a;
                int i13 = C15874z0.f151827b;
                P0.k(localThemeScope, c15874z0, str3, function0, null, null, false, 0L, false, composer, (i13 << 3) | i11, 248);
                P0.k(localThemeScope, c15874z0, str4, function0, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
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

        a(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3, Function0<Unit> function0, String str4) {
            this.f142076a = localThemeScope;
            this.f142077b = modifier;
            this.f142078c = str;
            this.f142079d = str2;
            this.f142080e = str3;
            this.f142081f = function0;
            this.f142082g = str4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            return Unit.f142422a;
        }

        public final void b(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(848413672, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.ChokeWarningAlert.<anonymous> (ChokeWarningAlert.kt:53)");
            }
            LocalThemeScope localThemeScope = this.f142076a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: km.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15182g.a.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C16977b.b(localThemeScope, modalTemplate, (Function0) objB, null, ComposableLambdaKt.c(-1523918565, true, new C2253a(this.f142077b, this.f142076a, this.f142078c, this.f142079d, this.f142080e, this.f142081f, this.f142082g), composer, 54), composer, LocalThemeScope.f15770g | 24960 | (q1.ModalTemplate.f140108d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r14, final java.lang.String r15, final java.lang.String r16, final java.lang.String r17, final java.lang.String r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C15182g.b(Ji.M, java.lang.String, java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, str3, str4, modifier, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
