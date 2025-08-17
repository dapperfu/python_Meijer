package com.meijer.mobile.meijer.activity.substitution;

import Co.Image;
import Co.ProductFullDetails;
import Gp.ProductRatings;
import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vs.ProductListDecorator;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b&\b\u0081\b\u0018\u0000 D2\u00020\u0001:\u0001\u001bB\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ²\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b/\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b0\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b1\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\b2\u00105R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u00105R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b;\u0010?R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b9\u0010@\u001a\u0004\b+\u0010AR\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b6\u0010.R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b4\u0010B\u001a\u0004\b<\u0010C¨\u0006E"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/H;", "", "", PreferencesHelper.PREF_ID, "Lak/a;", "formattedPrice", "", "price", "description", "summary", "imageUrl", "", "isSelected", "unit", "LPp/c;", "substitutionMode", "inQtyStepperInteraction", "resetStepperState", "LCo/h;", "product", "Lvs/f$a;", "cartEntry", "maxQuantityAllowed", "LGp/c;", "productRatings", "<init>", "(Ljava/lang/String;Lak/a;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;LPp/c;ZZLCo/h;Lvs/f$a;DLGp/c;)V", "a", "(Ljava/lang/String;Lak/a;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;LPp/c;ZZLCo/h;Lvs/f$a;DLGp/c;)Lcom/meijer/mobile/meijer/activity/substitution/H;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lak/a;", "d", "()Lak/a;", "c", "D", "i", "()D", "getDescription", "n", "f", "g", "Z", "o", "()Z", "h", "getUnit", "LPp/c;", "m", "()LPp/c;", "j", "k", "l", "LCo/h;", "()LCo/h;", "Lvs/f$a;", "()Lvs/f$a;", "LGp/c;", "()LGp/c;", "p", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.substitution.H, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class SuggestedItemDecorator {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f112779q = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a formattedPrice;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String summary;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pp.c substitutionMode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean inQtyStepperInteraction;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean resetStepperState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductListDecorator.CartEntryDecorator cartEntry;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final double maxQuantityAllowed;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductRatings productRatings;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/H$a;", "", "<init>", "()V", "LCo/h;", "suggestedProduct", "LPp/c;", "substitutionMode", "", "inQtyStepperInteraction", "resetStepperState", "Lvs/f$a;", "cartEntry", "LGp/c;", "productRatings", "Lcom/meijer/mobile/meijer/activity/substitution/H;", "a", "(LCo/h;LPp/c;ZZLvs/f$a;LGp/c;)Lcom/meijer/mobile/meijer/activity/substitution/H;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.H$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ SuggestedItemDecorator b(Companion companion, ProductFullDetails productFullDetails, Pp.c cVar, boolean z10, boolean z11, ProductListDecorator.CartEntryDecorator cartEntryDecorator, ProductRatings productRatings, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            if ((i10 & 8) != 0) {
                z11 = false;
            }
            if ((i10 & 16) != 0) {
                cartEntryDecorator = null;
            }
            if ((i10 & 32) != 0) {
                productRatings = null;
            }
            return companion.a(productFullDetails, cVar, z10, z11, cartEntryDecorator, productRatings);
        }

        public final SuggestedItemDecorator a(ProductFullDetails suggestedProduct, Pp.c substitutionMode, boolean inQtyStepperInteraction, boolean resetStepperState, ProductListDecorator.CartEntryDecorator cartEntry, ProductRatings productRatings) {
            Intrinsics.j(suggestedProduct, "suggestedProduct");
            String code = suggestedProduct.getCode();
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Y.f99975b6, Double.valueOf(suggestedProduct.getPrice().getValue()));
            double value = suggestedProduct.getPrice().getValue();
            String description = suggestedProduct.getDescription();
            Image image = (Image) CollectionsKt.u0(suggestedProduct.j());
            String url = image != null ? image.getUrl() : null;
            return new SuggestedItemDecorator(code, abstractC5607aD, value, description, suggestedProduct.getSummary(), url, false, suggestedProduct.getUnit(), substitutionMode, inQtyStepperInteraction, resetStepperState, suggestedProduct, cartEntry == null ? new ProductListDecorator.CartEntryDecorator(0, 0.0d, 0.0d, 7, null) : cartEntry, suggestedProduct.getMaxOrderQuantity() != null ? r0.intValue() : 2.147483647E9d, productRatings);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedItemDecorator)) {
            return false;
        }
        SuggestedItemDecorator suggestedItemDecorator = (SuggestedItemDecorator) other;
        return Intrinsics.e(this.id, suggestedItemDecorator.id) && Intrinsics.e(this.formattedPrice, suggestedItemDecorator.formattedPrice) && Double.compare(this.price, suggestedItemDecorator.price) == 0 && Intrinsics.e(this.description, suggestedItemDecorator.description) && Intrinsics.e(this.summary, suggestedItemDecorator.summary) && Intrinsics.e(this.imageUrl, suggestedItemDecorator.imageUrl) && this.isSelected == suggestedItemDecorator.isSelected && Intrinsics.e(this.unit, suggestedItemDecorator.unit) && this.substitutionMode == suggestedItemDecorator.substitutionMode && this.inQtyStepperInteraction == suggestedItemDecorator.inQtyStepperInteraction && this.resetStepperState == suggestedItemDecorator.resetStepperState && Intrinsics.e(this.product, suggestedItemDecorator.product) && Intrinsics.e(this.cartEntry, suggestedItemDecorator.cartEntry) && Double.compare(this.maxQuantityAllowed, suggestedItemDecorator.maxQuantityAllowed) == 0 && Intrinsics.e(this.productRatings, suggestedItemDecorator.productRatings);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.formattedPrice.hashCode()) * 31) + Double.hashCode(this.price)) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.summary;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isSelected)) * 31;
        String str4 = this.unit;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Pp.c cVar = this.substitutionMode;
        int iHashCode6 = (((((((((((iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.inQtyStepperInteraction)) * 31) + Boolean.hashCode(this.resetStepperState)) * 31) + this.product.hashCode()) * 31) + this.cartEntry.hashCode()) * 31) + Double.hashCode(this.maxQuantityAllowed)) * 31;
        ProductRatings productRatings = this.productRatings;
        return iHashCode6 + (productRatings != null ? productRatings.hashCode() : 0);
    }

    public String toString() {
        return "SuggestedItemDecorator(id=" + this.id + ", formattedPrice=" + this.formattedPrice + ", price=" + this.price + ", description=" + this.description + ", summary=" + this.summary + ", imageUrl=" + this.imageUrl + ", isSelected=" + this.isSelected + ", unit=" + this.unit + ", substitutionMode=" + this.substitutionMode + ", inQtyStepperInteraction=" + this.inQtyStepperInteraction + ", resetStepperState=" + this.resetStepperState + ", product=" + this.product + ", cartEntry=" + this.cartEntry + ", maxQuantityAllowed=" + this.maxQuantityAllowed + ", productRatings=" + this.productRatings + ')';
    }

    public SuggestedItemDecorator(String id2, AbstractC5607a formattedPrice, double d10, String str, String str2, String str3, boolean z10, String str4, Pp.c cVar, boolean z11, boolean z12, ProductFullDetails product, ProductListDecorator.CartEntryDecorator cartEntry, double d11, ProductRatings productRatings) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(formattedPrice, "formattedPrice");
        Intrinsics.j(product, "product");
        Intrinsics.j(cartEntry, "cartEntry");
        this.id = id2;
        this.formattedPrice = formattedPrice;
        this.price = d10;
        this.description = str;
        this.summary = str2;
        this.imageUrl = str3;
        this.isSelected = z10;
        this.unit = str4;
        this.substitutionMode = cVar;
        this.inQtyStepperInteraction = z11;
        this.resetStepperState = z12;
        this.product = product;
        this.cartEntry = cartEntry;
        this.maxQuantityAllowed = d11;
        this.productRatings = productRatings;
    }

    public final SuggestedItemDecorator a(String id2, AbstractC5607a formattedPrice, double price, String description, String summary, String imageUrl, boolean isSelected, String unit, Pp.c substitutionMode, boolean inQtyStepperInteraction, boolean resetStepperState, ProductFullDetails product, ProductListDecorator.CartEntryDecorator cartEntry, double maxQuantityAllowed, ProductRatings productRatings) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(formattedPrice, "formattedPrice");
        Intrinsics.j(product, "product");
        Intrinsics.j(cartEntry, "cartEntry");
        return new SuggestedItemDecorator(id2, formattedPrice, price, description, summary, imageUrl, isSelected, unit, substitutionMode, inQtyStepperInteraction, resetStepperState, product, cartEntry, maxQuantityAllowed, productRatings);
    }

    /* renamed from: c, reason: from getter */
    public final ProductListDecorator.CartEntryDecorator getCartEntry() {
        return this.cartEntry;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getFormattedPrice() {
        return this.formattedPrice;
    }

    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: f, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getInQtyStepperInteraction() {
        return this.inQtyStepperInteraction;
    }

    /* renamed from: h, reason: from getter */
    public final double getMaxQuantityAllowed() {
        return this.maxQuantityAllowed;
    }

    /* renamed from: i, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: j, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    /* renamed from: k, reason: from getter */
    public final ProductRatings getProductRatings() {
        return this.productRatings;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getResetStepperState() {
        return this.resetStepperState;
    }

    /* renamed from: m, reason: from getter */
    public final Pp.c getSubstitutionMode() {
        return this.substitutionMode;
    }

    /* renamed from: n, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
