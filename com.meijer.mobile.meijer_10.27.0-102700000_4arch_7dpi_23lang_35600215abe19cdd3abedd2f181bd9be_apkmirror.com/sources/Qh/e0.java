package Qh;

import Hk.Validation;
import Ih.C3745m;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import Qh.e0;
import Zh.d;
import ak.AbstractC5607a;
import ak.C5608b;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.profile.a;
import com.meijer.mobile.accounts.ux.profile.l;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import d0.C13457y;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import java.util.Iterator;
import ji.DefaultTextInputs;
import ji.InterfaceC14919W;
import ji.InterfaceC14932e0;
import ji.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p1.C16190d;
import p1.C16193g;
import r0.C16692i;
import r1.C16705m;
import yr.C18299z;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aM\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001c\u0010\u0014\u001a1\u0010\u001f\u001a\u00020\u0007*\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u0017\u001a\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010!\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b!\u0010\u0014\u001a_\u0010(\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b(\u0010)\u001aC\u0010*\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b*\u0010+¨\u00061²\u0006\u000e\u0010,\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010.\u001a\u00020-8\nX\u008a\u0084\u0002²\u0006\u0010\u0010/\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/profile/l$e;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/profile/a;", "", "onResourceAction", "LFh/a;", "onNavigationRequest", "s", "(LJi/M;Lcom/meijer/mobile/accounts/ux/profile/l$e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isQuickIDEnabled", "Lak/a;", "error", "K", "(LJi/M;ZLak/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "A", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "header", "description", "LJi/C;", BarcodePickDeserializer.FIELD_ICON, "y", "(LJi/M;Ljava/lang/String;Ljava/lang/String;LJi/C;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "E", "", "image", "C", "(LJi/M;IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "q", "label", "pin", "errorMessage", "Landroidx/compose/ui/focus/o;", "focusManager", "onValueChange", "I", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Lak/a;Landroidx/compose/ui/focus/o;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "G", "(LJi/M;Lcom/meijer/mobile/accounts/ux/profile/l$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "isExpanded", "", "rotationState", "lastAction", "enableSaveButton", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class e0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f30165f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f30165f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f30165f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f30166f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f30167g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f30168h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f30169i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30170j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f30171k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f30172l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, l.ProfileScreenViewState profileScreenViewState, LocalThemeScope localThemeScope, Function1 function1, Function1 function12) {
            super(2);
            this.f30167g = nVar;
            this.f30168h = function0;
            this.f30169i = profileScreenViewState;
            this.f30170j = localThemeScope;
            this.f30171k = function1;
            this.f30172l = function12;
            this.f30166f = i10;
        }

        public final void a(Composer composer, int i10) {
            Object next;
            L1.h hVar;
            L1.h hVar2;
            L1.h hVar3;
            int i11;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f30167g.getHelpersHashCode();
            this.f30167g.i();
            L1.n nVar = this.f30167g;
            composer.startReplaceGroup(-695940966);
            Iterator<T> it = this.f30169i.getSavedMperksInformation().h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.e(((Oj.a) next).getKey(), "mperks pin")) {
                        break;
                    }
                }
            }
            Oj.a aVar = (Oj.a) next;
            AbstractC5607a message = aVar != null ? aVar.getMessage() : null;
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            L1.h hVarF = bVarM.f();
            L1.h hVarG = bVarM.g();
            composer.startReplaceGroup(1778671525);
            if (C5608b.a(message)) {
                hVar = hVarG;
                hVar2 = hVarF;
                hVar3 = hVarD;
                i11 = 5004770;
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1746271574);
                boolean zV = composer.V(hVarD) | composer.D(this.f30170j) | composer.V(hVarE);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new c(hVarD, this.f30170j, hVarE);
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion, hVarG, (Function1) objB);
                LocalThemeScope localThemeScope = this.f30170j;
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(this.f30171k);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new e(this.f30171k);
                    composer.t(objB2);
                }
                composer.P();
                hVar2 = hVarF;
                hVar = hVarG;
                hVar3 = hVarD;
                i11 = 5004770;
                Ph.o.b(localThemeScope, message, modifierK, (Function0) objB2, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 0);
            }
            composer.P();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(i11);
            boolean zD = composer.D(this.f30170j);
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                objB3 = new f(this.f30170j);
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK2 = nVar.k(companion2, hVarA, (Function1) objB3);
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion3.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK2);
            InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyA, companion4.e());
            D1.c(composerA, interfaceC5742sR, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C14815g c14815g = C14815g.f139108a;
            LocalThemeScope localThemeScope2 = this.f30170j;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f30170j.getAdsTypography().getHeadings().getSeven(), null, 383, null);
            String strC = C16193g.c(Fh.h.f10557M, composer, 0);
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            AbstractC5607a abstractC5607a = message;
            ri.j.h(localThemeScope2, label, strC, null, composer, i12 | (i13 << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion2, this.f30170j.getAdsSpacing().getTwo().getDp()), composer, 0);
            ri.j.h(this.f30170j, new q1.Label(null, null, null, null, 0, false, 0, this.f30170j.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), C16193g.c(Fh.h.f10763p2, composer, 0), null, composer, i12 | (i13 << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion2, this.f30170j.getAdsSpacing().getFive().getDp()), composer, 0);
            L1.h hVar4 = hVar3;
            L1.h hVar5 = hVar2;
            L1.h hVar6 = hVar;
            C13457y.a(C16190d.c(Fh.e.f10468x, composer, 0), null, c14815g.c(companion2, companion3.g()), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
            composer.v();
            composer.startReplaceGroup(-1633490746);
            boolean zV3 = composer.V(hVarA) | composer.D(this.f30170j);
            Object objB4 = composer.B();
            if (zV3 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new g(hVarA, this.f30170j);
                composer.t(objB4);
            }
            composer.P();
            Modifier modifierK3 = nVar.k(companion2, hVarC, (Function1) objB4);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion3.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK3);
            Function0<InterfaceC5811g> function0A2 = companion4.a();
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
            D1.c(composerA2, measurePolicyB, companion4.e());
            D1.c(composerA2, interfaceC5742sR2, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            ri.j.h(this.f30170j, new q1.Label(C14801J.f139030a.d(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(0), 0.0f, 0.0f, 0.0f, 14, null), companion3.i()), null, null, null, 0, false, 0, this.f30170j.getAdsTypography().getHeadings().getSeven(), null, 382, null), C16193g.c(Fh.h.f10707h2, composer, 0), null, composer, i12 | (i13 << 3), 4);
            composer.v();
            LocalThemeScope localThemeScope3 = this.f30170j;
            composer.startReplaceGroup(-1633490746);
            boolean zV4 = composer.V(hVarC) | composer.D(this.f30170j);
            Object objB5 = composer.B();
            if (zV4 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new h(hVarC, this.f30170j);
                composer.t(objB5);
            }
            composer.P();
            ri.j.h(localThemeScope3, new q1.Label(nVar.k(companion2, hVar4, (Function1) objB5), null, null, null, 0, false, 0, this.f30170j.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C16193g.c(Fh.h.f10551L0, composer, 0), null, composer, i12 | (i13 << 3), 4);
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = composer.D(abstractC5607a) | composer.V(hVar6) | composer.V(hVar4) | composer.D(this.f30170j);
            Object objB6 = composer.B();
            if (zD2 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new i(abstractC5607a, hVar6, hVar4, this.f30170j);
                composer.t(objB6);
            }
            composer.P();
            Modifier modifierD = androidx.compose.foundation.b.d(T0.e.a(nVar.k(companion2, hVarE, (Function1) objB6), C16692i.c(this.f30170j.getAdsCornerRadii().getRadius03().getDp())), this.f30170j.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion3.k(), composer, 0);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierD);
            Function0<InterfaceC5811g> function0A3 = companion4.a();
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
            D1.c(composerA3, measurePolicyA2, companion4.e());
            D1.c(composerA3, interfaceC5742sR3, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion4.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion4.f());
            C14802K.a(androidx.compose.foundation.layout.J.i(companion2, this.f30170j.getAdsSpacing().getFive().getDp()), composer, 0);
            String strC2 = C16193g.c(Fh.h.f10650Z1, composer, 0);
            String strE = this.f30169i.getUnsavedMperksInformation().getCurrentPin().c().e();
            AbstractC5607a abstractC5607aB = this.f30169i.getUnsavedMperksInformation().getCurrentPin().b();
            Modifier modifierF = C18299z.f(androidx.compose.foundation.layout.D.k(companion2, this.f30170j.getAdsSpacing().getThree().getDp(), 0.0f, 2, null), "current_pin_input_field", null, 2, null);
            InterfaceC5772o interfaceC5772o = (InterfaceC5772o) composer.o(C5892t0.h());
            LocalThemeScope localThemeScope4 = this.f30170j;
            composer.startReplaceGroup(5004770);
            boolean zV5 = composer.V(this.f30171k);
            Object objB7 = composer.B();
            if (zV5 || objB7 == Composer.INSTANCE.a()) {
                objB7 = new j(this.f30171k);
                composer.t(objB7);
            }
            composer.P();
            int i14 = AbstractC5607a.f45514b;
            e0.I(localThemeScope4, strC2, strE, abstractC5607aB, interfaceC5772o, modifierF, null, (Function1) objB7, composer, i12 | (i14 << 9), 32);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion2, this.f30170j.getAdsSpacing().getFive().getDp()), composer, 0);
            String strC3 = C16193g.c(Fh.h.f10686e2, composer, 0);
            String strE2 = this.f30169i.getUnsavedMperksInformation().getNewPin().c().e();
            AbstractC5607a abstractC5607aB2 = this.f30169i.getUnsavedMperksInformation().getNewPin().b();
            Modifier modifierF2 = C18299z.f(androidx.compose.foundation.layout.D.k(companion2, this.f30170j.getAdsSpacing().getThree().getDp(), 0.0f, 2, null), "new_pin_input_field", null, 2, null);
            String strC4 = C16193g.c(Fh.h.f10679d2, composer, 0);
            InterfaceC5772o interfaceC5772o2 = (InterfaceC5772o) composer.o(C5892t0.h());
            LocalThemeScope localThemeScope5 = this.f30170j;
            composer.startReplaceGroup(5004770);
            boolean zV6 = composer.V(this.f30171k);
            Object objB8 = composer.B();
            if (zV6 || objB8 == Composer.INSTANCE.a()) {
                objB8 = new k(this.f30171k);
                composer.t(objB8);
            }
            composer.P();
            e0.I(localThemeScope5, strC3, strE2, abstractC5607aB2, interfaceC5772o2, modifierF2, strC4, (Function1) objB8, composer, i12 | (i14 << 9), 0);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion2, this.f30170j.getAdsSpacing().getFive().getDp()), composer, 0);
            composer.v();
            LocalThemeScope localThemeScope6 = this.f30170j;
            composer.startReplaceGroup(-1633490746);
            boolean zV7 = composer.V(hVarE) | composer.D(this.f30170j);
            Object objB9 = composer.B();
            if (zV7 || objB9 == Composer.INSTANCE.a()) {
                objB9 = new d(hVarE, this.f30170j);
                composer.t(objB9);
            }
            composer.P();
            C3745m.d(localThemeScope6, nVar.k(companion2, hVar5, (Function1) objB9), C16193g.c(Fh.h.f10755o1, composer, 0), this.f30172l, composer, i12, 0);
            composer.P();
            if (this.f30167g.getHelpersHashCode() != helpersHashCode) {
                this.f30168h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f30173a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30174b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f30175c;

        c(L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2) {
            this.f30173a = hVar;
            this.f30174b = localThemeScope;
            this.f30175c = hVar2;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f30173a.getBottom(), this.f30174b.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getBottom(), this.f30175c.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f30174b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f30174b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f30176a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30177b;

        d(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f30176a = hVar;
            this.f30177b = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f30176a.getBottom(), this.f30177b.getAdsSpacing().getEight().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f30177b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f30177b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f30178a;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
            this.f30178a = function1;
        }

        public final void a() {
            this.f30178a.invoke(new a.DismissErrorNotification(false, true, 1, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30179a;

        f(LocalThemeScope localThemeScope) {
            this.f30179a = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), this.f30179a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f30179a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f30179a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f30180a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30181b;

        g(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f30180a = hVar;
            this.f30181b = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f30180a.getBottom(), this.f30181b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f30181b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f30182a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30183b;

        h(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f30182a = hVar;
            this.f30183b = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f30182a.getBottom(), this.f30183b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f30183b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f30183b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f30184a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f30185b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f30186c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30187d;

        i(AbstractC5607a abstractC5607a, L1.h hVar, L1.h hVar2, LocalThemeScope localThemeScope) {
            this.f30184a = abstractC5607a;
            this.f30185b = hVar;
            this.f30186c = hVar2;
            this.f30187d = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), !C5608b.a(this.f30184a) ? this.f30185b.getBottom() : this.f30186c.getBottom(), this.f30187d.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f30187d.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f30187d.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f30188a;

        /* JADX WARN: Multi-variable type inference failed */
        j(Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
            this.f30188a = function1;
        }

        public final void a(String updatedCurrentPin) {
            Intrinsics.j(updatedCurrentPin, "updatedCurrentPin");
            this.f30188a.invoke(new a.OnFormFieldChange(new d.CurrentPin(new Validation(updatedCurrentPin, null, 2, null))));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f30189a;

        /* JADX WARN: Multi-variable type inference failed */
        k(Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
            this.f30189a = function1;
        }

        public final void a(String updatedNewPin) {
            Intrinsics.j(updatedNewPin, "updatedNewPin");
            this.f30189a.invoke(new a.OnFormFieldChange(new d.NewPin(new Validation(updatedNewPin, null, 2, null))));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class l implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f30190a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f30191b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f30192c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30193d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30194e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f30195f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f30196g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f30197h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30198a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f30199b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f30200c;

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, AbstractC5607a abstractC5607a) {
                this.f30198a = localThemeScope;
                this.f30199b = interfaceC14919W;
                this.f30200c = abstractC5607a;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(825906523, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.edit.MperksPinInputField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditMperksInformationContent.kt:414)");
                }
                ri.j.h(this.f30198a, this.f30199b.getLabels().getInfoBlockMessage(), C6408b.a(this.f30200c, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        l(Modifier modifier, AbstractC5607a abstractC5607a, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, String str, Function1<? super String, Unit> function1, String str2, String str3) {
            this.f30190a = modifier;
            this.f30191b = abstractC5607a;
            this.f30192c = interfaceC5772o;
            this.f30193d = localThemeScope;
            this.f30194e = str;
            this.f30195f = function1;
            this.f30196g = str2;
            this.f30197h = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput e(InterfaceC14919W interfaceC14919W, final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, new z1.G((char) 0, 1, null), KeyboardOptions.c(interfaceC14919W.getInputFields().getDefault().getKeyboardOptions(), 0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null), new C5693z(new Function1() { // from class: Qh.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.l.f(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, null, null, 62, null), false, 0, null, null, null, 3983, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC14919W interfaceC14919W, String str, String str2, AbstractC5607a abstractC5607a, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), str);
            if (str2 == null || StringsKt.r0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                AdsInputField.e(interfaceC14919W.getLabels().getDescription(), str2);
            }
            if (!C5608b.a(abstractC5607a)) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(825906523, true, new a(localThemeScope, interfaceC14919W, abstractC5607a)));
            }
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1326708977, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.edit.MperksPinInputField.<anonymous> (EditMperksInformationContent.kt:393)");
            }
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(this.f30190a);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            boolean z10 = !C5608b.a(this.f30191b);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(Assemble) | composer.D(this.f30192c);
            final InterfaceC5772o interfaceC5772o = this.f30192c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qh.f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e0.l.e(Assemble, interfaceC5772o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, false, (Function1) objB, 6, null);
            LocalThemeScope localThemeScope = this.f30193d;
            String str = this.f30194e;
            Function1<String, Unit> function1 = this.f30195f;
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = composer.D(Assemble) | composer.V(this.f30196g) | composer.V(this.f30197h) | composer.D(this.f30191b) | composer.D(this.f30193d);
            final String str2 = this.f30196g;
            final String str3 = this.f30197h;
            final AbstractC5607a abstractC5607a = this.f30191b;
            final LocalThemeScope localThemeScope2 = this.f30193d;
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Qh.g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e0.l.g(Assemble, str2, str3, abstractC5607a, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, textInputF, modifierFsMask, function1, (Function1) objB2, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            d(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class m implements Function3<InterfaceC14932e0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30201a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30202b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f30203c;

        /* JADX WARN: Multi-variable type inference failed */
        m(LocalThemeScope localThemeScope, boolean z10, Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
            this.f30201a = localThemeScope;
            this.f30202b = z10;
            this.f30203c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, boolean z10) {
            function1.invoke(new a.OnQuickIDToggleChange(z10));
            return Unit.f142422a;
        }

        public final void b(InterfaceC14932e0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-473409692, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.edit.MperksQuickIDToggle.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditMperksInformationContent.kt:189)");
            }
            LocalThemeScope localThemeScope = this.f30201a;
            q1.s.Switch trailingToggleButton = Assemble.getToggleButtons().getTrailingToggleButton();
            boolean z10 = this.f30202b;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f30203c);
            final Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> function1 = this.f30203c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qh.i0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e0.m.c(function1, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            vi.s.b(localThemeScope, trailingToggleButton, z10, false, false, (Function1) objB, composer, LocalThemeScope.f15770g | (q1.s.Switch.f140183e << 3), 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14932e0 interfaceC14932e0, Composer composer, Integer num) {
            b(interfaceC14932e0, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void K(final Ji.LocalThemeScope r48, final boolean r49, final ak.AbstractC5607a r50, androidx.compose.ui.Modifier r51, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.e0.K(Ji.M, boolean, ak.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(InterfaceC5772o interfaceC5772o) {
        InterfaceC5772o.l(interfaceC5772o, false, 1, null);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void A(Ji.LocalThemeScope r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.e0.A(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        A(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void C(final Ji.LocalThemeScope r23, final int r24, final int r25, androidx.compose.ui.Modifier r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.e0.C(Ji.M, int, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, int i10, int i11, Modifier modifier, int i12, int i13, Composer composer, int i14) {
        C(localThemeScope, i10, i11, modifier, composer, J0.a(i12 | 1), i13);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void E(Ji.LocalThemeScope r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.e0.E(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    @SuppressLint({"ComposableStringLiteral"})
    private static final void G(final LocalThemeScope localThemeScope, final l.ProfileScreenViewState profileScreenViewState, final Function1<? super Fh.a, Unit> function1, final Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function12, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1065563143);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(profileScreenViewState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(function12) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1065563143, i11, -1, "com.meijer.mobile.accounts.ux.composables.profile.edit.MainContent (EditMperksInformationContent.kt:428)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            L1.A a10 = (L1.A) objB;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composerStartRestartGroup, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierH, false, new a(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new b(nVar, 6, pairH.b(), profileScreenViewState, localThemeScope, function12, function1)), pairH.a(), composerStartRestartGroup, 48, 0);
            composer2 = composerStartRestartGroup;
            composer2.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qh.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e0.H(localThemeScope, profileScreenViewState, function1, function12, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, l.ProfileScreenViewState profileScreenViewState, Function1 function1, Function1 function12, int i10, Composer composer, int i11) {
        G(localThemeScope, profileScreenViewState, function1, function12, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(Ji.LocalThemeScope r16, final java.lang.String r17, final java.lang.String r18, final ak.AbstractC5607a r19, final androidx.compose.ui.focus.InterfaceC5772o r20, androidx.compose.ui.Modifier r21, java.lang.String r22, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.e0.I(Ji.M, java.lang.String, java.lang.String, ak.a, androidx.compose.ui.focus.o, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, String str, String str2, AbstractC5607a abstractC5607a, InterfaceC5772o interfaceC5772o, Modifier modifier, String str3, Function1 function1, int i10, int i11, Composer composer, int i12) {
        I(localThemeScope, str, str2, abstractC5607a, interfaceC5772o, modifier, str3, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5730l0 L() {
        return t1.e(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(Function1 function1) {
        function1.invoke(new a.DismissErrorNotification(false, false, 1, null));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(LocalThemeScope localThemeScope, boolean z10, AbstractC5607a abstractC5607a, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        K(localThemeScope, z10, abstractC5607a, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void q(Ji.LocalThemeScope r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.e0.q(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ji.LocalThemeScope r42, final com.meijer.mobile.accounts.ux.profile.l.ProfileScreenViewState r43, androidx.compose.ui.Modifier r44, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r45, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.e0.s(Ji.M, com.meijer.mobile.accounts.ux.profile.l$e, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1) {
        function1.invoke(a.C1343a.f94714a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1) {
        function1.invoke(a.C1343a.f94714a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, l.ProfileScreenViewState profileScreenViewState, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, profileScreenViewState, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void y(final Ji.LocalThemeScope r33, final java.lang.String r34, final java.lang.String r35, final Ji.C r36, androidx.compose.ui.Modifier r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.e0.y(Ji.M, java.lang.String, java.lang.String, Ji.C, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, String str, String str2, Ji.C c10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, str, str2, c10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final boolean M(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    private static final void N(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    private static final float O(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(InterfaceC5730l0 interfaceC5730l0) {
        N(interfaceC5730l0, !M(interfaceC5730l0));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1, l.ProfileScreenViewState profileScreenViewState) {
        Boolean boolValueOf;
        String str = null;
        if (profileScreenViewState.getUnsavedMperksInformation().getIsQuickIDEnabled() == profileScreenViewState.getSavedMperksInformation().getIsQuickIDEnabled()) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(profileScreenViewState.getUnsavedMperksInformation().getIsQuickIDEnabled());
        }
        String strE = profileScreenViewState.getUnsavedMperksInformation().getNewPin().c().e();
        if (strE.length() == 0) {
            strE = null;
        }
        String str2 = strE;
        String strE2 = profileScreenViewState.getUnsavedMperksInformation().getCurrentPin().c().e();
        if (strE2.length() != 0) {
            str = strE2;
        }
        function1.invoke(new a.OnSaveMperksInfo(boolValueOf, str, str2));
        return Unit.f142422a;
    }
}
