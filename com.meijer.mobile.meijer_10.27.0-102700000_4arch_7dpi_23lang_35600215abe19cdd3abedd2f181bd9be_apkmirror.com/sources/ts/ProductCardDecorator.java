package ts;

import Co.ProductFullDetails;
import Gp.ProductRatings;
import Ho.ProductSponsorship;
import Qo.l;
import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vl.ProductEligibility;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\f\b\u0002\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b<\u0010;\u001a\u0004\b>\u0010=R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u0010;\u001a\u0004\b6\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bC\u0010=R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001b\u0010\u0013\u001a\u00060\u0011j\u0002`\u00128\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010.R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b?\u0010N\u001a\u0004\b2\u0010OR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bA\u0010N\u001a\u0004\bK\u0010OR\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bP\u0010E\u001a\u0004\bQ\u0010,R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\bR\u0010OR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bS\u00109R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u00107\u001a\u0004\bU\u00109R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\b@\u00109R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u00107\u001a\u0004\bW\u00109R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bB\u0010ZR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bS\u0010;\u001a\u0004\b:\u0010=R\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00107\u001a\u0004\b[\u00109R\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u00107\u001a\u0004\bV\u00109R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u00107\u001a\u0004\bT\u00109R\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u00107\u001a\u0004\bX\u00109R\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\bP\u0010_R\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bD\u0010bR\u0019\u0010(\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bc\u0010;\u001a\u0004\bG\u0010=¨\u0006d"}, d2 = {"Lts/a;", "", "LCo/h;", "product", "", "isOnSale", "Lak/a;", "currentPrice", "currentPriceDescription", "regularPrice", "regularPriceDescription", "amountSaved", "weightUnitSizeAndPrice", "", "thumbnailUrl", "Lvl/b$a;", "cartEligibility", "", "Lcom/meijer/mobile/cart/model/common/EntryNumber;", "entryNumber", "", "actualQuantity", "qtyIncrement", "unitOfMeasure", "maxQuantityAllowed", "isLowStock", "isOutOfStock", "hasMPerksOffers", "isEligibleForCart", "LQo/l;", "productQuery", "complexPromo", "isStepperExpanded", "isBuyAgain", "isBopas", "isInStoreOnly", "LHo/a;", "sponsorship", "LGp/c;", "productRating", "productRatingDescription", "<init>", "(LCo/h;ZLak/a;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;Ljava/lang/String;Lvl/b$a;IDDLjava/lang/String;DZZZZLQo/l;Lak/a;ZZZZLHo/a;LGp/c;Lak/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "g", "()LCo/h;", "b", "Z", "v", "()Z", "c", "Lak/a;", "d", "()Lak/a;", "e", "l", "f", "m", "h", "p", "i", "Ljava/lang/String;", "o", "j", "Lvl/b$a;", "getCartEligibility", "()Lvl/b$a;", "k", "I", "getEntryNumber", "D", "()D", "n", "getUnitOfMeasure", "getMaxQuantityAllowed", "u", "q", "w", "r", "s", "t", "LQo/l;", "()LQo/l;", "x", "y", "z", "LHo/a;", "()LHo/a;", "A", "LGp/c;", "()LGp/c;", "B", "productcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ts.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductCardDecorator {

    /* renamed from: C, reason: collision with root package name */
    public static final int f162061C = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductRatings productRating;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a productRatingDescription;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnSale;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a currentPrice;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a currentPriceDescription;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a regularPrice;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a regularPriceDescription;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a amountSaved;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a weightUnitSizeAndPrice;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String thumbnailUrl;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductEligibility.a cartEligibility;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final int entryNumber;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final double actualQuantity;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final double qtyIncrement;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitOfMeasure;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final double maxQuantityAllowed;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLowStock;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOutOfStock;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasMPerksOffers;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEligibleForCart;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final l productQuery;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a complexPromo;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isStepperExpanded;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBuyAgain;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBopas;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInStoreOnly;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductSponsorship sponsorship;

    public ProductCardDecorator(ProductFullDetails product, boolean z10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5, AbstractC5607a abstractC5607a6, String str, ProductEligibility.a cartEligibility, int i10, double d10, double d11, String unitOfMeasure, double d12, boolean z11, boolean z12, boolean z13, boolean z14, l lVar, AbstractC5607a abstractC5607a7, boolean z15, boolean z16, boolean z17, boolean z18, ProductSponsorship productSponsorship, ProductRatings productRatings, AbstractC5607a abstractC5607a8) {
        Intrinsics.j(product, "product");
        Intrinsics.j(cartEligibility, "cartEligibility");
        Intrinsics.j(unitOfMeasure, "unitOfMeasure");
        this.product = product;
        this.isOnSale = z10;
        this.currentPrice = abstractC5607a;
        this.currentPriceDescription = abstractC5607a2;
        this.regularPrice = abstractC5607a3;
        this.regularPriceDescription = abstractC5607a4;
        this.amountSaved = abstractC5607a5;
        this.weightUnitSizeAndPrice = abstractC5607a6;
        this.thumbnailUrl = str;
        this.cartEligibility = cartEligibility;
        this.entryNumber = i10;
        this.actualQuantity = d10;
        this.qtyIncrement = d11;
        this.unitOfMeasure = unitOfMeasure;
        this.maxQuantityAllowed = d12;
        this.isLowStock = z11;
        this.isOutOfStock = z12;
        this.hasMPerksOffers = z13;
        this.isEligibleForCart = z14;
        this.productQuery = lVar;
        this.complexPromo = abstractC5607a7;
        this.isStepperExpanded = z15;
        this.isBuyAgain = z16;
        this.isBopas = z17;
        this.isInStoreOnly = z18;
        this.sponsorship = productSponsorship;
        this.productRating = productRatings;
        this.productRatingDescription = abstractC5607a8;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCardDecorator)) {
            return false;
        }
        ProductCardDecorator productCardDecorator = (ProductCardDecorator) other;
        return Intrinsics.e(this.product, productCardDecorator.product) && this.isOnSale == productCardDecorator.isOnSale && Intrinsics.e(this.currentPrice, productCardDecorator.currentPrice) && Intrinsics.e(this.currentPriceDescription, productCardDecorator.currentPriceDescription) && Intrinsics.e(this.regularPrice, productCardDecorator.regularPrice) && Intrinsics.e(this.regularPriceDescription, productCardDecorator.regularPriceDescription) && Intrinsics.e(this.amountSaved, productCardDecorator.amountSaved) && Intrinsics.e(this.weightUnitSizeAndPrice, productCardDecorator.weightUnitSizeAndPrice) && Intrinsics.e(this.thumbnailUrl, productCardDecorator.thumbnailUrl) && Intrinsics.e(this.cartEligibility, productCardDecorator.cartEligibility) && this.entryNumber == productCardDecorator.entryNumber && Double.compare(this.actualQuantity, productCardDecorator.actualQuantity) == 0 && Double.compare(this.qtyIncrement, productCardDecorator.qtyIncrement) == 0 && Intrinsics.e(this.unitOfMeasure, productCardDecorator.unitOfMeasure) && Double.compare(this.maxQuantityAllowed, productCardDecorator.maxQuantityAllowed) == 0 && this.isLowStock == productCardDecorator.isLowStock && this.isOutOfStock == productCardDecorator.isOutOfStock && this.hasMPerksOffers == productCardDecorator.hasMPerksOffers && this.isEligibleForCart == productCardDecorator.isEligibleForCart && Intrinsics.e(this.productQuery, productCardDecorator.productQuery) && Intrinsics.e(this.complexPromo, productCardDecorator.complexPromo) && this.isStepperExpanded == productCardDecorator.isStepperExpanded && this.isBuyAgain == productCardDecorator.isBuyAgain && this.isBopas == productCardDecorator.isBopas && this.isInStoreOnly == productCardDecorator.isInStoreOnly && Intrinsics.e(this.sponsorship, productCardDecorator.sponsorship) && Intrinsics.e(this.productRating, productCardDecorator.productRating) && Intrinsics.e(this.productRatingDescription, productCardDecorator.productRatingDescription);
    }

    /* renamed from: a, reason: from getter */
    public final double getActualQuantity() {
        return this.actualQuantity;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getAmountSaved() {
        return this.amountSaved;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getComplexPromo() {
        return this.complexPromo;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getCurrentPrice() {
        return this.currentPrice;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC5607a getCurrentPriceDescription() {
        return this.currentPriceDescription;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getHasMPerksOffers() {
        return this.hasMPerksOffers;
    }

    /* renamed from: g, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    /* renamed from: h, reason: from getter */
    public final l getProductQuery() {
        return this.productQuery;
    }

    public int hashCode() {
        int iHashCode = ((this.product.hashCode() * 31) + Boolean.hashCode(this.isOnSale)) * 31;
        AbstractC5607a abstractC5607a = this.currentPrice;
        int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        AbstractC5607a abstractC5607a2 = this.currentPriceDescription;
        int iHashCode3 = (iHashCode2 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
        AbstractC5607a abstractC5607a3 = this.regularPrice;
        int iHashCode4 = (iHashCode3 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31;
        AbstractC5607a abstractC5607a4 = this.regularPriceDescription;
        int iHashCode5 = (iHashCode4 + (abstractC5607a4 == null ? 0 : abstractC5607a4.hashCode())) * 31;
        AbstractC5607a abstractC5607a5 = this.amountSaved;
        int iHashCode6 = (iHashCode5 + (abstractC5607a5 == null ? 0 : abstractC5607a5.hashCode())) * 31;
        AbstractC5607a abstractC5607a6 = this.weightUnitSizeAndPrice;
        int iHashCode7 = (iHashCode6 + (abstractC5607a6 == null ? 0 : abstractC5607a6.hashCode())) * 31;
        String str = this.thumbnailUrl;
        int iHashCode8 = (((((((((((((((((((((iHashCode7 + (str == null ? 0 : str.hashCode())) * 31) + this.cartEligibility.hashCode()) * 31) + Integer.hashCode(this.entryNumber)) * 31) + Double.hashCode(this.actualQuantity)) * 31) + Double.hashCode(this.qtyIncrement)) * 31) + this.unitOfMeasure.hashCode()) * 31) + Double.hashCode(this.maxQuantityAllowed)) * 31) + Boolean.hashCode(this.isLowStock)) * 31) + Boolean.hashCode(this.isOutOfStock)) * 31) + Boolean.hashCode(this.hasMPerksOffers)) * 31) + Boolean.hashCode(this.isEligibleForCart)) * 31;
        l lVar = this.productQuery;
        int iHashCode9 = (iHashCode8 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        AbstractC5607a abstractC5607a7 = this.complexPromo;
        int iHashCode10 = (((((((((iHashCode9 + (abstractC5607a7 == null ? 0 : abstractC5607a7.hashCode())) * 31) + Boolean.hashCode(this.isStepperExpanded)) * 31) + Boolean.hashCode(this.isBuyAgain)) * 31) + Boolean.hashCode(this.isBopas)) * 31) + Boolean.hashCode(this.isInStoreOnly)) * 31;
        ProductSponsorship productSponsorship = this.sponsorship;
        int iHashCode11 = (iHashCode10 + (productSponsorship == null ? 0 : productSponsorship.hashCode())) * 31;
        ProductRatings productRatings = this.productRating;
        int iHashCode12 = (iHashCode11 + (productRatings == null ? 0 : productRatings.hashCode())) * 31;
        AbstractC5607a abstractC5607a8 = this.productRatingDescription;
        return iHashCode12 + (abstractC5607a8 != null ? abstractC5607a8.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final ProductRatings getProductRating() {
        return this.productRating;
    }

    /* renamed from: j, reason: from getter */
    public final AbstractC5607a getProductRatingDescription() {
        return this.productRatingDescription;
    }

    /* renamed from: k, reason: from getter */
    public final double getQtyIncrement() {
        return this.qtyIncrement;
    }

    /* renamed from: l, reason: from getter */
    public final AbstractC5607a getRegularPrice() {
        return this.regularPrice;
    }

    /* renamed from: m, reason: from getter */
    public final AbstractC5607a getRegularPriceDescription() {
        return this.regularPriceDescription;
    }

    /* renamed from: n, reason: from getter */
    public final ProductSponsorship getSponsorship() {
        return this.sponsorship;
    }

    /* renamed from: o, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* renamed from: p, reason: from getter */
    public final AbstractC5607a getWeightUnitSizeAndPrice() {
        return this.weightUnitSizeAndPrice;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsBopas() {
        return this.isBopas;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsBuyAgain() {
        return this.isBuyAgain;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsEligibleForCart() {
        return this.isEligibleForCart;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsInStoreOnly() {
        return this.isInStoreOnly;
    }

    public String toString() {
        return "ProductCardDecorator(product=" + this.product + ", isOnSale=" + this.isOnSale + ", currentPrice=" + this.currentPrice + ", currentPriceDescription=" + this.currentPriceDescription + ", regularPrice=" + this.regularPrice + ", regularPriceDescription=" + this.regularPriceDescription + ", amountSaved=" + this.amountSaved + ", weightUnitSizeAndPrice=" + this.weightUnitSizeAndPrice + ", thumbnailUrl=" + this.thumbnailUrl + ", cartEligibility=" + this.cartEligibility + ", entryNumber=" + this.entryNumber + ", actualQuantity=" + this.actualQuantity + ", qtyIncrement=" + this.qtyIncrement + ", unitOfMeasure=" + this.unitOfMeasure + ", maxQuantityAllowed=" + this.maxQuantityAllowed + ", isLowStock=" + this.isLowStock + ", isOutOfStock=" + this.isOutOfStock + ", hasMPerksOffers=" + this.hasMPerksOffers + ", isEligibleForCart=" + this.isEligibleForCart + ", productQuery=" + this.productQuery + ", complexPromo=" + this.complexPromo + ", isStepperExpanded=" + this.isStepperExpanded + ", isBuyAgain=" + this.isBuyAgain + ", isBopas=" + this.isBopas + ", isInStoreOnly=" + this.isInStoreOnly + ", sponsorship=" + this.sponsorship + ", productRating=" + this.productRating + ", productRatingDescription=" + this.productRatingDescription + ')';
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsLowStock() {
        return this.isLowStock;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getIsOnSale() {
        return this.isOnSale;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getIsOutOfStock() {
        return this.isOutOfStock;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getIsStepperExpanded() {
        return this.isStepperExpanded;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ProductCardDecorator(Co.ProductFullDetails r36, boolean r37, ak.AbstractC5607a r38, ak.AbstractC5607a r39, ak.AbstractC5607a r40, ak.AbstractC5607a r41, ak.AbstractC5607a r42, ak.AbstractC5607a r43, java.lang.String r44, vl.ProductEligibility.a r45, int r46, double r47, double r49, java.lang.String r51, double r52, boolean r54, boolean r55, boolean r56, boolean r57, Qo.l r58, ak.AbstractC5607a r59, boolean r60, boolean r61, boolean r62, boolean r63, Ho.ProductSponsorship r64, Gp.ProductRatings r65, ak.AbstractC5607a r66, int r67, kotlin.jvm.internal.DefaultConstructorMarker r68) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ts.ProductCardDecorator.<init>(Co.h, boolean, ak.a, ak.a, ak.a, ak.a, ak.a, ak.a, java.lang.String, vl.b$a, int, double, double, java.lang.String, double, boolean, boolean, boolean, boolean, Qo.l, ak.a, boolean, boolean, boolean, boolean, Ho.a, Gp.c, ak.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
