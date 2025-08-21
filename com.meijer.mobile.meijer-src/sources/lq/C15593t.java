package lq;

import Ai.p1;
import Ai.y1;
import F1.j;
import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import h6.C14478i;
import hq.ShopAndScanLookupItemDecorator;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import ki.C15194s0;
import ki.InterfaceC15150T;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
import kotlin.C18052y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l6.C15457a;
import l6.C15461e;
import l6.InterfaceC15464h;
import l6.InterfaceC15467k;
import l6.InterfaceC15469m;
import lq.C15593t;
import lq.P;
import oi.E0;
import p1.C16338g;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a9\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\u0013\u0010\u000e\u001a1\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u0018\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001c\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a7\u0010%\u001a\u00020\u0005*\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010#\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0007¢\u0006\u0004\b%\u0010&\u001a+\u0010(\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0003¢\u0006\u0004\b(\u0010\u0012\u001a+\u0010)\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0003¢\u0006\u0004\b)\u0010\u0012¨\u0006.²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010+\u001a\u0004\u0018\u00010*8\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Llq/P;", "viewModel", "Landroidx/compose/ui/Modifier;", "modifier", "", "F", "(LKi/M;Llq/P;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Llq/P$b;", "viewState", "Lkotlin/Function1;", "Llq/P$a;", "sendEvent", "D", "(LKi/M;Llq/P$b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onBackPressed", "t", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "B", "Q", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "U", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "S", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lhq/g;", "item", "L", "(LKi/M;Lhq/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "z", "(LKi/M;Landroidx/compose/ui/Modifier;Lhq/g;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/l0;", "", "itemQuantity", "maxValue", "removeLastItem", "J", "(LKi/M;Landroidx/compose/runtime/l0;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "onClick", "r", "x", "Lh6/i;", "composition", "", "progress", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: lq.t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15593t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lq.t$a */
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f150108b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f150109c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lq.t$a$a, reason: collision with other inner class name */
        static final class C2318a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f150110a;

            C2318a(LocalThemeScope localThemeScope) {
                this.f150110a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1623526848, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AddToCartButton.<anonymous>.<anonymous> (ShopAndScanItemDetailsScreen.kt:425)");
                }
                LocalThemeScope localThemeScope = this.f150110a;
                si.j.h(localThemeScope, new q1.Label(null, this.f150110a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117883S, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        a(LocalThemeScope localThemeScope, Modifier modifier, Function0<Unit> function0) {
            this.f150107a = localThemeScope;
            this.f150108b = modifier;
            this.f150109c = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(861440531, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AddToCartButton.<anonymous> (ShopAndScanItemDetailsScreen.kt:421)");
            }
            E0.b(this.f150107a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, this.f150108b, false, null, 895, null), this.f150109c, ComposableLambdaKt.c(1623526848, true, new C2318a(this.f150107a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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
    /* renamed from: lq.t$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150111a;

        b(LocalThemeScope localThemeScope) {
            this.f150111a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-352051933, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AppBar.<anonymous> (ShopAndScanItemDetailsScreen.kt:131)");
            }
            C15593t.v(this.f150111a, C16338g.c(com.meijer.mobile.shopandscan.e.f117891W, composer, 0), composer, 0);
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
    /* renamed from: lq.t$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f150112a;

        c(Function0<Unit> function0) {
            this.f150112a = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1759777883, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AppBar.<anonymous> (ShopAndScanItemDetailsScreen.kt:132)");
            }
            C15593t.u(this.f150112a, composer, 0);
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
    /* renamed from: lq.t$d */
    static final class d implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150113a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f150114b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f150115c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lq.t$d$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f150116a;

            a(LocalThemeScope localThemeScope) {
                this.f150116a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1250819464, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.CancelButton.<anonymous>.<anonymous> (ShopAndScanItemDetailsScreen.kt:447)");
                }
                LocalThemeScope localThemeScope = this.f150116a;
                si.j.h(localThemeScope, new q1.Label(null, this.f150116a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117885T, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        d(LocalThemeScope localThemeScope, Modifier modifier, Function0<Unit> function0) {
            this.f150113a = localThemeScope;
            this.f150114b = modifier;
            this.f150115c = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(328538645, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.CancelButton.<anonymous> (ShopAndScanItemDetailsScreen.kt:443)");
            }
            E0.b(this.f150113a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, this.f150114b, false, null, 895, null), this.f150115c, ComposableLambdaKt.c(1250819464, true, new a(this.f150113a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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
    @SourceDebugExtension
    /* renamed from: lq.t$e */
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150117a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<P.a, Unit> f150118b;

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, Function1<? super P.a, Unit> function1) {
            this.f150117a = localThemeScope;
            this.f150118b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(P.a.e.f150011a);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-415814690, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemDetailsLayout.<anonymous> (ShopAndScanItemDetailsScreen.kt:82)");
            }
            LocalThemeScope localThemeScope = this.f150117a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f150118b);
            final Function1<P.a, Unit> function1 = this.f150118b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: lq.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15593t.e.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15593t.t(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f17314g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lq.t$f */
    static final class f implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150119a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P.ViewState f150120b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<P.a, Unit> f150121c;

        /* JADX WARN: Multi-variable type inference failed */
        f(LocalThemeScope localThemeScope, P.ViewState viewState, Function1<? super P.a, Unit> function1) {
            this.f150119a = localThemeScope;
            this.f150120b = viewState;
            this.f150121c = function1;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1805969769, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemDetailsLayout.<anonymous> (ShopAndScanItemDetailsScreen.kt:90)");
            }
            C15593t.B(this.f150119a, this.f150120b, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), this.f150121c, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: lq.t$g */
    static final class g implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150122a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Integer> f150123b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f150124c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f150125d;

        g(LocalThemeScope localThemeScope, InterfaceC5872l0<Integer> interfaceC5872l0, Function0<Unit> function0, int i10) {
            this.f150122a = localThemeScope;
            this.f150123b = interfaceC5872l0;
            this.f150124c = function0;
            this.f150125d = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(final InterfaceC5872l0 interfaceC5872l0, InterfaceC15150T interfaceC15150T, final Function0 function0, final int i10, y1 InputField) {
            Intrinsics.j(InputField, "$this$InputField");
            InputField.N(((Number) interfaceC5872l0.getValue()).intValue() <= 1 ? new q1.h.DrawableIcon(C.a.C3925k.f16891e, null, null, null, 0.0f, null, null, 126, null) : interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: lq.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C15593t.g.k(interfaceC5872l0, function0);
                }
            });
            InputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: lq.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C15593t.g.l(interfaceC5872l0, i10);
                }
            });
            return Unit.f143329a;
        }

        public final void e(final InterfaceC15150T Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1622017376, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemQuantityComponent.<anonymous> (ShopAndScanItemDetailsScreen.kt:386)");
            }
            LocalThemeScope localThemeScope = this.f150122a;
            int iIntValue = this.f150123b.getValue().intValue();
            q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f150123b);
            final InterfaceC5872l0<Integer> interfaceC5872l0 = this.f150123b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function2() { // from class: lq.v
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C15593t.g.f(interfaceC5872l0, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB);
            }
            Function2 function2 = (Function2) objB;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zV2 = composer.V(this.f150123b) | composer.D(Assemble) | composer.V(this.f150124c) | composer.d(this.f150125d);
            final InterfaceC5872l0<Integer> interfaceC5872l02 = this.f150123b;
            final Function0<Unit> function0 = this.f150124c;
            final int i11 = this.f150125d;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: lq.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15593t.g.g(interfaceC5872l02, Assemble, function0, i11, (y1) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            p1.h(localThemeScope, iIntValue, 0, quantityInput, function2, null, (Function1) objB2, composer, LocalThemeScope.f17314g | (q1.f.QuantityInput.f142263q << 9), 18);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15150T interfaceC15150T, Composer composer, Integer num) {
            e(interfaceC15150T, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC5872l0 interfaceC5872l0, int i10, int i11) {
            interfaceC5872l0.setValue(Integer.valueOf(i10));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5872l0 interfaceC5872l0, Function0 function0) {
            if (((Number) interfaceC5872l0.getValue()).intValue() > 1) {
                interfaceC5872l0.setValue(Integer.valueOf(((Number) interfaceC5872l0.getValue()).intValue() - 1));
            } else {
                function0.invoke();
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC5872l0 interfaceC5872l0, int i10) {
            if (((Number) interfaceC5872l0.getValue()).intValue() < i10) {
                interfaceC5872l0.setValue(Integer.valueOf(((Number) interfaceC5872l0.getValue()).intValue() + 1));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: lq.t$h */
    static final class h implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150126a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<P.a, Unit> f150127b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lq.t$h$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f150128a;

            a(LocalThemeScope localThemeScope) {
                this.f150128a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1547428625, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.WeightedItemInstructionsFooter.<anonymous>.<anonymous>.<anonymous> (ShopAndScanItemDetailsScreen.kt:276)");
                }
                LocalThemeScope localThemeScope = this.f150128a;
                si.j.h(localThemeScope, new q1.Label(null, this.f150128a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117889V, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, Function1<? super P.a, Unit> function1) {
            this.f150126a = localThemeScope;
            this.f150127b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(P.a.f.f150012a);
            return Unit.f143329a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(2050487228, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.WeightedItemInstructionsFooter.<anonymous>.<anonymous> (ShopAndScanItemDetailsScreen.kt:267)");
            }
            LocalThemeScope localThemeScope = this.f150126a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.g(Modifier.INSTANCE, 0.85f), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f150127b);
            final Function1<P.a, Unit> function1 = this.f150127b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: lq.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15593t.h.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1547428625, true, new a(this.f150126a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: lq.t$i */
    static final class i implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150129a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<P.a, Unit> f150130b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lq.t$i$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f150131a;

            a(LocalThemeScope localThemeScope) {
                this.f150131a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-590298536, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.WeightedItemInstructionsFooter.<anonymous>.<anonymous>.<anonymous> (ShopAndScanItemDetailsScreen.kt:298)");
                }
                LocalThemeScope localThemeScope = this.f150131a;
                si.j.h(localThemeScope, new q1.Label(null, this.f150131a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117881R, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        i(LocalThemeScope localThemeScope, Function1<? super P.a, Unit> function1) {
            this.f150129a = localThemeScope;
            this.f150130b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(P.a.d.f150010a);
            return Unit.f143329a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-441837083, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.WeightedItemInstructionsFooter.<anonymous>.<anonymous> (ShopAndScanItemDetailsScreen.kt:287)");
            }
            LocalThemeScope localThemeScope = this.f150129a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.g(Modifier.INSTANCE, 0.85f), H1.h.p(64)), 0.0f, 0.0f, 0.0f, H1.h.p(20), 7, null), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f150130b);
            final Function1<P.a, Unit> function1 = this.f150130b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: lq.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15593t.i.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-590298536, true, new a(this.f150129a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanLookupItemDecorator shopAndScanLookupItemDecorator, int i10, int i11, Composer composer, int i12) {
        z(localThemeScope, modifier, shopAndScanLookupItemDecorator, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(final LocalThemeScope localThemeScope, final P.ViewState viewState, Modifier modifier, final Function1<? super P.a, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-336962250);
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
            i12 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(viewState) : composerStartRestartGroup.D(viewState) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(function1) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-336962250, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemDetailsContent (ShopAndScanItemDetailsScreen.kt:142)");
            }
            Modifier modifierF = androidx.compose.foundation.layout.J.f(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.g(), composerStartRestartGroup, 48);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierF);
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
            ShopAndScanLookupItemDecorator lookupItemDecorator = viewState.getLookupItemDecorator();
            composerStartRestartGroup.startReplaceGroup(653703781);
            if (lookupItemDecorator != null) {
                if (lookupItemDecorator.getIsWeighted()) {
                    composerStartRestartGroup.startReplaceGroup(1178171790);
                    Q(localThemeScope, null, function1, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | ((i12 >> 3) & 896), 1);
                    composerStartRestartGroup.P();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1178294674);
                    L(localThemeScope, lookupItemDecorator, function1, composerStartRestartGroup, ((i12 >> 3) & 896) | LocalThemeScope.f17314g | (i12 & 14) | (AbstractC6392a.f60445b << 3));
                    composerStartRestartGroup.P();
                }
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final Modifier modifier4 = modifier2;
            t0L.a(new Function2() { // from class: lq.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15593t.C(localThemeScope, viewState, modifier4, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(LocalThemeScope localThemeScope, P.ViewState viewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, viewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

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
    private static final void D(final Ki.LocalThemeScope r33, final lq.P.ViewState r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function1<? super lq.P.a, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lq.C15593t.D(Ki.M, lq.P$b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, P.ViewState viewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        D(localThemeScope, viewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void F(LocalThemeScope localThemeScope, final P viewModel, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        LocalThemeScope localThemeScope2;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(208316091);
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
                ComposerKt.U(208316091, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemDetailsScreen (ShopAndScanItemDetailsScreen.kt:62)");
            }
            P.ViewState viewStateG = G(o1.b(viewModel.getModelStore().b(), null, composerStartRestartGroup, 0, 1));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(viewModel);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: lq.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15593t.H(viewModel, (P.a) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            D(localThemeScope2, viewStateG, modifier3, (Function1) objB, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | (AbstractC6392a.f60445b << 3) | (i12 & 896), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final LocalThemeScope localThemeScope3 = localThemeScope2;
            t0L.a(new Function2() { // from class: lq.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15593t.I(localThemeScope3, viewModel, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(P p10, P.a event) {
        Intrinsics.j(event, "event");
        p10.u(event);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, P p10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        F(localThemeScope, p10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void J(final LocalThemeScope localThemeScope, final InterfaceC5872l0<Integer> itemQuantity, final int i10, final Function0<Unit> removeLastItem, Composer composer, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(itemQuantity, "itemQuantity");
        Intrinsics.j(removeLastItem, "removeLastItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(408260041);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(itemQuantity) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.d(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(removeLastItem) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(408260041, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ItemQuantityComponent (ShopAndScanItemDetailsScreen.kt:384)");
            }
            Ki.Q.e(localThemeScope, C15194s0.f142448a, ComposableLambdaKt.c(1622017376, true, new g(localThemeScope, itemQuantity, removeLastItem, i10), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (C15194s0.f142449b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lq.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15593t.K(localThemeScope, itemQuantity, i10, removeLastItem, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(LocalThemeScope localThemeScope, InterfaceC5872l0 interfaceC5872l0, int i10, Function0 function0, int i11, Composer composer, int i12) {
        J(localThemeScope, interfaceC5872l0, i10, function0, composer, J0.a(i11 | 1));
        return Unit.f143329a;
    }

    private static final void L(LocalThemeScope localThemeScope, ShopAndScanLookupItemDecorator shopAndScanLookupItemDecorator, final Function1<? super P.a, Unit> function1, Composer composer, final int i10) {
        int i11;
        final ShopAndScanLookupItemDecorator shopAndScanLookupItemDecorator2;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(40096386);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(shopAndScanLookupItemDecorator) : composerStartRestartGroup.D(shopAndScanLookupItemDecorator) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            shopAndScanLookupItemDecorator2 = shopAndScanLookupItemDecorator;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(40096386, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.QuantityItemContent (ShopAndScanItemDetailsScreen.kt:317)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = C5844c1.a(shopAndScanLookupItemDecorator.getQuantity());
                composerStartRestartGroup.t(objB);
            }
            final InterfaceC5868j0 interfaceC5868j0 = (InterfaceC5868j0) objB;
            composerStartRestartGroup.P();
            int i13 = LocalThemeScope.f17314g;
            int i14 = i12 & 14;
            z(localThemeScope2, null, shopAndScanLookupItemDecorator, composerStartRestartGroup, ((i12 << 3) & 896) | i13 | i14 | (AbstractC6392a.f60445b << 6), 1);
            shopAndScanLookupItemDecorator2 = shopAndScanLookupItemDecorator;
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i15 = i12 & 896;
            boolean z10 = i15 == 256;
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion.a()) {
                objB2 = new Function0() { // from class: lq.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15593t.M(function1);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            J(localThemeScope, interfaceC5868j0, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, (Function0) objB2, composerStartRestartGroup, i13 | 432 | i14);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 5;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, 0.0f, H1.h.p(20), 0.0f, H1.h.p(f10), 5, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z11 = (i15 == 256) | ((i12 & 112) == 32 || ((i12 & 64) != 0 && composerStartRestartGroup.D(shopAndScanLookupItemDecorator2)));
            Object objB3 = composerStartRestartGroup.B();
            if (z11 || objB3 == companion.a()) {
                objB3 = new Function0() { // from class: lq.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15593t.N(function1, shopAndScanLookupItemDecorator2, interfaceC5868j0);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            r(localThemeScope, modifierM, (Function0) objB3, composerStartRestartGroup, i13 | 48 | i14, 0);
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion2, 0.0f, H1.h.p(f10), 0.0f, H1.h.p(f10), 5, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z12 = i15 == 256;
            Object objB4 = composerStartRestartGroup.B();
            if (z12 || objB4 == companion.a()) {
                objB4 = new Function0() { // from class: lq.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15593t.O(function1);
                    }
                };
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            x(localThemeScope2, modifierM2, (Function0) objB4, composerStartRestartGroup, i13 | 48 | i14, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lq.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15593t.P(localThemeScope2, shopAndScanLookupItemDecorator2, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(Function1 function1) {
        function1.invoke(P.a.e.f150011a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Function1 function1, ShopAndScanLookupItemDecorator shopAndScanLookupItemDecorator, InterfaceC5868j0 interfaceC5868j0) {
        function1.invoke(new P.a.SubmitItem(shopAndScanLookupItemDecorator.getBarcode(), interfaceC5868j0.a()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function1 function1) {
        function1.invoke(P.a.e.f150011a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(LocalThemeScope localThemeScope, ShopAndScanLookupItemDecorator shopAndScanLookupItemDecorator, Function1 function1, int i10, Composer composer, int i11) {
        L(localThemeScope, shopAndScanLookupItemDecorator, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void Q(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final kotlin.jvm.functions.Function1<? super lq.P.a, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lq.C15593t.Q(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        Q(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, Composer composer, int i11) {
        S(localThemeScope, modifier, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private static final void U(LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(-958220770);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-958220770, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.WeightedItemInstructionsMainContent (ShopAndScanItemDetailsScreen.kt:206)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.g(), composerStartRestartGroup, 48);
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
            InterfaceC15467k interfaceC15467kR = l6.q.r(InterfaceC15469m.e.a(InterfaceC15469m.e.b(com.meijer.mobile.shopandscan.d.f117726f)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            final InterfaceC15464h interfaceC15464hC = C15457a.c(V(interfaceC15467kR), true, false, false, null, 0.0f, 0, null, false, false, composerStartRestartGroup, 48, 1020);
            C14478i c14478iV = V(interfaceC15467kR);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zV = composerStartRestartGroup.V(interfaceC15464hC);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: lq.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(C15593t.X(interfaceC15464hC));
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 5;
            composerStartRestartGroup = composerStartRestartGroup;
            C15461e.a(c14478iV, (Function0) objB, androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.D.m(companion2, 0.0f, H1.h.p(35), 0.0f, H1.h.p(f10), 5, null), H1.h.p(220)), false, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 384, 0, 131064);
            Ki.I six = localThemeScope2.getAdsTypography().getHeadings().getSix();
            Ki.T adsColorText01 = localThemeScope2.getAdsColors().getAdsColorText01();
            j.Companion companion3 = F1.j.INSTANCE;
            float f11 = 10;
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.g(companion2, 0.85f), 0.0f, H1.h.p(f11), 0.0f, H1.h.p(f11), 5, null), adsColorText01, null, F1.j.h(companion3.a()), 0, false, 0, six, null, 372, null);
            String strC = C16338g.c(com.meijer.mobile.shopandscan.e.f117895Y, composerStartRestartGroup, 0);
            int i12 = LocalThemeScope.f17314g;
            int i13 = i11 & 14;
            int i14 = q1.Label.f142335j;
            si.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
            localThemeScope2 = localThemeScope;
            si.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.g(companion2, 0.85f), 0.0f, H1.h.p(f10), 0.0f, H1.h.p(f11), 5, null), localThemeScope.getAdsColors().getAdsColorText01(), null, F1.j.h(companion3.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 372, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117893X, composerStartRestartGroup, 0), null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lq.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15593t.Y(localThemeScope2, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(LocalThemeScope localThemeScope, Modifier modifier, int i10, Composer composer, int i11) {
        U(localThemeScope, modifier, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            r1 = r17
            r3 = r19
            r4 = r21
            r0 = -1470732193(0xffffffffa856685f, float:-1.1902018E-14)
            r2 = r20
            androidx.compose.runtime.Composer r14 = r2.startRestartGroup(r0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r22 & r2
            if (r2 == 0) goto L18
            r2 = r4 | 6
            goto L31
        L18:
            r2 = r4 & 6
            if (r2 != 0) goto L30
            r2 = r4 & 8
            if (r2 != 0) goto L25
            boolean r2 = r14.V(r1)
            goto L29
        L25:
            boolean r2 = r14.D(r1)
        L29:
            if (r2 == 0) goto L2d
            r2 = 4
            goto L2e
        L2d:
            r2 = 2
        L2e:
            r2 = r2 | r4
            goto L31
        L30:
            r2 = r4
        L31:
            r5 = r22 & 1
            if (r5 == 0) goto L3a
            r2 = r2 | 48
        L37:
            r6 = r18
            goto L4c
        L3a:
            r6 = r4 & 48
            if (r6 != 0) goto L37
            r6 = r18
            boolean r7 = r14.V(r6)
            if (r7 == 0) goto L49
            r7 = 32
            goto L4b
        L49:
            r7 = 16
        L4b:
            r2 = r2 | r7
        L4c:
            r7 = r22 & 2
            if (r7 == 0) goto L53
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L63
        L53:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L63
            boolean r7 = r14.D(r3)
            if (r7 == 0) goto L60
            r7 = 256(0x100, float:3.59E-43)
            goto L62
        L60:
            r7 = 128(0x80, float:1.8E-43)
        L62:
            r2 = r2 | r7
        L63:
            r7 = r2 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L75
            boolean r7 = r14.j()
            if (r7 != 0) goto L70
            goto L75
        L70:
            r14.K()
        L73:
            r2 = r6
            goto Lba
        L75:
            if (r5 == 0) goto L7a
            androidx.compose.ui.Modifier$a r5 = androidx.compose.ui.Modifier.INSTANCE
            r6 = r5
        L7a:
            boolean r5 = androidx.compose.runtime.ComposerKt.M()
            if (r5 == 0) goto L86
            r5 = -1
            java.lang.String r7 = "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AppBar (ShopAndScanItemDetailsScreen.kt:103)"
            androidx.compose.runtime.ComposerKt.U(r0, r2, r5, r7)
        L86:
            lq.t$b r0 = new lq.t$b
            r0.<init>(r1)
            r5 = -352051933(0xffffffffeb041d23, float:-1.597158E26)
            r7 = 1
            r8 = 54
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r5, r7, r0, r14, r8)
            lq.t$c r0 = new lq.t$c
            r0.<init>(r3)
            r9 = -1759777883(0xffffffff971beba5, float:-5.0380626E-25)
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r9, r7, r0, r14, r8)
            r0 = r2 & 112(0x70, float:1.57E-43)
            r15 = r0 | 390(0x186, float:5.47E-43)
            r16 = 120(0x78, float:1.68E-43)
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            kotlin.C18009i.d(r5, r6, r7, r8, r9, r11, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.M()
            if (r0 == 0) goto L73
            androidx.compose.runtime.ComposerKt.T()
            goto L73
        Lba:
            androidx.compose.runtime.T0 r6 = r14.l()
            if (r6 == 0) goto Lca
            lq.r r0 = new lq.r
            r5 = r22
            r0.<init>()
            r6.a(r0)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lq.C15593t.t(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(LocalThemeScope localThemeScope, String str, Composer composer, int i10) {
        composer.startReplaceGroup(-136091908);
        if (ComposerKt.M()) {
            ComposerKt.U(-136091908, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AppBar.ItemDetailsToolbarTitle (ShopAndScanItemDetailsScreen.kt:106)");
        }
        si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorInverse(), null, null, F1.t.INSTANCE.b(), false, 1, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY, null), str, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3) | ((i10 << 6) & 896), 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        x(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void z(final Ki.LocalThemeScope r32, androidx.compose.ui.Modifier r33, final hq.ShopAndScanLookupItemDecorator r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lq.C15593t.z(Ki.M, androidx.compose.ui.Modifier, hq.g, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final P.ViewState G(z1<P.ViewState> z1Var) {
        return z1Var.getValue();
    }

    private static final void S(final LocalThemeScope localThemeScope, final Modifier modifier, final Function1<? super P.a, Unit> function1, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1162778794);
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
            if (composerStartRestartGroup.D(function1)) {
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
                ComposerKt.U(-1162778794, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.WeightedItemInstructionsFooter (ShopAndScanItemDetailsScreen.kt:261)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.g(), composerStartRestartGroup, 48);
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
            InterfaceC15205y.a.d dVar = InterfaceC15205y.a.d.f142547a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(2050487228, true, new h(localThemeScope, function1), composerStartRestartGroup, 54);
            int i15 = LocalThemeScope.f17314g;
            int i16 = i11 & 14;
            Ki.Q.e(localThemeScope, dVar, composableLambdaC, composerStartRestartGroup, i15 | 384 | i16 | (InterfaceC15205y.a.d.f142548b << 3));
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.c.f142545a, ComposableLambdaKt.c(-441837083, true, new i(localThemeScope, function1), composerStartRestartGroup, 54), composerStartRestartGroup, i16 | i15 | 384 | (InterfaceC15205y.a.c.f142546b << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lq.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15593t.T(localThemeScope, modifier, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final C14478i V(InterfaceC15467k interfaceC15467k) {
        return interfaceC15467k.getValue();
    }

    private static final float W(InterfaceC15464h interfaceC15464h) {
        return interfaceC15464h.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float X(InterfaceC15464h interfaceC15464h) {
        return W(interfaceC15464h);
    }

    private static final void r(final LocalThemeScope localThemeScope, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1559636817);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1559636817, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AddToCartButton (ShopAndScanItemDetailsScreen.kt:419)");
            }
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(861440531, true, new a(localThemeScope, modifier, function0), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.d.f142548b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lq.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15593t.s(localThemeScope, modifier2, function0, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Function0<Unit> function0, Composer composer, int i10) {
        composer.startReplaceGroup(1749995051);
        if (ComposerKt.M()) {
            ComposerKt.U(1749995051, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.AppBar.ItemDetailsToolbarClose (ShopAndScanItemDetailsScreen.kt:119)");
        }
        C18052y0.a(function0, null, false, null, C15575a.f150034a.a(), composer, 24576, 14);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    private static final void x(final LocalThemeScope localThemeScope, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(589116665);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(589116665, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.CancelButton (ShopAndScanItemDetailsScreen.kt:441)");
            }
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.c.f142545a, ComposableLambdaKt.c(328538645, true, new d(localThemeScope, modifier, function0), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.c.f142546b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lq.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15593t.y(localThemeScope, modifier2, function0, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
