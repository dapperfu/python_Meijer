package pp;

import Co.ProductFullDetails;
import Ho.ProductSponsorship;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpp/f;", "", "LCo/h;", "product", "LHo/a;", "sponsorship", "<init>", "(LCo/h;LHo/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "LHo/a;", "()LHo/a;", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pp.f, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class SponsoredProduct {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductSponsorship sponsorship;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SponsoredProduct)) {
            return false;
        }
        SponsoredProduct sponsoredProduct = (SponsoredProduct) other;
        return Intrinsics.e(this.product, sponsoredProduct.product) && Intrinsics.e(this.sponsorship, sponsoredProduct.sponsorship);
    }

    public SponsoredProduct(ProductFullDetails product, ProductSponsorship sponsorship) {
        Intrinsics.j(product, "product");
        Intrinsics.j(sponsorship, "sponsorship");
        this.product = product;
        this.sponsorship = sponsorship;
    }

    /* renamed from: a, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    /* renamed from: b, reason: from getter */
    public final ProductSponsorship getSponsorship() {
        return this.sponsorship;
    }

    public int hashCode() {
        return (this.product.hashCode() * 31) + this.sponsorship.hashCode();
    }

    public String toString() {
        return "SponsoredProduct(product=" + this.product + ", sponsorship=" + this.sponsorship + ')';
    }
}
