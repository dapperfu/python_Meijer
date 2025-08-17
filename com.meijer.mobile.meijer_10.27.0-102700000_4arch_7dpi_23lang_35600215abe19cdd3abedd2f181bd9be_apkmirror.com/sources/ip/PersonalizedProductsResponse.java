package ip;

import Co.ProductFullDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0017\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lip/a;", "", "", "resultCode", "", "resultDescription", "totalProducts", "", "LCo/h;", "products", "<init>", "(ILjava/lang/String;ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getResultCode", "b", "Ljava/lang/String;", "getResultDescription", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "personalized_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ip.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class PersonalizedProductsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int resultCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String resultDescription;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalProducts;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductFullDetails> products;

    public PersonalizedProductsResponse() {
        this(0, null, 0, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalizedProductsResponse)) {
            return false;
        }
        PersonalizedProductsResponse personalizedProductsResponse = (PersonalizedProductsResponse) other;
        return this.resultCode == personalizedProductsResponse.resultCode && Intrinsics.e(this.resultDescription, personalizedProductsResponse.resultDescription) && this.totalProducts == personalizedProductsResponse.totalProducts && Intrinsics.e(this.products, personalizedProductsResponse.products);
    }

    public PersonalizedProductsResponse(int i10, String resultDescription, int i11, List<ProductFullDetails> products) {
        Intrinsics.j(resultDescription, "resultDescription");
        Intrinsics.j(products, "products");
        this.resultCode = i10;
        this.resultDescription = resultDescription;
        this.totalProducts = i11;
        this.products = products;
    }

    public final List<ProductFullDetails> a() {
        return this.products;
    }

    /* renamed from: b, reason: from getter */
    public final int getTotalProducts() {
        return this.totalProducts;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.resultCode) * 31) + this.resultDescription.hashCode()) * 31) + Integer.hashCode(this.totalProducts)) * 31) + this.products.hashCode();
    }

    public String toString() {
        return "PersonalizedProductsResponse(resultCode=" + this.resultCode + ", resultDescription=" + this.resultDescription + ", totalProducts=" + this.totalProducts + ", products=" + this.products + ')';
    }

    public /* synthetic */ PersonalizedProductsResponse(int i10, String str, int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? "Success" : str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? CollectionsKt.m() : list);
    }
}
