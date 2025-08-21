package com.meijer.mobile.meijer.activity.personalized.modals;

import Co.ProductFullDetails;
import Ho.ProductSponsorship;
import Ho.SponsoredData;
import Hr.ClippableCouponDecorator;
import Hr.CouponCountDownStateDecorator;
import Ki.LocalThemeScope;
import Nn.t3;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.meijer.mobile.meijer.activity.personalized.modals.C12622w0;
import com.meijer.mobile.meijer.activity.personalized.modals.e1;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import j0.C14903g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ku.AbstractC15424a;
import mv.InterfaceC15783O;
import ss.InterfaceC17146a;
import ts.ProductCardDecorator;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bí\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001c\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010$J'\u0010(\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J%\u0010.\u001a\u00020\t*\u00020\u00032\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,H\u0003¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020&H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00022\u0006\u00106\u001a\u000205H\u0014¢\u0006\u0004\b7\u00108J\u001b\u0010;\u001a\u00020\u001c2\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0016¢\u0006\u0004\b;\u0010<J\u001d\u0010?\u001a\u0004\u0018\u00010>2\n\u0010=\u001a\u0006\u0012\u0002\b\u000309H\u0016¢\u0006\u0004\b?\u0010@J-\u0010C\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020>0AH\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u0004\u0018\u00010*2\u0006\u0010G\u001a\u00020\u001fH\u0007¢\u0006\u0004\bH\u0010IJ\u001d\u0010L\u001a\u00020\t2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u001d\u0010N\u001a\u00020\t2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00020JH\u0016¢\u0006\u0004\bN\u0010MR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010[R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\\R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010]R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010aR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010aR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010aR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010ZR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010ZR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010(R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010(R\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010iR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010iR\u0014\u0010m\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010(R#\u0010t\u001a\u000e\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020*0n8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010w¨\u0006y"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/w0;", "Lku/a;", "LNn/t3;", "LKi/M;", "localThemeScope", "Lvs/f;", "item", "Lkotlin/Function1;", "Lss/a;", "", "productCardAction", "Lzl/k;", "featureManager", "LPp/b;", "searchType", "Lvs/b;", "itemToSubstitute", "LHo/a;", "getSponsorship", "Lkotlin/Function0;", "clipCouponAction", "viewCouponDetail", "onCollapseQtyStepper", "onStepperClicked", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "onCriteoBeaconsAction", "Lgi/a;", "onGoogleAdClicked", "", "stepperClickedState", "isFavOnSale", "Lgi/d;", "googleAdSlot1", "googleAdSlot2", "googleAdSlot3", "<init>", "(LKi/M;Lvs/f;Lkotlin/jvm/functions/Function1;Lzl/k;LPp/b;Lvs/b;LHo/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLgi/d;Lgi/d;Lgi/d;)V", "viewBinding", "", "position", "Z", "(LKi/M;LNn/t3;I)V", "Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "adManagerView", "Landroidx/compose/ui/Modifier;", "modifier", "C", "(LKi/M;Lcom/google/android/gms/ads/admanager/AdManagerAdView;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "i", "()J", "j", "()I", "Landroid/view/View;", "view", "d0", "(Landroid/view/View;)LNn/t3;", "Lju/h;", "other", "m", "(Lju/h;)Z", "newItem", "", "h", "(Lju/h;)Ljava/lang/Object;", "", "payloads", "Y", "(LNn/t3;ILjava/util/List;)V", "X", "(LNn/t3;I)V", "adData", "b0", "(Lgi/d;Landroidx/compose/runtime/Composer;I)Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "Lku/b;", "viewHolder", "e0", "(Lku/b;)V", "f0", "e", "LKi/M;", "getLocalThemeScope", "()LKi/M;", "f", "Lvs/f;", "a0", "()Lvs/f;", "setItem", "(Lvs/f;)V", "g", "Lkotlin/jvm/functions/Function1;", "Lzl/k;", "LPp/b;", "Lvs/b;", "k", "LHo/a;", "l", "Lkotlin/jvm/functions/Function0;", "n", "o", "p", "q", "r", "s", "t", "Lgi/d;", "u", "v", "w", "isInSelectionMode", "", "", "x", "Ljava/util/Map;", "getAdViewCache", "()Ljava/util/Map;", "adViewCache", "", "c0", "()D", "validMaxAllowedQuantity", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.w0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12622w0 extends AbstractC15424a<t3> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ProductListDecorator item;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC17146a, Unit> productCardAction;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Pp.b searchType;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final CartProductListDecorator itemToSubstitute;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ProductSponsorship getSponsorship;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> clipCouponAction;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> viewCouponDetail;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onCollapseQtyStepper;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onStepperClicked;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Function1<e1.AbstractC12581j, Unit> onCriteoBeaconsAction;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Function1<GoogleAdAnalytics, Unit> onGoogleAdClicked;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean stepperClickedState;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isFavOnSale;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final GoogleAdData googleAdSlot1;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final GoogleAdData googleAdSlot2;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final GoogleAdData googleAdSlot3;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final boolean isInSelectionMode;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Map<String, AdManagerAdView> adViewCache;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductListItemCompose$GoogleAds$1$1", f = "ProductListItemCompose.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.w0$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112430a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f112431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdManagerAdView adManagerAdView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f112431b = adManagerAdView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f112431b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ViewGroup viewGroup;
            IntrinsicsKt.f();
            if (this.f112430a == 0) {
                ResultKt.b(obj);
                ViewParent parent = this.f112431b.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(this.f112431b);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/meijer/mobile/meijer/activity/personalized/modals/w0$b", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.w0$b */
    public static final class b implements androidx.compose.runtime.E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f112432a;

        public b(AdManagerAdView adManagerAdView) {
            this.f112432a = adManagerAdView;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            ViewParent parent = this.f112432a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f112432a);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.w0$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112433a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12622w0 f112434b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f112435c;

        c(LocalThemeScope localThemeScope, C12622w0 c12622w0, int i10) {
            this.f112433a = localThemeScope;
            this.f112434b = c12622w0;
            this.f112435c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(C12622w0 c12622w0, SponsoredData criteoSponsoredData) {
            Intrinsics.j(criteoSponsoredData, "criteoSponsoredData");
            Function1 function1 = c12622w0.onCriteoBeaconsAction;
            List<String> listE = criteoSponsoredData.e();
            Ul.a aVar = Ul.a.f37568d;
            ProductFullDetails product = c12622w0.getItem().getProduct();
            if (!product.getIsSponsoredCriteo()) {
                product = null;
            }
            function1.invoke(new e1.AbstractC12581j.SendCriteoClickBeacon(listE, "", aVar, product));
            return Unit.f143329a;
        }

        public final void e(Composer composer, int i10) {
            LocalThemeScope localThemeScope;
            boolean z10;
            GoogleAdData googleAdData;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-149777462, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.ProductListItemCompose.bindCartData.<anonymous> (ProductListItemCompose.kt:181)");
            }
            LocalThemeScope localThemeScope2 = this.f112433a;
            final C12622w0 c12622w0 = this.f112434b;
            int i11 = this.f112435c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            int i12 = c12622w0.isFavOnSale ? i11 - 1 : i11;
            boolean z11 = c12622w0.isFavOnSale;
            composer.startReplaceGroup(-1033551105);
            if (i11 == z11 && (googleAdData = c12622w0.googleAdSlot1) != null) {
                AdManagerAdView adManagerAdViewB0 = c12622w0.b0(googleAdData, composer, GoogleAdData.f134248f);
                composer.startReplaceGroup(-1033546658);
                if (adManagerAdViewB0 != null) {
                    c12622w0.C(localThemeScope2, adManagerAdViewB0, null, composer, LocalThemeScope.f17314g, 2);
                    Unit unit = Unit.f143329a;
                }
                composer.P();
            }
            composer.P();
            int i13 = i12 + 1;
            if (i13 == 9) {
                composer.startReplaceGroup(-1033538314);
                GoogleAdData googleAdData2 = c12622w0.googleAdSlot2;
                if (googleAdData2 != null) {
                    AdManagerAdView adManagerAdViewB02 = c12622w0.b0(googleAdData2, composer, GoogleAdData.f134248f);
                    composer.startReplaceGroup(-1033534650);
                    if (adManagerAdViewB02 != null) {
                        c12622w0.C(localThemeScope2, adManagerAdViewB02, null, composer, LocalThemeScope.f17314g, 2);
                        Unit unit2 = Unit.f143329a;
                    }
                    composer.P();
                }
                composer.P();
                Unit unit3 = Unit.f143329a;
            } else if (i13 != 18) {
                composer.startReplaceGroup(-1974272077);
                composer.P();
                Unit unit4 = Unit.f143329a;
            } else {
                composer.startReplaceGroup(-1033527370);
                GoogleAdData googleAdData3 = c12622w0.googleAdSlot3;
                if (googleAdData3 != null) {
                    AdManagerAdView adManagerAdViewB03 = c12622w0.b0(googleAdData3, composer, GoogleAdData.f134248f);
                    composer.startReplaceGroup(-1033523706);
                    if (adManagerAdViewB03 != null) {
                        c12622w0.C(localThemeScope2, adManagerAdViewB03, null, composer, LocalThemeScope.f17314g, 2);
                        Unit unit5 = Unit.f143329a;
                    }
                    composer.P();
                }
                composer.P();
                Unit unit6 = Unit.f143329a;
            }
            ProductCardDecorator productCardDecoratorV = c12622w0.getItem().V();
            Function1 function1 = c12622w0.productCardAction;
            boolean z12 = c12622w0.getItem().getCoupon() != null;
            CouponCountDownStateDecorator couponCountDownStateDecorator = c12622w0.getItem().getCouponCountDownStateDecorator();
            ClippableCouponDecorator clippableCouponDecoratorB = couponCountDownStateDecorator != null ? couponCountDownStateDecorator.b() : null;
            Function0 function0 = c12622w0.clipCouponAction;
            Function0 function02 = c12622w0.viewCouponDetail;
            boolean z13 = z12;
            ClippableCouponDecorator clippableCouponDecorator = clippableCouponDecoratorB;
            double dC0 = c12622w0.c0();
            if (!c12622w0.getItem().getIsOutOfStock() || c12622w0.isInSelectionMode) {
                localThemeScope = localThemeScope2;
                z10 = false;
            } else {
                localThemeScope = localThemeScope2;
                z10 = true;
            }
            boolean isSelected = c12622w0.getItem().getIsSelected();
            boolean zR = c12622w0.getItem().R(c12622w0.itemToSubstitute);
            LocalThemeScope localThemeScope3 = localThemeScope;
            Pp.b bVar = c12622w0.searchType;
            boolean z14 = c12622w0.getSponsorship != null;
            boolean zE = c12622w0.featureManager.e(AbstractC18503f.C18509g.f172878h);
            boolean zE2 = c12622w0.featureManager.e(AbstractC18503f.k0.f172887h);
            boolean zE3 = c12622w0.featureManager.e(AbstractC18503f.l0.f172889h);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(c12622w0);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.x0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12622w0.c.k(c12622w0);
                    }
                };
                composer.t(objB);
            }
            Function0 function03 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(c12622w0);
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.y0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12622w0.c.l(c12622w0);
                    }
                };
                composer.t(objB2);
            }
            Function0 function04 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD3 = composer.D(c12622w0);
            Object objB3 = composer.B();
            if (zD3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.z0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12622w0.c.f(c12622w0);
                    }
                };
                composer.t(objB3);
            }
            Function0 function05 = (Function0) objB3;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD4 = composer.D(c12622w0);
            Object objB4 = composer.B();
            if (zD4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.A0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12622w0.c.g(c12622w0, (SponsoredData) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            ss.v.C(localThemeScope3, productCardDecoratorV, i11, function1, z13, clippableCouponDecorator, function0, function02, function03, dC0, z10, function04, function05, bVar, isSelected, zR, z14, zE, false, 0, zE2, zE3, false, false, (Function1) objB4, composer, LocalThemeScope.f17314g | (ProductCardDecorator.f163361E << 3) | (ClippableCouponDecorator.f13970c << 15), 0, 0, 6684672);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            e(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(C12622w0 c12622w0) {
            c12622w0.onStepperClicked.invoke();
            c12622w0.stepperClickedState = true;
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(C12622w0 c12622w0) {
            c12622w0.onCollapseQtyStepper.invoke();
            c12622w0.stepperClickedState = false;
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(C12622w0 c12622w0) {
            Function1 function1 = c12622w0.productCardAction;
            if (function1 != null) {
                function1.invoke(new InterfaceC17146a.FindSimilarItems(c12622w0.getItem().getProduct()));
            }
            return Unit.f143329a;
        }
    }

    public /* synthetic */ C12622w0(LocalThemeScope localThemeScope, ProductListDecorator productListDecorator, Function1 function1, zl.k kVar, Pp.b bVar, CartProductListDecorator cartProductListDecorator, ProductSponsorship productSponsorship, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function12, Function1 function13, boolean z10, boolean z11, GoogleAdData googleAdData, GoogleAdData googleAdData2, GoogleAdData googleAdData3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(localThemeScope, productListDecorator, (i10 & 4) != 0 ? null : function1, kVar, (i10 & 16) != 0 ? Pp.b.f26238a : bVar, (i10 & 32) != 0 ? null : cartProductListDecorator, productSponsorship, function0, function02, function03, function04, function12, function13, z10, (i10 & 16384) != 0 ? false : z11, (32768 & i10) != 0 ? null : googleAdData, (65536 & i10) != 0 ? null : googleAdData2, (i10 & 131072) != 0 ? null : googleAdData3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(final Ki.LocalThemeScope r18, final com.google.android.gms.ads.admanager.AdManagerAdView r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.C12622w0.C(Ki.M, com.google.android.gms.ads.admanager.AdManagerAdView, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(C12622w0 c12622w0, LocalThemeScope localThemeScope, AdManagerAdView adManagerAdView, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        c12622w0.C(localThemeScope, adManagerAdView, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.E E(AdManagerAdView adManagerAdView, androidx.compose.runtime.F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        qw.a.INSTANCE.z("GoogleAdsDebug").a("DisposableEffect for adUnitId: " + adManagerAdView.getAdUnitId(), new Object[0]);
        return new b(adManagerAdView);
    }

    private final void Z(LocalThemeScope localThemeScope, t3 viewBinding, int position) {
        viewBinding.f22322A.setContent(ComposableLambdaKt.composableLambdaInstance(-149777462, true, new c(localThemeScope, this, position)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double c0() {
        Double dValueOf = this.item.getProduct().getMaxOrderQuantity() != null ? Double.valueOf(r0.intValue()) : null;
        if (dValueOf == null || Intrinsics.b(dValueOf, 0.0d)) {
            return 2.147483647E9d;
        }
        Double dValueOf2 = this.item.getProduct().getMaxOrderQuantity() != null ? Double.valueOf(r0.intValue()) : null;
        Intrinsics.g(dValueOf2);
        return dValueOf2.doubleValue();
    }

    @Override // ku.AbstractC15424a
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void u(t3 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        Z(this.localThemeScope, viewBinding, position);
    }

    @Override // ku.AbstractC15424a
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void v(t3 viewBinding, int position, List<Object> payloads) {
        Parcelable parcelable;
        Intrinsics.j(viewBinding, "viewBinding");
        Intrinsics.j(payloads, "payloads");
        List<Object> list = !payloads.isEmpty() ? payloads : null;
        if (list != null) {
            Object obj = list.get(0);
            Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
            if (bundle != null) {
                if (bundle.containsKey("CART_ENTRY_UPDATE")) {
                    ProductListDecorator productListDecorator = this.item;
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) bundle.getParcelable("CART_ENTRY_UPDATE", ProductListDecorator.CartEntryDecorator.class);
                    } else {
                        Object parcelable2 = bundle.getParcelable("CART_ENTRY_UPDATE");
                        parcelable = (ProductListDecorator.CartEntryDecorator) (parcelable2 instanceof ProductListDecorator.CartEntryDecorator ? parcelable2 : null);
                    }
                    ProductListDecorator.CartEntryDecorator cartEntryDecorator = (ProductListDecorator.CartEntryDecorator) parcelable;
                    this.item = productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : cartEntryDecorator == null ? new ProductListDecorator.CartEntryDecorator(0, 0.0d, 0.0d, 7, null) : cartEntryDecorator, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : false, ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : false, ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null);
                    Z(this.localThemeScope, viewBinding, position);
                } else {
                    Z(this.localThemeScope, viewBinding, position);
                }
                obj = Unit.f143329a;
            }
            if (obj != null) {
                return;
            }
        }
        super.v(viewBinding, position, payloads);
    }

    /* renamed from: a0, reason: from getter */
    public final ProductListDecorator getItem() {
        return this.item;
    }

    public final AdManagerAdView b0(GoogleAdData adData, Composer composer, int i10) {
        Composer composer2;
        Intrinsics.j(adData, "adData");
        composer.startReplaceGroup(-1684884567);
        if (ComposerKt.M()) {
            ComposerKt.U(-1684884567, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.ProductListItemCompose.getOrCreateAdView (ProductListItemCompose.kt:265)");
        }
        Map<String, AdManagerAdView> map = this.adViewCache;
        String adUnitId = adData.getAdUnitId();
        AdManagerAdView adManagerAdViewS = map.get(adUnitId);
        if (adManagerAdViewS == null) {
            qw.a.INSTANCE.z("GoogleAdsDebug").a("Creating new AdManagerAdView for adUnitId: " + adData.getAdUnitId(), new Object[0]);
            composer2 = composer;
            adManagerAdViewS = sr.p.S(adData, this.onGoogleAdClicked, null, composer2, GoogleAdData.f134248f | (i10 & 14), 4);
            if (adManagerAdViewS == null) {
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer2.P();
                return null;
            }
            map.put(adUnitId, adManagerAdViewS);
        } else {
            composer2 = composer;
        }
        AdManagerAdView adManagerAdView = adManagerAdViewS;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer2.P();
        return adManagerAdView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public t3 z(View view) {
        Intrinsics.j(view, "view");
        t3 t3VarM0 = t3.M0(view);
        Intrinsics.i(t3VarM0, "bind(...)");
        return t3VarM0;
    }

    @Override // ju.h
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void r(ku.b<t3> viewHolder) {
        Function1<InterfaceC17146a, Unit> function1;
        Intrinsics.j(viewHolder, "viewHolder");
        super.r(viewHolder);
        ProductSponsorship productSponsorship = this.getSponsorship;
        if (productSponsorship != null && productSponsorship.getSponsorSource() == Ho.b.f13875c && (function1 = this.productCardAction) != null) {
            function1.invoke(new InterfaceC17146a.SendCriteoOnViewBeacon(this.item.getProduct().getBeaconInfo().g(), this.item.getProduct().getBeaconInfo().getFormatLevelOnViewBeacon()));
        }
        if (!this.item.getProduct().getIsSponsoredCriteo() || this.stepperClickedState) {
            return;
        }
        Function1<e1.AbstractC12581j, Unit> function12 = this.onCriteoBeaconsAction;
        List<String> listG = this.item.getProduct().getBeaconInfo().g();
        String formatLevelOnViewBeacon = this.item.getProduct().getBeaconInfo().getFormatLevelOnViewBeacon();
        Ul.a aVar = Ul.a.f37567c;
        ProductFullDetails product = this.item.getProduct();
        if (!product.getIsSponsoredCriteo()) {
            product = null;
        }
        function12.invoke(new e1.AbstractC12581j.SendCriteoViewBeacon(listG, formatLevelOnViewBeacon, aVar, product));
    }

    @Override // ju.h
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void s(ku.b<t3> viewHolder) {
        Intrinsics.j(viewHolder, "viewHolder");
        super.s(viewHolder);
        if (viewHolder.getLayoutPosition() == 5 && this.item.getProduct().getIsSponsoredCriteo()) {
            this.stepperClickedState = false;
        }
    }

    @Override // ju.h
    public Object h(ju.h<?> newItem) {
        Intrinsics.j(newItem, "newItem");
        ProductListDecorator productListDecorator = ((C12622w0) newItem).item;
        Bundle bundle = new Bundle();
        if (!Intrinsics.e(this.item.getShoppingListItem(), productListDecorator.getShoppingListItem())) {
            bundle.putParcelable("SHOPPING_LIST_UPDATE", productListDecorator.getShoppingListItem());
        } else if (!Intrinsics.e(this.item.getCartEntry(), productListDecorator.getCartEntry()) || !Intrinsics.e(this.item.getCouponCountDownStateDecorator(), productListDecorator.getCouponCountDownStateDecorator())) {
            bundle.putParcelable("CART_ENTRY_UPDATE", productListDecorator.getCartEntry());
        } else if (this.item.getInQtyStepperInteraction() != productListDecorator.getInQtyStepperInteraction()) {
            bundle.putBoolean("QUANTITY_STEPPER_UPDATE", productListDecorator.getInQtyStepperInteraction());
        } else if (this.item.getResetStepperState() != productListDecorator.getResetStepperState()) {
            bundle.putBoolean("QUANTITY_STEPPER_RESET", productListDecorator.getResetStepperState());
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    @Override // ju.h
    public long i() {
        return this.item.getUpc().hashCode();
    }

    @Override // ju.h
    /* renamed from: j */
    public int getLayoutId() {
        return com.meijer.mobile.meijer.V.f100269q1;
    }

    @Override // ju.h
    public boolean m(ju.h<?> other) {
        Intrinsics.j(other, "other");
        if (other instanceof C12622w0) {
            return Intrinsics.e(((C12622w0) other).item, this.item);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12622w0(LocalThemeScope localThemeScope, ProductListDecorator item, Function1<? super InterfaceC17146a, Unit> function1, zl.k featureManager, Pp.b searchType, CartProductListDecorator cartProductListDecorator, ProductSponsorship productSponsorship, Function0<Unit> clipCouponAction, Function0<Unit> viewCouponDetail, Function0<Unit> onCollapseQtyStepper, Function0<Unit> onStepperClicked, Function1<? super e1.AbstractC12581j, Unit> onCriteoBeaconsAction, Function1<? super GoogleAdAnalytics, Unit> onGoogleAdClicked, boolean z10, boolean z11, GoogleAdData googleAdData, GoogleAdData googleAdData2, GoogleAdData googleAdData3) {
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(item, "item");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(searchType, "searchType");
        Intrinsics.j(clipCouponAction, "clipCouponAction");
        Intrinsics.j(viewCouponDetail, "viewCouponDetail");
        Intrinsics.j(onCollapseQtyStepper, "onCollapseQtyStepper");
        Intrinsics.j(onStepperClicked, "onStepperClicked");
        Intrinsics.j(onCriteoBeaconsAction, "onCriteoBeaconsAction");
        Intrinsics.j(onGoogleAdClicked, "onGoogleAdClicked");
        this.localThemeScope = localThemeScope;
        this.item = item;
        this.productCardAction = function1;
        this.featureManager = featureManager;
        this.searchType = searchType;
        this.itemToSubstitute = cartProductListDecorator;
        this.getSponsorship = productSponsorship;
        this.clipCouponAction = clipCouponAction;
        this.viewCouponDetail = viewCouponDetail;
        this.onCollapseQtyStepper = onCollapseQtyStepper;
        this.onStepperClicked = onStepperClicked;
        this.onCriteoBeaconsAction = onCriteoBeaconsAction;
        this.onGoogleAdClicked = onGoogleAdClicked;
        this.stepperClickedState = z10;
        this.isFavOnSale = z11;
        this.googleAdSlot1 = googleAdData;
        this.googleAdSlot2 = googleAdData2;
        this.googleAdSlot3 = googleAdData3;
        this.isInSelectionMode = CollectionsKt.p(Pp.b.f26240c, Pp.b.f26241d).contains(searchType);
        this.adViewCache = new LinkedHashMap();
    }
}
