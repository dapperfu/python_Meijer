package com.meijer.mobile.mperks.ux.rewardDetail;

import Co.ProductFullDetails;
import F1.j;
import Ki.I;
import Ki.LocalThemeScope;
import Ki.T;
import L1.C4010g;
import L1.n;
import L1.x;
import Yr.CouponsProductDecorator;
import android.content.Context;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import co.RewardDetail;
import com.meijer.mobile.mperks.ux.j0;
import dk.C13698b;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import java.util.List;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C17993c1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l0.InterfaceC15433c;
import m5.C15669h;
import p1.C16338g;
import us.C17455A;
import vs.InterfaceC17723c;
import yr.L;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\b\u001a±\u0001\u0010\u0016\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\t0\u00072\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aµ\u0001\u0010\"\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\t0\u00072\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0007¢\u0006\u0004\b\"\u0010#\u001aU\u0010'\u001a\u00020\t*\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0007¢\u0006\u0004\b'\u0010(\u001a½\u0001\u0010*\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010)\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\t0\u00072\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0003¢\u0006\u0004\b*\u0010+\u001a£\u0001\u0010/\u001a\u00020\t*\u00020\u00002\u0006\u0010,\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010-\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\t0\u00072\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0003¢\u0006\u0004\b/\u00100\u001a'\u00101\u001a\u00020\t*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b1\u00102\u001a#\u00105\u001a\u00020\t*\u00020\u00002\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020%H\u0003¢\u0006\u0004\b5\u00106\u001a\u0013\u00107\u001a\u00020\t*\u00020\u0000H\u0003¢\u0006\u0004\b7\u00108\u001a%\u0010:\u001a\u00020\t*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u00109\u001a\u00020\u0003H\u0003¢\u0006\u0004\b:\u0010;\u001a\u001b\u0010=\u001a\u00020\t*\u00020\u00002\u0006\u0010<\u001a\u00020\u0003H\u0003¢\u0006\u0004\b=\u0010>\u001a'\u0010@\u001a\u00020\t*\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b@\u0010A\u001a\u001d\u0010C\u001a\u00020\t*\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\bC\u0010>\u001a=\u0010G\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010\u00032\u0006\u0010E\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010F\u001a\u00020\u0018H\u0003¢\u0006\u0004\bG\u0010H\"\u0014\u0010K\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J\"\u0014\u0010M\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010J\"\u0014\u0010O\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010J\"\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\"\u0014\u0010U\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010R\"\u0014\u0010W\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010R¨\u0006X"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/C;", "rewardDetailViewState", "", "navigatedFrom", "Lco/k;", "rewardDetail", "Lkotlin/Function2;", "LCo/h;", "", "onProductClicked", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "onEntryUpdate", "Lkotlin/Function0;", "onViewAllProductsClicked", "onRetryClicked", "onCartIconClicked", "onBackButtonClicked", "Landroidx/compose/ui/Modifier;", "modifier", "Lx0/c1;", "scaffoldState", "t", "(LKi/M;Lcom/meijer/mobile/mperks/ux/rewardDetail/C;Ljava/lang/String;Lco/k;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lx0/c1;Landroidx/compose/runtime/Composer;III)V", "", "isLoadingContent", "isFetchProductsFailed", "Lbk/a;", "productErrorMessage", "", "Lvs/c;", "rewardProductDecoratorList", "Lm5/h$a;", "imageBuilder", "K", "(LKi/M;ZZLbk/a;Lco/k;Ljava/lang/String;Ljava/util/List;Lm5/h$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "reward", "", "cartItemCount", "H", "(LKi/M;Lco/k;Ljava/lang/String;ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "hasUpcs", "F", "(LKi/M;ZZLbk/a;Lco/k;Ljava/lang/String;ZLm5/h$a;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "isProductsCarouselLoading", "isUserLoggedIn", "rewardDetailProductDecoratorList", "z", "(LKi/M;ZZLbk/a;ZLandroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "B", "(LKi/M;Ljava/lang/String;Lco/k;Landroidx/compose/runtime/Composer;I)V", "label", "daysLeft", "p", "(LKi/M;Lbk/a;ILandroidx/compose/runtime/Composer;I)V", "D", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "termConditionsText", "N", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "dateText", "P", "(LKi/M;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "rewardDescription", "r", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rewardName", "x", "imageUrl", "isExpired", "isShowImage", "v", "(Ljava/lang/String;ZLm5/h$a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "a", "LCo/h;", "product1", "b", "product2", "c", "product3", "LYr/a;", "d", "LYr/a;", "productDecorator1", "e", "productDecorator2", "f", "productDecorator3", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final ProductFullDetails f115439a;

    /* renamed from: b, reason: collision with root package name */
    private static final ProductFullDetails f115440b;

    /* renamed from: c, reason: collision with root package name */
    private static final ProductFullDetails f115441c;

    /* renamed from: d, reason: collision with root package name */
    private static final CouponsProductDecorator f115442d;

    /* renamed from: e, reason: collision with root package name */
    private static final CouponsProductDecorator f115443e;

    /* renamed from: f, reason: collision with root package name */
    private static final CouponsProductDecorator f115444f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RewardsDetailsViewState f115445a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115446b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RewardDetail f115447c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f115448d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115449e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115450f;

        a(RewardsDetailsViewState rewardsDetailsViewState, LocalThemeScope localThemeScope, RewardDetail rewardDetail, String str, Function0<Unit> function0, Function0<Unit> function02) {
            this.f115445a = rewardsDetailsViewState;
            this.f115446b = localThemeScope;
            this.f115447c = rewardDetail;
            this.f115448d = str;
            this.f115449e = function0;
            this.f115450f = function02;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(547101570, i10, -1, "com.meijer.mobile.mperks.ux.rewardDetail.RewardDetailScreenWithTopBar.<anonymous> (RewardsDetailsScreen.kt:91)");
            }
            w.H(this.f115446b, this.f115447c, this.f115448d, this.f115445a.getCartItemCount(), null, this.f115449e, this.f115450f, composer, LocalThemeScope.f17314g, 8);
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
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RewardsDetailsViewState f115451a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115452b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RewardDetail f115453c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f115454d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, String, Unit> f115455e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> f115456f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115457g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115458h;

        /* JADX WARN: Multi-variable type inference failed */
        b(RewardsDetailsViewState rewardsDetailsViewState, LocalThemeScope localThemeScope, RewardDetail rewardDetail, String str, Function2<? super ProductFullDetails, ? super String, Unit> function2, Function2<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> function22, Function0<Unit> function0, Function0<Unit> function02) {
            this.f115451a = rewardsDetailsViewState;
            this.f115452b = localThemeScope;
            this.f115453c = rewardDetail;
            this.f115454d = str;
            this.f115455e = function2;
            this.f115456f = function22;
            this.f115457g = function0;
            this.f115458h = function02;
        }

        public final void a(InterfaceC14882C padding, Composer composer, int i10) {
            int i11;
            Intrinsics.j(padding, "padding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(padding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1368972247, i11, -1, "com.meijer.mobile.mperks.ux.rewardDetail.RewardDetailScreenWithTopBar.<anonymous> (RewardsDetailsScreen.kt:100)");
            }
            w.K(this.f115452b, this.f115451a.getIsLoadingContent(), this.f115451a.getIsLoadProductsError(), this.f115451a.getProductErrorMessage(), this.f115453c, this.f115454d, this.f115451a.e(), new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), padding), this.f115455e, this.f115456f, this.f115457g, this.f115458h, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 9), 0, 0);
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
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f115459a = new c();

        c() {
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f115460a;

        d(L1.h hVar) {
            this.f115460a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f115460a.getBottom(), H1.h.p(12), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<Integer, ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> f115461a;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> function2) {
            this.f115461a = function2;
        }

        public final void a(int i10, ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a controlState) {
            Intrinsics.j(product, "product");
            Intrinsics.j(controlState, "controlState");
            this.f115461a.invoke(product, controlState);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a aVar) {
            a(num.intValue(), productFullDetails, aVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f115462a;

        f(L1.h hVar) {
            this.f115462a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f115462a.getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f115463f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(L1.A a10) {
            super(1);
            this.f115463f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f115463f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f115464f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f115465g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f115466h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115467i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f115468j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f115469k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List f115470l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f115471m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f115472n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f115473o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function2 f115474p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function2 f115475q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, boolean z10, Function0 function02, List list, AbstractC6392a abstractC6392a, Function0 function03, boolean z11, Function2 function2, Function2 function22) {
            super(2);
            this.f115465g = nVar;
            this.f115466h = function0;
            this.f115467i = localThemeScope;
            this.f115468j = z10;
            this.f115469k = function02;
            this.f115470l = list;
            this.f115471m = abstractC6392a;
            this.f115472n = function03;
            this.f115473o = z11;
            this.f115474p = function2;
            this.f115475q = function22;
            this.f115464f = i10;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            L1.n nVar;
            L1.h hVar;
            L1.h hVar2;
            Modifier.Companion companion;
            int i12;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f115465g.getHelpersHashCode();
            this.f115465g.i();
            L1.n nVar2 = this.f115465g;
            composer.startReplaceGroup(967939845);
            n.b bVarM = nVar2.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            LocalThemeScope localThemeScope = this.f115467i;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = c.f115459a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar2.k(companion2, hVarA, (Function1) objB);
            boolean z10 = !this.f115468j;
            Function0 function0 = this.f115469k;
            int i13 = LocalThemeScope.f17314g;
            L.c(localThemeScope, modifierK, true, z10, function0, composer, i13 | 384);
            Composer composer2 = composer;
            composer2.startReplaceGroup(169786422);
            List list = this.f115470l;
            if (list != null) {
                composer2.startReplaceGroup(5004770);
                boolean zV = composer2.V(hVarA);
                Object objB2 = composer2.B();
                if (zV || objB2 == companion3.a()) {
                    objB2 = new d(hVarA);
                    composer2.t(objB2);
                }
                composer2.P();
                Modifier modifierK2 = androidx.compose.foundation.layout.D.k(nVar2.k(companion2, hVarC, (Function1) objB2), H1.h.p(16), 0.0f, 2, null);
                LocalThemeScope localThemeScope2 = this.f115467i;
                boolean z11 = this.f115473o;
                Function2 function2 = this.f115474p;
                composer2.startReplaceGroup(5004770);
                boolean zV2 = composer2.V(this.f115475q);
                Object objB3 = composer2.B();
                if (zV2 || objB3 == companion3.a()) {
                    objB3 = new e(this.f115475q);
                    composer2.t(objB3);
                }
                composer2.P();
                i12 = i13;
                nVar = nVar2;
                hVar = hVarA;
                companion = companion2;
                hVar2 = hVarD;
                i11 = helpersHashCode;
                C17455A.e(localThemeScope2, list, z11, false, false, modifierK2, false, false, null, false, false, false, function2, (Function3) objB3, this.f115469k, null, null, null, composer, i13 | 27648, 0, 116704);
                composer2 = composer;
            } else {
                i11 = helpersHashCode;
                nVar = nVar2;
                hVar = hVarA;
                hVar2 = hVarD;
                companion = companion2;
                i12 = i13;
            }
            composer2.P();
            composer2.startReplaceGroup(169816365);
            if (this.f115468j) {
                LocalThemeScope localThemeScope3 = this.f115467i;
                composer2.startReplaceGroup(5004770);
                L1.h hVar3 = hVar;
                boolean zV3 = composer2.V(hVar3);
                Object objB4 = composer2.B();
                if (zV3 || objB4 == companion3.a()) {
                    objB4 = new f(hVar3);
                    composer2.t(objB4);
                }
                composer2.P();
                yr.r.f(localThemeScope3, nVar.k(companion, hVar2, (Function1) objB4), this.f115471m, this.f115472n, composer2, i12 | (AbstractC6392a.f60445b << 6), 0);
            }
            composer.P();
            composer.P();
            if (this.f115465g.getHelpersHashCode() != i11) {
                this.f115466h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f115477b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115478c;

        i(LocalThemeScope localThemeScope, int i10, Function0<Unit> function0) {
            this.f115476a = localThemeScope;
            this.f115477b = i10;
            this.f115478c = function0;
        }

        public final void a(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
            Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1215306362, i10, -1, "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailTopBar.<anonymous> (RewardsDetailsScreen.kt:188)");
            }
            Dr.s.k(this.f115476a, Integer.valueOf(this.f115477b), null, this.f115478c, composer, LocalThemeScope.f17314g, 2);
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
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115479a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f115480b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RewardDetail f115481c;

        j(LocalThemeScope localThemeScope, String str, RewardDetail rewardDetail) {
            this.f115479a = localThemeScope;
            this.f115480b = str;
            this.f115481c = rewardDetail;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r1 = r13 & 3
                r2 = 2
                if (r1 != r2) goto L10
                boolean r1 = r12.j()
                if (r1 != 0) goto Lc
                goto L10
            Lc:
                r12.K()
                return
            L10:
                boolean r1 = androidx.compose.runtime.ComposerKt.M()
                if (r1 == 0) goto L1f
                r1 = -1
                java.lang.String r2 = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailTopBar.<anonymous> (RewardsDetailsScreen.kt:167)"
                r3 = -1598111508(0xffffffffa0bec0ec, float:-3.2314917E-19)
                androidx.compose.runtime.ComposerKt.U(r3, r13, r1, r2)
            L1f:
                Ki.M r0 = r11.f115479a
                java.lang.String r1 = r11.f115480b
                r2 = 0
                if (r1 == 0) goto Lbc
                int r3 = r1.hashCode()
                switch(r3) {
                    case -68011789: goto La3;
                    case 569408189: goto L63;
                    case 1522071263: goto L4a;
                    case 2075337209: goto L2f;
                    default: goto L2d;
                }
            L2d:
                goto Lbc
            L2f:
                java.lang.String r3 = "MPERKS_REDEEM_TAB"
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L39
                goto Lbc
            L39:
                r1 = 1813154553(0x6c128af9, float:7.086378E26)
                r12.startReplaceGroup(r1)
                int r1 = com.meijer.mobile.mperks.ux.j0.f115210u1
                java.lang.String r1 = p1.C16338g.c(r1, r12, r2)
                r12.P()
                goto Lcb
            L4a:
                java.lang.String r3 = "MPERKS_EARN_TAB_AVAILABLE"
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L53
                goto Lbc
            L53:
                r1 = 1813137080(0x6c1246b8, float:7.073485E26)
                r12.startReplaceGroup(r1)
                int r1 = com.meijer.mobile.mperks.ux.j0.f115078I0
                java.lang.String r1 = p1.C16338g.c(r1, r12, r2)
                r12.P()
                goto Lcb
            L63:
                java.lang.String r3 = "MPERKS_EARN_TAB_IN_PROGRESS"
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L6c
                goto Lbc
            L6c:
                r1 = 372783723(0x16383a6b, float:1.4881835E-25)
                r12.startReplaceGroup(r1)
                co.k r1 = r11.f115481c
                if (r1 == 0) goto L7b
                co.m r1 = r1.getRewardProgram()
                goto L7c
            L7b:
                r1 = 0
            L7c:
                co.m r3 = co.EnumC6541m.f62801a
                if (r1 != r3) goto L90
                r1 = 372854713(0x16394fb9, float:1.4969337E-25)
                r12.startReplaceGroup(r1)
                int r1 = com.meijer.mobile.mperks.ux.j0.f115217x
                java.lang.String r1 = p1.C16338g.c(r1, r12, r2)
                r12.P()
                goto L9f
            L90:
                r1 = 372953138(0x163ad032, float:1.5090655E-25)
                r12.startReplaceGroup(r1)
                int r1 = com.meijer.mobile.mperks.ux.j0.f115078I0
                java.lang.String r1 = p1.C16338g.c(r1, r12, r2)
                r12.P()
            L9f:
                r12.P()
                goto Lcb
            La3:
                java.lang.String r3 = "MPERKS_REWARDS_TAB"
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto Lac
                goto Lbc
            Lac:
                r1 = 1813151545(0x6c127f39, float:7.0841585E26)
                r12.startReplaceGroup(r1)
                int r1 = com.meijer.mobile.mperks.ux.j0.f115222y1
                java.lang.String r1 = p1.C16338g.c(r1, r12, r2)
                r12.P()
                goto Lcb
            Lbc:
                r1 = 1813156921(0x6c129439, float:7.088125E26)
                r12.startReplaceGroup(r1)
                int r1 = com.meijer.mobile.mperks.ux.j0.f115222y1
                java.lang.String r1 = p1.C16338g.c(r1, r12, r2)
                r12.P()
            Lcb:
                int r9 = Ki.LocalThemeScope.f17314g
                r10 = 126(0x7e, float:1.77E-43)
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = r12
                Dr.g.g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                boolean r0 = androidx.compose.runtime.ComposerKt.M()
                if (r0 == 0) goto Le2
                androidx.compose.runtime.ComposerKt.T()
            Le2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.w.j.a(androidx.compose.runtime.Composer, int):void");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RewardDetail f115482a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115483b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f115484c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f115485d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f115486e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f115487f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15669h.a f115488g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC17723c> f115489h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, String, Unit> f115490i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> f115491j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115492k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115493l;

        /* JADX WARN: Multi-variable type inference failed */
        k(RewardDetail rewardDetail, LocalThemeScope localThemeScope, boolean z10, boolean z11, AbstractC6392a abstractC6392a, String str, C15669h.a aVar, List<? extends InterfaceC17723c> list, Function2<? super ProductFullDetails, ? super String, Unit> function2, Function2<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> function22, Function0<Unit> function0, Function0<Unit> function02) {
            this.f115482a = rewardDetail;
            this.f115483b = localThemeScope;
            this.f115484c = z10;
            this.f115485d = z11;
            this.f115486e = abstractC6392a;
            this.f115487f = str;
            this.f115488g = aVar;
            this.f115489h = list;
            this.f115490i = function2;
            this.f115491j = function22;
            this.f115492k = function0;
            this.f115493l = function02;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-341770949, i10, -1, "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsScreen.<anonymous>.<anonymous>.<anonymous> (RewardsDetailsScreen.kt:136)");
            }
            Modifier modifierF = J.f(Modifier.INSTANCE, 0.0f, 1, null);
            RewardDetail rewardDetail = this.f115482a;
            w.F(this.f115483b, this.f115484c, this.f115485d, this.f115486e, this.f115482a, this.f115487f, rewardDetail != null && rewardDetail.getHasUpc(), this.f115488g, this.f115489h, modifierF, this.f115490i, this.f115491j, this.f115492k, this.f115493l, composer, LocalThemeScope.f17314g | 805306368 | (AbstractC6392a.f60445b << 9), 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115494a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f115495b;

        l(LocalThemeScope localThemeScope, String str) {
            this.f115494a = localThemeScope;
            this.f115495b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1556099300, i10, -1, "com.meijer.mobile.mperks.ux.rewardDetail.TermsAndConditions.<anonymous> (RewardsDetailsScreen.kt:451)");
            }
            si.j.h(this.f115494a, new q1.Label(null, null, null, null, 0, false, 0, this.f115494a.getAdsTypography().getBody().getTwo(), null, 383, null), this.f115495b, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(final Ki.LocalThemeScope r49, final boolean r50, final boolean r51, final bk.AbstractC6392a r52, final co.RewardDetail r53, final java.lang.String r54, final boolean r55, final m5.C15669h.a r56, final java.util.List<? extends vs.InterfaceC17723c> r57, androidx.compose.ui.Modifier r58, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super java.lang.String, kotlin.Unit> r59, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r60, final kotlin.jvm.functions.Function0<kotlin.Unit> r61, final kotlin.jvm.functions.Function0<kotlin.Unit> r62, androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.w.F(Ki.M, boolean, boolean, bk.a, co.k, java.lang.String, boolean, m5.h$a, java.util.List, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(final Ki.LocalThemeScope r30, final boolean r31, final boolean r32, final bk.AbstractC6392a r33, final co.RewardDetail r34, final java.lang.String r35, final java.util.List<? extends vs.InterfaceC17723c> r36, final m5.C15669h.a r37, androidx.compose.ui.Modifier r38, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super java.lang.String, kotlin.Unit> r39, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.w.K(Ki.M, boolean, boolean, bk.a, co.k, java.lang.String, java.util.List, m5.h$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void z(final Ki.LocalThemeScope r27, final boolean r28, final boolean r29, final bk.AbstractC6392a r30, final boolean r31, androidx.compose.ui.Modifier r32, java.util.List<? extends vs.InterfaceC17723c> r33, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super java.lang.String, kotlin.Unit> r34, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.w.z(Ki.M, boolean, boolean, bk.a, boolean, androidx.compose.ui.Modifier, java.util.List, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static {
        ProductFullDetails productFullDetails = new ProductFullDetails("4300006065", "Cinnamon Chex", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -4, 268435455, null);
        f115439a = productFullDetails;
        ProductFullDetails productFullDetails2 = new ProductFullDetails("4300006086", "Banana", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -4, 268435455, null);
        f115440b = productFullDetails2;
        ProductFullDetails productFullDetails3 = new ProductFullDetails("9955508003", "Crispy Apple", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -4, 268435455, null);
        f115441c = productFullDetails3;
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        f115442d = new CouponsProductDecorator(productFullDetails, null, null, null, companion.c("$3.47"), false, companion.c("$3.97/ea"), null, null, false, false, false, true, false, companion.c("Save $0.50/ea"), 0.0d, false, false, null, null, null, null, null, false, null, 33533870, null);
        f115443e = new CouponsProductDecorator(productFullDetails2, null, null, null, companion.c("$1.26"), false, null, "Banana", null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33550190, null);
        f115444f = new CouponsProductDecorator(productFullDetails3, null, null, null, companion.c("$2.99"), false, null, "Crispy Apple", null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33550190, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, boolean z10, boolean z11, AbstractC6392a abstractC6392a, boolean z12, Modifier modifier, List list, Function2 function2, Function2 function22, Function0 function0, Function0 function02, int i10, int i11, int i12, Composer composer, int i13) {
        z(localThemeScope, z10, z11, abstractC6392a, z12, modifier, list, function2, function22, function0, function02, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(LocalThemeScope localThemeScope, String str, RewardDetail rewardDetail, int i10, Composer composer, int i11) {
        B(localThemeScope, str, rewardDetail, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private static final void D(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-491477489);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-491477489, i11, -1, "com.meijer.mobile.mperks.ux.rewardDetail.RewardValidityDescription (RewardsDetailsScreen.kt:425)");
            }
            float f10 = 20;
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(f10), H1.h.p(8), H1.h.p(f10), 0.0f, 8, null), localThemeScope.getAdsColors().getAdsColorText01(), null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 372, null), C16338g.c(j0.f115114U0, composerStartRestartGroup, 0), null, composerStartRestartGroup, (q1.Label.f142335j << 3) | (i11 & 14) | LocalThemeScope.f17314g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.rewardDetail.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.E(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        D(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, boolean z10, boolean z11, AbstractC6392a abstractC6392a, RewardDetail rewardDetail, String str, boolean z12, C15669h.a aVar, List list, Modifier modifier, Function2 function2, Function2 function22, Function0 function0, Function0 function02, int i10, int i11, int i12, Composer composer, int i13) {
        F(localThemeScope, z10, z11, abstractC6392a, rewardDetail, str, z12, aVar, list, modifier, function2, function22, function0, function02, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(final Ki.LocalThemeScope r16, final co.RewardDetail r17, final java.lang.String r18, final int r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.w.H(Ki.M, co.k, java.lang.String, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, RewardDetail rewardDetail, String str, int i10, Modifier modifier, Function0 function0, Function0 function02, int i11, int i12, Composer composer, int i13) {
        H(localThemeScope, rewardDetail, str, i10, modifier, function0, function02, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(RewardDetail rewardDetail, LocalThemeScope localThemeScope, boolean z10, boolean z11, AbstractC6392a abstractC6392a, String str, C15669h.a aVar, List list, Function2 function2, Function2 function22, Function0 function0, Function0 function02, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-341770949, true, new k(rewardDetail, localThemeScope, z10, z11, abstractC6392a, str, aVar, list, function2, function22, function0, function02)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, boolean z10, boolean z11, AbstractC6392a abstractC6392a, RewardDetail rewardDetail, String str, List list, C15669h.a aVar, Modifier modifier, Function2 function2, Function2 function22, Function0 function0, Function0 function02, int i10, int i11, int i12, Composer composer, int i13) {
        K(localThemeScope, z10, z11, abstractC6392a, rewardDetail, str, list, aVar, modifier, function2, function22, function0, function02, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    private static final void N(LocalThemeScope localThemeScope, final String str, String str2, Composer composer, final int i10) {
        int i11;
        final String str3;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1627785232);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(str2) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            str3 = str2;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1627785232, i12, -1, "com.meijer.mobile.mperks.ux.rewardDetail.TermsAndConditions (RewardsDetailsScreen.kt:443)");
            }
            if (Intrinsics.e(str, "MPERKS_EARN_TAB_IN_PROGRESS") || Intrinsics.e(str, "MPERKS_EARN_TAB_AVAILABLE")) {
                str3 = str2;
                composerStartRestartGroup.startReplaceGroup(1126203215);
                Tj.f.c(localThemeScope2, C16338g.c(j0.f115108S0, composerStartRestartGroup, 0), null, null, false, null, ComposableLambdaKt.c(1556099300, true, new l(localThemeScope2, str3), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864 | LocalThemeScope.f17314g | (i12 & 14), 30);
                float f10 = 16;
                C17983Z.a(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(f10), 0.0f, H1.h.p(f10), 0.0f, 10, null), localThemeScope2.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composerStartRestartGroup, 390, 8);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(1126697510);
                I eight = localThemeScope2.getAdsTypography().getHeadings().getEight();
                T adsColorText01 = localThemeScope2.getAdsColors().getAdsColorText01();
                j.Companion companion = F1.j.INSTANCE;
                int iF = companion.f();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                float f11 = 20;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f11), H1.h.p(16), H1.h.p(f11), 0.0f, 8, null), adsColorText01, null, F1.j.h(iF), 0, false, 0, eight, null, 372, null);
                String strC = C16338g.c(j0.f115108S0, composerStartRestartGroup, 0);
                int i13 = LocalThemeScope.f17314g;
                int i14 = i12 & 14;
                int i15 = q1.Label.f142335j;
                si.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
                localThemeScope2 = localThemeScope;
                si.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f11), H1.h.p(8), H1.h.p(f11), 0.0f, 8, null), localThemeScope.getAdsColors().getAdsColorText01(), null, F1.j.h(companion.f()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 372, null), str2, null, composerStartRestartGroup, i13 | i14 | (i15 << 3) | (i12 & 896), 4);
                str3 = str2;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.rewardDetail.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.O(localThemeScope2, str, str3, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, String str, String str2, int i10, Composer composer, int i11) {
        N(localThemeScope, str, str2, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private static final void P(final LocalThemeScope localThemeScope, final String str, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(92619151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(92619151, i11, -1, "com.meijer.mobile.mperks.ux.rewardDetail.ValidityDate (RewardsDetailsScreen.kt:489)");
            }
            float f10 = 20;
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), 0.0f, 8, null), localThemeScope.getAdsColors().getAdsColorText01(), null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 372, null), str, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14) | (q1.Label.f142335j << 3) | ((i11 << 3) & 896), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.rewardDetail.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.Q(localThemeScope, str, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(LocalThemeScope localThemeScope, String str, int i10, Composer composer, int i11) {
        P(localThemeScope, str, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private static final void p(final LocalThemeScope localThemeScope, final AbstractC6392a abstractC6392a, final int i10, Composer composer, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1954389701);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? composerStartRestartGroup.V(abstractC6392a) : composerStartRestartGroup.D(abstractC6392a) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.d(i10) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1954389701, i12, -1, "com.meijer.mobile.mperks.ux.rewardDetail.EarnThroughDate (RewardsDetailsScreen.kt:411)");
            }
            I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
            float f10 = 20;
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(f10), H1.h.p(16), H1.h.p(f10), 0.0f, 8, null), i10 <= 7 ? localThemeScope.getAdsColors().getAdsColorDanger() : localThemeScope.getAdsColors().getAdsColorText01(), null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, eight, null, 372, null), C13698b.a(abstractC6392a, composerStartRestartGroup, AbstractC6392a.f60445b | ((i12 >> 3) & 14)), null, composerStartRestartGroup, (q1.Label.f142335j << 3) | (i12 & 14) | LocalThemeScope.f17314g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.rewardDetail.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.q(localThemeScope, abstractC6392a, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, abstractC6392a, i10, composer, J0.a(i11 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void r(final Ki.LocalThemeScope r22, java.lang.String r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.w.r(Ki.M, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final Ki.LocalThemeScope r44, final com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewState r45, final java.lang.String r46, final co.RewardDetail r47, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super java.lang.String, kotlin.Unit> r48, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r49, final kotlin.jvm.functions.Function0<kotlin.Unit> r50, final kotlin.jvm.functions.Function0<kotlin.Unit> r51, final kotlin.jvm.functions.Function0<kotlin.Unit> r52, final kotlin.jvm.functions.Function0<kotlin.Unit> r53, androidx.compose.ui.Modifier r54, kotlin.C17993c1 r55, androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.w.t(Ki.M, com.meijer.mobile.mperks.ux.rewardDetail.C, java.lang.String, co.k, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, x0.c1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, RewardsDetailsViewState rewardsDetailsViewState, String str, RewardDetail rewardDetail, Function2 function2, Function2 function22, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Modifier modifier, C17993c1 c17993c1, int i10, int i11, int i12, Composer composer, int i13) {
        t(localThemeScope, rewardsDetailsViewState, str, rewardDetail, function2, function22, function0, function02, function03, function04, modifier, c17993c1, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void v(final java.lang.String r25, final boolean r26, final m5.C15669h.a r27, androidx.compose.ui.Modifier r28, boolean r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.w.v(java.lang.String, boolean, m5.h$a, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(String str, boolean z10, C15669h.a aVar, Modifier modifier, boolean z11, int i10, int i11, Composer composer, int i12) {
        v(str, z10, aVar, modifier, z11, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void x(final LocalThemeScope localThemeScope, final String str, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2013163543);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-2013163543, i11, -1, "com.meijer.mobile.mperks.ux.rewardDetail.RewardName (RewardsDetailsScreen.kt:524)");
            }
            float f10 = 16;
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(f10), H1.h.p(24), H1.h.p(f10), 0.0f, 8, null), localThemeScope.getAdsColors().getAdsColorText01(), null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, localThemeScope.getAdsTypography().getValues().getTwo(), null, 372, null), String.valueOf(str != null ? StringsKt.C1(str).toString() : null), null, composerStartRestartGroup, (q1.Label.f142335j << 3) | (i11 & 14) | LocalThemeScope.f17314g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.rewardDetail.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.y(localThemeScope, str, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, String str, int i10, Composer composer, int i11) {
        x(localThemeScope, str, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void B(final Ki.LocalThemeScope r5, final java.lang.String r6, final co.RewardDetail r7, androidx.compose.runtime.Composer r8, final int r9) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.w.B(Ki.M, java.lang.String, co.k, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
