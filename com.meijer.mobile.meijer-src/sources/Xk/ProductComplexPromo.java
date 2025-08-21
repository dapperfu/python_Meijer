package Xk;

import Co.ProductFullDetails;
import com.medallia.digital.mobilesdk.l3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*¨\u0006-"}, d2 = {"LXk/a;", "", "", "promoId", "", "promoText", "", "promoBuyMinQty", "", "promoValue", "promoBuyMinSpend", "", "LCo/h;", "buyProducts", "getProducts", "<init>", "(JLjava/lang/String;IDDLjava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "c", "I", "getPromoBuyMinQty", "d", "D", "getPromoValue", "()D", "e", "getPromoBuyMinSpend", "f", "Ljava/util/List;", "getBuyProducts", "()Ljava/util/List;", "g", "getGetProducts", "complexpromos_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xk.a, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class ProductComplexPromo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long promoId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int promoBuyMinQty;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double promoValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double promoBuyMinSpend;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductFullDetails> buyProducts;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductFullDetails> getProducts;

    public ProductComplexPromo() {
        this(0L, null, 0, 0.0d, 0.0d, null, null, l3.f93324d, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductComplexPromo)) {
            return false;
        }
        ProductComplexPromo productComplexPromo = (ProductComplexPromo) other;
        return this.promoId == productComplexPromo.promoId && Intrinsics.e(this.promoText, productComplexPromo.promoText) && this.promoBuyMinQty == productComplexPromo.promoBuyMinQty && Double.compare(this.promoValue, productComplexPromo.promoValue) == 0 && Double.compare(this.promoBuyMinSpend, productComplexPromo.promoBuyMinSpend) == 0 && Intrinsics.e(this.buyProducts, productComplexPromo.buyProducts) && Intrinsics.e(this.getProducts, productComplexPromo.getProducts);
    }

    public ProductComplexPromo(long j10, String str, int i10, double d10, double d11, List<ProductFullDetails> buyProducts, List<ProductFullDetails> getProducts) {
        Intrinsics.j(buyProducts, "buyProducts");
        Intrinsics.j(getProducts, "getProducts");
        this.promoId = j10;
        this.promoText = str;
        this.promoBuyMinQty = i10;
        this.promoValue = d10;
        this.promoBuyMinSpend = d11;
        this.buyProducts = buyProducts;
        this.getProducts = getProducts;
    }

    /* renamed from: a, reason: from getter */
    public final long getPromoId() {
        return this.promoId;
    }

    /* renamed from: b, reason: from getter */
    public final String getPromoText() {
        return this.promoText;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.promoId) * 31;
        String str = this.promoText;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.promoBuyMinQty)) * 31) + Double.hashCode(this.promoValue)) * 31) + Double.hashCode(this.promoBuyMinSpend)) * 31) + this.buyProducts.hashCode()) * 31) + this.getProducts.hashCode();
    }

    public String toString() {
        return "ProductComplexPromo(promoId=" + this.promoId + ", promoText=" + this.promoText + ", promoBuyMinQty=" + this.promoBuyMinQty + ", promoValue=" + this.promoValue + ", promoBuyMinSpend=" + this.promoBuyMinSpend + ", buyProducts=" + this.buyProducts + ", getProducts=" + this.getProducts + ')';
    }

    public /* synthetic */ ProductComplexPromo(long j10, String str, int i10, double d10, double d11, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? 0.0d : d10, (i11 & 16) == 0 ? d11 : 0.0d, (i11 & 32) != 0 ? CollectionsKt.m() : list, (i11 & 64) != 0 ? CollectionsKt.m() : list2);
    }
}
