package an;

import Hr.ClippableCouponDecorator;
import Hr.CouponCountDownStateDecorator;
import Ki.LocalThemeScope;
import P0.e;
import an.C5747t;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5870k0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import j0.C14903g;
import j0.InterfaceC14898b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C17972T0;
import kotlin.C17983Z;
import kotlin.InterfaceC6305e;
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
import l0.C15429A;
import l0.C15432b;
import l0.InterfaceC15433c;
import l0.InterfaceC15439i;
import mv.InterfaceC15783O;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import ss.InterfaceC17146a;
import ts.ProductCardDecorator;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import yr.C18370z;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aç\u0002\u0010$\u001a\u00020\u0005*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\u00072!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\u00162\b\b\u0002\u0010\"\u001a\u00020\u00162\b\b\u0002\u0010#\u001a\u00020\u0016H\u0001¢\u0006\u0004\b$\u0010%\u001a%\u0010&\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b&\u0010'\u001a\u001d\u0010)\u001a\u00020\u0005*\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b)\u0010*\u001aW\u00105\u001a\u00020\u0005*\u00020\u00002\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010/\u001a\u00020\u00162\u0006\u00101\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0016022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b5\u00106\u001aE\u00107\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b7\u00108\u001a!\u0010:\u001a\u00020\u0005*\u00020\u00182\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b:\u0010'\u001a!\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u0001*\u00020\u00182\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\b>\u0010?\u001a\u001b\u0010A\u001a\u00020;*\u00020\u00182\u0006\u0010@\u001a\u00020=H\u0000¢\u0006\u0004\bA\u0010B\u001aF\u0010J\u001a\u00020\u0005\"\u0004\b\u0000\u0010C*\u00028\u00002\b\b\u0002\u0010E\u001a\u00020D2\b\b\u0002\u0010G\u001a\u00020F2\u0017\u0010I\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\bHH\u0001¢\u0006\u0004\bJ\u0010K¨\u0006O²\u0006\f\u0010M\u001a\u00020L8\nX\u008a\u0084\u0002²\u0006\u000e\u00101\u001a\u0002008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "Lvs/f;", "products", "Lkotlin/Function0;", "", "onBottomReached", "Lkotlin/Function1;", "Lss/a;", "productCardAction", "Lkotlin/ParameterName;", "name", "product", "clippableCouponAction", "viewCouponDetail", "findSimilarItems", "LPp/b;", "searchType", "onExpandQtyStepper", "onCollapseQtyStepper", "Lvs/b;", "itemToSubstitute", "", "isPagingLoading", "Ll0/A;", "lazyListState", "Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "googleAdSlot1", "googleAdSlot2", "googleAdSlot3", "shouldEnableRatings", "isSponsoredProductBuyAgainEnabled", "isSponsoredProductFavOnSaleEnabled", "isMirakl3PMEnabled", "isVideoAdExperienceEnabled", "isUserLoggedIn", "G", "(LKi/M;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LPp/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lvs/b;ZLl0/A;Lcom/google/android/gms/ads/admanager/AdManagerAdView;Lcom/google/android/gms/ads/admanager/AdManagerAdView;Lcom/google/android/gms/ads/admanager/AdManagerAdView;ZZZZZZLandroidx/compose/runtime/Composer;IIII)V", "z", "(Ll0/A;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "adManagerView", "t", "(LKi/M;Lcom/google/android/gms/ads/admanager/AdManagerAdView;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "isVideoVisible", "", "videoPlaybackPosition", "Landroidx/compose/runtime/l0;", "isMuted", "onPlaybackPositionUpdate", "O", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/media3/exoplayer/ExoPlayer;ZJLandroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "C", "(Ll0/A;Ljava/util/List;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "loadMore", "w", "", "itemVisiblePercentThreshold", "Ll0/i;", "V", "(Ll0/A;F)Ljava/util/List;", "info", "U", "(Ll0/A;Ll0/i;)F", "T", "Landroidx/compose/animation/h;", "enter", "Landroidx/compose/animation/j;", "exit", "Lkotlin/ExtensionFunctionType;", "content", "q", "(Ljava/lang/Object;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "gamPlacement", "isSponsoredProductBuyAgain", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: an.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5747t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: an.t$a */
    static final class a implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function3<T, Composer, Integer, Unit> f45631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f45632b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function3<? super T, ? super Composer, ? super Integer, Unit> function3, T t10) {
            this.f45631a = function3;
            this.f45632b = t10;
        }

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-375317895, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.AnimationBox.<anonymous> (ProductListCompose.kt:538)");
            }
            this.f45631a.invoke(this.f45632b, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            a(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"an/t$b", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: an.t$b */
    public static final class b implements androidx.compose.runtime.E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f45633a;

        public b(AdManagerAdView adManagerAdView) {
            this.f45633a = adManagerAdView;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            ViewParent parent = this.f45633a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f45633a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$OnBottomReached$1$1", f = "ProductListCompose.kt", l = {507}, m = "invokeSuspend")
    /* renamed from: an.t$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f45634a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1<Boolean> f45635b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f45636c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: an.t$c$a */
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f45637a;

            a(Function0<Unit> function0) {
                this.f45637a = function0;
            }

            public final Object a(boolean z10, Continuation<? super Unit> continuation) {
                if (z10) {
                    this.f45637a.invoke();
                }
                return Unit.f143329a;
            }

            @Override // pv.InterfaceC16562g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z1<Boolean> z1Var, Function0<Unit> function0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f45635b = z1Var;
            this.f45636c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f45635b, this.f45636c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(z1 z1Var) {
            return ((Boolean) z1Var.getValue()).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f45634a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final z1<Boolean> z1Var = this.f45635b;
                InterfaceC16561f interfaceC16561fQ = o1.q(new Function0() { // from class: an.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(C5747t.c.g(z1Var));
                    }
                });
                a aVar = new a(this.f45636c);
                this.f45634a = 1;
                if (interfaceC16561fQ.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$OnScroll$1$1", f = "ProductListCompose.kt", l = {}, m = "invokeSuspend")
    /* renamed from: an.t$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f45638a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f45639b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0<Unit> function0, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f45639b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f45639b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f45638a == 0) {
                ResultKt.b(obj);
                this.f45639b.invoke();
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$OnViewBeacon$2$1", f = "ProductListCompose.kt", l = {473}, m = "invokeSuspend")
    /* renamed from: an.t$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f45640a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1<List<Integer>> f45641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ProductListDecorator> f45642c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC17146a, Unit> f45643d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: an.t$e$a */
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<ProductListDecorator> f45644a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<List<Integer>> f45645b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<InterfaceC17146a, Unit> f45646c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$OnViewBeacon$2$1$2", f = "ProductListCompose.kt", l = {478}, m = "emit")
            /* renamed from: an.t$e$a$a, reason: collision with other inner class name */
            static final class C0961a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f45647a;

                /* renamed from: b, reason: collision with root package name */
                Object f45648b;

                /* renamed from: c, reason: collision with root package name */
                Object f45649c;

                /* renamed from: d, reason: collision with root package name */
                Object f45650d;

                /* renamed from: e, reason: collision with root package name */
                Object f45651e;

                /* renamed from: f, reason: collision with root package name */
                Object f45652f;

                /* renamed from: g, reason: collision with root package name */
                Object f45653g;

                /* renamed from: h, reason: collision with root package name */
                Object f45654h;

                /* renamed from: i, reason: collision with root package name */
                Object f45655i;

                /* renamed from: j, reason: collision with root package name */
                int f45656j;

                /* renamed from: k, reason: collision with root package name */
                int f45657k;

                /* renamed from: l, reason: collision with root package name */
                int f45658l;

                /* renamed from: m, reason: collision with root package name */
                int f45659m;

                /* renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f45660n;

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ a<T> f45661o;

                /* renamed from: p, reason: collision with root package name */
                int f45662p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0961a(a<? super T> aVar, Continuation<? super C0961a> continuation) {
                    super(continuation);
                    this.f45661o = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f45660n = obj;
                    this.f45662p |= Integer.MIN_VALUE;
                    return this.f45661o.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(List<ProductListDecorator> list, z1<? extends List<Integer>> z1Var, Function1<? super InterfaceC17146a, Unit> function1) {
                this.f45644a = list;
                this.f45645b = z1Var;
                this.f45646c = function1;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
            
                if ((r5 != null ? r5.getSponsorSource() : null) == Ho.b.f13876d) goto L30;
             */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0083 -> B:39:0x010e). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00af -> B:39:0x010e). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d8 -> B:34:0x00db). Please report as a decompilation issue!!! */
            @Override // pv.InterfaceC16562g
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
                throw new UnsupportedOperationException("Method not decompiled: an.C5747t.e.a.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(z1<? extends List<Integer>> z1Var, List<ProductListDecorator> list, Function1<? super InterfaceC17146a, Unit> function1, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f45641b = z1Var;
            this.f45642c = list;
            this.f45643d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f45641b, this.f45642c, this.f45643d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(z1 z1Var) {
            return (List) z1Var.getValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f45640a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final z1<List<Integer>> z1Var = this.f45641b;
                InterfaceC16561f interfaceC16561fQ = o1.q(new Function0() { // from class: an.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5747t.e.g(z1Var);
                    }
                });
                a aVar = new a(this.f45642c, this.f45641b, this.f45643d);
                this.f45640a = 1;
                if (interfaceC16561fQ.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$ProductListCompose$3$1", f = "ProductListCompose.kt", l = {125}, m = "invokeSuspend")
    /* renamed from: an.t$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f45663a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15429A f45664b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C15429A c15429a, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f45664b = c15429a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f45664b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f45663a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C15429A c15429a = this.f45664b;
                this.f45663a = 1;
                if (C15429A.J(c15429a, 0, 0, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: an.t$g */
    static final class g implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C15429A f45665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f45666b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5870k0 f45667c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f45668d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<ProductListDecorator> f45669e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Pp.b f45670f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ CartProductListDecorator f45671g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC17146a, Unit> f45672h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<ProductListDecorator, Unit> f45673i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<ProductListDecorator, Unit> f45674j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f45675k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<ProductListDecorator, Unit> f45676l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<ProductListDecorator, Unit> f45677m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f45678n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f45679o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f45680p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f45681q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f45682r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f45683s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f45684t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f45685u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f45686v;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: an.t$g$a */
        static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f45687a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<ExoPlayer> f45688b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f45689c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f45690d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5870k0 f45691e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<Boolean> f45692f;

            public final void b(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(460341041, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:169)");
                }
                if (this.f45687a.getValue().booleanValue()) {
                    composer.startReplaceGroup(189446148);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ExoPlayer value = this.f45688b.getValue();
                    boolean zE = g.e(this.f45692f);
                    long jL = C5747t.L(this.f45691e);
                    LocalThemeScope localThemeScope = this.f45689c;
                    InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f45690d;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f45691e);
                    final InterfaceC5870k0 interfaceC5870k0 = this.f45691e;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: an.y
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C5747t.g.a.c(interfaceC5870k0, ((Long) obj).longValue());
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C5747t.O(localThemeScope, companion, value, zE, jL, interfaceC5872l0, (Function1) objB, composer, LocalThemeScope.f17314g | 196656);
                    composer.P();
                } else {
                    composer.startReplaceGroup(190029599);
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                    e.b bVarG = P0.e.INSTANCE.g();
                    LocalThemeScope localThemeScope2 = this.f45689c;
                    MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), bVarG, composer, 48);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                    InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion2.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyA, companion2.e());
                    D1.c(composerA, interfaceC5884sR, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14903g c14903g = C14903g.f139698a;
                    C17972T0.a(null, localThemeScope2.getAdsColors().getAdsColorBrandPrimary().getColor(), 0.0f, 0L, 0, composer, 0, 29);
                    composer.v();
                    composer.P();
                }
                C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<ExoPlayer> interfaceC5872l02, LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5870k0 interfaceC5870k0, z1<Boolean> z1Var) {
                this.f45687a = interfaceC5872l0;
                this.f45688b = interfaceC5872l02;
                this.f45689c = localThemeScope;
                this.f45690d = interfaceC5872l03;
                this.f45691e = interfaceC5870k0;
                this.f45692f = z1Var;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                b(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC5870k0 interfaceC5870k0, long j10) {
                C5747t.M(interfaceC5870k0, j10);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: an.t$g$b */
        static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f45693a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AdManagerAdView f45694b;

            b(LocalThemeScope localThemeScope, AdManagerAdView adManagerAdView) {
                this.f45693a = localThemeScope;
                this.f45694b = adManagerAdView;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1404216217, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:193)");
                }
                C5747t.t(this.f45693a, this.f45694b, composer, LocalThemeScope.f17314g);
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
        @SourceDebugExtension
        /* renamed from: an.t$g$c */
        static final class c implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<ProductListDecorator> f45695a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Pp.b f45696b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AdManagerAdView f45697c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AdManagerAdView f45698d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CartProductListDecorator f45699e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f45700f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<InterfaceC17146a, Unit> f45701g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<ProductListDecorator, Unit> f45702h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1<ProductListDecorator, Unit> f45703i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f45704j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function1<ProductListDecorator, Unit> f45705k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function1<ProductListDecorator, Unit> f45706l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ boolean f45707m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f45708n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f45709o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ boolean f45710p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ boolean f45711q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f45712r;

            /* JADX WARN: Multi-variable type inference failed */
            c(List<ProductListDecorator> list, Pp.b bVar, AdManagerAdView adManagerAdView, AdManagerAdView adManagerAdView2, CartProductListDecorator cartProductListDecorator, LocalThemeScope localThemeScope, Function1<? super InterfaceC17146a, Unit> function1, Function1<? super ProductListDecorator, Unit> function12, Function1<? super ProductListDecorator, Unit> function13, Function0<Unit> function0, Function1<? super ProductListDecorator, Unit> function14, Function1<? super ProductListDecorator, Unit> function15, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, InterfaceC5868j0 interfaceC5868j0) {
                this.f45695a = list;
                this.f45696b = bVar;
                this.f45697c = adManagerAdView;
                this.f45698d = adManagerAdView2;
                this.f45699e = cartProductListDecorator;
                this.f45700f = localThemeScope;
                this.f45701g = function1;
                this.f45702h = function12;
                this.f45703i = function13;
                this.f45704j = function0;
                this.f45705k = function14;
                this.f45706l = function15;
                this.f45707m = z10;
                this.f45708n = z11;
                this.f45709o = z12;
                this.f45710p = z13;
                this.f45711q = z14;
                this.f45712r = interfaceC5868j0;
            }

            public final void e(InterfaceC15433c items, int i10, Composer composer, int i11) {
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
                    ComposerKt.U(4049183, i15, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:199)");
                }
                final ProductListDecorator productListDecorator = this.f45695a.get(i10);
                boolean z12 = true;
                if (!productListDecorator.getIsOutOfStock() || CollectionsKt.p(Pp.b.f26240c, Pp.b.f26241d).contains(this.f45696b)) {
                    z12 = false;
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierA = InterfaceC15433c.a(items, companion2, null, null, null, 7, null);
                CartProductListDecorator cartProductListDecorator = this.f45699e;
                LocalThemeScope localThemeScope = this.f45700f;
                Function1<InterfaceC17146a, Unit> function1 = this.f45701g;
                final Function1<ProductListDecorator, Unit> function12 = this.f45702h;
                final Function1<ProductListDecorator, Unit> function13 = this.f45703i;
                Function0<Unit> function0 = this.f45704j;
                final Function1<ProductListDecorator, Unit> function14 = this.f45705k;
                final Function1<ProductListDecorator, Unit> function15 = this.f45706l;
                Pp.b bVar = this.f45696b;
                boolean z13 = this.f45707m;
                boolean z14 = this.f45708n;
                boolean z15 = this.f45709o;
                boolean z16 = this.f45710p;
                boolean z17 = this.f45711q;
                List<ProductListDecorator> list2 = this.f45695a;
                C5800d c5800d = C5800d.f48779a;
                C5800d.m mVarH = c5800d.h();
                e.Companion companion3 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion3.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierA);
                InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion4.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion4.e());
                D1.c(composerA, interfaceC5884sR, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion4.f());
                C14903g c14903g = C14903g.f139698a;
                ProductCardDecorator productCardDecoratorV = productListDecorator.V();
                boolean z18 = productListDecorator.getCoupon() != null;
                CouponCountDownStateDecorator couponCountDownStateDecorator = productListDecorator.getCouponCountDownStateDecorator();
                ClippableCouponDecorator clippableCouponDecoratorB = couponCountDownStateDecorator != null ? couponCountDownStateDecorator.b() : null;
                Double dValueOf = productListDecorator.getProduct().getMaxOrderQuantity() != null ? Double.valueOf(r8.intValue()) : null;
                double dDoubleValue = 2.147483647E9d;
                if (dValueOf == null) {
                    productCardDecorator = productCardDecoratorV;
                    z10 = z18;
                } else {
                    productCardDecorator = productCardDecoratorV;
                    z10 = z18;
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
                    objB = new Function0() { // from class: an.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5747t.g.c.f(function12, productListDecorator);
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
                    objB2 = new Function0() { // from class: an.A
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5747t.g.c.g(function13, productListDecorator);
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
                    objB3 = new Function0() { // from class: an.B
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5747t.g.c.k(function14, productListDecorator);
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
                    objB4 = new Function0() { // from class: an.C
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5747t.g.c.l(function15, productListDecorator);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                int i16 = LocalThemeScope.f17314g;
                List<ProductListDecorator> list3 = list;
                ss.v.C(localThemeScope, productCardDecorator, i10, function1, z10, clippableCouponDecoratorB, function02, function03, function0, dDoubleValue, z12, function04, (Function0) objB4, bVar, isSelected, zR, z11, z13, false, 0, z14, z15, z16, z17, null, composer, ((i15 << 3) & 896) | (ProductCardDecorator.f163361E << 3) | i16 | (ClippableCouponDecorator.f13970c << 15), 0, 0, 8781824);
                composer.startReplaceGroup(1582818577);
                if (i10 < CollectionsKt.o(list3)) {
                    C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composer, 384, 9);
                }
                composer.P();
                composer.v();
                composer.startReplaceGroup(-403617761);
                if (i10 != C5747t.J(this.f45712r) || (adManagerAdView2 = this.f45697c) == null) {
                    companion = companion2;
                    i13 = i16;
                    i14 = 0;
                } else {
                    LocalThemeScope localThemeScope2 = this.f45700f;
                    companion = companion2;
                    Modifier modifierA2 = InterfaceC15433c.a(items, companion, null, null, null, 7, null);
                    i14 = 0;
                    MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion3.k(), composer, 0);
                    int iA2 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR2 = composer.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierA2);
                    Function0<InterfaceC5953g> function0A2 = companion4.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A2);
                    } else {
                        composer.s();
                    }
                    Composer composerA2 = D1.a(composer);
                    D1.c(composerA2, measurePolicyA2, companion4.e());
                    D1.c(composerA2, interfaceC5884sR2, companion4.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
                    if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                        composerA2.t(Integer.valueOf(iA2));
                        composerA2.n(Integer.valueOf(iA2), function2B2);
                    }
                    D1.c(composerA2, modifierE2, companion4.f());
                    i13 = i16;
                    C5747t.t(localThemeScope2, adManagerAdView2, composer, i13);
                    composer.v();
                    Unit unit = Unit.f143329a;
                }
                composer.P();
                if (this.f45695a.size() > 17 && i10 == 17 && (adManagerAdView = this.f45698d) != null) {
                    LocalThemeScope localThemeScope3 = this.f45700f;
                    Modifier modifierA3 = InterfaceC15433c.a(items, companion, null, null, null, 7, null);
                    MeasurePolicy measurePolicyA3 = C5807k.a(c5800d.h(), companion3.k(), composer, i14);
                    int iA3 = C5859f.a(composer, i14);
                    InterfaceC5884s interfaceC5884sR3 = composer.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierA3);
                    Function0<InterfaceC5953g> function0A3 = companion4.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A3);
                    } else {
                        composer.s();
                    }
                    Composer composerA3 = D1.a(composer);
                    D1.c(composerA3, measurePolicyA3, companion4.e());
                    D1.c(composerA3, interfaceC5884sR3, companion4.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion4.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    D1.c(composerA3, modifierE3, companion4.f());
                    C5747t.t(localThemeScope3, adManagerAdView, composer, i13);
                    composer.v();
                    Unit unit2 = Unit.f143329a;
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
                e(interfaceC15433c, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function1 function1, ProductListDecorator productListDecorator) {
                function1.invoke(productListDecorator);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function1 function1, ProductListDecorator productListDecorator) {
                function1.invoke(productListDecorator);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(Function1 function1, ProductListDecorator productListDecorator) {
                function1.invoke(productListDecorator);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(Function1 function1, ProductListDecorator productListDecorator) {
                function1.invoke(productListDecorator);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: an.t$g$d */
        static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f45713a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: an.t$g$d$a */
            static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f45714a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: an.t$g$d$a$a, reason: collision with other inner class name */
                static final class C0962a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f45715a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14898b f45716b;

                    C0962a(LocalThemeScope localThemeScope, InterfaceC14898b interfaceC14898b) {
                        this.f45715a = localThemeScope;
                        this.f45716b = interfaceC14898b;
                    }

                    public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(1808145138, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:264)");
                        }
                        Ci.m.f(this.f45715a, this.f45716b.g(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), P0.e.INSTANCE.e()), Assemble.getLoading().getSmallLoading(), Ci.o.f4629a, null, false, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Small.f142357f << 6), 56);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                        a(interfaceC15154X, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                a(LocalThemeScope localThemeScope) {
                    this.f45714a = localThemeScope;
                }

                public final void a(InterfaceC15433c AnimationBox, Composer composer, int i10) {
                    Intrinsics.j(AnimationBox, "$this$AnimationBox");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(79148029, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:262)");
                    }
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f45714a;
                    MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                    InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyG, companion.e());
                    D1.c(composerA, interfaceC5884sR, companion.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion.f());
                    Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(1808145138, true, new C0962a(localThemeScope, C5806j.f48836a), composer, 54), composer, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
                    composer.v();
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

            d(LocalThemeScope localThemeScope) {
                this.f45713a = localThemeScope;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(item) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-205834968, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductListCompose.kt:261)");
                }
                C5747t.q(item, null, null, ComposableLambdaKt.c(79148029, true, new a(this.f45713a), composer, 54), composer, (i10 & 14) | 3072, 3);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(boolean z10, AdManagerAdView adManagerAdView, List list, boolean z11, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, LocalThemeScope localThemeScope, InterfaceC5872l0 interfaceC5872l03, InterfaceC5870k0 interfaceC5870k0, z1 z1Var, Pp.b bVar, AdManagerAdView adManagerAdView2, AdManagerAdView adManagerAdView3, CartProductListDecorator cartProductListDecorator, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function1 function15, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, InterfaceC5868j0 interfaceC5868j0, l0.w LazyColumn) {
            LocalThemeScope localThemeScope2;
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            if (z10) {
                localThemeScope2 = localThemeScope;
                l0.w.g(LazyColumn, "videoAd", null, ComposableLambdaKt.composableLambdaInstance(460341041, true, new a(interfaceC5872l0, interfaceC5872l02, localThemeScope, interfaceC5872l03, interfaceC5870k0, z1Var)), 2, null);
            } else {
                localThemeScope2 = localThemeScope;
                if (adManagerAdView != null) {
                    l0.w.g(LazyColumn, "adSlot1", null, ComposableLambdaKt.composableLambdaInstance(-1404216217, true, new b(localThemeScope2, adManagerAdView)), 2, null);
                }
            }
            LocalThemeScope localThemeScope3 = localThemeScope2;
            l0.w.b(LazyColumn, list.size(), null, null, ComposableLambdaKt.composableLambdaInstance(4049183, true, new c(list, bVar, adManagerAdView2, adManagerAdView3, cartProductListDecorator, localThemeScope3, function1, function12, function13, function0, function14, function15, z12, z13, z14, z15, z16, interfaceC5868j0)), 6, null);
            if (z11) {
                l0.w.g(LazyColumn, "loading", null, ComposableLambdaKt.composableLambdaInstance(-205834968, true, new d(localThemeScope3)), 2, null);
            }
            return Unit.f143329a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(C15429A c15429a, boolean z10, InterfaceC5870k0 interfaceC5870k0, AdManagerAdView adManagerAdView, List<ProductListDecorator> list, Pp.b bVar, CartProductListDecorator cartProductListDecorator, Function1<? super InterfaceC17146a, Unit> function1, Function1<? super ProductListDecorator, Unit> function12, Function1<? super ProductListDecorator, Unit> function13, Function0<Unit> function0, Function1<? super ProductListDecorator, Unit> function14, Function1<? super ProductListDecorator, Unit> function15, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, AdManagerAdView adManagerAdView2, AdManagerAdView adManagerAdView3, boolean z16, InterfaceC5868j0 interfaceC5868j0) {
            this.f45665a = c15429a;
            this.f45666b = z10;
            this.f45667c = interfaceC5870k0;
            this.f45668d = adManagerAdView;
            this.f45669e = list;
            this.f45670f = bVar;
            this.f45671g = cartProductListDecorator;
            this.f45672h = function1;
            this.f45673i = function12;
            this.f45674j = function13;
            this.f45675k = function0;
            this.f45676l = function14;
            this.f45677m = function15;
            this.f45678n = z11;
            this.f45679o = z12;
            this.f45680p = z13;
            this.f45681q = z14;
            this.f45682r = z15;
            this.f45683s = adManagerAdView2;
            this.f45684t = adManagerAdView3;
            this.f45685u = z16;
            this.f45686v = interfaceC5868j0;
        }

        public final void d(final LocalThemeScope AnimationBox, Composer composer, int i10) {
            int i11;
            Context context;
            InterfaceC5870k0 interfaceC5870k0;
            InterfaceC5872l0 interfaceC5872l0;
            InterfaceC5872l0 interfaceC5872l02;
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
                ComposerKt.U(-2089396341, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductListCompose.<anonymous> (ProductListCompose.kt:128)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = C18370z.c(companion, false, 1, null);
            final C15429A c15429a = this.f45665a;
            final boolean z10 = this.f45666b;
            final InterfaceC5870k0 interfaceC5870k02 = this.f45667c;
            final AdManagerAdView adManagerAdView = this.f45668d;
            final List<ProductListDecorator> list = this.f45669e;
            int i12 = i11;
            final Pp.b bVar = this.f45670f;
            final CartProductListDecorator cartProductListDecorator = this.f45671g;
            final Function1<InterfaceC17146a, Unit> function1 = this.f45672h;
            final Function1<ProductListDecorator, Unit> function12 = this.f45673i;
            final Function1<ProductListDecorator, Unit> function13 = this.f45674j;
            final Function0<Unit> function0 = this.f45675k;
            final Function1<ProductListDecorator, Unit> function14 = this.f45676l;
            final Function1<ProductListDecorator, Unit> function15 = this.f45677m;
            final boolean z11 = this.f45678n;
            final boolean z12 = this.f45679o;
            final boolean z13 = this.f45680p;
            final boolean z14 = this.f45681q;
            final boolean z15 = this.f45682r;
            final AdManagerAdView adManagerAdView2 = this.f45683s;
            final AdManagerAdView adManagerAdView3 = this.f45684t;
            final boolean z16 = this.f45685u;
            final InterfaceC5868j0 interfaceC5868j0 = this.f45686v;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
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
                objB2 = new gi.k(context2, str);
                composer.t(objB2);
            }
            gi.k kVar = (gi.k) objB2;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion3.a()) {
                context = context2;
                InterfaceC5872l0 interfaceC5872l0E = t1.e(null, null, 2, null);
                composer.t(interfaceC5872l0E);
                objB3 = interfaceC5872l0E;
            } else {
                context = context2;
            }
            final InterfaceC5872l0 interfaceC5872l03 = (InterfaceC5872l0) objB3;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion3.a()) {
                objB4 = f1.a(0L);
                composer.t(objB4);
            }
            InterfaceC5870k0 interfaceC5870k03 = (InterfaceC5870k0) objB4;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB5 = composer.B();
            if (objB5 == companion3.a()) {
                interfaceC5870k0 = interfaceC5870k03;
                objB5 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB5);
            } else {
                interfaceC5870k0 = interfaceC5870k03;
            }
            InterfaceC5872l0 interfaceC5872l04 = (InterfaceC5872l0) objB5;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB6 = composer.B();
            if (objB6 == companion3.a()) {
                interfaceC5872l0 = interfaceC5872l04;
                objB6 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB6);
            } else {
                interfaceC5872l0 = interfaceC5872l04;
            }
            InterfaceC5872l0 interfaceC5872l05 = (InterfaceC5872l0) objB6;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB7 = composer.B();
            if (objB7 == companion3.a()) {
                interfaceC5872l02 = interfaceC5872l05;
                objB7 = t1.e(Boolean.TRUE, null, 2, null);
                composer.t(objB7);
            } else {
                interfaceC5872l02 = interfaceC5872l05;
            }
            final InterfaceC5872l0 interfaceC5872l06 = (InterfaceC5872l0) objB7;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB8 = composer.B();
            if (objB8 == companion3.a()) {
                objB8 = o1.e(new Function0() { // from class: an.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(C5747t.g.g(c15429a));
                    }
                });
                composer.t(objB8);
            }
            final z1 z1Var = (z1) objB8;
            composer.P();
            int i13 = i12 & 14;
            int i14 = 14380032 | LocalThemeScope.f17314g | i13 | (gi.k.f134267e << 6);
            sr.p.F(AnimationBox, context, kVar, interfaceC5872l03, interfaceC5870k0, interfaceC5872l0, interfaceC5872l02, interfaceC5872l06, composer, i14);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            composer.startReplaceGroup(-1224400529);
            boolean zA = composer.a(z10) | composer.V(interfaceC5870k02) | (i13 == 4 || ((i12 & 8) != 0 && composer.D(AnimationBox))) | composer.D(adManagerAdView) | composer.D(list) | composer.d(bVar.ordinal()) | composer.D(cartProductListDecorator) | composer.V(function1) | composer.V(function12) | composer.V(function13) | composer.V(function0) | composer.V(function14) | composer.V(function15) | composer.a(z11) | composer.a(z12) | composer.a(z13) | composer.a(z14) | composer.a(z15) | composer.D(adManagerAdView2) | composer.D(adManagerAdView3) | composer.a(z16);
            Object objB9 = composer.B();
            if (zA || objB9 == companion3.a()) {
                composer2 = composer;
                final InterfaceC5872l0 interfaceC5872l07 = interfaceC5872l02;
                obj = new Function1() { // from class: an.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C5747t.g.f(z10, adManagerAdView, list, z16, interfaceC5872l07, interfaceC5872l03, AnimationBox, interfaceC5872l06, interfaceC5870k02, z1Var, bVar, adManagerAdView2, adManagerAdView3, cartProductListDecorator, function1, function12, function13, function0, function14, function15, z11, z12, z13, z14, z15, interfaceC5868j0, (l0.w) obj2);
                    }
                };
                composer2.t(obj);
            } else {
                obj = objB9;
                composer2 = composer;
            }
            composer2.P();
            C15432b.a(modifierH, c15429a, null, false, null, null, null, false, null, (Function1) obj, composer2, 6, 508);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            d(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(z1<Boolean> z1Var) {
            return z1Var.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(C15429A c15429a) {
            Object next;
            Iterator<T> it = c15429a.x().h().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.e(((InterfaceC15439i) next).getKey(), "videoAd")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC15439i interfaceC15439i = (InterfaceC15439i) next;
            if (interfaceC15439i != null && interfaceC15439i.getOffset() >= 0 && interfaceC15439i.getOffset() + interfaceC15439i.getSize() <= c15429a.x().getViewportEndOffset()) {
                return true;
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductListComposeKt$ProductListCompose$5$1", f = "ProductListCompose.kt", l = {283}, m = "invokeSuspend")
    /* renamed from: an.t$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f45717a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f45718b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15429A f45719c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z10, C15429A c15429a, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f45718b = z10;
            this.f45719c = c15429a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.f45718b, this.f45719c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f45717a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f45718b) {
                    C15429A c15429a = this.f45719c;
                    int totalItemsCount = c15429a.x().getTotalItemsCount();
                    this.f45717a = 1;
                    if (C15429A.l(c15429a, totalItemsCount, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(final Ki.LocalThemeScope r36, final java.util.List<vs.ProductListDecorator> r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, kotlin.jvm.functions.Function1<? super ss.InterfaceC17146a, kotlin.Unit> r39, final kotlin.jvm.functions.Function1<? super vs.ProductListDecorator, kotlin.Unit> r40, final kotlin.jvm.functions.Function1<? super vs.ProductListDecorator, kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super vs.ProductListDecorator, kotlin.Unit> r42, Pp.b r43, final kotlin.jvm.functions.Function1<? super vs.ProductListDecorator, kotlin.Unit> r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, vs.CartProductListDecorator r46, boolean r47, l0.C15429A r48, com.google.android.gms.ads.admanager.AdManagerAdView r49, com.google.android.gms.ads.admanager.AdManagerAdView r50, com.google.android.gms.ads.admanager.AdManagerAdView r51, final boolean r52, final boolean r53, final boolean r54, boolean r55, boolean r56, boolean r57, androidx.compose.runtime.Composer r58, final int r59, final int r60, final int r61, final int r62) {
        /*
            Method dump skipped, instructions count: 1540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an.C5747t.G(Ki.M, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, Pp.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, vs.b, boolean, l0.A, com.google.android.gms.ads.admanager.AdManagerAdView, com.google.android.gms.ads.admanager.AdManagerAdView, com.google.android.gms.ads.admanager.AdManagerAdView, boolean, boolean, boolean, boolean, boolean, boolean, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, List list, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Pp.b bVar, Function1 function15, Function0 function02, CartProductListDecorator cartProductListDecorator, boolean z10, C15429A c15429a, AdManagerAdView adManagerAdView, AdManagerAdView adManagerAdView2, AdManagerAdView adManagerAdView3, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, int i11, int i12, int i13, Composer composer, int i14) {
        G(localThemeScope, list, function0, function1, function12, function13, function14, bVar, function15, function02, cartProductListDecorator, z10, c15429a, adManagerAdView, adManagerAdView2, adManagerAdView3, z11, z12, z13, z14, z15, z16, composer, J0.a(i10 | 1), J0.a(i11), J0.a(i12), i13);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, List list, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Pp.b bVar, Function1 function15, Function0 function02, CartProductListDecorator cartProductListDecorator, boolean z10, C15429A c15429a, AdManagerAdView adManagerAdView, AdManagerAdView adManagerAdView2, AdManagerAdView adManagerAdView3, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, int i11, int i12, int i13, Composer composer, int i14) {
        G(localThemeScope, list, function0, function1, function12, function13, function14, bVar, function15, function02, cartProductListDecorator, z10, c15429a, adManagerAdView, adManagerAdView2, adManagerAdView3, z11, z12, z13, z14, z15, z16, composer, J0.a(i10 | 1), J0.a(i11), J0.a(i12), i13);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(C15429A c15429a, Function0 function0, int i10, Composer composer, int i11) {
        z(c15429a, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void C(final C15429A lazyListState, final List<ProductListDecorator> products, Function1<? super InterfaceC17146a, Unit> function1, final boolean z10, Composer composer, final int i10, final int i11) {
        int i12;
        final Function1<? super InterfaceC17146a, Unit> function12;
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
                ComposerKt.U(-142735684, i12, -1, "com.meijer.mobile.meijer.activity.find.fragment.OnViewBeacon (ProductListCompose.kt:460)");
            }
            if (z10) {
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                T0 t0L = composerStartRestartGroup.l();
                if (t0L != null) {
                    t0L.a(new Function2() { // from class: an.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C5747t.D(lazyListState, products, function12, z10, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
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
                objB = o1.e(new Function0() { // from class: an.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5747t.E(lazyListState);
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
            t0L2.a(new Function2() { // from class: an.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5747t.F(lazyListState, products, function12, z10, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(C15429A c15429a, List list, Function1 function1, boolean z10, int i10, int i11, Composer composer, int i12) {
        C(c15429a, list, function1, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List E(C15429A c15429a) {
        List<InterfaceC15439i> listV = V(c15429a, 50.0f);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listV, 10));
        Iterator<T> it = listV.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((InterfaceC15439i) it.next()).getIndex()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(C15429A c15429a, List list, Function1 function1, boolean z10, int i10, int i11, Composer composer, int i12) {
        C(c15429a, list, function1, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5870k0 K() {
        return f1.a(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final LocalThemeScope localThemeScope, final Modifier modifier, final ExoPlayer exoPlayer, final boolean z10, final long j10, final InterfaceC5872l0<Boolean> interfaceC5872l0, final Function1<? super Long, Unit> function1, Composer composer, final int i10) {
        int i11;
        Modifier modifier2;
        ExoPlayer exoPlayer2;
        boolean z11;
        long j11;
        InterfaceC5872l0<Boolean> interfaceC5872l02;
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
            interfaceC5872l02 = interfaceC5872l0;
            i11 |= composerStartRestartGroup.V(interfaceC5872l02) ? 131072 : 65536;
        } else {
            interfaceC5872l02 = interfaceC5872l0;
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
                ComposerKt.U(1022104563, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.VideoAdItem (ProductListCompose.kt:340)");
            }
            sr.p.J(localThemeScope, modifier2, exoPlayer2, z11, j11, interfaceC5872l02, function12, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14) | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (i11 & 3670016));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: an.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5747t.P(localThemeScope, modifier, exoPlayer, z10, j10, interfaceC5872l0, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(LocalThemeScope localThemeScope, Modifier modifier, ExoPlayer exoPlayer, boolean z10, long j10, InterfaceC5872l0 interfaceC5872l0, Function1 function1, int i10, Composer composer, int i11) {
        O(localThemeScope, modifier, exoPlayer, z10, j10, interfaceC5872l0, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final float U(C15429A c15429a, InterfaceC15439i info) {
        Intrinsics.j(c15429a, "<this>");
        Intrinsics.j(info, "info");
        return Math.max(0.0f, 100.0f - (((Math.max(0, c15429a.x().getViewportStartOffset() - info.getOffset()) + Math.max(0, (info.getOffset() + info.getSize()) - c15429a.x().getViewportEndOffset())) * 100.0f) / info.getSize()));
    }

    public static final List<InterfaceC15439i> V(C15429A c15429a, float f10) {
        Intrinsics.j(c15429a, "<this>");
        List<InterfaceC15439i> listH = c15429a.x().h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (U(c15429a, (InterfaceC15439i) obj) >= f10) {
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
        throw new UnsupportedOperationException("Method not decompiled: an.C5747t.q(java.lang.Object, androidx.compose.animation.h, androidx.compose.animation.j, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i10) {
        return i10 / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Object obj, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, Function3 function3, int i10, int i11, Composer composer, int i12) {
        q(obj, hVar, jVar, function3, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
                ComposerKt.U(-1185707481, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.GoogleAdView (ProductListCompose.kt:305)");
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
                    objB2 = new Function1() { // from class: an.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C5747t.u(adManagerAdView2, (androidx.compose.runtime.F) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                composerStartRestartGroup.P();
                androidx.compose.runtime.J.c(adManagerAdView2, (Function1) objB2, composerStartRestartGroup, 0);
                sr.p.o(localThemeScope, null, adManagerAdView2, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14), 1);
                C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composerStartRestartGroup, 384, 9);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: an.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5747t.v(localThemeScope, adManagerAdView, i10, (Composer) obj, ((Integer) obj2).intValue());
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
        return Unit.f143329a;
    }

    public static final void w(final C15429A c15429a, final Function0<Unit> loadMore, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(c15429a, "<this>");
        Intrinsics.j(loadMore, "loadMore");
        Composer composerStartRestartGroup = composer.startRestartGroup(-685001903);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(c15429a) ? 4 : 2) | i10;
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
                ComposerKt.U(-685001903, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.OnBottomReached (ProductListCompose.kt:495)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = o1.e(new Function0() { // from class: an.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(C5747t.x(c15429a));
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
            t0L.a(new Function2() { // from class: an.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5747t.y(c15429a, loadMore, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(C15429A c15429a, Function0 function0, int i10, Composer composer, int i11) {
        w(c15429a, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(C15429A c15429a) {
        return c15429a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long L(InterfaceC5870k0 interfaceC5870k0) {
        return interfaceC5870k0.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(InterfaceC5870k0 interfaceC5870k0, long j10) {
        interfaceC5870k0.I(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(C15429A c15429a) {
        InterfaceC15439i interfaceC15439i = (InterfaceC15439i) CollectionsKt.F0(c15429a.x().h());
        if (interfaceC15439i == null || interfaceC15439i.getIndex() == c15429a.x().getTotalItemsCount() - 1) {
            return true;
        }
        return false;
    }

    private static final void z(final C15429A c15429a, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1388264371);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(c15429a)) {
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
                ComposerKt.U(1388264371, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.OnScroll (ProductListCompose.kt:294)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = o1.e(new Function0() { // from class: an.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(C5747t.A(c15429a));
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
            t0L.a(new Function2() { // from class: an.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5747t.B(c15429a, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
