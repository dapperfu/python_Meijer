package lm;

import Ki.LocalThemeScope;
import Ki.Q;
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
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import ki.C15158a0;
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

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aC\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\u000e\u0010\f\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "title", "message", "dismissButtonText", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onDismiss", "b", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: lm.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15523d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lm.d$a */
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149736a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149737b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f149738c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f149739d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f149740e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f149741f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: lm.d$a$a, reason: collision with other inner class name */
        static final class C2306a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f149742a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f149743b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0 f149744c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f149745d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f149746e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f149747f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f149748g;

            C2306a(Modifier modifier, LocalThemeScope localThemeScope, R0 r02, String str, String str2, String str3, Function0<Unit> function0) {
                this.f149742a = modifier;
                this.f149743b = localThemeScope;
                this.f149744c = r02;
                this.f149745d = str;
                this.f149746e = str2;
                this.f149747f = str3;
                this.f149748g = function0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1448074502, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.CartLoadFailedAlert.<anonymous>.<anonymous> (CartLoadFailedAlert.kt:51)");
                }
                Modifier modifierK = D.k(this.f149742a, this.f149743b.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f149743b;
                R0 r02 = this.f149744c;
                String str = this.f149745d;
                String str2 = this.f149746e;
                Modifier modifier = this.f149742a;
                String str3 = this.f149747f;
                Function0<Unit> function0 = this.f149748g;
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
                q1.Label heading = r02.getLabels().getHeading();
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, heading, str, null, composer, (i12 << 3) | i11, 4);
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                si.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null), str2, null, composer, i11 | (i12 << 3), 4);
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
                Modifier modifierH = J.h(modifier, 0.0f, 1, null);
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
                P0.k(localThemeScope, C16208z0.f154285a, str3, function0, null, null, false, 0L, false, composer, i11 | (C16208z0.f154286b << 3), 248);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, Modifier modifier, String str, String str2, String str3) {
            this.f149736a = localThemeScope;
            this.f149737b = function0;
            this.f149738c = modifier;
            this.f149739d = str;
            this.f149740e = str2;
            this.f149741f = str3;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1195552525, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.CartLoadFailedAlert.<anonymous> (CartLoadFailedAlert.kt:47)");
            }
            LocalThemeScope localThemeScope = this.f149736a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f149737b;
            C17265b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(-1448074502, true, new C2306a(this.f149738c, this.f149736a, Assemble, this.f149739d, this.f149740e, this.f149741f, function0), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
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

    public static final void b(final LocalThemeScope localThemeScope, final String title, final String message, final String dismissButtonText, Modifier modifier, final Function0<Unit> onDismiss, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(title, "title");
        Intrinsics.j(message, "message");
        Intrinsics.j(dismissButtonText, "dismissButtonText");
        Intrinsics.j(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-189321656);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(title) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(message) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(dismissButtonText) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 16384 : 8192;
        }
        if ((i11 & 16) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i12 |= composerStartRestartGroup.D(onDismiss) ? 131072 : 65536;
        }
        int i14 = i12;
        if ((74899 & i14) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-189321656, i14, -1, "com.meijer.mobile.home.ux.views.alertdialogs.CartLoadFailedAlert (CartLoadFailedAlert.kt:45)");
            }
            Q.e(localThemeScope, C15158a0.f142009a, ComposableLambdaKt.c(1195552525, true, new a(localThemeScope, onDismiss, modifier3, title, message, dismissButtonText), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i14 & 14) | (C15158a0.f142010b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lm.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15523d.c(localThemeScope, title, message, dismissButtonText, modifier2, onDismiss, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, String str3, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, str3, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
