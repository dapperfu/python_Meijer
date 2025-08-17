package pn;

import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import j0.C14801J;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.List;
import java.util.Locale;
import ji.InterfaceC14926b0;
import ji.a1;
import ji.j1;
import ji.q1;
import kotlin.C17906T0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import ni.E0;
import okhttp3.HttpUrl;
import p1.C16193g;
import pn.B;
import tp.EnumC17127a;
import wo.C17843b;
import xo.AbstractC18074b;
import xo.OrderHistoryHeaderDecorator;
import xo.OrdersItemDecorator;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¿\u0001\u0010\u0017\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001e\b\u0002\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u00062\u001e\b\u0002\u0010\r\u001a\u0018\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010 \u001a\u00020\n*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b \u0010!\u001ay\u0010$\u001a\u00020\n*\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u00062\u001c\u0010\r\u001a\u0018\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u00062\u0016\u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b$\u0010%*\u000e\u0010'\"\u0002`&2\u00060\bj\u0002`&¨\u0006("}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lxo/b;", "decorators", "Lkotlin/Function2;", "Lokhttp3/HttpUrl;", "", "Lcom/meijer/mobile/meijer/activity/orders/screens/orderhistory/OrderNumber;", "", "viewMoreListener", "Ltp/a;", "rateAndTipListener", "Lkotlin/Function0;", "onLoadMore", "", "isArchivedOrderLoading", "isMoreOrdersToLoad", "isEmptyOrderHistoryVisible", "isProgressBarVisible", "Lkotlin/Function1;", "updatePaymentMethodListener", "u", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;ZZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "isLoading", "m", "(LJi/M;ZLandroidx/compose/runtime/Composer;I)V", "o", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lxo/c;", "decorator", "q", "(LJi/M;Lxo/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lxo/e;", "orderItemDecorator", "s", "(LJi/M;Lxo/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/core/model/common/ResourceId;", "OrderNumber", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class B {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155822a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f155823b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrdersItemDecorator f155824c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: pn.B$a$a, reason: collision with other inner class name */
        static final class C2420a implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155825a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f155826b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ OrdersItemDecorator f155827c;

            /* JADX WARN: Multi-variable type inference failed */
            C2420a(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, OrdersItemDecorator ordersItemDecorator) {
                this.f155825a = localThemeScope;
                this.f155826b = function1;
                this.f155827c = ordersItemDecorator;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(String str, final Function1 function1, final OrdersItemDecorator ordersItemDecorator, Ci.o AdsInlineNotification) {
                Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
                AdsInlineNotification.D(str, new Function0() { // from class: pn.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return B.a.C2420a.e(function1, ordersItemDecorator);
                    }
                });
                return Unit.f142422a;
            }

            public final void c(InterfaceC14926b0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1843261264, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OnlineOrderItem.<anonymous>.<anonymous>.<anonymous> (OrderHistoryOnlineOrderTab.kt:216)");
                }
                final String strC = C16193g.c(C17843b.f166257p, composer, 0);
                String strC2 = C16193g.c(C17843b.f166259r, composer, 0);
                String strC3 = C16193g.c(C17843b.f166258q, composer, 0);
                q1.m.Inline error = Assemble.getToastVariant().getError();
                LocalThemeScope localThemeScope = this.f155825a;
                composer.startReplaceGroup(-1746271574);
                boolean zV = composer.V(strC) | composer.V(this.f155826b) | composer.D(this.f155827c);
                final Function1<String, Unit> function1 = this.f155826b;
                final OrdersItemDecorator ordersItemDecorator = this.f155827c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: pn.z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return B.a.C2420a.d(strC, function1, ordersItemDecorator, (Ci.o) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Ci.j.i(localThemeScope, null, strC3, strC2, error, (Function1) objB, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
                c(interfaceC14926b0, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1, OrdersItemDecorator ordersItemDecorator) {
                function1.invoke(ordersItemDecorator.getOrderNumber());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, OrdersItemDecorator ordersItemDecorator) {
            this.f155822a = localThemeScope;
            this.f155823b = function1;
            this.f155824c = ordersItemDecorator;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1648003235, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OnlineOrderItem.<anonymous>.<anonymous> (OrderHistoryOnlineOrderTab.kt:215)");
            }
            LocalThemeScope localThemeScope = this.f155822a;
            Ji.Q.e(localThemeScope, a1.f139760a, ComposableLambdaKt.c(-1843261264, true, new C2420a(localThemeScope, this.f155823b, this.f155824c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (a1.f139761b << 3));
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
    static final class b implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155828a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<HttpUrl, String, Unit> f155829b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrdersItemDecorator f155830c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155831a;

            a(LocalThemeScope localThemeScope) {
                this.f155831a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1141823252, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OnlineOrderItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderHistoryOnlineOrderTab.kt:311)");
                }
                LocalThemeScope localThemeScope = this.f155831a;
                q1.Label label = new q1.Label(null, this.f155831a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                String upperCase = C16193g.c(com.meijer.mobile.meijer.Y.f100079ga, composer, 0).toUpperCase(Locale.ROOT);
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
        b(LocalThemeScope localThemeScope, Function2<? super HttpUrl, ? super String, Unit> function2, OrdersItemDecorator ordersItemDecorator) {
            this.f155828a = localThemeScope;
            this.f155829b = function2;
            this.f155830c = ordersItemDecorator;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1773892295, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OnlineOrderItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderHistoryOnlineOrderTab.kt:302)");
            }
            LocalThemeScope localThemeScope = this.f155828a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f155829b) | composer.D(this.f155830c);
            final Function2<HttpUrl, String, Unit> function2 = this.f155829b;
            final OrdersItemDecorator ordersItemDecorator = this.f155830c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: pn.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return B.b.c(function2, ordersItemDecorator);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1141823252, true, new a(this.f155828a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function2 function2, OrdersItemDecorator ordersItemDecorator) {
            function2.invoke(ordersItemDecorator.getOrderURL(), ordersItemDecorator.getOrderNumber());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155832a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<String, EnumC17127a, Unit> f155833b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrdersItemDecorator f155834c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155835a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrdersItemDecorator f155836b;

            a(LocalThemeScope localThemeScope, OrdersItemDecorator ordersItemDecorator) {
                this.f155835a = localThemeScope;
                this.f155836b = ordersItemDecorator;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-715130091, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OnlineOrderItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderHistoryOnlineOrderTab.kt:338)");
                }
                LocalThemeScope localThemeScope = this.f155835a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f155835a.getAdsColors().getAdsColorText03(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C6408b.a(this.f155836b.j(), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
        c(LocalThemeScope localThemeScope, Function2<? super String, ? super EnumC17127a, Unit> function2, OrdersItemDecorator ordersItemDecorator) {
            this.f155832a = localThemeScope;
            this.f155833b = function2;
            this.f155834c = ordersItemDecorator;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(2019164642, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.OnlineOrderItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderHistoryOnlineOrderTab.kt:325)");
            }
            LocalThemeScope localThemeScope = this.f155832a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), false, null, 895, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f155833b) | composer.D(this.f155834c);
            final Function2<String, EnumC17127a, Unit> function2 = this.f155833b;
            final OrdersItemDecorator ordersItemDecorator = this.f155834c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: pn.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return B.c.c(function2, ordersItemDecorator);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-715130091, true, new a(this.f155832a, this.f155834c), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function2 function2, OrdersItemDecorator ordersItemDecorator) {
            function2.invoke(ordersItemDecorator.getOrderNumber(), ordersItemDecorator.getFlowType());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final d f155837f = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(AbstractC18074b abstractC18074b) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f155838f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f155839g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, List list) {
            super(1);
            this.f155838f = function1;
            this.f155839g = list;
        }

        public final Object a(int i10) {
            return this.f155838f.invoke(this.f155839g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f155840f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f155841g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function1 function1, List list) {
            super(1);
            this.f155840f = function1;
            this.f155841g = list;
        }

        public final Object a(int i10) {
            return this.f155840f.invoke(this.f155841g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class g extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f155842f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155843g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2 f155844h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2 f155845i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f155846j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list, LocalThemeScope localThemeScope, Function2 function2, Function2 function22, Function1 function1) {
            super(4);
            this.f155842f = list;
            this.f155843g = localThemeScope;
            this.f155844h = function2;
            this.f155845i = function22;
            this.f155846j = function1;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            AbstractC18074b abstractC18074b = (AbstractC18074b) this.f155842f.get(i10);
            composer.startReplaceGroup(-1161097885);
            if (abstractC18074b instanceof OrderHistoryHeaderDecorator) {
                composer.startReplaceGroup(-1161047728);
                B.q(this.f155843g, (OrderHistoryHeaderDecorator) abstractC18074b, null, composer, LocalThemeScope.f15770g, 2);
                composer.P();
            } else if (abstractC18074b instanceof OrdersItemDecorator) {
                composer.startReplaceGroup(-1160909127);
                OrdersItemDecorator ordersItemDecorator = (OrdersItemDecorator) abstractC18074b;
                if (ordersItemDecorator.getIsDeliveryModeExist()) {
                    B.s(this.f155843g, ordersItemDecorator, this.f155844h, this.f155845i, this.f155846j, null, composer, LocalThemeScope.f15770g, 16);
                } else {
                    uw.a.INSTANCE.s("Delivery Mode not found.", new Object[0]);
                }
                composer.P();
            } else {
                composer.startReplaceGroup(-1160334852);
                composer.P();
            }
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ji.LocalThemeScope r56, final xo.OrdersItemDecorator r57, final kotlin.jvm.functions.Function2<? super okhttp3.HttpUrl, ? super java.lang.String, kotlin.Unit> r58, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super tp.EnumC17127a, kotlin.Unit> r59, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r60, androidx.compose.ui.Modifier r61, androidx.compose.runtime.Composer r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.B.s(Ji.M, xo.e, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, java.util.List<? extends xo.AbstractC18074b> r35, kotlin.jvm.functions.Function2<? super okhttp3.HttpUrl, ? super java.lang.String, kotlin.Unit> r36, kotlin.jvm.functions.Function2<? super java.lang.String, ? super tp.EnumC17127a, kotlin.Unit> r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, boolean r39, boolean r40, boolean r41, boolean r42, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.B.u(Ji.M, androidx.compose.ui.Modifier, java.util.List, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(String str, EnumC17127a enumC17127a) {
        Intrinsics.j(str, "<unused var>");
        Intrinsics.j(enumC17127a, "<unused var>");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(String it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    private static final void m(final LocalThemeScope localThemeScope, final boolean z10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-908047534);
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
                ComposerKt.U(-908047534, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.LoadingOnlineState (OrderHistoryOnlineOrderTab.kt:119)");
            }
            if (z10) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null));
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
                Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, H1.h.p(17));
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
                int iA2 = C5717f.a(composerStartRestartGroup, 0);
                InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
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
                D1.c(composerA2, measurePolicyB, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14801J c14801j = C14801J.f139030a;
                float f10 = 20;
                C17906T0.a(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f10)), H1.h.p(f10)), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), 0.0f, 0L, 0, composerStartRestartGroup, 6, 28);
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, H1.h.p(11), 0.0f, 0.0f, 0.0f, 14, null), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 374, null), C16193g.c(C17843b.f166251j, composerStartRestartGroup, 0), null, composerStartRestartGroup, (q1.Label.f140080j << 3) | (i11 & 14) | LocalThemeScope.f15770g, 4);
                composerStartRestartGroup.v();
                composerStartRestartGroup.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: pn.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return B.n(localThemeScope, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, boolean z10, int i10, Composer composer, int i11) {
        m(localThemeScope, z10, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void o(final Ji.LocalThemeScope r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.B.o(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final Ji.LocalThemeScope r26, final xo.OrderHistoryHeaderDecorator r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.B.q(Ji.M, xo.c, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, OrderHistoryHeaderDecorator orderHistoryHeaderDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, orderHistoryHeaderDecorator, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, OrdersItemDecorator ordersItemDecorator, Function2 function2, Function2 function22, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, ordersItemDecorator, function2, function22, function1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(HttpUrl httpUrl, String str) {
        Intrinsics.j(httpUrl, "<unused var>");
        Intrinsics.j(str, "<unused var>");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(List list, LocalThemeScope localThemeScope, Function2 function2, Function2 function22, Function1 function1, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), new e(new Function1() { // from class: pn.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return B.x((AbstractC18074b) obj);
            }
        }, list), new f(d.f155837f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new g(list, localThemeScope, function2, function22, function1)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object x(AbstractC18074b item) {
        Intrinsics.j(item, "item");
        return item.getOrderId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, Modifier modifier, List list, Function2 function2, Function2 function22, Function0 function0, boolean z10, boolean z11, boolean z12, boolean z13, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        u(localThemeScope, modifier, list, function2, function22, function0, z10, z11, z12, z13, function1, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
