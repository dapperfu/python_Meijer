package Kp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LKp/c;", "", "", "LKp/b;", "productReviewDetails", "LKp/d;", "productReviewOptionsDetails", "<init>", "(Ljava/util/List;LKp/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "LKp/d;", "()LKp/d;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kp.c, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductReviewFullDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductReviewDetails> productReviewDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductReviewOptionsDetails productReviewOptionsDetails;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductReviewFullDetails)) {
            return false;
        }
        ProductReviewFullDetails productReviewFullDetails = (ProductReviewFullDetails) other;
        return Intrinsics.e(this.productReviewDetails, productReviewFullDetails.productReviewDetails) && Intrinsics.e(this.productReviewOptionsDetails, productReviewFullDetails.productReviewOptionsDetails);
    }

    public ProductReviewFullDetails(List<ProductReviewDetails> productReviewDetails, ProductReviewOptionsDetails productReviewOptionsDetails) {
        Intrinsics.j(productReviewDetails, "productReviewDetails");
        Intrinsics.j(productReviewOptionsDetails, "productReviewOptionsDetails");
        this.productReviewDetails = productReviewDetails;
        this.productReviewOptionsDetails = productReviewOptionsDetails;
    }

    public final List<ProductReviewDetails> a() {
        return this.productReviewDetails;
    }

    /* renamed from: b, reason: from getter */
    public final ProductReviewOptionsDetails getProductReviewOptionsDetails() {
        return this.productReviewOptionsDetails;
    }

    public int hashCode() {
        return (this.productReviewDetails.hashCode() * 31) + this.productReviewOptionsDetails.hashCode();
    }

    public String toString() {
        return "ProductReviewFullDetails(productReviewDetails=" + this.productReviewDetails + ", productReviewOptionsDetails=" + this.productReviewOptionsDetails + ')';
    }
}
