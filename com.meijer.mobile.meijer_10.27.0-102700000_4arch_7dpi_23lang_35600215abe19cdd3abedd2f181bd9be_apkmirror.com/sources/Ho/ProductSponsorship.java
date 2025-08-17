package Ho;

import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"LHo/a;", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "LHo/b;", "sponsorSource", "LHo/c;", "sponsoredProduct", "<init>", "(Ljava/lang/String;LHo/b;LHo/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LHo/b;", "()LHo/b;", "c", "LHo/c;", "()LHo/c;", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ho.a, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductSponsorship {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b sponsorSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final SponsoredData sponsoredProduct;

    public ProductSponsorship(String productCode, b sponsorSource, SponsoredData sponsoredProduct) {
        Intrinsics.j(productCode, "productCode");
        Intrinsics.j(sponsorSource, "sponsorSource");
        Intrinsics.j(sponsoredProduct, "sponsoredProduct");
        this.productCode = productCode;
        this.sponsorSource = sponsorSource;
        this.sponsoredProduct = sponsoredProduct;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSponsorship)) {
            return false;
        }
        ProductSponsorship productSponsorship = (ProductSponsorship) other;
        return Intrinsics.e(this.productCode, productSponsorship.productCode) && this.sponsorSource == productSponsorship.sponsorSource && Intrinsics.e(this.sponsoredProduct, productSponsorship.sponsoredProduct);
    }

    /* renamed from: a, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    /* renamed from: b, reason: from getter */
    public final b getSponsorSource() {
        return this.sponsorSource;
    }

    /* renamed from: c, reason: from getter */
    public final SponsoredData getSponsoredProduct() {
        return this.sponsoredProduct;
    }

    public int hashCode() {
        return (((this.productCode.hashCode() * 31) + this.sponsorSource.hashCode()) * 31) + this.sponsoredProduct.hashCode();
    }

    public String toString() {
        return "ProductSponsorship(productCode=" + this.productCode + ", sponsorSource=" + this.sponsorSource + ", sponsoredProduct=" + this.sponsoredProduct + ')';
    }

    public /* synthetic */ ProductSponsorship(String str, b bVar, SponsoredData sponsoredData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, (i10 & 4) != 0 ? new SponsoredData(null, null, null, null, null, null, null, null, l3.f92484c, null) : sponsoredData);
    }
}
