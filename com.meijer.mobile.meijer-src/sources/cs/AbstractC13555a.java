package cs;

import Co.ProductFullDetails;
import Pk.c;
import Vl.e;
import android.net.Uri;
import ii.AbstractC14761h;
import ii.C14756c;
import java.util.Set;
import kk.EnumC15218a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcs/a;", "", "<init>", "()V", "f", "d", "a", "c", "e", "b", "Lcs/a$a;", "Lcs/a$b;", "Lcs/a$c;", "Lcs/a$d;", "Lcs/a$e;", "Lcs/a$f;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13555a {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcs/a$a;", "Lcs/a;", "LCo/h;", "product", "", "previousTrackActionString", "Lkk/a;", "carouselType", "<init>", "(LCo/h;Ljava/lang/String;Lkk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "c", "()LCo/h;", "b", "Ljava/lang/String;", "Lkk/a;", "()Lkk/a;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cs.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class ProductClicked extends AbstractC13555a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails product;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousTrackActionString;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC15218a carouselType;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductClicked)) {
                return false;
            }
            ProductClicked productClicked = (ProductClicked) other;
            return Intrinsics.e(this.product, productClicked.product) && Intrinsics.e(this.previousTrackActionString, productClicked.previousTrackActionString) && this.carouselType == productClicked.carouselType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductClicked(ProductFullDetails product, String str, EnumC15218a enumC15218a) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
            this.previousTrackActionString = str;
            this.carouselType = enumC15218a;
        }

        /* renamed from: a, reason: from getter */
        public final EnumC15218a getCarouselType() {
            return this.carouselType;
        }

        /* renamed from: b, reason: from getter */
        public final String getPreviousTrackActionString() {
            return this.previousTrackActionString;
        }

        /* renamed from: c, reason: from getter */
        public final ProductFullDetails getProduct() {
            return this.product;
        }

        public int hashCode() {
            int iHashCode = this.product.hashCode() * 31;
            String str = this.previousTrackActionString;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            EnumC15218a enumC15218a = this.carouselType;
            return iHashCode2 + (enumC15218a != null ? enumC15218a.hashCode() : 0);
        }

        public String toString() {
            return "ProductClicked(product=" + this.product + ", previousTrackActionString=" + this.previousTrackActionString + ", carouselType=" + this.carouselType + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcs/a$b;", "Lcs/a;", "", "position", "Lkk/a;", "carouselType", "", "isSponsoredCriteo", "<init>", "(ILkk/a;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lkk/a;", "()Lkk/a;", "c", "Z", "()Z", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cs.a$b, reason: from toString */
    public static final /* data */ class ProductClickedPosition extends AbstractC13555a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int position;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC15218a carouselType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSponsoredCriteo;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductClickedPosition)) {
                return false;
            }
            ProductClickedPosition productClickedPosition = (ProductClickedPosition) other;
            return this.position == productClickedPosition.position && this.carouselType == productClickedPosition.carouselType && this.isSponsoredCriteo == productClickedPosition.isSponsoredCriteo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductClickedPosition(int i10, EnumC15218a carouselType, boolean z10) {
            super(null);
            Intrinsics.j(carouselType, "carouselType");
            this.position = i10;
            this.carouselType = carouselType;
            this.isSponsoredCriteo = z10;
        }

        /* renamed from: a, reason: from getter */
        public final EnumC15218a getCarouselType() {
            return this.carouselType;
        }

        /* renamed from: b, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsSponsoredCriteo() {
            return this.isSponsoredCriteo;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.position) * 31) + this.carouselType.hashCode()) * 31) + Boolean.hashCode(this.isSponsoredCriteo);
        }

        public String toString() {
            return "ProductClickedPosition(position=" + this.position + ", carouselType=" + this.carouselType + ", isSponsoredCriteo=" + this.isSponsoredCriteo + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcs/a$c;", "Lcs/a;", "LPk/c;", "coupon", "Lkk/a;", "carouselType", "<init>", "(LPk/c;Lkk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/c;", "b", "()LPk/c;", "Lkk/a;", "()Lkk/a;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cs.a$c, reason: from toString */
    public static final /* data */ class ProductCouponClicked extends AbstractC13555a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c coupon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC15218a carouselType;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductCouponClicked)) {
                return false;
            }
            ProductCouponClicked productCouponClicked = (ProductCouponClicked) other;
            return Intrinsics.e(this.coupon, productCouponClicked.coupon) && this.carouselType == productCouponClicked.carouselType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductCouponClicked(c coupon, EnumC15218a carouselType) {
            super(null);
            Intrinsics.j(coupon, "coupon");
            Intrinsics.j(carouselType, "carouselType");
            this.coupon = coupon;
            this.carouselType = carouselType;
        }

        /* renamed from: a, reason: from getter */
        public final EnumC15218a getCarouselType() {
            return this.carouselType;
        }

        /* renamed from: b, reason: from getter */
        public final c getCoupon() {
            return this.coupon;
        }

        public int hashCode() {
            return (this.coupon.hashCode() * 31) + this.carouselType.hashCode();
        }

        public String toString() {
            return "ProductCouponClicked(coupon=" + this.coupon + ", carouselType=" + this.carouselType + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcs/a$d;", "Lcs/a;", "LVl/e$f;", "productComponent", "<init>", "(LVl/e$f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LVl/e$f;", "()LVl/e$f;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cs.a$d, reason: from toString */
    public static final /* data */ class Retry extends AbstractC13555a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e.f productComponent;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Retry) && Intrinsics.e(this.productComponent, ((Retry) other).productComponent);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Retry(e.f productComponent) {
            super(null);
            Intrinsics.j(productComponent, "productComponent");
            this.productComponent = productComponent;
        }

        /* renamed from: a, reason: from getter */
        public final e.f getProductComponent() {
            return this.productComponent;
        }

        public int hashCode() {
            return this.productComponent.hashCode();
        }

        public String toString() {
            return "Retry(productComponent=" + this.productComponent + ')';
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcs/a$e;", "Lcs/a;", "LCo/h;", "product", "", "quantityToUpdate", "Lkk/a;", "carouselType", "<init>", "(LCo/h;DLkk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "c", "Lkk/a;", "getCarouselType", "()Lkk/a;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cs.a$e, reason: from toString */
    public static final /* data */ class UpdateProductEntry extends AbstractC13555a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails product;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double quantityToUpdate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC15218a carouselType;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateProductEntry)) {
                return false;
            }
            UpdateProductEntry updateProductEntry = (UpdateProductEntry) other;
            return Intrinsics.e(this.product, updateProductEntry.product) && Double.compare(this.quantityToUpdate, updateProductEntry.quantityToUpdate) == 0 && this.carouselType == updateProductEntry.carouselType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateProductEntry(ProductFullDetails product, double d10, EnumC15218a enumC15218a) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
            this.quantityToUpdate = d10;
            this.carouselType = enumC15218a;
        }

        /* renamed from: a, reason: from getter */
        public final ProductFullDetails getProduct() {
            return this.product;
        }

        /* renamed from: b, reason: from getter */
        public final double getQuantityToUpdate() {
            return this.quantityToUpdate;
        }

        public int hashCode() {
            int iHashCode = ((this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate)) * 31;
            EnumC15218a enumC15218a = this.carouselType;
            return iHashCode + (enumC15218a == null ? 0 : enumC15218a.hashCode());
        }

        public String toString() {
            return "UpdateProductEntry(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ", carouselType=" + this.carouselType + ')';
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcs/a$f;", "Lcs/a;", "", "uri", "carouselTitle", "Lkk/a;", "carouselType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lkk/a;", "getCarouselType", "()Lkk/a;", "Lii/h;", "()Lii/h;", "previousTrackAction", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: cs.a$f, reason: from toString */
    public static final /* data */ class ViewAll extends AbstractC13555a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String uri;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String carouselTitle;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC15218a carouselType;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewAll)) {
                return false;
            }
            ViewAll viewAll = (ViewAll) other;
            return Intrinsics.e(this.uri, viewAll.uri) && Intrinsics.e(this.carouselTitle, viewAll.carouselTitle) && this.carouselType == viewAll.carouselType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewAll(String str, String carouselTitle, EnumC15218a carouselType) {
            super(null);
            Intrinsics.j(carouselTitle, "carouselTitle");
            Intrinsics.j(carouselType, "carouselType");
            this.uri = str;
            this.carouselTitle = carouselTitle;
            this.carouselType = carouselType;
        }

        /* renamed from: a, reason: from getter */
        public final String getCarouselTitle() {
            return this.carouselTitle;
        }

        public final AbstractC14761h b() {
            Uri uri;
            String str = this.uri;
            if (str == null || (uri = Uri.parse(str)) == null) {
                uri = Uri.EMPTY;
            }
            Set<String> queryParameterNames = uri != null ? uri.getQueryParameterNames() : null;
            if (queryParameterNames == null || queryParameterNames.isEmpty()) {
                String query = uri.getQuery();
                if (query == null) {
                    query = "";
                }
                Set<String> queryParameterNames2 = uri.getQueryParameterNames();
                if (queryParameterNames2 != null && queryParameterNames2.contains("list")) {
                    if (StringsKt.d0(query, "buyAgain", false, 2, null)) {
                        return C14756c.h("Buy Again: View All");
                    }
                    if (StringsKt.d0(query, "favoritesOnSale", false, 2, null)) {
                        return C14756c.h("Favorites on Sale: View All");
                    }
                }
                Set<String> queryParameterNames3 = uri.getQueryParameterNames();
                if (queryParameterNames3 != null && queryParameterNames3.contains("department")) {
                    if (StringsKt.d0(query, "L2-10778", false, 2, null)) {
                        return C14756c.h("Produce-L2-10778: View All");
                    }
                    if (StringsKt.d0(query, "L2-9974", false, 2, null)) {
                        return C14756c.h("Dairy-L2-9974: View All");
                    }
                    if (StringsKt.d0(query, "L2-9980", false, 2, null)) {
                        return C14756c.h("Snacks-L2-9980: View All");
                    }
                }
            }
            return null;
        }

        /* renamed from: c, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            String str = this.uri;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.carouselTitle.hashCode()) * 31) + this.carouselType.hashCode();
        }

        public String toString() {
            return "ViewAll(uri=" + this.uri + ", carouselTitle=" + this.carouselTitle + ", carouselType=" + this.carouselType + ')';
        }
    }

    public /* synthetic */ AbstractC13555a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC13555a() {
    }
}
