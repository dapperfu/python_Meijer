package com.meijer.mobile.meijer.activity.find.productdetail;

import Co.ProductFullDetails;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "", "<init>", "()V", "d", "a", "e", "b", "i", "g", "h", "f", "c", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$a;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$b;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$c;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$d;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$e;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$f;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$g;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$h;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class X0 {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$a;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends X0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f108285a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1867300600;
        }

        public String toString() {
            return "Cart";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$b;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends X0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f108286a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 1598308515;
        }

        public String toString() {
            return "DebugOptions";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$c;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "Lnk/f;", "product", "<init>", "(Lnk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/f;", "getProduct", "()Lnk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.X0$c, reason: from toString */
    public static final /* data */ class FavoriteListItem extends X0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nk.f product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FavoriteListItem) && Intrinsics.e(this.product, ((FavoriteListItem) other).product);
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "FavoriteListItem(product=" + this.product + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FavoriteListItem(nk.f product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$d;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends X0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f108288a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 1936193988;
        }

        public String toString() {
            return "NavigateUp";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$e;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class e extends X0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f108289a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return -359197824;
        }

        public String toString() {
            return "Search";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$f;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "Lnk/f;", "product", "<init>", "(Lnk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/f;", "()Lnk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.X0$f, reason: from toString */
    public static final /* data */ class ShoppingListItem extends X0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nk.f product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShoppingListItem) && Intrinsics.e(this.product, ((ShoppingListItem) other).product);
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "ShoppingListItem(product=" + this.product + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShoppingListItem(nk.f product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        /* renamed from: a, reason: from getter */
        public final nk.f getProduct() {
            return this.product;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$g;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "Lnk/f;", "product", "LPk/c;", "coupon", "<init>", "(Lnk/f;LPk/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/f;", "getProduct", "()Lnk/f;", "b", "LPk/c;", "()LPk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.X0$g, reason: from toString */
    public static final /* data */ class ShowCoupon extends X0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nk.f product;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pk.c coupon;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowCoupon)) {
                return false;
            }
            ShowCoupon showCoupon = (ShowCoupon) other;
            return Intrinsics.e(this.product, showCoupon.product) && Intrinsics.e(this.coupon, showCoupon.coupon);
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.coupon.hashCode();
        }

        public String toString() {
            return "ShowCoupon(product=" + this.product + ", coupon=" + this.coupon + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowCoupon(nk.f product, Pk.c coupon) {
            super(null);
            Intrinsics.j(product, "product");
            Intrinsics.j(coupon, "coupon");
            this.product = product;
            this.coupon = coupon;
        }

        /* renamed from: a, reason: from getter */
        public final Pk.c getCoupon() {
            return this.coupon;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$h;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "image", "", "imageList", "", "isGrayscale", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.X0$h, reason: from toString */
    public static final /* data */ class ShowImages extends X0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductImageViewModel image;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductImageViewModel> imageList;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isGrayscale;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowImages)) {
                return false;
            }
            ShowImages showImages = (ShowImages) other;
            return Intrinsics.e(this.image, showImages.image) && Intrinsics.e(this.imageList, showImages.imageList) && this.isGrayscale == showImages.isGrayscale;
        }

        public int hashCode() {
            return (((this.image.hashCode() * 31) + this.imageList.hashCode()) * 31) + Boolean.hashCode(this.isGrayscale);
        }

        public String toString() {
            return "ShowImages(image=" + this.image + ", imageList=" + this.imageList + ", isGrayscale=" + this.isGrayscale + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowImages(ProductImageViewModel image, List<ProductImageViewModel> imageList, boolean z10) {
            super(null);
            Intrinsics.j(image, "image");
            Intrinsics.j(imageList, "imageList");
            this.image = image;
            this.imageList = imageList;
            this.isGrayscale = z10;
        }

        /* renamed from: a, reason: from getter */
        public final ProductImageViewModel getImage() {
            return this.image;
        }

        public final List<ProductImageViewModel> b() {
            return this.imageList;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsGrayscale() {
            return this.isGrayscale;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/X0$i;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "LCo/h;", "product", "", "previousTrackedAction", "<init>", "(LCo/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "b", "()LCo/h;", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.X0$i, reason: from toString */
    public static final /* data */ class ShowProduct extends X0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails product;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousTrackedAction;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowProduct)) {
                return false;
            }
            ShowProduct showProduct = (ShowProduct) other;
            return Intrinsics.e(this.product, showProduct.product) && Intrinsics.e(this.previousTrackedAction, showProduct.previousTrackedAction);
        }

        public int hashCode() {
            int iHashCode = this.product.hashCode() * 31;
            String str = this.previousTrackedAction;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ShowProduct(product=" + this.product + ", previousTrackedAction=" + this.previousTrackedAction + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowProduct(ProductFullDetails product, String str) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
            this.previousTrackedAction = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getPreviousTrackedAction() {
            return this.previousTrackedAction;
        }

        /* renamed from: b, reason: from getter */
        public final ProductFullDetails getProduct() {
            return this.product;
        }
    }

    public /* synthetic */ X0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private X0() {
    }
}
