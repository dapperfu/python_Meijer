package es;

import Ki.LocalThemeScope;
import Ki.Q;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.recyclerview.widget.RecyclerView;
import as.C6293f;
import bk.AbstractC6392a;
import com.meijer.mobile.weeklyad.service.flipp.BuildConfig;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import d0.C13590y;
import di.Country;
import di.CustomerAddress;
import di.Region;
import dk.C13698b;
import es.AbstractC13870f;
import es.OrderStatusCardDecorator;
import es.x;
import fj.CardType;
import fj.PaymentDetailItem;
import ii.C14755b;
import ii.TrackingData;
import j$.time.Month;
import j$.time.Year;
import j0.InterfaceC14888I;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
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
import oi.E0;
import p1.C16335d;
import p1.C16338g;
import r1.C16819m;
import tp.Builder;
import tp.EnumC17276a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a9\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\r\u001a\u00020\u0005*\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a9\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\n\u001a9\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a7\u0010\u001f\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a7\u0010#\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010%\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b%\u0010&\u001a9\u0010'\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b'\u0010(\u001ai\u00100\u001a\u00020\u0005*\u00020\u00002\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b0\u00101\u001a\u000f\u00103\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104\"\u0014\u00107\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00109\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106¨\u0006<²\u0006\f\u0010:\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\u000e\u0010;\u001a\u00020!8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010;\u001a\u00020!8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Les/i;", "order", "Lkotlin/Function1;", "Les/f;", "", "onOrderStatusAction", "Landroidx/compose/ui/Modifier;", "modifier", "G", "(LKi/M;Les/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Les/J;", "banner", "I", "(LKi/M;Les/J;Les/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", BarcodePickDeserializer.FIELD_ICON, "r", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "t", "B", "(LKi/M;Les/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lbk/a;", "originalPickupTime", "rescheduledTime", "E", "(LKi/M;Landroidx/compose/ui/Modifier;Lbk/a;Lbk/a;Landroidx/compose/runtime/Composer;II)V", "orderTotal", "itemCount", "", "paymentGotDeclined", "z", "(LKi/M;Landroidx/compose/ui/Modifier;Lbk/a;IZLandroidx/compose/runtime/Composer;II)V", "", "orderNumber", "K", "(LKi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "p", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "n", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isRateAndTipSupported", "isLearnMoreVisible", "isOrderComplete", "Ltp/b;", "rateAndTipBuilder", "Ltp/a;", "flowType", "v", "(LKi/M;ZZZLjava/lang/String;Ltp/b;Ltp/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "Lfj/u;", "Q", "()Lfj/u;", "a", "Les/i;", "fakeOrder", "b", "fakeRateAndTipOrder", "previousTrackAction", "lastAction", "homescreen_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final OrderStatusCardDecorator f130836a;

    /* renamed from: b, reason: collision with root package name */
    private static final OrderStatusCardDecorator f130837b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f130838a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f130839b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13870f, Unit> f130840c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f130841d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: es.x$a$a, reason: collision with other inner class name */
        static final class C2067a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130842a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f130843b;

            C2067a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f130842a = localThemeScope;
                this.f130843b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-292902776, i10, -1, "com.meijer.mobile.ui.homescreen.orderstatus.CheckInButton.<anonymous>.<anonymous> (OrderStatusItem.kt:442)");
                }
                si.j.h(this.f130842a, this.f130843b.getLabels().getEnabledLabel(), C16338g.c(C6293f.f59662r, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        a(LocalThemeScope localThemeScope, Modifier modifier, Function1<? super AbstractC13870f, Unit> function1, String str) {
            this.f130838a = localThemeScope;
            this.f130839b = modifier;
            this.f130840c = function1;
            this.f130841d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, String str, String str2) {
            function1.invoke(new AbstractC13870f.ViewOrderDetail(str, false, str2, null, 8, null));
            return Unit.f143329a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1641139605, i10, -1, "com.meijer.mobile.ui.homescreen.orderstatus.CheckInButton.<anonymous> (OrderStatusItem.kt:430)");
            }
            LocalThemeScope localThemeScope = this.f130838a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, this.f130839b, false, null, 895, null);
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(this.f130840c) | composer.V(this.f130841d);
            final Function1<AbstractC13870f, Unit> function1 = this.f130840c;
            final String str = this.f130841d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                final String str2 = "Order Status component: Go to Checkin";
                objB = new Function0() { // from class: es.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return x.a.c(function1, str, str2);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-292902776, true, new C2067a(this.f130838a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
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
    static final class b implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f130844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13870f, Unit> f130845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f130846c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Builder f130847d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EnumC17276a f130848e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130849a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f130850b;

            a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f130849a = localThemeScope;
                this.f130850b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1053923573, i10, -1, "com.meijer.mobile.ui.homescreen.orderstatus.OrderCompleteButtons.<anonymous>.<anonymous>.<anonymous> (OrderStatusItem.kt:490)");
                }
                si.j.h(this.f130849a, this.f130850b.getLabels().getEnabledLabel(), C16338g.c(C6293f.f59641A, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        b(LocalThemeScope localThemeScope, Function1<? super AbstractC13870f, Unit> function1, String str, Builder builder, EnumC17276a enumC17276a) {
            this.f130844a = localThemeScope;
            this.f130845b = function1;
            this.f130846c = str;
            this.f130847d = builder;
            this.f130848e = enumC17276a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, String str, Builder builder, EnumC17276a enumC17276a) {
            function1.invoke(C14755b.a(new AbstractC13870f.RateAndTip(str, builder, enumC17276a, null, 8, null), new Function1() { // from class: es.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x.b.e((TrackingData) obj);
                }
            }));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(TrackingData trackWith) {
            Intrinsics.j(trackWith, "$this$trackWith");
            trackWith.v("home");
            trackWith.n("home");
            trackWith.h("pageName", "Meijer:Home Page");
            trackWith.h("screenName", "New home screen");
            return Unit.f143329a;
        }

        public final void c(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1732089278, i10, -1, "com.meijer.mobile.ui.homescreen.orderstatus.OrderCompleteButtons.<anonymous>.<anonymous> (OrderStatusItem.kt:473)");
            }
            LocalThemeScope localThemeScope = this.f130844a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), false, null, 895, null);
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f130845b) | composer.V(this.f130846c) | composer.D(this.f130847d) | composer.d(this.f130848e.ordinal());
            final Function1<AbstractC13870f, Unit> function1 = this.f130845b;
            final String str = this.f130846c;
            final Builder builder = this.f130847d;
            final EnumC17276a enumC17276a = this.f130848e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: es.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return x.b.d(function1, str, builder, enumC17276a);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1053923573, true, new a(this.f130844a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            c(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f130851a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderStatusCardDecorator f130852b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13870f, Unit> f130853c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130854a;

            a(LocalThemeScope localThemeScope) {
                this.f130854a = localThemeScope;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f130854a.getAdsSpacing().getSix().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f130854a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130855a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f130856b;

            b(LocalThemeScope localThemeScope, L1.h hVar) {
                this.f130855a = localThemeScope;
                this.f130856b = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f130855a.getAdsSpacing().getSix().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f130855a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f130856b.getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: es.x$c$c, reason: collision with other inner class name */
        static final class C2068c implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130857a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f130858b;

            C2068c(LocalThemeScope localThemeScope, L1.h hVar) {
                this.f130857a = localThemeScope;
                this.f130858b = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f130857a.getAdsSpacing().getSix().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f130857a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f130858b.getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130859a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderStatusCardDecorator f130860b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L1.h f130861c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ L1.h f130862d;

            d(LocalThemeScope localThemeScope, OrderStatusCardDecorator orderStatusCardDecorator, L1.h hVar, L1.h hVar2) {
                this.f130859a = localThemeScope;
                this.f130860b = orderStatusCardDecorator;
                this.f130861c = hVar;
                this.f130862d = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f130859a.getAdsSpacing().getSix().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f130859a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), (this.f130860b.getIsCheckInButtonVisible() ? this.f130861c : this.f130862d).getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class e extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f130863f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(L1.A a10) {
                super(1);
                this.f130863f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f130863f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f130864f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f130865g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f130866h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ OrderStatusCardDecorator f130867i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130868j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function1 f130869k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(L1.n nVar, int i10, Function0 function0, OrderStatusCardDecorator orderStatusCardDecorator, LocalThemeScope localThemeScope, Function1 function1) {
                super(2);
                this.f130865g = nVar;
                this.f130866h = function0;
                this.f130867i = orderStatusCardDecorator;
                this.f130868j = localThemeScope;
                this.f130869k = function1;
                this.f130864f = i10;
            }

            public final void a(Composer composer, int i10) {
                L1.h hVar;
                int i11;
                int i12;
                float f10;
                Composer composer2 = composer;
                if (((i10 & 11) ^ 2) == 0 && composer2.j()) {
                    composer2.K();
                    return;
                }
                int helpersHashCode = this.f130865g.getHelpersHashCode();
                this.f130865g.i();
                L1.n nVar = this.f130865g;
                composer2.startReplaceGroup(-304201784);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                L1.h hVarE = bVarM.e();
                OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator = this.f130867i.getOrderSubstitutionsDetailBannerDecorator();
                Boolean boolValueOf = orderSubstitutionsDetailBannerDecorator != null ? Boolean.valueOf(orderSubstitutionsDetailBannerDecorator.getIsOrderDetailBannerVisible()) : null;
                composer2.startReplaceGroup(-148355892);
                if (Intrinsics.e(boolValueOf, Boolean.TRUE)) {
                    OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator2 = this.f130867i.getOrderSubstitutionsDetailBannerDecorator();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer2.startReplaceGroup(5004770);
                    boolean zD = composer2.D(this.f130868j);
                    Object objB = composer2.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new a(this.f130868j);
                        composer2.t(objB);
                    }
                    composer2.P();
                    hVar = hVarD;
                    f10 = 0.0f;
                    i11 = helpersHashCode;
                    i12 = 1;
                    x.I(this.f130868j, orderSubstitutionsDetailBannerDecorator2, this.f130867i, androidx.compose.foundation.layout.J.h(nVar.k(companion, hVarC, (Function1) objB), 0.0f, 1, null), this.f130869k, composer, LocalThemeScope.f17314g, 0);
                    composer2 = composer;
                } else {
                    hVar = hVarD;
                    i11 = helpersHashCode;
                    i12 = 1;
                    f10 = 0.0f;
                }
                composer2.P();
                LocalThemeScope localThemeScope = this.f130868j;
                OrderStatusCardDecorator orderStatusCardDecorator = this.f130867i;
                Function1 function1 = this.f130869k;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion2, f10, i12, null), 0.0f, this.f130868j.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                composer2.startReplaceGroup(-1633490746);
                boolean zD2 = composer2.D(this.f130868j) | composer2.V(hVarC);
                Object objB2 = composer2.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(this.f130868j, hVarC);
                    composer2.t(objB2);
                }
                composer2.P();
                Modifier modifierK = nVar.k(modifierM, hVarA, (Function1) objB2);
                int i13 = LocalThemeScope.f17314g;
                x.t(localThemeScope, orderStatusCardDecorator, function1, modifierK, composer2, i13, 0);
                composer2.startReplaceGroup(-148317362);
                if (this.f130867i.getIsCheckInButtonVisible()) {
                    String orderNumber = this.f130867i.getOrderNumber();
                    Modifier modifierM2 = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion2, f10, i12, null), 0.0f, this.f130868j.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 13, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zD3 = composer2.D(this.f130868j) | composer2.V(hVarA);
                    Object objB3 = composer2.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new C2068c(this.f130868j, hVarA);
                        composer2.t(objB3);
                    }
                    composer2.P();
                    x.n(this.f130868j, orderNumber, nVar.k(modifierM2, hVarE, (Function1) objB3), this.f130869k, composer2, i13, 0);
                }
                composer2.P();
                composer2.startReplaceGroup(-148295379);
                if (this.f130867i.getIsRateAndTipSupported() || this.f130867i.getIsLearnMoreVisible()) {
                    LocalThemeScope localThemeScope2 = this.f130868j;
                    boolean isRateAndTipSupported = this.f130867i.getIsRateAndTipSupported();
                    boolean isLearnMoreVisible = this.f130867i.getIsLearnMoreVisible();
                    boolean isOrderComplete = this.f130867i.getIsOrderComplete();
                    String orderNumber2 = this.f130867i.getOrderNumber();
                    Builder rateAndTipBuilder = this.f130867i.getRateAndTipBuilder();
                    EnumC17276a flowType = this.f130867i.getFlowType();
                    Function1 function12 = this.f130869k;
                    Modifier modifierM3 = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion2, 0.0f, i12, null), this.f130868j.getAdsSpacing().getThree().getDp(), this.f130868j.getAdsSpacing().getFive().getDp(), this.f130868j.getAdsSpacing().getThree().getDp(), 0.0f, 8, null);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zD4 = composer2.D(this.f130868j) | composer2.D(this.f130867i) | composer2.V(hVarE) | composer2.V(hVarA);
                    Object objB4 = composer2.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new d(this.f130868j, this.f130867i, hVarE, hVarA);
                        composer2.t(objB4);
                    }
                    composer2.P();
                    Modifier modifierK2 = nVar.k(modifierM3, hVar, (Function1) objB4);
                    PaymentDetailItem paymentDetails = this.f130867i.getPaymentDetails();
                    x.v(localThemeScope2, isRateAndTipSupported, isLearnMoreVisible, isOrderComplete, orderNumber2, rateAndTipBuilder, flowType, function12, modifierK2, paymentDetails != null ? paymentDetails.getIsPaymentDeclined() : false, composer2, i13, 0);
                }
                composer.P();
                composer.P();
                if (this.f130865g.getHelpersHashCode() != i11) {
                    this.f130866h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, OrderStatusCardDecorator orderStatusCardDecorator, Function1<? super AbstractC13870f, Unit> function1) {
            this.f130851a = localThemeScope;
            this.f130852b = orderStatusCardDecorator;
            this.f130853c = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-269103178, i10, -1, "com.meijer.mobile.ui.homescreen.orderstatus.OrderStatusItem.<anonymous> (OrderStatusItem.kt:84)");
            }
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f130851a.getAdsSpacing().getThree().getDp(), this.f130851a.getAdsSpacing().getFour().getDp());
            OrderStatusCardDecorator orderStatusCardDecorator = this.f130852b;
            LocalThemeScope localThemeScope = this.f130851a;
            Function1<AbstractC13870f, Unit> function1 = this.f130853c;
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierJ, false, new e(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new f(nVar, 0, pairH.b(), orderStatusCardDecorator, localThemeScope, function1)), pairH.a(), composer, 48, 0);
            composer.U();
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
    static final class d implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f130870a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13870f, Unit> f130871b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderStatusCardDecorator f130872c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OrderSubstitutionsDetailBannerDecorator f130873d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130874a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f130875b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ OrderSubstitutionsDetailBannerDecorator f130876c;

            a(LocalThemeScope localThemeScope, j1 j1Var, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator) {
                this.f130874a = localThemeScope;
                this.f130875b = j1Var;
                this.f130876c = orderSubstitutionsDetailBannerDecorator;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                vo.b substitutionScreenType;
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1438901012, i10, -1, "com.meijer.mobile.ui.homescreen.orderstatus.SubstitutionBanner.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusItem.kt:211)");
                }
                LocalThemeScope localThemeScope = this.f130874a;
                q1.Label enabledLabel = this.f130875b.getLabels().getEnabledLabel();
                OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator = this.f130876c;
                si.j.h(localThemeScope, enabledLabel, C13698b.a((orderSubstitutionsDetailBannerDecorator == null || (substitutionScreenType = orderSubstitutionsDetailBannerDecorator.getSubstitutionScreenType()) == null) ? null : substitutionScreenType.getBannerActionText(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        d(LocalThemeScope localThemeScope, Function1<? super AbstractC13870f, Unit> function1, OrderStatusCardDecorator orderStatusCardDecorator, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator) {
            this.f130870a = localThemeScope;
            this.f130871b = function1;
            this.f130872c = orderStatusCardDecorator;
            this.f130873d = orderSubstitutionsDetailBannerDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, OrderStatusCardDecorator orderStatusCardDecorator, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator) {
            function1.invoke(C14755b.a(new AbstractC13870f.ViewSubstitutions(orderStatusCardDecorator.getOrderNumber(), orderSubstitutionsDetailBannerDecorator != null ? orderSubstitutionsDetailBannerDecorator.getSubstitutionScreenType() : null, orderStatusCardDecorator.m(), orderStatusCardDecorator.getPickupPersonName(), orderStatusCardDecorator.getRateAndTipBuilder().getFulfillmentType(), orderStatusCardDecorator.k(), null, 64, null), new Function1() { // from class: es.B
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x.d.e((TrackingData) obj);
                }
            }));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(TrackingData trackWith) {
            Intrinsics.j(trackWith, "$this$trackWith");
            trackWith.v("home");
            trackWith.n("home");
            trackWith.h("screenName", "New home screen");
            trackWith.h("pageName", "Meijer:Home Page");
            return Unit.f143329a;
        }

        public final void c(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1190522841, i10, -1, "com.meijer.mobile.ui.homescreen.orderstatus.SubstitutionBanner.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderStatusItem.kt:188)");
            }
            LocalThemeScope localThemeScope = this.f130870a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(this.f130871b) | composer.D(this.f130872c) | composer.V(this.f130873d);
            final Function1<AbstractC13870f, Unit> function1 = this.f130871b;
            final OrderStatusCardDecorator orderStatusCardDecorator = this.f130872c;
            final OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator = this.f130873d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: es.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return x.d.d(function1, orderStatusCardDecorator, orderSubstitutionsDetailBannerDecorator);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(1438901012, true, new a(this.f130870a, Assemble, this.f130873d), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            c(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f130877a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f130878b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f130879c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13870f, Unit> f130880d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130881a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f130882b;

            a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f130881a = localThemeScope;
                this.f130882b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1499663822, i10, -1, "com.meijer.mobile.ui.homescreen.orderstatus.ViewText.<anonymous>.<anonymous> (OrderStatusItem.kt:408)");
                }
                si.j.h(this.f130881a, this.f130882b.getLabels().getEnabledLabel(), C16338g.c(C6293f.f59643C, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        e(LocalThemeScope localThemeScope, boolean z10, String str, Function1<? super AbstractC13870f, Unit> function1) {
            this.f130877a = localThemeScope;
            this.f130878b = z10;
            this.f130879c = str;
            this.f130880d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(boolean z10, String str, String str2, Function1 function1) {
            function1.invoke(z10 ? new AbstractC13870f.ViewDeclinedPayment(str, false, str2) : new AbstractC13870f.ViewOrderDetail(str, false, str2, null, 8, null));
            return Unit.f143329a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-2047197029, i10, -1, "com.meijer.mobile.ui.homescreen.orderstatus.ViewText.<anonymous> (OrderStatusItem.kt:384)");
            }
            LocalThemeScope localThemeScope = this.f130877a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.e(this.f130877a.getAdsSpacing().getThree().getDp(), H1.h.p(0), 0.0f, 0.0f, 12, null), androidx.compose.foundation.layout.J.r(Assemble.getButtons().getEnabledButton().getModifier(), 0.0f, H1.h.p(28), 0.0f, 0.0f, 13, null), false, null, 831, null);
            composer.startReplaceGroup(-1224400529);
            boolean zA = composer.a(this.f130878b) | composer.V(this.f130879c) | composer.V(this.f130880d);
            final boolean z10 = this.f130878b;
            final String str = this.f130879c;
            final Function1<AbstractC13870f, Unit> function1 = this.f130880d;
            Object objB = composer.B();
            if (zA || objB == Composer.INSTANCE.a()) {
                final String str2 = "Order Status Component: View";
                objB = new Function0() { // from class: es.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return x.e.c(z10, str, str2, function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1499663822, true, new a(this.f130877a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
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
    /* JADX WARN: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(final Ki.LocalThemeScope r34, final boolean r35, final boolean r36, final boolean r37, final java.lang.String r38, final tp.Builder r39, final tp.EnumC17276a r40, final kotlin.jvm.functions.Function1<? super es.AbstractC13870f, kotlin.Unit> r41, androidx.compose.ui.Modifier r42, final boolean r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.x.v(Ki.M, boolean, boolean, boolean, java.lang.String, tp.b, tp.a, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, int i10, boolean z10, int i11, int i12, Composer composer, int i13) {
        z(localThemeScope, modifier, abstractC6392a, i10, z10, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03de A[PHI: r4
      0x03de: PHI (r4v1 androidx.compose.runtime.Composer) = (r4v0 androidx.compose.runtime.Composer), (r4v5 androidx.compose.runtime.Composer) binds: [B:118:0x0337, B:130:0x039a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void B(final Ki.LocalThemeScope r39, final es.OrderStatusCardDecorator r40, androidx.compose.ui.Modifier r41, final kotlin.jvm.functions.Function1<? super es.AbstractC13870f, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.x.B(Ki.M, es.i, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Function1 function1, OrderStatusCardDecorator orderStatusCardDecorator) {
        function1.invoke(new AbstractC13870f.Dismiss(orderStatusCardDecorator.getOrderNumber(), null, 2, null));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, OrderStatusCardDecorator orderStatusCardDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, orderStatusCardDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void E(final Ki.LocalThemeScope r29, androidx.compose.ui.Modifier r30, final bk.AbstractC6392a r31, final bk.AbstractC6392a r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.x.E(Ki.M, androidx.compose.ui.Modifier, bk.a, bk.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, modifier, abstractC6392a, abstractC6392a2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(final Ki.LocalThemeScope r19, final es.OrderStatusCardDecorator r20, final kotlin.jvm.functions.Function1<? super es.AbstractC13870f, kotlin.Unit> r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.x.G(Ki.M, es.i, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, OrderStatusCardDecorator orderStatusCardDecorator, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        G(localThemeScope, orderStatusCardDecorator, function1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(final Ki.LocalThemeScope r27, final es.OrderSubstitutionsDetailBannerDecorator r28, final es.OrderStatusCardDecorator r29, androidx.compose.ui.Modifier r30, final kotlin.jvm.functions.Function1<? super es.AbstractC13870f, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.x.I(Ki.M, es.J, es.i, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, OrderStatusCardDecorator orderStatusCardDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        I(localThemeScope, orderSubstitutionsDetailBannerDecorator, orderStatusCardDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(LocalThemeScope localThemeScope, String str, Function1 function1, boolean z10, int i10, Composer composer, int i11) {
        K(localThemeScope, str, function1, z10, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private static final PaymentDetailItem Q() {
        return new PaymentDetailItem("stg meijer", new CustomerAddress("9263828303895", null, "testing", "rev", "stg", BuildConfig.FLIPP_MERCHANT_ID, "Visa", "3874 Paxton", "Ave", "Cincinnati", new Region("US-OH", "Ohio", "OH", "US"), "22222", new Country("US", "United States"), "6152496085", "releasetesting1100@gmail.com", false, false, false, true, null, 589826, null), "8291", new CardType("visa", "Visa"), false, Month.NOVEMBER, Year.of(2030), null, "8985133973546", "9081339678", false, Month.OCTOBER, Year.of(2028), null, "2000000000002347", fj.x.f131997b, false, 73856, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, str, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void p(final Ki.LocalThemeScope r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            r0 = r19
            r7 = r22
            r8 = r23
            r1 = 339752533(0x14403655, float:9.704238E-27)
            r2 = r21
            androidx.compose.runtime.Composer r4 = r2.startRestartGroup(r1)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r8
            if (r2 == 0) goto L17
            r2 = r7 | 6
            goto L30
        L17:
            r2 = r7 & 6
            if (r2 != 0) goto L2f
            r2 = r7 & 8
            if (r2 != 0) goto L24
            boolean r2 = r4.V(r0)
            goto L28
        L24:
            boolean r2 = r4.D(r0)
        L28:
            if (r2 == 0) goto L2c
            r2 = 4
            goto L2d
        L2c:
            r2 = 2
        L2d:
            r2 = r2 | r7
            goto L30
        L2f:
            r2 = r7
        L30:
            r3 = r8 & 1
            if (r3 == 0) goto L39
            r2 = r2 | 48
        L36:
            r5 = r20
            goto L4b
        L39:
            r5 = r7 & 48
            if (r5 != 0) goto L36
            r5 = r20
            boolean r6 = r4.V(r5)
            if (r6 == 0) goto L48
            r6 = 32
            goto L4a
        L48:
            r6 = 16
        L4a:
            r2 = r2 | r6
        L4b:
            r6 = r2 & 19
            r9 = 18
            if (r6 != r9) goto L5c
            boolean r6 = r4.j()
            if (r6 != 0) goto L58
            goto L5c
        L58:
            r4.K()
            goto L9e
        L5c:
            if (r3 == 0) goto L63
            androidx.compose.ui.Modifier$a r3 = androidx.compose.ui.Modifier.INSTANCE
            r16 = r3
            goto L65
        L63:
            r16 = r5
        L65:
            boolean r3 = androidx.compose.runtime.ComposerKt.M()
            if (r3 == 0) goto L71
            r3 = -1
            java.lang.String r5 = "com.meijer.mobile.ui.homescreen.orderstatus.CloseIcon (OrderStatusItem.kt:414)"
            androidx.compose.runtime.ComposerKt.U(r1, r2, r3, r5)
        L71:
            ki.q1$h$b r1 = new ki.q1$h$b
            Ki.C$f$o r10 = Ki.C.f.o.f17066e
            r17 = 62
            r18 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            int r3 = Ki.LocalThemeScope.f17314g
            r2 = r2 & 14
            r2 = r2 | r3
            int r3 = ki.q1.h.DrawableIcon.f142322h
            int r3 = r3 << 3
            r5 = r2 | r3
            r6 = 6
            r2 = 0
            r3 = 0
            qi.C16671b.b(r0, r1, r2, r3, r4, r5, r6)
            boolean r1 = androidx.compose.runtime.ComposerKt.M()
            if (r1 == 0) goto L9c
            androidx.compose.runtime.ComposerKt.T()
        L9c:
            r5 = r16
        L9e:
            androidx.compose.runtime.T0 r1 = r4.l()
            if (r1 == 0) goto Lac
            es.m r2 = new es.m
            r2.<init>()
            r1.a(r2)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: es.x.p(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(int i10, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        r(i10, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final Ki.LocalThemeScope r17, final es.OrderStatusCardDecorator r18, final kotlin.jvm.functions.Function1<? super es.AbstractC13870f, kotlin.Unit> r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.x.t(Ki.M, es.i, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, OrderStatusCardDecorator orderStatusCardDecorator, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, orderStatusCardDecorator, function1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(boolean z10, String str, boolean z11, Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
        function1.invoke(z10 ? new AbstractC13870f.ViewDeclinedPayment(str, z11, w(interfaceC5872l0)) : new AbstractC13870f.ViewOrderDetail(str, z11, w(interfaceC5872l0), null, 8, null));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, boolean z10, boolean z11, boolean z12, String str, Builder builder, EnumC17276a enumC17276a, Function1 function1, Modifier modifier, boolean z13, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, z10, z11, z12, str, builder, enumC17276a, function1, modifier, z13, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void z(final Ki.LocalThemeScope r30, androidx.compose.ui.Modifier r31, final bk.AbstractC6392a r32, final int r33, final boolean r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.x.z(Ki.M, androidx.compose.ui.Modifier, bk.a, int, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    static {
        PaymentDetailItem paymentDetailItemQ = Q();
        int i10 = Cj.i.f4836w;
        Builder builder = new Builder(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        AbstractC6392a abstractC6392aC = companion.c("Grand Haven, Today 8 pm");
        AbstractC6392a abstractC6392aC2 = companion.c("221b Baker St");
        OrderStatusCardDecorator.OrderProgress orderProgress = new OrderStatusCardDecorator.OrderProgress("Ready for pickup", 76);
        vo.b bVar = vo.b.f166128g;
        f130836a = new OrderStatusCardDecorator(paymentDetailItemQ, "123", i10, orderProgress, abstractC6392aC, abstractC6392aC2, null, 0, false, false, false, false, false, builder, true, null, new OrderSubstitutionsDetailBannerDecorator(bVar, true), null, null, null, null, 2006976, null);
        PaymentDetailItem paymentDetailItemQ2 = Q();
        int i11 = Cj.i.f4836w;
        Builder builder2 = new Builder(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        f130837b = new OrderStatusCardDecorator(paymentDetailItemQ2, "123", i11, new OrderStatusCardDecorator.OrderProgress("Ready for pickup", 76), companion.c("Grand Haven, Today 8 pm"), companion.c("221b Baker St"), null, 0, false, false, false, false, true, builder2, false, null, new OrderSubstitutionsDetailBannerDecorator(bVar, true), null, null, null, null, 2019264, null);
    }

    private static final void K(final LocalThemeScope localThemeScope, final String str, final Function1<? super AbstractC13870f, Unit> function1, final boolean z10, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zD;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-705941377);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (composerStartRestartGroup.a(z10)) {
                i12 = RecyclerView.m.FLAG_MOVED;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-705941377, i11, -1, "com.meijer.mobile.ui.homescreen.orderstatus.ViewText (OrderStatusItem.kt:382)");
            }
            Q.e(localThemeScope, InterfaceC15205y.a.c.f142545a, ComposableLambdaKt.c(-2047197029, true, new e(localThemeScope, z10, str, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.c.f142546b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: es.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x.L(localThemeScope, str, function1, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final LocalThemeScope localThemeScope, final String str, Modifier modifier, final Function1<? super AbstractC13870f, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer composerStartRestartGroup = composer.startRestartGroup(1197556345);
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
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i16 = RecyclerView.m.FLAG_MOVED;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i17 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1197556345, i12, -1, "com.meijer.mobile.ui.homescreen.orderstatus.CheckInButton (OrderStatusItem.kt:428)");
            }
            Q.e(localThemeScope, InterfaceC15205y.a.e.f142549a, ComposableLambdaKt.c(1641139605, true, new a(localThemeScope, modifier, function1, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.e.f142550b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: es.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x.o(localThemeScope, str, modifier2, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void r(final int i10, final Modifier modifier, Composer composer, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(1969383638);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (composerStartRestartGroup.d(i10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1969383638, i13, -1, "com.meijer.mobile.ui.homescreen.orderstatus.FulfillmentIcon (OrderStatusItem.kt:224)");
            }
            C13590y.a(C16335d.c(i10, composerStartRestartGroup, i13 & 14), null, androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(modifier, H1.h.p(24)), H1.h.p(32)), null, null, 0.0f, null, composerStartRestartGroup, 48, BinsView.TOTE_HEIGHT_DP);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: es.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x.s(i10, modifier, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String w(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }
}
