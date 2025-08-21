package lm;

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

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a_\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "bodyText", "button1Label", "button2Label", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "button1Action", "button2Action", "onDismissRequest", "b", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: lm.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15521b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lm.b$a */
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149712a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149713b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f149714c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f149715d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f149716e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149717f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f149718g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149719h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: lm.b$a$a, reason: collision with other inner class name */
        static final class C2305a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f149720a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f149721b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0 f149722c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f149723d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f149724e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f149725f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f149726g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f149727h;

            C2305a(Modifier modifier, LocalThemeScope localThemeScope, R0 r02, String str, String str2, Function0<Unit> function0, String str3, Function0<Unit> function02) {
                this.f149720a = modifier;
                this.f149721b = localThemeScope;
                this.f149722c = r02;
                this.f149723d = str;
                this.f149724e = str2;
                this.f149725f = function0;
                this.f149726g = str3;
                this.f149727h = function02;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1373443342, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.AlertDialogNoTitle.<anonymous>.<anonymous> (AlertDialogNoTitle.kt:50)");
                }
                Modifier modifierI = D.i(this.f149720a, this.f149721b.getAdsSpacing().getFive().getDp());
                LocalThemeScope localThemeScope = this.f149721b;
                R0 r02 = this.f149722c;
                String str = this.f149723d;
                String str2 = this.f149724e;
                Function0<Unit> function0 = this.f149725f;
                String str3 = this.f149726g;
                Function0<Unit> function02 = this.f149727h;
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
                q1.Label labelY = q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null);
                int i11 = LocalThemeScope.f17314g;
                si.j.h(localThemeScope, labelY, str, null, composer, i11 | (q1.Label.f142335j << 3), 4);
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getSix().getDp()), composer, 0);
                Modifier modifierH = J.h(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = G.b(c5800d.c(), companion.l(), composer, 6);
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
                int i12 = C16208z0.f154286b;
                P0.k(localThemeScope, c16208z0, str2, function0, null, null, false, 0L, false, composer, i11 | (i12 << 3), 248);
                P0.k(localThemeScope, c16208z0, str3, function02, null, null, false, 0L, false, composer, i11 | (i12 << 3), 248);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, Modifier modifier, String str, String str2, Function0<Unit> function02, String str3, Function0<Unit> function03) {
            this.f149712a = localThemeScope;
            this.f149713b = function0;
            this.f149714c = modifier;
            this.f149715d = str;
            this.f149716e = str2;
            this.f149717f = function02;
            this.f149718g = str3;
            this.f149719h = function03;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-536223135, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.AlertDialogNoTitle.<anonymous> (AlertDialogNoTitle.kt:49)");
            }
            C17265b.b(this.f149712a, Assemble.getModalTemplate(), this.f149713b, null, ComposableLambdaKt.c(1373443342, true, new C2305a(this.f149714c, this.f149712a, Assemble, this.f149715d, this.f149716e, this.f149717f, this.f149718g, this.f149719h), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
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
    public static final void b(final Ki.LocalThemeScope r14, final java.lang.String r15, final java.lang.String r16, final java.lang.String r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.C15521b.b(Ki.M, java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, String str3, Modifier modifier, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, str3, modifier, function0, function02, function03, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
