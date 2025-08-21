package In;

import F1.t;
import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import Wq.a;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.Locale;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p1.C16338g;
import pk.StoreDetails;
import qi.C16671b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u001aI\u0010\f\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000e\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0012\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u000f\u001a9\u0010\u0013\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0013\u0010\u000f\u001a9\u0010\u0014\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u000f\u001a9\u0010\u0015\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LIn/J;", "viewState", "", "showGasStationPrices", "Lkotlin/Function1;", "LWq/a;", "", "onAction", "isNewAddressQualifierUIEnabled", "M", "(LKi/M;Landroidx/compose/ui/Modifier;LIn/J;ZLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "K", "(LKi/M;Landroidx/compose/ui/Modifier;LIn/J;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "w", "(LKi/M;Landroidx/compose/ui/Modifier;LIn/J;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "y", "E", "T", "O", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class I {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15080a;

        a(LocalThemeScope localThemeScope) {
            this.f15080a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-188086368, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.MapSection.<anonymous>.<anonymous>.<anonymous> (StoreDetailScreen.kt:158)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f15080a.getAdsSpacing().getFive().getDp());
            e.b bVarG = P0.e.INSTANCE.g();
            LocalThemeScope localThemeScope = this.f15080a;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), bVarG, composer, 48);
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
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.h.k.f17018e, null, null, null, 0.0f, null, null, 124, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
            String upperCase = C16338g.c(Vq.c.f40159b, composer, 0).toUpperCase(Locale.ROOT);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            si.j.h(localThemeScope, label, upperCase, null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15081a;

        b(LocalThemeScope localThemeScope) {
            this.f15081a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1379570729, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.MapSection.<anonymous>.<anonymous>.<anonymous> (StoreDetailScreen.kt:201)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f15081a.getAdsSpacing().getFive().getDp());
            e.b bVarG = P0.e.INSTANCE.g();
            LocalThemeScope localThemeScope = this.f15081a;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), bVarG, composer, 48);
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
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.c.f.f16946e, null, null, null, 0.0f, null, null, 124, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
            String upperCase = C16338g.c(Vq.c.f40139I, composer, 0).toUpperCase(Locale.ROOT);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            si.j.h(localThemeScope, label, upperCase, null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15082a;

        c(LocalThemeScope localThemeScope) {
            this.f15082a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(3266072, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.MapSectionNew.<anonymous>.<anonymous>.<anonymous> (StoreDetailScreen.kt:260)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f15082a.getAdsSpacing().getSeven().getDp());
            e.c cVarI = P0.e.INSTANCE.i();
            C5800d.f fVarB = C5800d.f48779a.b();
            LocalThemeScope localThemeScope = this.f15082a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarB, cVarI, composer, 54);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.h.k.f17018e, null, null, null, 0.0f, null, null, 124, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(Vq.c.f40159b, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15083a;

        d(LocalThemeScope localThemeScope) {
            this.f15083a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1897598335, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.MapSectionNew.<anonymous>.<anonymous>.<anonymous> (StoreDetailScreen.kt:304)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f15083a.getAdsSpacing().getSeven().getDp());
            e.c cVarI = P0.e.INSTANCE.i();
            C5800d.f fVarB = C5800d.f48779a.b();
            LocalThemeScope localThemeScope = this.f15083a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarB, cVarI, composer, 54);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.c.f.f16946e, null, null, null, 0.0f, null, null, 124, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(Vq.c.f40139I, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15084a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StoreDetailState f15085b;

        e(LocalThemeScope localThemeScope, StoreDetailState j10) {
            this.f15084a = localThemeScope;
            this.f15085b = j10;
        }

        public final void a(Composer composer, int i10) {
            Composer composer2;
            LocalThemeScope localThemeScope;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1478808811, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.StoreDetailSection.<anonymous>.<anonymous> (StoreDetailScreen.kt:549)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 20;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, H1.h.p(f10), H1.h.p(10));
            LocalThemeScope localThemeScope2 = this.f15084a;
            StoreDetailState j10 = this.f15085b;
            C5800d c5800d = C5800d.f48779a;
            C5800d.e eVarG = c5800d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, companion2.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.c.k.f16951e, C16338g.c(Vq.c.f40170g0, composer, 0), null, null, 0.0f, null, null, 124, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope2, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f10)), composer, 6);
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
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
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
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
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            StoreDetails storeDetailsU = j10.getStoreDetails();
            String name = storeDetailsU != null ? storeDetailsU.getName() : null;
            if (name == null || StringsKt.s0(name)) {
                name = null;
            }
            composer.startReplaceGroup(342097751);
            if (name == null) {
                composer2 = composer;
                localThemeScope = localThemeScope2;
            } else {
                Ki.I six = localThemeScope2.getAdsTypography().getHeadings().getSix();
                Modifier modifierB = InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null);
                companion = companion;
                composer2 = composer;
                localThemeScope = localThemeScope2;
                si.j.h(localThemeScope, new q1.Label(modifierB, null, null, null, F1.t.INSTANCE.b(), false, 1, six, null, HttpResponseStatus.REDIRECTION_FOUND, null), name, null, composer2, i11 | (q1.Label.f142335j << 3), 4);
                Unit unit = Unit.f143329a;
            }
            composer2.P();
            String strM = j10.m();
            String str = (strM == null || StringsKt.s0(strM)) ? null : strM;
            composer2.startReplaceGroup(342117592);
            if (str != null) {
                si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 381, null), str, null, composer2, i11 | (q1.Label.f142335j << 3), 4);
                Unit unit2 = Unit.f143329a;
            }
            composer2.P();
            composer2.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer2, 0);
            String strC = j10.c();
            String str2 = (strC == null || StringsKt.s0(strC)) ? null : strC;
            composer2.startReplaceGroup(1796243403);
            if (str2 != null) {
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, F1.t.INSTANCE.b(), false, 2, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, HttpResponseStatus.REDIRECTION_SEE_OTHER, null), str2, null, composer2, i11 | (q1.Label.f142335j << 3), 4);
                Unit unit3 = Unit.f143329a;
            }
            composer.P();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15086a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15087b;

        f(LocalThemeScope localThemeScope, String str) {
            this.f15086a = localThemeScope;
            this.f15087b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(414015906, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.StoreDetailSection.<anonymous>.<anonymous>.<anonymous> (StoreDetailScreen.kt:622)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 20;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(f10), this.f15086a.getAdsSpacing().getFive().getDp());
            e.c cVarI = P0.e.INSTANCE.i();
            LocalThemeScope localThemeScope = this.f15086a;
            String str = this.f15087b;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.h.k.f17018e, C16338g.c(Vq.c.f40165e, composer, 0), null, null, 0.0f, null, null, 124, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f10)), composer, 6);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), str, null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15088a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StoreDetailState f15089b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15090c;

        g(LocalThemeScope localThemeScope, StoreDetailState j10, String str) {
            this.f15088a = localThemeScope;
            this.f15089b = j10;
            this.f15090c = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-455686596, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.StoreDetailSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StoreDetailScreen.kt:718)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 20;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, H1.h.p(f10), this.f15088a.getAdsSpacing().getFive().getDp());
            e.c cVarI = P0.e.INSTANCE.i();
            LocalThemeScope localThemeScope = this.f15088a;
            StoreDetailState j10 = this.f15089b;
            String str = this.f15090c;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.h.k.f17018e, C16338g.c(j10.j(), composer, 0), null, null, 0.0f, null, null, 124, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f10)), composer, 6);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), str, null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15091a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StoreDetailState f15092b;

        h(LocalThemeScope localThemeScope, StoreDetailState j10) {
            this.f15091a = localThemeScope;
            this.f15092b = j10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(933167747, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.StoreDetailSectionNew.<anonymous>.<anonymous> (StoreDetailScreen.kt:350)");
            }
            LocalThemeScope localThemeScope = this.f15091a;
            StoreDetailState j10 = this.f15092b;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            Ki.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
            t.Companion companion3 = F1.t.INSTANCE;
            q1.Label label = new q1.Label(modifierM, null, null, null, companion3.b(), false, 0, eight, null, 366, null);
            String strC = C16338g.c(Vq.c.f40157a, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            String strC2 = j10.c();
            if (strC2 == null || StringsKt.s0(strC2)) {
                strC2 = null;
            }
            String str = strC2;
            composer.startReplaceGroup(-1319890705);
            if (str != null) {
                Ki.I two = localThemeScope.getAdsTypography().getBodyCompact().getTwo();
                si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 7, null), localThemeScope.getAdsColors().getAdsColorText02(), null, null, companion3.b(), false, 0, two, null, 364, null), str, null, composer, i11 | (i12 << 3), 4);
            }
            composer.P();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15093a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15094b;

        i(LocalThemeScope localThemeScope, String str) {
            this.f15093a = localThemeScope;
            this.f15094b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1448682710, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.StoreDetailSectionNew.<anonymous>.<anonymous>.<anonymous> (StoreDetailScreen.kt:399)");
            }
            LocalThemeScope localThemeScope = this.f15093a;
            String str = this.f15094b;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            Ki.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
            t.Companion companion3 = F1.t.INSTANCE;
            q1.Label label = new q1.Label(modifierM, null, null, null, companion3.b(), false, 0, eight, null, 366, null);
            String strC = C16338g.c(Vq.c.f40132B, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            Ki.I two = localThemeScope.getAdsTypography().getBodyCompact().getTwo();
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 7, null), localThemeScope.getAdsColors().getAdsColorEnabled01(), null, null, companion3.b(), false, 0, two, null, 364, null), str, null, composer, i11 | (i12 << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15095a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15096b;

        j(LocalThemeScope localThemeScope, String str) {
            this.f15095a = localThemeScope;
            this.f15096b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(73971358, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.StoreDetailSectionNew.<anonymous>.<anonymous>.<anonymous> (StoreDetailScreen.kt:479)");
            }
            LocalThemeScope localThemeScope = this.f15095a;
            String str = this.f15096b;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            Ki.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
            t.Companion companion3 = F1.t.INSTANCE;
            q1.Label label = new q1.Label(modifierM, null, null, null, companion3.b(), false, 1, eight, null, HttpResponseStatus.REDIRECTION_FOUND, null);
            String strC = C16338g.c(Vq.c.f40131A, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            Ki.I two = localThemeScope.getAdsTypography().getBodyCompact().getTwo();
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 7, null), localThemeScope.getAdsColors().getAdsColorEnabled01(), null, null, companion3.b(), false, 0, two, null, 364, null), str, null, composer, i11 | (i12 << 3), 4);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, Modifier modifier, StoreDetailState j10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, modifier, j10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(Ki.LocalThemeScope r31, androidx.compose.ui.Modifier r32, final In.StoreDetailState r33, final kotlin.jvm.functions.Function1<? super Wq.a, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: In.I.E(Ki.M, androidx.compose.ui.Modifier, In.J, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, Modifier modifier, StoreDetailState j10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, modifier, j10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void K(final LocalThemeScope localThemeScope, Modifier modifier, final StoreDetailState viewState, final Function1<? super Wq.a, Unit> onAction, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewState, "viewState");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-294464964);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(viewState) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onAction) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-294464964, i12, -1, "com.meijer.mobile.meijer.activity.store.compose.StoreDetailNewScreen (StoreDetailScreen.kt:86)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            int i14 = LocalThemeScope.f17314g;
            int i15 = i12 & 14;
            int i16 = i12 & 896;
            int i17 = i12 & 7168;
            E(localThemeScope, null, viewState, onAction, composerStartRestartGroup, i14 | i15 | i16 | i17, 1);
            T(localThemeScope, null, viewState, onAction, composerStartRestartGroup, i14 | i15 | i16 | i17, 1);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: In.A
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I.L(localThemeScope, modifier2, viewState, onAction, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(LocalThemeScope localThemeScope, Modifier modifier, StoreDetailState j10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        K(localThemeScope, modifier, j10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void M(final LocalThemeScope localThemeScope, Modifier modifier, final StoreDetailState viewState, final boolean z10, final Function1<? super Wq.a, Unit> onAction, final boolean z11, Composer composer, final int i10, final int i11) {
        int i12;
        Modifier modifier2;
        final Modifier modifier3;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewState, "viewState");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2140223060);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(viewState) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onAction) ? 16384 : 8192;
        }
        if ((i11 & 16) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i12 |= composerStartRestartGroup.a(z11) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier3 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2140223060, i12, -1, "com.meijer.mobile.meijer.activity.store.compose.StoreDetailScreen (StoreDetailScreen.kt:64)");
            }
            if (z11) {
                composerStartRestartGroup.startReplaceGroup(-595375133);
                int i14 = LocalThemeScope.f17314g | (i12 & 14) | (i12 & 112) | (i12 & 896) | ((i12 >> 3) & 7168);
                modifier2 = modifier;
                K(localThemeScope, modifier2, viewState, onAction, composerStartRestartGroup, i14, 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-595221497);
                int i15 = LocalThemeScope.f17314g | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344);
                modifier2 = modifier;
                w(localThemeScope, modifier2, viewState, z10, onAction, composerStartRestartGroup, i15, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier3 = modifier2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: In.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I.N(localThemeScope, modifier3, viewState, z10, onAction, z11, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(LocalThemeScope localThemeScope, Modifier modifier, StoreDetailState j10, boolean z10, Function1 function1, boolean z11, int i10, int i11, Composer composer, int i12) {
        M(localThemeScope, modifier, j10, z10, function1, z11, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O(final Ki.LocalThemeScope r44, androidx.compose.ui.Modifier r45, final In.StoreDetailState r46, final kotlin.jvm.functions.Function1<? super Wq.a, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 2069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: In.I.O(Ki.M, androidx.compose.ui.Modifier, In.J, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(LocalThemeScope localThemeScope, Modifier modifier, StoreDetailState j10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        O(localThemeScope, modifier, j10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T(final Ki.LocalThemeScope r45, androidx.compose.ui.Modifier r46, final In.StoreDetailState r47, final kotlin.jvm.functions.Function1<? super Wq.a, kotlin.Unit> r48, androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: In.I.T(Ki.M, androidx.compose.ui.Modifier, In.J, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(LocalThemeScope localThemeScope, Modifier modifier, StoreDetailState j10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        T(localThemeScope, modifier, j10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final Ki.LocalThemeScope r23, androidx.compose.ui.Modifier r24, final In.StoreDetailState r25, final boolean r26, final kotlin.jvm.functions.Function1<? super Wq.a, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: In.I.w(Ki.M, androidx.compose.ui.Modifier, In.J, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, StoreDetailState j10, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, modifier, j10, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(Ki.LocalThemeScope r31, androidx.compose.ui.Modifier r32, final In.StoreDetailState r33, final kotlin.jvm.functions.Function1<? super Wq.a, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: In.I.y(Ki.M, androidx.compose.ui.Modifier, In.J, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(StoreDetailState j10, Function1 function1) {
        StoreDetails storeDetailsU = j10.getStoreDetails();
        if (storeDetailsU != null) {
            function1.invoke(new a.ShowDirections(storeDetailsU, j10.getStoreSearchType(), 0, 0, 12, null));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(StoreDetailState j10, Function1 function1) {
        StoreDetails storeDetailsU = j10.getStoreDetails();
        if (storeDetailsU != null) {
            function1.invoke(new a.PhoneCall(storeDetailsU, j10.getStoreSearchType(), 0, 0, j10.v(), 12, null));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(StoreDetailState j10, Function1 function1) {
        StoreDetails storeDetailsU = j10.getStoreDetails();
        if (storeDetailsU != null) {
            function1.invoke(new a.PhoneCall(storeDetailsU, j10.getStoreSearchType(), 0, 0, j10.v(), 12, null));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(StoreDetailState j10, Function1 function1) {
        StoreDetails storeDetailsU = j10.getStoreDetails();
        if (storeDetailsU != null) {
            function1.invoke(new a.ShowDirections(storeDetailsU, j10.getStoreSearchType(), 0, 0, 12, null));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(StoreDetailState j10, Function1 function1, String str) {
        StoreDetails storeDetailsU = j10.getStoreDetails();
        if (storeDetailsU != null) {
            function1.invoke(new a.PhoneCall(storeDetailsU, j10.getStoreSearchType(), 0, 0, str, 12, null));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(Function1 function1, StoreDetailState j10, String str) {
        function1.invoke(new a.PhoneCall(j10.getStoreDetails(), j10.getStoreSearchType(), 0, 0, str, 12, null));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(StoreDetailState j10, Function1 function1, String str) {
        StoreDetails storeDetailsU = j10.getStoreDetails();
        if (storeDetailsU != null) {
            function1.invoke(new a.PhoneCall(storeDetailsU, j10.getStoreSearchType(), 0, 0, str, 12, null));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(StoreDetailState j10, Function1 function1, String str) {
        StoreDetails storeDetailsU = j10.getStoreDetails();
        if (storeDetailsU != null) {
            function1.invoke(new a.PhoneCall(storeDetailsU, j10.getStoreSearchType(), 0, 0, str, 12, null));
        }
        return Unit.f143329a;
    }
}
