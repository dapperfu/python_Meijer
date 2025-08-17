package com.meijer.mobile.coupon.list;

import Ok.Coupon;
import Pk.a;
import Rk.CouponOptions;
import Xk.CouponState;
import Xk.v;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import androidx.view.c0;
import androidx.view.d0;
import cl.C6412d;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupons.api.models.AddOfferErrorType;
import com.meijer.mobile.coupons.domain.models.CouponException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.CouponsResponse;
import fi.C13902c;
import fi.C13904e;
import fi.EnumC13905f;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0092\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004qokmBC\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010#\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b#\u0010$J#\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J \u0010.\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/J \u00102\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0018\u0010:\u001a\u00020\u00142\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020\u00142\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\b<\u0010;J\u0018\u0010>\u001a\u00020\u00142\u0006\u00101\u001a\u00020=H\u0082@¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0014H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001fH\u0002¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0014H\u0082@¢\u0006\u0004\bF\u0010\u0016J\u0010\u0010G\u001a\u00020\u0014H\u0082@¢\u0006\u0004\bG\u0010\u0016J\u0019\u0010J\u001a\u00020\u00142\b\u0010I\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020\u00142\u0006\u0010L\u001a\u00020'2\u0006\u0010M\u001a\u00020'H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00142\u0006\u0010P\u001a\u00020'H\u0002¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\u0014¢\u0006\u0004\bS\u0010AJ\u0017\u0010V\u001a\u00020\u00142\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ9\u0010[\u001a\u00020!2\u0006\u0010C\u001a\u00020\u001f2\u001a\u0010Z\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010H0Xj\n\u0012\u0006\u0012\u0004\u0018\u00010H`Y2\u0006\u0010B\u001a\u00020\u001d¢\u0006\u0004\b[\u0010\\J\u0015\u0010^\u001a\u00020\u00142\u0006\u0010]\u001a\u00020!¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020\u00142\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020\u00142\u0006\u0010a\u001a\u00020dH\u0016¢\u0006\u0004\be\u0010fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020v0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020{0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\"\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020{0\u007f8\u0006¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R7\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u0002040\u0085\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u0012\u0005\b\u008c\u0001\u0010A\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020v0\u008e\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0093\u0001"}, d2 = {"Lcom/meijer/mobile/coupon/list/M;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "Lyo/k;", "userManager", "Lhl/m;", "cartRepository", "Lcl/d;", "couponsRepository", "LXk/v;", "multiChannelCouponStateRepository", "LTq/j;", "storeProvider", "Lgi/a;", "analyticsEngine", "Lqv/K;", "ioDispatcher", "<init>", "(Lyo/k;Lhl/m;Lcl/d;LXk/v;LTq/j;Lgi/a;Lqv/K;)V", "", "D", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "couponPageType", "", "LXk/c;", "couponStateList", "S", "(Ljava/lang/Object;Ljava/util/List;)V", "LPk/c;", "pageType", "LRk/a;", "couponOption", "", "requiresSpecialOffersUrl", "C", "(LPk/c;LRk/a;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfi/f;", "gamAds", "", "adSlotPosition", "Lfi/d;", "G", "(Lfi/f;I)Lfi/d;", "Ldl/a;", "couponsResponse", "R", "(LPk/c;Ldl/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "exception", "Q", "(LPk/c;Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LOk/c;", "couponIdentity", "T", "(LOk/c;)V", "LOk/a;", "coupon", "A", "(LOk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "N", "Lcom/meijer/mobile/coupons/domain/models/CouponException;", "M", "(Lcom/meijer/mobile/coupons/domain/models/CouponException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "K", "()V", "couponPage", "newCouponOptions", "W", "(LPk/c;LRk/a;)V", "B", "E", "", "specialOffersBannerURL", "O", "(Ljava/lang/String;)V", "index", "offset", "V", "(II)V", "count", "U", "(I)V", "J", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "filterCategories", "P", "(LRk/a;Ljava/util/ArrayList;LPk/c;)Z", "isLoading", "X", "(Z)V", "Lcom/meijer/mobile/coupon/list/M$c;", "action", "L", "(Lcom/meijer/mobile/coupon/list/M$c;)V", "LPk/a;", "onAction", "(LPk/a;)V", "a", "Lyo/k;", "b", "Lhl/m;", "c", "Lcl/d;", "d", "LXk/v;", "e", "LTq/j;", "f", "Lgi/a;", "g", "Lqv/K;", "Ltv/B;", "Lcom/meijer/mobile/coupon/list/M$f;", "h", "Ltv/B;", "_couponListStateFlow", "Ltv/A;", "Lcom/meijer/mobile/coupon/list/M$e;", "i", "Ltv/A;", "_eventFlow", "Ltv/F;", "j", "Ltv/F;", "I", "()Ltv/F;", "eventFlow", "", "k", "Ljava/util/List;", "getUpdatedCouponList$coupon_release", "()Ljava/util/List;", "setUpdatedCouponList$coupon_release", "(Ljava/util/List;)V", "getUpdatedCouponList$coupon_release$annotations", "updatedCouponList", "Ltv/P;", "F", "()Ltv/P;", "couponListStateFlow", "l", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class M extends c0 implements InterfaceC6015f {

    /* renamed from: m, reason: collision with root package name */
    public static final int f96598m = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C6412d couponsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Xk.v multiChannelCouponStateRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _couponListStateFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<e> _eventFlow;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<e> eventFlow;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<Ok.c> updatedCouponList;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltv/g;", "", "LXk/c;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$1$1", f = "CouponListTabsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function3<InterfaceC17153g<? super List<? extends CouponState>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96610a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f96611b;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super List<CouponState>> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            a aVar = new a(continuation);
            aVar.f96611b = th2;
            return aVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f96610a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f96611b, "Error fetching coupon state", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$c;", "", "<init>", "()V", "b", "d", "c", "a", "Lcom/meijer/mobile/coupon/list/M$c$a;", "Lcom/meijer/mobile/coupon/list/M$c$b;", "Lcom/meijer/mobile/coupon/list/M$c$c;", "Lcom/meijer/mobile/coupon/list/M$c$d;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$c$a;", "Lcom/meijer/mobile/coupon/list/M$c;", "Lfi/a;", "analytics", "<init>", "(Lfi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfi/a;", "()Lfi/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.M$c$a, reason: from toString */
        public static final /* data */ class GoogleAdClicked extends c {

            /* renamed from: b, reason: collision with root package name */
            public static final int f96616b = GoogleAdAnalytics.f131141f;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final GoogleAdAnalytics analytics;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoogleAdClicked) && Intrinsics.e(this.analytics, ((GoogleAdClicked) other).analytics);
            }

            public int hashCode() {
                return this.analytics.hashCode();
            }

            public String toString() {
                return "GoogleAdClicked(analytics=" + this.analytics + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoogleAdClicked(GoogleAdAnalytics analytics) {
                super(null);
                Intrinsics.j(analytics, "analytics");
                this.analytics = analytics;
            }

            /* renamed from: a, reason: from getter */
            public final GoogleAdAnalytics getAnalytics() {
                return this.analytics;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$c$b;", "Lcom/meijer/mobile/coupon/list/M$c;", "", "isRetry", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.M$c$b, reason: from toString */
        public static final /* data */ class RefreshCoupons extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isRetry;

            public RefreshCoupons(boolean z10) {
                super(null);
                this.isRetry = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RefreshCoupons) && this.isRetry == ((RefreshCoupons) other).isRetry;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isRetry);
            }

            public String toString() {
                return "RefreshCoupons(isRetry=" + this.isRetry + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsRetry() {
                return this.isRetry;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$c$c;", "Lcom/meijer/mobile/coupon/list/M$c;", "", "count", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.M$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class SavePreviousItemCount extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int count;

            public SavePreviousItemCount(int i10) {
                super(null);
                this.count = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SavePreviousItemCount) && this.count == ((SavePreviousItemCount) other).count;
            }

            public int hashCode() {
                return Integer.hashCode(this.count);
            }

            public String toString() {
                return "SavePreviousItemCount(count=" + this.count + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getCount() {
                return this.count;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$c$d;", "Lcom/meijer/mobile/coupon/list/M$c;", "", "index", "offset", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.M$c$d, reason: from toString */
        public static final /* data */ class SaveScrollPosition extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int index;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int offset;

            public SaveScrollPosition(int i10, int i11) {
                super(null);
                this.index = i10;
                this.offset = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SaveScrollPosition)) {
                    return false;
                }
                SaveScrollPosition saveScrollPosition = (SaveScrollPosition) other;
                return this.index == saveScrollPosition.index && this.offset == saveScrollPosition.offset;
            }

            public int hashCode() {
                return (Integer.hashCode(this.index) * 31) + Integer.hashCode(this.offset);
            }

            public String toString() {
                return "SaveScrollPosition(index=" + this.index + ", offset=" + this.offset + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            /* renamed from: b, reason: from getter */
            public final int getOffset() {
                return this.offset;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$e;", "", "<init>", "()V", "e", "b", "d", "a", "c", "Lcom/meijer/mobile/coupon/list/M$e$a;", "Lcom/meijer/mobile/coupon/list/M$e$b;", "Lcom/meijer/mobile/coupon/list/M$e$c;", "Lcom/meijer/mobile/coupon/list/M$e$d;", "Lcom/meijer/mobile/coupon/list/M$e$e;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$e$a;", "Lcom/meijer/mobile/coupon/list/M$e;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.M$e$a, reason: from toString */
        public static final /* data */ class RequiresLoginEvent extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public RequiresLoginEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RequiresLoginEvent) && this.messageResId == ((RequiresLoginEvent) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "RequiresLoginEvent(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$e$b;", "Lcom/meijer/mobile/coupon/list/M$e;", "", "titleResId", "LOk/a;", "coupon", "<init>", "(ILOk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "LOk/a;", "()LOk/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.M$e$b, reason: from toString */
        public static final /* data */ class ShowClipCouponErrorSnackBar extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int titleResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Coupon coupon;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowClipCouponErrorSnackBar)) {
                    return false;
                }
                ShowClipCouponErrorSnackBar showClipCouponErrorSnackBar = (ShowClipCouponErrorSnackBar) other;
                return this.titleResId == showClipCouponErrorSnackBar.titleResId && Intrinsics.e(this.coupon, showClipCouponErrorSnackBar.coupon);
            }

            public int hashCode() {
                return (Integer.hashCode(this.titleResId) * 31) + this.coupon.hashCode();
            }

            public String toString() {
                return "ShowClipCouponErrorSnackBar(titleResId=" + this.titleResId + ", coupon=" + this.coupon + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowClipCouponErrorSnackBar(int i10, Coupon coupon) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.titleResId = i10;
                this.coupon = coupon;
            }

            /* renamed from: a, reason: from getter */
            public final Coupon getCoupon() {
                return this.coupon;
            }

            /* renamed from: b, reason: from getter */
            public final int getTitleResId() {
                return this.titleResId;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$e$c;", "Lcom/meijer/mobile/coupon/list/M$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final c f96625a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1764413694;
            }

            public String toString() {
                return "ShowClipLimitReachedSnackBar";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$e$d;", "Lcom/meijer/mobile/coupon/list/M$e;", "LOk/a;", "coupon", "<init>", "(LOk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOk/a;", "()LOk/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.M$e$d, reason: from toString */
        public static final /* data */ class ShowCouponClippedSnackBar extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Coupon coupon;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowCouponClippedSnackBar) && Intrinsics.e(this.coupon, ((ShowCouponClippedSnackBar) other).coupon);
            }

            public int hashCode() {
                return this.coupon.hashCode();
            }

            public String toString() {
                return "ShowCouponClippedSnackBar(coupon=" + this.coupon + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowCouponClippedSnackBar(Coupon coupon) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.coupon = coupon;
            }

            /* renamed from: a, reason: from getter */
            public final Coupon getCoupon() {
                return this.coupon;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$e$e;", "Lcom/meijer/mobile/coupon/list/M$e;", "", "titleResId", "messageResId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.M$e$e, reason: collision with other inner class name and from toString */
        public static final /* data */ class ShowErrorAlert extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int titleResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public ShowErrorAlert(int i10, int i11) {
                super(null);
                this.titleResId = i10;
                this.messageResId = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowErrorAlert)) {
                    return false;
                }
                ShowErrorAlert showErrorAlert = (ShowErrorAlert) other;
                return this.titleResId == showErrorAlert.titleResId && this.messageResId == showErrorAlert.messageResId;
            }

            public int hashCode() {
                return (Integer.hashCode(this.titleResId) * 31) + Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "ShowErrorAlert(titleResId=" + this.titleResId + ", messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: b, reason: from getter */
            public final int getTitleResId() {
                return this.titleResId;
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012Jr\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b'\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b\"\u0010,R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b%\u0010,R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b-\u0010/¨\u00060"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$f;", "", "", "isCouponsLoading", "isFetchCouponsFailed", "", "firstVisibleIndex", "firstVisibleItemScrollOffset", "previousItemCount", "Lcom/meijer/mobile/coupon/list/J;", "couponListTabsDecorator", "LRk/a;", "availableTabCouponOptions", "clippedTabCouponOptions", "", "Lfi/d;", "googleAdSlots", "<init>", "(ZZIIILcom/meijer/mobile/coupon/list/J;LRk/a;LRk/a;Ljava/util/List;)V", "a", "(ZZIIILcom/meijer/mobile/coupon/list/J;LRk/a;LRk/a;Ljava/util/List;)Lcom/meijer/mobile/coupon/list/M$f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "j", "()Z", "b", "k", "c", "I", "f", "d", "g", "e", "i", "Lcom/meijer/mobile/coupon/list/J;", "()Lcom/meijer/mobile/coupon/list/J;", "LRk/a;", "()LRk/a;", "h", "Ljava/util/List;", "()Ljava/util/List;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.list.M$f, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCouponsLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFetchCouponsFailed;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int firstVisibleIndex;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int firstVisibleItemScrollOffset;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int previousItemCount;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponListTabsDecorator couponListTabsDecorator;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponOptions availableTabCouponOptions;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponOptions clippedTabCouponOptions;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<GoogleAdData> googleAdSlots;

        public ViewState() {
            this(false, false, 0, 0, 0, null, null, null, null, 511, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.isCouponsLoading == viewState.isCouponsLoading && this.isFetchCouponsFailed == viewState.isFetchCouponsFailed && this.firstVisibleIndex == viewState.firstVisibleIndex && this.firstVisibleItemScrollOffset == viewState.firstVisibleItemScrollOffset && this.previousItemCount == viewState.previousItemCount && Intrinsics.e(this.couponListTabsDecorator, viewState.couponListTabsDecorator) && Intrinsics.e(this.availableTabCouponOptions, viewState.availableTabCouponOptions) && Intrinsics.e(this.clippedTabCouponOptions, viewState.clippedTabCouponOptions) && Intrinsics.e(this.googleAdSlots, viewState.googleAdSlots);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((Boolean.hashCode(this.isCouponsLoading) * 31) + Boolean.hashCode(this.isFetchCouponsFailed)) * 31) + Integer.hashCode(this.firstVisibleIndex)) * 31) + Integer.hashCode(this.firstVisibleItemScrollOffset)) * 31) + Integer.hashCode(this.previousItemCount)) * 31) + this.couponListTabsDecorator.hashCode()) * 31) + this.availableTabCouponOptions.hashCode()) * 31) + this.clippedTabCouponOptions.hashCode()) * 31;
            List<GoogleAdData> list = this.googleAdSlots;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "ViewState(isCouponsLoading=" + this.isCouponsLoading + ", isFetchCouponsFailed=" + this.isFetchCouponsFailed + ", firstVisibleIndex=" + this.firstVisibleIndex + ", firstVisibleItemScrollOffset=" + this.firstVisibleItemScrollOffset + ", previousItemCount=" + this.previousItemCount + ", couponListTabsDecorator=" + this.couponListTabsDecorator + ", availableTabCouponOptions=" + this.availableTabCouponOptions + ", clippedTabCouponOptions=" + this.clippedTabCouponOptions + ", googleAdSlots=" + this.googleAdSlots + ')';
        }

        public ViewState(boolean z10, boolean z11, int i10, int i11, int i12, CouponListTabsDecorator couponListTabsDecorator, CouponOptions availableTabCouponOptions, CouponOptions clippedTabCouponOptions, List<GoogleAdData> list) {
            Intrinsics.j(couponListTabsDecorator, "couponListTabsDecorator");
            Intrinsics.j(availableTabCouponOptions, "availableTabCouponOptions");
            Intrinsics.j(clippedTabCouponOptions, "clippedTabCouponOptions");
            this.isCouponsLoading = z10;
            this.isFetchCouponsFailed = z11;
            this.firstVisibleIndex = i10;
            this.firstVisibleItemScrollOffset = i11;
            this.previousItemCount = i12;
            this.couponListTabsDecorator = couponListTabsDecorator;
            this.availableTabCouponOptions = availableTabCouponOptions;
            this.clippedTabCouponOptions = clippedTabCouponOptions;
            this.googleAdSlots = list;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, boolean z10, boolean z11, int i10, int i11, int i12, CouponListTabsDecorator couponListTabsDecorator, CouponOptions couponOptions, CouponOptions couponOptions2, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z10 = viewState.isCouponsLoading;
            }
            if ((i13 & 2) != 0) {
                z11 = viewState.isFetchCouponsFailed;
            }
            if ((i13 & 4) != 0) {
                i10 = viewState.firstVisibleIndex;
            }
            if ((i13 & 8) != 0) {
                i11 = viewState.firstVisibleItemScrollOffset;
            }
            if ((i13 & 16) != 0) {
                i12 = viewState.previousItemCount;
            }
            if ((i13 & 32) != 0) {
                couponListTabsDecorator = viewState.couponListTabsDecorator;
            }
            if ((i13 & 64) != 0) {
                couponOptions = viewState.availableTabCouponOptions;
            }
            if ((i13 & 128) != 0) {
                couponOptions2 = viewState.clippedTabCouponOptions;
            }
            if ((i13 & 256) != 0) {
                list = viewState.googleAdSlots;
            }
            CouponOptions couponOptions3 = couponOptions2;
            List list2 = list;
            CouponListTabsDecorator couponListTabsDecorator2 = couponListTabsDecorator;
            CouponOptions couponOptions4 = couponOptions;
            int i14 = i12;
            int i15 = i10;
            return viewState.a(z10, z11, i15, i11, i14, couponListTabsDecorator2, couponOptions4, couponOptions3, list2);
        }

        public final ViewState a(boolean isCouponsLoading, boolean isFetchCouponsFailed, int firstVisibleIndex, int firstVisibleItemScrollOffset, int previousItemCount, CouponListTabsDecorator couponListTabsDecorator, CouponOptions availableTabCouponOptions, CouponOptions clippedTabCouponOptions, List<GoogleAdData> googleAdSlots) {
            Intrinsics.j(couponListTabsDecorator, "couponListTabsDecorator");
            Intrinsics.j(availableTabCouponOptions, "availableTabCouponOptions");
            Intrinsics.j(clippedTabCouponOptions, "clippedTabCouponOptions");
            return new ViewState(isCouponsLoading, isFetchCouponsFailed, firstVisibleIndex, firstVisibleItemScrollOffset, previousItemCount, couponListTabsDecorator, availableTabCouponOptions, clippedTabCouponOptions, googleAdSlots);
        }

        /* renamed from: c, reason: from getter */
        public final CouponOptions getAvailableTabCouponOptions() {
            return this.availableTabCouponOptions;
        }

        /* renamed from: d, reason: from getter */
        public final CouponOptions getClippedTabCouponOptions() {
            return this.clippedTabCouponOptions;
        }

        /* renamed from: e, reason: from getter */
        public final CouponListTabsDecorator getCouponListTabsDecorator() {
            return this.couponListTabsDecorator;
        }

        /* renamed from: f, reason: from getter */
        public final int getFirstVisibleIndex() {
            return this.firstVisibleIndex;
        }

        /* renamed from: g, reason: from getter */
        public final int getFirstVisibleItemScrollOffset() {
            return this.firstVisibleItemScrollOffset;
        }

        public final List<GoogleAdData> h() {
            return this.googleAdSlots;
        }

        /* renamed from: i, reason: from getter */
        public final int getPreviousItemCount() {
            return this.previousItemCount;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getIsCouponsLoading() {
            return this.isCouponsLoading;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getIsFetchCouponsFailed() {
            return this.isFetchCouponsFailed;
        }

        public /* synthetic */ ViewState(boolean z10, boolean z11, int i10, int i11, int i12, CouponListTabsDecorator couponListTabsDecorator, CouponOptions couponOptions, CouponOptions couponOptions2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? false : z11, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) == 0 ? i12 : 0, (i13 & 32) != 0 ? new CouponListTabsDecorator(false, 0, 0, 0, 0, 0, null, null, null, false, null, 2047, null) : couponListTabsDecorator, (i13 & 64) != 0 ? new CouponOptions(null, null, null, false, false, 0L, null, null, false, null, null, false, false, 8167, null) : couponOptions, (i13 & 128) != 0 ? new CouponOptions(null, null, null, true, true, 0L, null, null, false, null, null, false, false, 8167, null) : couponOptions2, (i13 & 256) != 0 ? null : list);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel", f = "CouponListTabsViewModel.kt", l = {296, 298, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES}, m = "clipCoupon")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f96638a;

        /* renamed from: b, reason: collision with root package name */
        Object f96639b;

        /* renamed from: c, reason: collision with root package name */
        Object f96640c;

        /* renamed from: d, reason: collision with root package name */
        Object f96641d;

        /* renamed from: e, reason: collision with root package name */
        Object f96642e;

        /* renamed from: f, reason: collision with root package name */
        int f96643f;

        /* renamed from: g, reason: collision with root package name */
        int f96644g;

        /* renamed from: h, reason: collision with root package name */
        int f96645h;

        /* renamed from: i, reason: collision with root package name */
        int f96646i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f96647j;

        /* renamed from: l, reason: collision with root package name */
        int f96649l;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96647j = obj;
            this.f96649l |= Integer.MIN_VALUE;
            return M.this.A(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel", f = "CouponListTabsViewModel.kt", l = {455}, m = "fetchCouponAds")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f96650a;

        /* renamed from: b, reason: collision with root package name */
        Object f96651b;

        /* renamed from: c, reason: collision with root package name */
        Object f96652c;

        /* renamed from: d, reason: collision with root package name */
        Object f96653d;

        /* renamed from: e, reason: collision with root package name */
        int f96654e;

        /* renamed from: f, reason: collision with root package name */
        int f96655f;

        /* renamed from: g, reason: collision with root package name */
        int f96656g;

        /* renamed from: h, reason: collision with root package name */
        int f96657h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f96658i;

        /* renamed from: k, reason: collision with root package name */
        int f96660k;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96658i = obj;
            this.f96660k |= Integer.MIN_VALUE;
            return M.this.B(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel", f = "CouponListTabsViewModel.kt", l = {108, 115}, m = "fetchCoupons")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f96661a;

        /* renamed from: c, reason: collision with root package name */
        int f96663c;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96661a = obj;
            this.f96663c |= Integer.MIN_VALUE;
            return M.this.D(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel", f = "CouponListTabsViewModel.kt", l = {159, 162, 168, 170}, m = "fetchCoupons")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f96664a;

        /* renamed from: b, reason: collision with root package name */
        Object f96665b;

        /* renamed from: c, reason: collision with root package name */
        Object f96666c;

        /* renamed from: d, reason: collision with root package name */
        Object f96667d;

        /* renamed from: e, reason: collision with root package name */
        Object f96668e;

        /* renamed from: f, reason: collision with root package name */
        Object f96669f;

        /* renamed from: g, reason: collision with root package name */
        boolean f96670g;

        /* renamed from: h, reason: collision with root package name */
        int f96671h;

        /* renamed from: i, reason: collision with root package name */
        int f96672i;

        /* renamed from: j, reason: collision with root package name */
        int f96673j;

        /* renamed from: k, reason: collision with root package name */
        int f96674k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f96675l;

        /* renamed from: n, reason: collision with root package name */
        int f96677n;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96675l = obj;
            this.f96677n |= Integer.MIN_VALUE;
            return M.this.C(null, null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel", f = "CouponListTabsViewModel.kt", l = {471}, m = "fetchSpecialOffers")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f96678a;

        /* renamed from: b, reason: collision with root package name */
        Object f96679b;

        /* renamed from: c, reason: collision with root package name */
        Object f96680c;

        /* renamed from: d, reason: collision with root package name */
        Object f96681d;

        /* renamed from: e, reason: collision with root package name */
        int f96682e;

        /* renamed from: f, reason: collision with root package name */
        int f96683f;

        /* renamed from: g, reason: collision with root package name */
        int f96684g;

        /* renamed from: h, reason: collision with root package name */
        int f96685h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f96686i;

        /* renamed from: k, reason: collision with root package name */
        int f96688k;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96686i = obj;
            this.f96688k |= Integer.MIN_VALUE;
            return M.this.E(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "itemCount", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$observeCartCount$1", f = "CouponListTabsViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96689a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ int f96690b;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = M.this.new l(continuation);
            lVar.f96690b = ((Number) obj).intValue();
            return lVar;
        }

        public final Object d(int i10, Continuation<? super Unit> continuation) {
            return ((l) create(Integer.valueOf(i10), continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return d(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f96689a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            int i10 = this.f96690b;
            InterfaceC17140B interfaceC17140B = M.this._couponListStateFlow;
            M m10 = M.this;
            while (true) {
                Object value = interfaceC17140B.getValue();
                ViewState viewState = (ViewState) value;
                M m11 = m10;
                if (interfaceC17140B.e(value, ViewState.b(viewState, false, false, 0, 0, 0, CouponListTabsDecorator.b(viewState.getCouponListTabsDecorator(), m11.storeProvider.d(), i10, 0, 0, 0, 0, null, null, null, false, null, 2044, null), null, null, null, 479, null))) {
                    return Unit.f142422a;
                }
                m10 = m11;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "", "", "e", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$observeCartCount$2", f = "CouponListTabsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function3<InterfaceC17153g<? super Integer>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96692a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f96693b;

        m(Continuation<? super m> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super Integer> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            m mVar = new m(continuation);
            mVar.f96693b = th2;
            return mVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f96692a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f96693b, "Error observing cart item count", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$onAction$1", f = "CouponListTabsViewModel.kt", l = {511}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96694a;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return M.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96694a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                M m10 = M.this;
                this.f96694a = 1;
                if (m10.D(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$onAction$2", f = "CouponListTabsViewModel.kt", l = {576}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96696a;

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return M.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96696a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = M.this._eventFlow;
                e.RequiresLoginEvent requiresLoginEvent = new e.RequiresLoginEvent(Nr.g.f22750p);
                this.f96696a = 1;
                if (interfaceC17139A.emit(requiresLoginEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel", f = "CouponListTabsViewModel.kt", l = {HttpResponseStatus.REDIRECTION_USE_PROXY}, m = "onClipCouponSuccess")
    static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f96698a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f96699b;

        /* renamed from: d, reason: collision with root package name */
        int f96701d;

        p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96699b = obj;
            this.f96701d |= Integer.MIN_VALUE;
            return M.this.N(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$onResume$1", f = "CouponListTabsViewModel.kt", l = {342, 343}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96702a;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return M.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            if (r5.B(r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f96702a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L37
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.b(r5)
                goto L2c
            L1e:
                kotlin.ResultKt.b(r5)
                com.meijer.mobile.coupon.list.M r5 = com.meijer.mobile.coupon.list.M.this
                r4.f96702a = r3
                java.lang.Object r5 = com.meijer.mobile.coupon.list.M.r(r5, r4)
                if (r5 != r0) goto L2c
                goto L36
            L2c:
                com.meijer.mobile.coupon.list.M r5 = com.meijer.mobile.coupon.list.M.this
                r4.f96702a = r2
                java.lang.Object r5 = com.meijer.mobile.coupon.list.M.p(r5, r4)
                if (r5 != r0) goto L37
            L36:
                return r0
            L37:
                kotlin.Unit r5 = kotlin.Unit.f142422a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LOk/a;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$safeClipCoupon$1", f = "CouponListTabsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function3<InterfaceC17153g<? super Coupon>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96704a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f96705b;

        r(Continuation<? super r> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super Coupon> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            r rVar = new r(continuation);
            rVar.f96705b = th2;
            return rVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f96704a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f96705b, "Error clipping coupon", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class s extends FunctionReferenceImpl implements Function2<Coupon, Continuation<? super Unit>, Object>, SuspendFunction {
        s(Object obj) {
            super(2, obj, M.class, "clipCoupon", "clipCoupon(Lcom/meijer/mobile/coupon/model/common/Coupon;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Coupon coupon, Continuation<? super Unit> continuation) {
            return ((M) this.receiver).A(coupon, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LXk/c;", "couponStateList", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$1$2", f = "CouponListTabsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<List<? extends CouponState>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96612a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f96613b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f96615d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f96615d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = M.this.new b(this.f96615d, continuation);
            bVar.f96613b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<CouponState> list, Continuation<? super Unit> continuation) {
            return ((b) create(list, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f96612a == 0) {
                ResultKt.b(obj);
                M.this.S(this.f96615d, (List) this.f96613b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public M(yo.k userManager, hl.m cartRepository, C6412d couponsRepository, Xk.v multiChannelCouponStateRepository, Tq.j storeProvider, InterfaceC14261a analyticsEngine, AbstractC16618K ioDispatcher) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(multiChannelCouponStateRepository, "multiChannelCouponStateRepository");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.userManager = userManager;
        this.cartRepository = cartRepository;
        this.couponsRepository = couponsRepository;
        this.multiChannelCouponStateRepository = multiChannelCouponStateRepository;
        this.storeProvider = storeProvider;
        this.analyticsEngine = analyticsEngine;
        this.ioDispatcher = ioDispatcher;
        this._couponListStateFlow = tv.S.a(new ViewState(false, false, 0, 0, 0, null, null, null, null, 511, null));
        InterfaceC17139A<e> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC17139AB;
        this.eventFlow = C17154h.b(interfaceC17139AB);
        this.updatedCouponList = new ArrayList();
        multiChannelCouponStateRepository.c(new v.a() { // from class: com.meijer.mobile.coupon.list.L
            @Override // Xk.v.a
            public final void a(Object obj, Xk.u uVar) {
                M.n(this.f96596a, obj, uVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e3, code lost:
    
        if (M(r4, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(Ok.Coupon r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.A(Ok.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(kotlin.coroutines.Continuation<? super kotlin.Unit> r32) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.B(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(1:(1:(3:15|59|60)(2:16|17))(5:18|54|(1:56)|59|60))(11:19|66|20|42|43|49|(3:51|(0)|58)|54|(0)|59|60))(1:24))(5:25|(1:26)|28|(1:31)|58)|62|32|(1:34)(1:35)|36|37|64|38|(9:41|42|43|49|(0)|54|(0)|59|60)|58|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:
    
        r3 = r5;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011e, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0174, code lost:
    
        if (Q(r6, r7, r8) == r2) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(Pk.c r28, Rk.CouponOptions r29, boolean r30, kotlin.coroutines.Continuation<? super kotlin.Unit> r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.C(Pk.c, Rk.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (C(r6, r2, false, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.coupon.list.M.i
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.coupon.list.M$i r0 = (com.meijer.mobile.coupon.list.M.i) r0
            int r1 = r0.f96663c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96663c = r1
            goto L18
        L13:
            com.meijer.mobile.coupon.list.M$i r0 = new com.meijer.mobile.coupon.list.M$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f96661a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f96663c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r6)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.b(r6)
            goto L57
        L38:
            kotlin.ResultKt.b(r6)
            java.util.List<Ok.c> r6 = r5.updatedCouponList
            r6.clear()
            Pk.c r6 = Pk.c.f28328d
            tv.B<com.meijer.mobile.coupon.list.M$f> r2 = r5._couponListStateFlow
            java.lang.Object r2 = r2.getValue()
            com.meijer.mobile.coupon.list.M$f r2 = (com.meijer.mobile.coupon.list.M.ViewState) r2
            Rk.a r2 = r2.getAvailableTabCouponOptions()
            r0.f96663c = r4
            java.lang.Object r6 = r5.C(r6, r2, r4, r0)
            if (r6 != r1) goto L57
            goto L6e
        L57:
            Pk.c r6 = Pk.c.f28329e
            tv.B<com.meijer.mobile.coupon.list.M$f> r2 = r5._couponListStateFlow
            java.lang.Object r2 = r2.getValue()
            com.meijer.mobile.coupon.list.M$f r2 = (com.meijer.mobile.coupon.list.M.ViewState) r2
            Rk.a r2 = r2.getClippedTabCouponOptions()
            r0.f96663c = r3
            r3 = 0
            java.lang.Object r6 = r5.C(r6, r2, r3, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.D(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.coupon.list.M.k
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.coupon.list.M$k r0 = (com.meijer.mobile.coupon.list.M.k) r0
            int r1 = r0.f96688k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96688k = r1
            goto L18
        L13:
            com.meijer.mobile.coupon.list.M$k r0 = new com.meijer.mobile.coupon.list.M$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f96686i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f96688k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f96681d
            com.meijer.mobile.coupon.list.M r1 = (com.meijer.mobile.coupon.list.M) r1
            java.lang.Object r1 = r0.f96680c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f96679b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f96678a
            com.meijer.mobile.coupon.list.M r1 = (com.meijer.mobile.coupon.list.M) r1
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L66
        L3a:
            r6 = move-exception
            goto L6b
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L44:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            cl.d r6 = t(r5)     // Catch: java.lang.Exception -> L3a
            r0.f96678a = r5     // Catch: java.lang.Exception -> L3a
            r0.f96679b = r0     // Catch: java.lang.Exception -> L3a
            r0.f96680c = r0     // Catch: java.lang.Exception -> L3a
            r0.f96681d = r5     // Catch: java.lang.Exception -> L3a
            r0.f96682e = r4     // Catch: java.lang.Exception -> L3a
            r0.f96683f = r4     // Catch: java.lang.Exception -> L3a
            r0.f96684g = r4     // Catch: java.lang.Exception -> L3a
            r0.f96685h = r4     // Catch: java.lang.Exception -> L3a
            r0.f96688k = r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = r6.v(r0)     // Catch: java.lang.Exception -> L3a
            if (r6 != r1) goto L66
            return r1
        L66:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L7c
        L6b:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L7c:
            boolean r0 = kotlin.Result.h(r6)
            if (r0 == 0) goto L88
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            r5.O(r0)
        L88:
            java.lang.Throwable r6 = kotlin.Result.e(r6)
            if (r6 == 0) goto L97
            uw.a$a r0 = uw.a.INSTANCE
            java.lang.String r1 = "Failed to fetch special offers"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.f(r6, r1, r2)
        L97:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.E(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final GoogleAdData G(EnumC13905f gamAds, int adSlotPosition) {
        return C13904e.b(C13904e.f131155a, gamAds, "CouponsPage", true, null, this.userManager.y(), Integer.valueOf(adSlotPosition), 8, null);
    }

    static /* synthetic */ GoogleAdData H(M m10, EnumC13905f enumC13905f, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m10.G(enumC13905f, i10);
    }

    private final void K() {
        if (this.userManager.b()) {
            C17154h.J(C17154h.g(C17154h.O(C17154h.H(this.cartRepository.b(), this.ioDispatcher), new l(null)), new m(null)), d0.a(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(Ok.Coupon r40, kotlin.coroutines.Continuation<? super kotlin.Unit> r41) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            r2 = r41
            boolean r3 = r2 instanceof com.meijer.mobile.coupon.list.M.p
            if (r3 == 0) goto L19
            r3 = r2
            com.meijer.mobile.coupon.list.M$p r3 = (com.meijer.mobile.coupon.list.M.p) r3
            int r4 = r3.f96701d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f96701d = r4
            goto L1e
        L19:
            com.meijer.mobile.coupon.list.M$p r3 = new com.meijer.mobile.coupon.list.M$p
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.f96699b
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.f96701d
            r6 = 1
            if (r5 == 0) goto L3c
            if (r5 != r6) goto L34
            java.lang.Object r1 = r3.f96698a
            Ok.a r1 = (Ok.Coupon) r1
            kotlin.ResultKt.b(r2)
        L32:
            r5 = r1
            goto L51
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            kotlin.ResultKt.b(r2)
            tv.A<com.meijer.mobile.coupon.list.M$e> r2 = r0._eventFlow
            com.meijer.mobile.coupon.list.M$e$d r5 = new com.meijer.mobile.coupon.list.M$e$d
            r5.<init>(r1)
            r3.f96698a = r1
            r3.f96701d = r6
            java.lang.Object r2 = r2.emit(r5, r3)
            if (r2 != r4) goto L32
            return r4
        L51:
            Xk.v r1 = r0.multiChannelCouponStateRepository
            Pk.c r2 = Pk.c.f28329e
            r37 = 1073741791(0x3fffffdf, float:1.9999961)
            r38 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            Ok.a r3 = Ok.Coupon.e(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.util.List r3 = kotlin.collections.CollectionsKt.e(r3)
            r1.d(r2, r3)
            java.util.List<Ok.c> r1 = r0.updatedCouponList
            r1.add(r5)
            kotlin.Unit r1 = kotlin.Unit.f142422a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.N(Ok.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void O(String specialOffersBannerURL) {
        ViewState value;
        ViewState viewState;
        InterfaceC17140B<ViewState> interfaceC17140B = this._couponListStateFlow;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, false, false, 0, 0, 0, CouponListTabsDecorator.b(viewState.getCouponListTabsDecorator(), false, 0, 0, 0, 0, 0, null, null, specialOffersBannerURL, false, null, 1791, null), null, null, null, 478, null)));
    }

    private final Object Q(Pk.c cVar, RetrofitException retrofitException, Continuation<? super Unit> continuation) {
        ViewState value;
        ViewState viewState;
        ViewState value2;
        ViewState viewState2;
        if (cVar == Pk.c.f28328d) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._couponListStateFlow;
            do {
                value2 = interfaceC17140B.getValue();
                viewState2 = value2;
            } while (!interfaceC17140B.e(value2, ViewState.b(viewState2, false, true, 0, 0, 0, CouponListTabsDecorator.b(viewState2.getCouponListTabsDecorator(), false, 0, 0, 0, 0, 0, CollectionsKt.m(), null, null, false, null, 1203, null), null, null, null, 476, null)));
        } else if (cVar == Pk.c.f28329e) {
            InterfaceC17140B<ViewState> interfaceC17140B2 = this._couponListStateFlow;
            do {
                value = interfaceC17140B2.getValue();
                viewState = value;
            } while (!interfaceC17140B2.e(value, ViewState.b(viewState, false, true, 0, 0, 0, CouponListTabsDecorator.b(viewState.getCouponListTabsDecorator(), false, 0, 0, 0, 0, 0, null, CollectionsKt.m(), null, false, null, 1871, null), null, null, null, 476, null)));
        }
        if (!(retrofitException.getErrorType() instanceof CouponsResponse.EnumC2006a)) {
            return Unit.f142422a;
        }
        InterfaceC17139A<e> interfaceC17139A = this._eventFlow;
        rk.b errorType = retrofitException.getErrorType();
        Intrinsics.h(errorType, "null cannot be cast to non-null type com.meijer.mobile.coupons.domain.models.CouponsResponse.CouponsResponseCode");
        Object objEmit = interfaceC17139A.emit(new e.ShowErrorAlert(0, ((CouponsResponse.EnumC2006a) errorType).getErrorResourceId()), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f142422a;
    }

    private final Object R(Pk.c cVar, CouponsResponse couponsResponse, Continuation<? super Unit> continuation) {
        ViewState value;
        ViewState viewState;
        ViewState value2;
        ViewState viewState2;
        String specialOffersUrl;
        Xk.v vVar = this.multiChannelCouponStateRepository;
        List<Coupon> listF = couponsResponse.f();
        if (listF == null) {
            listF = CollectionsKt.m();
        }
        vVar.b(cVar, listF);
        if (cVar == Pk.c.f28328d) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._couponListStateFlow;
            do {
                value2 = interfaceC17140B.getValue();
                viewState2 = value2;
            } while (!interfaceC17140B.e(value2, ViewState.b(viewState2, false, false, 0, 0, 0, CouponListTabsDecorator.b(viewState2.getCouponListTabsDecorator(), false, 0, couponsResponse.getCouponCount(), couponsResponse.getAvailableCouponCount(), 0, 0, null, null, couponsResponse.getSpecialOffersUrl(), couponsResponse.getHasSpecialOffers(), null, 1267, null), null, null, null, 476, null)));
            if (couponsResponse.getHasSpecialOffers() && ((specialOffersUrl = couponsResponse.getSpecialOffersUrl()) == null || specialOffersUrl.length() == 0)) {
                Object objE = E(continuation);
                return objE == IntrinsicsKt.f() ? objE : Unit.f142422a;
            }
        } else if (cVar == Pk.c.f28329e) {
            InterfaceC17140B<ViewState> interfaceC17140B2 = this._couponListStateFlow;
            do {
                value = interfaceC17140B2.getValue();
                viewState = value;
            } while (!interfaceC17140B2.e(value, ViewState.b(viewState, false, false, 0, 0, 0, CouponListTabsDecorator.b(viewState.getCouponListTabsDecorator(), false, 0, 0, 0, couponsResponse.getCouponCount(), couponsResponse.getAvailableCouponCount(), null, null, null, false, null, 1999, null), null, null, null, 476, null)));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(Object couponPageType, List<CouponState> couponStateList) {
        ViewState value;
        ViewState viewState;
        CouponListTabsDecorator couponListTabsDecorator;
        ArrayList arrayList;
        ViewState value2;
        ViewState viewState2;
        if (couponPageType == Pk.c.f28328d) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._couponListStateFlow;
            do {
                value2 = interfaceC17140B.getValue();
                viewState2 = value2;
            } while (!interfaceC17140B.e(value2, ViewState.b(viewState2, false, false, 0, 0, 0, CouponListTabsDecorator.b(viewState2.getCouponListTabsDecorator(), false, 0, 0, 0, 0, 0, couponStateList, null, null, false, null, 1983, null), null, null, null, 479, null)));
            return;
        }
        if (couponPageType == Pk.c.f28329e) {
            InterfaceC17140B<ViewState> interfaceC17140B2 = this._couponListStateFlow;
            do {
                value = interfaceC17140B2.getValue();
                viewState = value;
                couponListTabsDecorator = viewState.getCouponListTabsDecorator();
                arrayList = new ArrayList();
                for (Object obj : couponStateList) {
                    if (((CouponState) obj).getCoupon().x()) {
                        arrayList.add(obj);
                    }
                }
            } while (!interfaceC17140B2.e(value, ViewState.b(viewState, false, false, 0, 0, 0, CouponListTabsDecorator.b(couponListTabsDecorator, false, 0, 0, 0, 0, 0, null, arrayList, null, false, null, 1919, null), null, null, null, 479, null)));
        }
    }

    private final void T(Ok.c couponIdentity) {
        C17154h.J(C17154h.O(C17154h.g(C17154h.H(C17154h.Z(this.couponsRepository.j(couponIdentity), 1), this.ioDispatcher), new r(null)), new s(this)), d0.a(this));
    }

    private final void U(int count) {
        InterfaceC17140B<ViewState> interfaceC17140B = this._couponListStateFlow;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            int i10 = count;
            if (interfaceC17140B.e(value, ViewState.b(value, false, false, 0, 0, i10, null, null, null, null, 495, null))) {
                return;
            } else {
                count = i10;
            }
        }
    }

    private final void V(int index, int offset) {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._couponListStateFlow;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, false, index, offset, 0, null, null, null, null, 499, null)));
    }

    private final void W(Pk.c couponPage, CouponOptions newCouponOptions) {
        ViewState value;
        CouponOptions couponOptions;
        if (couponPage != Pk.c.f28328d) {
            CouponOptions couponOptions2 = newCouponOptions;
            InterfaceC17140B<ViewState> interfaceC17140B = this._couponListStateFlow;
            do {
                value = interfaceC17140B.getValue();
                couponOptions = couponOptions2;
                couponOptions2 = couponOptions;
            } while (!interfaceC17140B.e(value, ViewState.b(value, false, false, 0, 0, 0, null, null, couponOptions, null, 383, null)));
            return;
        }
        InterfaceC17140B<ViewState> interfaceC17140B2 = this._couponListStateFlow;
        while (true) {
            ViewState value2 = interfaceC17140B2.getValue();
            CouponOptions couponOptions3 = newCouponOptions;
            if (interfaceC17140B2.e(value2, ViewState.b(value2, false, false, 0, 0, 0, null, couponOptions3, null, null, 447, null))) {
                return;
            } else {
                newCouponOptions = couponOptions3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(M m10, Object couponPageType, Xk.u couponStateRepository) {
        Intrinsics.j(couponPageType, "couponPageType");
        Intrinsics.j(couponStateRepository, "couponStateRepository");
        C17154h.J(C17154h.O(C17154h.g(C17154h.H(couponStateRepository.M(), m10.ioDispatcher), new a(null)), m10.new b(couponPageType, null)), d0.a(m10));
    }

    public final tv.P<ViewState> F() {
        return C17154h.c(this._couponListStateFlow);
    }

    public final InterfaceC17144F<e> I() {
        return this.eventFlow;
    }

    public final void J() {
        ViewState value;
        ArrayList arrayList = new ArrayList();
        GoogleAdData googleAdDataH = H(this, EnumC13905f.f131156d, 0, 2, null);
        if (googleAdDataH != null) {
            arrayList.add(googleAdDataH);
        }
        EnumC13905f enumC13905f = EnumC13905f.f131159g;
        GoogleAdData googleAdDataG = G(enumC13905f, 1);
        if (googleAdDataG != null) {
            arrayList.add(googleAdDataG);
        }
        GoogleAdData googleAdDataG2 = G(enumC13905f, 2);
        if (googleAdDataG2 != null) {
            arrayList.add(googleAdDataG2);
        }
        InterfaceC17140B<ViewState> interfaceC17140B = this._couponListStateFlow;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, false, 0, 0, 0, null, null, null, arrayList, l3.f92484c, null)));
    }

    public final void L(c action) {
        Intrinsics.j(action, "action");
        if (action instanceof c.RefreshCoupons) {
            if (((c.RefreshCoupons) action).getIsRetry() || !this.updatedCouponList.isEmpty()) {
                C16648k.d(d0.a(this), null, null, new n(null), 3, null);
                return;
            }
            return;
        }
        if (action instanceof c.SaveScrollPosition) {
            c.SaveScrollPosition saveScrollPosition = (c.SaveScrollPosition) action;
            V(saveScrollPosition.getIndex(), saveScrollPosition.getOffset());
        } else if (action instanceof c.SavePreviousItemCount) {
            U(((c.SavePreviousItemCount) action).getCount());
        } else {
            if (!(action instanceof c.GoogleAdClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsEngine.e(C13902c.b(((c.GoogleAdClicked) action).getAnalytics(), "coupons"));
        }
    }

    public final boolean P(CouponOptions newCouponOptions, ArrayList<String> filterCategories, Pk.c couponPage) {
        Intrinsics.j(newCouponOptions, "newCouponOptions");
        Intrinsics.j(filterCategories, "filterCategories");
        Intrinsics.j(couponPage, "couponPage");
        TrackingData trackingData = new TrackingData(C14476c.a("event: coupon refine apply"), null, 2, null);
        CouponOptions availableTabCouponOptions = couponPage == Pk.c.f28328d ? this._couponListStateFlow.getValue().getAvailableTabCouponOptions() : this._couponListStateFlow.getValue().getClippedTabCouponOptions();
        if (!Intrinsics.e(newCouponOptions.e(), availableTabCouponOptions.e())) {
            if (newCouponOptions.e().isEmpty()) {
                trackingData.h("departmentID", "Clear");
            } else {
                trackingData.h("departmentID", filterCategories.toString());
            }
        }
        trackingData.h("Sortby", newCouponOptions.i().l());
        if (newCouponOptions.getIsShowCategoryHeaders() != availableTabCouponOptions.getIsShowCategoryHeaders()) {
            trackingData.h("Showcategoryheaders", newCouponOptions.getIsShowCategoryHeaders() ? "yes" : "no");
        }
        if (!trackingData.k().isEmpty()) {
            this.analyticsEngine.e(trackingData.n(couponPage == Pk.c.f28329e ? "mperks: clipped" : "mperks: coupons").v("mperks"));
        }
        boolean z10 = (newCouponOptions.i() == availableTabCouponOptions.i() && Intrinsics.e(newCouponOptions.e(), availableTabCouponOptions.e()) && newCouponOptions.getIsShowCategoryHeaders() == availableTabCouponOptions.getIsShowCategoryHeaders() && newCouponOptions.getIsShowClippedCoupons() == availableTabCouponOptions.getIsShowClippedCoupons()) ? false : true;
        W(couponPage, newCouponOptions);
        return z10;
    }

    public final void X(boolean isLoading) {
        InterfaceC17140B<ViewState> interfaceC17140B = this._couponListStateFlow;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            boolean z10 = isLoading;
            if (interfaceC17140B.e(value, ViewState.b(value, z10, false, 0, 0, 0, null, null, null, null, 510, null))) {
                return;
            } else {
                isLoading = z10;
            }
        }
    }

    public void onAction(Pk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            if (this.userManager.b()) {
                T(((a.Clip) action).getCoupon());
                return;
            } else {
                C16648k.d(d0.a(this), null, null, new o(null), 3, null);
                return;
            }
        }
        if (!(action instanceof a.Unclip) && !(action instanceof a.NotInterested)) {
            if (!(action instanceof a.ViewCouponList) && !(action instanceof a.ViewCouponDetails)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            uw.a.INSTANCE.s("Requested unsupported action: " + action, new Object[0]);
        }
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        C16648k.d(d0.a(this), null, null, new q(null), 3, null);
        K();
    }

    private final Object M(CouponException couponException, Continuation<? super Unit> continuation) {
        e showClipCouponErrorSnackBar;
        int errorResourceId;
        rk.b errorType;
        if (couponException.getErrorType() != null && ((errorType = couponException.getErrorType()) == null || errorType.getResultCode() > 30)) {
            return Unit.f142422a;
        }
        if (couponException.getExceptionKind() == RetrofitException.b.f96142b) {
            showClipCouponErrorSnackBar = new e.ShowClipCouponErrorSnackBar(Nr.g.f22758t, couponException.getCoupon());
        } else if (couponException.getErrorType() == AddOfferErrorType.CLIPPED_COUPONS_LIMIT_ERROR) {
            showClipCouponErrorSnackBar = e.c.f96625a;
        } else {
            rk.b errorType2 = couponException.getErrorType();
            if (errorType2 != null) {
                errorResourceId = errorType2.getErrorResourceId();
            } else {
                errorResourceId = Nr.g.f22746n;
            }
            showClipCouponErrorSnackBar = new e.ShowClipCouponErrorSnackBar(errorResourceId, couponException.getCoupon());
        }
        Object objEmit = this._eventFlow.emit(showClipCouponErrorSnackBar, continuation);
        if (objEmit == IntrinsicsKt.f()) {
            return objEmit;
        }
        return Unit.f142422a;
    }
}
