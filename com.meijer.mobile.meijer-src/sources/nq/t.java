package nq;

import Ki.I;
import Ki.LocalThemeScope;
import Ki.Q;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import V0.W;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.T;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dk.C13698b;
import e.C13735c;
import e.C13736d;
import e.C13741i;
import hq.ShopAndScanItemDecorator;
import j0.C14889J;
import j0.InterfaceC14888I;
import java.util.List;
import ki.C15132A;
import ki.C15133B;
import ki.InterfaceC15166e0;
import ki.j1;
import ki.q1;
import ki.s1;
import kotlin.C18009i;
import kotlin.C18045v;
import kotlin.C18051y;
import kotlin.C18052y0;
import kotlin.C18054z0;
import kotlin.C6304d;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import nq.v;
import oi.E0;
import p1.C16335d;
import p1.C16338g;
import pv.C16563h;
import r0.C16806i;
import r1.C16819m;
import zq.AbstractC18543a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aO\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0085\u0001\u0010\u001d\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001aU\u0010%\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050!H\u0003¢\u0006\u0004\b%\u0010&\u001a7\u0010)\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00162\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u000fH\u0003¢\u0006\u0004\b)\u0010*\u001a)\u0010,\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050!H\u0003¢\u0006\u0004\b,\u0010-\u001a)\u0010/\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050!H\u0003¢\u0006\u0004\b/\u0010-\u001a1\u00103\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00101\u001a\u0002002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050!H\u0003¢\u0006\u0004\b3\u00104¨\u00067²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u00105\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00106\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lnq/v;", "viewModel", "Landroidx/compose/ui/Modifier;", "modifier", "", "Q", "(LKi/M;Lnq/v;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lnq/v$d;", "viewState", "Lzq/d;", "cameraController", "", "LXp/a;", "enabledBarcodeSymbologies", "Lkotlin/Function1;", "Lnq/v$c;", "sendEvent", "J", "(LKi/M;Landroidx/compose/ui/Modifier;Lnq/v$d;Lzq/d;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/geometry/Rect;", "cutout", "", "showCamera", "isTorchEnabled", "isScanSoundEnabled", "Lzq/a;", "cameraLens", "onBarcodeScanned", "s", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/geometry/Rect;Lzq/d;ZZZLzq/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "isSoundOn", "isFlashOn", "Lkotlin/Function0;", "onCloseEvent", "onFlashToggledEvent", "onSoundToggledEvent", "H", "(LKi/M;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "isContinuousScanEnabled", "onContinuousScanToggle", "z", "(LKi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onFlipCamera", "D", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "onLookUpClick", "F", "Lbk/a;", "subtotal", "onViewCartClick", "x", "(LKi/M;Landroidx/compose/ui/Modifier;Lbk/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "cameraCutout", "visible", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class A extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f152797f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f152798g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f152799h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152800i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ v.ViewState f152801j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f152802k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ zq.d f152803l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f152804m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, v.ViewState viewState, Function1 function1, zq.d dVar, InterfaceC5872l0 interfaceC5872l0) {
            super(2);
            this.f152798g = nVar;
            this.f152799h = function0;
            this.f152800i = localThemeScope;
            this.f152801j = viewState;
            this.f152802k = function1;
            this.f152803l = dVar;
            this.f152804m = interfaceC5872l0;
            this.f152797f = i10;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f152798g.getHelpersHashCode();
            this.f152798g.i();
            L1.n nVar = this.f152798g;
            composer.startReplaceGroup(-1671981002);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            L1.h hVarF = bVarM.f();
            L1.h hVarG = bVarM.g();
            bVarM.h();
            LocalThemeScope localThemeScope = this.f152800i;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = i.f152838a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            boolean isScanSoundEnabled = this.f152801j.getIsScanSoundEnabled();
            boolean isFlashEnabled = this.f152801j.getIsFlashEnabled();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f152802k);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new r(this.f152802k);
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f152802k);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion2.a()) {
                objB3 = new s(this.f152802k);
                composer.t(objB3);
            }
            Function0 function02 = (Function0) objB3;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(this.f152802k);
            Object objB4 = composer.B();
            if (zV3 || objB4 == companion2.a()) {
                objB4 = new C2363t(this.f152802k);
                composer.t(objB4);
            }
            composer.P();
            int i12 = LocalThemeScope.f17314g;
            t.H(localThemeScope, modifierK, isScanSoundEnabled, isFlashEnabled, function0, function02, (Function0) objB4, composer, i12);
            LocalThemeScope localThemeScope2 = this.f152800i;
            float f10 = 16;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), 0.0f, 10, null);
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(hVarA);
            Object objB5 = composer.B();
            if (zV4 || objB5 == companion2.a()) {
                objB5 = new u(hVarA);
                composer.t(objB5);
            }
            composer.P();
            Modifier modifierK2 = nVar.k(modifierM, hVarC, (Function1) objB5);
            boolean isContinuousScanEnabled = this.f152801j.getIsContinuousScanEnabled();
            composer.startReplaceGroup(5004770);
            boolean zV5 = composer.V(this.f152802k);
            Object objB6 = composer.B();
            if (zV5 || objB6 == companion2.a()) {
                objB6 = new v(this.f152802k);
                composer.t(objB6);
            }
            composer.P();
            t.z(localThemeScope2, modifierK2, isContinuousScanEnabled, (Function1) objB6, composer, i12);
            LocalThemeScope localThemeScope3 = this.f152800i;
            Modifier modifierK3 = androidx.compose.foundation.layout.D.k(companion, H1.h.p(f10), 0.0f, 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f152803l);
            Object objB7 = composer.B();
            if (zD || objB7 == companion2.a()) {
                objB7 = new w(this.f152803l, this.f152804m);
                composer.t(objB7);
            }
            composer.P();
            Modifier modifierA = T.a(modifierK3, (Function1) objB7);
            composer.startReplaceGroup(5004770);
            boolean zV6 = composer.V(hVarC);
            Object objB8 = composer.B();
            if (zV6 || objB8 == companion2.a()) {
                objB8 = new x(hVarC);
                composer.t(objB8);
            }
            composer.P();
            Modifier modifierK4 = nVar.k(modifierA, hVarD, (Function1) objB8);
            composer.startReplaceGroup(5004770);
            boolean zV7 = composer.V(this.f152802k);
            Object objB9 = composer.B();
            if (zV7 || objB9 == companion2.a()) {
                objB9 = new y(this.f152802k);
                composer.t(objB9);
            }
            composer.P();
            t.D(localThemeScope3, modifierK4, (Function0) objB9, composer, i12);
            LocalThemeScope localThemeScope4 = this.f152800i;
            composer.startReplaceGroup(5004770);
            boolean zV8 = composer.V(hVarD);
            Object objB10 = composer.B();
            if (zV8 || objB10 == companion2.a()) {
                objB10 = new j(hVarD);
                composer.t(objB10);
            }
            composer.P();
            Modifier modifierK5 = nVar.k(companion, hVarE, (Function1) objB10);
            composer.startReplaceGroup(5004770);
            boolean zV9 = composer.V(this.f152802k);
            Object objB11 = composer.B();
            if (zV9 || objB11 == companion2.a()) {
                objB11 = new k(this.f152802k);
                composer.t(objB11);
            }
            composer.P();
            t.F(localThemeScope4, modifierK5, (Function0) objB11, composer, i12);
            LocalThemeScope localThemeScope5 = this.f152800i;
            Modifier modifierK6 = androidx.compose.foundation.layout.D.k(companion, H1.h.p(f10), 0.0f, 2, null);
            composer.startReplaceGroup(1849434622);
            Object objB12 = composer.B();
            if (objB12 == companion2.a()) {
                objB12 = l.f152841a;
                composer.t(objB12);
            }
            composer.P();
            Modifier modifierK7 = nVar.k(modifierK6, hVarG, (Function1) objB12);
            AbstractC6392a subtotal = this.f152801j.getCartTotals().getSubtotal();
            composer.startReplaceGroup(5004770);
            boolean zV10 = composer.V(this.f152802k);
            Object objB13 = composer.B();
            if (zV10 || objB13 == companion2.a()) {
                objB13 = new m(this.f152802k);
                composer.t(objB13);
            }
            composer.P();
            t.x(localThemeScope5, modifierK7, subtotal, (Function0) objB13, composer, i12 | (AbstractC6392a.f60445b << 6));
            ShopAndScanItemDecorator lastScannedItem = this.f152801j.getLastScannedItem();
            composer.startReplaceGroup(84705182);
            if (lastScannedItem != null) {
                composer.startReplaceGroup(1849434622);
                Object objB14 = composer.B();
                if (objB14 == companion2.a()) {
                    i11 = 2;
                    objB14 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB14);
                } else {
                    i11 = 2;
                }
                InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB14;
                composer.P();
                t.O(interfaceC5872l0, this.f152801j.getIsContinuousScanEnabled());
                Modifier modifierK8 = androidx.compose.foundation.layout.D.k(companion, H1.h.p(f10), 0.0f, i11, null);
                composer.startReplaceGroup(5004770);
                boolean zV11 = composer.V(hVarG);
                Object objB15 = composer.B();
                if (zV11 || objB15 == companion2.a()) {
                    objB15 = new n(hVarG);
                    composer.t(objB15);
                }
                composer.P();
                Modifier modifierH = J.h(nVar.k(modifierK8, hVarF, (Function1) objB15), 0.0f, 1, null);
                boolean zN = t.N(interfaceC5872l0);
                composer.startReplaceGroup(1849434622);
                Object objB16 = composer.B();
                if (objB16 == companion2.a()) {
                    objB16 = o.f152844a;
                    composer.t(objB16);
                }
                composer.P();
                androidx.compose.animation.h hVarC2 = androidx.compose.animation.f.z(null, (Function1) objB16, 1, null).c(androidx.compose.animation.f.m(null, 0.3f, 1, null));
                composer.startReplaceGroup(1849434622);
                Object objB17 = composer.B();
                if (objB17 == companion2.a()) {
                    objB17 = p.f152845a;
                    composer.t(objB17);
                }
                composer.P();
                C6304d.f(zN, modifierH, hVarC2, androidx.compose.animation.f.E(null, (Function1) objB17, 1, null).c(androidx.compose.animation.f.o(null, 0.0f, 3, null)), null, ComposableLambdaKt.c(-1322288335, true, new q(this.f152800i, lastScannedItem, this.f152801j, this.f152802k), composer, 54), composer, 200064, 16);
                Unit unit = Unit.f143329a;
            }
            composer.P();
            composer.P();
            if (this.f152798g.getHelpersHashCode() != helpersHashCode) {
                this.f152799h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerScreenKt$ScannerScreen$1$1", f = "ShopAndScanScannerScreen.kt", l = {}, m = "invokeSuspend")
    static final class B extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152805a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f152806b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ nq.v f152807c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C13741i<String, Boolean> f152808d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnq/v$b;", "effect", "", "<anonymous>", "(Lnq/v$b;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerScreenKt$ScannerScreen$1$1$1", f = "ShopAndScanScannerScreen.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<v.b, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f152809a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f152810b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C13741i<String, Boolean> f152811c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C13741i<String, Boolean> c13741i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f152811c = c13741i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f152811c, continuation);
                aVar.f152810b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v.b bVar, Continuation<? super Unit> continuation) {
                return ((a) create(bVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f152809a == 0) {
                    ResultKt.b(obj);
                    if (Intrinsics.e((v.b) this.f152810b, v.b.a.f152880a)) {
                        this.f152811c.a("android.permission.CAMERA");
                        return Unit.f143329a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(nq.v vVar, C13741i<String, Boolean> c13741i, Continuation<? super B> continuation) {
            super(2, continuation);
            this.f152807c = vVar;
            this.f152808d = c13741i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            B b10 = new B(this.f152807c, this.f152808d, continuation);
            b10.f152806b = obj;
            return b10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f152805a == 0) {
                ResultKt.b(obj);
                C16563h.J(C16563h.O(this.f152807c.t().a(), new a(this.f152808d, null)), (InterfaceC15783O) this.f152806b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nq/t$C", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C implements androidx.compose.runtime.E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ nq.v f152812a;

        public C(nq.v vVar) {
            this.f152812a = vVar;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            this.f152812a.getScannerController().destroy();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerScreenKt$CameraView$3$1", f = "ShopAndScanScannerScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nq.t$a, reason: case insensitive filesystem */
    static final class C16005a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152813a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ zq.d f152814b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16005a(zq.d dVar, Continuation<? super C16005a> continuation) {
            super(2, continuation);
            this.f152814b = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C16005a(this.f152814b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C16005a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f152813a == 0) {
                ResultKt.b(obj);
                this.f152814b.h(true);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerScreenKt$CameraView$4$1", f = "ShopAndScanScannerScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nq.t$b, reason: case insensitive filesystem */
    static final class C16006b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152815a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<v.c, Unit> f152816b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f152817c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C16006b(Function1<? super v.c, Unit> function1, boolean z10, Continuation<? super C16006b> continuation) {
            super(2, continuation);
            this.f152816b = function1;
            this.f152817c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C16006b(this.f152816b, this.f152817c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C16006b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f152815a == 0) {
                ResultKt.b(obj);
                this.f152816b.invoke(new v.c.CheckCameraPermission(this.f152817c));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: nq.t$c, reason: case insensitive filesystem */
    static final class C16007c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152818a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f152819b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152820c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: nq.t$c$a */
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152821a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f152822b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: nq.t$c$a$a, reason: collision with other inner class name */
            static final class C2362a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f152823a;

                C2362a(LocalThemeScope localThemeScope) {
                    this.f152823a = localThemeScope;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1713953155, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.CartSubtotalFooter.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopAndScanScannerScreen.kt:571)");
                    }
                    LocalThemeScope localThemeScope = this.f152823a;
                    si.j.h(localThemeScope, new q1.Label(null, this.f152823a.getAdsColors().getAdsColorText03(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 381, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117854F1, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f152821a = localThemeScope;
                this.f152822b = function0;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1246900694, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.CartSubtotalFooter.<anonymous>.<anonymous>.<anonymous> (ShopAndScanScannerScreen.kt:567)");
                }
                E0.b(this.f152821a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, H1.h.p(8), 0.0f, 2, null), false, null, 895, null), this.f152822b, ComposableLambdaKt.c(1713953155, true, new C2362a(this.f152821a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        C16007c(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Function0<Unit> function0) {
            this.f152818a = localThemeScope;
            this.f152819b = abstractC6392a;
            this.f152820c = function0;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-758202354, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.CartSubtotalFooter.<anonymous> (ShopAndScanScannerScreen.kt:541)");
            }
            e.c cVarI = P0.e.INSTANCE.i();
            LocalThemeScope localThemeScope = this.f152818a;
            AbstractC6392a abstractC6392a = this.f152819b;
            Function0<Unit> function0 = this.f152820c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), cVarI, composer, 48);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            C18054z0.a(C16335d.c(Cj.i.f4811n1, composer, 0), null, androidx.compose.foundation.layout.D.m(companion, H1.h.p(16), 0.0f, 0.0f, 0.0f, 14, null), localThemeScope.getAdsColors().getAdsColorIcon02().getColor(), composer, 432, 0);
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion, H1.h.p(8), 0.0f, 0.0f, 0.0f, 14, null), localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 380, null);
            String strD = C16338g.d(com.meijer.mobile.shopandscan.e.f117845C1, new Object[]{abstractC6392a}, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strD, null, composer, i11 | (i12 << 3), 4);
            si.j.h(localThemeScope, new q1.Label(InterfaceC14888I.b(c14889j, androidx.compose.foundation.layout.D.m(companion, H1.h.p(4), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null), localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 380, null), C13698b.a(abstractC6392a, composer, AbstractC6392a.f60445b), null, composer, i11 | (i12 << 3), 4);
            Q.e(localThemeScope, C15132A.f141851a, ComposableLambdaKt.c(1246900694, true, new a(localThemeScope, function0), composer, 54), composer, i11 | 384 | (C15132A.f141852b << 3));
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15166e0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152824a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f152825b;

        d(LocalThemeScope localThemeScope, boolean z10) {
            this.f152824a = localThemeScope;
            this.f152825b = z10;
        }

        public final void a(InterfaceC15166e0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1695721162, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.ContinuousScanComponent.<anonymous>.<anonymous>.<anonymous> (ShopAndScanScannerScreen.kt:467)");
            }
            wi.s.b(this.f152824a, Assemble.getToggleButtons().getTrailingToggleButton(), this.f152825b, false, false, null, composer, LocalThemeScope.f17314g | (q1.s.Switch.f142438e << 3), 28);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15166e0 interfaceC15166e0, Composer composer, Integer num) {
            a(interfaceC15166e0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152826a;

        e(LocalThemeScope localThemeScope) {
            this.f152826a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-269400282, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.CutoutContent.<anonymous>.<anonymous> (ShopAndScanScannerScreen.kt:492)");
            }
            C18054z0.a(C16335d.c(Cj.i.f4688C, composer, 0), C16338g.c(com.meijer.mobile.shopandscan.e.f117973y1, composer, 0), null, this.f152826a.getAdsColors().getAdsColorInverse().getColor(), composer, 0, 4);
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
    static final class f implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152827a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f152828b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152829c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152830a;

            a(LocalThemeScope localThemeScope) {
                this.f152830a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (composer.V(AdsButton) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1337975621, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.LookUpItemButton.<anonymous>.<anonymous> (ShopAndScanScannerScreen.kt:518)");
                }
                LocalThemeScope localThemeScope = this.f152830a;
                si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.i(AdsButton.d(Modifier.INSTANCE, P0.e.INSTANCE.i()), H1.h.p(4)), this.f152830a.getAdsColors().getAdsColorBrandPrimary(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 372, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117976z1, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        f(LocalThemeScope localThemeScope, Modifier modifier, Function0<Unit> function0) {
            this.f152827a = localThemeScope;
            this.f152828b = modifier;
            this.f152829c = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1693455182, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.LookUpItemButton.<anonymous> (ShopAndScanScannerScreen.kt:508)");
            }
            E0.b(this.f152827a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, C18045v.f169801a.a(this.f152827a.getAdsColors().getAdsColorInverse().getColor(), this.f152827a.getAdsColors().getAdsColorBrandPrimary().getColor(), 0L, 0L, composer, C18045v.f169812l << 12, 12), null, this.f152828b, false, null, 863, null), this.f152829c, ComposableLambdaKt.c(-1337975621, true, new a(this.f152827a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152831a;

        g(Function0<Unit> function0) {
            this.f152831a = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1550593477, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.ScannerAppBar.<anonymous> (ShopAndScanScannerScreen.kt:393)");
            }
            C18052y0.a(this.f152831a, null, false, null, C15999a.f152723a.b(), composer, 24576, 14);
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
    static final class h implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152832a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152833b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f152834c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f152835d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f152836a;

            a(boolean z10) {
                this.f152836a = z10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1394946680, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.ScannerAppBar.<anonymous>.<anonymous> (ShopAndScanScannerScreen.kt:406)");
                }
                C18054z0.a(C16335d.c(this.f152836a ? Cj.i.f4789h0 : Cj.i.f4785g0, composer, 0), C16338g.c(this.f152836a ? com.meijer.mobile.shopandscan.e.f117851E1 : com.meijer.mobile.shopandscan.e.f117848D1, composer, 0), null, 0L, composer, 0, 12);
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
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f152837a;

            b(boolean z10) {
                this.f152837a = z10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1419056079, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.ScannerAppBar.<anonymous>.<anonymous> (ShopAndScanScannerScreen.kt:414)");
                }
                C18054z0.a(C16335d.c(this.f152837a ? Cj.i.f4835v1 : Cj.i.f4832u1, composer, 0), C16338g.c(this.f152837a ? com.meijer.mobile.shopandscan.e.f117842B1 : com.meijer.mobile.shopandscan.e.f117839A1, composer, 0), null, 0L, composer, 0, 12);
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

        h(Function0<Unit> function0, Function0<Unit> function02, boolean z10, boolean z11) {
            this.f152832a = function0;
            this.f152833b = function02;
            this.f152834c = z10;
            this.f152835d = z11;
        }

        public final void a(InterfaceC14888I TopAppBar, Composer composer, int i10) {
            Intrinsics.j(TopAppBar, "$this$TopAppBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(865662628, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.ScannerAppBar.<anonymous> (ShopAndScanScannerScreen.kt:405)");
            }
            C18052y0.a(this.f152832a, null, false, null, ComposableLambdaKt.c(-1394946680, true, new a(this.f152834c), composer, 54), composer, 24576, 14);
            C18052y0.a(this.f152833b, null, false, null, ComposableLambdaKt.c(-1419056079, true, new b(this.f152835d), composer, 54), composer, 24576, 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f152838a = new i();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        i() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f152839a;

        j(L1.h hVar) {
            this.f152839a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f152839a.getBottom(), H1.h.p(24), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<v.c, Unit> f152840a;

        /* JADX WARN: Multi-variable type inference failed */
        k(Function1<? super v.c, Unit> function1) {
            this.f152840a = function1;
        }

        public final void a() {
            this.f152840a.invoke(v.c.g.f152888a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class l implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f152841a = new l();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), H1.h.p(16), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        l() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<v.c, Unit> f152842a;

        /* JADX WARN: Multi-variable type inference failed */
        m(Function1<? super v.c, Unit> function1) {
            this.f152842a = function1;
        }

        public final void a() {
            this.f152842a.invoke(v.c.f.f152887a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class n implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f152843a;

        n(L1.h hVar) {
            this.f152843a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), this.f152843a.getTop(), H1.h.p(16), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class o implements Function1<Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f152844a = new o();

        public final Integer a(int i10) {
            return Integer.valueOf(i10 / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }

        o() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class p implements Function1<Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f152845a = new p();

        public final Integer a(int i10) {
            return Integer.valueOf(i10 / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }

        p() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class q implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152846a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShopAndScanItemDecorator f152847b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v.ViewState f152848c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<v.c, Unit> f152849d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<String, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<v.c, Unit> f152850a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShopAndScanItemDecorator f152851b;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super v.c, Unit> function1, ShopAndScanItemDecorator shopAndScanItemDecorator) {
                this.f152850a = function1;
                this.f152851b = shopAndScanItemDecorator;
            }

            public final void a(String it) {
                Intrinsics.j(it, "it");
                this.f152850a.invoke(new v.c.FocusedQuantityStepper(this.f152851b.getLocalId()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                a(str);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<v.c, Unit> f152852a;

            /* JADX WARN: Multi-variable type inference failed */
            b(Function1<? super v.c, Unit> function1) {
                this.f152852a = function1;
            }

            public final void a() {
                this.f152852a.invoke(v.c.l.f152893a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<String, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<v.c, Unit> f152853a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShopAndScanItemDecorator f152854b;

            /* JADX WARN: Multi-variable type inference failed */
            c(Function1<? super v.c, Unit> function1, ShopAndScanItemDecorator shopAndScanItemDecorator) {
                this.f152853a = function1;
                this.f152854b = shopAndScanItemDecorator;
            }

            public final void a(String it) {
                Intrinsics.j(it, "it");
                this.f152853a.invoke(new v.c.CloseItemAlertTag(this.f152854b.getLocalId()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                a(str);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function2<Long, String, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<v.c, Unit> f152855a;

            /* JADX WARN: Multi-variable type inference failed */
            d(Function1<? super v.c, Unit> function1) {
                this.f152855a = function1;
            }

            public final void a(long j10, String itemId) {
                Intrinsics.j(itemId, "itemId");
                this.f152855a.invoke(new v.c.CouponAction(j10, itemId));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Long l10, String str) {
                a(l10.longValue(), str);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function2<String, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<v.c, Unit> f152856a;

            /* JADX WARN: Multi-variable type inference failed */
            e(Function1<? super v.c, Unit> function1) {
                this.f152856a = function1;
            }

            public final void a(String itemId, int i10) {
                Intrinsics.j(itemId, "itemId");
                this.f152856a.invoke(new v.c.UpdateItemQuantity(itemId, i10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
                a(str, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class f implements Function1<String, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final f f152857a = new f();

            public final void a(String itemId) {
                Intrinsics.j(itemId, "itemId");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                a(str);
                return Unit.f143329a;
            }

            f() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class g implements Function1<String, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<v.c, Unit> f152858a;

            /* JADX WARN: Multi-variable type inference failed */
            g(Function1<? super v.c, Unit> function1) {
                this.f152858a = function1;
            }

            public final void a(String itemId) {
                Intrinsics.j(itemId, "itemId");
                this.f152858a.invoke(new v.c.UpdateItemQuantity(itemId, 0));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                a(str);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        q(LocalThemeScope localThemeScope, ShopAndScanItemDecorator shopAndScanItemDecorator, v.ViewState viewState, Function1<? super v.c, Unit> function1) {
            this.f152846a = localThemeScope;
            this.f152847b = shopAndScanItemDecorator;
            this.f152848c = viewState;
            this.f152849d = function1;
        }

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-1322288335, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.ScannerContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopAndScanScannerScreen.kt:263)");
            }
            LocalThemeScope localThemeScope = this.f152846a;
            Modifier modifierD = androidx.compose.foundation.b.d(T0.e.a(Modifier.INSTANCE, C16806i.c(H1.h.p(4))), this.f152846a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            ShopAndScanItemDecorator shopAndScanItemDecorator = this.f152847b;
            String quantityStepperSelected = this.f152848c.getQuantityStepperSelected();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f152849d) | composer.D(this.f152847b);
            Function1<v.c, Unit> function1 = this.f152849d;
            ShopAndScanItemDecorator shopAndScanItemDecorator2 = this.f152847b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(function1, shopAndScanItemDecorator2);
                composer.t(objB);
            }
            Function1 function12 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f152849d);
            Function1<v.c, Unit> function13 = this.f152849d;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(function13);
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zV3 = composer.V(this.f152849d) | composer.D(this.f152847b);
            Function1<v.c, Unit> function14 = this.f152849d;
            ShopAndScanItemDecorator shopAndScanItemDecorator3 = this.f152847b;
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new c(function14, shopAndScanItemDecorator3);
                composer.t(objB3);
            }
            Function1 function15 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(this.f152849d);
            Function1<v.c, Unit> function16 = this.f152849d;
            Object objB4 = composer.B();
            if (zV4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new d(function16);
                composer.t(objB4);
            }
            Function2 function2 = (Function2) objB4;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV5 = composer.V(this.f152849d);
            Function1<v.c, Unit> function17 = this.f152849d;
            Object objB5 = composer.B();
            if (zV5 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new e(function17);
                composer.t(objB5);
            }
            Function2 function22 = (Function2) objB5;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB6 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB6 == companion.a()) {
                objB6 = f.f152857a;
                composer.t(objB6);
            }
            Function1 function18 = (Function1) objB6;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV6 = composer.V(this.f152849d);
            Function1<v.c, Unit> function19 = this.f152849d;
            Object objB7 = composer.B();
            if (zV6 || objB7 == companion.a()) {
                objB7 = new g(function19);
                composer.t(objB7);
            }
            composer.P();
            fq.w.h(localThemeScope, modifierD, shopAndScanItemDecorator, quantityStepperSelected, function12, function0, function15, function2, function22, function18, (Function1) objB7, composer, 805306368 | LocalThemeScope.f17314g, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            a(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class r implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<v.c, Unit> f152859a;

        /* JADX WARN: Multi-variable type inference failed */
        r(Function1<? super v.c, Unit> function1) {
            this.f152859a = function1;
        }

        public final void a() {
            this.f152859a.invoke(v.c.f.f152887a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class s implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<v.c, Unit> f152860a;

        /* JADX WARN: Multi-variable type inference failed */
        s(Function1<? super v.c, Unit> function1) {
            this.f152860a = function1;
        }

        public final void a() {
            this.f152860a.invoke(v.c.j.f152891a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nq.t$t, reason: collision with other inner class name */
    static final class C2363t implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<v.c, Unit> f152861a;

        /* JADX WARN: Multi-variable type inference failed */
        C2363t(Function1<? super v.c, Unit> function1) {
            this.f152861a = function1;
        }

        public final void a() {
            this.f152861a.invoke(v.c.k.f152892a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class u implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f152862a;

        u(L1.h hVar) {
            this.f152862a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f152862a.getBottom(), H1.h.p(16), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class v implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<v.c, Unit> f152863a;

        /* JADX WARN: Multi-variable type inference failed */
        v(Function1<? super v.c, Unit> function1) {
            this.f152863a = function1;
        }

        public final void a(boolean z10) {
            this.f152863a.invoke(v.c.i.f152890a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class w implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ zq.d f152864a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Rect> f152865b;

        w(zq.d dVar, InterfaceC5872l0<Rect> interfaceC5872l0) {
            this.f152864a = dVar;
            this.f152865b = interfaceC5872l0;
        }

        public final void a(LayoutCoordinates it) {
            Intrinsics.j(it, "it");
            t.L(this.f152865b, LayoutCoordinatesKt.a(it));
            this.f152864a.c(t.K(this.f152865b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class x implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f152866a;

        x(L1.h hVar) {
            this.f152866a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f152866a.getBottom(), H1.h.p(24), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class y implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<v.c, Unit> f152867a;

        /* JADX WARN: Multi-variable type inference failed */
        y(Function1<? super v.c, Unit> function1) {
            this.f152867a = function1;
        }

        public final void a() {
            this.f152867a.invoke(v.c.h.f152889a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class z extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f152868f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(L1.A a10) {
            super(1);
            this.f152868f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f152868f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void s(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final androidx.compose.ui.geometry.Rect r24, final zq.d r25, final boolean r26, final boolean r27, final boolean r28, final zq.AbstractC18543a r29, final java.util.List<? extends Xp.a> r30, final kotlin.jvm.functions.Function1<? super nq.v.c, kotlin.Unit> r31, final kotlin.jvm.functions.Function1<? super Xp.a, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nq.t.s(Ki.M, androidx.compose.ui.Modifier, androidx.compose.ui.geometry.Rect, zq.d, boolean, boolean, boolean, zq.a, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Resources resources, boolean z10, r1.u semantics) throws Resources.NotFoundException {
        Intrinsics.j(semantics, "$this$semantics");
        String string = resources.getString(z10 ? com.meijer.mobile.shopandscan.e.f117970x1 : com.meijer.mobile.shopandscan.e.f117967w1);
        Intrinsics.i(string, "getString(...)");
        r1.s.x0(semantics, string);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(r1.u clearAndSetSemantics) {
        Intrinsics.j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function1 function1, int i10, Composer composer, int i11) {
        z(localThemeScope, modifier, z10, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, Composer composer, int i11) {
        D(localThemeScope, modifier, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, Composer composer, int i11) {
        F(localThemeScope, modifier, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(final LocalThemeScope localThemeScope, final Modifier modifier, final boolean z10, final boolean z11, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i10) {
        int i11;
        Modifier modifier2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1305478667);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            modifier2 = modifier;
            i11 |= composerStartRestartGroup.V(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.a(z11) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(function02) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(function03) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1305478667, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.ScannerAppBar (ShopAndScanScannerScreen.kt:388)");
            }
            composer2 = composerStartRestartGroup;
            C18009i.d(C15999a.f152723a.a(), modifier2, ComposableLambdaKt.c(-1550593477, true, new g(function0), composerStartRestartGroup, 54), ComposableLambdaKt.c(865662628, true, new h(function02, function03, z11, z10), composerStartRestartGroup, 54), localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), localThemeScope.getAdsColors().getAdsColorInverse().getColor(), H1.h.p(0), composer2, (i11 & 112) | 1576326, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nq.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t.I(localThemeScope, modifier, z10, z11, function0, function02, function03, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, Function0 function0, Function0 function02, Function0 function03, int i10, Composer composer, int i11) {
        H(localThemeScope, modifier, z10, z11, function0, function02, function03, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void J(final Ki.LocalThemeScope r24, androidx.compose.ui.Modifier r25, final nq.v.ViewState r26, final zq.d r27, final java.util.List<? extends Xp.a> r28, final kotlin.jvm.functions.Function1<? super nq.v.c, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nq.t.J(Ki.M, androidx.compose.ui.Modifier, nq.v$d, zq.d, java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(Function1 function1, Xp.a barcode) {
        Intrinsics.j(barcode, "barcode");
        function1.invoke(new v.c.BarcodeScanned(barcode));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(LocalThemeScope localThemeScope, Modifier modifier, v.ViewState viewState, zq.d dVar, List list, Function1 function1, int i10, int i11, Composer composer, int i12) {
        J(localThemeScope, modifier, viewState, dVar, list, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void Q(LocalThemeScope localThemeScope, final nq.v viewModel, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        LocalThemeScope localThemeScope2;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(857612359);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(viewModel) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(857612359, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.ScannerScreen (ShopAndScanScannerScreen.kt:93)");
            }
            z1 z1VarB = o1.b(viewModel.t().b(), null, composerStartRestartGroup, 0, 1);
            h.h hVar = new h.h();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(viewModel);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: nq.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.U(viewModel, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C13741i c13741iA = C13735c.a(hVar, (Function1) objB, composerStartRestartGroup, 0);
            Boolean bool = Boolean.TRUE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD2 = composerStartRestartGroup.D(viewModel) | composerStartRestartGroup.D(c13741iA);
            Object objB2 = composerStartRestartGroup.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new B(viewModel, c13741iA, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(bool, (Function2) objB2, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD3 = composerStartRestartGroup.D(viewModel);
            Object objB3 = composerStartRestartGroup.B();
            if (zD3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: nq.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.V(viewModel, (androidx.compose.runtime.F) obj);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.c(bool, (Function1) objB3, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD4 = composerStartRestartGroup.D(viewModel);
            Object objB4 = composerStartRestartGroup.B();
            if (zD4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function0() { // from class: nq.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t.W(viewModel);
                    }
                };
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            C13736d.a(false, (Function0) objB4, composerStartRestartGroup, 0, 1);
            v.ViewState viewStateR = R(z1VarB);
            zq.d scannerController = viewModel.getScannerController();
            List<Xp.a> listS = viewModel.s();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD5 = composerStartRestartGroup.D(viewModel);
            Object objB5 = composerStartRestartGroup.B();
            if (zD5 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new Function1() { // from class: nq.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.S(viewModel, (v.c) obj);
                    }
                };
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            J(localThemeScope2, modifier3, viewStateR, scannerController, listS, (Function1) objB5, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | ((i12 >> 3) & 112), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final LocalThemeScope localThemeScope3 = localThemeScope2;
            t0L.a(new Function2() { // from class: nq.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t.T(localThemeScope3, viewModel, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(nq.v vVar, v.c event) {
        Intrinsics.j(event, "event");
        vVar.v(event);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(LocalThemeScope localThemeScope, nq.v vVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        Q(localThemeScope, vVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(nq.v vVar, boolean z10) {
        if (z10) {
            vVar.v(new v.c.CheckCameraPermission(z10));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.E V(nq.v vVar, androidx.compose.runtime.F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        return new C(vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(nq.v vVar) {
        vVar.v(v.c.f.f152887a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View t(zq.d dVar, Function1 function1, List list, Context context) {
        Intrinsics.j(context, "context");
        dVar.d(function1);
        dVar.g(list);
        return dVar.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(zq.d dVar, AbstractC18543a abstractC18543a, boolean z10, boolean z11, View it) {
        Intrinsics.j(it, "it");
        dVar.b(abstractC18543a);
        dVar.f(z10);
        dVar.e(z11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Rect rect, LocalThemeScope localThemeScope, X0.f Canvas) {
        Intrinsics.j(Canvas, "$this$Canvas");
        V0.q1 q1VarA = W.a();
        float f10 = 6;
        float fI1 = Canvas.I1(H1.h.p(f10));
        float fI12 = Canvas.I1(H1.h.p(f10));
        V0.q1.p(q1VarA, U0.j.f(rect, U0.a.b((Float.floatToRawIntBits(fI1) << 32) | (Float.floatToRawIntBits(fI12) & 4294967295L))), null, 2, null);
        int iA = androidx.compose.ui.graphics.b.INSTANCE.a();
        X0.d drawContext = Canvas.getDrawContext();
        long jB = drawContext.b();
        drawContext.g().save();
        try {
            drawContext.getTransform().e(q1VarA, iA);
            X0.f.i1(Canvas, localThemeScope.getAdsColors().getAdsColorUIOverlay().getColor(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            drawContext.g().i();
            drawContext.h(jB);
            return Unit.f143329a;
        } catch (Throwable th2) {
            drawContext.g().i();
            drawContext.h(jB);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, Modifier modifier, Rect rect, zq.d dVar, boolean z10, boolean z11, boolean z12, AbstractC18543a abstractC18543a, List list, Function1 function1, Function1 function12, int i10, int i11, int i12, Composer composer, int i13) {
        s(localThemeScope, modifier, rect, dVar, z10, z11, z12, abstractC18543a, list, function1, function12, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(final LocalThemeScope localThemeScope, final Modifier modifier, final AbstractC6392a abstractC6392a, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(97059691);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            modifier2 = modifier;
            i11 |= composerStartRestartGroup.V(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(abstractC6392a) : composerStartRestartGroup.D(abstractC6392a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(97059691, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.CartSubtotalFooter (ShopAndScanScannerScreen.kt:539)");
            }
            C18051y.a(modifier2, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.c(-758202354, true, new C16007c(localThemeScope, abstractC6392a, function0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i11 >> 3) & 14) | 1572864, 62);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nq.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t.y(localThemeScope, modifier, abstractC6392a, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, Function0 function0, int i10, Composer composer, int i11) {
        x(localThemeScope, modifier, abstractC6392a, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(final LocalThemeScope localThemeScope, final Modifier modifier, boolean z10, final Function1<? super Boolean, Unit> function1, Composer composer, final int i10) {
        int i11;
        final boolean z11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1798644095);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            z11 = z10;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1798644095, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.ContinuousScanComponent (ShopAndScanScannerScreen.kt:434)");
            }
            final Resources resources = ((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())).getResources();
            z11 = z10;
            Modifier modifierC = ToggleableKt.c(androidx.compose.foundation.b.d(T0.e.a(J.h(modifier, 0.0f, 1, null), C16806i.c(H1.h.p(8))), localThemeScope.getAdsColors().getAdsColorUIOverlay().getColor(), null, 2, null), z11, false, null, function1, 6, null);
            e.Companion companion = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5806j c5806j = C5806j.f48836a;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion3, H1.h.p(16), H1.h.p(12));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = ((i11 & 896) == 256) | composerStartRestartGroup.D(resources);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: nq.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.A(resources, z11, (r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Modifier modifierC2 = C16819m.c(modifierJ, true, (Function1) objB);
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), companion.l(), composerStartRestartGroup, 0);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC2);
            Function0<InterfaceC5953g> function0A2 = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyB, companion2.e());
            D1.c(composerA2, interfaceC5884sR2, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
            Ki.T adsColorInverse = localThemeScope.getAdsColors().getAdsColorInverse();
            Modifier modifierD = c14889j.d(InterfaceC14888I.b(c14889j, companion3, 1.0f, false, 2, null), companion.i());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: nq.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t.B((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            q1.Label label = new q1.Label(C16819m.a(modifierD, (Function1) objB2), adsColorInverse, null, null, 0, false, 0, eight, null, 380, null);
            String strC = C16338g.c(z11 ? com.meijer.mobile.shopandscan.e.f117970x1 : com.meijer.mobile.shopandscan.e.f117967w1, composerStartRestartGroup, 0);
            int i12 = LocalThemeScope.f17314g;
            int i13 = i11 & 14;
            si.j.h(localThemeScope, label, strC, null, composerStartRestartGroup, (q1.Label.f142335j << 3) | i12 | i13, 4);
            Q.e(localThemeScope, s1.i.f142482a, ComposableLambdaKt.c(1695721162, true, new d(localThemeScope, z11), composerStartRestartGroup, 54), composerStartRestartGroup, i12 | 384 | i13 | (s1.i.f142483b << 3));
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final boolean z12 = z11;
            t0L.a(new Function2() { // from class: nq.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t.C(localThemeScope, modifier, z12, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(final LocalThemeScope localThemeScope, final Modifier modifier, Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        final Function0<Unit> function02;
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1875045752);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            function02 = function0;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1875045752, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.CutoutContent (ShopAndScanScannerScreen.kt:481)");
            }
            Modifier modifierI = J.i(J.h(modifier, 0.0f, 1, null), H1.h.p(HttpResponseStatus.SUCCESS_OK));
            e.Companion companion = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            function02 = function0;
            C18052y0.a(function02, C5806j.f48836a.g(Modifier.INSTANCE, companion.d()), false, null, ComposableLambdaKt.c(-269400282, true, new e(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, ((i11 >> 6) & 14) | 24576, 12);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nq.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t.E(localThemeScope, modifier, function02, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(final LocalThemeScope localThemeScope, final Modifier modifier, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1683717398);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1683717398, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.LookUpItemButton (ShopAndScanScannerScreen.kt:506)");
            }
            Q.e(localThemeScope, C15133B.f141857a, ComposableLambdaKt.c(1693455182, true, new f(localThemeScope, modifier, function0), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (C15133B.f141858b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nq.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t.G(localThemeScope, modifier, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect K(InterfaceC5872l0<Rect> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(InterfaceC5872l0<Rect> interfaceC5872l0, Rect rect) {
        interfaceC5872l0.setValue(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    private static final v.ViewState R(z1<v.ViewState> z1Var) {
        return z1Var.getValue();
    }
}
