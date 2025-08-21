package lm;

import F1.t;
import Ki.C;
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
import lm.C15526g;
import oi.C16208z0;
import oi.P0;
import qi.C16671b;
import ti.C17265b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aY\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "headingText", "bodyText", "cancelText", "acceptText", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onCancel", "onAccept", "b", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: lm.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15526g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: lm.g$a */
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149759a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f149760b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f149761c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f149762d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f149763e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149764f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f149765g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: lm.g$a$a, reason: collision with other inner class name */
        static final class C2307a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f149766a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f149767b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f149768c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f149769d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f149770e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f149771f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f149772g;

            C2307a(Modifier modifier, LocalThemeScope localThemeScope, String str, String str2, String str3, Function0<Unit> function0, String str4) {
                this.f149766a = modifier;
                this.f149767b = localThemeScope;
                this.f149768c = str;
                this.f149769d = str2;
                this.f149770e = str3;
                this.f149771f = function0;
                this.f149772g = str4;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1523918565, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.ChokeWarningAlert.<anonymous>.<anonymous> (ChokeWarningAlert.kt:56)");
                }
                Modifier modifierK = D.k(this.f149766a, this.f149767b.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f149767b;
                String str = this.f149768c;
                String str2 = this.f149769d;
                String str3 = this.f149770e;
                Function0<Unit> function0 = this.f149771f;
                String str4 = this.f149772g;
                C5800d c5800d = C5800d.f48779a;
                C5800d.m mVarH = c5800d.h();
                e.Companion companion = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getSix().getDp()), composer, 0);
                MeasurePolicy measurePolicyB = G.b(c5800d.g(), companion.l(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion3);
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
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.n.f17109d, null, null, null, 0.0f, null, null, 126, null);
                int i11 = LocalThemeScope.f17314g;
                C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | 3072 | (q1.h.DrawableIcon.f142322h << 3), 2);
                C14890K.a(J.z(companion3, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
                q1.Label label = new q1.Label(null, null, null, null, t.INSTANCE.b(), false, 2, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, HttpResponseStatus.REDIRECTION_SEE_OTHER, null);
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, str2, null, composer, i11 | (i12 << 3), 4);
                composer.v();
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null), str, null, composer, i11 | (i12 << 3), 4);
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
                Modifier modifierH = J.h(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyB2 = G.b(c5800d.c(), companion.l(), composer, 6);
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH);
                Function0<InterfaceC5953g> function0A3 = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = D1.a(composer);
                D1.c(composerA3, measurePolicyB2, companion2.e());
                D1.c(composerA3, interfaceC5884sR3, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion2.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion2.f());
                C16208z0 c16208z0 = C16208z0.f154285a;
                int i13 = C16208z0.f154286b;
                P0.k(localThemeScope, c16208z0, str3, function0, null, null, false, 0L, false, composer, (i13 << 3) | i11, 248);
                P0.k(localThemeScope, c16208z0, str4, function0, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
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

        a(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3, Function0<Unit> function0, String str4) {
            this.f149759a = localThemeScope;
            this.f149760b = modifier;
            this.f149761c = str;
            this.f149762d = str2;
            this.f149763e = str3;
            this.f149764f = function0;
            this.f149765g = str4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            return Unit.f143329a;
        }

        public final void b(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(848413672, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.ChokeWarningAlert.<anonymous> (ChokeWarningAlert.kt:53)");
            }
            LocalThemeScope localThemeScope = this.f149759a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: lm.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15526g.a.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17265b.b(localThemeScope, modalTemplate, (Function0) objB, null, ComposableLambdaKt.c(-1523918565, true, new C2307a(this.f149760b, this.f149759a, this.f149761c, this.f149762d, this.f149763e, this.f149764f, this.f149765g), composer, 54), composer, LocalThemeScope.f17314g | 24960 | (q1.ModalTemplate.f142363d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f143329a;
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
    public static final void b(final Ki.LocalThemeScope r14, final java.lang.String r15, final java.lang.String r16, final java.lang.String r17, final java.lang.String r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.C15526g.b(Ki.M, java.lang.String, java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, str3, str4, modifier, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
