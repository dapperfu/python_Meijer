package So;

import To.C5341g0;
import To.v0;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z6.C18453b;
import z6.E;
import z6.InterfaceC18449A;
import z6.InterfaceC18452a;
import z6.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0012\u0014$%&'\u000b(#\u0017)*+,-!./\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u001b¨\u00060"}, d2 = {"LSo/f;", "Lz6/E;", "LSo/f$d;", "", "upc", "", "storeId", "<init>", "(Ljava/lang/String;I)V", "b", "()Ljava/lang/String;", "c", "name", "LD6/g;", "writer", "Lz6/p;", "customScalarAdapters", "", "withDefaultValues", "", "d", "(LD6/g;Lz6/p;Z)V", "Lz6/a;", "a", "()Lz6/a;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "I", "e", "k", "q", "g", "o", "r", "h", "i", "p", "m", "n", "j", "l", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: So.f, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductDetailQuery implements E<Data> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String upc;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0018R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"LSo/f$a;", "", "", "disabled", "", "firstImageUrl", "firstProductId", "name", "selected", "", "LSo/f$h;", "products", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", "d", "e", "f", "Ljava/util/List;", "()Ljava/util/List;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$a, reason: from toString */
    public static final /* data */ class Attribute {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean disabled;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String firstImageUrl;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String firstProductId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean selected;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Product1> products;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attribute)) {
                return false;
            }
            Attribute attribute = (Attribute) other;
            return this.disabled == attribute.disabled && Intrinsics.e(this.firstImageUrl, attribute.firstImageUrl) && Intrinsics.e(this.firstProductId, attribute.firstProductId) && Intrinsics.e(this.name, attribute.name) && this.selected == attribute.selected && Intrinsics.e(this.products, attribute.products);
        }

        /* renamed from: a, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: b, reason: from getter */
        public final String getFirstImageUrl() {
            return this.firstImageUrl;
        }

        /* renamed from: c, reason: from getter */
        public final String getFirstProductId() {
            return this.firstProductId;
        }

        /* renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<Product1> e() {
            return this.products;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.disabled) * 31;
            String str = this.firstImageUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.firstProductId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.name;
            int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.selected)) * 31;
            List<Product1> list = this.products;
            return iHashCode4 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Attribute(disabled=" + this.disabled + ", firstImageUrl=" + this.firstImageUrl + ", firstProductId=" + this.firstProductId + ", name=" + this.name + ", selected=" + this.selected + ", products=" + this.products + ')';
        }

        public Attribute(boolean z10, String str, String str2, String str3, boolean z11, List<Product1> list) {
            this.disabled = z10;
            this.firstImageUrl = str;
            this.firstProductId = str2;
            this.name = str3;
            this.selected = z11;
            this.products = list;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LSo/f$b;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a() {
            return "query ProductDetailQuery($upc: String!, $storeId: Int!) { product(upc: $upc) { averagePoundsPerEach brandDescription brandName countryOfOrigin descriptiveFeatures disclaimer eventType hasMPerks isAlcohol isBopas isBusinessActive isChokingHazard isCurbsideEligible isDisplayable isFoodStampEligible isHomeDeliveryAvailable isPriceByWeight isPrimaryUpc isProductAgeRestricted maxOrderQuantity mPerksOfferId nutritionLabelHeader nutritionLabelMain nutritionLabelMicroNutrients nutritionLabelMineral nutritionLabelVitamin offlineDate priceUnit productDescription productDetails productId productName soldByUnit soldByUnitDescription storeSpecificProductDetails(storeId: $storeId) { pricing: productStore { ageLimit alcoholAgeLimit avgPricingUnitsPerSoldByUnit avgSoldByUnitsPerPricingUnit basePrice basePricePerSoldByUnit buyQuantity clearancePrice clearancePricePerSoldByUnit cmPriceEndDate currency customerPrice customerPricePerSoldByUnit depositValue discountValue discountValuePerSoldByUnit dollarOff isEligible isOnSale isPriceDisplayable percentageOff priceChangeMethod priceDescription priceEndDate priceType pricingUnit priceText productId promotionPrice restrictedCategoryDescription restrictedCategoryName savingsDescription sellQuantity soldByUnit storeId unitOfMeasureQuantity upc upcStoreCompositeKey updatedAt } stock: productStoreInventory { ilcPrimary ilcs stockStatus storeId upc upcStoreCompositeKey updatedAt } complexPromo: promotions { promotionId displayText isDefault startDate endDate upc promotionUpcs rewardUpcs } variants: variations { productId groups { name primary shouldDisplayImages attributes { disabled firstImageUrl firstProductId name selected products { imageUrl productId product { averagePoundsPerEach priceUnit storeSpecificProductDetails(storeId: $storeId) { productStore { currency isOnSale basePrice basePricePerSoldByUnit priceDescription priceText customerPricePerSoldByUnit savingsDescription } stock: productStoreInventory { status: stockStatus } } } } } } } } taxonomyDescription taxonomyId taxonomyParentId unitOfMeasureQuantity upc upcChkDigit upcTypeName updatedAt offers { offerId upc compositeKey endDate product { averagePoundsPerEach brandDescription brandName countryOfOrigin descriptiveFeatures disclaimer eventType hasMPerks isAlcohol isBopas isBusinessActive isChokingHazard isCurbsideEligible isDisplayable isFoodStampEligible isHomeDeliveryAvailable isPriceByWeight isPriceDisplayable isPrimaryUpc isProductAgeRestricted maxOrderQuantity mPerksOfferId nutritionLabelHeader nutritionLabelMain nutritionLabelMicroNutrients nutritionLabelMineral nutritionLabelVitamin offlineDate priceUnit productDescription productDetails productId productName soldByUnit soldByUnitDescription taxonomyDescription taxonomyId taxonomyParentId unitOfMeasureQuantity upc upcChkDigit upcTypeName updatedAt } } productMedia { altText defaultAltText url isDefault height width } } }";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001a\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b#\u0010\u0010R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001e\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b\"\u0010%¨\u0006&"}, d2 = {"LSo/f$c;", "", "", "promotionId", "displayText", "", "isDefault", "startDate", "endDate", "upc", "", "promotionUpcs", "rewardUpcs", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "h", "()Z", "d", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "e", "g", "Ljava/util/List;", "()Ljava/util/List;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$c, reason: from toString */
    public static final /* data */ class ComplexPromo {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String promotionId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String displayText;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isDefault;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object startDate;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object endDate;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upc;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> promotionUpcs;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> rewardUpcs;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ComplexPromo)) {
                return false;
            }
            ComplexPromo complexPromo = (ComplexPromo) other;
            return Intrinsics.e(this.promotionId, complexPromo.promotionId) && Intrinsics.e(this.displayText, complexPromo.displayText) && this.isDefault == complexPromo.isDefault && Intrinsics.e(this.startDate, complexPromo.startDate) && Intrinsics.e(this.endDate, complexPromo.endDate) && Intrinsics.e(this.upc, complexPromo.upc) && Intrinsics.e(this.promotionUpcs, complexPromo.promotionUpcs) && Intrinsics.e(this.rewardUpcs, complexPromo.rewardUpcs);
        }

        public ComplexPromo(String promotionId, String displayText, boolean z10, Object obj, Object obj2, String upc, List<String> promotionUpcs, List<String> rewardUpcs) {
            Intrinsics.j(promotionId, "promotionId");
            Intrinsics.j(displayText, "displayText");
            Intrinsics.j(upc, "upc");
            Intrinsics.j(promotionUpcs, "promotionUpcs");
            Intrinsics.j(rewardUpcs, "rewardUpcs");
            this.promotionId = promotionId;
            this.displayText = displayText;
            this.isDefault = z10;
            this.startDate = obj;
            this.endDate = obj2;
            this.upc = upc;
            this.promotionUpcs = promotionUpcs;
            this.rewardUpcs = rewardUpcs;
        }

        /* renamed from: a, reason: from getter */
        public final String getDisplayText() {
            return this.displayText;
        }

        /* renamed from: b, reason: from getter */
        public final Object getEndDate() {
            return this.endDate;
        }

        /* renamed from: c, reason: from getter */
        public final String getPromotionId() {
            return this.promotionId;
        }

        public final List<String> d() {
            return this.promotionUpcs;
        }

        public final List<String> e() {
            return this.rewardUpcs;
        }

        /* renamed from: f, reason: from getter */
        public final Object getStartDate() {
            return this.startDate;
        }

        /* renamed from: g, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsDefault() {
            return this.isDefault;
        }

        public int hashCode() {
            int iHashCode = ((((this.promotionId.hashCode() * 31) + this.displayText.hashCode()) * 31) + Boolean.hashCode(this.isDefault)) * 31;
            Object obj = this.startDate;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.endDate;
            return ((((((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.upc.hashCode()) * 31) + this.promotionUpcs.hashCode()) * 31) + this.rewardUpcs.hashCode();
        }

        public String toString() {
            return "ComplexPromo(promotionId=" + this.promotionId + ", displayText=" + this.displayText + ", isDefault=" + this.isDefault + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", upc=" + this.upc + ", promotionUpcs=" + this.promotionUpcs + ", rewardUpcs=" + this.rewardUpcs + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LSo/f$d;", "", "LSo/f$k;", "product", "<init>", "(LSo/f$k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSo/f$k;", "()LSo/f$k;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$d, reason: from toString */
    public static final /* data */ class Data implements InterfaceC18449A.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Product product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.e(this.product, ((Data) other).product);
        }

        /* renamed from: a, reason: from getter */
        public final Product getProduct() {
            return this.product;
        }

        public int hashCode() {
            Product product = this.product;
            if (product == null) {
                return 0;
            }
            return product.hashCode();
        }

        public String toString() {
            return "Data(product=" + this.product + ')';
        }

        public Data(Product product) {
            this.product = product;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"LSo/f$e;", "", "", "name", "", "primary", "shouldDisplayImages", "", "LSo/f$a;", "attributes", "<init>", "(Ljava/lang/String;ZZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "d", "Ljava/util/List;", "()Ljava/util/List;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$e, reason: from toString */
    public static final /* data */ class Group {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean primary;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldDisplayImages;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Attribute> attributes;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Group)) {
                return false;
            }
            Group group = (Group) other;
            return Intrinsics.e(this.name, group.name) && this.primary == group.primary && this.shouldDisplayImages == group.shouldDisplayImages && Intrinsics.e(this.attributes, group.attributes);
        }

        public final List<Attribute> a() {
            return this.attributes;
        }

        /* renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getPrimary() {
            return this.primary;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getShouldDisplayImages() {
            return this.shouldDisplayImages;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.primary)) * 31) + Boolean.hashCode(this.shouldDisplayImages)) * 31;
            List<Attribute> list = this.attributes;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Group(name=" + this.name + ", primary=" + this.primary + ", shouldDisplayImages=" + this.shouldDisplayImages + ", attributes=" + this.attributes + ')';
        }

        public Group(String str, boolean z10, boolean z11, List<Attribute> list) {
            this.name = str;
            this.primary = z10;
            this.shouldDisplayImages = z11;
            this.attributes = list;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"LSo/f$f;", "", "", "offerId", "upc", "compositeKey", "endDate", "LSo/f$j;", "product", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;LSo/f$j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "LSo/f$j;", "()LSo/f$j;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$f, reason: collision with other inner class name and from toString */
    public static final /* data */ class Offer {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String offerId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upc;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String compositeKey;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object endDate;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Product3 product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Offer)) {
                return false;
            }
            Offer offer = (Offer) other;
            return Intrinsics.e(this.offerId, offer.offerId) && Intrinsics.e(this.upc, offer.upc) && Intrinsics.e(this.compositeKey, offer.compositeKey) && Intrinsics.e(this.endDate, offer.endDate) && Intrinsics.e(this.product, offer.product);
        }

        public Offer(String offerId, String upc, String compositeKey, Object endDate, Product3 product3) {
            Intrinsics.j(offerId, "offerId");
            Intrinsics.j(upc, "upc");
            Intrinsics.j(compositeKey, "compositeKey");
            Intrinsics.j(endDate, "endDate");
            this.offerId = offerId;
            this.upc = upc;
            this.compositeKey = compositeKey;
            this.endDate = endDate;
            this.product = product3;
        }

        /* renamed from: a, reason: from getter */
        public final String getCompositeKey() {
            return this.compositeKey;
        }

        /* renamed from: b, reason: from getter */
        public final Object getEndDate() {
            return this.endDate;
        }

        /* renamed from: c, reason: from getter */
        public final String getOfferId() {
            return this.offerId;
        }

        /* renamed from: d, reason: from getter */
        public final Product3 getProduct() {
            return this.product;
        }

        /* renamed from: e, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        public int hashCode() {
            int iHashCode = ((((((this.offerId.hashCode() * 31) + this.upc.hashCode()) * 31) + this.compositeKey.hashCode()) * 31) + this.endDate.hashCode()) * 31;
            Product3 product3 = this.product;
            return iHashCode + (product3 == null ? 0 : product3.hashCode());
        }

        public String toString() {
            return "Offer(offerId=" + this.offerId + ", upc=" + this.upc + ", compositeKey=" + this.compositeKey + ", endDate=" + this.endDate + ", product=" + this.product + ')';
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\bP\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\b\u0010 \u001a\u0004\u0018\u00010\r\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010#\u001a\u0004\u0018\u00010\r\u0012\b\u0010$\u001a\u0004\u0018\u00010\r\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010)\u001a\u00020\r\u0012\u0006\u0010*\u001a\u00020\r\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b8\u00107R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b<\u0010;R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b=\u0010;R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b>\u0010;R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b?\u00107R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\b@\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bA\u0010;R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bB\u0010;R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bE\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bF\u0010:\u001a\u0004\bF\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bG\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bH\u0010:\u001a\u0004\bH\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bI\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bJ\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bU\u0010:\u001a\u0004\bK\u0010;R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bV\u0010D\u001a\u0004\bO\u0010/R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bW\u0010D\u001a\u0004\bQ\u0010/R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bX\u0010:\u001a\u0004\bU\u0010;R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bY\u0010D\u001a\u0004\bW\u0010/R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bZ\u0010D\u001a\u0004\bX\u0010/R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b[\u0010D\u001a\u0004\bV\u0010/R\u0019\u0010 \u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\\\u0010D\u001a\u0004\bY\u0010/R\u0019\u0010!\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b]\u0010:\u001a\u0004\bZ\u0010;R\u0019\u0010\"\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b^\u0010D\u001a\u0004\b[\u0010/R\u0019\u0010#\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b_\u0010D\u001a\u0004\b\\\u0010/R\u0019\u0010$\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b`\u0010D\u001a\u0004\b]\u0010/R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u00106\u001a\u0004\b^\u00107R\u0019\u0010&\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bb\u0010D\u001a\u0004\b_\u0010/R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010c\u001a\u0004\b`\u00101R\u0019\u0010(\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bd\u0010:\u001a\u0004\ba\u0010;R\u0017\u0010)\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bM\u0010D\u001a\u0004\bb\u0010/R\u0017\u0010*\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bP\u0010D\u001a\u0004\bc\u0010/R\u0019\u0010+\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bd\u0010;¨\u0006e"}, d2 = {"LSo/f$g;", "", "", "ageLimit", "alcoholAgeLimit", "avgPricingUnitsPerSoldByUnit", "avgSoldByUnitsPerPricingUnit", "basePrice", "basePricePerSoldByUnit", "buyQuantity", "clearancePrice", "clearancePricePerSoldByUnit", "cmPriceEndDate", "", "currency", "customerPrice", "customerPricePerSoldByUnit", "depositValue", "discountValue", "discountValuePerSoldByUnit", "dollarOff", "", "isEligible", "isOnSale", "isPriceDisplayable", "percentageOff", "priceChangeMethod", "priceDescription", "priceEndDate", "priceType", "pricingUnit", "priceText", "productId", "promotionPrice", "restrictedCategoryDescription", "restrictedCategoryName", "savingsDescription", "sellQuantity", "soldByUnit", "storeId", "unitOfMeasureQuantity", "upc", "upcStoreCompositeKey", "updatedAt", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "d", "e", "f", "g", "h", "i", "j", "k", "Ljava/lang/String;", "l", "m", "n", "o", "p", "q", "r", "Ljava/lang/Boolean;", "K", "()Ljava/lang/Boolean;", "s", "L", "t", "Z", "M", "()Z", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$g, reason: from toString */
    public static final /* data */ class Pricing {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceText;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productId;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object promotionPrice;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
        private final String restrictedCategoryDescription;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
        private final String restrictedCategoryName;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
        private final String savingsDescription;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer sellQuantity;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
        private final String soldByUnit;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
        private final int storeId;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object unitOfMeasureQuantity;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upc;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upcStoreCompositeKey;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object updatedAt;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer ageLimit;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer alcoholAgeLimit;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object avgPricingUnitsPerSoldByUnit;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object avgSoldByUnitsPerPricingUnit;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object basePrice;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object basePricePerSoldByUnit;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer buyQuantity;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object clearancePrice;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object clearancePricePerSoldByUnit;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object cmPriceEndDate;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currency;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object customerPrice;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object customerPricePerSoldByUnit;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object depositValue;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object discountValue;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object discountValuePerSoldByUnit;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object dollarOff;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isEligible;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isOnSale;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPriceDisplayable;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object percentageOff;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceChangeMethod;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceDescription;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object priceEndDate;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceType;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pricingUnit;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pricing)) {
                return false;
            }
            Pricing pricing = (Pricing) other;
            return Intrinsics.e(this.ageLimit, pricing.ageLimit) && Intrinsics.e(this.alcoholAgeLimit, pricing.alcoholAgeLimit) && Intrinsics.e(this.avgPricingUnitsPerSoldByUnit, pricing.avgPricingUnitsPerSoldByUnit) && Intrinsics.e(this.avgSoldByUnitsPerPricingUnit, pricing.avgSoldByUnitsPerPricingUnit) && Intrinsics.e(this.basePrice, pricing.basePrice) && Intrinsics.e(this.basePricePerSoldByUnit, pricing.basePricePerSoldByUnit) && Intrinsics.e(this.buyQuantity, pricing.buyQuantity) && Intrinsics.e(this.clearancePrice, pricing.clearancePrice) && Intrinsics.e(this.clearancePricePerSoldByUnit, pricing.clearancePricePerSoldByUnit) && Intrinsics.e(this.cmPriceEndDate, pricing.cmPriceEndDate) && Intrinsics.e(this.currency, pricing.currency) && Intrinsics.e(this.customerPrice, pricing.customerPrice) && Intrinsics.e(this.customerPricePerSoldByUnit, pricing.customerPricePerSoldByUnit) && Intrinsics.e(this.depositValue, pricing.depositValue) && Intrinsics.e(this.discountValue, pricing.discountValue) && Intrinsics.e(this.discountValuePerSoldByUnit, pricing.discountValuePerSoldByUnit) && Intrinsics.e(this.dollarOff, pricing.dollarOff) && Intrinsics.e(this.isEligible, pricing.isEligible) && Intrinsics.e(this.isOnSale, pricing.isOnSale) && this.isPriceDisplayable == pricing.isPriceDisplayable && Intrinsics.e(this.percentageOff, pricing.percentageOff) && Intrinsics.e(this.priceChangeMethod, pricing.priceChangeMethod) && Intrinsics.e(this.priceDescription, pricing.priceDescription) && Intrinsics.e(this.priceEndDate, pricing.priceEndDate) && Intrinsics.e(this.priceType, pricing.priceType) && Intrinsics.e(this.pricingUnit, pricing.pricingUnit) && Intrinsics.e(this.priceText, pricing.priceText) && Intrinsics.e(this.productId, pricing.productId) && Intrinsics.e(this.promotionPrice, pricing.promotionPrice) && Intrinsics.e(this.restrictedCategoryDescription, pricing.restrictedCategoryDescription) && Intrinsics.e(this.restrictedCategoryName, pricing.restrictedCategoryName) && Intrinsics.e(this.savingsDescription, pricing.savingsDescription) && Intrinsics.e(this.sellQuantity, pricing.sellQuantity) && Intrinsics.e(this.soldByUnit, pricing.soldByUnit) && this.storeId == pricing.storeId && Intrinsics.e(this.unitOfMeasureQuantity, pricing.unitOfMeasureQuantity) && Intrinsics.e(this.upc, pricing.upc) && Intrinsics.e(this.upcStoreCompositeKey, pricing.upcStoreCompositeKey) && Intrinsics.e(this.updatedAt, pricing.updatedAt);
        }

        public Pricing(Integer num, Integer num2, Object obj, Object obj2, Object obj3, Object obj4, Integer num3, Object obj5, Object obj6, Object obj7, String str, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Boolean bool, Boolean bool2, boolean z10, Object obj14, String str2, String str3, Object obj15, String str4, String str5, String str6, String str7, Object obj16, String str8, String str9, String str10, Integer num4, String str11, int i10, Object obj17, String upc, String upcStoreCompositeKey, Object obj18) {
            Intrinsics.j(upc, "upc");
            Intrinsics.j(upcStoreCompositeKey, "upcStoreCompositeKey");
            this.ageLimit = num;
            this.alcoholAgeLimit = num2;
            this.avgPricingUnitsPerSoldByUnit = obj;
            this.avgSoldByUnitsPerPricingUnit = obj2;
            this.basePrice = obj3;
            this.basePricePerSoldByUnit = obj4;
            this.buyQuantity = num3;
            this.clearancePrice = obj5;
            this.clearancePricePerSoldByUnit = obj6;
            this.cmPriceEndDate = obj7;
            this.currency = str;
            this.customerPrice = obj8;
            this.customerPricePerSoldByUnit = obj9;
            this.depositValue = obj10;
            this.discountValue = obj11;
            this.discountValuePerSoldByUnit = obj12;
            this.dollarOff = obj13;
            this.isEligible = bool;
            this.isOnSale = bool2;
            this.isPriceDisplayable = z10;
            this.percentageOff = obj14;
            this.priceChangeMethod = str2;
            this.priceDescription = str3;
            this.priceEndDate = obj15;
            this.priceType = str4;
            this.pricingUnit = str5;
            this.priceText = str6;
            this.productId = str7;
            this.promotionPrice = obj16;
            this.restrictedCategoryDescription = str8;
            this.restrictedCategoryName = str9;
            this.savingsDescription = str10;
            this.sellQuantity = num4;
            this.soldByUnit = str11;
            this.storeId = i10;
            this.unitOfMeasureQuantity = obj17;
            this.upc = upc;
            this.upcStoreCompositeKey = upcStoreCompositeKey;
            this.updatedAt = obj18;
        }

        /* renamed from: A, reason: from getter */
        public final String getRestrictedCategoryDescription() {
            return this.restrictedCategoryDescription;
        }

        /* renamed from: B, reason: from getter */
        public final String getRestrictedCategoryName() {
            return this.restrictedCategoryName;
        }

        /* renamed from: C, reason: from getter */
        public final String getSavingsDescription() {
            return this.savingsDescription;
        }

        /* renamed from: D, reason: from getter */
        public final Integer getSellQuantity() {
            return this.sellQuantity;
        }

        /* renamed from: E, reason: from getter */
        public final String getSoldByUnit() {
            return this.soldByUnit;
        }

        /* renamed from: F, reason: from getter */
        public final int getStoreId() {
            return this.storeId;
        }

        /* renamed from: G, reason: from getter */
        public final Object getUnitOfMeasureQuantity() {
            return this.unitOfMeasureQuantity;
        }

        /* renamed from: H, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        /* renamed from: I, reason: from getter */
        public final String getUpcStoreCompositeKey() {
            return this.upcStoreCompositeKey;
        }

        /* renamed from: J, reason: from getter */
        public final Object getUpdatedAt() {
            return this.updatedAt;
        }

        /* renamed from: K, reason: from getter */
        public final Boolean getIsEligible() {
            return this.isEligible;
        }

        /* renamed from: L, reason: from getter */
        public final Boolean getIsOnSale() {
            return this.isOnSale;
        }

        /* renamed from: M, reason: from getter */
        public final boolean getIsPriceDisplayable() {
            return this.isPriceDisplayable;
        }

        /* renamed from: a, reason: from getter */
        public final Integer getAgeLimit() {
            return this.ageLimit;
        }

        /* renamed from: b, reason: from getter */
        public final Integer getAlcoholAgeLimit() {
            return this.alcoholAgeLimit;
        }

        /* renamed from: c, reason: from getter */
        public final Object getAvgPricingUnitsPerSoldByUnit() {
            return this.avgPricingUnitsPerSoldByUnit;
        }

        /* renamed from: d, reason: from getter */
        public final Object getAvgSoldByUnitsPerPricingUnit() {
            return this.avgSoldByUnitsPerPricingUnit;
        }

        /* renamed from: e, reason: from getter */
        public final Object getBasePrice() {
            return this.basePrice;
        }

        /* renamed from: f, reason: from getter */
        public final Object getBasePricePerSoldByUnit() {
            return this.basePricePerSoldByUnit;
        }

        /* renamed from: g, reason: from getter */
        public final Integer getBuyQuantity() {
            return this.buyQuantity;
        }

        /* renamed from: h, reason: from getter */
        public final Object getClearancePrice() {
            return this.clearancePrice;
        }

        public int hashCode() {
            Integer num = this.ageLimit;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.alcoholAgeLimit;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Object obj = this.avgPricingUnitsPerSoldByUnit;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.avgSoldByUnitsPerPricingUnit;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Object obj3 = this.basePrice;
            int iHashCode5 = (iHashCode4 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            Object obj4 = this.basePricePerSoldByUnit;
            int iHashCode6 = (iHashCode5 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
            Integer num3 = this.buyQuantity;
            int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Object obj5 = this.clearancePrice;
            int iHashCode8 = (iHashCode7 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
            Object obj6 = this.clearancePricePerSoldByUnit;
            int iHashCode9 = (iHashCode8 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
            Object obj7 = this.cmPriceEndDate;
            int iHashCode10 = (iHashCode9 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
            String str = this.currency;
            int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
            Object obj8 = this.customerPrice;
            int iHashCode12 = (iHashCode11 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
            Object obj9 = this.customerPricePerSoldByUnit;
            int iHashCode13 = (iHashCode12 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
            Object obj10 = this.depositValue;
            int iHashCode14 = (iHashCode13 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
            Object obj11 = this.discountValue;
            int iHashCode15 = (iHashCode14 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
            Object obj12 = this.discountValuePerSoldByUnit;
            int iHashCode16 = (iHashCode15 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
            Object obj13 = this.dollarOff;
            int iHashCode17 = (iHashCode16 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
            Boolean bool = this.isEligible;
            int iHashCode18 = (iHashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isOnSale;
            int iHashCode19 = (((iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Boolean.hashCode(this.isPriceDisplayable)) * 31;
            Object obj14 = this.percentageOff;
            int iHashCode20 = (iHashCode19 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
            String str2 = this.priceChangeMethod;
            int iHashCode21 = (iHashCode20 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.priceDescription;
            int iHashCode22 = (iHashCode21 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Object obj15 = this.priceEndDate;
            int iHashCode23 = (iHashCode22 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
            String str4 = this.priceType;
            int iHashCode24 = (iHashCode23 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.pricingUnit;
            int iHashCode25 = (iHashCode24 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.priceText;
            int iHashCode26 = (iHashCode25 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.productId;
            int iHashCode27 = (iHashCode26 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Object obj16 = this.promotionPrice;
            int iHashCode28 = (iHashCode27 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
            String str8 = this.restrictedCategoryDescription;
            int iHashCode29 = (iHashCode28 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.restrictedCategoryName;
            int iHashCode30 = (iHashCode29 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.savingsDescription;
            int iHashCode31 = (iHashCode30 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Integer num4 = this.sellQuantity;
            int iHashCode32 = (iHashCode31 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str11 = this.soldByUnit;
            int iHashCode33 = (((iHashCode32 + (str11 == null ? 0 : str11.hashCode())) * 31) + Integer.hashCode(this.storeId)) * 31;
            Object obj17 = this.unitOfMeasureQuantity;
            int iHashCode34 = (((((iHashCode33 + (obj17 == null ? 0 : obj17.hashCode())) * 31) + this.upc.hashCode()) * 31) + this.upcStoreCompositeKey.hashCode()) * 31;
            Object obj18 = this.updatedAt;
            return iHashCode34 + (obj18 != null ? obj18.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final Object getClearancePricePerSoldByUnit() {
            return this.clearancePricePerSoldByUnit;
        }

        /* renamed from: j, reason: from getter */
        public final Object getCmPriceEndDate() {
            return this.cmPriceEndDate;
        }

        /* renamed from: k, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* renamed from: l, reason: from getter */
        public final Object getCustomerPrice() {
            return this.customerPrice;
        }

        /* renamed from: m, reason: from getter */
        public final Object getCustomerPricePerSoldByUnit() {
            return this.customerPricePerSoldByUnit;
        }

        /* renamed from: n, reason: from getter */
        public final Object getDepositValue() {
            return this.depositValue;
        }

        /* renamed from: o, reason: from getter */
        public final Object getDiscountValue() {
            return this.discountValue;
        }

        /* renamed from: p, reason: from getter */
        public final Object getDiscountValuePerSoldByUnit() {
            return this.discountValuePerSoldByUnit;
        }

        /* renamed from: q, reason: from getter */
        public final Object getDollarOff() {
            return this.dollarOff;
        }

        /* renamed from: r, reason: from getter */
        public final Object getPercentageOff() {
            return this.percentageOff;
        }

        /* renamed from: s, reason: from getter */
        public final String getPriceChangeMethod() {
            return this.priceChangeMethod;
        }

        /* renamed from: t, reason: from getter */
        public final String getPriceDescription() {
            return this.priceDescription;
        }

        public String toString() {
            return "Pricing(ageLimit=" + this.ageLimit + ", alcoholAgeLimit=" + this.alcoholAgeLimit + ", avgPricingUnitsPerSoldByUnit=" + this.avgPricingUnitsPerSoldByUnit + ", avgSoldByUnitsPerPricingUnit=" + this.avgSoldByUnitsPerPricingUnit + ", basePrice=" + this.basePrice + ", basePricePerSoldByUnit=" + this.basePricePerSoldByUnit + ", buyQuantity=" + this.buyQuantity + ", clearancePrice=" + this.clearancePrice + ", clearancePricePerSoldByUnit=" + this.clearancePricePerSoldByUnit + ", cmPriceEndDate=" + this.cmPriceEndDate + ", currency=" + this.currency + ", customerPrice=" + this.customerPrice + ", customerPricePerSoldByUnit=" + this.customerPricePerSoldByUnit + ", depositValue=" + this.depositValue + ", discountValue=" + this.discountValue + ", discountValuePerSoldByUnit=" + this.discountValuePerSoldByUnit + ", dollarOff=" + this.dollarOff + ", isEligible=" + this.isEligible + ", isOnSale=" + this.isOnSale + ", isPriceDisplayable=" + this.isPriceDisplayable + ", percentageOff=" + this.percentageOff + ", priceChangeMethod=" + this.priceChangeMethod + ", priceDescription=" + this.priceDescription + ", priceEndDate=" + this.priceEndDate + ", priceType=" + this.priceType + ", pricingUnit=" + this.pricingUnit + ", priceText=" + this.priceText + ", productId=" + this.productId + ", promotionPrice=" + this.promotionPrice + ", restrictedCategoryDescription=" + this.restrictedCategoryDescription + ", restrictedCategoryName=" + this.restrictedCategoryName + ", savingsDescription=" + this.savingsDescription + ", sellQuantity=" + this.sellQuantity + ", soldByUnit=" + this.soldByUnit + ", storeId=" + this.storeId + ", unitOfMeasureQuantity=" + this.unitOfMeasureQuantity + ", upc=" + this.upc + ", upcStoreCompositeKey=" + this.upcStoreCompositeKey + ", updatedAt=" + this.updatedAt + ')';
        }

        /* renamed from: u, reason: from getter */
        public final Object getPriceEndDate() {
            return this.priceEndDate;
        }

        /* renamed from: v, reason: from getter */
        public final String getPriceText() {
            return this.priceText;
        }

        /* renamed from: w, reason: from getter */
        public final String getPriceType() {
            return this.priceType;
        }

        /* renamed from: x, reason: from getter */
        public final String getPricingUnit() {
            return this.pricingUnit;
        }

        /* renamed from: y, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* renamed from: z, reason: from getter */
        public final Object getPromotionPrice() {
            return this.promotionPrice;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"LSo/f$h;", "", "", "imageUrl", "productId", "LSo/f$i;", "product", "<init>", "(Ljava/lang/String;Ljava/lang/String;LSo/f$i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LSo/f$i;", "()LSo/f$i;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$h, reason: from toString */
    public static final /* data */ class Product1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String imageUrl;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Product2 product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product1)) {
                return false;
            }
            Product1 product1 = (Product1) other;
            return Intrinsics.e(this.imageUrl, product1.imageUrl) && Intrinsics.e(this.productId, product1.productId) && Intrinsics.e(this.product, product1.product);
        }

        /* renamed from: a, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: b, reason: from getter */
        public final Product2 getProduct() {
            return this.product;
        }

        /* renamed from: c, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            String str = this.imageUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.productId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Product2 product2 = this.product;
            return iHashCode2 + (product2 != null ? product2.hashCode() : 0);
        }

        public String toString() {
            return "Product1(imageUrl=" + this.imageUrl + ", productId=" + this.productId + ", product=" + this.product + ')';
        }

        public Product1(String str, String str2, Product2 product2) {
            this.imageUrl = str;
            this.productId = str2;
            this.product = product2;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LSo/f$i;", "", "averagePoundsPerEach", "", "priceUnit", "LSo/f$p;", "storeSpecificProductDetails", "<init>", "(Ljava/lang/Object;Ljava/lang/String;LSo/f$p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Ljava/lang/String;", "c", "LSo/f$p;", "()LSo/f$p;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$i, reason: from toString */
    public static final /* data */ class Product2 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object averagePoundsPerEach;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceUnit;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreSpecificProductDetails1 storeSpecificProductDetails;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product2)) {
                return false;
            }
            Product2 product2 = (Product2) other;
            return Intrinsics.e(this.averagePoundsPerEach, product2.averagePoundsPerEach) && Intrinsics.e(this.priceUnit, product2.priceUnit) && Intrinsics.e(this.storeSpecificProductDetails, product2.storeSpecificProductDetails);
        }

        /* renamed from: a, reason: from getter */
        public final Object getAveragePoundsPerEach() {
            return this.averagePoundsPerEach;
        }

        /* renamed from: b, reason: from getter */
        public final String getPriceUnit() {
            return this.priceUnit;
        }

        /* renamed from: c, reason: from getter */
        public final StoreSpecificProductDetails1 getStoreSpecificProductDetails() {
            return this.storeSpecificProductDetails;
        }

        public int hashCode() {
            Object obj = this.averagePoundsPerEach;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            String str = this.priceUnit;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            StoreSpecificProductDetails1 storeSpecificProductDetails1 = this.storeSpecificProductDetails;
            return iHashCode2 + (storeSpecificProductDetails1 != null ? storeSpecificProductDetails1.hashCode() : 0);
        }

        public String toString() {
            return "Product2(averagePoundsPerEach=" + this.averagePoundsPerEach + ", priceUnit=" + this.priceUnit + ", storeSpecificProductDetails=" + this.storeSpecificProductDetails + ')';
        }

        public Product2(Object obj, String str, StoreSpecificProductDetails1 storeSpecificProductDetails1) {
            this.averagePoundsPerEach = obj;
            this.priceUnit = str;
            this.storeSpecificProductDetails = storeSpecificProductDetails1;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\bV\b\u0086\b\u0018\u00002\u00020\u0001B·\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u00104R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\b?\u00104R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\b@\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bA\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bB\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bC\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bD\u0010FR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bG\u0010E\u001a\u0004\bH\u0010FR\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010FR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bK\u0010E\u001a\u0004\bL\u0010FR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bM\u0010E\u001a\u0004\bN\u0010FR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bO\u0010E\u001a\u0004\bP\u0010FR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bQ\u0010E\u001a\u0004\bR\u0010FR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bS\u0010E\u001a\u0004\bT\u0010FR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bU\u0010E\u001a\u0004\bV\u0010FR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bW\u0010E\u001a\u0004\bX\u0010FR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b]\u0010E\u001a\u0004\b^\u0010FR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b_\u0010E\u001a\u0004\b`\u0010FR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bI\u0010cR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bG\u0010fR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bg\u0010>\u001a\u0004\bK\u00104R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bh\u0010>\u001a\u0004\bM\u00104R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bi\u0010>\u001a\u0004\bO\u00104R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bj\u0010>\u001a\u0004\bQ\u00104R\u0019\u0010 \u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bk\u0010>\u001a\u0004\bS\u00104R\u0019\u0010!\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bl\u0010;\u001a\u0004\bU\u0010<R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bm\u0010>\u001a\u0004\bW\u00104R\u0019\u0010#\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bn\u0010>\u001a\u0004\bY\u00104R\u0019\u0010$\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bo\u0010>\u001a\u0004\b]\u00104R\u0019\u0010%\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\b_\u00104R\u0019\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\ba\u00104R\u0019\u0010'\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bd\u00104R\u0019\u0010(\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bN\u0010>\u001a\u0004\bg\u00104R\u0019\u0010)\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bh\u00104R\u0019\u0010*\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bR\u0010>\u001a\u0004\bi\u00104R\u0019\u0010+\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bT\u0010>\u001a\u0004\bj\u00104R\u0019\u0010,\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bV\u0010;\u001a\u0004\bk\u0010<R\u0017\u0010-\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bX\u0010>\u001a\u0004\bl\u00104R\u0019\u0010.\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b[\u0010>\u001a\u0004\bm\u00104R\u0019\u0010/\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b^\u0010>\u001a\u0004\bn\u00104R\u0019\u00100\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b`\u0010;\u001a\u0004\bo\u0010<¨\u0006p"}, d2 = {"LSo/f$j;", "", "averagePoundsPerEach", "", "brandDescription", "brandName", "countryOfOrigin", "descriptiveFeatures", "disclaimer", "eventType", "", "hasMPerks", "isAlcohol", "isBopas", "isBusinessActive", "isChokingHazard", "isCurbsideEligible", "isDisplayable", "isFoodStampEligible", "isHomeDeliveryAvailable", "isPriceByWeight", "isPriceDisplayable", "isPrimaryUpc", "isProductAgeRestricted", "", "maxOrderQuantity", "", "mPerksOfferId", "nutritionLabelHeader", "nutritionLabelMain", "nutritionLabelMicroNutrients", "nutritionLabelMineral", "nutritionLabelVitamin", "offlineDate", "priceUnit", "productDescription", "productDetails", "productId", "productName", "soldByUnit", "soldByUnitDescription", "taxonomyDescription", "taxonomyId", "taxonomyParentId", "unitOfMeasureQuantity", "upc", "upcChkDigit", "upcTypeName", "updatedAt", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "i", "F", "j", "G", "k", "H", "l", "I", "m", "J", "n", "K", "o", "L", "p", "M", "q", "N", "r", "Z", "O", "()Z", "s", "P", "t", "Q", "u", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "v", "Ljava/util/List;", "()Ljava/util/List;", "w", "x", "y", "z", "A", "B", "C", "D", "E", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$j, reason: from toString */
    public static final /* data */ class Product3 {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nutritionLabelVitamin;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object offlineDate;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceUnit;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productDescription;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productDetails;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productId;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productName;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
        private final String soldByUnit;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
        private final String soldByUnitDescription;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
        private final String taxonomyDescription;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
        private final String taxonomyId;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
        private final String taxonomyParentId;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object unitOfMeasureQuantity;

        /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upc;

        /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upcChkDigit;

        /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upcTypeName;

        /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object updatedAt;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object averagePoundsPerEach;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String brandDescription;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String brandName;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryOfOrigin;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String descriptiveFeatures;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String disclaimer;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String eventType;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean hasMPerks;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isAlcohol;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isBopas;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isBusinessActive;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isChokingHazard;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isCurbsideEligible;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isDisplayable;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isFoodStampEligible;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isHomeDeliveryAvailable;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isPriceByWeight;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPriceDisplayable;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isPrimaryUpc;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isProductAgeRestricted;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer maxOrderQuantity;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> mPerksOfferId;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nutritionLabelHeader;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nutritionLabelMain;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nutritionLabelMicroNutrients;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nutritionLabelMineral;

        public Product3(Object obj, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, boolean z10, Boolean bool11, Boolean bool12, Integer num, List<String> list, String str7, String str8, String str9, String str10, String str11, Object obj2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, Object obj3, String upc, String str22, String str23, Object obj4) {
            Intrinsics.j(upc, "upc");
            this.averagePoundsPerEach = obj;
            this.brandDescription = str;
            this.brandName = str2;
            this.countryOfOrigin = str3;
            this.descriptiveFeatures = str4;
            this.disclaimer = str5;
            this.eventType = str6;
            this.hasMPerks = bool;
            this.isAlcohol = bool2;
            this.isBopas = bool3;
            this.isBusinessActive = bool4;
            this.isChokingHazard = bool5;
            this.isCurbsideEligible = bool6;
            this.isDisplayable = bool7;
            this.isFoodStampEligible = bool8;
            this.isHomeDeliveryAvailable = bool9;
            this.isPriceByWeight = bool10;
            this.isPriceDisplayable = z10;
            this.isPrimaryUpc = bool11;
            this.isProductAgeRestricted = bool12;
            this.maxOrderQuantity = num;
            this.mPerksOfferId = list;
            this.nutritionLabelHeader = str7;
            this.nutritionLabelMain = str8;
            this.nutritionLabelMicroNutrients = str9;
            this.nutritionLabelMineral = str10;
            this.nutritionLabelVitamin = str11;
            this.offlineDate = obj2;
            this.priceUnit = str12;
            this.productDescription = str13;
            this.productDetails = str14;
            this.productId = str15;
            this.productName = str16;
            this.soldByUnit = str17;
            this.soldByUnitDescription = str18;
            this.taxonomyDescription = str19;
            this.taxonomyId = str20;
            this.taxonomyParentId = str21;
            this.unitOfMeasureQuantity = obj3;
            this.upc = upc;
            this.upcChkDigit = str22;
            this.upcTypeName = str23;
            this.updatedAt = obj4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product3)) {
                return false;
            }
            Product3 product3 = (Product3) other;
            return Intrinsics.e(this.averagePoundsPerEach, product3.averagePoundsPerEach) && Intrinsics.e(this.brandDescription, product3.brandDescription) && Intrinsics.e(this.brandName, product3.brandName) && Intrinsics.e(this.countryOfOrigin, product3.countryOfOrigin) && Intrinsics.e(this.descriptiveFeatures, product3.descriptiveFeatures) && Intrinsics.e(this.disclaimer, product3.disclaimer) && Intrinsics.e(this.eventType, product3.eventType) && Intrinsics.e(this.hasMPerks, product3.hasMPerks) && Intrinsics.e(this.isAlcohol, product3.isAlcohol) && Intrinsics.e(this.isBopas, product3.isBopas) && Intrinsics.e(this.isBusinessActive, product3.isBusinessActive) && Intrinsics.e(this.isChokingHazard, product3.isChokingHazard) && Intrinsics.e(this.isCurbsideEligible, product3.isCurbsideEligible) && Intrinsics.e(this.isDisplayable, product3.isDisplayable) && Intrinsics.e(this.isFoodStampEligible, product3.isFoodStampEligible) && Intrinsics.e(this.isHomeDeliveryAvailable, product3.isHomeDeliveryAvailable) && Intrinsics.e(this.isPriceByWeight, product3.isPriceByWeight) && this.isPriceDisplayable == product3.isPriceDisplayable && Intrinsics.e(this.isPrimaryUpc, product3.isPrimaryUpc) && Intrinsics.e(this.isProductAgeRestricted, product3.isProductAgeRestricted) && Intrinsics.e(this.maxOrderQuantity, product3.maxOrderQuantity) && Intrinsics.e(this.mPerksOfferId, product3.mPerksOfferId) && Intrinsics.e(this.nutritionLabelHeader, product3.nutritionLabelHeader) && Intrinsics.e(this.nutritionLabelMain, product3.nutritionLabelMain) && Intrinsics.e(this.nutritionLabelMicroNutrients, product3.nutritionLabelMicroNutrients) && Intrinsics.e(this.nutritionLabelMineral, product3.nutritionLabelMineral) && Intrinsics.e(this.nutritionLabelVitamin, product3.nutritionLabelVitamin) && Intrinsics.e(this.offlineDate, product3.offlineDate) && Intrinsics.e(this.priceUnit, product3.priceUnit) && Intrinsics.e(this.productDescription, product3.productDescription) && Intrinsics.e(this.productDetails, product3.productDetails) && Intrinsics.e(this.productId, product3.productId) && Intrinsics.e(this.productName, product3.productName) && Intrinsics.e(this.soldByUnit, product3.soldByUnit) && Intrinsics.e(this.soldByUnitDescription, product3.soldByUnitDescription) && Intrinsics.e(this.taxonomyDescription, product3.taxonomyDescription) && Intrinsics.e(this.taxonomyId, product3.taxonomyId) && Intrinsics.e(this.taxonomyParentId, product3.taxonomyParentId) && Intrinsics.e(this.unitOfMeasureQuantity, product3.unitOfMeasureQuantity) && Intrinsics.e(this.upc, product3.upc) && Intrinsics.e(this.upcChkDigit, product3.upcChkDigit) && Intrinsics.e(this.upcTypeName, product3.upcTypeName) && Intrinsics.e(this.updatedAt, product3.updatedAt);
        }

        /* renamed from: A, reason: from getter */
        public final Object getUnitOfMeasureQuantity() {
            return this.unitOfMeasureQuantity;
        }

        /* renamed from: B, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        /* renamed from: C, reason: from getter */
        public final String getUpcChkDigit() {
            return this.upcChkDigit;
        }

        /* renamed from: D, reason: from getter */
        public final String getUpcTypeName() {
            return this.upcTypeName;
        }

        /* renamed from: E, reason: from getter */
        public final Object getUpdatedAt() {
            return this.updatedAt;
        }

        /* renamed from: F, reason: from getter */
        public final Boolean getIsAlcohol() {
            return this.isAlcohol;
        }

        /* renamed from: G, reason: from getter */
        public final Boolean getIsBopas() {
            return this.isBopas;
        }

        /* renamed from: H, reason: from getter */
        public final Boolean getIsBusinessActive() {
            return this.isBusinessActive;
        }

        /* renamed from: I, reason: from getter */
        public final Boolean getIsChokingHazard() {
            return this.isChokingHazard;
        }

        /* renamed from: J, reason: from getter */
        public final Boolean getIsCurbsideEligible() {
            return this.isCurbsideEligible;
        }

        /* renamed from: K, reason: from getter */
        public final Boolean getIsDisplayable() {
            return this.isDisplayable;
        }

        /* renamed from: L, reason: from getter */
        public final Boolean getIsFoodStampEligible() {
            return this.isFoodStampEligible;
        }

        /* renamed from: M, reason: from getter */
        public final Boolean getIsHomeDeliveryAvailable() {
            return this.isHomeDeliveryAvailable;
        }

        /* renamed from: N, reason: from getter */
        public final Boolean getIsPriceByWeight() {
            return this.isPriceByWeight;
        }

        /* renamed from: O, reason: from getter */
        public final boolean getIsPriceDisplayable() {
            return this.isPriceDisplayable;
        }

        /* renamed from: P, reason: from getter */
        public final Boolean getIsPrimaryUpc() {
            return this.isPrimaryUpc;
        }

        /* renamed from: Q, reason: from getter */
        public final Boolean getIsProductAgeRestricted() {
            return this.isProductAgeRestricted;
        }

        /* renamed from: a, reason: from getter */
        public final Object getAveragePoundsPerEach() {
            return this.averagePoundsPerEach;
        }

        /* renamed from: b, reason: from getter */
        public final String getBrandDescription() {
            return this.brandDescription;
        }

        /* renamed from: c, reason: from getter */
        public final String getBrandName() {
            return this.brandName;
        }

        /* renamed from: d, reason: from getter */
        public final String getCountryOfOrigin() {
            return this.countryOfOrigin;
        }

        /* renamed from: e, reason: from getter */
        public final String getDescriptiveFeatures() {
            return this.descriptiveFeatures;
        }

        /* renamed from: f, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* renamed from: g, reason: from getter */
        public final String getEventType() {
            return this.eventType;
        }

        /* renamed from: h, reason: from getter */
        public final Boolean getHasMPerks() {
            return this.hasMPerks;
        }

        public int hashCode() {
            Object obj = this.averagePoundsPerEach;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            String str = this.brandDescription;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.brandName;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.countryOfOrigin;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.descriptiveFeatures;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.disclaimer;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.eventType;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool = this.hasMPerks;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isAlcohol;
            int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isBopas;
            int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isBusinessActive;
            int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isChokingHazard;
            int iHashCode12 = (iHashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.isCurbsideEligible;
            int iHashCode13 = (iHashCode12 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.isDisplayable;
            int iHashCode14 = (iHashCode13 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.isFoodStampEligible;
            int iHashCode15 = (iHashCode14 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.isHomeDeliveryAvailable;
            int iHashCode16 = (iHashCode15 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.isPriceByWeight;
            int iHashCode17 = (((iHashCode16 + (bool10 == null ? 0 : bool10.hashCode())) * 31) + Boolean.hashCode(this.isPriceDisplayable)) * 31;
            Boolean bool11 = this.isPrimaryUpc;
            int iHashCode18 = (iHashCode17 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.isProductAgeRestricted;
            int iHashCode19 = (iHashCode18 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Integer num = this.maxOrderQuantity;
            int iHashCode20 = (iHashCode19 + (num == null ? 0 : num.hashCode())) * 31;
            List<String> list = this.mPerksOfferId;
            int iHashCode21 = (iHashCode20 + (list == null ? 0 : list.hashCode())) * 31;
            String str7 = this.nutritionLabelHeader;
            int iHashCode22 = (iHashCode21 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.nutritionLabelMain;
            int iHashCode23 = (iHashCode22 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.nutritionLabelMicroNutrients;
            int iHashCode24 = (iHashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.nutritionLabelMineral;
            int iHashCode25 = (iHashCode24 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.nutritionLabelVitamin;
            int iHashCode26 = (iHashCode25 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Object obj2 = this.offlineDate;
            int iHashCode27 = (iHashCode26 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            String str12 = this.priceUnit;
            int iHashCode28 = (iHashCode27 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.productDescription;
            int iHashCode29 = (iHashCode28 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.productDetails;
            int iHashCode30 = (iHashCode29 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.productId;
            int iHashCode31 = (iHashCode30 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.productName;
            int iHashCode32 = (iHashCode31 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.soldByUnit;
            int iHashCode33 = (iHashCode32 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.soldByUnitDescription;
            int iHashCode34 = (iHashCode33 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.taxonomyDescription;
            int iHashCode35 = (iHashCode34 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.taxonomyId;
            int iHashCode36 = (iHashCode35 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.taxonomyParentId;
            int iHashCode37 = (iHashCode36 + (str21 == null ? 0 : str21.hashCode())) * 31;
            Object obj3 = this.unitOfMeasureQuantity;
            int iHashCode38 = (((iHashCode37 + (obj3 == null ? 0 : obj3.hashCode())) * 31) + this.upc.hashCode()) * 31;
            String str22 = this.upcChkDigit;
            int iHashCode39 = (iHashCode38 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.upcTypeName;
            int iHashCode40 = (iHashCode39 + (str23 == null ? 0 : str23.hashCode())) * 31;
            Object obj4 = this.updatedAt;
            return iHashCode40 + (obj4 != null ? obj4.hashCode() : 0);
        }

        public final List<String> i() {
            return this.mPerksOfferId;
        }

        /* renamed from: j, reason: from getter */
        public final Integer getMaxOrderQuantity() {
            return this.maxOrderQuantity;
        }

        /* renamed from: k, reason: from getter */
        public final String getNutritionLabelHeader() {
            return this.nutritionLabelHeader;
        }

        /* renamed from: l, reason: from getter */
        public final String getNutritionLabelMain() {
            return this.nutritionLabelMain;
        }

        /* renamed from: m, reason: from getter */
        public final String getNutritionLabelMicroNutrients() {
            return this.nutritionLabelMicroNutrients;
        }

        /* renamed from: n, reason: from getter */
        public final String getNutritionLabelMineral() {
            return this.nutritionLabelMineral;
        }

        /* renamed from: o, reason: from getter */
        public final String getNutritionLabelVitamin() {
            return this.nutritionLabelVitamin;
        }

        /* renamed from: p, reason: from getter */
        public final Object getOfflineDate() {
            return this.offlineDate;
        }

        /* renamed from: q, reason: from getter */
        public final String getPriceUnit() {
            return this.priceUnit;
        }

        /* renamed from: r, reason: from getter */
        public final String getProductDescription() {
            return this.productDescription;
        }

        /* renamed from: s, reason: from getter */
        public final String getProductDetails() {
            return this.productDetails;
        }

        /* renamed from: t, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        public String toString() {
            return "Product3(averagePoundsPerEach=" + this.averagePoundsPerEach + ", brandDescription=" + this.brandDescription + ", brandName=" + this.brandName + ", countryOfOrigin=" + this.countryOfOrigin + ", descriptiveFeatures=" + this.descriptiveFeatures + ", disclaimer=" + this.disclaimer + ", eventType=" + this.eventType + ", hasMPerks=" + this.hasMPerks + ", isAlcohol=" + this.isAlcohol + ", isBopas=" + this.isBopas + ", isBusinessActive=" + this.isBusinessActive + ", isChokingHazard=" + this.isChokingHazard + ", isCurbsideEligible=" + this.isCurbsideEligible + ", isDisplayable=" + this.isDisplayable + ", isFoodStampEligible=" + this.isFoodStampEligible + ", isHomeDeliveryAvailable=" + this.isHomeDeliveryAvailable + ", isPriceByWeight=" + this.isPriceByWeight + ", isPriceDisplayable=" + this.isPriceDisplayable + ", isPrimaryUpc=" + this.isPrimaryUpc + ", isProductAgeRestricted=" + this.isProductAgeRestricted + ", maxOrderQuantity=" + this.maxOrderQuantity + ", mPerksOfferId=" + this.mPerksOfferId + ", nutritionLabelHeader=" + this.nutritionLabelHeader + ", nutritionLabelMain=" + this.nutritionLabelMain + ", nutritionLabelMicroNutrients=" + this.nutritionLabelMicroNutrients + ", nutritionLabelMineral=" + this.nutritionLabelMineral + ", nutritionLabelVitamin=" + this.nutritionLabelVitamin + ", offlineDate=" + this.offlineDate + ", priceUnit=" + this.priceUnit + ", productDescription=" + this.productDescription + ", productDetails=" + this.productDetails + ", productId=" + this.productId + ", productName=" + this.productName + ", soldByUnit=" + this.soldByUnit + ", soldByUnitDescription=" + this.soldByUnitDescription + ", taxonomyDescription=" + this.taxonomyDescription + ", taxonomyId=" + this.taxonomyId + ", taxonomyParentId=" + this.taxonomyParentId + ", unitOfMeasureQuantity=" + this.unitOfMeasureQuantity + ", upc=" + this.upc + ", upcChkDigit=" + this.upcChkDigit + ", upcTypeName=" + this.upcTypeName + ", updatedAt=" + this.updatedAt + ')';
        }

        /* renamed from: u, reason: from getter */
        public final String getProductName() {
            return this.productName;
        }

        /* renamed from: v, reason: from getter */
        public final String getSoldByUnit() {
            return this.soldByUnit;
        }

        /* renamed from: w, reason: from getter */
        public final String getSoldByUnitDescription() {
            return this.soldByUnitDescription;
        }

        /* renamed from: x, reason: from getter */
        public final String getTaxonomyDescription() {
            return this.taxonomyDescription;
        }

        /* renamed from: y, reason: from getter */
        public final String getTaxonomyId() {
            return this.taxonomyId;
        }

        /* renamed from: z, reason: from getter */
        public final String getTaxonomyParentId() {
            return this.taxonomyParentId;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bC\b\u0086\b\u0018\u00002\u00020\u0001BÙ\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0001\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0001\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0019\u0012\u0010\u00105\u001a\f\u0012\u0006\u0012\u0004\u0018\u000104\u0018\u00010\u0019¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u00109R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\bD\u00109R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bE\u00109R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bF\u00109R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bG\u00109R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bH\u00109R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bI\u0010KR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bL\u0010J\u001a\u0004\bM\u0010KR\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bN\u0010J\u001a\u0004\bO\u0010KR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010KR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bR\u0010J\u001a\u0004\bS\u0010KR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bT\u0010J\u001a\u0004\bU\u0010KR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bV\u0010J\u001a\u0004\bW\u0010KR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bX\u0010J\u001a\u0004\bY\u0010KR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bZ\u0010J\u001a\u0004\b[\u0010KR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\\\u0010J\u001a\u0004\b]\u0010KR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b^\u0010J\u001a\u0004\b_\u0010KR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b`\u0010J\u001a\u0004\ba\u0010KR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bN\u0010dR\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bL\u0010gR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\bP\u00109R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bi\u0010C\u001a\u0004\bR\u00109R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bj\u0010C\u001a\u0004\bT\u00109R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bk\u0010C\u001a\u0004\bV\u00109R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bl\u0010C\u001a\u0004\bX\u00109R\u0019\u0010 \u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bm\u0010@\u001a\u0004\b\\\u0010AR\u0019\u0010!\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bn\u0010C\u001a\u0004\b^\u00109R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bo\u0010C\u001a\u0004\b`\u00109R\u0019\u0010#\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bp\u0010C\u001a\u0004\bb\u00109R\u0019\u0010$\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bq\u0010C\u001a\u0004\be\u00109R\u0019\u0010%\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\br\u0010C\u001a\u0004\bi\u00109R\u0019\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bs\u0010C\u001a\u0004\bj\u00109R\u0019\u0010'\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bt\u0010C\u001a\u0004\bk\u00109R\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bM\u0010u\u001a\u0004\bl\u0010vR\u0019\u0010*\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bm\u00109R\u0019\u0010+\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\bn\u00109R\u0019\u0010,\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\bo\u00109R\u0019\u0010-\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bU\u0010@\u001a\u0004\bp\u0010AR\u0017\u0010.\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bq\u00109R\u0019\u0010/\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bY\u0010C\u001a\u0004\br\u00109R\u0019\u00100\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b[\u0010C\u001a\u0004\bs\u00109R\u0019\u00101\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b]\u0010@\u001a\u0004\bt\u0010AR\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00198\u0006¢\u0006\f\n\u0004\b_\u0010f\u001a\u0004\bZ\u0010gR!\u00105\u001a\f\u0012\u0006\u0012\u0004\u0018\u000104\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\ba\u0010f\u001a\u0004\bh\u0010g¨\u0006w"}, d2 = {"LSo/f$k;", "", "averagePoundsPerEach", "", "brandDescription", "brandName", "countryOfOrigin", "descriptiveFeatures", "disclaimer", "eventType", "", "hasMPerks", "isAlcohol", "isBopas", "isBusinessActive", "isChokingHazard", "isCurbsideEligible", "isDisplayable", "isFoodStampEligible", "isHomeDeliveryAvailable", "isPriceByWeight", "isPrimaryUpc", "isProductAgeRestricted", "", "maxOrderQuantity", "", "mPerksOfferId", "nutritionLabelHeader", "nutritionLabelMain", "nutritionLabelMicroNutrients", "nutritionLabelMineral", "nutritionLabelVitamin", "offlineDate", "priceUnit", "productDescription", "productDetails", "productId", "productName", "soldByUnit", "soldByUnitDescription", "LSo/f$q;", "storeSpecificProductDetails", "taxonomyDescription", "taxonomyId", "taxonomyParentId", "unitOfMeasureQuantity", "upc", "upcChkDigit", "upcTypeName", "updatedAt", "LSo/f$f;", "offers", "LSo/f$l;", "productMedia", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LSo/f$q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "i", "I", "j", "J", "k", "K", "l", "L", "m", "M", "n", "N", "o", "O", "p", "P", "q", "Q", "r", "R", "s", "S", "t", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "u", "Ljava/util/List;", "()Ljava/util/List;", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "LSo/f$q;", "()LSo/f$q;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$k, reason: from toString */
    public static final /* data */ class Product {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object offlineDate;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceUnit;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productDescription;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productDetails;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productId;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productName;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
        private final String soldByUnit;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
        private final String soldByUnitDescription;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreSpecificProductDetails storeSpecificProductDetails;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
        private final String taxonomyDescription;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
        private final String taxonomyId;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
        private final String taxonomyParentId;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object unitOfMeasureQuantity;

        /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upc;

        /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upcChkDigit;

        /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upcTypeName;

        /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object updatedAt;

        /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Offer> offers;

        /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductMedium> productMedia;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object averagePoundsPerEach;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String brandDescription;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String brandName;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryOfOrigin;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String descriptiveFeatures;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String disclaimer;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String eventType;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean hasMPerks;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isAlcohol;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isBopas;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isBusinessActive;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isChokingHazard;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isCurbsideEligible;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isDisplayable;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isFoodStampEligible;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isHomeDeliveryAvailable;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isPriceByWeight;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isPrimaryUpc;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isProductAgeRestricted;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer maxOrderQuantity;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> mPerksOfferId;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nutritionLabelHeader;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nutritionLabelMain;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nutritionLabelMicroNutrients;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nutritionLabelMineral;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nutritionLabelVitamin;

        public Product(Object obj, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Integer num, List<String> list, String str7, String str8, String str9, String str10, String str11, Object obj2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, StoreSpecificProductDetails storeSpecificProductDetails, String str19, String str20, String str21, Object obj3, String upc, String str22, String str23, Object obj4, List<Offer> offers, List<ProductMedium> list2) {
            Intrinsics.j(upc, "upc");
            Intrinsics.j(offers, "offers");
            this.averagePoundsPerEach = obj;
            this.brandDescription = str;
            this.brandName = str2;
            this.countryOfOrigin = str3;
            this.descriptiveFeatures = str4;
            this.disclaimer = str5;
            this.eventType = str6;
            this.hasMPerks = bool;
            this.isAlcohol = bool2;
            this.isBopas = bool3;
            this.isBusinessActive = bool4;
            this.isChokingHazard = bool5;
            this.isCurbsideEligible = bool6;
            this.isDisplayable = bool7;
            this.isFoodStampEligible = bool8;
            this.isHomeDeliveryAvailable = bool9;
            this.isPriceByWeight = bool10;
            this.isPrimaryUpc = bool11;
            this.isProductAgeRestricted = bool12;
            this.maxOrderQuantity = num;
            this.mPerksOfferId = list;
            this.nutritionLabelHeader = str7;
            this.nutritionLabelMain = str8;
            this.nutritionLabelMicroNutrients = str9;
            this.nutritionLabelMineral = str10;
            this.nutritionLabelVitamin = str11;
            this.offlineDate = obj2;
            this.priceUnit = str12;
            this.productDescription = str13;
            this.productDetails = str14;
            this.productId = str15;
            this.productName = str16;
            this.soldByUnit = str17;
            this.soldByUnitDescription = str18;
            this.storeSpecificProductDetails = storeSpecificProductDetails;
            this.taxonomyDescription = str19;
            this.taxonomyId = str20;
            this.taxonomyParentId = str21;
            this.unitOfMeasureQuantity = obj3;
            this.upc = upc;
            this.upcChkDigit = str22;
            this.upcTypeName = str23;
            this.updatedAt = obj4;
            this.offers = offers;
            this.productMedia = list2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return Intrinsics.e(this.averagePoundsPerEach, product.averagePoundsPerEach) && Intrinsics.e(this.brandDescription, product.brandDescription) && Intrinsics.e(this.brandName, product.brandName) && Intrinsics.e(this.countryOfOrigin, product.countryOfOrigin) && Intrinsics.e(this.descriptiveFeatures, product.descriptiveFeatures) && Intrinsics.e(this.disclaimer, product.disclaimer) && Intrinsics.e(this.eventType, product.eventType) && Intrinsics.e(this.hasMPerks, product.hasMPerks) && Intrinsics.e(this.isAlcohol, product.isAlcohol) && Intrinsics.e(this.isBopas, product.isBopas) && Intrinsics.e(this.isBusinessActive, product.isBusinessActive) && Intrinsics.e(this.isChokingHazard, product.isChokingHazard) && Intrinsics.e(this.isCurbsideEligible, product.isCurbsideEligible) && Intrinsics.e(this.isDisplayable, product.isDisplayable) && Intrinsics.e(this.isFoodStampEligible, product.isFoodStampEligible) && Intrinsics.e(this.isHomeDeliveryAvailable, product.isHomeDeliveryAvailable) && Intrinsics.e(this.isPriceByWeight, product.isPriceByWeight) && Intrinsics.e(this.isPrimaryUpc, product.isPrimaryUpc) && Intrinsics.e(this.isProductAgeRestricted, product.isProductAgeRestricted) && Intrinsics.e(this.maxOrderQuantity, product.maxOrderQuantity) && Intrinsics.e(this.mPerksOfferId, product.mPerksOfferId) && Intrinsics.e(this.nutritionLabelHeader, product.nutritionLabelHeader) && Intrinsics.e(this.nutritionLabelMain, product.nutritionLabelMain) && Intrinsics.e(this.nutritionLabelMicroNutrients, product.nutritionLabelMicroNutrients) && Intrinsics.e(this.nutritionLabelMineral, product.nutritionLabelMineral) && Intrinsics.e(this.nutritionLabelVitamin, product.nutritionLabelVitamin) && Intrinsics.e(this.offlineDate, product.offlineDate) && Intrinsics.e(this.priceUnit, product.priceUnit) && Intrinsics.e(this.productDescription, product.productDescription) && Intrinsics.e(this.productDetails, product.productDetails) && Intrinsics.e(this.productId, product.productId) && Intrinsics.e(this.productName, product.productName) && Intrinsics.e(this.soldByUnit, product.soldByUnit) && Intrinsics.e(this.soldByUnitDescription, product.soldByUnitDescription) && Intrinsics.e(this.storeSpecificProductDetails, product.storeSpecificProductDetails) && Intrinsics.e(this.taxonomyDescription, product.taxonomyDescription) && Intrinsics.e(this.taxonomyId, product.taxonomyId) && Intrinsics.e(this.taxonomyParentId, product.taxonomyParentId) && Intrinsics.e(this.unitOfMeasureQuantity, product.unitOfMeasureQuantity) && Intrinsics.e(this.upc, product.upc) && Intrinsics.e(this.upcChkDigit, product.upcChkDigit) && Intrinsics.e(this.upcTypeName, product.upcTypeName) && Intrinsics.e(this.updatedAt, product.updatedAt) && Intrinsics.e(this.offers, product.offers) && Intrinsics.e(this.productMedia, product.productMedia);
        }

        /* renamed from: A, reason: from getter */
        public final String getTaxonomyDescription() {
            return this.taxonomyDescription;
        }

        /* renamed from: B, reason: from getter */
        public final String getTaxonomyId() {
            return this.taxonomyId;
        }

        /* renamed from: C, reason: from getter */
        public final String getTaxonomyParentId() {
            return this.taxonomyParentId;
        }

        /* renamed from: D, reason: from getter */
        public final Object getUnitOfMeasureQuantity() {
            return this.unitOfMeasureQuantity;
        }

        /* renamed from: E, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        /* renamed from: F, reason: from getter */
        public final String getUpcChkDigit() {
            return this.upcChkDigit;
        }

        /* renamed from: G, reason: from getter */
        public final String getUpcTypeName() {
            return this.upcTypeName;
        }

        /* renamed from: H, reason: from getter */
        public final Object getUpdatedAt() {
            return this.updatedAt;
        }

        /* renamed from: I, reason: from getter */
        public final Boolean getIsAlcohol() {
            return this.isAlcohol;
        }

        /* renamed from: J, reason: from getter */
        public final Boolean getIsBopas() {
            return this.isBopas;
        }

        /* renamed from: K, reason: from getter */
        public final Boolean getIsBusinessActive() {
            return this.isBusinessActive;
        }

        /* renamed from: L, reason: from getter */
        public final Boolean getIsChokingHazard() {
            return this.isChokingHazard;
        }

        /* renamed from: M, reason: from getter */
        public final Boolean getIsCurbsideEligible() {
            return this.isCurbsideEligible;
        }

        /* renamed from: N, reason: from getter */
        public final Boolean getIsDisplayable() {
            return this.isDisplayable;
        }

        /* renamed from: O, reason: from getter */
        public final Boolean getIsFoodStampEligible() {
            return this.isFoodStampEligible;
        }

        /* renamed from: P, reason: from getter */
        public final Boolean getIsHomeDeliveryAvailable() {
            return this.isHomeDeliveryAvailable;
        }

        /* renamed from: Q, reason: from getter */
        public final Boolean getIsPriceByWeight() {
            return this.isPriceByWeight;
        }

        /* renamed from: R, reason: from getter */
        public final Boolean getIsPrimaryUpc() {
            return this.isPrimaryUpc;
        }

        /* renamed from: S, reason: from getter */
        public final Boolean getIsProductAgeRestricted() {
            return this.isProductAgeRestricted;
        }

        /* renamed from: a, reason: from getter */
        public final Object getAveragePoundsPerEach() {
            return this.averagePoundsPerEach;
        }

        /* renamed from: b, reason: from getter */
        public final String getBrandDescription() {
            return this.brandDescription;
        }

        /* renamed from: c, reason: from getter */
        public final String getBrandName() {
            return this.brandName;
        }

        /* renamed from: d, reason: from getter */
        public final String getCountryOfOrigin() {
            return this.countryOfOrigin;
        }

        /* renamed from: e, reason: from getter */
        public final String getDescriptiveFeatures() {
            return this.descriptiveFeatures;
        }

        /* renamed from: f, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* renamed from: g, reason: from getter */
        public final String getEventType() {
            return this.eventType;
        }

        /* renamed from: h, reason: from getter */
        public final Boolean getHasMPerks() {
            return this.hasMPerks;
        }

        public int hashCode() {
            Object obj = this.averagePoundsPerEach;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            String str = this.brandDescription;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.brandName;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.countryOfOrigin;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.descriptiveFeatures;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.disclaimer;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.eventType;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool = this.hasMPerks;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isAlcohol;
            int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isBopas;
            int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isBusinessActive;
            int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isChokingHazard;
            int iHashCode12 = (iHashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.isCurbsideEligible;
            int iHashCode13 = (iHashCode12 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.isDisplayable;
            int iHashCode14 = (iHashCode13 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.isFoodStampEligible;
            int iHashCode15 = (iHashCode14 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.isHomeDeliveryAvailable;
            int iHashCode16 = (iHashCode15 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.isPriceByWeight;
            int iHashCode17 = (iHashCode16 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.isPrimaryUpc;
            int iHashCode18 = (iHashCode17 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.isProductAgeRestricted;
            int iHashCode19 = (iHashCode18 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Integer num = this.maxOrderQuantity;
            int iHashCode20 = (iHashCode19 + (num == null ? 0 : num.hashCode())) * 31;
            List<String> list = this.mPerksOfferId;
            int iHashCode21 = (iHashCode20 + (list == null ? 0 : list.hashCode())) * 31;
            String str7 = this.nutritionLabelHeader;
            int iHashCode22 = (iHashCode21 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.nutritionLabelMain;
            int iHashCode23 = (iHashCode22 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.nutritionLabelMicroNutrients;
            int iHashCode24 = (iHashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.nutritionLabelMineral;
            int iHashCode25 = (iHashCode24 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.nutritionLabelVitamin;
            int iHashCode26 = (iHashCode25 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Object obj2 = this.offlineDate;
            int iHashCode27 = (iHashCode26 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            String str12 = this.priceUnit;
            int iHashCode28 = (iHashCode27 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.productDescription;
            int iHashCode29 = (iHashCode28 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.productDetails;
            int iHashCode30 = (iHashCode29 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.productId;
            int iHashCode31 = (iHashCode30 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.productName;
            int iHashCode32 = (iHashCode31 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.soldByUnit;
            int iHashCode33 = (iHashCode32 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.soldByUnitDescription;
            int iHashCode34 = (iHashCode33 + (str18 == null ? 0 : str18.hashCode())) * 31;
            StoreSpecificProductDetails storeSpecificProductDetails = this.storeSpecificProductDetails;
            int iHashCode35 = (iHashCode34 + (storeSpecificProductDetails == null ? 0 : storeSpecificProductDetails.hashCode())) * 31;
            String str19 = this.taxonomyDescription;
            int iHashCode36 = (iHashCode35 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.taxonomyId;
            int iHashCode37 = (iHashCode36 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.taxonomyParentId;
            int iHashCode38 = (iHashCode37 + (str21 == null ? 0 : str21.hashCode())) * 31;
            Object obj3 = this.unitOfMeasureQuantity;
            int iHashCode39 = (((iHashCode38 + (obj3 == null ? 0 : obj3.hashCode())) * 31) + this.upc.hashCode()) * 31;
            String str22 = this.upcChkDigit;
            int iHashCode40 = (iHashCode39 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.upcTypeName;
            int iHashCode41 = (iHashCode40 + (str23 == null ? 0 : str23.hashCode())) * 31;
            Object obj4 = this.updatedAt;
            int iHashCode42 = (((iHashCode41 + (obj4 == null ? 0 : obj4.hashCode())) * 31) + this.offers.hashCode()) * 31;
            List<ProductMedium> list2 = this.productMedia;
            return iHashCode42 + (list2 != null ? list2.hashCode() : 0);
        }

        public final List<String> i() {
            return this.mPerksOfferId;
        }

        /* renamed from: j, reason: from getter */
        public final Integer getMaxOrderQuantity() {
            return this.maxOrderQuantity;
        }

        /* renamed from: k, reason: from getter */
        public final String getNutritionLabelHeader() {
            return this.nutritionLabelHeader;
        }

        /* renamed from: l, reason: from getter */
        public final String getNutritionLabelMain() {
            return this.nutritionLabelMain;
        }

        /* renamed from: m, reason: from getter */
        public final String getNutritionLabelMicroNutrients() {
            return this.nutritionLabelMicroNutrients;
        }

        /* renamed from: n, reason: from getter */
        public final String getNutritionLabelMineral() {
            return this.nutritionLabelMineral;
        }

        /* renamed from: o, reason: from getter */
        public final String getNutritionLabelVitamin() {
            return this.nutritionLabelVitamin;
        }

        public final List<Offer> p() {
            return this.offers;
        }

        /* renamed from: q, reason: from getter */
        public final Object getOfflineDate() {
            return this.offlineDate;
        }

        /* renamed from: r, reason: from getter */
        public final String getPriceUnit() {
            return this.priceUnit;
        }

        /* renamed from: s, reason: from getter */
        public final String getProductDescription() {
            return this.productDescription;
        }

        /* renamed from: t, reason: from getter */
        public final String getProductDetails() {
            return this.productDetails;
        }

        public String toString() {
            return "Product(averagePoundsPerEach=" + this.averagePoundsPerEach + ", brandDescription=" + this.brandDescription + ", brandName=" + this.brandName + ", countryOfOrigin=" + this.countryOfOrigin + ", descriptiveFeatures=" + this.descriptiveFeatures + ", disclaimer=" + this.disclaimer + ", eventType=" + this.eventType + ", hasMPerks=" + this.hasMPerks + ", isAlcohol=" + this.isAlcohol + ", isBopas=" + this.isBopas + ", isBusinessActive=" + this.isBusinessActive + ", isChokingHazard=" + this.isChokingHazard + ", isCurbsideEligible=" + this.isCurbsideEligible + ", isDisplayable=" + this.isDisplayable + ", isFoodStampEligible=" + this.isFoodStampEligible + ", isHomeDeliveryAvailable=" + this.isHomeDeliveryAvailable + ", isPriceByWeight=" + this.isPriceByWeight + ", isPrimaryUpc=" + this.isPrimaryUpc + ", isProductAgeRestricted=" + this.isProductAgeRestricted + ", maxOrderQuantity=" + this.maxOrderQuantity + ", mPerksOfferId=" + this.mPerksOfferId + ", nutritionLabelHeader=" + this.nutritionLabelHeader + ", nutritionLabelMain=" + this.nutritionLabelMain + ", nutritionLabelMicroNutrients=" + this.nutritionLabelMicroNutrients + ", nutritionLabelMineral=" + this.nutritionLabelMineral + ", nutritionLabelVitamin=" + this.nutritionLabelVitamin + ", offlineDate=" + this.offlineDate + ", priceUnit=" + this.priceUnit + ", productDescription=" + this.productDescription + ", productDetails=" + this.productDetails + ", productId=" + this.productId + ", productName=" + this.productName + ", soldByUnit=" + this.soldByUnit + ", soldByUnitDescription=" + this.soldByUnitDescription + ", storeSpecificProductDetails=" + this.storeSpecificProductDetails + ", taxonomyDescription=" + this.taxonomyDescription + ", taxonomyId=" + this.taxonomyId + ", taxonomyParentId=" + this.taxonomyParentId + ", unitOfMeasureQuantity=" + this.unitOfMeasureQuantity + ", upc=" + this.upc + ", upcChkDigit=" + this.upcChkDigit + ", upcTypeName=" + this.upcTypeName + ", updatedAt=" + this.updatedAt + ", offers=" + this.offers + ", productMedia=" + this.productMedia + ')';
        }

        /* renamed from: u, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        public final List<ProductMedium> v() {
            return this.productMedia;
        }

        /* renamed from: w, reason: from getter */
        public final String getProductName() {
            return this.productName;
        }

        /* renamed from: x, reason: from getter */
        public final String getSoldByUnit() {
            return this.soldByUnit;
        }

        /* renamed from: y, reason: from getter */
        public final String getSoldByUnitDescription() {
            return this.soldByUnitDescription;
        }

        /* renamed from: z, reason: from getter */
        public final StoreSpecificProductDetails getStoreSpecificProductDetails() {
            return this.storeSpecificProductDetails;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, d2 = {"LSo/f$l;", "", "", "altText", "defaultAltText", "url", "", "isDefault", "", "height", "width", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Z", "f", "()Z", "e", "I", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$l, reason: from toString */
    public static final /* data */ class ProductMedium {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String altText;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String defaultAltText;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isDefault;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int height;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int width;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductMedium)) {
                return false;
            }
            ProductMedium productMedium = (ProductMedium) other;
            return Intrinsics.e(this.altText, productMedium.altText) && Intrinsics.e(this.defaultAltText, productMedium.defaultAltText) && Intrinsics.e(this.url, productMedium.url) && this.isDefault == productMedium.isDefault && this.height == productMedium.height && this.width == productMedium.width;
        }

        /* renamed from: a, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        /* renamed from: b, reason: from getter */
        public final String getDefaultAltText() {
            return this.defaultAltText;
        }

        /* renamed from: c, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: d, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: e, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsDefault() {
            return this.isDefault;
        }

        public int hashCode() {
            String str = this.altText;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.defaultAltText;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.url;
            return ((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDefault)) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.width);
        }

        public String toString() {
            return "ProductMedium(altText=" + this.altText + ", defaultAltText=" + this.defaultAltText + ", url=" + this.url + ", isDefault=" + this.isDefault + ", height=" + this.height + ", width=" + this.width + ')';
        }

        public ProductMedium(String str, String str2, String str3, boolean z10, int i10, int i11) {
            this.altText = str;
            this.defaultAltText = str2;
            this.url = str3;
            this.isDefault = z10;
            this.height = i10;
            this.width = i11;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b!\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"LSo/f$m;", "", "", "currency", "", "isOnSale", "basePrice", "basePricePerSoldByUnit", "priceDescription", "priceText", "customerPricePerSoldByUnit", "savingsDescription", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "d", "e", "f", "g", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$m, reason: from toString */
    public static final /* data */ class ProductStore {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currency;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isOnSale;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object basePrice;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object basePricePerSoldByUnit;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceDescription;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceText;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object customerPricePerSoldByUnit;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String savingsDescription;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductStore)) {
                return false;
            }
            ProductStore productStore = (ProductStore) other;
            return Intrinsics.e(this.currency, productStore.currency) && Intrinsics.e(this.isOnSale, productStore.isOnSale) && Intrinsics.e(this.basePrice, productStore.basePrice) && Intrinsics.e(this.basePricePerSoldByUnit, productStore.basePricePerSoldByUnit) && Intrinsics.e(this.priceDescription, productStore.priceDescription) && Intrinsics.e(this.priceText, productStore.priceText) && Intrinsics.e(this.customerPricePerSoldByUnit, productStore.customerPricePerSoldByUnit) && Intrinsics.e(this.savingsDescription, productStore.savingsDescription);
        }

        /* renamed from: a, reason: from getter */
        public final Object getBasePrice() {
            return this.basePrice;
        }

        /* renamed from: b, reason: from getter */
        public final Object getBasePricePerSoldByUnit() {
            return this.basePricePerSoldByUnit;
        }

        /* renamed from: c, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* renamed from: d, reason: from getter */
        public final Object getCustomerPricePerSoldByUnit() {
            return this.customerPricePerSoldByUnit;
        }

        /* renamed from: e, reason: from getter */
        public final String getPriceDescription() {
            return this.priceDescription;
        }

        /* renamed from: f, reason: from getter */
        public final String getPriceText() {
            return this.priceText;
        }

        /* renamed from: g, reason: from getter */
        public final String getSavingsDescription() {
            return this.savingsDescription;
        }

        /* renamed from: h, reason: from getter */
        public final Boolean getIsOnSale() {
            return this.isOnSale;
        }

        public int hashCode() {
            String str = this.currency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isOnSale;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Object obj = this.basePrice;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.basePricePerSoldByUnit;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            String str2 = this.priceDescription;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.priceText;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Object obj3 = this.customerPricePerSoldByUnit;
            int iHashCode7 = (iHashCode6 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            String str4 = this.savingsDescription;
            return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "ProductStore(currency=" + this.currency + ", isOnSale=" + this.isOnSale + ", basePrice=" + this.basePrice + ", basePricePerSoldByUnit=" + this.basePricePerSoldByUnit + ", priceDescription=" + this.priceDescription + ", priceText=" + this.priceText + ", customerPricePerSoldByUnit=" + this.customerPricePerSoldByUnit + ", savingsDescription=" + this.savingsDescription + ')';
        }

        public ProductStore(String str, Boolean bool, Object obj, Object obj2, String str2, String str3, Object obj3, String str4) {
            this.currency = str;
            this.isOnSale = bool;
            this.basePrice = obj;
            this.basePricePerSoldByUnit = obj2;
            this.priceDescription = str2;
            this.priceText = str3;
            this.customerPricePerSoldByUnit = obj3;
            this.savingsDescription = str4;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"LSo/f$n;", "", "", "status", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$n, reason: from toString */
    public static final /* data */ class Stock1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String status;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stock1) && Intrinsics.e(this.status, ((Stock1) other).status);
        }

        /* renamed from: a, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            String str = this.status;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Stock1(status=" + this.status + ')';
        }

        public Stock1(String str) {
            this.status = str;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"LSo/f$o;", "", "", "ilcPrimary", "ilcs", "stockStatus", "", "storeId", "upc", "upcStoreCompositeKey", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "I", "e", "f", "g", "Ljava/lang/Object;", "()Ljava/lang/Object;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$o, reason: from toString */
    public static final /* data */ class Stock {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ilcPrimary;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ilcs;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stockStatus;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int storeId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upc;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upcStoreCompositeKey;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object updatedAt;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stock)) {
                return false;
            }
            Stock stock = (Stock) other;
            return Intrinsics.e(this.ilcPrimary, stock.ilcPrimary) && Intrinsics.e(this.ilcs, stock.ilcs) && Intrinsics.e(this.stockStatus, stock.stockStatus) && this.storeId == stock.storeId && Intrinsics.e(this.upc, stock.upc) && Intrinsics.e(this.upcStoreCompositeKey, stock.upcStoreCompositeKey) && Intrinsics.e(this.updatedAt, stock.updatedAt);
        }

        public Stock(String str, String str2, String str3, int i10, String upc, String upcStoreCompositeKey, Object obj) {
            Intrinsics.j(upc, "upc");
            Intrinsics.j(upcStoreCompositeKey, "upcStoreCompositeKey");
            this.ilcPrimary = str;
            this.ilcs = str2;
            this.stockStatus = str3;
            this.storeId = i10;
            this.upc = upc;
            this.upcStoreCompositeKey = upcStoreCompositeKey;
            this.updatedAt = obj;
        }

        /* renamed from: a, reason: from getter */
        public final String getIlcPrimary() {
            return this.ilcPrimary;
        }

        /* renamed from: b, reason: from getter */
        public final String getIlcs() {
            return this.ilcs;
        }

        /* renamed from: c, reason: from getter */
        public final String getStockStatus() {
            return this.stockStatus;
        }

        /* renamed from: d, reason: from getter */
        public final int getStoreId() {
            return this.storeId;
        }

        /* renamed from: e, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        /* renamed from: f, reason: from getter */
        public final String getUpcStoreCompositeKey() {
            return this.upcStoreCompositeKey;
        }

        /* renamed from: g, reason: from getter */
        public final Object getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            String str = this.ilcPrimary;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.ilcs;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.stockStatus;
            int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.storeId)) * 31) + this.upc.hashCode()) * 31) + this.upcStoreCompositeKey.hashCode()) * 31;
            Object obj = this.updatedAt;
            return iHashCode3 + (obj != null ? obj.hashCode() : 0);
        }

        public String toString() {
            return "Stock(ilcPrimary=" + this.ilcPrimary + ", ilcs=" + this.ilcs + ", stockStatus=" + this.stockStatus + ", storeId=" + this.storeId + ", upc=" + this.upc + ", upcStoreCompositeKey=" + this.upcStoreCompositeKey + ", updatedAt=" + this.updatedAt + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LSo/f$p;", "", "LSo/f$m;", "productStore", "LSo/f$n;", "stock", "<init>", "(LSo/f$m;LSo/f$n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSo/f$m;", "()LSo/f$m;", "b", "LSo/f$n;", "()LSo/f$n;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$p, reason: from toString */
    public static final /* data */ class StoreSpecificProductDetails1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductStore productStore;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Stock1 stock;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoreSpecificProductDetails1)) {
                return false;
            }
            StoreSpecificProductDetails1 storeSpecificProductDetails1 = (StoreSpecificProductDetails1) other;
            return Intrinsics.e(this.productStore, storeSpecificProductDetails1.productStore) && Intrinsics.e(this.stock, storeSpecificProductDetails1.stock);
        }

        /* renamed from: a, reason: from getter */
        public final ProductStore getProductStore() {
            return this.productStore;
        }

        /* renamed from: b, reason: from getter */
        public final Stock1 getStock() {
            return this.stock;
        }

        public int hashCode() {
            ProductStore productStore = this.productStore;
            int iHashCode = (productStore == null ? 0 : productStore.hashCode()) * 31;
            Stock1 stock1 = this.stock;
            return iHashCode + (stock1 != null ? stock1.hashCode() : 0);
        }

        public String toString() {
            return "StoreSpecificProductDetails1(productStore=" + this.productStore + ", stock=" + this.stock + ')';
        }

        public StoreSpecificProductDetails1(ProductStore productStore, Stock1 stock1) {
            this.productStore = productStore;
            this.stock = stock1;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR!\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"LSo/f$q;", "", "LSo/f$g;", "pricing", "LSo/f$o;", "stock", "", "LSo/f$c;", "complexPromo", "LSo/f$r;", "variants", "<init>", "(LSo/f$g;LSo/f$o;Ljava/util/List;LSo/f$r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSo/f$g;", "b", "()LSo/f$g;", "LSo/f$o;", "c", "()LSo/f$o;", "Ljava/util/List;", "()Ljava/util/List;", "d", "LSo/f$r;", "()LSo/f$r;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$q, reason: from toString */
    public static final /* data */ class StoreSpecificProductDetails {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pricing pricing;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Stock stock;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ComplexPromo> complexPromo;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Variants variants;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoreSpecificProductDetails)) {
                return false;
            }
            StoreSpecificProductDetails storeSpecificProductDetails = (StoreSpecificProductDetails) other;
            return Intrinsics.e(this.pricing, storeSpecificProductDetails.pricing) && Intrinsics.e(this.stock, storeSpecificProductDetails.stock) && Intrinsics.e(this.complexPromo, storeSpecificProductDetails.complexPromo) && Intrinsics.e(this.variants, storeSpecificProductDetails.variants);
        }

        public final List<ComplexPromo> a() {
            return this.complexPromo;
        }

        /* renamed from: b, reason: from getter */
        public final Pricing getPricing() {
            return this.pricing;
        }

        /* renamed from: c, reason: from getter */
        public final Stock getStock() {
            return this.stock;
        }

        /* renamed from: d, reason: from getter */
        public final Variants getVariants() {
            return this.variants;
        }

        public int hashCode() {
            Pricing pricing = this.pricing;
            int iHashCode = (pricing == null ? 0 : pricing.hashCode()) * 31;
            Stock stock = this.stock;
            int iHashCode2 = (iHashCode + (stock == null ? 0 : stock.hashCode())) * 31;
            List<ComplexPromo> list = this.complexPromo;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Variants variants = this.variants;
            return iHashCode3 + (variants != null ? variants.hashCode() : 0);
        }

        public String toString() {
            return "StoreSpecificProductDetails(pricing=" + this.pricing + ", stock=" + this.stock + ", complexPromo=" + this.complexPromo + ", variants=" + this.variants + ')';
        }

        public StoreSpecificProductDetails(Pricing pricing, Stock stock, List<ComplexPromo> list, Variants variants) {
            this.pricing = pricing;
            this.stock = stock;
            this.complexPromo = list;
            this.variants = variants;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LSo/f$r;", "", "", "productId", "", "LSo/f$e;", "groups", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.f$r, reason: from toString */
    public static final /* data */ class Variants {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Group> groups;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Variants)) {
                return false;
            }
            Variants variants = (Variants) other;
            return Intrinsics.e(this.productId, variants.productId) && Intrinsics.e(this.groups, variants.groups);
        }

        public final List<Group> a() {
            return this.groups;
        }

        /* renamed from: b, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            String str = this.productId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<Group> list = this.groups;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Variants(productId=" + this.productId + ", groups=" + this.groups + ')';
        }

        public Variants(String str, List<Group> list) {
            this.productId = str;
            this.groups = list;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDetailQuery)) {
            return false;
        }
        ProductDetailQuery productDetailQuery = (ProductDetailQuery) other;
        return Intrinsics.e(this.upc, productDetailQuery.upc) && this.storeId == productDetailQuery.storeId;
    }

    public ProductDetailQuery(String upc, int i10) {
        Intrinsics.j(upc, "upc");
        this.upc = upc;
        this.storeId = i10;
    }

    @Override // z6.t
    public InterfaceC18452a<Data> a() {
        return C18453b.d(C5341g0.f36562a, false, 1, null);
    }

    @Override // z6.InterfaceC18449A
    public String b() {
        return "0197ac80520584ff26791cdca746219f40937f22090a2319c6a64fe39d5744ea";
    }

    @Override // z6.InterfaceC18449A
    public String c() {
        return INSTANCE.a();
    }

    @Override // z6.t
    public void d(D6.g writer, p customScalarAdapters, boolean withDefaultValues) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        v0.f36621a.a(writer, this, customScalarAdapters, withDefaultValues);
    }

    /* renamed from: e, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: f, reason: from getter */
    public final String getUpc() {
        return this.upc;
    }

    public int hashCode() {
        return (this.upc.hashCode() * 31) + Integer.hashCode(this.storeId);
    }

    @Override // z6.InterfaceC18449A
    public String name() {
        return "ProductDetailQuery";
    }

    public String toString() {
        return "ProductDetailQuery(upc=" + this.upc + ", storeId=" + this.storeId + ')';
    }
}
