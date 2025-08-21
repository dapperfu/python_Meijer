package com.meijer.mobile.coupon.list;

import Pk.Coupon;
import Qk.a;
import Sk.CouponOptions;
import Yk.CouponState;
import Yk.v;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import androidx.view.c0;
import androidx.view.d0;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupons.api.models.AddOfferErrorType;
import com.meijer.mobile.coupons.domain.models.CouponException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.C13702d;
import el.CouponsResponse;
import gi.C14375c;
import gi.C14377e;
import gi.EnumC14378f;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
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
import mv.AbstractC15779K;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0092\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004qokmBC\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010#\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b#\u0010$J#\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J \u0010.\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/J \u00102\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0018\u0010:\u001a\u00020\u00142\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020\u00142\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\b<\u0010;J\u0018\u0010>\u001a\u00020\u00142\u0006\u00101\u001a\u00020=H\u0082@¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0014H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001fH\u0002¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0014H\u0082@¢\u0006\u0004\bF\u0010\u0016J\u0010\u0010G\u001a\u00020\u0014H\u0082@¢\u0006\u0004\bG\u0010\u0016J\u0019\u0010J\u001a\u00020\u00142\b\u0010I\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020\u00142\u0006\u0010L\u001a\u00020'2\u0006\u0010M\u001a\u00020'H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00142\u0006\u0010P\u001a\u00020'H\u0002¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\u0014¢\u0006\u0004\bS\u0010AJ\u0017\u0010V\u001a\u00020\u00142\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ9\u0010[\u001a\u00020!2\u0006\u0010C\u001a\u00020\u001f2\u001a\u0010Z\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010H0Xj\n\u0012\u0006\u0012\u0004\u0018\u00010H`Y2\u0006\u0010B\u001a\u00020\u001d¢\u0006\u0004\b[\u0010\\J\u0015\u0010^\u001a\u00020\u00142\u0006\u0010]\u001a\u00020!¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020\u00142\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020\u00142\u0006\u0010a\u001a\u00020dH\u0016¢\u0006\u0004\be\u0010fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020v0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020{0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\"\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020{0\u007f8\u0006¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R7\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u0002040\u0085\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u0012\u0005\b\u008c\u0001\u0010A\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020v0\u008e\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0093\u0001"}, d2 = {"Lcom/meijer/mobile/coupon/list/M;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "Lyo/k;", "userManager", "Lil/m;", "cartRepository", "Ldl/d;", "couponsRepository", "LYk/v;", "multiChannelCouponStateRepository", "LTq/j;", "storeProvider", "Lhi/a;", "analyticsEngine", "Lmv/K;", "ioDispatcher", "<init>", "(Lyo/k;Lil/m;Ldl/d;LYk/v;LTq/j;Lhi/a;Lmv/K;)V", "", "D", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "couponPageType", "", "LYk/c;", "couponStateList", "S", "(Ljava/lang/Object;Ljava/util/List;)V", "LQk/c;", "pageType", "LSk/a;", "couponOption", "", "requiresSpecialOffersUrl", "C", "(LQk/c;LSk/a;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgi/f;", "gamAds", "", "adSlotPosition", "Lgi/d;", "G", "(Lgi/f;I)Lgi/d;", "Lel/a;", "couponsResponse", "R", "(LQk/c;Lel/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "exception", "Q", "(LQk/c;Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LPk/c;", "couponIdentity", "T", "(LPk/c;)V", "LPk/a;", "coupon", "A", "(LPk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "N", "Lcom/meijer/mobile/coupons/domain/models/CouponException;", "M", "(Lcom/meijer/mobile/coupons/domain/models/CouponException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "K", "()V", "couponPage", "newCouponOptions", "W", "(LQk/c;LSk/a;)V", "B", "E", "", "specialOffersBannerURL", "O", "(Ljava/lang/String;)V", "index", "offset", "V", "(II)V", "count", "U", "(I)V", "J", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "filterCategories", "P", "(LSk/a;Ljava/util/ArrayList;LQk/c;)Z", "isLoading", "X", "(Z)V", "Lcom/meijer/mobile/coupon/list/M$c;", "action", "L", "(Lcom/meijer/mobile/coupon/list/M$c;)V", "LQk/a;", "onAction", "(LQk/a;)V", "a", "Lyo/k;", "b", "Lil/m;", "c", "Ldl/d;", "d", "LYk/v;", "e", "LTq/j;", "f", "Lhi/a;", "g", "Lmv/K;", "Lpv/B;", "Lcom/meijer/mobile/coupon/list/M$f;", "h", "Lpv/B;", "_couponListStateFlow", "Lpv/A;", "Lcom/meijer/mobile/coupon/list/M$e;", "i", "Lpv/A;", "_eventFlow", "Lpv/F;", "j", "Lpv/F;", "I", "()Lpv/F;", "eventFlow", "", "k", "Ljava/util/List;", "getUpdatedCouponList$coupon_release", "()Ljava/util/List;", "setUpdatedCouponList$coupon_release", "(Ljava/util/List;)V", "getUpdatedCouponList$coupon_release$annotations", "updatedCouponList", "Lpv/P;", "F", "()Lpv/P;", "couponListStateFlow", "l", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class M extends c0 implements InterfaceC6157f {

    /* renamed from: m, reason: collision with root package name */
    public static final int f97456m = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Yk.v multiChannelCouponStateRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _couponListStateFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<e> _eventFlow;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<e> eventFlow;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<Pk.c> updatedCouponList;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "", "LYk/c;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$1$1", f = "CouponListTabsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function3<InterfaceC16562g<? super List<? extends CouponState>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97468a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f97469b;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super List<CouponState>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            a aVar = new a(continuation);
            aVar.f97469b = th2;
            return aVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f97468a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f97469b, "Error fetching coupon state", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$c;", "", "<init>", "()V", "b", "d", "c", "a", "Lcom/meijer/mobile/coupon/list/M$c$a;", "Lcom/meijer/mobile/coupon/list/M$c$b;", "Lcom/meijer/mobile/coupon/list/M$c$c;", "Lcom/meijer/mobile/coupon/list/M$c$d;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$c$a;", "Lcom/meijer/mobile/coupon/list/M$c;", "Lgi/a;", "analytics", "<init>", "(Lgi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgi/a;", "()Lgi/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.M$c$a, reason: from toString */
        public static final /* data */ class GoogleAdClicked extends c {

            /* renamed from: b, reason: collision with root package name */
            public static final int f97474b = GoogleAdAnalytics.f134240f;

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

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$e$b;", "Lcom/meijer/mobile/coupon/list/M$e;", "", "titleResId", "LPk/a;", "coupon", "<init>", "(ILPk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "LPk/a;", "()LPk/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            public static final c f97483a = new c();

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$e$d;", "Lcom/meijer/mobile/coupon/list/M$e;", "LPk/a;", "coupon", "<init>", "(LPk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/a;", "()LPk/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012Jr\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b'\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b\"\u0010,R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b%\u0010,R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b-\u0010/¨\u00060"}, d2 = {"Lcom/meijer/mobile/coupon/list/M$f;", "", "", "isCouponsLoading", "isFetchCouponsFailed", "", "firstVisibleIndex", "firstVisibleItemScrollOffset", "previousItemCount", "Lcom/meijer/mobile/coupon/list/J;", "couponListTabsDecorator", "LSk/a;", "availableTabCouponOptions", "clippedTabCouponOptions", "", "Lgi/d;", "googleAdSlots", "<init>", "(ZZIIILcom/meijer/mobile/coupon/list/J;LSk/a;LSk/a;Ljava/util/List;)V", "a", "(ZZIIILcom/meijer/mobile/coupon/list/J;LSk/a;LSk/a;Ljava/util/List;)Lcom/meijer/mobile/coupon/list/M$f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "j", "()Z", "b", "k", "c", "I", "f", "d", "g", "e", "i", "Lcom/meijer/mobile/coupon/list/J;", "()Lcom/meijer/mobile/coupon/list/J;", "LSk/a;", "()LSk/a;", "h", "Ljava/util/List;", "()Ljava/util/List;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        Object f97496a;

        /* renamed from: b, reason: collision with root package name */
        Object f97497b;

        /* renamed from: c, reason: collision with root package name */
        Object f97498c;

        /* renamed from: d, reason: collision with root package name */
        Object f97499d;

        /* renamed from: e, reason: collision with root package name */
        Object f97500e;

        /* renamed from: f, reason: collision with root package name */
        int f97501f;

        /* renamed from: g, reason: collision with root package name */
        int f97502g;

        /* renamed from: h, reason: collision with root package name */
        int f97503h;

        /* renamed from: i, reason: collision with root package name */
        int f97504i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f97505j;

        /* renamed from: l, reason: collision with root package name */
        int f97507l;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97505j = obj;
            this.f97507l |= Integer.MIN_VALUE;
            return M.this.A(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel", f = "CouponListTabsViewModel.kt", l = {455}, m = "fetchCouponAds")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97508a;

        /* renamed from: b, reason: collision with root package name */
        Object f97509b;

        /* renamed from: c, reason: collision with root package name */
        Object f97510c;

        /* renamed from: d, reason: collision with root package name */
        Object f97511d;

        /* renamed from: e, reason: collision with root package name */
        int f97512e;

        /* renamed from: f, reason: collision with root package name */
        int f97513f;

        /* renamed from: g, reason: collision with root package name */
        int f97514g;

        /* renamed from: h, reason: collision with root package name */
        int f97515h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f97516i;

        /* renamed from: k, reason: collision with root package name */
        int f97518k;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97516i = obj;
            this.f97518k |= Integer.MIN_VALUE;
            return M.this.B(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel", f = "CouponListTabsViewModel.kt", l = {108, 115}, m = "fetchCoupons")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f97519a;

        /* renamed from: c, reason: collision with root package name */
        int f97521c;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97519a = obj;
            this.f97521c |= Integer.MIN_VALUE;
            return M.this.D(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel", f = "CouponListTabsViewModel.kt", l = {159, 162, 168, 170}, m = "fetchCoupons")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97522a;

        /* renamed from: b, reason: collision with root package name */
        Object f97523b;

        /* renamed from: c, reason: collision with root package name */
        Object f97524c;

        /* renamed from: d, reason: collision with root package name */
        Object f97525d;

        /* renamed from: e, reason: collision with root package name */
        Object f97526e;

        /* renamed from: f, reason: collision with root package name */
        Object f97527f;

        /* renamed from: g, reason: collision with root package name */
        boolean f97528g;

        /* renamed from: h, reason: collision with root package name */
        int f97529h;

        /* renamed from: i, reason: collision with root package name */
        int f97530i;

        /* renamed from: j, reason: collision with root package name */
        int f97531j;

        /* renamed from: k, reason: collision with root package name */
        int f97532k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f97533l;

        /* renamed from: n, reason: collision with root package name */
        int f97535n;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97533l = obj;
            this.f97535n |= Integer.MIN_VALUE;
            return M.this.C(null, null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel", f = "CouponListTabsViewModel.kt", l = {471}, m = "fetchSpecialOffers")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97536a;

        /* renamed from: b, reason: collision with root package name */
        Object f97537b;

        /* renamed from: c, reason: collision with root package name */
        Object f97538c;

        /* renamed from: d, reason: collision with root package name */
        Object f97539d;

        /* renamed from: e, reason: collision with root package name */
        int f97540e;

        /* renamed from: f, reason: collision with root package name */
        int f97541f;

        /* renamed from: g, reason: collision with root package name */
        int f97542g;

        /* renamed from: h, reason: collision with root package name */
        int f97543h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f97544i;

        /* renamed from: k, reason: collision with root package name */
        int f97546k;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97544i = obj;
            this.f97546k |= Integer.MIN_VALUE;
            return M.this.E(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "itemCount", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$observeCartCount$1", f = "CouponListTabsViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97547a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ int f97548b;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = M.this.new l(continuation);
            lVar.f97548b = ((Number) obj).intValue();
            return lVar;
        }

        public final Object d(int i10, Continuation<? super Unit> continuation) {
            return ((l) create(Integer.valueOf(i10), continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return d(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f97547a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            int i10 = this.f97548b;
            InterfaceC16549B interfaceC16549B = M.this._couponListStateFlow;
            M m10 = M.this;
            while (true) {
                Object value = interfaceC16549B.getValue();
                ViewState viewState = (ViewState) value;
                M m11 = m10;
                if (interfaceC16549B.e(value, ViewState.b(viewState, false, false, 0, 0, 0, CouponListTabsDecorator.b(viewState.getCouponListTabsDecorator(), m11.storeProvider.d(), i10, 0, 0, 0, 0, null, null, null, false, null, 2044, null), null, null, null, 479, null))) {
                    return Unit.f143329a;
                }
                m10 = m11;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "", "", "e", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$observeCartCount$2", f = "CouponListTabsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function3<InterfaceC16562g<? super Integer>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97550a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f97551b;

        m(Continuation<? super m> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Integer> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            m mVar = new m(continuation);
            mVar.f97551b = th2;
            return mVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f97550a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f97551b, "Error observing cart item count", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$onAction$1", f = "CouponListTabsViewModel.kt", l = {511}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97552a;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return M.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97552a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                M m10 = M.this;
                this.f97552a = 1;
                if (m10.D(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$onAction$2", f = "CouponListTabsViewModel.kt", l = {576}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97554a;

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return M.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97554a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = M.this._eventFlow;
                e.RequiresLoginEvent requiresLoginEvent = new e.RequiresLoginEvent(Nr.g.f22706p);
                this.f97554a = 1;
                if (interfaceC16548A.emit(requiresLoginEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel", f = "CouponListTabsViewModel.kt", l = {HttpResponseStatus.REDIRECTION_USE_PROXY}, m = "onClipCouponSuccess")
    static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97556a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f97557b;

        /* renamed from: d, reason: collision with root package name */
        int f97559d;

        p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97557b = obj;
            this.f97559d |= Integer.MIN_VALUE;
            return M.this.N(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$onResume$1", f = "CouponListTabsViewModel.kt", l = {342, 343}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97560a;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return M.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r4.f97560a
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
                r4.f97560a = r3
                java.lang.Object r5 = com.meijer.mobile.coupon.list.M.r(r5, r4)
                if (r5 != r0) goto L2c
                goto L36
            L2c:
                com.meijer.mobile.coupon.list.M r5 = com.meijer.mobile.coupon.list.M.this
                r4.f97560a = r2
                java.lang.Object r5 = com.meijer.mobile.coupon.list.M.p(r5, r4)
                if (r5 != r0) goto L37
            L36:
                return r0
            L37:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LPk/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$safeClipCoupon$1", f = "CouponListTabsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function3<InterfaceC16562g<? super Coupon>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97562a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f97563b;

        r(Continuation<? super r> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Coupon> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            r rVar = new r(continuation);
            rVar.f97563b = th2;
            return rVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f97562a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f97563b, "Error clipping coupon", new Object[0]);
                return Unit.f143329a;
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LYk/c;", "couponStateList", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListTabsViewModel$1$2", f = "CouponListTabsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<List<? extends CouponState>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97470a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f97471b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f97473d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f97473d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = M.this.new b(this.f97473d, continuation);
            bVar.f97471b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<CouponState> list, Continuation<? super Unit> continuation) {
            return ((b) create(list, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f97470a == 0) {
                ResultKt.b(obj);
                M.this.S(this.f97473d, (List) this.f97471b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public M(yo.k userManager, il.m cartRepository, C13702d couponsRepository, Yk.v multiChannelCouponStateRepository, Tq.j storeProvider, InterfaceC14523a analyticsEngine, AbstractC15779K ioDispatcher) {
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
        this._couponListStateFlow = pv.S.a(new ViewState(false, false, 0, 0, 0, null, null, null, null, 511, null));
        InterfaceC16548A<e> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC16548AB;
        this.eventFlow = C16563h.b(interfaceC16548AB);
        this.updatedCouponList = new ArrayList();
        multiChannelCouponStateRepository.c(new v.a() { // from class: com.meijer.mobile.coupon.list.L
            @Override // Yk.v.a
            public final void a(Object obj, Yk.u uVar) {
                M.n(this.f97454a, obj, uVar);
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
    public final java.lang.Object A(Pk.Coupon r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.A(Pk.a, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object C(Qk.c r28, Sk.CouponOptions r29, boolean r30, kotlin.coroutines.Continuation<? super kotlin.Unit> r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.C(Qk.c, Sk.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
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
            int r1 = r0.f97521c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97521c = r1
            goto L18
        L13:
            com.meijer.mobile.coupon.list.M$i r0 = new com.meijer.mobile.coupon.list.M$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f97519a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f97521c
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
            java.util.List<Pk.c> r6 = r5.updatedCouponList
            r6.clear()
            Qk.c r6 = Qk.c.f31040d
            pv.B<com.meijer.mobile.coupon.list.M$f> r2 = r5._couponListStateFlow
            java.lang.Object r2 = r2.getValue()
            com.meijer.mobile.coupon.list.M$f r2 = (com.meijer.mobile.coupon.list.M.ViewState) r2
            Sk.a r2 = r2.getAvailableTabCouponOptions()
            r0.f97521c = r4
            java.lang.Object r6 = r5.C(r6, r2, r4, r0)
            if (r6 != r1) goto L57
            goto L6e
        L57:
            Qk.c r6 = Qk.c.f31041e
            pv.B<com.meijer.mobile.coupon.list.M$f> r2 = r5._couponListStateFlow
            java.lang.Object r2 = r2.getValue()
            com.meijer.mobile.coupon.list.M$f r2 = (com.meijer.mobile.coupon.list.M.ViewState) r2
            Sk.a r2 = r2.getClippedTabCouponOptions()
            r0.f97521c = r3
            r3 = 0
            java.lang.Object r6 = r5.C(r6, r2, r3, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r6 = kotlin.Unit.f143329a
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
            int r1 = r0.f97546k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97546k = r1
            goto L18
        L13:
            com.meijer.mobile.coupon.list.M$k r0 = new com.meijer.mobile.coupon.list.M$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f97544i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f97546k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f97539d
            com.meijer.mobile.coupon.list.M r1 = (com.meijer.mobile.coupon.list.M) r1
            java.lang.Object r1 = r0.f97538c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f97537b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f97536a
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
            dl.d r6 = t(r5)     // Catch: java.lang.Exception -> L3a
            r0.f97536a = r5     // Catch: java.lang.Exception -> L3a
            r0.f97537b = r0     // Catch: java.lang.Exception -> L3a
            r0.f97538c = r0     // Catch: java.lang.Exception -> L3a
            r0.f97539d = r5     // Catch: java.lang.Exception -> L3a
            r0.f97540e = r4     // Catch: java.lang.Exception -> L3a
            r0.f97541f = r4     // Catch: java.lang.Exception -> L3a
            r0.f97542g = r4     // Catch: java.lang.Exception -> L3a
            r0.f97543h = r4     // Catch: java.lang.Exception -> L3a
            r0.f97546k = r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = r6.v(r0)     // Catch: java.lang.Exception -> L3a
            if (r6 != r1) goto L66
            return r1
        L66:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L7c
        L6b:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
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
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.String r1 = "Failed to fetch special offers"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.f(r6, r1, r2)
        L97:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.E(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final GoogleAdData G(EnumC14378f gamAds, int adSlotPosition) {
        return C14377e.b(C14377e.f134254a, gamAds, "CouponsPage", true, null, this.userManager.y(), Integer.valueOf(adSlotPosition), 8, null);
    }

    static /* synthetic */ GoogleAdData H(M m10, EnumC14378f enumC14378f, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m10.G(enumC14378f, i10);
    }

    private final void K() {
        if (this.userManager.b()) {
            C16563h.J(C16563h.g(C16563h.O(C16563h.H(this.cartRepository.a(), this.ioDispatcher), new l(null)), new m(null)), d0.a(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(Pk.Coupon r40, kotlin.coroutines.Continuation<? super kotlin.Unit> r41) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            r2 = r41
            boolean r3 = r2 instanceof com.meijer.mobile.coupon.list.M.p
            if (r3 == 0) goto L19
            r3 = r2
            com.meijer.mobile.coupon.list.M$p r3 = (com.meijer.mobile.coupon.list.M.p) r3
            int r4 = r3.f97559d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f97559d = r4
            goto L1e
        L19:
            com.meijer.mobile.coupon.list.M$p r3 = new com.meijer.mobile.coupon.list.M$p
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.f97557b
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.f97559d
            r6 = 1
            if (r5 == 0) goto L3c
            if (r5 != r6) goto L34
            java.lang.Object r1 = r3.f97556a
            Pk.a r1 = (Pk.Coupon) r1
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
            pv.A<com.meijer.mobile.coupon.list.M$e> r2 = r0._eventFlow
            com.meijer.mobile.coupon.list.M$e$d r5 = new com.meijer.mobile.coupon.list.M$e$d
            r5.<init>(r1)
            r3.f97556a = r1
            r3.f97559d = r6
            java.lang.Object r2 = r2.emit(r5, r3)
            if (r2 != r4) goto L32
            return r4
        L51:
            Yk.v r1 = r0.multiChannelCouponStateRepository
            Qk.c r2 = Qk.c.f31041e
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
            Pk.a r3 = Pk.Coupon.e(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.util.List r3 = kotlin.collections.CollectionsKt.e(r3)
            r1.d(r2, r3)
            java.util.List<Pk.c> r1 = r0.updatedCouponList
            r1.add(r5)
            kotlin.Unit r1 = kotlin.Unit.f143329a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.M.N(Pk.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void O(String specialOffersBannerURL) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._couponListStateFlow;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, false, false, 0, 0, 0, CouponListTabsDecorator.b(viewState.getCouponListTabsDecorator(), false, 0, 0, 0, 0, 0, null, null, specialOffersBannerURL, false, null, 1791, null), null, null, null, 478, null)));
    }

    private final Object Q(Qk.c cVar, RetrofitException retrofitException, Continuation<? super Unit> continuation) {
        ViewState value;
        ViewState viewState;
        ViewState value2;
        ViewState viewState2;
        if (cVar == Qk.c.f31040d) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._couponListStateFlow;
            do {
                value2 = interfaceC16549B.getValue();
                viewState2 = value2;
            } while (!interfaceC16549B.e(value2, ViewState.b(viewState2, false, true, 0, 0, 0, CouponListTabsDecorator.b(viewState2.getCouponListTabsDecorator(), false, 0, 0, 0, 0, 0, CollectionsKt.m(), null, null, false, null, 1203, null), null, null, null, 476, null)));
        } else if (cVar == Qk.c.f31041e) {
            InterfaceC16549B<ViewState> interfaceC16549B2 = this._couponListStateFlow;
            do {
                value = interfaceC16549B2.getValue();
                viewState = value;
            } while (!interfaceC16549B2.e(value, ViewState.b(viewState, false, true, 0, 0, 0, CouponListTabsDecorator.b(viewState.getCouponListTabsDecorator(), false, 0, 0, 0, 0, 0, null, CollectionsKt.m(), null, false, null, 1871, null), null, null, null, 476, null)));
        }
        if (!(retrofitException.getErrorType() instanceof CouponsResponse.EnumC2049a)) {
            return Unit.f143329a;
        }
        InterfaceC16548A<e> interfaceC16548A = this._eventFlow;
        sk.b errorType = retrofitException.getErrorType();
        Intrinsics.h(errorType, "null cannot be cast to non-null type com.meijer.mobile.coupons.domain.models.CouponsResponse.CouponsResponseCode");
        Object objEmit = interfaceC16548A.emit(new e.ShowErrorAlert(0, ((CouponsResponse.EnumC2049a) errorType).getErrorResourceId()), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f143329a;
    }

    private final Object R(Qk.c cVar, CouponsResponse couponsResponse, Continuation<? super Unit> continuation) {
        ViewState value;
        ViewState viewState;
        ViewState value2;
        ViewState viewState2;
        String specialOffersUrl;
        Yk.v vVar = this.multiChannelCouponStateRepository;
        List<Coupon> listF = couponsResponse.f();
        if (listF == null) {
            listF = CollectionsKt.m();
        }
        vVar.b(cVar, listF);
        if (cVar == Qk.c.f31040d) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._couponListStateFlow;
            do {
                value2 = interfaceC16549B.getValue();
                viewState2 = value2;
            } while (!interfaceC16549B.e(value2, ViewState.b(viewState2, false, false, 0, 0, 0, CouponListTabsDecorator.b(viewState2.getCouponListTabsDecorator(), false, 0, couponsResponse.getCouponCount(), couponsResponse.getAvailableCouponCount(), 0, 0, null, null, couponsResponse.getSpecialOffersUrl(), couponsResponse.getHasSpecialOffers(), null, 1267, null), null, null, null, 476, null)));
            if (couponsResponse.getHasSpecialOffers() && ((specialOffersUrl = couponsResponse.getSpecialOffersUrl()) == null || specialOffersUrl.length() == 0)) {
                Object objE = E(continuation);
                return objE == IntrinsicsKt.f() ? objE : Unit.f143329a;
            }
        } else if (cVar == Qk.c.f31041e) {
            InterfaceC16549B<ViewState> interfaceC16549B2 = this._couponListStateFlow;
            do {
                value = interfaceC16549B2.getValue();
                viewState = value;
            } while (!interfaceC16549B2.e(value, ViewState.b(viewState, false, false, 0, 0, 0, CouponListTabsDecorator.b(viewState.getCouponListTabsDecorator(), false, 0, 0, 0, couponsResponse.getCouponCount(), couponsResponse.getAvailableCouponCount(), null, null, null, false, null, 1999, null), null, null, null, 476, null)));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(Object couponPageType, List<CouponState> couponStateList) {
        ViewState value;
        ViewState viewState;
        CouponListTabsDecorator couponListTabsDecorator;
        ArrayList arrayList;
        ViewState value2;
        ViewState viewState2;
        if (couponPageType == Qk.c.f31040d) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._couponListStateFlow;
            do {
                value2 = interfaceC16549B.getValue();
                viewState2 = value2;
            } while (!interfaceC16549B.e(value2, ViewState.b(viewState2, false, false, 0, 0, 0, CouponListTabsDecorator.b(viewState2.getCouponListTabsDecorator(), false, 0, 0, 0, 0, 0, couponStateList, null, null, false, null, 1983, null), null, null, null, 479, null)));
            return;
        }
        if (couponPageType == Qk.c.f31041e) {
            InterfaceC16549B<ViewState> interfaceC16549B2 = this._couponListStateFlow;
            do {
                value = interfaceC16549B2.getValue();
                viewState = value;
                couponListTabsDecorator = viewState.getCouponListTabsDecorator();
                arrayList = new ArrayList();
                for (Object obj : couponStateList) {
                    if (((CouponState) obj).getCoupon().x()) {
                        arrayList.add(obj);
                    }
                }
            } while (!interfaceC16549B2.e(value, ViewState.b(viewState, false, false, 0, 0, 0, CouponListTabsDecorator.b(couponListTabsDecorator, false, 0, 0, 0, 0, 0, null, arrayList, null, false, null, 1919, null), null, null, null, 479, null)));
        }
    }

    private final void T(Pk.c couponIdentity) {
        C16563h.J(C16563h.O(C16563h.g(C16563h.H(C16563h.Z(this.couponsRepository.j(couponIdentity), 1), this.ioDispatcher), new r(null)), new s(this)), d0.a(this));
    }

    private final void U(int count) {
        InterfaceC16549B<ViewState> interfaceC16549B = this._couponListStateFlow;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            int i10 = count;
            if (interfaceC16549B.e(value, ViewState.b(value, false, false, 0, 0, i10, null, null, null, null, 495, null))) {
                return;
            } else {
                count = i10;
            }
        }
    }

    private final void V(int index, int offset) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._couponListStateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, false, false, index, offset, 0, null, null, null, null, 499, null)));
    }

    private final void W(Qk.c couponPage, CouponOptions newCouponOptions) {
        ViewState value;
        CouponOptions couponOptions;
        if (couponPage != Qk.c.f31040d) {
            CouponOptions couponOptions2 = newCouponOptions;
            InterfaceC16549B<ViewState> interfaceC16549B = this._couponListStateFlow;
            do {
                value = interfaceC16549B.getValue();
                couponOptions = couponOptions2;
                couponOptions2 = couponOptions;
            } while (!interfaceC16549B.e(value, ViewState.b(value, false, false, 0, 0, 0, null, null, couponOptions, null, 383, null)));
            return;
        }
        InterfaceC16549B<ViewState> interfaceC16549B2 = this._couponListStateFlow;
        while (true) {
            ViewState value2 = interfaceC16549B2.getValue();
            CouponOptions couponOptions3 = newCouponOptions;
            if (interfaceC16549B2.e(value2, ViewState.b(value2, false, false, 0, 0, 0, null, couponOptions3, null, null, 447, null))) {
                return;
            } else {
                newCouponOptions = couponOptions3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(M m10, Object couponPageType, Yk.u couponStateRepository) {
        Intrinsics.j(couponPageType, "couponPageType");
        Intrinsics.j(couponStateRepository, "couponStateRepository");
        C16563h.J(C16563h.O(C16563h.g(C16563h.H(couponStateRepository.M(), m10.ioDispatcher), new a(null)), m10.new b(couponPageType, null)), d0.a(m10));
    }

    public final pv.P<ViewState> F() {
        return C16563h.c(this._couponListStateFlow);
    }

    public final InterfaceC16553F<e> I() {
        return this.eventFlow;
    }

    public final void J() {
        ViewState value;
        ArrayList arrayList = new ArrayList();
        GoogleAdData googleAdDataH = H(this, EnumC14378f.f134255d, 0, 2, null);
        if (googleAdDataH != null) {
            arrayList.add(googleAdDataH);
        }
        EnumC14378f enumC14378f = EnumC14378f.f134258g;
        GoogleAdData googleAdDataG = G(enumC14378f, 1);
        if (googleAdDataG != null) {
            arrayList.add(googleAdDataG);
        }
        GoogleAdData googleAdDataG2 = G(enumC14378f, 2);
        if (googleAdDataG2 != null) {
            arrayList.add(googleAdDataG2);
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._couponListStateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, false, false, 0, 0, 0, null, null, null, arrayList, l3.f93323c, null)));
    }

    public final void L(c action) {
        Intrinsics.j(action, "action");
        if (action instanceof c.RefreshCoupons) {
            if (((c.RefreshCoupons) action).getIsRetry() || !this.updatedCouponList.isEmpty()) {
                C15809k.d(d0.a(this), null, null, new n(null), 3, null);
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
            this.analyticsEngine.k(C14375c.b(((c.GoogleAdClicked) action).getAnalytics(), "coupons"));
        }
    }

    public final boolean P(CouponOptions newCouponOptions, ArrayList<String> filterCategories, Qk.c couponPage) {
        Intrinsics.j(newCouponOptions, "newCouponOptions");
        Intrinsics.j(filterCategories, "filterCategories");
        Intrinsics.j(couponPage, "couponPage");
        TrackingData trackingData = new TrackingData(C14756c.a("event: coupon refine apply"), null, 2, null);
        CouponOptions availableTabCouponOptions = couponPage == Qk.c.f31040d ? this._couponListStateFlow.getValue().getAvailableTabCouponOptions() : this._couponListStateFlow.getValue().getClippedTabCouponOptions();
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
            this.analyticsEngine.k(trackingData.n(couponPage == Qk.c.f31041e ? "mperks: clipped" : "mperks: coupons").v("mperks"));
        }
        boolean z10 = (newCouponOptions.i() == availableTabCouponOptions.i() && Intrinsics.e(newCouponOptions.e(), availableTabCouponOptions.e()) && newCouponOptions.getIsShowCategoryHeaders() == availableTabCouponOptions.getIsShowCategoryHeaders() && newCouponOptions.getIsShowClippedCoupons() == availableTabCouponOptions.getIsShowClippedCoupons()) ? false : true;
        W(couponPage, newCouponOptions);
        return z10;
    }

    public final void X(boolean isLoading) {
        InterfaceC16549B<ViewState> interfaceC16549B = this._couponListStateFlow;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            boolean z10 = isLoading;
            if (interfaceC16549B.e(value, ViewState.b(value, z10, false, 0, 0, 0, null, null, null, null, 510, null))) {
                return;
            } else {
                isLoading = z10;
            }
        }
    }

    public void onAction(Qk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            if (this.userManager.b()) {
                T(((a.Clip) action).getCoupon());
                return;
            } else {
                C15809k.d(d0.a(this), null, null, new o(null), 3, null);
                return;
            }
        }
        if (!(action instanceof a.Unclip) && !(action instanceof a.NotInterested)) {
            if (!(action instanceof a.ViewCouponList) && !(action instanceof a.ViewCouponDetails)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            qw.a.INSTANCE.s("Requested unsupported action: " + action, new Object[0]);
        }
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        C15809k.d(d0.a(this), null, null, new q(null), 3, null);
        K();
    }

    private final Object M(CouponException couponException, Continuation<? super Unit> continuation) {
        e showClipCouponErrorSnackBar;
        int errorResourceId;
        sk.b errorType;
        if (couponException.getErrorType() != null && ((errorType = couponException.getErrorType()) == null || errorType.getResultCode() > 30)) {
            return Unit.f143329a;
        }
        if (couponException.getExceptionKind() == RetrofitException.b.f97000b) {
            showClipCouponErrorSnackBar = new e.ShowClipCouponErrorSnackBar(Nr.g.f22714t, couponException.getCoupon());
        } else if (couponException.getErrorType() == AddOfferErrorType.CLIPPED_COUPONS_LIMIT_ERROR) {
            showClipCouponErrorSnackBar = e.c.f97483a;
        } else {
            sk.b errorType2 = couponException.getErrorType();
            if (errorType2 != null) {
                errorResourceId = errorType2.getErrorResourceId();
            } else {
                errorResourceId = Nr.g.f22702n;
            }
            showClipCouponErrorSnackBar = new e.ShowClipCouponErrorSnackBar(errorResourceId, couponException.getCoupon());
        }
        Object objEmit = this._eventFlow.emit(showClipCouponErrorSnackBar, continuation);
        if (objEmit == IntrinsicsKt.f()) {
            return objEmit;
        }
        return Unit.f143329a;
    }
}
