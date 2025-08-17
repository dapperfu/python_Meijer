package Or;

import Co.ProductFullDetails;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import Or.A;
import Wr.ToolBarDecorator;
import Yr.CouponsProductDecorator;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.T;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14810b;
import java.util.List;
import kotlin.C17877E0;
import kotlin.C17906T0;
import kotlin.C17917Z;
import kotlin.C17927c1;
import kotlin.C17986y0;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;
import us.C17303A;
import vs.InterfaceC17607c;
import yr.L;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u009e\u0001\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000b0\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a½\u0001\u0010,\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\"2\u001a\u0010'\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\u000b0$2\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000b0$2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b,\u0010-\u001a#\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b/\u00100\u001a;\u00105\u001a\u00020\u000b*\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b5\u00106\u001a%\u00108\u001a\u00020\u000b*\u00020\u00002\u0006\u00107\u001a\u00020&2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b8\u00109\u001a%\u0010;\u001a\u00020\u000b*\u00020\u00002\u0006\u0010:\u001a\u00020&2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b;\u00109\u001a\u001b\u0010=\u001a\u00020\u000b*\u00020\u00002\u0006\u0010<\u001a\u00020&H\u0007¢\u0006\u0004\b=\u0010>\u001a%\u0010@\u001a\u00020\u000b*\u00020\u00002\u0006\u0010?\u001a\u0002012\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b@\u0010A\u001a\u001d\u0010B\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\bB\u0010C\u001a'\u0010D\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\bD\u0010E\"\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H\"\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L\"\u0014\u0010O\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010L\"\u0014\u0010Q\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010L¨\u0006R"}, d2 = {"LJi/M;", "Lx0/c1;", "scaffoldState", "LWr/c;", "toolBarDecorator", "", "newShoppingListEnabled", "isCouponLoaded", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onBackClicked", "Lkotlin/Function1;", "onShoppingListIconClicked", "onCartIconClicked", "footer", "Lkotlin/ParameterName;", "name", "content", "A", "(LJi/M;Lx0/c1;LWr/c;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "newShoppingListFeatureEnabled", "H", "(LJi/M;LWr/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isProductsCarouselLoading", "shouldShowHeader", "shouldShowViewAllLink", "isFetchProductsFailed", "", "productsListSize", "isUserLoggedIn", "Lvs/c;", "couponDetailProductDecoratorSingleItem", "", "couponDetailProductDecoratorList", "Lkotlin/Function2;", "LCo/h;", "", "onProductClicked", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "onEntryUpdate", "onViewAllProductsClicked", "onRetryClicked", "u", "(LJi/M;ZZZZIZLandroidx/compose/ui/Modifier;Lvs/c;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "imageURL", "s", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lak/a;", "headerText", "isLink", "onLinkClicked", "C", "(LJi/M;Lak/a;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "couponTitle", "y", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "couponDescription", "m", "couponTermsAndConditions", "w", "(LJi/M;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "date", "q", "(LJi/M;Lak/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "o", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "F", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lmk/b;", "a", "Lmk/b;", "price", "LYr/a;", "b", "LYr/a;", "product1", "c", "product2", "d", "product3", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private static final mk.b f24192a;

    /* renamed from: b, reason: collision with root package name */
    private static final CouponsProductDecorator f24193b;

    /* renamed from: c, reason: collision with root package name */
    private static final CouponsProductDecorator f24194c;

    /* renamed from: d, reason: collision with root package name */
    private static final CouponsProductDecorator f24195d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f24196a = new a();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f24197a;

        b(L1.h hVar) {
            this.f24197a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f24197a.getBottom(), H1.h.p(20), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f24198a;

        c(L1.h hVar) {
            this.f24198a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f24198a.getBottom(), H1.h.p(20), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<Integer, ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> f24199a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> function2) {
            this.f24199a = function2;
        }

        public final void a(int i10, ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a controlState) {
            Intrinsics.j(product, "product");
            Intrinsics.j(controlState, "controlState");
            this.f24199a.invoke(product, controlState);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a aVar) {
            a(num.intValue(), productFullDetails, aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f24200a;

        e(L1.h hVar) {
            this.f24200a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f24200a.getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f24201f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(L1.A a10) {
            super(1);
            this.f24201f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f24201f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f24202f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f24203g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f24204h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24205i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f24206j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f24207k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0 f24208l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC17607c f24209m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f24210n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f24211o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function0 f24212p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f24213q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function2 f24214r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function2 f24215s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, boolean z10, boolean z11, Function0 function02, InterfaceC17607c interfaceC17607c, List list, boolean z12, Function0 function03, boolean z13, Function2 function2, Function2 function22) {
            super(2);
            this.f24203g = nVar;
            this.f24204h = function0;
            this.f24205i = localThemeScope;
            this.f24206j = z10;
            this.f24207k = z11;
            this.f24208l = function02;
            this.f24209m = interfaceC17607c;
            this.f24210n = list;
            this.f24211o = z12;
            this.f24212p = function03;
            this.f24213q = z13;
            this.f24214r = function2;
            this.f24215s = function22;
            this.f24202f = i10;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            int i12;
            L1.n nVar;
            L1.h hVar;
            Modifier.Companion companion;
            L1.h hVar2;
            L1.h hVar3;
            Composer composer2;
            L1.n nVar2;
            L1.h hVar4;
            Modifier.Companion companion2;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f24203g.getHelpersHashCode();
            this.f24203g.i();
            L1.n nVar3 = this.f24203g;
            composer.startReplaceGroup(1372835906);
            n.b bVarM = nVar3.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            LocalThemeScope localThemeScope = this.f24205i;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = a.f24196a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar3.k(companion3, hVarA, (Function1) objB);
            boolean z10 = this.f24206j;
            boolean z11 = this.f24207k;
            Function0 function0 = this.f24208l;
            int i13 = LocalThemeScope.f15770g;
            L.c(localThemeScope, modifierK, z10, z11, function0, composer, i13);
            composer.startReplaceGroup(-94247017);
            InterfaceC17607c interfaceC17607c = this.f24209m;
            if (interfaceC17607c != null) {
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(hVarA);
                Object objB2 = composer.B();
                if (zV || objB2 == companion4.a()) {
                    objB2 = new b(hVarA);
                    composer.t(objB2);
                }
                composer.P();
                companion = companion3;
                hVar2 = hVarD;
                hVar3 = hVarE;
                nVar = nVar3;
                i11 = i13;
                hVar = hVarA;
                i12 = helpersHashCode;
                composer2 = composer;
                us.r.l(this.f24205i, interfaceC17607c, this.f24213q && interfaceC17607c.o(), false, false, nVar3.k(companion3, hVarC, (Function1) objB2), false, false, this.f24214r, this.f24215s, null, null, composer2, i13 | 27648, 0, 1632);
            } else {
                i11 = i13;
                i12 = helpersHashCode;
                nVar = nVar3;
                hVar = hVarA;
                companion = companion3;
                hVar2 = hVarD;
                hVar3 = hVarE;
                composer2 = composer;
            }
            composer2.P();
            composer2.startReplaceGroup(-94219959);
            List list = this.f24210n;
            if (list != null) {
                composer2.startReplaceGroup(5004770);
                L1.h hVar5 = hVar;
                boolean zV2 = composer2.V(hVar5);
                Object objB3 = composer2.B();
                if (zV2 || objB3 == companion4.a()) {
                    objB3 = new c(hVar5);
                    composer2.t(objB3);
                }
                composer2.P();
                L1.n nVar4 = nVar;
                Modifier.Companion companion5 = companion;
                Modifier modifierK2 = androidx.compose.foundation.layout.D.k(nVar4.k(companion5, hVar2, (Function1) objB3), H1.h.p(16), 0.0f, 2, null);
                LocalThemeScope localThemeScope2 = this.f24205i;
                boolean z12 = this.f24213q;
                Function2 function2 = this.f24214r;
                composer2.startReplaceGroup(5004770);
                boolean zV3 = composer2.V(this.f24215s);
                Object objB4 = composer2.B();
                if (zV3 || objB4 == companion4.a()) {
                    objB4 = new d(this.f24215s);
                    composer2.t(objB4);
                }
                composer2.P();
                nVar2 = nVar4;
                hVar4 = hVar5;
                companion2 = companion5;
                C17303A.e(localThemeScope2, list, z12, false, false, modifierK2, false, false, null, false, false, false, function2, (Function3) objB4, this.f24208l, null, null, null, composer, i11 | 27648, 0, 116704);
                composer2 = composer;
            } else {
                nVar2 = nVar;
                hVar4 = hVar;
                companion2 = companion;
            }
            composer2.P();
            composer2.startReplaceGroup(-94190073);
            if (this.f24211o) {
                LocalThemeScope localThemeScope3 = this.f24205i;
                composer2.startReplaceGroup(5004770);
                L1.h hVar6 = hVar4;
                boolean zV4 = composer2.V(hVar6);
                Object objB5 = composer2.B();
                if (zV4 || objB5 == companion4.a()) {
                    objB5 = new e(hVar6);
                    composer2.t(objB5);
                }
                composer2.P();
                yr.r.f(localThemeScope3, nVar2.k(companion2, hVar3, (Function1) objB5), null, this.f24212p, composer2, i11, 2);
            }
            composer.P();
            composer.P();
            if (this.f24203g.getHelpersHashCode() != i12) {
                this.f24204h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24216a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24217b;

        h(String str, LocalThemeScope localThemeScope) {
            this.f24216a = str;
            this.f24217b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(570415945, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.CouponTermsAndExclusions.<anonymous> (CouponDetailComposables.kt:366)");
            }
            N1.b(this.f24216a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.f24217b.getAdsTypography().getBodyCompact().getOne().getStyle(), composer, 0, 0, 65534);
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
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24218a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ToolBarDecorator f24219b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24220c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f24221d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24222e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f24223f;

        /* JADX WARN: Multi-variable type inference failed */
        i(LocalThemeScope localThemeScope, ToolBarDecorator toolBarDecorator, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Function0<Unit> function02, boolean z10) {
            this.f24218a = localThemeScope;
            this.f24219b = toolBarDecorator;
            this.f24220c = function0;
            this.f24221d = function1;
            this.f24222e = function02;
            this.f24223f = z10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-727828190, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.Frame.<anonymous>.<anonymous> (CouponDetailComposables.kt:100)");
            }
            A.H(this.f24218a, this.f24219b, this.f24220c, this.f24221d, this.f24222e, this.f24223f, null, composer, LocalThemeScope.f15770g, 32);
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
    static final class j implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f24224a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> f24225b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24226c;

        /* JADX WARN: Multi-variable type inference failed */
        j(boolean z10, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, LocalThemeScope localThemeScope) {
            this.f24224a = z10;
            this.f24225b = function3;
            this.f24226c = localThemeScope;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = (composer.V(paddingValues) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1442825655, i11, -1, "com.meijer.mobile.ui.coupon.composable.detail.Frame.<anonymous>.<anonymous> (CouponDetailComposables.kt:109)");
            }
            if (this.f24224a) {
                composer.startReplaceGroup(813663089);
                this.f24225b.invoke(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(813753888);
                P0.e eVarE = P0.e.INSTANCE.e();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierF = J.f(androidx.compose.foundation.layout.D.h(companion, paddingValues), 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f24226c;
                MeasurePolicy measurePolicyG = C5662h.g(eVarE, false);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
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
                D1.c(composerA, measurePolicyG, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C5664j c5664j = C5664j.f48612a;
                C17906T0.a(J.o(companion, H1.h.p(48)), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), H1.h.p(3), 0L, 0, composer, 390, 24);
                composer.v();
                composer.P();
            }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class k implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24227a;

        k(Function0<Unit> function0) {
            this.f24227a = function0;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1566446641, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.Toolbar.<anonymous> (CouponDetailComposables.kt:155)");
            }
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f24227a);
            final Function0<Unit> function0 = this.f24227a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Or.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return A.k.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17986y0.a((Function0) objB, null, false, null, C4501h.f24285a.c(), composer, 24576, 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class l implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f24228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f24229b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f24230c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f24231d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f24232e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24233f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24234g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f24235a;

            a(boolean z10) {
                this.f24235a = z10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1277090685, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.Toolbar.<anonymous>.<anonymous> (CouponDetailComposables.kt:167)");
                }
                C17988z0.a(C16190d.c(this.f24235a ? Bj.i.f2783t0 : Bj.i.f2780s0, composer, 0), ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(Nr.g.f22720a), null, C17877E0.f166879a.a(composer, C17877E0.f166880b).g(), composer, 0, 4);
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
        static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f24236a;

            b(int i10) {
                this.f24236a = i10;
            }

            public final void a(InterfaceC14800I BadgeBox, Composer composer, int i10) {
                Intrinsics.j(BadgeBox, "$this$BadgeBox");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1009916947, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.Toolbar.<anonymous>.<anonymous> (CouponDetailComposables.kt:182)");
                }
                N1.b(String.valueOf(this.f24236a), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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
        @SourceDebugExtension
        static final class c implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f24237a;

            c(Function0<Unit> function0) {
                this.f24237a = function0;
            }

            public final void b(InterfaceC14810b BadgeBox, Composer composer, int i10) {
                Intrinsics.j(BadgeBox, "$this$BadgeBox");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1350837558, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.Toolbar.<anonymous>.<anonymous> (CouponDetailComposables.kt:186)");
                }
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f24237a);
                final Function0<Unit> function0 = this.f24237a;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Or.D
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return A.l.c.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C17986y0.a((Function0) objB, null, false, null, C4501h.f24285a.a(), composer, 24576, 14);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
                b(interfaceC14810b, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(boolean z10, boolean z11, Function1<? super Boolean, Unit> function1, boolean z12, int i10, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f24228a = z10;
            this.f24229b = z11;
            this.f24230c = function1;
            this.f24231d = z12;
            this.f24232e = i10;
            this.f24233f = localThemeScope;
            this.f24234g = function0;
        }

        public final void b(InterfaceC14800I TopAppBar, Composer composer, int i10) {
            Intrinsics.j(TopAppBar, "$this$TopAppBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(87994778, i10, -1, "com.meijer.mobile.ui.coupon.composable.detail.Toolbar.<anonymous> (CouponDetailComposables.kt:163)");
            }
            composer.startReplaceGroup(-1336363025);
            if (!this.f24228a && this.f24229b) {
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f24230c) | composer.a(this.f24231d);
                final Function1<Boolean, Unit> function1 = this.f24230c;
                final boolean z10 = this.f24231d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Or.C
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return A.l.c(function1, z10);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C17986y0.a((Function0) objB, null, false, null, ComposableLambdaKt.c(-1277090685, true, new a(this.f24231d), composer, 54), composer, 24576, 14);
            }
            composer.P();
            composer.startReplaceGroup(-1336336738);
            int i11 = this.f24232e;
            ComposableLambda composableLambdaC = i11 != 0 ? ComposableLambdaKt.c(1009916947, true, new b(i11), composer, 54) : null;
            composer.P();
            Gj.c.d(null, this.f24233f.getAdsColors().getAdsColorSavings().getColor(), 0L, composableLambdaC, ComposableLambdaKt.c(-1350837558, true, new c(this.f24234g), composer, 54), composer, 24576, 5);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            b(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, boolean z10) {
            function1.invoke(Boolean.valueOf(z10));
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(Ji.LocalThemeScope r31, final kotlin.C17927c1 r32, final Wr.ToolBarDecorator r33, final boolean r34, final boolean r35, androidx.compose.ui.Modifier r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Or.A.A(Ji.M, x0.c1, Wr.c, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final Ji.LocalThemeScope r35, final boolean r36, final boolean r37, final boolean r38, final boolean r39, final int r40, final boolean r41, androidx.compose.ui.Modifier r42, vs.InterfaceC17607c r43, java.util.List<? extends vs.InterfaceC17607c> r44, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super java.lang.String, kotlin.Unit> r45, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r46, final kotlin.jvm.functions.Function0<kotlin.Unit> r47, final kotlin.jvm.functions.Function0<kotlin.Unit> r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Or.A.u(Ji.M, boolean, boolean, boolean, boolean, int, boolean, androidx.compose.ui.Modifier, vs.c, java.util.List, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static {
        mk.b bVarF = Co.l.f("USD", null, 3.79d, "$3.79", 1.0d, null, 34, null);
        f24192a = bVarF;
        ProductFullDetails productFullDetails = new ProductFullDetails(null, "Cinnamon Chex", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, bVarF, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -131075, 268435455, null);
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        f24193b = new CouponsProductDecorator(productFullDetails, null, null, null, companion.c("$3.79"), false, companion.c("$4.79"), "Cinnamon Chex", null, false, false, false, true, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33550126, null);
        f24194c = new CouponsProductDecorator(new ProductFullDetails(null, "Cinnamon Chex", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, bVarF, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -131075, 268435455, null), null, null, null, companion.c("$3.79"), false, null, "Cinnamon Chex", companion.c("$3.79 /lb, Approx 1 lb"), true, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33553518, null);
        f24195d = new CouponsProductDecorator(new ProductFullDetails(null, "Fruity Chex", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, bVarF, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -131075, 268435455, null), null, null, null, companion.c("$2.79"), false, null, "Fruity Chex", null, false, true, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33553262, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, C17927c1 c17927c1, ToolBarDecorator toolBarDecorator, boolean z10, boolean z11, Modifier modifier, Function0 function0, Function1 function1, Function0 function02, Function2 function2, Function3 function3, int i10, int i11, int i12, Composer composer, int i13) {
        A(localThemeScope, c17927c1, toolBarDecorator, z10, z11, modifier, function0, function1, function02, function2, function3, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(final Ji.LocalThemeScope r71, final ak.AbstractC5607a r72, final boolean r73, androidx.compose.ui.Modifier r74, final kotlin.jvm.functions.Function0<kotlin.Unit> r75, androidx.compose.runtime.Composer r76, final int r77, final int r78) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Or.A.C(Ji.M, ak.a, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, boolean z10, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        C(localThemeScope, abstractC5607a, z10, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void F(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2046685918);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.V(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(content) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2046685918, i12, -1, "com.meijer.mobile.ui.coupon.composable.detail.ScrollContainer (CouponDetailComposables.kt:395)");
            }
            Modifier modifierG = T.g(J.f(modifier, 0.0f, 1, null), T.c(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierG);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Or.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return A.G(modifier, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        F(modifier, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(final Ji.LocalThemeScope r23, final Wr.ToolBarDecorator r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final boolean r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Or.A.H(Ji.M, Wr.c, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, ToolBarDecorator toolBarDecorator, Function0 function0, Function1 function1, Function0 function02, boolean z10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        H(localThemeScope, toolBarDecorator, function0, function1, function02, z10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ji.LocalThemeScope r28, final java.lang.String r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Or.A.m(Ji.M, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void o(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(2146961943);
        if ((Integer.MIN_VALUE & i11) != 0) {
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
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(2146961943, i12, -1, "com.meijer.mobile.ui.coupon.composable.detail.CouponDetailDivider (CouponDetailComposables.kt:387)");
            }
            C17917Z.a(modifier2, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composerStartRestartGroup, (i12 >> 3) & 14, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Or.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return A.p(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final Ji.LocalThemeScope r30, final ak.AbstractC5607a r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Or.A.q(Ji.M, ak.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, abstractC5607a, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final java.lang.String r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Or.A.s(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        s(str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, boolean z10, boolean z11, boolean z12, boolean z13, int i10, boolean z14, Modifier modifier, InterfaceC17607c interfaceC17607c, List list, Function2 function2, Function2 function22, Function0 function0, Function0 function02, int i11, int i12, int i13, Composer composer, int i14) {
        u(localThemeScope, z10, z11, z12, z13, i10, z14, modifier, interfaceC17607c, list, function2, function22, function0, function02, composer, J0.a(i11 | 1), J0.a(i12), i13);
        return Unit.f142422a;
    }

    public static final void w(LocalThemeScope localThemeScope, final String couponTermsAndConditions, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(couponTermsAndConditions, "couponTermsAndConditions");
        Composer composerStartRestartGroup = composer.startRestartGroup(-604276606);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(couponTermsAndConditions) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-604276606, i11, -1, "com.meijer.mobile.ui.coupon.composable.detail.CouponTermsAndExclusions (CouponDetailComposables.kt:362)");
            }
            localThemeScope2 = localThemeScope;
            Sj.f.c(localThemeScope2, C16193g.c(Nr.g.f22767x0, composerStartRestartGroup, 0), null, null, false, null, ComposableLambdaKt.c(570415945, true, new h(couponTermsAndConditions, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864 | LocalThemeScope.f15770g | (i11 & 14), 30);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Or.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return A.x(localThemeScope2, couponTermsAndConditions, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, String str, int i10, Composer composer, int i11) {
        w(localThemeScope, str, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(final Ji.LocalThemeScope r28, final java.lang.String r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Or.A.y(Ji.M, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
