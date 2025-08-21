package com.meijer.mobile.coupon.list;

import Pk.Coupon;
import Qk.a;
import Sk.CouponOptions;
import Yk.CouponState;
import androidx.view.InterfaceC6157f;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupon.model.search.CouponsSortType;
import com.meijer.mobile.coupons.api.models.AddOfferErrorType;
import com.meijer.mobile.coupons.domain.models.CouponException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.C13702d;
import hi.InterfaceC14523a;
import ii.TrackingData;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004AJE?B+\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b!\u0010\"J\"\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010\u001e\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010(J\"\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u001e\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0018\u00103\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0082@¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0082@¢\u0006\u0004\b5\u00104J\u0018\u00107\u001a\u00020\u00102\u0006\u0010*\u001a\u000206H\u0082@¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020I0M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020D0S8F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/meijer/mobile/coupon/list/S;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "Ldl/d;", "couponsRepository", "LYk/u;", "couponStateRepository", "Lhi/a;", "analyticsEngine", "Lmv/K;", "ioDispatcher", "<init>", "(Ldl/d;LYk/u;Lhi/a;Lmv/K;)V", "Lcom/meijer/mobile/coupon/list/S$c;", "action", "", "E", "(Lcom/meijer/mobile/coupon/list/S$c;)V", "LQk/a;", "onAction", "(LQk/a;)V", "", "LYk/c;", "couponStateList", "onCouponState", "(Ljava/util/List;)V", "", "requiresSpecialOffersUrl", "showOnlySpecialOffers", "isSearchCoupon", "LSk/a;", "couponOptions", "y", "(ZZZLSk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lel/a;", "couponsResponse", "I", "(Lel/a;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "()V", "", "exception", "H", "(Ljava/lang/Throwable;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LPk/c;", "couponIdentity", "K", "(LPk/c;)V", "LPk/a;", "coupon", "x", "(LPk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "G", "Lcom/meijer/mobile/coupons/domain/models/CouponException;", "F", "(Lcom/meijer/mobile/coupons/domain/models/CouponException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "B", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ldl/d;", "b", "LYk/u;", "c", "Lhi/a;", "d", "Lmv/K;", "Lpv/B;", "Lcom/meijer/mobile/coupon/list/S$f;", "e", "Lpv/B;", "_couponListStateFlow", "Lpv/A;", "Lcom/meijer/mobile/coupon/list/S$e;", "f", "Lpv/A;", "_eventFlow", "Lpv/F;", "g", "Lpv/F;", "D", "()Lpv/F;", "eventFlow", "Lpv/P;", "C", "()Lpv/P;", "couponListStateFlow", "h", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class S extends c0 implements InterfaceC6157f {

    /* renamed from: i, reason: collision with root package name */
    public static final int f97568i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Yk.u couponStateRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _couponListStateFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<e> _eventFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<e> eventFlow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends AdaptedFunctionReference implements Function2<List<? extends CouponState>, Continuation<? super Unit>, Object>, SuspendFunction {
        a(Object obj) {
            super(2, obj, S.class, "onCouponState", "onCouponState(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<CouponState> list, Continuation<? super Unit> continuation) {
            return S.n((S) this.f143708a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "", "LYk/c;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel$2", f = "CouponListViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function3<InterfaceC16562g<? super List<? extends CouponState>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97576a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f97577b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super List<CouponState>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f97577b = th2;
            return bVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f97576a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f97577b, "Error fetching coupon state", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$c;", "", "<init>", "()V", "e", "c", "a", "b", "d", "Lcom/meijer/mobile/coupon/list/S$c$a;", "Lcom/meijer/mobile/coupon/list/S$c$b;", "Lcom/meijer/mobile/coupon/list/S$c$c;", "Lcom/meijer/mobile/coupon/list/S$c$d;", "Lcom/meijer/mobile/coupon/list/S$c$e;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$c$a;", "Lcom/meijer/mobile/coupon/list/S$c;", "LSk/a;", "couponOptions", "<init>", "(LSk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSk/a;", "()LSk/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.S$c$a, reason: from toString */
        public static final /* data */ class FetchAdCoupons extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CouponOptions couponOptions;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FetchAdCoupons) && Intrinsics.e(this.couponOptions, ((FetchAdCoupons) other).couponOptions);
            }

            public int hashCode() {
                return this.couponOptions.hashCode();
            }

            public String toString() {
                return "FetchAdCoupons(couponOptions=" + this.couponOptions + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchAdCoupons(CouponOptions couponOptions) {
                super(null);
                Intrinsics.j(couponOptions, "couponOptions");
                this.couponOptions = couponOptions;
            }

            /* renamed from: a, reason: from getter */
            public final CouponOptions getCouponOptions() {
                return this.couponOptions;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$c$b;", "Lcom/meijer/mobile/coupon/list/S$c;", "LSk/a;", "couponOptions", "<init>", "(LSk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSk/a;", "()LSk/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.S$c$b, reason: from toString */
        public static final /* data */ class FetchBundleCoupons extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CouponOptions couponOptions;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FetchBundleCoupons) && Intrinsics.e(this.couponOptions, ((FetchBundleCoupons) other).couponOptions);
            }

            public int hashCode() {
                return this.couponOptions.hashCode();
            }

            public String toString() {
                return "FetchBundleCoupons(couponOptions=" + this.couponOptions + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchBundleCoupons(CouponOptions couponOptions) {
                super(null);
                Intrinsics.j(couponOptions, "couponOptions");
                this.couponOptions = couponOptions;
            }

            /* renamed from: a, reason: from getter */
            public final CouponOptions getCouponOptions() {
                return this.couponOptions;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$c$c;", "Lcom/meijer/mobile/coupon/list/S$c;", "LSk/a;", "couponOptions", "<init>", "(LSk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSk/a;", "()LSk/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.S$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class FetchSearchCoupons extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CouponOptions couponOptions;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FetchSearchCoupons) && Intrinsics.e(this.couponOptions, ((FetchSearchCoupons) other).couponOptions);
            }

            public int hashCode() {
                return this.couponOptions.hashCode();
            }

            public String toString() {
                return "FetchSearchCoupons(couponOptions=" + this.couponOptions + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchSearchCoupons(CouponOptions couponOptions) {
                super(null);
                Intrinsics.j(couponOptions, "couponOptions");
                this.couponOptions = couponOptions;
            }

            /* renamed from: a, reason: from getter */
            public final CouponOptions getCouponOptions() {
                return this.couponOptions;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$c$d;", "Lcom/meijer/mobile/coupon/list/S$c;", "LSk/a;", "couponOptions", "<init>", "(LSk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSk/a;", "()LSk/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.S$c$d, reason: from toString */
        public static final /* data */ class FetchShoppingListRelatedCoupons extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CouponOptions couponOptions;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FetchShoppingListRelatedCoupons) && Intrinsics.e(this.couponOptions, ((FetchShoppingListRelatedCoupons) other).couponOptions);
            }

            public int hashCode() {
                return this.couponOptions.hashCode();
            }

            public String toString() {
                return "FetchShoppingListRelatedCoupons(couponOptions=" + this.couponOptions + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchShoppingListRelatedCoupons(CouponOptions couponOptions) {
                super(null);
                Intrinsics.j(couponOptions, "couponOptions");
                this.couponOptions = couponOptions;
            }

            /* renamed from: a, reason: from getter */
            public final CouponOptions getCouponOptions() {
                return this.couponOptions;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$c$e;", "Lcom/meijer/mobile/coupon/list/S$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final e f97582a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -919344570;
            }

            public String toString() {
                return "FetchSpecialOffersCoupons";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$e;", "", "<init>", "()V", "e", "b", "d", "c", "a", "Lcom/meijer/mobile/coupon/list/S$e$a;", "Lcom/meijer/mobile/coupon/list/S$e$b;", "Lcom/meijer/mobile/coupon/list/S$e$c;", "Lcom/meijer/mobile/coupon/list/S$e$d;", "Lcom/meijer/mobile/coupon/list/S$e$e;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$e$a;", "Lcom/meijer/mobile/coupon/list/S$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f97583a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -837561833;
            }

            public String toString() {
                return "SearchCouponZeroResultOrError";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$e$b;", "Lcom/meijer/mobile/coupon/list/S$e;", "", "titleResId", "LPk/a;", "coupon", "<init>", "(ILPk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "LPk/a;", "()LPk/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.S$e$b, reason: from toString */
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$e$c;", "Lcom/meijer/mobile/coupon/list/S$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final c f97586a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1214542564;
            }

            public String toString() {
                return "ShowClipLimitReachedSnackBar";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$e$d;", "Lcom/meijer/mobile/coupon/list/S$e;", "LPk/a;", "coupon", "<init>", "(LPk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/a;", "()LPk/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.S$e$d, reason: from toString */
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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$e$e;", "Lcom/meijer/mobile/coupon/list/S$e;", "", "titleResId", "messageResId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.coupon.list.S$e$e, reason: collision with other inner class name and from toString */
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/coupon/list/S$f;", "", "", "isCouponsLoading", "isFetchCouponsFailed", "Lcom/meijer/mobile/coupon/list/o;", "couponListDecorator", "<init>", "(ZZLcom/meijer/mobile/coupon/list/o;)V", "a", "(ZZLcom/meijer/mobile/coupon/list/o;)Lcom/meijer/mobile/coupon/list/S$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "e", "c", "Lcom/meijer/mobile/coupon/list/o;", "()Lcom/meijer/mobile/coupon/list/o;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.list.S$f, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCouponsLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFetchCouponsFailed;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponListDecorator couponListDecorator;

        public ViewState() {
            this(false, false, null, 7, null);
        }

        public static /* synthetic */ ViewState b(ViewState viewState, boolean z10, boolean z11, CouponListDecorator couponListDecorator, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = viewState.isCouponsLoading;
            }
            if ((i10 & 2) != 0) {
                z11 = viewState.isFetchCouponsFailed;
            }
            if ((i10 & 4) != 0) {
                couponListDecorator = viewState.couponListDecorator;
            }
            return viewState.a(z10, z11, couponListDecorator);
        }

        public final ViewState a(boolean isCouponsLoading, boolean isFetchCouponsFailed, CouponListDecorator couponListDecorator) {
            Intrinsics.j(couponListDecorator, "couponListDecorator");
            return new ViewState(isCouponsLoading, isFetchCouponsFailed, couponListDecorator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.isCouponsLoading == viewState.isCouponsLoading && this.isFetchCouponsFailed == viewState.isFetchCouponsFailed && Intrinsics.e(this.couponListDecorator, viewState.couponListDecorator);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isCouponsLoading) * 31) + Boolean.hashCode(this.isFetchCouponsFailed)) * 31) + this.couponListDecorator.hashCode();
        }

        public String toString() {
            return "ViewState(isCouponsLoading=" + this.isCouponsLoading + ", isFetchCouponsFailed=" + this.isFetchCouponsFailed + ", couponListDecorator=" + this.couponListDecorator + ')';
        }

        public ViewState(boolean z10, boolean z11, CouponListDecorator couponListDecorator) {
            Intrinsics.j(couponListDecorator, "couponListDecorator");
            this.isCouponsLoading = z10;
            this.isFetchCouponsFailed = z11;
            this.couponListDecorator = couponListDecorator;
        }

        /* renamed from: c, reason: from getter */
        public final CouponListDecorator getCouponListDecorator() {
            return this.couponListDecorator;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsCouponsLoading() {
            return this.isCouponsLoading;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getIsFetchCouponsFailed() {
            return this.isFetchCouponsFailed;
        }

        public /* synthetic */ ViewState(boolean z10, boolean z11, CouponListDecorator couponListDecorator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? new CouponListDecorator(0, null, null, false, 15, null) : couponListDecorator);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel", f = "CouponListViewModel.kt", l = {208, 210, 212}, m = "clipCoupon")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97593a;

        /* renamed from: b, reason: collision with root package name */
        Object f97594b;

        /* renamed from: c, reason: collision with root package name */
        Object f97595c;

        /* renamed from: d, reason: collision with root package name */
        Object f97596d;

        /* renamed from: e, reason: collision with root package name */
        Object f97597e;

        /* renamed from: f, reason: collision with root package name */
        int f97598f;

        /* renamed from: g, reason: collision with root package name */
        int f97599g;

        /* renamed from: h, reason: collision with root package name */
        int f97600h;

        /* renamed from: i, reason: collision with root package name */
        int f97601i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f97602j;

        /* renamed from: l, reason: collision with root package name */
        int f97604l;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97602j = obj;
            this.f97604l |= Integer.MIN_VALUE;
            return S.this.x(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel", f = "CouponListViewModel.kt", l = {107, 113, 118}, m = "fetchCoupons")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f97605a;

        /* renamed from: b, reason: collision with root package name */
        boolean f97606b;

        /* renamed from: c, reason: collision with root package name */
        boolean f97607c;

        /* renamed from: d, reason: collision with root package name */
        Object f97608d;

        /* renamed from: e, reason: collision with root package name */
        Object f97609e;

        /* renamed from: f, reason: collision with root package name */
        Object f97610f;

        /* renamed from: g, reason: collision with root package name */
        Object f97611g;

        /* renamed from: h, reason: collision with root package name */
        Object f97612h;

        /* renamed from: i, reason: collision with root package name */
        int f97613i;

        /* renamed from: j, reason: collision with root package name */
        int f97614j;

        /* renamed from: k, reason: collision with root package name */
        int f97615k;

        /* renamed from: l, reason: collision with root package name */
        int f97616l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f97617m;

        /* renamed from: o, reason: collision with root package name */
        int f97619o;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97617m = obj;
            this.f97619o |= Integer.MIN_VALUE;
            return S.this.y(false, false, false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel", f = "CouponListViewModel.kt", l = {250}, m = "fetchSpecialOffersBannerUrl")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97620a;

        /* renamed from: b, reason: collision with root package name */
        Object f97621b;

        /* renamed from: c, reason: collision with root package name */
        Object f97622c;

        /* renamed from: d, reason: collision with root package name */
        Object f97623d;

        /* renamed from: e, reason: collision with root package name */
        int f97624e;

        /* renamed from: f, reason: collision with root package name */
        int f97625f;

        /* renamed from: g, reason: collision with root package name */
        int f97626g;

        /* renamed from: h, reason: collision with root package name */
        int f97627h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f97628i;

        /* renamed from: k, reason: collision with root package name */
        int f97630k;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97628i = obj;
            this.f97630k |= Integer.MIN_VALUE;
            return S.this.B(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel$onAction$1", f = "CouponListViewModel.kt", l = {268}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97631a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return S.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97631a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                S s10 = S.this;
                this.f97631a = 1;
                if (S.A(s10, true, true, false, null, this, 12, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel$onAction$2", f = "CouponListViewModel.kt", l = {277}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97633a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f97634b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f97635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(c cVar, S s10, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f97634b = cVar;
            this.f97635c = s10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new k(this.f97634b, this.f97635c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97633a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                CouponOptions couponOptions = ((c.FetchSearchCoupons) this.f97634b).getCouponOptions();
                S s10 = this.f97635c;
                this.f97633a = 1;
                if (S.A(s10, false, false, true, couponOptions, this, 3, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel$onAction$3", f = "CouponListViewModel.kt", l = {285}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97636a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f97638c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(c cVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f97638c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return S.this.new l(this.f97638c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97636a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                S s10 = S.this;
                CouponOptions couponOptions = ((c.FetchAdCoupons) this.f97638c).getCouponOptions();
                this.f97636a = 1;
                if (S.A(s10, false, false, false, couponOptions, this, 7, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel$onAction$4", f = "CouponListViewModel.kt", l = {HttpResponseStatus.SUCCESS_UNKNOWN}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97639a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f97641c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(c cVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f97641c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return S.this.new m(this.f97641c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97639a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                S s10 = S.this;
                CouponOptions couponOptions = ((c.FetchBundleCoupons) this.f97641c).getCouponOptions();
                this.f97639a = 1;
                if (S.A(s10, false, false, false, couponOptions, this, 7, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel$onAction$5", f = "CouponListViewModel.kt", l = {293}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97642a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f97644c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(c cVar, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f97644c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return S.this.new n(this.f97644c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97642a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                S s10 = S.this;
                CouponOptions couponOptions = ((c.FetchShoppingListRelatedCoupons) this.f97644c).getCouponOptions();
                this.f97642a = 1;
                if (S.A(s10, false, false, false, couponOptions, this, 7, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel$onAction$6", f = "CouponListViewModel.kt", l = {}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97645a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Qk.a f97647c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return S.this.new o(this.f97647c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Qk.a aVar, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f97647c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f97645a == 0) {
                ResultKt.b(obj);
                S.this.K(((a.Clip) this.f97647c).getCoupon());
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel$onAction$7", f = "CouponListViewModel.kt", l = {342}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97648a;

        /* renamed from: b, reason: collision with root package name */
        Object f97649b;

        /* renamed from: c, reason: collision with root package name */
        Object f97650c;

        /* renamed from: d, reason: collision with root package name */
        Object f97651d;

        /* renamed from: e, reason: collision with root package name */
        int f97652e;

        /* renamed from: f, reason: collision with root package name */
        int f97653f;

        /* renamed from: g, reason: collision with root package name */
        int f97654g;

        /* renamed from: h, reason: collision with root package name */
        int f97655h;

        /* renamed from: i, reason: collision with root package name */
        int f97656i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f97657j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Qk.a f97659l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            p pVar = S.this.new p(this.f97659l, continuation);
            pVar.f97657j = obj;
            return pVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Qk.a aVar, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f97659l = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97656i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f97657j;
                    S s10 = S.this;
                    Qk.a aVar = this.f97659l;
                    Result.Companion companion = Result.INSTANCE;
                    C13702d c13702d = s10.couponsRepository;
                    Pk.c coupon = ((a.Unclip) aVar).getCoupon();
                    this.f97657j = interfaceC15783O;
                    this.f97648a = interfaceC15783O;
                    this.f97649b = this;
                    this.f97650c = this;
                    this.f97651d = interfaceC15783O;
                    this.f97652e = 0;
                    this.f97653f = 0;
                    this.f97654g = 0;
                    this.f97655h = 0;
                    this.f97656i = 1;
                    obj = c13702d.H(coupon, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Error unclipping coupon", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel$onAction$8", f = "CouponListViewModel.kt", l = {348}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97660a;

        /* renamed from: b, reason: collision with root package name */
        Object f97661b;

        /* renamed from: c, reason: collision with root package name */
        Object f97662c;

        /* renamed from: d, reason: collision with root package name */
        Object f97663d;

        /* renamed from: e, reason: collision with root package name */
        int f97664e;

        /* renamed from: f, reason: collision with root package name */
        int f97665f;

        /* renamed from: g, reason: collision with root package name */
        int f97666g;

        /* renamed from: h, reason: collision with root package name */
        int f97667h;

        /* renamed from: i, reason: collision with root package name */
        int f97668i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f97669j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Qk.a f97671l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            q qVar = S.this.new q(this.f97671l, continuation);
            qVar.f97669j = obj;
            return qVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Qk.a aVar, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f97671l = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97668i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f97669j;
                    S s10 = S.this;
                    Qk.a aVar = this.f97671l;
                    Result.Companion companion = Result.INSTANCE;
                    C13702d c13702d = s10.couponsRepository;
                    Pk.c coupon = ((a.NotInterested) aVar).getCoupon();
                    this.f97669j = interfaceC15783O;
                    this.f97660a = interfaceC15783O;
                    this.f97661b = this;
                    this.f97662c = this;
                    this.f97663d = interfaceC15783O;
                    this.f97664e = 0;
                    this.f97665f = 0;
                    this.f97666g = 0;
                    this.f97667h = 0;
                    this.f97668i = 1;
                    obj = c13702d.y(coupon, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Error hiding coupon", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel", f = "CouponListViewModel.kt", l = {176, 192}, m = "onGetCouponsFailed")
    static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97672a;

        /* renamed from: b, reason: collision with root package name */
        Object f97673b;

        /* renamed from: c, reason: collision with root package name */
        boolean f97674c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f97675d;

        /* renamed from: f, reason: collision with root package name */
        int f97677f;

        r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97675d = obj;
            this.f97677f |= Integer.MIN_VALUE;
            return S.this.H(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel", f = "CouponListViewModel.kt", l = {152, 154}, m = "onGetCouponsSuccess")
    static final class s extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97678a;

        /* renamed from: b, reason: collision with root package name */
        Object f97679b;

        /* renamed from: c, reason: collision with root package name */
        boolean f97680c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f97681d;

        /* renamed from: f, reason: collision with root package name */
        int f97683f;

        s(Continuation<? super s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97681d = obj;
            this.f97683f |= Integer.MIN_VALUE;
            return S.this.I(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class t extends FunctionReferenceImpl implements Function2<Coupon, Continuation<? super Unit>, Object>, SuspendFunction {
        t(Object obj) {
            super(2, obj, S.class, "clipCoupon", "clipCoupon(Lcom/meijer/mobile/coupon/model/common/Coupon;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Coupon coupon, Continuation<? super Unit> continuation) {
            return ((S) this.receiver).x(coupon, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LPk/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListViewModel$safeClipCoupon$2", f = "CouponListViewModel.kt", l = {}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function3<InterfaceC16562g<? super Coupon>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f97684a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f97685b;

        u(Continuation<? super u> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Coupon> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            u uVar = new u(continuation);
            uVar.f97685b = th2;
            return uVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f97684a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f97685b, "Error clipping coupon", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public S(C13702d couponsRepository, Yk.u couponStateRepository, InterfaceC14523a analyticsEngine, AbstractC15779K ioDispatcher) {
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(couponStateRepository, "couponStateRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.couponsRepository = couponsRepository;
        this.couponStateRepository = couponStateRepository;
        this.analyticsEngine = analyticsEngine;
        this.ioDispatcher = ioDispatcher;
        this._couponListStateFlow = pv.S.a(new ViewState(false, false, null, 7, null));
        InterfaceC16548A<e> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC16548AB;
        this.eventFlow = C16563h.b(interfaceC16548AB);
        C16563h.J(C16563h.g(C16563h.O(C16563h.H(couponStateRepository.M(), ioDispatcher), new a(this)), new b(null)), d0.a(this));
    }

    static /* synthetic */ Object A(S s10, boolean z10, boolean z11, boolean z12, CouponOptions couponOptions, Continuation continuation, int i10, Object obj) {
        return s10.y((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? new CouponOptions(null, null, CouponsSortType.RELEVANCE, false, false, 0L, null, null, false, null, null, false, false, 8171, null) : couponOptions, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof com.meijer.mobile.coupon.list.S.i
            if (r2 == 0) goto L17
            r2 = r0
            com.meijer.mobile.coupon.list.S$i r2 = (com.meijer.mobile.coupon.list.S.i) r2
            int r3 = r2.f97630k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f97630k = r3
            goto L1c
        L17:
            com.meijer.mobile.coupon.list.S$i r2 = new com.meijer.mobile.coupon.list.S$i
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f97628i
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f97630k
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L48
            if (r4 != r5) goto L40
            java.lang.Object r3 = r2.f97623d
            com.meijer.mobile.coupon.list.S r3 = (com.meijer.mobile.coupon.list.S) r3
            java.lang.Object r3 = r2.f97622c
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r3 = r2.f97621b
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r3 = r2.f97620a
            com.meijer.mobile.coupon.list.S r3 = (com.meijer.mobile.coupon.list.S) r3
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Exception -> L3e
            goto L6a
        L3e:
            r0 = move-exception
            goto L6f
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L48:
            kotlin.ResultKt.b(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3e
            dl.d r0 = s(r1)     // Catch: java.lang.Exception -> L3e
            r2.f97620a = r1     // Catch: java.lang.Exception -> L3e
            r2.f97621b = r2     // Catch: java.lang.Exception -> L3e
            r2.f97622c = r2     // Catch: java.lang.Exception -> L3e
            r2.f97623d = r1     // Catch: java.lang.Exception -> L3e
            r2.f97624e = r6     // Catch: java.lang.Exception -> L3e
            r2.f97625f = r6     // Catch: java.lang.Exception -> L3e
            r2.f97626g = r6     // Catch: java.lang.Exception -> L3e
            r2.f97627h = r6     // Catch: java.lang.Exception -> L3e
            r2.f97630k = r5     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r0.v(r2)     // Catch: java.lang.Exception -> L3e
            if (r0 != r3) goto L6a
            return r3
        L6a:
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L3e
            goto L80
        L6f:
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            mv.E0.i(r2)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L80:
            boolean r2 = kotlin.Result.h(r0)
            if (r2 == 0) goto Lb0
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            pv.B<com.meijer.mobile.coupon.list.S$f> r2 = r1._couponListStateFlow
        L8b:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            com.meijer.mobile.coupon.list.S$f r4 = (com.meijer.mobile.coupon.list.S.ViewState) r4
            com.meijer.mobile.coupon.list.o r7 = r4.getCouponListDecorator()
            r12 = 11
            r13 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            com.meijer.mobile.coupon.list.o r14 = com.meijer.mobile.coupon.list.CouponListDecorator.b(r7, r8, r9, r10, r11, r12, r13)
            r15 = 2
            r16 = 0
            r12 = 0
            r13 = 0
            r11 = r4
            com.meijer.mobile.coupon.list.S$f r4 = com.meijer.mobile.coupon.list.S.ViewState.b(r11, r12, r13, r14, r15, r16)
            boolean r3 = r2.e(r3, r4)
            if (r3 == 0) goto L8b
        Lb0:
            java.lang.Throwable r0 = kotlin.Result.e(r0)
            if (r0 == 0) goto Lbf
            qw.a$a r2 = qw.a.INSTANCE
            java.lang.String r3 = "Failed to fetch special offers"
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r2.f(r0, r3, r4)
        Lbf:
            kotlin.Unit r0 = kotlin.Unit.f143329a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.S.B(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object G(Coupon coupon, Continuation<? super Unit> continuation) {
        this.couponStateRepository.S(CollectionsKt.e(Coupon.e(coupon, 0L, false, false, null, null, true, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741791, null)));
        Object objEmit = this._eventFlow.emit(new e.ShowCouponClippedSnackBar(coupon), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r2.emit(r5, r3) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r7.emit(r8, r3) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(java.lang.Throwable r18, boolean r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof com.meijer.mobile.coupon.list.S.r
            if (r3 == 0) goto L19
            r3 = r2
            com.meijer.mobile.coupon.list.S$r r3 = (com.meijer.mobile.coupon.list.S.r) r3
            int r4 = r3.f97677f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f97677f = r4
            goto L1e
        L19:
            com.meijer.mobile.coupon.list.S$r r3 = new com.meijer.mobile.coupon.list.S$r
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.f97675d
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.f97677f
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4d
            if (r5 == r7) goto L43
            if (r5 != r6) goto L3b
            java.lang.Object r1 = r3.f97673b
            sk.b r1 = (sk.b) r1
            java.lang.Object r1 = r3.f97672a
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            kotlin.ResultKt.b(r2)
            goto Lb3
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L43:
            boolean r1 = r3.f97674c
            java.lang.Object r5 = r3.f97672a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            kotlin.ResultKt.b(r2)
            goto L68
        L4d:
            kotlin.ResultKt.b(r2)
            if (r1 == 0) goto L65
            pv.A<com.meijer.mobile.coupon.list.S$e> r2 = r0._eventFlow
            com.meijer.mobile.coupon.list.S$e$a r5 = com.meijer.mobile.coupon.list.S.e.a.f97583a
            r8 = r18
            r3.f97672a = r8
            r3.f97674c = r1
            r3.f97677f = r7
            java.lang.Object r2 = r2.emit(r5, r3)
            if (r2 != r4) goto L67
            goto Lb2
        L65:
            r8 = r18
        L67:
            r5 = r8
        L68:
            pv.B<com.meijer.mobile.coupon.list.S$f> r2 = r0._couponListStateFlow
        L6a:
            java.lang.Object r8 = r2.getValue()
            r9 = r8
            com.meijer.mobile.coupon.list.S$f r9 = (com.meijer.mobile.coupon.list.S.ViewState) r9
            com.meijer.mobile.coupon.list.o r10 = r9.getCouponListDecorator()
            r15 = 2
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.meijer.mobile.coupon.list.o r10 = com.meijer.mobile.coupon.list.CouponListDecorator.b(r10, r11, r12, r13, r14, r15, r16)
            com.meijer.mobile.coupon.list.S$f r9 = r9.a(r11, r7, r10)
            boolean r8 = r2.e(r8, r9)
            if (r8 == 0) goto L6a
            com.meijer.mobile.core.networking.exceptions.RetrofitException r2 = com.meijer.mobile.core.networking.exceptions.a.a(r5)
            sk.b r2 = r2.getErrorType()
            boolean r7 = r2 instanceof el.CouponsResponse.EnumC2049a
            if (r7 == 0) goto Lb6
            pv.A<com.meijer.mobile.coupon.list.S$e> r7 = r0._eventFlow
            com.meijer.mobile.coupon.list.S$e$e r8 = new com.meijer.mobile.coupon.list.S$e$e
            r9 = r2
            el.a$a r9 = (el.CouponsResponse.EnumC2049a) r9
            int r9 = r9.getMessageResourceId()
            r8.<init>(r11, r9)
            r3.f97672a = r5
            r3.f97673b = r2
            r3.f97674c = r1
            r3.f97677f = r6
            java.lang.Object r1 = r7.emit(r8, r3)
            if (r1 != r4) goto Lb3
        Lb2:
            return r4
        Lb3:
            kotlin.Unit r1 = kotlin.Unit.f143329a
            return r1
        Lb6:
            kotlin.Unit r1 = kotlin.Unit.f143329a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.S.H(java.lang.Throwable, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        if (B(r3) == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        if (r2.emit(r8, r3) == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(el.CouponsResponse r18, boolean r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.S.I(el.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(List list, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.c(Rk.b.f33418a.k(list.size()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Pk.c couponIdentity) {
        C16563h.J(C16563h.g(C16563h.O(C16563h.H(C16563h.Z(this.couponsRepository.j(couponIdentity), 1), this.ioDispatcher), new t(this)), new u(null)), d0.a(this));
    }

    private final void onCouponState(List<CouponState> couponStateList) {
        InterfaceC16549B<ViewState> interfaceC16549B = this._couponListStateFlow;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            ViewState viewState = value;
            List<CouponState> list = couponStateList;
            if (interfaceC16549B.e(value, ViewState.b(viewState, false, false, CouponListDecorator.b(viewState.getCouponListDecorator(), 0, list, null, false, 13, null), 3, null))) {
                return;
            } else {
                couponStateList = list;
            }
        }
    }

    private final void w() {
        ViewState value;
        ViewState viewState;
        this.couponStateRepository.R(CollectionsKt.m());
        InterfaceC16549B<ViewState> interfaceC16549B = this._couponListStateFlow;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, false, false, CouponListDecorator.b(viewState.getCouponListDecorator(), 0, null, null, false, 14, null), 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e3, code lost:
    
        if (F(r4, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(Pk.Coupon r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.S.x(Pk.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        r15 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0148, code lost:
    
        if (H(r0, r3, r8) == r2) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(boolean r22, boolean r23, boolean r24, Sk.CouponOptions r25, kotlin.coroutines.Continuation<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.S.y(boolean, boolean, boolean, Sk.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final pv.P<ViewState> C() {
        return C16563h.c(this._couponListStateFlow);
    }

    public final InterfaceC16553F<e> D() {
        return this.eventFlow;
    }

    public final void E(c action) {
        Intrinsics.j(action, "action");
        if (action instanceof c.e) {
            C15809k.d(d0.a(this), null, null, new j(null), 3, null);
            return;
        }
        if (action instanceof c.FetchSearchCoupons) {
            w();
            C15809k.d(d0.a(this), null, null, new k(action, this, null), 3, null);
        } else if (action instanceof c.FetchAdCoupons) {
            C15809k.d(d0.a(this), null, null, new l(action, null), 3, null);
        } else if (action instanceof c.FetchBundleCoupons) {
            C15809k.d(d0.a(this), null, null, new m(action, null), 3, null);
        } else {
            if (!(action instanceof c.FetchShoppingListRelatedCoupons)) {
                throw new NoWhenBranchMatchedException();
            }
            C15809k.d(d0.a(this), null, null, new n(action, null), 3, null);
        }
    }

    public void onAction(Qk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            C15809k.d(d0.a(this), null, null, new o(action, null), 3, null);
            return;
        }
        if (action instanceof a.Unclip) {
            C15809k.d(d0.a(this), null, null, new p(action, null), 3, null);
            return;
        }
        if (action instanceof a.NotInterested) {
            C15809k.d(d0.a(this), null, null, new q(action, null), 3, null);
        } else {
            if (!(action instanceof a.ViewCouponList) && !(action instanceof a.ViewCouponDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.f143329a;
        }
    }

    private final Object F(CouponException couponException, Continuation<? super Unit> continuation) {
        e showClipCouponErrorSnackBar;
        int messageResourceId;
        sk.b errorType;
        if (couponException.getErrorType() != null && ((errorType = couponException.getErrorType()) == null || errorType.getResultCode() > 30)) {
            return Unit.f143329a;
        }
        if (couponException.getExceptionKind() == RetrofitException.b.f97000b) {
            showClipCouponErrorSnackBar = new e.ShowClipCouponErrorSnackBar(Nr.g.f22714t, couponException.getCoupon());
        } else if (couponException.getErrorType() == AddOfferErrorType.CLIPPED_COUPONS_LIMIT_ERROR) {
            showClipCouponErrorSnackBar = e.c.f97586a;
        } else {
            sk.b errorType2 = couponException.getErrorType();
            if (errorType2 != null) {
                messageResourceId = errorType2.getMessageResourceId();
            } else {
                messageResourceId = Nr.g.f22702n;
            }
            showClipCouponErrorSnackBar = new e.ShowClipCouponErrorSnackBar(messageResourceId, couponException.getCoupon());
        }
        Object objEmit = this._eventFlow.emit(showClipCouponErrorSnackBar, continuation);
        if (objEmit == IntrinsicsKt.f()) {
            return objEmit;
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object n(S s10, List list, Continuation continuation) {
        s10.onCouponState(list);
        return Unit.f143329a;
    }
}
