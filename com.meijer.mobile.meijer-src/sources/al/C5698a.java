package al;

import Pk.Coupon;
import bl.EnumC6394a;
import com.meijer.mobile.core.models.coupon.CouponAd;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupons.api.models.Category;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.api.models.CouponsRequest;
import com.meijer.mobile.coupons.api.models.GetAdsResponse;
import com.meijer.mobile.coupons.api.models.SpecialOffersUrlResponse;
import com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsResponse;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import el.CouponsResponse;
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
import mv.AbstractC15779K;
import mv.C15805i;
import mv.E0;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001:B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0017\u001a\u00020\u00162\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00162\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u0018J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0086@¢\u0006\u0004\b\"\u0010#J \u0010&\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010%\u001a\u00020$H\u0086@¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b(\u0010)J\"\u0010-\u001a\u00020$2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020$H\u0086@¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020\u00162\u0006\u00100\u001a\u00020/H\u0086@¢\u0006\u0004\b1\u00102J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0086@¢\u0006\u0004\b4\u0010)J*\u00108\u001a\b\u0012\u0004\u0012\u0002070\u001c2\u0006\u00106\u001a\u0002052\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0086@¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010>¨\u0006?"}, d2 = {"Lal/a;", "", "LYi/a;", "userTokenProvider", "Lmv/K;", "ioDispatcher", "Lal/b;", "couponsApi", "<init>", "(LYi/a;Lmv/K;Lal/b;)V", "Lel/a;", "couponsResponse", "", "specialOffersBannerURL", "m", "(Lel/a;Ljava/lang/String;)Lel/a;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "d", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "Lbl/a;", "categoryFilter", "", "Lcom/meijer/mobile/coupons/api/models/Category;", "f", "(Lbl/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "request", "g", "(Lcom/meijer/mobile/coupons/api/models/CouponsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requireSpecialOffers", "h", "(Lcom/meijer/mobile/coupons/api/models/CouponsRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LPk/c;", "coupon", "hide", "k", "(LPk/c;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lal/a$a;", "clipAction", "c", "(Lal/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "e", "j$/time/LocalDate", "weeklyAdStartDate", "Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse$AdBlockWithCoupons;", "i", "(Lj$/time/LocalDate;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LYi/a;", "b", "Lmv/K;", "Lal/b;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: al.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5698a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Yi.a userTokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5699b couponsApi;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\fB\u001d\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lal/a$a;", "", "LPk/a;", "coupon", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(LPk/a;I)V", "a", "LPk/a;", "()LPk/a;", "b", "I", "getStoreId", "()I", "Lal/a$a$a;", "Lal/a$a$b;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: al.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0959a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Coupon coupon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int storeId;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lal/a$a$a;", "Lal/a$a;", "LPk/a;", "coupon", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(LPk/a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LPk/a;", "a", "()LPk/a;", "d", "I", "b", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: al.a$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class Clip extends AbstractC0959a {

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

            @Override // al.C5698a.AbstractC0959a
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

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lal/a$a$b;", "Lal/a$a;", "LPk/a;", "coupon", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(LPk/a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LPk/a;", "a", "()LPk/a;", "d", "I", "b", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: al.a$a$b, reason: from toString */
        public static final /* data */ class UnClip extends AbstractC0959a {

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

            @Override // al.C5698a.AbstractC0959a
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

        public /* synthetic */ AbstractC0959a(Coupon coupon, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(coupon, i10);
        }

        private AbstractC0959a(Coupon coupon, int i10) {
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
    /* renamed from: al.a$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f45437a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f45438b;

        /* renamed from: d, reason: collision with root package name */
        int f45440d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f45438b = obj;
            this.f45440d |= Integer.MIN_VALUE;
            return C5698a.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$clipCoupon$2", f = "CouponsDataSource.kt", l = {134, 133}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: al.a$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ClipUnclipCouponResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f45441a;

        /* renamed from: b, reason: collision with root package name */
        int f45442b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f45444d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f45445e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f45444d = j10;
            this.f45445e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C5698a.this.new c(this.f45444d, this.f45445e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ClipUnclipCouponResponse> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r10.f45442b
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
                java.lang.Object r1 = r10.f45441a
                al.b r1 = (al.InterfaceC5699b) r1
                kotlin.ResultKt.b(r11)
                goto L3c
            L22:
                kotlin.ResultKt.b(r11)
                al.a r11 = al.C5698a.this
                al.b r1 = al.C5698a.a(r11)
                al.a r11 = al.C5698a.this
                Yi.a r11 = al.C5698a.b(r11)
                r10.f45441a = r1
                r10.f45442b = r3
                java.lang.Object r11 = r11.c(r10)
                if (r11 != r0) goto L3c
                goto L55
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r11 = (com.meijer.mobile.authentication.core.model.BearerToken) r11
                com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r3 = new com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest
                long r4 = r10.f45444d
                int r6 = r10.f45445e
                r8 = 4
                r9 = 0
                r7 = 0
                r3.<init>(r4, r6, r7, r8, r9)
                r4 = 0
                r10.f45441a = r4
                r10.f45442b = r2
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
            throw new UnsupportedOperationException("Method not decompiled: al.C5698a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$getCouponAds$2", f = "CouponsDataSource.kt", l = {178}, m = "invokeSuspend")
    /* renamed from: al.a$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends CouponAd>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f45446a;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends CouponAd>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<CouponAd>>) continuation);
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C5698a.this.new d(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<CouponAd>> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f45446a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC5699b interfaceC5699b = C5698a.this.couponsApi;
                this.f45446a = 1;
                obj = interfaceC5699b.a(this);
                if (obj == objF) {
                    return objF;
                }
            }
            return ((GetAdsResponse) obj).a();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lcom/meijer/mobile/coupons/api/models/Category;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$getCouponCategories$2", f = "CouponsDataSource.kt", l = {48, 47}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: al.a$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends Category>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f45448a;

        /* renamed from: b, reason: collision with root package name */
        int f45449b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC6394a f45451d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends Category>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<Category>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(EnumC6394a enumC6394a, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f45451d = enumC6394a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C5698a.this.new e(this.f45451d, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<Category>> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f45449b
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
                java.lang.Object r1 = r5.f45448a
                al.b r1 = (al.InterfaceC5699b) r1
                kotlin.ResultKt.b(r6)
                goto L3d
            L23:
                kotlin.ResultKt.b(r6)
                al.a r6 = al.C5698a.this
                al.b r1 = al.C5698a.a(r6)
                al.a r6 = al.C5698a.this
                Yi.a r6 = al.C5698a.b(r6)
                r5.f45448a = r1
                r5.f45449b = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3d
                goto L4f
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                bl.a r4 = r5.f45451d
                java.lang.String r4 = r4.getValue()
                r5.f45448a = r2
                r5.f45449b = r3
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
            throw new UnsupportedOperationException("Method not decompiled: al.C5698a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lel/a;", "<anonymous>", "(Lmv/O;)Lel/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$getCoupons$2", f = "CouponsDataSource.kt", l = {57, 64, 71, 70}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: al.a$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super CouponsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f45452a;

        /* renamed from: b, reason: collision with root package name */
        int f45453b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CouponsRequest f45454c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C5698a f45455d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CouponsRequest couponsRequest, C5698a c5698a, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f45454c = couponsRequest;
            this.f45455d = c5698a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f45454c, this.f45455d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super CouponsResponse> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            throw new UnsupportedOperationException("Method not decompiled: al.C5698a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource", f = "CouponsDataSource.kt", l = {81, 83}, m = "getCoupons")
    /* renamed from: al.a$g */
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f45456a;

        /* renamed from: b, reason: collision with root package name */
        Object f45457b;

        /* renamed from: c, reason: collision with root package name */
        boolean f45458c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f45459d;

        /* renamed from: f, reason: collision with root package name */
        int f45461f;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f45459d = obj;
            this.f45461f |= Integer.MIN_VALUE;
            return C5698a.this.h(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse$AdBlockWithCoupons;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$getCouponsForWeeklyAd$2", f = "CouponsDataSource.kt", l = {186, 185}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: al.a$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f45462a;

        /* renamed from: b, reason: collision with root package name */
        int f45463b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalDate f45465d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f45466e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(LocalDate localDate, int i10, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f45465d = localDate;
            this.f45466e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C5698a.this.new h(this.f45465d, this.f45466e, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r11.f45463b
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
                java.lang.Object r1 = r11.f45462a
                al.b r1 = (al.InterfaceC5699b) r1
                kotlin.ResultKt.b(r12)
                goto L3d
            L23:
                kotlin.ResultKt.b(r12)
                al.a r12 = al.C5698a.this
                al.b r1 = al.C5698a.a(r12)
                al.a r12 = al.C5698a.this
                Yi.a r12 = al.C5698a.b(r12)
                r11.f45462a = r1
                r11.f45463b = r2
                java.lang.Object r12 = r12.b(r11)
                if (r12 != r0) goto L3d
                goto L60
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r12 = (com.meijer.mobile.authentication.core.model.BearerToken) r12
                com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsRequest r5 = new com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsRequest
                j$.time.LocalDate r2 = r11.f45465d
                j$.time.format.DateTimeFormatter r6 = wk.C17898a.ISO_LOCAL_DATE
                java.lang.String r6 = r2.format(r6)
                java.lang.String r2 = "format(...)"
                kotlin.jvm.internal.Intrinsics.i(r6, r2)
                int r7 = r11.f45466e
                r9 = 4
                r10 = 0
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r11.f45462a = r4
                r11.f45463b = r3
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
                sk.d r0 = sk.d.f160832e
                com.meijer.mobile.core.networking.exceptions.RetrofitException r12 = com.meijer.mobile.core.networking.exceptions.RetrofitException.Companion.f(r12, r0, r4, r3, r4)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: al.C5698a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$getSpecialOffersBanner$2", f = "CouponsDataSource.kt", l = {105}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: al.a$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f45467a;

        /* renamed from: b, reason: collision with root package name */
        Object f45468b;

        /* renamed from: c, reason: collision with root package name */
        Object f45469c;

        /* renamed from: d, reason: collision with root package name */
        Object f45470d;

        /* renamed from: e, reason: collision with root package name */
        int f45471e;

        /* renamed from: f, reason: collision with root package name */
        int f45472f;

        /* renamed from: g, reason: collision with root package name */
        int f45473g;

        /* renamed from: h, reason: collision with root package name */
        int f45474h;

        /* renamed from: i, reason: collision with root package name */
        int f45475i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f45476j;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = C5698a.this.new i(continuation);
            iVar.f45476j = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super String> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f45475i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f45476j;
                    C5698a c5698a = C5698a.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC5699b interfaceC5699b = c5698a.couponsApi;
                    this.f45476j = interfaceC15783O;
                    this.f45467a = interfaceC15783O;
                    this.f45468b = this;
                    this.f45469c = this;
                    this.f45470d = interfaceC15783O;
                    this.f45471e = 0;
                    this.f45472f = 0;
                    this.f45473g = 0;
                    this.f45474h = 0;
                    this.f45475i = 1;
                    obj = interfaceC5699b.g(this);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)Z"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$hideCoupon$2", f = "CouponsDataSource.kt", l = {121, BinsView.TOTE_HEIGHT_DP}, m = "invokeSuspend")
    /* renamed from: al.a$j */
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f45478a;

        /* renamed from: b, reason: collision with root package name */
        int f45479b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Pk.c f45481d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f45482e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Pk.c cVar, boolean z10, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f45481d = cVar;
            this.f45482e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C5698a.this.new j(this.f45481d, this.f45482e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Boolean> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r6.f45479b
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
                java.lang.Object r1 = r6.f45478a
                al.b r1 = (al.InterfaceC5699b) r1
                kotlin.ResultKt.b(r7)
                goto L3c
            L22:
                kotlin.ResultKt.b(r7)
                al.a r7 = al.C5698a.this
                al.b r1 = al.C5698a.a(r7)
                al.a r7 = al.C5698a.this
                Yi.a r7 = al.C5698a.b(r7)
                r6.f45478a = r1
                r6.f45479b = r3
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L3c
                goto L5a
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r7 = (com.meijer.mobile.authentication.core.model.BearerToken) r7
                com.meijer.mobile.coupons.api.models.HideCouponRequest r3 = new com.meijer.mobile.coupons.api.models.HideCouponRequest
                Pk.c r4 = r6.f45481d
                long r4 = r4.getOfferId()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                boolean r5 = r6.f45482e
                r3.<init>(r4, r5)
                r4 = 0
                r6.f45478a = r4
                r6.f45479b = r2
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
            throw new UnsupportedOperationException("Method not decompiled: al.C5698a.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupons.api.CouponsDataSource$unclipCoupon$2", f = "CouponsDataSource.kt", l = {144, 143}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: al.a$k */
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ClipUnclipCouponResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f45483a;

        /* renamed from: b, reason: collision with root package name */
        int f45484b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f45486d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f45487e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(long j10, int i10, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f45486d = j10;
            this.f45487e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C5698a.this.new k(this.f45486d, this.f45487e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ClipUnclipCouponResponse> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r10.f45484b
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
                java.lang.Object r1 = r10.f45483a
                al.b r1 = (al.InterfaceC5699b) r1
                kotlin.ResultKt.b(r11)
                goto L3c
            L22:
                kotlin.ResultKt.b(r11)
                al.a r11 = al.C5698a.this
                al.b r1 = al.C5698a.a(r11)
                al.a r11 = al.C5698a.this
                Yi.a r11 = al.C5698a.b(r11)
                r10.f45483a = r1
                r10.f45484b = r3
                java.lang.Object r11 = r11.c(r10)
                if (r11 != r0) goto L3c
                goto L55
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r11 = (com.meijer.mobile.authentication.core.model.BearerToken) r11
                com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r3 = new com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest
                long r4 = r10.f45486d
                int r6 = r10.f45487e
                r8 = 4
                r9 = 0
                r7 = 0
                r3.<init>(r4, r6, r7, r8, r9)
                r4 = 0
                r10.f45483a = r4
                r10.f45484b = r2
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
            throw new UnsupportedOperationException("Method not decompiled: al.C5698a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C5698a(Yi.a userTokenProvider, AbstractC15779K ioDispatcher, InterfaceC5699b couponsApi) {
        Intrinsics.j(userTokenProvider, "userTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        Intrinsics.j(couponsApi, "couponsApi");
        this.userTokenProvider = userTokenProvider;
        this.ioDispatcher = ioDispatcher;
        this.couponsApi = couponsApi;
    }

    private final Object d(long j10, int i10, Continuation<? super ClipUnclipCouponResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new c(j10, i10, null), continuation);
    }

    private final Object l(long j10, int i10, Continuation<? super ClipUnclipCouponResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new k(j10, i10, null), continuation);
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
    public final java.lang.Object c(al.C5698a.AbstractC0959a r8, kotlin.coroutines.Continuation<? super com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof al.C5698a.b
            if (r0 == 0) goto L13
            r0 = r9
            al.a$b r0 = (al.C5698a.b) r0
            int r1 = r0.f45440d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45440d = r1
            goto L18
        L13:
            al.a$b r0 = new al.a$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f45438b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f45440d
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L40
            if (r2 == r3) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f45437a
            al.a$a r8 = (al.C5698a.AbstractC0959a) r8
            kotlin.ResultKt.b(r9)
            goto L82
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f45437a
            al.a$a r8 = (al.C5698a.AbstractC0959a) r8
            kotlin.ResultKt.b(r9)
            goto L61
        L40:
            kotlin.ResultKt.b(r9)
            boolean r9 = r8 instanceof al.C5698a.AbstractC0959a.Clip
            if (r9 == 0) goto L64
            r9 = r8
            al.a$a$a r9 = (al.C5698a.AbstractC0959a.Clip) r9
            Pk.a r2 = r9.getCoupon()
            long r5 = r2.getOfferId()
            int r9 = r9.getStoreId()
            r0.f45437a = r8
            r0.f45440d = r3
            java.lang.Object r9 = r7.d(r5, r9, r0)
            if (r9 != r1) goto L61
            goto L81
        L61:
            com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse r9 = (com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse) r9
            goto L84
        L64:
            boolean r9 = r8 instanceof al.C5698a.AbstractC0959a.UnClip
            if (r9 == 0) goto Lac
            r9 = r8
            al.a$a$b r9 = (al.C5698a.AbstractC0959a.UnClip) r9
            Pk.a r2 = r9.getCoupon()
            long r2 = r2.getOfferId()
            int r9 = r9.getStoreId()
            r0.f45437a = r8
            r0.f45440d = r4
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
            Pk.a r8 = r8.getCoupon()
            r0.<init>(r9, r8)
            throw r0
        Lac:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: al.C5698a.c(al.a$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object e(Continuation<? super List<CouponAd>> continuation) {
        return C15805i.g(this.ioDispatcher, new d(null), continuation);
    }

    public final Object f(EnumC6394a enumC6394a, Continuation<? super List<Category>> continuation) {
        return C15805i.g(this.ioDispatcher, new e(enumC6394a, null), continuation);
    }

    public final Object g(CouponsRequest couponsRequest, Continuation<? super CouponsResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new f(couponsRequest, this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.meijer.mobile.coupons.api.models.CouponsRequest r7, boolean r8, kotlin.coroutines.Continuation<? super el.CouponsResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof al.C5698a.g
            if (r0 == 0) goto L13
            r0 = r9
            al.a$g r0 = (al.C5698a.g) r0
            int r1 = r0.f45461f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45461f = r1
            goto L18
        L13:
            al.a$g r0 = new al.a$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f45459d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f45461f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f45457b
            el.a r7 = (el.CouponsResponse) r7
            java.lang.Object r8 = r0.f45456a
            com.meijer.mobile.coupons.api.models.CouponsRequest r8 = (com.meijer.mobile.coupons.api.models.CouponsRequest) r8
            kotlin.ResultKt.b(r9)
            goto L6c
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            boolean r8 = r0.f45458c
            java.lang.Object r7 = r0.f45456a
            com.meijer.mobile.coupons.api.models.CouponsRequest r7 = (com.meijer.mobile.coupons.api.models.CouponsRequest) r7
            kotlin.ResultKt.b(r9)
            goto L56
        L46:
            kotlin.ResultKt.b(r9)
            r0.f45456a = r7
            r0.f45458c = r8
            r0.f45461f = r4
            java.lang.Object r9 = r6.g(r7, r0)
            if (r9 != r1) goto L56
            goto L68
        L56:
            el.a r9 = (el.CouponsResponse) r9
            if (r8 == 0) goto L6f
            r0.f45456a = r7
            r0.f45457b = r9
            r0.f45458c = r8
            r0.f45461f = r3
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
            el.a r7 = r6.m(r7, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: al.C5698a.h(com.meijer.mobile.coupons.api.models.CouponsRequest, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object i(LocalDate localDate, int i10, Continuation<? super List<WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons>> continuation) {
        return C15805i.g(this.ioDispatcher, new h(localDate, i10, null), continuation);
    }

    public final Object j(Continuation<? super String> continuation) {
        return C15805i.g(this.ioDispatcher, new i(null), continuation);
    }

    public final Object k(Pk.c cVar, boolean z10, Continuation<? super Boolean> continuation) {
        return C15805i.g(this.ioDispatcher, new j(cVar, z10, null), continuation);
    }

    private final CouponsResponse m(CouponsResponse couponsResponse, String specialOffersBannerURL) {
        CouponsResponse couponsResponse2;
        if (couponsResponse.getResponseCode() == CouponsResponse.EnumC2049a.f130224c) {
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
                if (StringsKt.s0(specialOffersBannerURL)) {
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
