package en;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsDecorator;
import com.meijer.mobile.meijer.activity.orderoptions.y;
import d0.C13439f;
import en.C13699B;
import j0.InterfaceC14814f;
import java.util.List;
import ji.InterfaceC14920X;
import ji.q1;
import kotlin.A1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import r0.C16692i;
import r0.RoundedCornerShape;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u001aA\u0010\u000b\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0011\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0013\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0013\u0010\u0012\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;", "viewState", "", "isAddressQualifierNewUI", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "", "onOrderOptionsAction", "h", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/orderoptions/r;", "decorator", "isLoading", "onAction", "f", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/orderoptions/r;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "d", "", "", "a", "Ljava/util/List;", "tabList", "deliveryMode", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: en.B, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13699B {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f129073a = CollectionsKt.p("pickup", "delivery");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: en.B$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f129074a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129075b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f129076c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<y.e, Unit> f129077d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: en.B$a$a, reason: collision with other inner class name */
        static final class C2028a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f129078a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129079b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f129080c;

            C2028a(boolean z10, LocalThemeScope localThemeScope, boolean z11) {
                this.f129078a = z10;
                this.f129079b = localThemeScope;
                this.f129080c = z11;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1916835782, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.OrderOptionScreenNewTabs.<anonymous>.<anonymous>.<anonymous> (OrderOptionsScreen.kt:200)");
                }
                ri.j.h(this.f129079b, new q1.Label(null, this.f129080c ? this.f129079b.getAdsColors().getAdsColorInverse() : this.f129079b.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, this.f129079b.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(this.f129078a ? Hl.h.f12811v : Hl.h.f12761I, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
        a(OrderOptionsDecorator orderOptionsDecorator, LocalThemeScope localThemeScope, boolean z10, Function1<? super y.e, Unit> function1) {
            this.f129074a = orderOptionsDecorator;
            this.f129075b = localThemeScope;
            this.f129076c = z10;
            this.f129077d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(boolean z10, OrderOptionsDecorator orderOptionsDecorator, Function1 function1) {
            if ((!z10 || !orderOptionsDecorator.k()) && (z10 || !orderOptionsDecorator.l())) {
                function1.invoke(new y.e.SetFulfillmentMode(z10 ? "delivery" : "pickup"));
            }
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            boolean z10;
            long j10;
            RoundedCornerShape roundedCornerShapeD;
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-256382160, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.OrderOptionScreenNewTabs.<anonymous> (OrderOptionsScreen.kt:195)");
            }
            List<String> list = C13699B.f129073a;
            final OrderOptionsDecorator orderOptionsDecorator = this.f129074a;
            LocalThemeScope localThemeScope = this.f129075b;
            boolean z11 = this.f129076c;
            final Function1<y.e, Unit> function1 = this.f129077d;
            for (String str : list) {
                boolean zE = Intrinsics.e(str, orderOptionsDecorator.getSelectedDeliveryMode());
                final boolean zE2 = Intrinsics.e(str, "delivery");
                long color = localThemeScope.getAdsColors().getAdsColorInverse().getColor();
                long color2 = localThemeScope.getAdsColors().getAdsColorText01().getColor();
                boolean z12 = !z11;
                Modifier modifierI = J.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getEight().getDp());
                long color3 = zE ? localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor() : localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor();
                if (zE) {
                    z10 = z11;
                    roundedCornerShapeD = C16692i.c(localThemeScope.getAdsSpacing().getThree().getDp());
                    j10 = color2;
                } else if (Intrinsics.e(str, "delivery")) {
                    z10 = z11;
                    float f10 = 0;
                    j10 = color2;
                    roundedCornerShapeD = C16692i.d(H1.h.p(f10), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), H1.h.p(f10));
                } else {
                    z10 = z11;
                    j10 = color2;
                    float f11 = 0;
                    roundedCornerShapeD = C16692i.d(localThemeScope.getAdsSpacing().getThree().getDp(), H1.h.p(f11), H1.h.p(f11), localThemeScope.getAdsSpacing().getThree().getDp());
                }
                Modifier modifierC = androidx.compose.foundation.b.c(modifierI, color3, roundedCornerShapeD);
                float f12 = 0;
                Modifier modifierG = C13439f.g(modifierC, H1.h.p(f12), localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), zE ? C16692i.c(localThemeScope.getAdsSpacing().getThree().getDp()) : Intrinsics.e(str, "delivery") ? C16692i.d(H1.h.p(f12), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), H1.h.p(f12)) : C16692i.d(localThemeScope.getAdsSpacing().getThree().getDp(), H1.h.p(f12), H1.h.p(f12), localThemeScope.getAdsSpacing().getThree().getDp()));
                composer2.startReplaceGroup(-1746271574);
                boolean zA = composer2.a(zE2) | composer2.D(orderOptionsDecorator) | composer2.V(function1);
                Object objB = composer2.B();
                if (zA || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: en.A
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C13699B.a.c(zE2, orderOptionsDecorator, function1);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                A1.b(zE, (Function0) objB, modifierG, z12, ComposableLambdaKt.c(1916835782, true, new C2028a(zE2, localThemeScope, zE), composer2, 54), null, null, color, j10, composer2, 24576, 96);
                composer2 = composer;
                localThemeScope = localThemeScope;
                z11 = z10;
                function1 = function1;
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: en.B$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f129081a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129082b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f129083c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<y.e, Unit> f129084d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: en.B$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f129085a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129086b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f129087c;

            a(boolean z10, LocalThemeScope localThemeScope, boolean z11) {
                this.f129085a = z10;
                this.f129086b = localThemeScope;
                this.f129087c = z11;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-313562948, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.OrderOptionScreenTabs.<anonymous>.<anonymous>.<anonymous> (OrderOptionsScreen.kt:123)");
                }
                ri.j.h(this.f129086b, new q1.Label(null, this.f129087c ? this.f129086b.getAdsColors().getAdsColorBrandPrimary() : this.f129086b.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, this.f129086b.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(this.f129085a ? Hl.h.f12811v : Hl.h.f12761I, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
        b(OrderOptionsDecorator orderOptionsDecorator, LocalThemeScope localThemeScope, boolean z10, Function1<? super y.e, Unit> function1) {
            this.f129081a = orderOptionsDecorator;
            this.f129082b = localThemeScope;
            this.f129083c = z10;
            this.f129084d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(boolean z10, OrderOptionsDecorator orderOptionsDecorator, Function1 function1) {
            if ((!z10 || !orderOptionsDecorator.k()) && (z10 || !orderOptionsDecorator.l())) {
                function1.invoke(new y.e.SetFulfillmentMode(z10 ? "delivery" : "pickup"));
            }
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            long j10;
            RoundedCornerShape roundedCornerShapeD;
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1714102894, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.OrderOptionScreenTabs.<anonymous> (OrderOptionsScreen.kt:118)");
            }
            List<String> list = C13699B.f129073a;
            final OrderOptionsDecorator orderOptionsDecorator = this.f129081a;
            LocalThemeScope localThemeScope = this.f129082b;
            boolean z10 = this.f129083c;
            final Function1<y.e, Unit> function1 = this.f129084d;
            for (String str : list) {
                boolean zE = Intrinsics.e(str, orderOptionsDecorator.getSelectedDeliveryMode());
                final boolean zE2 = Intrinsics.e(str, "delivery");
                long color = localThemeScope.getAdsColors().getAdsColorText03().getColor();
                long color2 = localThemeScope.getAdsColors().getAdsColorText01().getColor();
                boolean z11 = !z10;
                Modifier modifierD = androidx.compose.foundation.b.d(Modifier.INSTANCE, zE ? localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor() : localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
                boolean z12 = z10;
                float fP = H1.h.p(1);
                long color3 = zE ? localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor() : localThemeScope.getAdsColors().getAdsColorsDisabled().getColor();
                if (Intrinsics.e(str, "delivery")) {
                    float f10 = 0;
                    float fP2 = H1.h.p(f10);
                    float f11 = 5;
                    j10 = color;
                    roundedCornerShapeD = C16692i.d(fP2, H1.h.p(f11), H1.h.p(f11), H1.h.p(f10));
                } else {
                    j10 = color;
                    float f12 = 5;
                    float f13 = 0;
                    roundedCornerShapeD = C16692i.d(H1.h.p(f12), H1.h.p(f13), H1.h.p(f13), H1.h.p(f12));
                }
                Modifier modifierG = C13439f.g(modifierD, fP, color3, roundedCornerShapeD);
                composer2.startReplaceGroup(-1746271574);
                boolean zA = composer2.a(zE2) | composer2.D(orderOptionsDecorator) | composer2.V(function1);
                Object objB = composer2.B();
                if (zA || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: en.C
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C13699B.b.c(zE2, orderOptionsDecorator, function1);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                A1.b(zE, (Function0) objB, modifierG, z11, ComposableLambdaKt.c(-313562948, true, new a(zE2, localThemeScope, zE), composer2, 54), null, null, j10, color2, composer2, 24576, 96);
                composer2 = composer;
                localThemeScope = localThemeScope;
                z10 = z12;
                function1 = function1;
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: en.B$c */
    static final class c implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f129088a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129089b;

        c(y.OrderOptionsViewState orderOptionsViewState, LocalThemeScope localThemeScope) {
            this.f129088a = orderOptionsViewState;
            this.f129089b = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(389138266, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.OrderOptionsScreen.<anonymous> (OrderOptionsScreen.kt:57)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar = Bi.o.f2584a;
            Bi.m.d(this.f129089b, FullStoryAnnotationsKt.fsUnmask(J.f(Modifier.INSTANCE, 0.0f, 1, null)), largeLoading, oVar, C6408b.a(this.f129088a.getLoadingState().getLoadingMessage(), composer, AbstractC5607a.f45514b), null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 48);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
            a(interfaceC14920X, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: en.B$d */
    static final class d implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f129090a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129091b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f129092c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<y.e, Unit> f129093d;

        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState, Function1<? super y.e, Unit> function1) {
            this.f129090a = z10;
            this.f129091b = localThemeScope;
            this.f129092c = orderOptionsViewState;
            this.f129093d = function1;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            OrderOptionsDecorator orderOptionsDecorator;
            OrderOptionsDecorator orderOptionsDecorator2;
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1353133174, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.OrderOptionsScreen.<anonymous> (OrderOptionsScreen.kt:68)");
            }
            if (this.f129090a) {
                composer.startReplaceGroup(-1372595588);
                LocalThemeScope localThemeScope = this.f129091b;
                OrderOptionsDecorator orderOptionsDecorator3 = this.f129092c.getOrderOptionsDecorator();
                if (orderOptionsDecorator3 == null) {
                    orderOptionsDecorator2 = new OrderOptionsDecorator(null, null, null, null, null, null, 63, null);
                } else {
                    orderOptionsDecorator2 = orderOptionsDecorator3;
                }
                boolean isLoading = this.f129092c.getLoadingState().getIsLoading();
                Function1<y.e, Unit> function1 = this.f129093d;
                int i11 = LocalThemeScope.f15770g;
                C13699B.d(localThemeScope, null, orderOptionsDecorator2, isLoading, function1, composer, i11, 1);
                q.n(this.f129091b, null, this.f129092c, true, this.f129093d, composer, i11 | 3072, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(-1372091993);
                LocalThemeScope localThemeScope2 = this.f129091b;
                OrderOptionsDecorator orderOptionsDecorator4 = this.f129092c.getOrderOptionsDecorator();
                if (orderOptionsDecorator4 == null) {
                    orderOptionsDecorator = new OrderOptionsDecorator(null, null, null, null, null, null, 63, null);
                } else {
                    orderOptionsDecorator = orderOptionsDecorator4;
                }
                boolean isLoading2 = this.f129092c.getLoadingState().getIsLoading();
                Function1<y.e, Unit> function12 = this.f129093d;
                int i12 = LocalThemeScope.f15770g;
                C13699B.f(localThemeScope2, null, orderOptionsDecorator, isLoading2, function12, composer, i12, 1);
                C17917Z.a(D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, this.f129091b.getAdsSpacing().getFive().getDp(), 7, null), this.f129091b.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
                q.n(this.f129091b, null, this.f129092c, false, this.f129093d, composer, i12 | 3072, 1);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsDecorator r21, final boolean r22, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.orderoptions.y.e, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en.C13699B.d(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.orderoptions.r, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, OrderOptionsDecorator orderOptionsDecorator, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, orderOptionsDecorator, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsDecorator r21, final boolean r22, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.orderoptions.y.e, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en.C13699B.f(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.orderoptions.r, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, OrderOptionsDecorator orderOptionsDecorator, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, orderOptionsDecorator, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final com.meijer.mobile.meijer.activity.orderoptions.y.OrderOptionsViewState r18, final boolean r19, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.orderoptions.y.e, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en.C13699B.h(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.orderoptions.y$g, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, y.OrderOptionsViewState orderOptionsViewState, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, orderOptionsViewState, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
