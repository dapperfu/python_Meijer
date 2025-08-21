package es;

import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b \u0010#¨\u0006&"}, d2 = {"Les/a;", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productIdentityOriginal", "productIdentitySubstituted", "", "itemId", "", "quantity", "customerSubstitutionPreference", "nameSubstituted", "price", "pricePerUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "f", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "getPrice", "h", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: es.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class FetchSubstitutedProducts {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productIdentityOriginal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productIdentitySubstituted;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer itemId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double quantity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerSubstitutionPreference;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameSubstituted;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double price;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double pricePerUnit;

    public FetchSubstitutedProducts() {
        this(null, null, null, null, null, null, null, null, l3.f93323c, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchSubstitutedProducts)) {
            return false;
        }
        FetchSubstitutedProducts fetchSubstitutedProducts = (FetchSubstitutedProducts) other;
        return Intrinsics.e(this.productIdentityOriginal, fetchSubstitutedProducts.productIdentityOriginal) && Intrinsics.e(this.productIdentitySubstituted, fetchSubstitutedProducts.productIdentitySubstituted) && Intrinsics.e(this.itemId, fetchSubstitutedProducts.itemId) && Intrinsics.e(this.quantity, fetchSubstitutedProducts.quantity) && Intrinsics.e(this.customerSubstitutionPreference, fetchSubstitutedProducts.customerSubstitutionPreference) && Intrinsics.e(this.nameSubstituted, fetchSubstitutedProducts.nameSubstituted) && Intrinsics.e(this.price, fetchSubstitutedProducts.price) && Intrinsics.e(this.pricePerUnit, fetchSubstitutedProducts.pricePerUnit);
    }

    public FetchSubstitutedProducts(String str, String str2, Integer num, Double d10, String str3, String str4, Double d11, Double d12) {
        this.productIdentityOriginal = str;
        this.productIdentitySubstituted = str2;
        this.itemId = num;
        this.quantity = d10;
        this.customerSubstitutionPreference = str3;
        this.nameSubstituted = str4;
        this.price = d11;
        this.pricePerUnit = d12;
    }

    /* renamed from: a, reason: from getter */
    public final String getCustomerSubstitutionPreference() {
        return this.customerSubstitutionPreference;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getItemId() {
        return this.itemId;
    }

    /* renamed from: c, reason: from getter */
    public final String getNameSubstituted() {
        return this.nameSubstituted;
    }

    /* renamed from: d, reason: from getter */
    public final Double getPricePerUnit() {
        return this.pricePerUnit;
    }

    /* renamed from: e, reason: from getter */
    public final String getProductIdentityOriginal() {
        return this.productIdentityOriginal;
    }

    /* renamed from: f, reason: from getter */
    public final String getProductIdentitySubstituted() {
        return this.productIdentitySubstituted;
    }

    /* renamed from: g, reason: from getter */
    public final Double getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        String str = this.productIdentityOriginal;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productIdentitySubstituted;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.itemId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d10 = this.quantity;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str3 = this.customerSubstitutionPreference;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameSubstituted;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d11 = this.price;
        int iHashCode7 = (iHashCode6 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.pricePerUnit;
        return iHashCode7 + (d12 != null ? d12.hashCode() : 0);
    }

    public String toString() {
        return "FetchSubstitutedProducts(productIdentityOriginal=" + this.productIdentityOriginal + ", productIdentitySubstituted=" + this.productIdentitySubstituted + ", itemId=" + this.itemId + ", quantity=" + this.quantity + ", customerSubstitutionPreference=" + this.customerSubstitutionPreference + ", nameSubstituted=" + this.nameSubstituted + ", price=" + this.price + ", pricePerUnit=" + this.pricePerUnit + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FetchSubstitutedProducts(String str, String str2, Integer num, Double d10, String str3, String str4, Double d11, Double d12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? 0 : num, (i10 & 8) != 0 ? dValueOf : d10, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? dValueOf : d11, (i10 & 128) != 0 ? dValueOf : d12);
    }
}
