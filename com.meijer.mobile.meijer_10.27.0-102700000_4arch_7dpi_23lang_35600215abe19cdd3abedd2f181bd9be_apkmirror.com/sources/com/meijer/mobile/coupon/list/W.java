package com.meijer.mobile.coupon.list;

import Rk.CouponOptions;
import ak.AbstractC5607a;
import com.meijer.mobile.coupon.list.S;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000b\t\r\u000fB\u001d\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0014\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u0082\u0001\u0004\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/coupon/list/W;", "", "Lak/a;", "title", "noCouponsMsg", "<init>", "(Lak/a;Lak/a;)V", "", "couponsCount", "b", "(I)Lak/a;", "a", "Lak/a;", "d", "()Lak/a;", "c", "Lcom/meijer/mobile/coupon/list/S$c;", "()Lcom/meijer/mobile/coupon/list/S$c;", "setAction", "(Lcom/meijer/mobile/coupon/list/S$c;)V", "action", "Lcom/meijer/mobile/coupon/list/W$a;", "Lcom/meijer/mobile/coupon/list/W$b;", "Lcom/meijer/mobile/coupon/list/W$c;", "Lcom/meijer/mobile/coupon/list/W$d;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class W {

    /* renamed from: c, reason: collision with root package name */
    public static final int f96830c = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a noCouponsMsg;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/coupon/list/W$a;", "Lcom/meijer/mobile/coupon/list/W;", "LRk/a;", "couponOptions", "<init>", "(LRk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "LRk/a;", "getCouponOptions", "()LRk/a;", "Lcom/meijer/mobile/coupon/list/S$c;", "e", "Lcom/meijer/mobile/coupon/list/S$c;", "a", "()Lcom/meijer/mobile/coupon/list/S$c;", "setAction", "(Lcom/meijer/mobile/coupon/list/S$c;)V", "action", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.list.W$a, reason: from toString */
    public static final /* data */ class AdCoupons extends W {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponOptions couponOptions;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private S.c action;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdCoupons) && Intrinsics.e(this.couponOptions, ((AdCoupons) other).couponOptions);
        }

        public int hashCode() {
            return this.couponOptions.hashCode();
        }

        public String toString() {
            return "AdCoupons(couponOptions=" + this.couponOptions + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AdCoupons(CouponOptions couponOptions) {
            super(null, AbstractC5607a.INSTANCE.d(Nr.g.f22714U, new Object[0]), 1, 0 == true ? 1 : 0);
            Intrinsics.j(couponOptions, "couponOptions");
            this.couponOptions = couponOptions;
            this.action = new S.c.FetchAdCoupons(couponOptions);
        }

        @Override // com.meijer.mobile.coupon.list.W
        /* renamed from: a, reason: from getter */
        public S.c getAction() {
            return this.action;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/coupon/list/W$b;", "Lcom/meijer/mobile/coupon/list/W;", "LRk/a;", "couponOptions", "<init>", "(LRk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "LRk/a;", "getCouponOptions", "()LRk/a;", "Lcom/meijer/mobile/coupon/list/S$c;", "e", "Lcom/meijer/mobile/coupon/list/S$c;", "a", "()Lcom/meijer/mobile/coupon/list/S$c;", "setAction", "(Lcom/meijer/mobile/coupon/list/S$c;)V", "action", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.list.W$b, reason: from toString */
    public static final /* data */ class BundleCoupons extends W {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponOptions couponOptions;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private S.c action;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BundleCoupons) && Intrinsics.e(this.couponOptions, ((BundleCoupons) other).couponOptions);
        }

        public int hashCode() {
            return this.couponOptions.hashCode();
        }

        public String toString() {
            return "BundleCoupons(couponOptions=" + this.couponOptions + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public BundleCoupons(CouponOptions couponOptions) {
            Intrinsics.j(couponOptions, "couponOptions");
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            super(companion.d(Mk.a.f19675c, new Object[0]), companion.d(Nr.g.f22715V, new Object[0]), null);
            this.couponOptions = couponOptions;
            this.action = new S.c.FetchBundleCoupons(couponOptions);
        }

        @Override // com.meijer.mobile.coupon.list.W
        /* renamed from: a, reason: from getter */
        public S.c getAction() {
            return this.action;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/coupon/list/W$c;", "Lcom/meijer/mobile/coupon/list/W;", "LRk/a;", "couponOptions", "<init>", "(LRk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "LRk/a;", "getCouponOptions", "()LRk/a;", "Lcom/meijer/mobile/coupon/list/S$c;", "e", "Lcom/meijer/mobile/coupon/list/S$c;", "a", "()Lcom/meijer/mobile/coupon/list/S$c;", "setAction", "(Lcom/meijer/mobile/coupon/list/S$c;)V", "action", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.coupon.list.W$c, reason: from toString */
    public static final /* data */ class RelatedShoppingList extends W {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponOptions couponOptions;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private S.c action;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RelatedShoppingList) && Intrinsics.e(this.couponOptions, ((RelatedShoppingList) other).couponOptions);
        }

        public int hashCode() {
            return this.couponOptions.hashCode();
        }

        public String toString() {
            return "RelatedShoppingList(couponOptions=" + this.couponOptions + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RelatedShoppingList(CouponOptions couponOptions) {
            Intrinsics.j(couponOptions, "couponOptions");
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            super(companion.d(Nr.g.f22721a0, new Object[0]), companion.d(Nr.g.f22716W, new Object[0]), null);
            this.couponOptions = couponOptions;
            this.action = new S.c.FetchShoppingListRelatedCoupons(couponOptions);
        }

        @Override // com.meijer.mobile.coupon.list.W
        /* renamed from: a, reason: from getter */
        public S.c getAction() {
            return this.action;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/coupon/list/W$d;", "Lcom/meijer/mobile/coupon/list/W;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/coupon/list/S$c;", "e", "Lcom/meijer/mobile/coupon/list/S$c;", "a", "()Lcom/meijer/mobile/coupon/list/S$c;", "setAction", "(Lcom/meijer/mobile/coupon/list/S$c;)V", "action", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends W {

        /* renamed from: d, reason: collision with root package name */
        public static final d f96839d = new d();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static S.c action = S.c.e.f96724a;

        /* renamed from: f, reason: collision with root package name */
        public static final int f96841f = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 468230512;
        }

        public String toString() {
            return "SpecialOffers";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private d() {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            super(companion.d(Nr.g.f22753q0, new Object[0]), companion.d(Nr.g.f22715V, new Object[0]), null);
        }

        @Override // com.meijer.mobile.coupon.list.W
        /* renamed from: a */
        public S.c getAction() {
            return action;
        }
    }

    public /* synthetic */ W(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a, abstractC5607a2);
    }

    /* renamed from: a */
    public abstract S.c getAction();

    private W(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2) {
        this.title = abstractC5607a;
        this.noCouponsMsg = abstractC5607a2;
    }

    public AbstractC5607a b(int couponsCount) {
        return couponsCount > 0 ? AbstractC5607a.INSTANCE.b(Nr.f.f22684d, couponsCount, new Object[0]) : this.noCouponsMsg;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getNoCouponsMsg() {
        return this.noCouponsMsg;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    public /* synthetic */ W(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC5607a, abstractC5607a2, null);
    }
}
