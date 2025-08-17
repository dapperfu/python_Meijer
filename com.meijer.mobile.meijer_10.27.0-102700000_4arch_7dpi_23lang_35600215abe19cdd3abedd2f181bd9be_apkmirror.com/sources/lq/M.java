package lq;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import kotlin.C17934f;
import kotlin.C17943i;
import kotlin.C17983x;
import kotlin.C17986y0;
import kotlin.Metadata;
import kotlin.N1;
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
import kotlin.jvm.internal.SourceDebugExtension;
import lq.M;
import lq.P;
import p1.C16193g;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a9\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\u0013\u0010\u000e\u001a1\u0010\u0018\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Llq/P;", "viewModel", "Landroidx/compose/ui/Modifier;", "modifier", "", "t", "(LJi/M;Llq/P;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Llq/P$b;", "viewState", "Lkotlin/Function1;", "Llq/P$a;", "sendEvent", "r", "(LJi/M;Landroidx/compose/ui/Modifier;Llq/P$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onBackPressed", "l", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "x", "onDismissDialog", "", "dialogTitle", "dialogText", "p", "(LJi/M;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "pluNumber", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149151a;

        a(LocalThemeScope localThemeScope) {
            this.f149151a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1515968969, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AppBar.<anonymous> (ShopAndScanLookupItemScreen.kt:139)");
            }
            M.n(this.f149151a, C16193g.c(com.meijer.mobile.shopandscan.e.f117013t1, composer, 0), composer, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149152a;

        b(Function0<Unit> function0) {
            this.f149152a = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1007190155, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AppBar.<anonymous> (ShopAndScanLookupItemScreen.kt:140)");
            }
            M.m(this.f149152a, composer, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149153a;

        c(Function0<Unit> function0) {
            this.f149153a = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-16420627, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemLookupErrorDialog.<anonymous> (ShopAndScanLookupItemScreen.kt:291)");
            }
            C17983x.d(this.f149153a, null, false, null, null, null, null, null, null, C15465b.f149200a.b(), composer, 805306368, 510);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f149154a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149155b;

        d(String str, LocalThemeScope localThemeScope) {
            this.f149154a = str;
            this.f149155b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1167196938, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemLookupErrorDialog.<anonymous> (ShopAndScanLookupItemScreen.kt:296)");
            }
            N1.b(this.f149154a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.f149155b.getAdsTypography().getHeadings().getSix().getStyle(), composer, 0, 0, 65534);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f149156a;

        e(String str) {
            this.f149156a = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(130080361, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemLookupErrorDialog.<anonymous> (ShopAndScanLookupItemScreen.kt:301)");
            }
            N1.b(this.f149156a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149157a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<P.a, Unit> f149158b;

        /* JADX WARN: Multi-variable type inference failed */
        f(LocalThemeScope localThemeScope, Function1<? super P.a, Unit> function1) {
            this.f149157a = localThemeScope;
            this.f149158b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(P.a.f.f149175a);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2025587324, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemLookupLayout.<anonymous> (ShopAndScanLookupItemScreen.kt:90)");
            }
            LocalThemeScope localThemeScope = this.f149157a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f149158b);
            final Function1<P.a, Unit> function1 = this.f149158b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: lq.N
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return M.f.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            M.l(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f15770g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149159a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P.ViewState f149160b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<P.a, Unit> f149161c;

        /* JADX WARN: Multi-variable type inference failed */
        g(LocalThemeScope localThemeScope, P.ViewState viewState, Function1<? super P.a, Unit> function1) {
            this.f149159a = localThemeScope;
            this.f149160b = viewState;
            this.f149161c = function1;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1189263499, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemLookupLayout.<anonymous> (ShopAndScanLookupItemScreen.kt:96)");
            }
            M.x(this.f149159a, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), this.f149160b, this.f149161c, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ShopAndScanLookupItemScreenKt$ItemLookupScreen$1$1", f = "ShopAndScanLookupItemScreen.kt", l = {}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f149162a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P f149163b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(P p10, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f149163b = p10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.f149163b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f149162a == 0) {
                ResultKt.b(obj);
                this.f149163b.u(P.a.b.f149171a);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149164a;

        i(LocalThemeScope localThemeScope) {
            this.f149164a = localThemeScope;
        }

        public final void a(InterfaceC14800I Button, Composer composer, int i10) {
            Intrinsics.j(Button, "$this$Button");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1604278104, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.LookupItemContent.<anonymous>.<anonymous> (ShopAndScanLookupItemScreen.kt:227)");
            }
            N1.b(C16193g.c(com.meijer.mobile.shopandscan.e.f116998o1, composer, 0), null, this.f149164a.getAdsColors().getAdsColorInverse().getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.f149164a.getAdsTypography().getHeadings().getSeven().getStyle(), composer, 0, 0, 65530);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149165a;

        j(LocalThemeScope localThemeScope) {
            this.f149165a = localThemeScope;
        }

        public final void a(InterfaceC14800I TextButton, Composer composer, int i10) {
            Intrinsics.j(TextButton, "$this$TextButton");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1622430203, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.LookupItemContent.<anonymous>.<anonymous> (ShopAndScanLookupItemScreen.kt:247)");
            }
            N1.b(C16193g.c(com.meijer.mobile.shopandscan.e.f116995n1, composer, 0), null, this.f149165a.getAdsColors().getAdsColorBrandPrimary().getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.f149165a.getAdsTypography().getHeadings().getSeven().getStyle(), composer, 0, 0, 65530);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void t(final LocalThemeScope localThemeScope, final P viewModel, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-990904087);
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
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-990904087, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemLookupScreen (ShopAndScanLookupItemScreen.kt:60)");
            }
            z1 z1VarB = o1.b(viewModel.getModelStore().b(), null, composerStartRestartGroup, 0, 1);
            Boolean bool = Boolean.TRUE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(viewModel);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new h(viewModel, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(bool, (Function2) objB, composerStartRestartGroup, 6);
            P.ViewState viewStateU = u(z1VarB);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD2 = composerStartRestartGroup.D(viewModel);
            Object objB2 = composerStartRestartGroup.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: lq.B
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return M.v(viewModel, (P.a) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            Modifier modifier4 = modifier3;
            r(localThemeScope, modifier4, viewStateU, (Function1) objB2, composerStartRestartGroup, (AbstractC5607a.f45514b << 6) | ((i12 >> 3) & 112) | LocalThemeScope.f15770g | (i12 & 14), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier4;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lq.D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.w(localThemeScope, viewModel, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
        function1.invoke(new P.a.LookupItem(D(interfaceC5730l0)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function1 function1) {
        function1.invoke(P.a.f.f149175a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Function1 function1) {
        function1.invoke(P.a.C2290a.f149170a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(LocalThemeScope localThemeScope, Modifier modifier, P.ViewState viewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        x(localThemeScope, modifier, viewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final LocalThemeScope localThemeScope, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1552055429);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(function0) ? 256 : 128;
        }
        if ((i12 & 131) == 130 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-1552055429, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AppBar (ShopAndScanLookupItemScreen.kt:112)");
            }
            C17943i.d(ComposableLambdaKt.c(-1515968969, true, new a(localThemeScope), composerStartRestartGroup, 54), Modifier.INSTANCE, ComposableLambdaKt.c(-1007190155, true, new b(function0), composerStartRestartGroup, 54), null, 0L, 0L, 0.0f, composerStartRestartGroup, 438, BinsView.TOTE_HEIGHT_DP);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lq.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.o(localThemeScope, modifier2, function0, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(LocalThemeScope localThemeScope, String str, Composer composer, int i10) {
        composer.startReplaceGroup(-1239610325);
        if (ComposerKt.M()) {
            ComposerKt.U(-1239610325, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AppBar.ItemLookupAppBarTitle (ShopAndScanLookupItemScreen.kt:115)");
        }
        N1.b(str, null, localThemeScope.getAdsColors().getAdsColorInverse().getColor(), 0L, null, null, null, 0L, null, null, 0L, F1.t.INSTANCE.b(), false, 1, 0, null, localThemeScope.getAdsTypography().getHeadings().getSeven().getStyle(), composer, i10 & 14, 3120, 55290);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final void p(final LocalThemeScope localThemeScope, final Function0<Unit> function0, final String str, final String str2, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1667650507);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.V(str2) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1667650507, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemLookupErrorDialog (ShopAndScanLookupItemScreen.kt:287)");
            }
            C17934f.a(function0, ComposableLambdaKt.c(-16420627, true, new c(function0), composerStartRestartGroup, 54), null, null, ComposableLambdaKt.c(1167196938, true, new d(str, localThemeScope), composerStartRestartGroup, 54), ComposableLambdaKt.c(130080361, true, new e(str2), composerStartRestartGroup, 54), null, 0L, 0L, null, composerStartRestartGroup, ((i11 >> 3) & 14) | 221232, 972);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lq.L
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.q(localThemeScope, function0, str, str2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Function0 function0, String str, String str2, int i10, Composer composer, int i11) {
        p(localThemeScope, function0, str, str2, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void r(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final lq.P.ViewState r35, final kotlin.jvm.functions.Function1<? super lq.P.a, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lq.M.r(Ji.M, androidx.compose.ui.Modifier, lq.P$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, Modifier modifier, P.ViewState viewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, modifier, viewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(P p10, P.a event) {
        Intrinsics.j(event, "event");
        p10.u(event);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, P p10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, p10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(final Ji.LocalThemeScope r69, androidx.compose.ui.Modifier r70, final lq.P.ViewState r71, final kotlin.jvm.functions.Function1<? super lq.P.a, kotlin.Unit> r72, androidx.compose.runtime.Composer r73, final int r74, final int r75) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lq.M.x(Ji.M, androidx.compose.ui.Modifier, lq.P$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(int i10, Function1 function1, InterfaceC5730l0 interfaceC5730l0, InterfaceC5692y KeyboardActions) {
        Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
        if (D(interfaceC5730l0).length() >= i10) {
            function1.invoke(new P.a.LookupItem(D(interfaceC5730l0)));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(int i10, InterfaceC5730l0 interfaceC5730l0, String it) {
        Intrinsics.j(it, "it");
        if (it.length() <= i10) {
            int i11 = 0;
            while (true) {
                if (i11 >= it.length()) {
                    E(interfaceC5730l0, it);
                    break;
                }
                if (!Character.isDigit(it.charAt(i11))) {
                    break;
                }
                i11++;
            }
        }
        return Unit.f142422a;
    }

    private static final String D(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void E(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Function0<Unit> function0, Composer composer, int i10) {
        composer.startReplaceGroup(-196249380);
        if (ComposerKt.M()) {
            ComposerKt.U(-196249380, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AppBar.ItemLookupAppBarClose (ShopAndScanLookupItemScreen.kt:126)");
        }
        C17986y0.a(function0, null, false, null, C15465b.f149200a.a(), composer, 24576, 14);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    private static final P.ViewState u(z1<P.ViewState> z1Var) {
        return z1Var.getValue();
    }
}
