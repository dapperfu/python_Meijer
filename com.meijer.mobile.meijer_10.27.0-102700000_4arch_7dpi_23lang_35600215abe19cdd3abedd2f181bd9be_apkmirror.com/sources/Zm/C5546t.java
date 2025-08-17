package Zm;

import Hr.ClippableCouponDecorator;
import Hr.CouponCountDownStateDecorator;
import Ji.LocalThemeScope;
import P0.e;
import Zm.C5546t;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5728k0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import j0.C14815g;
import j0.InterfaceC14810b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.C17906T0;
import kotlin.C17917Z;
import kotlin.InterfaceC6166e;
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
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15339A;
import l0.C15342b;
import l0.InterfaceC15343c;
import l0.InterfaceC15349i;
import qv.InterfaceC16622O;
import ss.C17037o;
import ss.InterfaceC17023a;
import ts.ProductCardDecorator;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import yr.C18299z;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aÝ\u0002\u0010#\u001a\u00020\u0005*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\u00072!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\u00162\b\b\u0002\u0010\"\u001a\u00020\u0016H\u0001¢\u0006\u0004\b#\u0010$\u001a%\u0010%\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b%\u0010&\u001a\u001d\u0010(\u001a\u00020\u0005*\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b(\u0010)\u001aW\u00104\u001a\u00020\u0005*\u00020\u00002\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\u00162\u0006\u00100\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0016012\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b4\u00105\u001aE\u00106\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b6\u00107\u001a!\u00109\u001a\u00020\u0005*\u00020\u00182\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b9\u0010&\u001a!\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0001*\u00020\u00182\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b=\u0010>\u001a\u001b\u0010@\u001a\u00020:*\u00020\u00182\u0006\u0010?\u001a\u00020<H\u0000¢\u0006\u0004\b@\u0010A\u001aF\u0010I\u001a\u00020\u0005\"\u0004\b\u0000\u0010B*\u00028\u00002\b\b\u0002\u0010D\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020E2\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\bGH\u0001¢\u0006\u0004\bI\u0010J¨\u0006N²\u0006\f\u0010L\u001a\u00020K8\nX\u008a\u0084\u0002²\u0006\u000e\u00100\u001a\u00020/8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010.\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010M\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "Lvs/f;", "products", "Lkotlin/Function0;", "", "onBottomReached", "Lkotlin/Function1;", "Lss/a;", "productCardAction", "Lkotlin/ParameterName;", "name", "product", "clippableCouponAction", "viewCouponDetail", "findSimilarItems", "LPp/b;", "searchType", "onExpandQtyStepper", "onCollapseQtyStepper", "Lvs/b;", "itemToSubstitute", "", "isPagingLoading", "Ll0/A;", "lazyListState", "Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "googleAdSlot1", "googleAdSlot2", "googleAdSlot3", "shouldEnableRatings", "isSponsoredProductBuyAgainEnabled", "isSponsoredProductFavOnSaleEnabled", "isVideoAdExperienceEnabled", "isUserLoggedIn", "G", "(LJi/M;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LPp/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lvs/b;ZLl0/A;Lcom/google/android/gms/ads/admanager/AdManagerAdView;Lcom/google/android/gms/ads/admanager/AdManagerAdView;Lcom/google/android/gms/ads/admanager/AdManagerAdView;ZZZZZLandroidx/compose/runtime/Composer;IIII)V", "z", "(Ll0/A;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "adManagerView", "t", "(LJi/M;Lcom/google/android/gms/ads/admanager/AdManagerAdView;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "isVideoVisible", "", "videoPlaybackPosition", "Landroidx/compose/runtime/l0;", "isMuted", "onPlaybackPositionUpdate", "O", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/media3/exoplayer/ExoPlayer;ZJLandroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "C", "(Ll0/A;Ljava/util/List;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "loadMore", "w", "", "itemVisiblePercentThreshold", "Ll0/i;", "V", "(Ll0/A;F)Ljava/util/List;", "info", "U", "(Ll0/A;Ll0/i;)F", "T", "Landroidx/compose/animation/h;", "enter", "Landroidx/compose/animation/j;", "exit", "Lkotlin/ExtensionFunctionType;", "content", "q", "(Ljava/lang/Object;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "gamPlacement", "isSponsoredProductBuyAgain", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Zm.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5546t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zm.t$a */
    static final class a implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function3<T, Composer, Integer, Unit> f42989a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f42990b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function3<? super T, ? super Composer, ? super Integer, Unit> function3, T t10) {
            this.f42989a = function3;
            this.f42990b = t10;
        }

        public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-375317895, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.AnimationBox.<anonymous> (ProductListCompose.kt:537)");
            }
            this.f42989a.invoke(this.f42990b, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            a(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Zm/t$b", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Zm.t$b */
    public static final class b implements androidx.compose.runtime.E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f42991a;

        public b(AdManagerAdView adManagerAdView) {
            this.f42991a = adManagerAdView;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            ViewParent parent = this.f42991a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f42991a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$OnBottomReached$1$1", f = "ProductListCompose.kt", l = {506}, m = "invokeSuspend")
    /* renamed from: Zm.t$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42992a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1<Boolean> f42993b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42994c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zm.t$c$a */
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f42995a;

            a(Function0<Unit> function0) {
                this.f42995a = function0;
            }

            public final Object a(boolean z10, Continuation<? super Unit> continuation) {
                if (z10) {
                    this.f42995a.invoke();
                }
                return Unit.f142422a;
            }

            @Override // tv.InterfaceC17153g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z1<Boolean> z1Var, Function0<Unit> function0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f42993b = z1Var;
            this.f42994c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f42993b, this.f42994c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(z1 z1Var) {
            return ((Boolean) z1Var.getValue()).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42992a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final z1<Boolean> z1Var = this.f42993b;
                InterfaceC17152f interfaceC17152fQ = o1.q(new Function0() { // from class: Zm.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(C5546t.c.g(z1Var));
                    }
                });
                a aVar = new a(this.f42994c);
                this.f42992a = 1;
                if (interfaceC17152fQ.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$OnScroll$1$1", f = "ProductListCompose.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Zm.t$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42996a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42997b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0<Unit> function0, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f42997b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f42997b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f42996a == 0) {
                ResultKt.b(obj);
                this.f42997b.invoke();
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$OnViewBeacon$2$1", f = "ProductListCompose.kt", l = {472}, m = "invokeSuspend")
    /* renamed from: Zm.t$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42998a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1<List<Integer>> f42999b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ProductListDecorator> f43000c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC17023a, Unit> f43001d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Zm.t$e$a */
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<ProductListDecorator> f43002a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<List<Integer>> f43003b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<InterfaceC17023a, Unit> f43004c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$OnViewBeacon$2$1$2", f = "ProductListCompose.kt", l = {477}, m = "emit")
            /* renamed from: Zm.t$e$a$a, reason: collision with other inner class name */
            static final class C0925a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f43005a;

                /* renamed from: b, reason: collision with root package name */
                Object f43006b;

                /* renamed from: c, reason: collision with root package name */
                Object f43007c;

                /* renamed from: d, reason: collision with root package name */
                Object f43008d;

                /* renamed from: e, reason: collision with root package name */
                Object f43009e;

                /* renamed from: f, reason: collision with root package name */
                Object f43010f;

                /* renamed from: g, reason: collision with root package name */
                Object f43011g;

                /* renamed from: h, reason: collision with root package name */
                Object f43012h;

                /* renamed from: i, reason: collision with root package name */
                Object f43013i;

                /* renamed from: j, reason: collision with root package name */
                int f43014j;

                /* renamed from: k, reason: collision with root package name */
                int f43015k;

                /* renamed from: l, reason: collision with root package name */
                int f43016l;

                /* renamed from: m, reason: collision with root package name */
                int f43017m;

                /* renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f43018n;

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ a<T> f43019o;

                /* renamed from: p, reason: collision with root package name */
                int f43020p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0925a(a<? super T> aVar, Continuation<? super C0925a> continuation) {
                    super(continuation);
                    this.f43019o = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f43018n = obj;
                    this.f43020p |= Integer.MIN_VALUE;
                    return this.f43019o.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(List<ProductListDecorator> list, z1<? extends List<Integer>> z1Var, Function1<? super InterfaceC17023a, Unit> function1) {
                this.f43002a = list;
                this.f43003b = z1Var;
                this.f43004c = function1;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
            
                if ((r5 != null ? r5.getSponsorSource() : null) == Ho.b.f13066d) goto L30;
             */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0083 -> B:39:0x010e). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00af -> B:39:0x010e). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d8 -> B:34:0x00db). Please report as a decompilation issue!!! */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.util.List<java.lang.Integer> r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
                /*
                    Method dump skipped, instructions count: 276
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: Zm.C5546t.e.a.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(z1<? extends List<Integer>> z1Var, List<ProductListDecorator> list, Function1<? super InterfaceC17023a, Unit> function1, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f42999b = z1Var;
            this.f43000c = list;
            this.f43001d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f42999b, this.f43000c, this.f43001d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(z1 z1Var) {
            return (List) z1Var.getValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42998a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final z1<List<Integer>> z1Var = this.f42999b;
                InterfaceC17152f interfaceC17152fQ = o1.q(new Function0() { // from class: Zm.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5546t.e.g(z1Var);
                    }
                });
                a aVar = new a(this.f43000c, this.f42999b, this.f43001d);
                this.f42998a = 1;
                if (interfaceC17152fQ.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$ProductListCompose$3$1", f = "ProductListCompose.kt", l = {125}, m = "invokeSuspend")
    /* renamed from: Zm.t$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f43021a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15339A f43022b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C15339A c15339a, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f43022b = c15339a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f43022b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f43021a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C15339A c15339a = this.f43022b;
                this.f43021a = 1;
                if (C15339A.J(c15339a, 0, 0, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Zm.t$g */
    static final class g implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C15339A f43023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f43024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5728k0 f43025c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f43026d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<ProductListDecorator> f43027e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Pp.b f43028f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ CartProductListDecorator f43029g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC17023a, Unit> f43030h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<ProductListDecorator, Unit> f43031i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<ProductListDecorator, Unit> f43032j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f43033k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<ProductListDecorator, Unit> f43034l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<ProductListDecorator, Unit> f43035m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f43036n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f43037o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f43038p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f43039q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f43040r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f43041s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f43042t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f43043u;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Zm.t$g$a */
        static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f43044a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<ExoPlayer> f43045b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f43046c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f43047d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5728k0 f43048e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<Boolean> f43049f;

            public final void b(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1299678763, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:169)");
                }
                if (this.f43044a.getValue().booleanValue()) {
                    composer.startReplaceGroup(400214752);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ExoPlayer value = this.f43045b.getValue();
                    boolean zE = g.e(this.f43049f);
                    long jL = C5546t.L(this.f43048e);
                    LocalThemeScope localThemeScope = this.f43046c;
                    InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f43047d;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f43048e);
                    final InterfaceC5728k0 interfaceC5728k0 = this.f43048e;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Zm.y
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C5546t.g.a.c(interfaceC5728k0, ((Long) obj).longValue());
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C5546t.O(localThemeScope, companion, value, zE, jL, interfaceC5730l0, (Function1) objB, composer, LocalThemeScope.f15770g | 196656);
                    composer.P();
                } else {
                    composer.startReplaceGroup(400798203);
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                    e.b bVarG = P0.e.INSTANCE.g();
                    LocalThemeScope localThemeScope2 = this.f43046c;
                    MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), bVarG, composer, 48);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                    C17906T0.a(null, localThemeScope2.getAdsColors().getAdsColorBrandPrimary().getColor(), 0.0f, 0L, 0, composer, 0, 29);
                    composer.v();
                    composer.P();
                }
                C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<ExoPlayer> interfaceC5730l02, LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5728k0 interfaceC5728k0, z1<Boolean> z1Var) {
                this.f43044a = interfaceC5730l0;
                this.f43045b = interfaceC5730l02;
                this.f43046c = localThemeScope;
                this.f43047d = interfaceC5730l03;
                this.f43048e = interfaceC5728k0;
                this.f43049f = z1Var;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                b(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC5728k0 interfaceC5728k0, long j10) {
                C5546t.M(interfaceC5728k0, j10);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zm.t$g$b */
        static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f43050a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AdManagerAdView f43051b;

            b(LocalThemeScope localThemeScope, AdManagerAdView adManagerAdView) {
                this.f43050a = localThemeScope;
                this.f43051b = adManagerAdView;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-212259573, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:193)");
                }
                C5546t.t(this.f43050a, this.f43051b, composer, LocalThemeScope.f15770g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Zm.t$g$c */
        static final class c implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<ProductListDecorator> f43052a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Pp.b f43053b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AdManagerAdView f43054c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AdManagerAdView f43055d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CartProductListDecorator f43056e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f43057f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<InterfaceC17023a, Unit> f43058g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<ProductListDecorator, Unit> f43059h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1<ProductListDecorator, Unit> f43060i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f43061j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function1<ProductListDecorator, Unit> f43062k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function1<ProductListDecorator, Unit> f43063l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ boolean f43064m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f43065n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f43066o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ boolean f43067p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f43068q;

            /* JADX WARN: Multi-variable type inference failed */
            c(List<ProductListDecorator> list, Pp.b bVar, AdManagerAdView adManagerAdView, AdManagerAdView adManagerAdView2, CartProductListDecorator cartProductListDecorator, LocalThemeScope localThemeScope, Function1<? super InterfaceC17023a, Unit> function1, Function1<? super ProductListDecorator, Unit> function12, Function1<? super ProductListDecorator, Unit> function13, Function0<Unit> function0, Function1<? super ProductListDecorator, Unit> function14, Function1<? super ProductListDecorator, Unit> function15, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC5726j0 interfaceC5726j0) {
                this.f43052a = list;
                this.f43053b = bVar;
                this.f43054c = adManagerAdView;
                this.f43055d = adManagerAdView2;
                this.f43056e = cartProductListDecorator;
                this.f43057f = localThemeScope;
                this.f43058g = function1;
                this.f43059h = function12;
                this.f43060i = function13;
                this.f43061j = function0;
                this.f43062k = function14;
                this.f43063l = function15;
                this.f43064m = z10;
                this.f43065n = z11;
                this.f43066o = z12;
                this.f43067p = z13;
                this.f43068q = interfaceC5726j0;
            }

            public final void e(InterfaceC15343c items, int i10, Composer composer, int i11) {
                int i12;
                ProductCardDecorator productCardDecorator;
                boolean z10;
                List<ProductListDecorator> list;
                boolean z11;
                Modifier.Companion companion;
                int i13;
                int i14;
                AdManagerAdView adManagerAdView;
                AdManagerAdView adManagerAdView2;
                Intrinsics.j(items, "$this$items");
                if ((i11 & 6) == 0) {
                    i12 = i11 | (composer.V(items) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= composer.d(i10) ? 32 : 16;
                }
                int i15 = i12;
                if ((i15 & 147) == 146 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1023553085, i15, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:199)");
                }
                final ProductListDecorator productListDecorator = this.f43052a.get(i10);
                boolean z12 = true;
                if (!productListDecorator.getIsOutOfStock() || CollectionsKt.p(Pp.b.f28358c, Pp.b.f28359d).contains(this.f43053b)) {
                    z12 = false;
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierA = InterfaceC15343c.a(items, companion2, null, null, null, 7, null);
                CartProductListDecorator cartProductListDecorator = this.f43056e;
                LocalThemeScope localThemeScope = this.f43057f;
                Function1<InterfaceC17023a, Unit> function1 = this.f43058g;
                final Function1<ProductListDecorator, Unit> function12 = this.f43059h;
                final Function1<ProductListDecorator, Unit> function13 = this.f43060i;
                Function0<Unit> function0 = this.f43061j;
                final Function1<ProductListDecorator, Unit> function14 = this.f43062k;
                final Function1<ProductListDecorator, Unit> function15 = this.f43063l;
                Pp.b bVar = this.f43053b;
                boolean z13 = this.f43064m;
                boolean z14 = this.f43065n;
                boolean z15 = this.f43066o;
                boolean z16 = this.f43067p;
                List<ProductListDecorator> list2 = this.f43052a;
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion3 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion3.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierA);
                InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion4.a();
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
                D1.c(composerA, measurePolicyA, companion4.e());
                D1.c(composerA, interfaceC5742sR, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion4.f());
                C14815g c14815g = C14815g.f139108a;
                ProductCardDecorator productCardDecoratorV = productListDecorator.V();
                boolean z17 = productListDecorator.getCoupon() != null;
                CouponCountDownStateDecorator couponCountDownStateDecorator = productListDecorator.getCouponCountDownStateDecorator();
                ClippableCouponDecorator clippableCouponDecoratorB = couponCountDownStateDecorator != null ? couponCountDownStateDecorator.b() : null;
                Double dValueOf = productListDecorator.getProduct().getMaxOrderQuantity() != null ? Double.valueOf(r8.intValue()) : null;
                double dDoubleValue = 2.147483647E9d;
                if (dValueOf == null) {
                    productCardDecorator = productCardDecoratorV;
                    z10 = z17;
                } else {
                    productCardDecorator = productCardDecoratorV;
                    z10 = z17;
                    if (!Intrinsics.b(dValueOf, 0.0d)) {
                        Double dValueOf2 = productListDecorator.getProduct().getMaxOrderQuantity() != null ? Double.valueOf(r2.intValue()) : null;
                        Intrinsics.g(dValueOf2);
                        dDoubleValue = dValueOf2.doubleValue();
                    }
                }
                boolean isSelected = productListDecorator.getIsSelected();
                boolean zR = productListDecorator.R(cartProductListDecorator);
                if (productListDecorator.getSponsorship() != null) {
                    list = list2;
                    z11 = true;
                } else {
                    list = list2;
                    z11 = false;
                }
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(function12) | composer.D(productListDecorator);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Zm.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5546t.g.c.f(function12, productListDecorator);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function02 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(function13) | composer.D(productListDecorator);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Zm.A
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5546t.g.c.g(function13, productListDecorator);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function03 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zV3 = composer.V(function14) | composer.D(productListDecorator);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: Zm.B
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5546t.g.c.k(function14, productListDecorator);
                        }
                    };
                    composer.t(objB3);
                }
                Function0 function04 = (Function0) objB3;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zV4 = composer.V(function15) | composer.D(productListDecorator);
                Object objB4 = composer.B();
                if (zV4 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function0() { // from class: Zm.C
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5546t.g.c.l(function15, productListDecorator);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                int i16 = LocalThemeScope.f15770g;
                List<ProductListDecorator> list3 = list;
                C17037o.v(localThemeScope, productCardDecorator, i10, function1, z10, clippableCouponDecoratorB, function02, function03, function0, dDoubleValue, z12, function04, (Function0) objB4, bVar, isSelected, zR, z11, z13, false, 0, z14, z15, z16, null, composer, ((i15 << 3) & 896) | (ProductCardDecorator.f162061C << 3) | i16 | (ClippableCouponDecorator.f13160c << 15), 0, 0, 4587520);
                composer.startReplaceGroup(-205315563);
                if (i10 < CollectionsKt.o(list3)) {
                    C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composer, 384, 9);
                }
                composer.P();
                composer.v();
                composer.startReplaceGroup(-86921437);
                if (i10 != C5546t.J(this.f43068q) || (adManagerAdView2 = this.f43054c) == null) {
                    companion = companion2;
                    i13 = i16;
                    i14 = 0;
                } else {
                    LocalThemeScope localThemeScope2 = this.f43057f;
                    companion = companion2;
                    Modifier modifierA2 = InterfaceC15343c.a(items, companion, null, null, null, 7, null);
                    i14 = 0;
                    MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion3.k(), composer, 0);
                    int iA2 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR2 = composer.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierA2);
                    Function0<InterfaceC5811g> function0A2 = companion4.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A2);
                    } else {
                        composer.s();
                    }
                    Composer composerA2 = D1.a(composer);
                    D1.c(composerA2, measurePolicyA2, companion4.e());
                    D1.c(composerA2, interfaceC5742sR2, companion4.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
                    if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                        composerA2.t(Integer.valueOf(iA2));
                        composerA2.n(Integer.valueOf(iA2), function2B2);
                    }
                    D1.c(composerA2, modifierE2, companion4.f());
                    i13 = i16;
                    C5546t.t(localThemeScope2, adManagerAdView2, composer, i13);
                    composer.v();
                    Unit unit = Unit.f142422a;
                }
                composer.P();
                if (this.f43052a.size() > 17 && i10 == 17 && (adManagerAdView = this.f43055d) != null) {
                    LocalThemeScope localThemeScope3 = this.f43057f;
                    Modifier modifierA3 = InterfaceC15343c.a(items, companion, null, null, null, 7, null);
                    MeasurePolicy measurePolicyA3 = C5665k.a(c5658d.h(), companion3.k(), composer, i14);
                    int iA3 = C5717f.a(composer, i14);
                    InterfaceC5742s interfaceC5742sR3 = composer.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierA3);
                    Function0<InterfaceC5811g> function0A3 = companion4.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A3);
                    } else {
                        composer.s();
                    }
                    Composer composerA3 = D1.a(composer);
                    D1.c(composerA3, measurePolicyA3, companion4.e());
                    D1.c(composerA3, interfaceC5742sR3, companion4.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion4.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    D1.c(composerA3, modifierE3, companion4.f());
                    C5546t.t(localThemeScope3, adManagerAdView, composer, i13);
                    composer.v();
                    Unit unit2 = Unit.f142422a;
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
                e(interfaceC15343c, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function1 function1, ProductListDecorator productListDecorator) {
                function1.invoke(productListDecorator);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function1 function1, ProductListDecorator productListDecorator) {
                function1.invoke(productListDecorator);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(Function1 function1, ProductListDecorator productListDecorator) {
                function1.invoke(productListDecorator);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(Function1 function1, ProductListDecorator productListDecorator) {
                function1.invoke(productListDecorator);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zm.t$g$d */
        static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f43069a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Zm.t$g$d$a */
            static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f43070a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Zm.t$g$d$a$a, reason: collision with other inner class name */
                static final class C0926a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f43071a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14810b f43072b;

                    C0926a(LocalThemeScope localThemeScope, InterfaceC14810b interfaceC14810b) {
                        this.f43071a = localThemeScope;
                        this.f43072b = interfaceC14810b;
                    }

                    public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1036867946, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:263)");
                        }
                        Bi.m.f(this.f43071a, this.f43072b.g(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), P0.e.INSTANCE.e()), Assemble.getLoading().getSmallLoading(), Bi.o.f2584a, null, false, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Small.f140102f << 6), 56);
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

                a(LocalThemeScope localThemeScope) {
                    this.f43070a = localThemeScope;
                }

                public final void a(InterfaceC15343c AnimationBox, Composer composer, int i10) {
                    Intrinsics.j(AnimationBox, "$this$AnimationBox");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1538819423, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:261)");
                    }
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f43070a;
                    MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyG, companion.e());
                    D1.c(composerA, interfaceC5742sR, companion.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion.f());
                    Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-1036867946, true, new C0926a(localThemeScope, C5664j.f48612a), composer, 54), composer, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                    a(interfaceC15343c, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            d(LocalThemeScope localThemeScope) {
                this.f43069a = localThemeScope;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(item) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-60270900, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:260)");
                }
                C5546t.q(item, null, null, ComposableLambdaKt.c(-1538819423, true, new a(this.f43069a), composer, 54), composer, (i10 & 14) | 3072, 3);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(boolean z10, AdManagerAdView adManagerAdView, List list, boolean z11, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, LocalThemeScope localThemeScope, InterfaceC5730l0 interfaceC5730l03, InterfaceC5728k0 interfaceC5728k0, z1 z1Var, Pp.b bVar, AdManagerAdView adManagerAdView2, AdManagerAdView adManagerAdView3, CartProductListDecorator cartProductListDecorator, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function1 function15, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC5726j0 interfaceC5726j0, l0.w LazyColumn) {
            LocalThemeScope localThemeScope2;
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            if (z10) {
                localThemeScope2 = localThemeScope;
                l0.w.g(LazyColumn, "videoAd", null, ComposableLambdaKt.composableLambdaInstance(-1299678763, true, new a(interfaceC5730l0, interfaceC5730l02, localThemeScope, interfaceC5730l03, interfaceC5728k0, z1Var)), 2, null);
            } else {
                localThemeScope2 = localThemeScope;
                if (adManagerAdView != null) {
                    l0.w.g(LazyColumn, "adSlot1", null, ComposableLambdaKt.composableLambdaInstance(-212259573, true, new b(localThemeScope2, adManagerAdView)), 2, null);
                }
            }
            LocalThemeScope localThemeScope3 = localThemeScope2;
            l0.w.b(LazyColumn, list.size(), null, null, ComposableLambdaKt.composableLambdaInstance(-1023553085, true, new c(list, bVar, adManagerAdView2, adManagerAdView3, cartProductListDecorator, localThemeScope3, function1, function12, function13, function0, function14, function15, z12, z13, z14, z15, interfaceC5726j0)), 6, null);
            if (z11) {
                l0.w.g(LazyColumn, "loading", null, ComposableLambdaKt.composableLambdaInstance(-60270900, true, new d(localThemeScope3)), 2, null);
            }
            return Unit.f142422a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(C15339A c15339a, boolean z10, InterfaceC5728k0 interfaceC5728k0, AdManagerAdView adManagerAdView, List<ProductListDecorator> list, Pp.b bVar, CartProductListDecorator cartProductListDecorator, Function1<? super InterfaceC17023a, Unit> function1, Function1<? super ProductListDecorator, Unit> function12, Function1<? super ProductListDecorator, Unit> function13, Function0<Unit> function0, Function1<? super ProductListDecorator, Unit> function14, Function1<? super ProductListDecorator, Unit> function15, boolean z11, boolean z12, boolean z13, boolean z14, AdManagerAdView adManagerAdView2, AdManagerAdView adManagerAdView3, boolean z15, InterfaceC5726j0 interfaceC5726j0) {
            this.f43023a = c15339a;
            this.f43024b = z10;
            this.f43025c = interfaceC5728k0;
            this.f43026d = adManagerAdView;
            this.f43027e = list;
            this.f43028f = bVar;
            this.f43029g = cartProductListDecorator;
            this.f43030h = function1;
            this.f43031i = function12;
            this.f43032j = function13;
            this.f43033k = function0;
            this.f43034l = function14;
            this.f43035m = function15;
            this.f43036n = z11;
            this.f43037o = z12;
            this.f43038p = z13;
            this.f43039q = z14;
            this.f43040r = adManagerAdView2;
            this.f43041s = adManagerAdView3;
            this.f43042t = z15;
            this.f43043u = interfaceC5726j0;
        }

        public final void d(final LocalThemeScope AnimationBox, Composer composer, int i10) {
            int i11;
            Context context;
            InterfaceC5728k0 interfaceC5728k0;
            InterfaceC5730l0 interfaceC5730l0;
            InterfaceC5730l0 interfaceC5730l02;
            Object obj;
            Composer composer2;
            Intrinsics.j(AnimationBox, "$this$AnimationBox");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AnimationBox) : composer.D(AnimationBox) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1672580143, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous> (ProductListCompose.kt:128)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = C18299z.c(companion, false, 1, null);
            final C15339A c15339a = this.f43023a;
            final boolean z10 = this.f43024b;
            final InterfaceC5728k0 interfaceC5728k02 = this.f43025c;
            final AdManagerAdView adManagerAdView = this.f43026d;
            final List<ProductListDecorator> list = this.f43027e;
            int i12 = i11;
            final Pp.b bVar = this.f43028f;
            final CartProductListDecorator cartProductListDecorator = this.f43029g;
            final Function1<InterfaceC17023a, Unit> function1 = this.f43030h;
            final Function1<ProductListDecorator, Unit> function12 = this.f43031i;
            final Function1<ProductListDecorator, Unit> function13 = this.f43032j;
            final Function0<Unit> function0 = this.f43033k;
            final Function1<ProductListDecorator, Unit> function14 = this.f43034l;
            final Function1<ProductListDecorator, Unit> function15 = this.f43035m;
            final boolean z11 = this.f43036n;
            final boolean z12 = this.f43037o;
            final boolean z13 = this.f43038p;
            final boolean z14 = this.f43039q;
            final AdManagerAdView adManagerAdView2 = this.f43040r;
            final AdManagerAdView adManagerAdView3 = this.f43041s;
            final boolean z15 = this.f43042t;
            final InterfaceC5726j0 interfaceC5726j0 = this.f43043u;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
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
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = "https://pubads.g.doubleclick.net/gampad/ads?iu=/22908976526/ca-video-pub-3299030645726554-tag&sz=640x480&gdfp_req=1&output=vast&unviewed_position_start=1&env=vp&impl=s";
                composer.t("https://pubads.g.doubleclick.net/gampad/ads?iu=/22908976526/ca-video-pub-3299030645726554-tag&sz=640x480&gdfp_req=1&output=vast&unviewed_position_start=1&env=vp&impl=s");
            }
            String str = (String) objB;
            composer.P();
            Context context2 = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion3.a()) {
                objB2 = new fi.k(context2, str);
                composer.t(objB2);
            }
            fi.k kVar = (fi.k) objB2;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion3.a()) {
                context = context2;
                InterfaceC5730l0 interfaceC5730l0E = t1.e(null, null, 2, null);
                composer.t(interfaceC5730l0E);
                objB3 = interfaceC5730l0E;
            } else {
                context = context2;
            }
            final InterfaceC5730l0 interfaceC5730l03 = (InterfaceC5730l0) objB3;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion3.a()) {
                objB4 = f1.a(0L);
                composer.t(objB4);
            }
            InterfaceC5728k0 interfaceC5728k03 = (InterfaceC5728k0) objB4;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB5 = composer.B();
            if (objB5 == companion3.a()) {
                interfaceC5728k0 = interfaceC5728k03;
                objB5 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB5);
            } else {
                interfaceC5728k0 = interfaceC5728k03;
            }
            InterfaceC5730l0 interfaceC5730l04 = (InterfaceC5730l0) objB5;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB6 = composer.B();
            if (objB6 == companion3.a()) {
                interfaceC5730l0 = interfaceC5730l04;
                objB6 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB6);
            } else {
                interfaceC5730l0 = interfaceC5730l04;
            }
            InterfaceC5730l0 interfaceC5730l05 = (InterfaceC5730l0) objB6;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB7 = composer.B();
            if (objB7 == companion3.a()) {
                interfaceC5730l02 = interfaceC5730l05;
                objB7 = t1.e(Boolean.TRUE, null, 2, null);
                composer.t(objB7);
            } else {
                interfaceC5730l02 = interfaceC5730l05;
            }
            final InterfaceC5730l0 interfaceC5730l06 = (InterfaceC5730l0) objB7;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB8 = composer.B();
            if (objB8 == companion3.a()) {
                objB8 = o1.e(new Function0() { // from class: Zm.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(C5546t.g.g(c15339a));
                    }
                });
                composer.t(objB8);
            }
            final z1 z1Var = (z1) objB8;
            composer.P();
            int i13 = i12 & 14;
            int i14 = 14380032 | LocalThemeScope.f15770g | i13 | (fi.k.f131168e << 6);
            sr.p.F(AnimationBox, context, kVar, interfaceC5730l03, interfaceC5728k0, interfaceC5730l0, interfaceC5730l02, interfaceC5730l06, composer, i14);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            composer.startReplaceGroup(-1224400529);
            boolean zA = composer.a(z10) | composer.V(interfaceC5728k02) | (i13 == 4 || ((i12 & 8) != 0 && composer.D(AnimationBox))) | composer.D(adManagerAdView) | composer.D(list) | composer.d(bVar.ordinal()) | composer.D(cartProductListDecorator) | composer.V(function1) | composer.V(function12) | composer.V(function13) | composer.V(function0) | composer.V(function14) | composer.V(function15) | composer.a(z11) | composer.a(z12) | composer.a(z13) | composer.a(z14) | composer.D(adManagerAdView2) | composer.D(adManagerAdView3) | composer.a(z15);
            Object objB9 = composer.B();
            if (zA || objB9 == companion3.a()) {
                composer2 = composer;
                final InterfaceC5730l0 interfaceC5730l07 = interfaceC5730l02;
                obj = new Function1() { // from class: Zm.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C5546t.g.f(z10, adManagerAdView, list, z15, interfaceC5730l07, interfaceC5730l03, AnimationBox, interfaceC5730l06, interfaceC5728k02, z1Var, bVar, adManagerAdView2, adManagerAdView3, cartProductListDecorator, function1, function12, function13, function0, function14, function15, z11, z12, z13, z14, interfaceC5726j0, (l0.w) obj2);
                    }
                };
                composer2.t(obj);
            } else {
                obj = objB9;
                composer2 = composer;
            }
            composer2.P();
            C15342b.a(modifierH, c15339a, null, false, null, null, null, false, null, (Function1) obj, composer2, 6, 508);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            d(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(z1<Boolean> z1Var) {
            return z1Var.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(C15339A c15339a) {
            Object next;
            Iterator<T> it = c15339a.x().h().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.e(((InterfaceC15349i) next).getKey(), "videoAd")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC15349i interfaceC15349i = (InterfaceC15349i) next;
            if (interfaceC15349i != null && interfaceC15349i.getOffset() >= 0 && interfaceC15349i.getOffset() + interfaceC15349i.getSize() <= c15339a.x().getViewportEndOffset()) {
                return true;
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$ProductListCompose$5$1", f = "ProductListCompose.kt", l = {282}, m = "invokeSuspend")
    /* renamed from: Zm.t$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f43073a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f43074b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15339A f43075c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z10, C15339A c15339a, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f43074b = z10;
            this.f43075c = c15339a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.f43074b, this.f43075c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f43073a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f43074b) {
                    C15339A c15339a = this.f43075c;
                    int totalItemsCount = c15339a.x().getTotalItemsCount();
                    this.f43073a = 1;
                    if (C15339A.l(c15339a, totalItemsCount, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(final Ji.LocalThemeScope r35, final java.util.List<vs.ProductListDecorator> r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, kotlin.jvm.functions.Function1<? super ss.InterfaceC17023a, kotlin.Unit> r38, final kotlin.jvm.functions.Function1<? super vs.ProductListDecorator, kotlin.Unit> r39, final kotlin.jvm.functions.Function1<? super vs.ProductListDecorator, kotlin.Unit> r40, final kotlin.jvm.functions.Function1<? super vs.ProductListDecorator, kotlin.Unit> r41, Pp.b r42, final kotlin.jvm.functions.Function1<? super vs.ProductListDecorator, kotlin.Unit> r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, vs.CartProductListDecorator r45, boolean r46, l0.C15339A r47, com.google.android.gms.ads.admanager.AdManagerAdView r48, com.google.android.gms.ads.admanager.AdManagerAdView r49, com.google.android.gms.ads.admanager.AdManagerAdView r50, final boolean r51, final boolean r52, final boolean r53, boolean r54, boolean r55, androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Zm.C5546t.G(Ji.M, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, Pp.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, vs.b, boolean, l0.A, com.google.android.gms.ads.admanager.AdManagerAdView, com.google.android.gms.ads.admanager.AdManagerAdView, com.google.android.gms.ads.admanager.AdManagerAdView, boolean, boolean, boolean, boolean, boolean, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(C15339A c15339a, Function0 function0, int i10, Composer composer, int i11) {
        z(c15339a, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void C(final C15339A lazyListState, final List<ProductListDecorator> products, Function1<? super InterfaceC17023a, Unit> function1, final boolean z10, Composer composer, final int i10, final int i11) {
        int i12;
        final Function1<? super InterfaceC17023a, Unit> function12;
        Intrinsics.j(lazyListState, "lazyListState");
        Intrinsics.j(products, "products");
        Composer composerStartRestartGroup = composer.startRestartGroup(-142735684);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.V(lazyListState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(products) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(function1) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            function12 = function1;
        } else {
            function12 = i13 != 0 ? null : function1;
            if (ComposerKt.M()) {
                ComposerKt.U(-142735684, i12, -1, "com.meijer.mobile.meijer.activity.find.fragment.OnViewBeacon (ProductListCompose.kt:459)");
            }
            if (z10) {
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                T0 t0L = composerStartRestartGroup.l();
                if (t0L != null) {
                    t0L.a(new Function2() { // from class: Zm.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C5546t.D(lazyListState, products, function12, z10, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = o1.e(new Function0() { // from class: Zm.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5546t.E(lazyListState);
                    }
                });
                composerStartRestartGroup.t(objB);
            }
            z1 z1Var = (z1) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD = ((i12 & 896) == 256) | composerStartRestartGroup.D(products);
            Object objB2 = composerStartRestartGroup.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new e(z1Var, products, function12, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(products, (Function2) objB2, composerStartRestartGroup, (i12 >> 3) & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L2 = composerStartRestartGroup.l();
        if (t0L2 != null) {
            t0L2.a(new Function2() { // from class: Zm.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5546t.F(lazyListState, products, function12, z10, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(C15339A c15339a, List list, Function1 function1, boolean z10, int i10, int i11, Composer composer, int i12) {
        C(c15339a, list, function1, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List E(C15339A c15339a) {
        List<InterfaceC15349i> listV = V(c15339a, 50.0f);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listV, 10));
        Iterator<T> it = listV.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((InterfaceC15349i) it.next()).getIndex()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(C15339A c15339a, List list, Function1 function1, boolean z10, int i10, int i11, Composer composer, int i12) {
        C(c15339a, list, function1, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, List list, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Pp.b bVar, Function1 function15, Function0 function02, CartProductListDecorator cartProductListDecorator, boolean z10, C15339A c15339a, AdManagerAdView adManagerAdView, AdManagerAdView adManagerAdView2, AdManagerAdView adManagerAdView3, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, int i11, int i12, int i13, Composer composer, int i14) {
        G(localThemeScope, list, function0, function1, function12, function13, function14, bVar, function15, function02, cartProductListDecorator, z10, c15339a, adManagerAdView, adManagerAdView2, adManagerAdView3, z11, z12, z13, z14, z15, composer, J0.a(i10 | 1), J0.a(i11), J0.a(i12), i13);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, List list, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Pp.b bVar, Function1 function15, Function0 function02, CartProductListDecorator cartProductListDecorator, boolean z10, C15339A c15339a, AdManagerAdView adManagerAdView, AdManagerAdView adManagerAdView2, AdManagerAdView adManagerAdView3, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, int i11, int i12, int i13, Composer composer, int i14) {
        G(localThemeScope, list, function0, function1, function12, function13, function14, bVar, function15, function02, cartProductListDecorator, z10, c15339a, adManagerAdView, adManagerAdView2, adManagerAdView3, z11, z12, z13, z14, z15, composer, J0.a(i10 | 1), J0.a(i11), J0.a(i12), i13);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5728k0 K() {
        return f1.a(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final LocalThemeScope localThemeScope, final Modifier modifier, final ExoPlayer exoPlayer, final boolean z10, final long j10, final InterfaceC5730l0<Boolean> interfaceC5730l0, final Function1<? super Long, Unit> function1, Composer composer, final int i10) {
        int i11;
        Modifier modifier2;
        ExoPlayer exoPlayer2;
        boolean z11;
        long j11;
        InterfaceC5730l0<Boolean> interfaceC5730l02;
        Function1<? super Long, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1022104563);
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
            exoPlayer2 = exoPlayer;
            i11 |= composerStartRestartGroup.D(exoPlayer2) ? 256 : 128;
        } else {
            exoPlayer2 = exoPlayer;
        }
        if ((i10 & 3072) == 0) {
            z11 = z10;
            i11 |= composerStartRestartGroup.a(z11) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            z11 = z10;
        }
        if ((i10 & 24576) == 0) {
            j11 = j10;
            i11 |= composerStartRestartGroup.e(j11) ? 16384 : 8192;
        } else {
            j11 = j10;
        }
        if ((196608 & i10) == 0) {
            interfaceC5730l02 = interfaceC5730l0;
            i11 |= composerStartRestartGroup.V(interfaceC5730l02) ? 131072 : 65536;
        } else {
            interfaceC5730l02 = interfaceC5730l0;
        }
        if ((1572864 & i10) == 0) {
            function12 = function1;
            i11 |= composerStartRestartGroup.D(function12) ? 1048576 : 524288;
        } else {
            function12 = function1;
        }
        if ((599187 & i11) == 599186 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1022104563, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.VideoAdItem (ProductListCompose.kt:339)");
            }
            sr.p.J(localThemeScope, modifier2, exoPlayer2, z11, j11, interfaceC5730l02, function12, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14) | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (i11 & 3670016));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Zm.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5546t.P(localThemeScope, modifier, exoPlayer, z10, j10, interfaceC5730l0, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(LocalThemeScope localThemeScope, Modifier modifier, ExoPlayer exoPlayer, boolean z10, long j10, InterfaceC5730l0 interfaceC5730l0, Function1 function1, int i10, Composer composer, int i11) {
        O(localThemeScope, modifier, exoPlayer, z10, j10, interfaceC5730l0, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final float U(C15339A c15339a, InterfaceC15349i info) {
        Intrinsics.j(c15339a, "<this>");
        Intrinsics.j(info, "info");
        return Math.max(0.0f, 100.0f - (((Math.max(0, c15339a.x().getViewportStartOffset() - info.getOffset()) + Math.max(0, (info.getOffset() + info.getSize()) - c15339a.x().getViewportEndOffset())) * 100.0f) / info.getSize()));
    }

    public static final List<InterfaceC15349i> V(C15339A c15339a, float f10) {
        Intrinsics.j(c15339a, "<this>");
        List<InterfaceC15349i> listH = c15339a.x().h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (U(c15339a, (InterfaceC15349i) obj) >= f10) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void q(final T r21, androidx.compose.animation.h r22, androidx.compose.animation.j r23, final kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Zm.C5546t.q(java.lang.Object, androidx.compose.animation.h, androidx.compose.animation.j, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i10) {
        return i10 / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Object obj, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, Function3 function3, int i10, int i11, Composer composer, int i12) {
        q(obj, hVar, jVar, function3, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void t(final LocalThemeScope localThemeScope, final AdManagerAdView adManagerAdView, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1185707481);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(adManagerAdView) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1185707481, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.GoogleAdView (ProductListCompose.kt:304)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zV = composerStartRestartGroup.V(adManagerAdView);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                composerStartRestartGroup.t(adManagerAdView);
                objB = adManagerAdView;
            }
            final AdManagerAdView adManagerAdView2 = (AdManagerAdView) objB;
            composerStartRestartGroup.P();
            if (adManagerAdView2 != null) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zD = composerStartRestartGroup.D(adManagerAdView2);
                Object objB2 = composerStartRestartGroup.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: Zm.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C5546t.u(adManagerAdView2, (androidx.compose.runtime.F) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                composerStartRestartGroup.P();
                androidx.compose.runtime.J.c(adManagerAdView2, (Function1) objB2, composerStartRestartGroup, 0);
                sr.p.o(localThemeScope, null, adManagerAdView2, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14), 1);
                C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composerStartRestartGroup, 384, 9);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Zm.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5546t.v(localThemeScope, adManagerAdView, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.E u(AdManagerAdView adManagerAdView, androidx.compose.runtime.F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        return new b(adManagerAdView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, AdManagerAdView adManagerAdView, int i10, Composer composer, int i11) {
        t(localThemeScope, adManagerAdView, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void w(final C15339A c15339a, final Function0<Unit> loadMore, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(c15339a, "<this>");
        Intrinsics.j(loadMore, "loadMore");
        Composer composerStartRestartGroup = composer.startRestartGroup(-685001903);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(c15339a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(loadMore) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-685001903, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.OnBottomReached (ProductListCompose.kt:494)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = o1.e(new Function0() { // from class: Zm.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(C5546t.x(c15339a));
                    }
                });
                composerStartRestartGroup.t(objB);
            }
            z1 z1Var = (z1) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = (i11 & 112) == 32;
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion.a()) {
                objB2 = new c(z1Var, loadMore, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(z1Var, (Function2) objB2, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Zm.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5546t.y(c15339a, loadMore, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(C15339A c15339a, Function0 function0, int i10, Composer composer, int i11) {
        w(c15339a, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(C15339A c15339a) {
        return c15339a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long L(InterfaceC5728k0 interfaceC5728k0) {
        return interfaceC5728k0.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(InterfaceC5728k0 interfaceC5728k0, long j10) {
        interfaceC5728k0.I(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(C15339A c15339a) {
        InterfaceC15349i interfaceC15349i = (InterfaceC15349i) CollectionsKt.F0(c15339a.x().h());
        if (interfaceC15349i == null || interfaceC15349i.getIndex() == c15339a.x().getTotalItemsCount() - 1) {
            return true;
        }
        return false;
    }

    private static final void z(final C15339A c15339a, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1388264371);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(c15339a)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1388264371, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.OnScroll (ProductListCompose.kt:293)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = o1.e(new Function0() { // from class: Zm.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(C5546t.A(c15339a));
                    }
                });
                composerStartRestartGroup.t(objB);
            }
            z1 z1Var = (z1) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion.a()) {
                objB2 = new d(function0, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(z1Var, (Function2) objB2, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Zm.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5546t.B(c15339a, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
