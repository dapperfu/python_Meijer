package Zk;

import Ok.Coupon;
import al.EnumC5609a;
import com.meijer.mobile.core.models.coupon.CouponAd;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupons.api.models.Category;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.api.models.CouponsRequest;
import com.meijer.mobile.coupons.api.models.GetAdsResponse;
import com.meijer.mobile.coupons.api.models.SpecialOffersUrlResponse;
import com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsResponse;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import dl.CouponsResponse;
import j$.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.E0;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001:B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0017\u001a\u00020\u00162\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00162\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u0018J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0086@¢\u0006\u0004\b\"\u0010#J \u0010&\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010%\u001a\u00020$H\u0086@¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b(\u0010)J\"\u0010-\u001a\u00020$2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020$H\u0086@¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020\u00162\u0006\u00100\u001a\u00020/H\u0086@¢\u0006\u0004\b1\u00102J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0086@¢\u0006\u0004\b4\u0010)J*\u00108\u001a\b\u0012\u0004\u0012\u0002070\u001c2\u0006\u00106\u001a\u0002052\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0086@¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010>¨\u0006?"}, d2 = {"LZk/a;", "", "LXi/a;", "userTokenProvider", "Lqv/K;", "ioDispatcher", "LZk/b;", "couponsApi", "<init>", "(LXi/a;Lqv/K;LZk/b;)V", "Ldl/a;", "couponsResponse", "", "specialOffersBannerURL", "m", "(Ldl/a;Ljava/lang/String;)Ldl/a;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "d", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "Lal/a;", "categoryFilter", "", "Lcom/meijer/mobile/coupons/api/models/Category;", "f", "(Lal/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "request", "g", "(Lcom/meijer/mobile/coupons/api/models/CouponsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requireSpecialOffers", "h", "(Lcom/meijer/mobile/coupons/api/models/CouponsRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LOk/c;", "coupon", "hide", "k", "(LOk/c;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZk/a$a;", "clipAction", "c", "(LZk/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "e", "j$/time/LocalDate", "weeklyAdStartDate", "Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse$AdBlockWithCoupons;", "i", "(Lj$/time/LocalDate;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LXi/a;", "b", "Lqv/K;", "LZk/b;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Xi.a userTokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Zk.b couponsApi;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\fB\u001d\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"LZk/a$a;", "", "LOk/a;", "coupon", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(LOk/a;I)V", "a", "LOk/a;", "()LOk/a;", "b", "I", "getStoreId", "()I", "LZk/a$a$a;", "LZk/a$a$b;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zk.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0923a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Coupon coupon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int storeId;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"LZk/a$a$a;", "LZk/a$a;", "LOk/a;", "coupon", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(LOk/a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LOk/a;", "a", "()LOk/a;", "d", "I", "b", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zk.a$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class Clip extends AbstractC0923a {

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Coupon coupon;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int storeId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Clip)) {
                    return false;
                }
                Clip clip = (Clip) other;
                return Intrinsics.e(this.coupon, clip.coupon) && this.storeId == clip.storeId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Clip(Coupon coupon, int i10) {
                super(coupon, i10, null);
                Intrinsics.j(coupon, "coupon");
                this.coupon = coupon;
                this.storeId = i10;
            }

            @Override // Zk.a.AbstractC0923a
            /* renamed from: a, reason: from getter */
            public Coupon getCoupon() {
                return this.coupon;
            }

            /* renamed from: b, reason: from getter */
            public int getStoreId() {
                return this.storeId;
            }

            public int hashCode() {
                return (this.coupon.hashCode() * 31) + Integer.hashCode(this.storeId);
            }

            public String toString() {
                return "Clip(coupon=" + this.coupon + ", storeId=" + this.storeId + ')';
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"LZk/a$a$b;", "LZk/a$a;", "LOk/a;", "coupon", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(LOk/a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LOk/a;", "a", "()LOk/a;", "d", "I", "b", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zk.a$a$b, reason: from toString */
        public static final /* data */ class UnClip extends AbstractC0923a {

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Coupon coupon;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int storeId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UnClip)) {
                    return false;
                }
                UnClip unClip = (UnClip) other;
                return Intrinsics.e(this.coupon, unClip.coupon) && this.storeId == unClip.storeId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnClip(Coupon coupon, int i10) {
                super(coupon, i10, null);
                Intrinsics.j(coupon, "coupon");
                this.coupon = coupon;
                this.storeId = i10;
            }

            @Override // Zk.a.AbstractC0923a
            /* renamed from: a, reason: from getter */
            public Coupon getCoupon() {
                return this.coupon;
            }

            /* renamed from: b, reason: from getter */
            public int getStoreId() {
                return this.storeId;
            }

            public int hashCode() {
                return (this.coupon.hashCode() * 31) + Integer.hashCode(this.storeId);
            }

            public String toString() {
                return "UnClip(coupon=" + this.coupon + ", storeId=" + this.storeId + ')';
            }
        }

        public /* synthetic */ AbstractC0923a(Coupon coupon, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(coupon, i10);
        }

        private AbstractC0923a(Coupon coupon, int i10) {
            this.coupon = coupon;
            this.storeId = i10;
        }

        /* renamed from: a, reason: from getter */
        public Coupon getCoupon() {
            return this.coupon;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource", f = "CouponsDataSource.kt", l = {157, 162}, m = "clipAction")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f42797a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f42798b;

        /* renamed from: d, reason: collision with root package name */
        int f42800d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42798b = obj;
            this.f42800d |= Integer.MIN_VALUE;
            return a.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$clipCoupon$2", f = "CouponsDataSource.kt", l = {134, 133}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super ClipUnclipCouponResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f42801a;

        /* renamed from: b, reason: collision with root package name */
        int f42802b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f42804d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f42805e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f42804d = j10;
            this.f42805e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new c(this.f42804d, this.f42805e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super ClipUnclipCouponResponse> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f42802b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r11)
                goto L56
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                java.lang.Object r1 = r10.f42801a
                Zk.b r1 = (Zk.b) r1
                kotlin.ResultKt.b(r11)
                goto L3c
            L22:
                kotlin.ResultKt.b(r11)
                Zk.a r11 = Zk.a.this
                Zk.b r1 = Zk.a.a(r11)
                Zk.a r11 = Zk.a.this
                Xi.a r11 = Zk.a.b(r11)
                r10.f42801a = r1
                r10.f42802b = r3
                java.lang.Object r11 = r11.c(r10)
                if (r11 != r0) goto L3c
                goto L55
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r11 = (com.meijer.mobile.authentication.core.model.BearerToken) r11
                com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r3 = new com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest
                long r4 = r10.f42804d
                int r6 = r10.f42805e
                r8 = 4
                r9 = 0
                r7 = 0
                r3.<init>(r4, r6, r7, r8, r9)
                r4 = 0
                r10.f42801a = r4
                r10.f42802b = r2
                java.lang.Object r11 = r1.f(r11, r3, r10)
                if (r11 != r0) goto L56
            L55:
                return r0
            L56:
                retrofit2.Response r11 = (retrofit2.Response) r11
                boolean r0 = r11.isSuccessful()
                if (r0 == 0) goto L66
                java.lang.Object r11 = r11.body()
                kotlin.jvm.internal.Intrinsics.g(r11)
                return r11
            L66:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Zk.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$getCouponAds$2", f = "CouponsDataSource.kt", l = {178}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends CouponAd>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42806a;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends CouponAd>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<CouponAd>>) continuation);
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new d(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<CouponAd>> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42806a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Zk.b bVar = a.this.couponsApi;
                this.f42806a = 1;
                obj = bVar.a(this);
                if (obj == objF) {
                    return objF;
                }
            }
            return ((GetAdsResponse) obj).a();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lcom/meijer/mobile/coupons/api/models/Category;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$getCouponCategories$2", f = "CouponsDataSource.kt", l = {48, 47}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends Category>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f42808a;

        /* renamed from: b, reason: collision with root package name */
        int f42809b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC5609a f42811d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends Category>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<Category>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(EnumC5609a enumC5609a, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f42811d = enumC5609a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new e(this.f42811d, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<Category>> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f42809b
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.ResultKt.b(r6)
                goto L50
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                java.lang.Object r1 = r5.f42808a
                Zk.b r1 = (Zk.b) r1
                kotlin.ResultKt.b(r6)
                goto L3d
            L23:
                kotlin.ResultKt.b(r6)
                Zk.a r6 = Zk.a.this
                Zk.b r1 = Zk.a.a(r6)
                Zk.a r6 = Zk.a.this
                Xi.a r6 = Zk.a.b(r6)
                r5.f42808a = r1
                r5.f42809b = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3d
                goto L4f
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                al.a r4 = r5.f42811d
                java.lang.String r4 = r4.getValue()
                r5.f42808a = r2
                r5.f42809b = r3
                java.lang.Object r6 = r1.h(r6, r4, r5)
                if (r6 != r0) goto L50
            L4f:
                return r0
            L50:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L6c
                java.lang.Object r6 = r6.body()
                com.meijer.mobile.coupons.api.models.CategoriesResponse r6 = (com.meijer.mobile.coupons.api.models.CategoriesResponse) r6
                if (r6 == 0) goto L64
                java.util.List r2 = r6.a()
            L64:
                if (r2 != 0) goto L6b
                java.util.List r6 = kotlin.collections.CollectionsKt.m()
                return r6
            L6b:
                return r2
            L6c:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Zk.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Ldl/a;", "<anonymous>", "(Lqv/O;)Ldl/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$getCoupons$2", f = "CouponsDataSource.kt", l = {57, 64, 71, 70}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super CouponsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f42812a;

        /* renamed from: b, reason: collision with root package name */
        int f42813b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponsRequest f42814c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f42815d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CouponsRequest couponsRequest, a aVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f42814c = couponsRequest;
            this.f42815d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f42814c, this.f42815d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super CouponsResponse> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        
            if (r2 == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
        
            if (r2 != r1) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Zk.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource", f = "CouponsDataSource.kt", l = {81, 83}, m = "getCoupons")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f42816a;

        /* renamed from: b, reason: collision with root package name */
        Object f42817b;

        /* renamed from: c, reason: collision with root package name */
        boolean f42818c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f42819d;

        /* renamed from: f, reason: collision with root package name */
        int f42821f;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42819d = obj;
            this.f42821f |= Integer.MIN_VALUE;
            return a.this.h(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse$AdBlockWithCoupons;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$getCouponsForWeeklyAd$2", f = "CouponsDataSource.kt", l = {186, 185}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f42822a;

        /* renamed from: b, reason: collision with root package name */
        int f42823b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalDate f42825d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f42826e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(LocalDate localDate, int i10, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f42825d = localDate;
            this.f42826e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new h(this.f42825d, this.f42826e, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
        
            if (r12 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f42823b
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L23
                if (r1 == r2) goto L1b
                if (r1 != r3) goto L13
                kotlin.ResultKt.b(r12)
                goto L61
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                java.lang.Object r1 = r11.f42822a
                Zk.b r1 = (Zk.b) r1
                kotlin.ResultKt.b(r12)
                goto L3d
            L23:
                kotlin.ResultKt.b(r12)
                Zk.a r12 = Zk.a.this
                Zk.b r1 = Zk.a.a(r12)
                Zk.a r12 = Zk.a.this
                Xi.a r12 = Zk.a.b(r12)
                r11.f42822a = r1
                r11.f42823b = r2
                java.lang.Object r12 = r12.b(r11)
                if (r12 != r0) goto L3d
                goto L60
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r12 = (com.meijer.mobile.authentication.core.model.BearerToken) r12
                com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsRequest r5 = new com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsRequest
                j$.time.LocalDate r2 = r11.f42825d
                j$.time.format.DateTimeFormatter r6 = vk.C17590a.ISO_LOCAL_DATE
                java.lang.String r6 = r2.format(r6)
                java.lang.String r2 = "format(...)"
                kotlin.jvm.internal.Intrinsics.i(r6, r2)
                int r7 = r11.f42826e
                r9 = 4
                r10 = 0
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r11.f42822a = r4
                r11.f42823b = r3
                java.lang.Object r12 = r1.c(r12, r5, r11)
                if (r12 != r0) goto L61
            L60:
                return r0
            L61:
                com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsResponse r12 = (com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsResponse) r12
                int r0 = r12.getResponseCode()
                if (r0 <= 0) goto L6a
                r12 = r4
            L6a:
                if (r12 == 0) goto L79
                java.util.List r12 = r12.a()
                if (r12 != 0) goto L76
                java.util.List r12 = kotlin.collections.CollectionsKt.m()
            L76:
                if (r12 == 0) goto L79
                return r12
            L79:
                com.meijer.mobile.core.networking.exceptions.RetrofitException$a r12 = com.meijer.mobile.core.networking.exceptions.RetrofitException.INSTANCE
                rk.d r0 = rk.d.f159056e
                com.meijer.mobile.core.networking.exceptions.RetrofitException r12 = com.meijer.mobile.core.networking.exceptions.RetrofitException.Companion.f(r12, r0, r4, r3, r4)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: Zk.a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$getSpecialOffersBanner$2", f = "CouponsDataSource.kt", l = {105}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f42827a;

        /* renamed from: b, reason: collision with root package name */
        Object f42828b;

        /* renamed from: c, reason: collision with root package name */
        Object f42829c;

        /* renamed from: d, reason: collision with root package name */
        Object f42830d;

        /* renamed from: e, reason: collision with root package name */
        int f42831e;

        /* renamed from: f, reason: collision with root package name */
        int f42832f;

        /* renamed from: g, reason: collision with root package name */
        int f42833g;

        /* renamed from: h, reason: collision with root package name */
        int f42834h;

        /* renamed from: i, reason: collision with root package name */
        int f42835i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f42836j;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = a.this.new i(continuation);
            iVar.f42836j = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super String> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42835i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f42836j;
                    a aVar = a.this;
                    Result.Companion companion = Result.INSTANCE;
                    Zk.b bVar = aVar.couponsApi;
                    this.f42836j = interfaceC16622O;
                    this.f42827a = interfaceC16622O;
                    this.f42828b = this;
                    this.f42829c = this;
                    this.f42830d = interfaceC16622O;
                    this.f42831e = 0;
                    this.f42832f = 0;
                    this.f42833g = 0;
                    this.f42834h = 0;
                    this.f42835i = 1;
                    obj = bVar.g(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(((SpecialOffersUrlResponse) obj).getSpecialOffersBannerURL());
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            if (Result.e(objB) != null) {
                return null;
            }
            return objB;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)Z"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$hideCoupon$2", f = "CouponsDataSource.kt", l = {121, BinsView.TOTE_HEIGHT_DP}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f42838a;

        /* renamed from: b, reason: collision with root package name */
        int f42839b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ok.c f42841d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f42842e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Ok.c cVar, boolean z10, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f42841d = cVar;
            this.f42842e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new j(this.f42841d, this.f42842e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Boolean> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f42839b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r7)
                goto L5b
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f42838a
                Zk.b r1 = (Zk.b) r1
                kotlin.ResultKt.b(r7)
                goto L3c
            L22:
                kotlin.ResultKt.b(r7)
                Zk.a r7 = Zk.a.this
                Zk.b r1 = Zk.a.a(r7)
                Zk.a r7 = Zk.a.this
                Xi.a r7 = Zk.a.b(r7)
                r6.f42838a = r1
                r6.f42839b = r3
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L3c
                goto L5a
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r7 = (com.meijer.mobile.authentication.core.model.BearerToken) r7
                com.meijer.mobile.coupons.api.models.HideCouponRequest r3 = new com.meijer.mobile.coupons.api.models.HideCouponRequest
                Ok.c r4 = r6.f42841d
                long r4 = r4.getOfferId()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                boolean r5 = r6.f42842e
                r3.<init>(r4, r5)
                r4 = 0
                r6.f42838a = r4
                r6.f42839b = r2
                java.lang.Object r7 = r1.i(r7, r3, r6)
                if (r7 != r0) goto L5b
            L5a:
                return r0
            L5b:
                retrofit2.Response r7 = (retrofit2.Response) r7
                boolean r7 = r7.isSuccessful()
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.a(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Zk.a.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$unclipCoupon$2", f = "CouponsDataSource.kt", l = {144, 143}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super ClipUnclipCouponResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f42843a;

        /* renamed from: b, reason: collision with root package name */
        int f42844b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f42846d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f42847e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(long j10, int i10, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f42846d = j10;
            this.f42847e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new k(this.f42846d, this.f42847e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super ClipUnclipCouponResponse> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f42844b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r11)
                goto L56
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                java.lang.Object r1 = r10.f42843a
                Zk.b r1 = (Zk.b) r1
                kotlin.ResultKt.b(r11)
                goto L3c
            L22:
                kotlin.ResultKt.b(r11)
                Zk.a r11 = Zk.a.this
                Zk.b r1 = Zk.a.a(r11)
                Zk.a r11 = Zk.a.this
                Xi.a r11 = Zk.a.b(r11)
                r10.f42843a = r1
                r10.f42844b = r3
                java.lang.Object r11 = r11.c(r10)
                if (r11 != r0) goto L3c
                goto L55
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r11 = (com.meijer.mobile.authentication.core.model.BearerToken) r11
                com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r3 = new com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest
                long r4 = r10.f42846d
                int r6 = r10.f42847e
                r8 = 4
                r9 = 0
                r7 = 0
                r3.<init>(r4, r6, r7, r8, r9)
                r4 = 0
                r10.f42843a = r4
                r10.f42844b = r2
                java.lang.Object r11 = r1.e(r11, r3, r10)
                if (r11 != r0) goto L56
            L55:
                return r0
            L56:
                retrofit2.Response r11 = (retrofit2.Response) r11
                boolean r0 = r11.isSuccessful()
                if (r0 == 0) goto L66
                java.lang.Object r11 = r11.body()
                kotlin.jvm.internal.Intrinsics.g(r11)
                return r11
            L66:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Zk.a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(Xi.a userTokenProvider, AbstractC16618K ioDispatcher, Zk.b couponsApi) {
        Intrinsics.j(userTokenProvider, "userTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        Intrinsics.j(couponsApi, "couponsApi");
        this.userTokenProvider = userTokenProvider;
        this.ioDispatcher = ioDispatcher;
        this.couponsApi = couponsApi;
    }

    private final Object d(long j10, int i10, Continuation<? super ClipUnclipCouponResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new c(j10, i10, null), continuation);
    }

    private final Object l(long j10, int i10, Continuation<? super ClipUnclipCouponResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new k(j10, i10, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(Zk.a.AbstractC0923a r8, kotlin.coroutines.Continuation<? super com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Zk.a.b
            if (r0 == 0) goto L13
            r0 = r9
            Zk.a$b r0 = (Zk.a.b) r0
            int r1 = r0.f42800d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42800d = r1
            goto L18
        L13:
            Zk.a$b r0 = new Zk.a$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f42798b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f42800d
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L40
            if (r2 == r3) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f42797a
            Zk.a$a r8 = (Zk.a.AbstractC0923a) r8
            kotlin.ResultKt.b(r9)
            goto L82
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f42797a
            Zk.a$a r8 = (Zk.a.AbstractC0923a) r8
            kotlin.ResultKt.b(r9)
            goto L61
        L40:
            kotlin.ResultKt.b(r9)
            boolean r9 = r8 instanceof Zk.a.AbstractC0923a.Clip
            if (r9 == 0) goto L64
            r9 = r8
            Zk.a$a$a r9 = (Zk.a.AbstractC0923a.Clip) r9
            Ok.a r2 = r9.getCoupon()
            long r5 = r2.getOfferId()
            int r9 = r9.getStoreId()
            r0.f42797a = r8
            r0.f42800d = r3
            java.lang.Object r9 = r7.d(r5, r9, r0)
            if (r9 != r1) goto L61
            goto L81
        L61:
            com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse r9 = (com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse) r9
            goto L84
        L64:
            boolean r9 = r8 instanceof Zk.a.AbstractC0923a.UnClip
            if (r9 == 0) goto Lac
            r9 = r8
            Zk.a$a$b r9 = (Zk.a.AbstractC0923a.UnClip) r9
            Ok.a r2 = r9.getCoupon()
            long r2 = r2.getOfferId()
            int r9 = r9.getStoreId()
            r0.f42797a = r8
            r0.f42800d = r4
            java.lang.Object r9 = r7.l(r2, r9, r0)
            if (r9 != r1) goto L82
        L81:
            return r1
        L82:
            com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse r9 = (com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse) r9
        L84:
            int r0 = r9.getCode()
            com.meijer.mobile.coupons.api.models.AddOfferErrorType r1 = com.meijer.mobile.coupons.api.models.AddOfferErrorType.SUCCESS
            int r1 = r1.getResultCode()
            if (r0 != r1) goto L91
            return r9
        L91:
            com.meijer.mobile.coupons.domain.models.CouponException r0 = new com.meijer.mobile.coupons.domain.models.CouponException
            com.meijer.mobile.core.networking.exceptions.RetrofitException$a r1 = com.meijer.mobile.core.networking.exceptions.RetrofitException.INSTANCE
            com.meijer.mobile.coupons.api.models.AddOfferErrorType$a r2 = com.meijer.mobile.coupons.api.models.AddOfferErrorType.INSTANCE
            int r9 = r9.getCode()
            com.meijer.mobile.coupons.api.models.AddOfferErrorType r9 = r2.a(r9)
            r2 = 0
            com.meijer.mobile.core.networking.exceptions.RetrofitException r9 = com.meijer.mobile.core.networking.exceptions.RetrofitException.Companion.f(r1, r9, r2, r4, r2)
            Ok.a r8 = r8.getCoupon()
            r0.<init>(r9, r8)
            throw r0
        Lac:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Zk.a.c(Zk.a$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object e(Continuation<? super List<CouponAd>> continuation) {
        return C16644i.g(this.ioDispatcher, new d(null), continuation);
    }

    public final Object f(EnumC5609a enumC5609a, Continuation<? super List<Category>> continuation) {
        return C16644i.g(this.ioDispatcher, new e(enumC5609a, null), continuation);
    }

    public final Object g(CouponsRequest couponsRequest, Continuation<? super CouponsResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new f(couponsRequest, this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.meijer.mobile.coupons.api.models.CouponsRequest r7, boolean r8, kotlin.coroutines.Continuation<? super dl.CouponsResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof Zk.a.g
            if (r0 == 0) goto L13
            r0 = r9
            Zk.a$g r0 = (Zk.a.g) r0
            int r1 = r0.f42821f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42821f = r1
            goto L18
        L13:
            Zk.a$g r0 = new Zk.a$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f42819d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f42821f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f42817b
            dl.a r7 = (dl.CouponsResponse) r7
            java.lang.Object r8 = r0.f42816a
            com.meijer.mobile.coupons.api.models.CouponsRequest r8 = (com.meijer.mobile.coupons.api.models.CouponsRequest) r8
            kotlin.ResultKt.b(r9)
            goto L6c
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            boolean r8 = r0.f42818c
            java.lang.Object r7 = r0.f42816a
            com.meijer.mobile.coupons.api.models.CouponsRequest r7 = (com.meijer.mobile.coupons.api.models.CouponsRequest) r7
            kotlin.ResultKt.b(r9)
            goto L56
        L46:
            kotlin.ResultKt.b(r9)
            r0.f42816a = r7
            r0.f42818c = r8
            r0.f42821f = r4
            java.lang.Object r9 = r6.g(r7, r0)
            if (r9 != r1) goto L56
            goto L68
        L56:
            dl.a r9 = (dl.CouponsResponse) r9
            if (r8 == 0) goto L6f
            r0.f42816a = r7
            r0.f42817b = r9
            r0.f42818c = r8
            r0.f42821f = r3
            java.lang.Object r7 = r6.j(r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            r5 = r9
            r9 = r7
            r7 = r5
        L6c:
            java.lang.String r9 = (java.lang.String) r9
            goto L73
        L6f:
            r7 = 0
            r5 = r9
            r9 = r7
            r7 = r5
        L73:
            dl.a r7 = r6.m(r7, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Zk.a.h(com.meijer.mobile.coupons.api.models.CouponsRequest, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object i(LocalDate localDate, int i10, Continuation<? super List<WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>> continuation) {
        return C16644i.g(this.ioDispatcher, new h(localDate, i10, null), continuation);
    }

    public final Object j(Continuation<? super String> continuation) {
        return C16644i.g(this.ioDispatcher, new i(null), continuation);
    }

    public final Object k(Ok.c cVar, boolean z10, Continuation<? super Boolean> continuation) {
        return C16644i.g(this.ioDispatcher, new j(cVar, z10, null), continuation);
    }

    private final CouponsResponse m(CouponsResponse couponsResponse, String specialOffersBannerURL) {
        CouponsResponse couponsResponse2;
        if (couponsResponse.getResponseCode() == CouponsResponse.EnumC2006a.f127448c) {
            couponsResponse2 = couponsResponse;
        } else {
            couponsResponse2 = null;
        }
        if (couponsResponse2 != null) {
            List<Coupon> listF = couponsResponse2.f();
            if (listF == null) {
                listF = CollectionsKt.m();
            }
            couponsResponse2.k(listF);
            if (specialOffersBannerURL != null) {
                if (StringsKt.r0(specialOffersBannerURL)) {
                    specialOffersBannerURL = null;
                }
                if (specialOffersBannerURL != null) {
                    couponsResponse2.l(specialOffersBannerURL);
                }
            }
            return couponsResponse2;
        }
        throw RetrofitException.Companion.f(RetrofitException.INSTANCE, couponsResponse.getResponseCode(), null, 2, null);
    }
}
