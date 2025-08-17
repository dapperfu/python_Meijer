package pn;

import Ji.LocalThemeScope;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.compose.FullStoryAnnotationsKt;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.List;
import java.util.Locale;
import ji.j1;
import ji.q1;
import kotlin.A1;
import kotlin.AbstractC15962C;
import kotlin.C1;
import kotlin.C15977m;
import kotlin.C17906T0;
import kotlin.C17921a1;
import kotlin.FontWeight;
import kotlin.InterfaceC15985u;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TabPosition;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import okhttp3.HttpUrl;
import p1.C16193g;
import pn.Y;
import pn.c0;
import qv.C16648k;
import qv.InterfaceC16622O;
import rn.h0;
import tp.EnumC17127a;
import wo.C17843b;
import xo.AbstractC18074b;
import zp.DigitalReceipt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\u001aE\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aI\u0010\u0015\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u0017\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010\u0019\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001aC\u0010\u001d\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\t*\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b!\u0010\"\u001a%\u0010%\u001a\u00020\t*\u00020\u00002\u0006\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u001fH\u0003¢\u0006\u0004\b%\u0010&\u001a9\u0010(\u001a\u00020\t*\u00020\u00002\u0006\u0010#\u001a\u00020\u00012\b\b\u0002\u0010'\u001a\u00020\u001f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b(\u0010)¨\u0006*²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lpn/c0;", "initialTab", "Landroidx/compose/ui/Modifier;", "modifier", "Lrn/h0$e;", "viewState", "Lkotlin/Function1;", "Lrn/h0$c;", "", "onAction", "N", "(LJi/M;Lpn/c0;Landroidx/compose/ui/Modifier;Lrn/h0$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lo0/C;", "pagerState", "R", "(LJi/M;Lo0/C;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "tabIndex", "Landroid/content/Context;", "context", "V", "(LJi/M;ILrn/h0$e;Landroid/content/Context;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "w", "(LJi/M;Landroidx/compose/ui/Modifier;Landroid/content/Context;Lrn/h0$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "A", "(LJi/M;Landroidx/compose/ui/Modifier;Lrn/h0$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "y", "(LJi/M;Landroid/content/Context;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "G", "(LJi/M;Landroidx/compose/ui/Modifier;Landroid/content/Context;Lrn/h0$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isLoading", "E", "(LJi/M;ZLandroidx/compose/runtime/Composer;I)V", "orderHistoryTab", "isEmptyOrderHistoryVisible", "s", "(LJi/M;Lpn/c0;ZLandroidx/compose/runtime/Composer;II)V", "isOrderHistoryErrorVisible", "u", "(LJi/M;Lpn/c0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class Y {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155915a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC14814f f155916b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<h0.c, Unit> f155917c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0 f155918d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pn.Y$a$a, reason: collision with other inner class name */
        static final class C2421a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155919a;

            C2421a(LocalThemeScope localThemeScope) {
                this.f155919a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(463138893, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.ErrorOrderHistoryView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderHistoryScreen.kt:431)");
                }
                LocalThemeScope localThemeScope = this.f155919a;
                q1.Label label = new q1.Label(null, this.f155919a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99529Dh, composer, 0);
                Locale US = Locale.US;
                Intrinsics.i(US, "US");
                String upperCase = strC.toUpperCase(US);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, InterfaceC14814f interfaceC14814f, Function1<? super h0.c, Unit> function1, c0 c0Var) {
            this.f155915a = localThemeScope;
            this.f155916b = interfaceC14814f;
            this.f155917c = function1;
            this.f155918d = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, c0 c0Var) {
            h0.c cVar = h0.c.a.f159562a;
            if (!Intrinsics.e(c0Var, c0.b.f155969e)) {
                cVar = null;
            }
            if (cVar == null) {
                cVar = h0.c.b.f159563a;
            }
            function1.invoke(cVar);
            return Unit.f142422a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(290864288, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.ErrorOrderHistoryView.<anonymous>.<anonymous>.<anonymous> (OrderHistoryScreen.kt:419)");
            }
            LocalThemeScope localThemeScope = this.f155915a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, this.f155916b.c(Modifier.INSTANCE, P0.e.INSTANCE.g()), false, null, 895, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f155917c) | composer.V(this.f155918d);
            final Function1<h0.c, Unit> function1 = this.f155917c;
            final c0 c0Var = this.f155918d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: pn.X
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Y.a.c(function1, c0Var);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(463138893, true, new C2421a(this.f155915a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155920a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f155921b;

        b(LocalThemeScope localThemeScope, Context context) {
            this.f155920a = localThemeScope;
            this.f155921b = context;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1847065365, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.InStoreOrderView.<anonymous> (OrderHistoryScreen.kt:203)");
            }
            Y.y(this.f155920a, this.f155921b, null, composer, LocalThemeScope.f15770g, 2);
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
    static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155922a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.OrdersViewState f155923b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<h0.c, Unit> f155924c;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, h0.OrdersViewState ordersViewState, Function1<? super h0.c, Unit> function1) {
            this.f155922a = localThemeScope;
            this.f155923b = ordersViewState;
            this.f155924c = function1;
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
                ComposerKt.U(-2091460381, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.InStoreOrderView.<anonymous> (OrderHistoryScreen.kt:205)");
            }
            LocalThemeScope localThemeScope = this.f155922a;
            Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues);
            h0.OrdersViewState ordersViewState = this.f155923b;
            Function1<h0.c, Unit> function1 = this.f155924c;
            int i12 = LocalThemeScope.f15770g;
            Y.A(localThemeScope, modifierH, ordersViewState, function1, composer, i12);
            LocalThemeScope localThemeScope2 = this.f155922a;
            c0.b bVar = c0.b.f155969e;
            Y.s(localThemeScope2, bVar, this.f155923b.getIsInStoreOrdersEmptyPageVisible(), composer, i12 | 48, 0);
            Y.u(this.f155922a, bVar, this.f155923b.getIsInStoreOrdersErrorVisible(), this.f155924c, composer, i12 | 48, 0);
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
    static final class d implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155925a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f155926b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155927a;

            a(LocalThemeScope localThemeScope) {
                this.f155927a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-227093682, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.InStoreOrdersBottomBar.<anonymous>.<anonymous>.<anonymous> (OrderHistoryScreen.kt:261)");
                }
                LocalThemeScope localThemeScope = this.f155927a;
                q1.Label label = new q1.Label(null, this.f155927a.getAdsColors().getAdsColorText03(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                String strC = C16193g.c(C17843b.f166242a, composer, 0);
                Locale US = Locale.US;
                Intrinsics.i(US, "US");
                String upperCase = strC.toUpperCase(US);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Context context) {
            context.startActivity(Al.d.b(context, false, 0, 6, null));
            return Unit.f142422a;
        }

        d(LocalThemeScope localThemeScope, Context context) {
            this.f155925a = localThemeScope;
            this.f155926b = context;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1563560735, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.InStoreOrdersBottomBar.<anonymous>.<anonymous> (OrderHistoryScreen.kt:251)");
            }
            LocalThemeScope localThemeScope = this.f155925a;
            float f10 = 16;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(f10), H1.h.p(f10)), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f155926b);
            final Context context = this.f155926b;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: pn.Z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Y.d.c(context);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-227093682, true, new a(this.f155925a), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends FunctionReferenceImpl implements Function2<HttpUrl, String, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f155928b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context) {
            super(2, Intrinsics.Kotlin.class, "orderDetailListener", "OnlineTabView$orderDetailListener(Landroid/content/Context;Lokhttp3/HttpUrl;Ljava/lang/String;)V", 0);
            this.f155928b = context;
        }

        public final void a(HttpUrl p02, String p12) {
            Intrinsics.j(p02, "p0");
            Intrinsics.j(p12, "p1");
            Y.M(this.f155928b, p02, p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(HttpUrl httpUrl, String str) {
            a(httpUrl, str);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155929a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f155930b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.OrdersViewState f155931c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f155932d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f155933e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<h0.c, Unit> f155934f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function4<InterfaceC15985u, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155935a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0.OrdersViewState f155936b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f155937c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Modifier f155938d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<h0.c, Unit> f155939e;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, h0.OrdersViewState ordersViewState, Context context, Modifier modifier, Function1<? super h0.c, Unit> function1) {
                this.f155935a = localThemeScope;
                this.f155936b = ordersViewState;
                this.f155937c = context;
                this.f155938d = modifier;
                this.f155939e = function1;
            }

            public final void a(InterfaceC15985u HorizontalPager, int i10, Composer composer, int i11) {
                Intrinsics.j(HorizontalPager, "$this$HorizontalPager");
                if (ComposerKt.M()) {
                    ComposerKt.U(-796084183, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OrderHistoryScreen.<anonymous>.<anonymous>.<anonymous> (OrderHistoryScreen.kt:96)");
                }
                Y.V(this.f155935a, i10, this.f155936b, this.f155937c, this.f155938d, this.f155939e, composer, LocalThemeScope.f15770g | (i11 & 112), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15985u interfaceC15985u, Integer num, Composer composer, Integer num2) {
                a(interfaceC15985u, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        f(LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, h0.OrdersViewState ordersViewState, Context context, Modifier modifier, Function1<? super h0.c, Unit> function1) {
            this.f155929a = localThemeScope;
            this.f155930b = abstractC15962C;
            this.f155931c = ordersViewState;
            this.f155932d = context;
            this.f155933e = modifier;
            this.f155934f = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1364075008, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OrderHistoryScreen.<anonymous> (OrderHistoryScreen.kt:93)");
            }
            LocalThemeScope localThemeScope = this.f155929a;
            AbstractC15962C abstractC15962C = this.f155930b;
            h0.OrdersViewState ordersViewState = this.f155931c;
            Context context = this.f155932d;
            Modifier modifier = this.f155933e;
            Function1<h0.c, Unit> function1 = this.f155934f;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            Y.R(localThemeScope, abstractC15962C, null, composer, LocalThemeScope.f15770g, 2);
            C15977m.a(abstractC15962C, null, null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.c(-796084183, true, new a(localThemeScope, ordersViewState, context, modifier, function1), composer, 54), composer, 0, 24576, 16382);
            composer.v();
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
    static final class g implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f155940a;

        g(AbstractC15962C abstractC15962C) {
            this.f155940a = abstractC15962C;
        }

        public final void a(List<TabPosition> tabPositions, Composer composer, int i10) {
            Intrinsics.j(tabPositions, "tabPositions");
            if (ComposerKt.M()) {
                ComposerKt.U(1450454419, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OrderHistoryTabHeader.<anonymous> (OrderHistoryScreen.kt:122)");
            }
            C1 c12 = C1.f166781a;
            c12.b(c12.e(Modifier.INSTANCE, tabPositions.get(this.f155940a.v())), 0.0f, 0L, composer, C1.f166785e << 9, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            a(list, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155941a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f155942b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f155943c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f155944d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OrderHistoryScreenKt$OrderHistoryTabHeader$2$1$1$1$1", f = "OrderHistoryScreen.kt", l = {136}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f155945a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f155946b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC15962C f155947c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f155948d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10, AbstractC15962C abstractC15962C, InterfaceC5726j0 interfaceC5726j0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f155946b = i10;
                this.f155947c = abstractC15962C;
                this.f155948d = interfaceC5726j0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f155946b, this.f155947c, this.f155948d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f155945a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Y.T(this.f155948d, this.f155946b);
                    AbstractC15962C abstractC15962C = this.f155947c;
                    int iS = Y.S(this.f155948d);
                    this.f155945a = 1;
                    if (AbstractC15962C.n(abstractC15962C, iS, 0.0f, null, this, 6, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155949a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC15962C f155950b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f155951c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c0 f155952d;

            b(LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, int i10, c0 c0Var) {
                this.f155949a = localThemeScope;
                this.f155950b = abstractC15962C;
                this.f155951c = i10;
                this.f155952d = c0Var;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1104347195, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OrderHistoryTabHeader.<anonymous>.<anonymous>.<anonymous> (OrderHistoryScreen.kt:139)");
                }
                LocalThemeScope localThemeScope = this.f155949a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f155950b.v() == this.f155951c ? this.f155949a.getAdsColors().getAdsColorText03() : this.f155949a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo().f(FontWeight.INSTANCE.a()), null, 381, null), C16193g.c(this.f155952d.getTabName(), composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        h(LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, AbstractC15962C abstractC15962C, InterfaceC5726j0 interfaceC5726j0) {
            this.f155941a = localThemeScope;
            this.f155942b = interfaceC16622O;
            this.f155943c = abstractC15962C;
            this.f155944d = interfaceC5726j0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC16622O interfaceC16622O, int i10, AbstractC15962C abstractC15962C, InterfaceC5726j0 interfaceC5726j0) {
            C16648k.d(interfaceC16622O, null, null, new a(i10, abstractC15962C, interfaceC5726j0, null), 3, null);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-707731565, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OrderHistoryTabHeader.<anonymous> (OrderHistoryScreen.kt:129)");
            }
            List<c0> listA = c0.INSTANCE.a();
            LocalThemeScope localThemeScope = this.f155941a;
            final InterfaceC16622O interfaceC16622O = this.f155942b;
            final AbstractC15962C abstractC15962C = this.f155943c;
            final InterfaceC5726j0 interfaceC5726j0 = this.f155944d;
            final int i11 = 0;
            for (Object obj : listA) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.w();
                }
                c0 c0Var = (c0) obj;
                boolean z10 = Y.S(interfaceC5726j0) == i11;
                long color = localThemeScope.getAdsColors().getAdsColorText01().getColor();
                long color2 = localThemeScope.getAdsColors().getAdsColorActive01().getColor();
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null));
                composer2.startReplaceGroup(-1224400529);
                boolean zD = composer2.D(interfaceC16622O) | composer2.d(i11) | composer2.V(abstractC15962C);
                Object objB = composer2.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: pn.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Y.h.c(interfaceC16622O, i11, abstractC15962C, interfaceC5726j0);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                A1.b(z10, (Function0) objB, modifierFsUnmask, false, ComposableLambdaKt.c(-1104347195, true, new b(localThemeScope, abstractC15962C, i11, c0Var), composer2, 54), null, null, color2, color, composer2, 24576, 104);
                composer2 = composer;
                abstractC15962C = abstractC15962C;
                i11 = i12;
                interfaceC5726j0 = interfaceC5726j0;
                interfaceC16622O = interfaceC16622O;
            }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(final LocalThemeScope localThemeScope, final Modifier modifier, final h0.OrdersViewState ordersViewState, final Function1<? super h0.c, Unit> function1, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1864857125);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(ordersViewState) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1864857125, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.InStoreTabView (OrderHistoryScreen.kt:224)");
            }
            boolean isInStoreOrdersLoading = ordersViewState.getIsInStoreOrdersLoading();
            int i12 = LocalThemeScope.f15770g;
            int i13 = i11 & 14;
            E(localThemeScope, isInStoreOrdersLoading, composerStartRestartGroup, i12 | i13);
            if (!ordersViewState.d().isEmpty()) {
                boolean isInStoreOrdersEmptyPageVisible = ordersViewState.getIsInStoreOrdersEmptyPageVisible();
                List<AbstractC18074b> listD = ordersViewState.d();
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i14 = i11 & 7168;
                boolean z10 = i14 == 2048;
                Object objB = composerStartRestartGroup.B();
                if (z10 || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: pn.I
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Y.B(function1, (DigitalReceipt) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                Function1 function12 = (Function1) objB;
                composerStartRestartGroup.P();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z11 = i14 == 2048;
                Object objB2 = composerStartRestartGroup.B();
                if (z11 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: pn.J
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Y.C(function1);
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                composerStartRestartGroup.P();
                C16332m.j(localThemeScope, isInStoreOrdersEmptyPageVisible, modifier, listD, function12, (Function0) objB2, composerStartRestartGroup, i12 | i13 | ((i11 << 3) & 896), 0);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: pn.K
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Y.D(localThemeScope, modifier, ordersViewState, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function1 function1, DigitalReceipt receipt) {
        Intrinsics.j(receipt, "receipt");
        Long onlineOrderId = receipt.getOnlineOrderId();
        if (onlineOrderId != null) {
            function1.invoke(new h0.c.ViewOrderDetails(onlineOrderId.longValue()));
        } else {
            function1.invoke(new h0.c.ViewReceiptDetails(receipt));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Function1 function1) {
        function1.invoke(h0.c.C2482c.f159564a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, Modifier modifier, h0.OrdersViewState ordersViewState, Function1 function1, int i10, Composer composer, int i11) {
        A(localThemeScope, modifier, ordersViewState, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private static final void E(final LocalThemeScope localThemeScope, final boolean z10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(308205011);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(308205011, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.LoadingState (OrderHistoryScreen.kt:310)");
            }
            if (z10) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null));
                C5658d c5658d = C5658d.f48555a;
                C5658d.f fVarB = c5658d.b();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(fVarB, companion2.g(), composerStartRestartGroup, 54);
                int iA = C5717f.a(composerStartRestartGroup, 0);
                InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
                Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierFsUnmask);
                InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion3.a();
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
                D1.c(composerA, measurePolicyA, companion3.e());
                D1.c(composerA, interfaceC5742sR, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion3.f());
                C14815g c14815g = C14815g.f139108a;
                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion2.k(), composerStartRestartGroup, 0);
                int iA2 = C5717f.a(composerStartRestartGroup, 0);
                InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
                Function0<InterfaceC5811g> function0A2 = companion3.a();
                if (composerStartRestartGroup.k() == null) {
                    C5717f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A2);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA2 = D1.a(composerStartRestartGroup);
                D1.c(composerA2, measurePolicyA2, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C17906T0.a(c14815g.c(companion, companion2.g()), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), 0.0f, 0L, 0, composerStartRestartGroup, 0, 28);
                ri.j.h(localThemeScope, new q1.Label(null, null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 375, null), C16193g.c(C17843b.f166252k, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                composerStartRestartGroup.v();
                composerStartRestartGroup.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: pn.L
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Y.F(localThemeScope, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(LocalThemeScope localThemeScope, boolean z10, int i10, Composer composer, int i11) {
        E(localThemeScope, z10, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void G(final Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final android.content.Context r21, final rn.h0.OrdersViewState r22, kotlin.jvm.functions.Function1<? super rn.h0.c, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.Y.G(Ji.M, androidx.compose.ui.Modifier, android.content.Context, rn.h0$e, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(h0.c it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(Function1 function1, String orderNumber, EnumC17127a flowType) {
        Intrinsics.j(orderNumber, "orderNumber");
        Intrinsics.j(flowType, "flowType");
        function1.invoke(new h0.c.RateShopper(orderNumber, flowType));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(Function1 function1) {
        function1.invoke(h0.c.d.f159565a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(Function1 function1, String orderNumber) {
        Intrinsics.j(orderNumber, "orderNumber");
        function1.invoke(new h0.c.UpdatePaymentMethod(orderNumber));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(LocalThemeScope localThemeScope, Modifier modifier, Context context, h0.OrdersViewState ordersViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        G(localThemeScope, modifier, context, ordersViewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Context context, HttpUrl httpUrl, String str) {
        context.startActivity(Al.l.b(Al.l.f673a, context, str, null, null, 12, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void N(final Ji.LocalThemeScope r31, final pn.c0 r32, androidx.compose.ui.Modifier r33, rn.h0.OrdersViewState r34, kotlin.jvm.functions.Function1<? super rn.h0.c, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.Y.N(Ji.M, pn.c0, androidx.compose.ui.Modifier, rn.h0$e, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(h0.c it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P() {
        return c0.INSTANCE.a().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(LocalThemeScope localThemeScope, c0 c0Var, Modifier modifier, h0.OrdersViewState ordersViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        N(localThemeScope, c0Var, modifier, ordersViewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R(final Ji.LocalThemeScope r17, final kotlin.AbstractC15962C r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.Y.R(Ji.M, o0.C, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        R(localThemeScope, abstractC15962C, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void V(final Ji.LocalThemeScope r16, final int r17, final rn.h0.OrdersViewState r18, final android.content.Context r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function1<? super rn.h0.c, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.Y.V(Ji.M, int, rn.h0$e, android.content.Context, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(LocalThemeScope localThemeScope, int i10, h0.OrdersViewState ordersViewState, Context context, Modifier modifier, Function1 function1, int i11, int i12, Composer composer, int i13) {
        V(localThemeScope, i10, ordersViewState, context, modifier, function1, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ji.LocalThemeScope r32, final pn.c0 r33, boolean r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.Y.s(Ji.M, pn.c0, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, c0 c0Var, boolean z10, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, c0Var, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final Ji.LocalThemeScope r32, final pn.c0 r33, boolean r34, final kotlin.jvm.functions.Function1<? super rn.h0.c, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.Y.u(Ji.M, pn.c0, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, c0 c0Var, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        u(localThemeScope, c0Var, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final void w(final LocalThemeScope localThemeScope, final Modifier modifier, final Context context, final h0.OrdersViewState ordersViewState, final Function1<? super h0.c, Unit> function1, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-18941915);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(context) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(ordersViewState) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-18941915, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.InStoreOrderView (OrderHistoryScreen.kt:200)");
            }
            composer2 = composerStartRestartGroup;
            C17921a1.a(modifier, null, null, ComposableLambdaKt.c(-1847065365, true, new b(localThemeScope, context), composerStartRestartGroup, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-2091460381, true, new c(localThemeScope, ordersViewState, function1), composerStartRestartGroup, 54), composer2, ((i11 >> 3) & 14) | 3072, 12582912, 131062);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: pn.H
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Y.x(localThemeScope, modifier, context, ordersViewState, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, Context context, h0.OrdersViewState ordersViewState, Function1 function1, int i10, Composer composer, int i11) {
        w(localThemeScope, modifier, context, ordersViewState, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(final Ji.LocalThemeScope r17, final android.content.Context r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.Y.y(Ji.M, android.content.Context, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, Context context, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, context, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int S(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }
}
