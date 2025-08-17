package com.meijer.mobile.meijer.search;

import Co.ProductFullDetails;
import Go.Suggestion;
import Hl.FulfillmentBarDecorator;
import Ji.C;
import Ji.LocalThemeScope;
import Ok.Coupon;
import P0.e;
import Pk.a;
import Qo.l;
import Rk.CouponOptions;
import Ul.HomeDepartment;
import V2.CreationExtras;
import Xk.CouponState;
import Xr.CouponListItemDecorator;
import ak.AbstractC5607a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.text.C5673e;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import ck.C6408b;
import com.meijer.mobile.coupon.list.S;
import com.meijer.mobile.meijer.activity.find.filter.FilterActivity;
import com.meijer.mobile.meijer.activity.substitution.FindSubstitutionActivity;
import com.meijer.mobile.meijer.search.R1;
import com.meijer.mobile.meijer.search.SearchProductActivityCompose;
import fi.GoogleAdAnalytics;
import j0.C14801J;
import j0.C14802K;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import java.util.List;
import ji.C14949n;
import ji.InterfaceC14913P;
import ji.InterfaceC14920X;
import ji.InterfaceC14935g;
import ji.InterfaceC14971y;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17921a1;
import kotlin.FontWeight;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l0.InterfaceC15343c;
import mk.l;
import p1.C16193g;
import pi.C16307b;
import qv.InterfaceC16622O;
import r1.C16705m;
import ss.InterfaceC17023a;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;
import vs.CartProductListDecorator;
import vs.ProductCarouselDecorator;
import vs.ProductListDecorator;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\u0006J\u0013\u0010\r\u001a\u00020\n*\u00020\fH\u0015¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/search/SearchProductActivityCompose;", "Lcom/meijer/mobile/architecture/ComposeActivity;", "Lcom/meijer/mobile/meijer/search/R1;", "Lcom/meijer/mobile/meijer/search/b;", "Lcom/meijer/mobile/meijer/search/S1;", "<init>", "()V", "Lcom/meijer/mobile/architecture/i;", "f2", "()Lcom/meijer/mobile/architecture/i;", "", "d2", "LJi/M;", "E1", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "LHl/b;", "A", "Lkotlin/Lazy;", "getFulfillmentBarViewModel", "()LHl/b;", "fulfillmentBarViewModel", "Lcom/meijer/mobile/coupon/list/S;", "B", "m2", "()Lcom/meijer/mobile/coupon/list/S;", "couponListViewModel", "Lcom/meijer/mobile/meijer/search/y1;", "viewModel", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SearchProductActivityCompose extends Hilt_SearchProductActivityCompose<R1, InterfaceC12578b, S1> {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentBarViewModel = new androidx.view.e0(Reflection.b(Hl.b.class), new i(this), new h(this), new j(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Lazy couponListViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.coupon.list.S.class), new l(this), new k(this), new m(null, this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductActivityCompose$Content$1$1", f = "SearchProductActivityCompose.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113128a;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchProductActivityCompose.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f113128a == 0) {
                ResultKt.b(obj);
                SearchProductActivityCompose.this.m2().E(new S.c.FetchSearchCoupons(SearchProductActivityCompose.l2(SearchProductActivityCompose.this).i().getValue()));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113131b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113132a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113133b;

            a(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                this.f113132a = localThemeScope;
                this.f113133b = searchProductActivityCompose;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(561181858, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:247)");
                }
                Dr.g.g(this.f113132a, C6408b.a(SearchProductActivityCompose.l2(this.f113133b).f().getValue(), composer, AbstractC5607a.f45514b), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

        b(LocalThemeScope localThemeScope) {
            this.f113131b = localThemeScope;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1996402105, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous> (SearchProductActivityCompose.kt:245)");
            }
            if (SearchProductActivityCompose.l2(SearchProductActivityCompose.this).s().getValue().booleanValue()) {
                C.f.o oVar = C.f.o.f15522e;
                AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99653K8, new Object[0]);
                LocalThemeScope localThemeScope = this.f113131b;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(561181858, true, new a(localThemeScope, SearchProductActivityCompose.this), composer, 54);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(SearchProductActivityCompose.this);
                final SearchProductActivityCompose searchProductActivityCompose = SearchProductActivityCompose.this;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.search.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchProductActivityCompose.b.c(searchProductActivityCompose);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, oVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.o.f15523f << 18) | (AbstractC5607a.f45514b << 27), 199);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(SearchProductActivityCompose searchProductActivityCompose) {
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.t.f113053a);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113135b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FulfillmentBarDecorator f113136c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ S.ViewState f113137d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113138a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Suggestion f113139b;

            a(SearchProductActivityCompose searchProductActivityCompose, Suggestion suggestion) {
                this.f113138a = searchProductActivityCompose;
                this.f113139b = suggestion;
            }

            public final void a() {
                SearchProductActivityCompose.l2(this.f113138a).a().invoke(new R1.SearchSuggestionTapped(this.f113139b));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113140a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113141b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Suggestion f113142c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function0<Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SearchProductActivityCompose f113143a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Suggestion f113144b;

                a(SearchProductActivityCompose searchProductActivityCompose, Suggestion suggestion) {
                    this.f113143a = searchProductActivityCompose;
                    this.f113144b = suggestion;
                }

                public final void a() {
                    SearchProductActivityCompose.l2(this.f113143a).a().invoke(new R1.AutocompleteSelected(this.f113144b.b()));
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.search.SearchProductActivityCompose$c$b$b, reason: collision with other inner class name */
            static final class C1791b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113145a;

                C1791b(LocalThemeScope localThemeScope) {
                    this.f113145a = localThemeScope;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1215182403, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:610)");
                    }
                    C16307b.b(this.f113145a, new q1.h.DrawableIcon(C.a.C3833e.f15338e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
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

            b(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose, Suggestion suggestion) {
                this.f113140a = localThemeScope;
                this.f113141b = searchProductActivityCompose;
                this.f113142c = suggestion;
            }

            public final void a(ji.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1758494166, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:600)");
                }
                LocalThemeScope localThemeScope = this.f113140a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f113141b) | composer.D(this.f113142c);
                SearchProductActivityCompose searchProductActivityCompose = this.f113141b;
                Suggestion suggestion = this.f113142c;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new a(searchProductActivityCompose, suggestion);
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(1215182403, true, new C1791b(this.f113140a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.search.SearchProductActivityCompose$c$c, reason: collision with other inner class name */
        static final class C1792c implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113146a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113147b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.search.SearchProductActivityCompose$c$c$a */
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113148a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SearchProductActivityCompose f113149b;

                a(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                    this.f113148a = localThemeScope;
                    this.f113149b = searchProductActivityCompose;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1312072160, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:681)");
                    }
                    LocalThemeScope localThemeScope = this.f113148a;
                    ri.j.h(localThemeScope, new q1.Label(null, this.f113148a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C6408b.a(SearchProductActivityCompose.l2(this.f113149b).u().getValue(), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            C1792c(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                this.f113146a = localThemeScope;
                this.f113147b = searchProductActivityCompose;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1631123379, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:675)");
                }
                LocalThemeScope localThemeScope = this.f113146a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f113147b);
                final SearchProductActivityCompose searchProductActivityCompose = this.f113147b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.search.H
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchProductActivityCompose.c.C1792c.c(searchProductActivityCompose);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(1312072160, true, new a(this.f113146a, this.f113147b), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(SearchProductActivityCompose searchProductActivityCompose) {
                SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.m.f113039a);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113150a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LoadingDecorator f113151b;

            d(LocalThemeScope localThemeScope, LoadingDecorator loadingDecorator) {
                this.f113150a = localThemeScope;
                this.f113151b = loadingDecorator;
            }

            public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1072496704, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:304)");
                }
                LocalThemeScope localThemeScope = this.f113150a;
                Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
                q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                Bi.o oVar = Bi.o.f2584a;
                AbstractC5607a title = this.f113151b.getTitle();
                int i11 = AbstractC5607a.f45514b;
                Bi.m.d(localThemeScope, modifierF, largeLoading, oVar, C6408b.a(title, composer, i11), C6408b.a(this.f113151b.getDescription(), composer, i11), C12575a.f113236a.a(), composer, 1575984 | LocalThemeScope.f15770g | (q1.k.Large.f140090f << 6), 0);
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
        @SourceDebugExtension
        static final class e implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113152a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113153b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<ji.j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113154a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SearchProductActivityCompose f113155b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.search.SearchProductActivityCompose$c$e$a$a, reason: collision with other inner class name */
                static final class C1793a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f113156a;

                    C1793a(LocalThemeScope localThemeScope) {
                        this.f113156a = localThemeScope;
                    }

                    public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1468859128, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:331)");
                        }
                        C16307b.b(this.f113156a, new q1.h.DrawableIcon(C.f.d.f15507e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
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

                a(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                    this.f113154a = localThemeScope;
                    this.f113155b = searchProductActivityCompose;
                }

                public final void b(ji.j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(752601547, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:323)");
                    }
                    LocalThemeScope localThemeScope = this.f113154a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f113155b);
                    final SearchProductActivityCompose searchProductActivityCompose = this.f113155b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.search.L
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SearchProductActivityCompose.c.e.a.c(searchProductActivityCompose);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(1468859128, true, new C1793a(this.f113154a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                    b(j1Var, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(SearchProductActivityCompose searchProductActivityCompose) {
                    SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.s.f113052a);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function3<ji.j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113157a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SearchProductActivityCompose f113158b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f113159a;

                    a(LocalThemeScope localThemeScope) {
                        this.f113159a = localThemeScope;
                    }

                    public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(758728403, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:371)");
                        }
                        C16307b.b(this.f113159a, new q1.h.DrawableIcon(C.f.o.f15522e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
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

                b(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                    this.f113157a = localThemeScope;
                    this.f113158b = searchProductActivityCompose;
                }

                public final void b(ji.j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-741875226, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:363)");
                    }
                    LocalThemeScope localThemeScope = this.f113157a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f113158b);
                    final SearchProductActivityCompose searchProductActivityCompose = this.f113158b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.search.M
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SearchProductActivityCompose.c.e.b.c(searchProductActivityCompose);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(758728403, true, new a(this.f113157a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                    b(j1Var, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(SearchProductActivityCompose searchProductActivityCompose) {
                    SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.TypingSearchTerm(""));
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.search.SearchProductActivityCompose$c$e$c, reason: collision with other inner class name */
            static final class C1794c implements Function3<ji.j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113160a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SearchProductActivityCompose f113161b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.search.SearchProductActivityCompose$c$e$c$a */
                static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f113162a;

                    a(LocalThemeScope localThemeScope) {
                        this.f113162a = localThemeScope;
                    }

                    public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1562876004, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:388)");
                        }
                        C16307b.b(this.f113162a, new q1.h.DrawableIcon(C.b.h.C0259b.f15462e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
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

                C1794c(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                    this.f113160a = localThemeScope;
                    this.f113161b = searchProductActivityCompose;
                }

                public final void b(ji.j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1818798959, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:378)");
                    }
                    LocalThemeScope localThemeScope = this.f113160a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f113161b);
                    final SearchProductActivityCompose searchProductActivityCompose = this.f113161b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.search.N
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SearchProductActivityCompose.c.e.C1794c.c(searchProductActivityCompose);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1562876004, true, new a(this.f113160a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                    b(j1Var, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(SearchProductActivityCompose searchProductActivityCompose) {
                    SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.BarcodeIconTapped(false));
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class d implements Function3<InterfaceC14913P, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113163a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SearchProductActivityCompose f113164b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f113165c;

                d(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose, String str) {
                    this.f113163a = localThemeScope;
                    this.f113164b = searchProductActivityCompose;
                    this.f113165c = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(String str, r1.u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    r1.s.g0(semantics, str);
                    return Unit.f142422a;
                }

                public final void c(InterfaceC14913P Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1906635727, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:402)");
                    }
                    LocalThemeScope localThemeScope = this.f113163a;
                    Integer numValueOf = Integer.valueOf(SearchProductActivityCompose.l2(this.f113164b).m().getValue().getItemCount());
                    q1.Badge primary = Assemble.getBadges().getPrimary();
                    Modifier modifier = Assemble.getBadges().getPrimary().getModifier();
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f113165c);
                    final String str = this.f113165c;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.search.O
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SearchProductActivityCompose.c.e.d.d(str, (r1.u) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    q1.Badge badgeY = q1.Badge.y(primary, C16705m.d(modifier, false, (Function1) objB, 1, null), null, null, null, 14, null);
                    q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f15380e, null, null, null, 0.0f, null, null, 126, null);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f113164b);
                    final SearchProductActivityCompose searchProductActivityCompose = this.f113164b;
                    Object objB2 = composer.B();
                    if (zD || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.meijer.search.P
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SearchProductActivityCompose.c.e.d.e(searchProductActivityCompose);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    wi.h.d(localThemeScope, numValueOf, 99, badgeY, drawableIcon, (Function0) objB2, composer, (q1.h.DrawableIcon.f140067h << 12) | LocalThemeScope.f15770g | 384 | (q1.Badge.f139931e << 9), 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14913P interfaceC14913P, Composer composer, Integer num) {
                    c(interfaceC14913P, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(SearchProductActivityCompose searchProductActivityCompose) {
                    SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.C12567d.f113026a);
                    return Unit.f142422a;
                }
            }

            e(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                this.f113152a = localThemeScope;
                this.f113153b = searchProductActivityCompose;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(SearchProductActivityCompose searchProductActivityCompose, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.B.f113010a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(SearchProductActivityCompose searchProductActivityCompose, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (it.b()) {
                    SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.F.f113016a);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(SearchProductActivityCompose searchProductActivityCompose, String it) {
                Intrinsics.j(it, "it");
                SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.TypingSearchTerm(it));
                return Unit.f142422a;
            }

            public final void d(Composer composer, int i10) {
                SearchProductActivityCompose searchProductActivityCompose;
                int i11;
                int i12;
                boolean z10;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-535102461, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:321)");
                }
                e.c cVarI = P0.e.INSTANCE.i();
                LocalThemeScope localThemeScope = this.f113152a;
                final SearchProductActivityCompose searchProductActivityCompose2 = this.f113153b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), cVarI, composer, 48);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                C14949n c14949n = C14949n.f139910a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(752601547, true, new a(localThemeScope, searchProductActivityCompose2), composer, 54);
                int i13 = LocalThemeScope.f15770g;
                int i14 = C14949n.f139911b;
                Ji.Q.e(localThemeScope, c14949n, composableLambdaC, composer, i13 | 384 | (i14 << 3));
                C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(8)), composer, 6);
                String value = SearchProductActivityCompose.l2(searchProductActivityCompose2).d().getValue();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(searchProductActivityCompose2);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.search.I
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SearchProductActivityCompose.c.e.e(searchProductActivityCompose2, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C5693z c5693z = new C5693z(null, null, null, null, (Function1) objB, null, 47, null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, 0, androidx.compose.ui.text.input.a.INSTANCE.g(), null, null, null, 119, null);
                Modifier modifierB = InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null);
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(searchProductActivityCompose2);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.search.J
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SearchProductActivityCompose.c.e.f(searchProductActivityCompose2, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                Modifier modifierA = C5761d.a(modifierB, (Function1) objB2);
                composer.startReplaceGroup(5004770);
                boolean zD3 = composer.D(searchProductActivityCompose2);
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function1() { // from class: com.meijer.mobile.meijer.search.K
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SearchProductActivityCompose.c.e.g(searchProductActivityCompose2, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C5673e.a(value, (Function1) objB3, modifierA, false, false, null, keyboardOptions, c5693z, false, 1, 0, null, null, null, null, null, composer, 806879232, 0, 64824);
                if (SearchProductActivityCompose.l2(searchProductActivityCompose2).d().getValue().length() > 0) {
                    composer.startReplaceGroup(1267513274);
                    searchProductActivityCompose = searchProductActivityCompose2;
                    i12 = 54;
                    z10 = true;
                    ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(-741875226, true, new b(localThemeScope, searchProductActivityCompose), composer, 54);
                    i11 = i13;
                    Ji.Q.e(localThemeScope, c14949n, composableLambdaC2, composer, i11 | 384 | (i14 << 3));
                    composer.P();
                } else {
                    searchProductActivityCompose = searchProductActivityCompose2;
                    i11 = i13;
                    i12 = 54;
                    z10 = true;
                    composer.startReplaceGroup(1268413545);
                    Ji.Q.e(localThemeScope, c14949n, ComposableLambdaKt.c(1818798959, true, new C1794c(localThemeScope, searchProductActivityCompose), composer, 54), composer, i11 | 384 | (i14 << 3));
                    composer.P();
                }
                C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(4)), composer, 6);
                composer.startReplaceGroup(-928877621);
                if (SearchProductActivityCompose.l2(searchProductActivityCompose).F().getValue().booleanValue()) {
                    Ji.Q.e(localThemeScope, InterfaceC14935g.a.f139807a, ComposableLambdaKt.c(1906635727, z10, new d(localThemeScope, searchProductActivityCompose, AbstractC5607a.INSTANCE.b(com.meijer.mobile.meijer.X.f99453l, SearchProductActivityCompose.l2(searchProductActivityCompose).m().getValue().getItemCount(), new Object[0]).b(searchProductActivityCompose)), composer, i12), composer, i11 | 384 | (InterfaceC14935g.a.f139808b << 3));
                }
                composer.P();
                C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(16)), composer, 6);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113166a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113167b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113168a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SearchProductActivityCompose f113169b;

                a(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                    this.f113168a = localThemeScope;
                    this.f113169b = searchProductActivityCompose;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(512166226, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:821)");
                    }
                    LocalThemeScope localThemeScope = this.f113168a;
                    ri.j.h(localThemeScope, new q1.Label(null, this.f113168a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C6408b.a(SearchProductActivityCompose.l2(this.f113169b).u().getValue(), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            f(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                this.f113166a = localThemeScope;
                this.f113167b = searchProductActivityCompose;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1465639653, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:813)");
                }
                LocalThemeScope localThemeScope = this.f113166a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f113167b);
                final SearchProductActivityCompose searchProductActivityCompose = this.f113167b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.search.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchProductActivityCompose.c.f.c(searchProductActivityCompose);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(512166226, true, new a(this.f113166a, this.f113167b), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(SearchProductActivityCompose searchProductActivityCompose) {
                SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.m.f113039a);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class g implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113170a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113171b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113172a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f113173b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SearchProductActivityCompose f113174c;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var, SearchProductActivityCompose searchProductActivityCompose) {
                    this.f113172a = localThemeScope;
                    this.f113173b = j1Var;
                    this.f113174c = searchProductActivityCompose;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1413715088, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:961)");
                    }
                    ri.j.h(this.f113172a, Cr.a.c(this.f113173b.getLabels(), false, 1, null), C6408b.a(SearchProductActivityCompose.l2(this.f113174c).p().getValue(), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            g(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                this.f113170a = localThemeScope;
                this.f113171b = searchProductActivityCompose;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(581480739, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:945)");
                }
                LocalThemeScope localThemeScope = this.f113170a;
                q1.d.StandardButton standardButtonY = SearchProductActivityCompose.l2(this.f113171b).n().getValue().booleanValue() ? q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(Assemble.getButtons().getEnabledButton().getModifier(), 0.0f, 1, null), false, null, 895, null) : q1.d.StandardButton.y(Assemble.getButtons().getDisabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(Assemble.getButtons().getDisabledButton().getModifier(), 0.0f, 1, null), false, null, 895, null);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f113171b);
                final SearchProductActivityCompose searchProductActivityCompose = this.f113171b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.search.S
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchProductActivityCompose.c.g.c(searchProductActivityCompose);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1413715088, true, new a(this.f113170a, Assemble, this.f113171b), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(SearchProductActivityCompose searchProductActivityCompose) {
                SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.A.f113009a);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class h implements Function1<Pk.a, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113175a;

            h(SearchProductActivityCompose searchProductActivityCompose) {
                this.f113175a = searchProductActivityCompose;
            }

            public final void a(Pk.a it) {
                Intrinsics.j(it, "it");
                SearchProductActivityCompose.l2(this.f113175a).a().invoke(new R1.ProcessCouponAction(it));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pk.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class i implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113176a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113177b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113178a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SearchProductActivityCompose f113179b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ji.j1 f113180c;

                a(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose, ji.j1 j1Var) {
                    this.f113178a = localThemeScope;
                    this.f113179b = searchProductActivityCompose;
                    this.f113180c = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-925132473, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:505)");
                    }
                    ri.j.h(this.f113178a, !SearchProductActivityCompose.l2(this.f113179b).v().isEmpty() ? this.f113180c.getLabels().getEnabledLabel() : this.f113180c.getLabels().getDisabledLabel(), C16193g.c(com.meijer.mobile.meijer.Y.f100129j1, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            i(LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                this.f113176a = localThemeScope;
                this.f113177b = searchProductActivityCompose;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1154743066, i10, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivityCompose.kt:495)");
                }
                LocalThemeScope localThemeScope = this.f113176a;
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), !SearchProductActivityCompose.l2(this.f113177b).v().isEmpty(), null, null, null, null, null, null, null, false, null, 1022, null);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f113177b);
                final SearchProductActivityCompose searchProductActivityCompose = this.f113177b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.search.T
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchProductActivityCompose.c.i.c(searchProductActivityCompose);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-925132473, true, new a(this.f113176a, this.f113177b, Assemble), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(SearchProductActivityCompose searchProductActivityCompose) {
                SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.C12568e.f113027a);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class j implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113181a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f113182b;

            j(SearchProductActivityCompose searchProductActivityCompose, String str) {
                this.f113181a = searchProductActivityCompose;
                this.f113182b = str;
            }

            public final void a() {
                SearchProductActivityCompose.l2(this.f113181a).a().invoke(new R1.RecentSearchItemTapped(this.f113182b));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class k {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Pp.b.values().length];
                try {
                    iArr[Pp.b.f28358c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Pp.b.f28359d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Pp.b.f28356a.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Pp.b.f28357b.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Pp.b.f28360e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class l extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f113183f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(List list) {
                super(1);
                this.f113183f = list;
            }

            public final Object a(int i10) {
                this.f113183f.get(i10);
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class m extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f113184f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113185g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113186h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(List list, SearchProductActivityCompose searchProductActivityCompose, LocalThemeScope localThemeScope) {
                super(4);
                this.f113184f = list;
                this.f113185g = searchProductActivityCompose;
                this.f113186h = localThemeScope;
            }

            public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (composer.V(interfaceC15343c) ? 4 : 2);
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
                    ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                String str = (String) this.f113184f.get(i10);
                composer.startReplaceGroup(575794520);
                Modifier modifierB = InterfaceC15343c.b(interfaceC15343c, Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f113185g) | composer.V(str);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new j(this.f113185g, str);
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierI = androidx.compose.foundation.layout.D.i(ClickableKt.d(modifierB, false, null, null, (Function0) objB, 7, null), H1.h.p(16));
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.i(), composer, 54);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                LocalThemeScope localThemeScope = this.f113186h;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f113186h.getAdsTypography().getBody().getTwo(), null, 383, null);
                int i13 = LocalThemeScope.f15770g;
                ri.j.h(localThemeScope, label, str, null, composer, i13 | (q1.Label.f140080j << 3), 4);
                C16307b.b(this.f113186h, new q1.h.DrawableIcon(C.f.j.f15515e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, i13 | (q1.h.DrawableIcon.f140067h << 3), 6);
                composer.v();
                C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
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

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class n extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f113187f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(List list) {
                super(1);
                this.f113187f = list;
            }

            public final Object a(int i10) {
                this.f113187f.get(i10);
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class o extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f113188f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113189g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113190h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(List list, SearchProductActivityCompose searchProductActivityCompose, LocalThemeScope localThemeScope) {
                super(4);
                this.f113188f = list;
                this.f113189g = searchProductActivityCompose;
                this.f113190h = localThemeScope;
            }

            public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
                int i12 = (i11 & 6) == 0 ? i11 | (composer.V(interfaceC15343c) ? 4 : 2) : i11;
                if ((i11 & 48) == 0) {
                    i12 |= composer.d(i10) ? 32 : 16;
                }
                int i13 = 0;
                if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                Suggestion suggestion = (Suggestion) this.f113188f.get(i10);
                composer.startReplaceGroup(235084585);
                Modifier modifierB = InterfaceC15343c.b(interfaceC15343c, Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f113189g) | composer.D(suggestion);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new a(this.f113189g, suggestion);
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierJ = androidx.compose.foundation.layout.D.j(ClickableKt.d(modifierB, false, null, null, (Function0) objB, 7, null), H1.h.p(16), H1.h.p(8));
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.i(), composer, 54);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                LocalThemeScope localThemeScope = this.f113190h;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f113190h.getAdsTypography().getBody().getTwo(), null, 383, null);
                AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
                List listA1 = StringsKt.a1(suggestion.b(), new String[]{SearchProductActivityCompose.l2(this.f113189g).d().getValue()}, false, 0, 6, null);
                for (Object obj : listA1) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt.w();
                    }
                    bVar.g((String) obj);
                    if (i13 < CollectionsKt.o(listA1)) {
                        bVar.n(new SpanStyle(0L, 0L, FontWeight.INSTANCE.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null));
                        bVar.g(SearchProductActivityCompose.l2(this.f113189g).d().getValue());
                        bVar.j();
                    }
                    i13 = i14;
                }
                Unit unit = Unit.f142422a;
                AnnotatedString annotatedStringQ = bVar.q();
                int i15 = LocalThemeScope.f15770g;
                ri.j.g(localThemeScope, label, annotatedStringQ, null, null, composer, i15 | (q1.Label.f140080j << 3), 12);
                LocalThemeScope localThemeScope2 = this.f113190h;
                Ji.Q.e(localThemeScope2, InterfaceC14971y.a.c.f140290a, ComposableLambdaKt.c(1758494166, true, new b(localThemeScope2, this.f113189g, suggestion), composer, 54), composer, i15 | 384 | (InterfaceC14971y.a.c.f140291b << 3));
                composer.v();
                C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class p extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final p f113191f = new p();

            public p() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(CouponState couponState) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class q extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f113192f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f113193g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(Function1 function1, List list) {
                super(1);
                this.f113192f = function1;
                this.f113193g = list;
            }

            public final Object a(int i10) {
                return this.f113192f.invoke(this.f113193g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class r extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f113194f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113195g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113196h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(List list, LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose) {
                super(4);
                this.f113194f = list;
                this.f113195g = localThemeScope;
                this.f113196h = searchProductActivityCompose;
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
                CouponState couponState = (CouponState) this.f113194f.get(i10);
                composer.startReplaceGroup(-1906858832);
                LocalThemeScope localThemeScope = this.f113195g;
                CouponListItemDecorator couponListItemDecoratorN = Qr.a.n(couponState.getCoupon());
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f113196h);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new h(this.f113196h);
                    composer.t(objB);
                }
                composer.P();
                Pr.C.f(localThemeScope, null, couponListItemDecoratorN, null, (Function1) objB, composer, LocalThemeScope.f15770g | (CouponListItemDecorator.f39800n << 6), 5);
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

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        public final void F(j0.InterfaceC14794C r45, androidx.compose.runtime.Composer r46, int r47) {
            /*
                Method dump skipped, instructions count: 6805
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.search.SearchProductActivityCompose.c.F(j0.C, androidx.compose.runtime.Composer, int):void");
        }

        c(LocalThemeScope localThemeScope, FulfillmentBarDecorator fulfillmentBarDecorator, S.ViewState viewState) {
            this.f113135b = localThemeScope;
            this.f113136c = fulfillmentBarDecorator;
            this.f113137d = viewState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit G(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit H(SearchProductActivityCompose searchProductActivityCompose, LocalThemeScope localThemeScope, l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            List listS0 = CollectionsKt.S0(SearchProductActivityCompose.l2(searchProductActivityCompose).v());
            LazyColumn.i(listS0.size(), null, new l(listS0), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new m(listS0, searchProductActivityCompose, localThemeScope)));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J(SearchProductActivityCompose searchProductActivityCompose, LocalThemeScope localThemeScope, l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            List<Suggestion> listA = SearchProductActivityCompose.l2(searchProductActivityCompose).g().getValue().a();
            LazyColumn.i(listA.size(), null, new n(listA), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new o(listA, searchProductActivityCompose, localThemeScope)));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit K(SearchProductActivityCompose searchProductActivityCompose, ProductCarouselDecorator decorator) {
            Intrinsics.j(decorator, "decorator");
            Function1<R1, Unit> function1A = SearchProductActivityCompose.l2(searchProductActivityCompose).a();
            String uri = decorator.getUri();
            if (uri == null) {
                uri = "";
            }
            String carouselTitle = decorator.getCarouselTitle();
            function1A.invoke(new R1.PersonalizedProductListClicked(uri, carouselTitle != null ? carouselTitle : "", false));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit L(SearchProductActivityCompose searchProductActivityCompose, ProductFullDetails product, String str) {
            Intrinsics.j(product, "product");
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.ProductFromBuyAgainCarouselTapped(product, str));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit M(SearchProductActivityCompose searchProductActivityCompose, ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state) {
            Intrinsics.j(product, "product");
            Intrinsics.j(state, "state");
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.UpdateEntry(product, state.getValueState().getQuantity()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Q(SearchProductActivityCompose searchProductActivityCompose, HomeDepartment department) {
            Intrinsics.j(department, "department");
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.DepartmentItemClicked(department.getDeeplink(), department.getName()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit T(SearchProductActivityCompose searchProductActivityCompose, InterfaceC17023a it) {
            Intrinsics.j(it, "it");
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.ProcessProductCardAction(it));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit U(SearchProductActivityCompose searchProductActivityCompose, ProductListDecorator product) {
            Intrinsics.j(product, "product");
            Coupon coupon = product.getCoupon();
            if (coupon != null) {
                SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.ProcessCouponAction(new a.Clip(coupon, null, 2, null)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit V(SearchProductActivityCompose searchProductActivityCompose, ProductListDecorator product) {
            Intrinsics.j(product, "product");
            Coupon coupon = product.getCoupon();
            if (coupon != null) {
                SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.ProcessCouponAction(new a.ViewCouponDetails(coupon, null, 2, null)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit W(SearchProductActivityCompose searchProductActivityCompose, ProductListDecorator product) {
            Intrinsics.j(product, "product");
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.ProcessProductCardAction(new InterfaceC17023a.FindSimilarItems(product.getProduct())));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit X(SearchProductActivityCompose searchProductActivityCompose, ProductListDecorator product) {
            Intrinsics.j(product, "product");
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.StepperStateChanged(product.getProduct().getCode(), 0.0d, new Rect()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Z(SearchProductActivityCompose searchProductActivityCompose, GoogleAdAnalytics googleAdAnalytics) {
            Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.GoogleAdClicked(googleAdAnalytics));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit a0(SearchProductActivityCompose searchProductActivityCompose, GoogleAdAnalytics googleAdAnalytics) {
            Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.GoogleAdClicked(googleAdAnalytics));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b0(SearchProductActivityCompose searchProductActivityCompose, GoogleAdAnalytics googleAdAnalytics) {
            Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.GoogleAdClicked(googleAdAnalytics));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f0(S.ViewState viewState, LocalThemeScope localThemeScope, SearchProductActivityCompose searchProductActivityCompose, l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            List<CouponState> listC = viewState.getCouponListDecorator().c();
            LazyColumn.i(listC.size(), null, new q(p.f113191f, listC), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new r(listC, localThemeScope, searchProductActivityCompose)));
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            F(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit I(SearchProductActivityCompose searchProductActivityCompose) {
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.J.f113021a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit N(SearchProductActivityCompose searchProductActivityCompose) {
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.l.f113038a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(SearchProductActivityCompose searchProductActivityCompose) {
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.I.f113020a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit P(SearchProductActivityCompose searchProductActivityCompose) {
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.C12574k.f113037a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit R(SearchProductActivityCompose searchProductActivityCompose) {
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.K.f113022a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit S(SearchProductActivityCompose searchProductActivityCompose) {
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.r.f113051a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Y(SearchProductActivityCompose searchProductActivityCompose) {
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.C12570g.f113029a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c0(SearchProductActivityCompose searchProductActivityCompose) {
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.n.f113040a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d0(SearchProductActivityCompose searchProductActivityCompose) {
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.B.f113010a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e0(SearchProductActivityCompose searchProductActivityCompose) {
            SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.C12566c.f113025a);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductActivityCompose$Content$4$1", f = "SearchProductActivityCompose.kt", l = {1083}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113197a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113199c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchProductActivityCompose f113200a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113201b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductActivityCompose$Content$4$1$1", f = "SearchProductActivityCompose.kt", l = {1096, 1096, 1110, 1110, 1122, 1122}, m = "emit")
            /* renamed from: com.meijer.mobile.meijer.search.SearchProductActivityCompose$d$a$a, reason: collision with other inner class name */
            static final class C1795a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f113202a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f113203b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a<T> f113204c;

                /* renamed from: d, reason: collision with root package name */
                int f113205d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1795a(a<? super T> aVar, Continuation<? super C1795a> continuation) {
                    super(continuation);
                    this.f113204c = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f113203b = obj;
                    this.f113205d |= Integer.MIN_VALUE;
                    return this.f113204c.emit(null, this);
                }
            }

            a(SearchProductActivityCompose searchProductActivityCompose, LocalThemeScope localThemeScope) {
                this.f113200a = searchProductActivityCompose;
                this.f113201b = localThemeScope;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
            
                if (Gi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x0133, code lost:
            
                if (Gi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x017b, code lost:
            
                if (Gi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L55;
             */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
            @Override // tv.InterfaceC17153g
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(final com.meijer.mobile.coupon.list.S.e r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
                /*
                    Method dump skipped, instructions count: 410
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.search.SearchProductActivityCompose.d.a.emit(com.meijer.mobile.coupon.list.S$e, kotlin.coroutines.Continuation):java.lang.Object");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean i(SearchProductActivityCompose searchProductActivityCompose, S.e eVar) {
                SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(new R1.ProcessCouponAction(new a.ViewCouponDetails(((S.e.ShowCouponClippedSnackBar) eVar).getCoupon(), null, 2, null)));
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean j(SearchProductActivityCompose searchProductActivityCompose, S.e eVar) {
                searchProductActivityCompose.m2().onAction(new a.Clip(((S.e.ShowClipCouponErrorSnackBar) eVar).getCoupon(), null, 2, null));
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean k(SearchProductActivityCompose searchProductActivityCompose) {
                SearchProductActivityCompose.l2(searchProductActivityCompose).a().invoke(R1.C12569f.f113028a);
                return true;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchProductActivityCompose.this.new d(this.f113199c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(LocalThemeScope localThemeScope, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f113199c = localThemeScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113197a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC17144F<S.e> interfaceC17144FD = SearchProductActivityCompose.this.m2().D();
                a aVar = new a(SearchProductActivityCompose.this, this.f113199c);
                this.f113197a = 1;
                if (interfaceC17144FD.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113206f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f113206f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f113206f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113207f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f113207f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f113207f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f113208f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113209g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f113208f = function0;
            this.f113209g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f113208f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f113209g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113210f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f113210f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f113210f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113211f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f113211f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f113211f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f113212f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113213g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f113212f = function0;
            this.f113213g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f113212f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f113213g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113214f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f113214f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f113214f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113215f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f113215f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f113215f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f113216f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113217g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f113216f = function0;
            this.f113217g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f113216f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f113217g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    private final Hl.b getFulfillmentBarViewModel() {
        return (Hl.b) this.fulfillmentBarViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j2(SearchProductActivityCompose searchProductActivityCompose, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        searchProductActivityCompose.E1(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.coupon.list.S m2() {
        return (com.meijer.mobile.coupon.list.S) this.couponListViewModel.getValue();
    }

    @Override // com.meijer.mobile.architecture.ComposeActivity
    @SuppressLint({"AlwaysProvideAModifier, MissingComposePreview"})
    protected void E1(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1411198722);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1411198722, i11, -1, "com.meijer.mobile.meijer.search.SearchProductActivityCompose.Content (SearchProductActivityCompose.kt:209)");
            }
            FulfillmentBarDecorator fulfillmentBarDecorator = (FulfillmentBarDecorator) androidx.compose.runtime.o1.b(getFulfillmentBarViewModel().n(), null, composerStartRestartGroup, 0, 1).getValue();
            S.ViewState viewState = (S.ViewState) androidx.compose.runtime.o1.b(m2().C(), null, composerStartRestartGroup, 0, 1).getValue();
            CouponOptions value = ((InterfaceC12578b) c2()).i().getValue();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(value, (Function2) objB, composerStartRestartGroup, 0);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1996402105, true, new b(localThemeScope), composerStartRestartGroup, 54);
            ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(1676515008, true, new c(localThemeScope, fulfillmentBarDecorator, viewState), composerStartRestartGroup, 54);
            int i12 = i11;
            C17921a1.a(null, null, composableLambdaC, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, composableLambdaC2, composerStartRestartGroup, 384, 12582912, 131067);
            composerStartRestartGroup = composerStartRestartGroup;
            Boolean bool = Boolean.TRUE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD2 = composerStartRestartGroup.D(this) | ((i12 & 14) == 4 || ((i12 & 8) != 0 && composerStartRestartGroup.D(localThemeScope)));
            Object objB2 = composerStartRestartGroup.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new d(localThemeScope, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(bool, (Function2) objB2, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.search.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchProductActivityCompose.j2(this.f113265a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.meijer.mobile.architecture.ComposeActivity
    protected void d2() {
        Parcelable parcelable;
        Object serializableExtra;
        Object serializableExtra2;
        Parcelable parcelable2;
        String stringExtra;
        String queryParameter;
        l.k kVarC;
        bk.c.b(this, 0, R.anim.fade_in, R.anim.fade_out, 0, 8, null);
        String packageName = getPackageName();
        String name = FindSubstitutionActivity.class.getName();
        String name2 = FilterActivity.class.getName();
        Function1<R1, Unit> function1A = ((InterfaceC12578b) c2()).a();
        Intrinsics.g(packageName);
        Intrinsics.g(name);
        Intrinsics.g(name2);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("selected.product", CartProductListDecorator.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("selected.product");
            if (!(parcelableExtra instanceof CartProductListDecorator)) {
                parcelableExtra = null;
            }
            parcelable = (CartProductListDecorator) parcelableExtra;
        }
        CartProductListDecorator cartProductListDecorator = (CartProductListDecorator) parcelable;
        Intent intent2 = getIntent();
        Intrinsics.i(intent2, "getIntent(...)");
        if (i10 >= 33) {
            serializableExtra = intent2.getSerializableExtra("com.meijer.intent.extra.SEARCH_TYPE", Pp.b.class);
        } else {
            Object serializableExtra3 = intent2.getSerializableExtra("com.meijer.intent.extra.SEARCH_TYPE");
            if (!(serializableExtra3 instanceof Pp.b)) {
                serializableExtra3 = null;
            }
            serializableExtra = (Pp.b) serializableExtra3;
        }
        Pp.b bVar = (Pp.b) serializableExtra;
        Intent intent3 = getIntent();
        Intrinsics.i(intent3, "getIntent(...)");
        if (i10 >= 33) {
            serializableExtra2 = intent3.getSerializableExtra("unauth_search_term", String.class);
        } else {
            Object serializableExtra4 = intent3.getSerializableExtra("unauth_search_term");
            if (!(serializableExtra4 instanceof String)) {
                serializableExtra4 = null;
            }
            serializableExtra2 = (String) serializableExtra4;
        }
        function1A.invoke(new R1.InitializeViewModel(packageName, name2, name, cartProductListDecorator, bVar, (String) serializableExtra2));
        Intent intent4 = getIntent();
        Intrinsics.i(intent4, "getIntent(...)");
        if (i10 >= 33) {
            parcelable2 = (Parcelable) intent4.getParcelableExtra("product_sort_filter_deeplink", Uri.class);
        } else {
            Parcelable parcelableExtra2 = intent4.getParcelableExtra("product_sort_filter_deeplink");
            parcelable2 = (Uri) (parcelableExtra2 instanceof Uri ? parcelableExtra2 : null);
        }
        Uri uri = (Uri) parcelable2;
        if (uri != null && (queryParameter = uri.getQueryParameter("text")) != null && (kVarC = Qo.K.c(new l.Search(queryParameter), uri)) != null) {
            ((InterfaceC12578b) c2()).a().invoke(new R1.SetDeeplinkFacet(kVarC));
            getIntent().removeExtra("product_sort_filter_deeplink");
        }
        if (getIntent().getBooleanExtra("com.meijer.intent.extra.PRODUCT_SCAN", false)) {
            ((InterfaceC12578b) c2()).a().invoke(new R1.BarcodeIconTapped(getIntent().hasExtra("com.meijer.intent.extra.PRODUCT_SCAN")));
            getIntent().removeExtra("com.meijer.intent.extra.PRODUCT_SCAN");
        } else {
            if (!getIntent().hasExtra("unauth_search_term") || (stringExtra = getIntent().getStringExtra("unauth_search_term")) == null) {
                return;
            }
            ((InterfaceC12578b) c2()).a().invoke(new R1.CompleteSearchAction(stringExtra, null, false, false, 14, null));
            getIntent().removeExtra("unauth_search_term");
        }
    }

    @Override // com.meijer.mobile.architecture.ComposeActivity
    protected com.meijer.mobile.architecture.i<R1, InterfaceC12578b, S1> f2() {
        return n2(new androidx.view.e0(Reflection.b(y1.class), new f(this), new e(this), new g(null, this)));
    }

    public static final /* synthetic */ InterfaceC12578b l2(SearchProductActivityCompose searchProductActivityCompose) {
        return (InterfaceC12578b) searchProductActivityCompose.c2();
    }

    private static final y1 n2(Lazy<y1> lazy) {
        return lazy.getValue();
    }
}
