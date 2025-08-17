package Nm;

import Ji.LocalThemeScope;
import Nm.K;
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
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.Locale;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15874z0;
import p1.C16193g;
import si.C16977b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "message", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onDone", "onCallSupport", "b", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class K {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<ji.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f22307a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22308b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22309c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22310d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Nm.K$a$a, reason: collision with other inner class name */
        static final class C0359a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f22311a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ji.R0 f22312b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f22313c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22314d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22315e;

            C0359a(LocalThemeScope localThemeScope, ji.R0 r02, String str, Function0<Unit> function0, Function0<Unit> function02) {
                this.f22311a = localThemeScope;
                this.f22312b = r02;
                this.f22313c = str;
                this.f22314d = function0;
                this.f22315e = function02;
            }

            public final void c(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(824333742, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationErrorMessageModal.<anonymous>.<anonymous>.<anonymous> (SelfRemediationErrorMessageModal.kt:51)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, this.f22311a.getAdsSpacing().getSix().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f22311a;
                ji.R0 r02 = this.f22312b;
                String str = this.f22313c;
                final Function0<Unit> function0 = this.f22314d;
                final Function0<Unit> function02 = this.f22315e;
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
                String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100241od, composer, 0);
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, heading, strC, null, composer, i11 | (i12 << 3), 4);
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                ri.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null), str, null, composer, i11 | (i12 << 3), 4);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
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
                D1.c(composerA2, measurePolicyB, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion, 1.0f, false, 2, null), composer, 0);
                C15874z0 c15874z0 = C15874z0.f151826a;
                String strC2 = C16193g.c(com.meijer.mobile.meijer.Y.f99741P1, composer, 0);
                Locale locale = Locale.ROOT;
                String upperCase = strC2.toUpperCase(locale);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function0);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Nm.I
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.a.C0359a.d(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i13 = C15874z0.f151827b;
                ni.P0.k(localThemeScope, c15874z0, upperCase, (Function0) objB, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
                String upperCase2 = C16193g.c(com.meijer.mobile.meijer.Y.f99458A3, composer, 0).toUpperCase(locale);
                Intrinsics.i(upperCase2, "toUpperCase(...)");
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(function02);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Nm.J
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.a.C0359a.e(function02);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                ni.P0.k(localThemeScope, c15874z0, upperCase2, (Function0) objB2, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
                composer.v();
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str, Function0<Unit> function02) {
            this.f22307a = localThemeScope;
            this.f22308b = function0;
            this.f22309c = str;
            this.f22310d = function02;
        }

        public final void b(ji.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1140060155, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationErrorMessageModal.<anonymous>.<anonymous> (SelfRemediationErrorMessageModal.kt:47)");
            }
            LocalThemeScope localThemeScope = this.f22307a;
            q1.ModalTemplate modalTemplateP = Assemble.getModalTemplate();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f22308b);
            final Function0<Unit> function0 = this.f22308b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Nm.H
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return K.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C16977b.b(localThemeScope, modalTemplateP, (Function0) objB, null, ComposableLambdaKt.c(824333742, true, new C0359a(this.f22307a, Assemble, this.f22309c, this.f22310d, this.f22308b), composer, 54), composer, LocalThemeScope.f15770g | 24576 | (q1.ModalTemplate.f140108d << 3), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r14, final java.lang.String r15, androidx.compose.ui.Modifier r16, final kotlin.jvm.functions.Function0<kotlin.Unit> r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nm.K.b(Ji.M, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, modifier, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
