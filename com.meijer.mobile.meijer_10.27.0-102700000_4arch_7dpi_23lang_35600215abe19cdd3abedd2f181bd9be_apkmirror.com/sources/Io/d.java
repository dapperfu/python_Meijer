package Io;

import Co.ProductFullDetails;
import Co.StockInfo;
import Eo.NutritionLabel;
import Fo.Discount;
import com.meijer.mobile.product.model.hybris.api.models.HybrisCategory;
import com.meijer.mobile.product.model.hybris.api.models.HybrisImage;
import com.meijer.mobile.product.model.hybris.api.models.HybrisProduct;
import com.meijer.mobile.product.model.hybris.api.models.classification.HybrisClassification;
import com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutritionLabel;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisDiscount;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "a", "(Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;I)Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "LCo/h;", "b", "(Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;)LCo/h;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class d {
    public static final HybrisProduct a(HybrisProduct hybrisProduct, int i10) {
        Intrinsics.j(hybrisProduct, "<this>");
        return HybrisProduct.a(hybrisProduct, false, false, false, false, false, false, null, false, null, false, null, null, null, null, false, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, 0, false, null, false, false, null, null, false, 0.0d, false, null, null, null, null, null, null, false, null, false, null, null, null, false, i10, false, -1, 6291455, null);
    }

    public static final ProductFullDetails b(HybrisProduct hybrisProduct) {
        Intrinsics.j(hybrisProduct, "<this>");
        boolean ageRestricted = hybrisProduct.getAgeRestricted();
        boolean alcohol = hybrisProduct.getAlcohol();
        boolean alcoholRestricted = hybrisProduct.getAlcoholRestricted();
        boolean availableForPickup = hybrisProduct.getAvailableForPickup();
        boolean isBopas = hybrisProduct.getIsBopas();
        boolean buyable = hybrisProduct.getBuyable();
        List<HybrisCategory> listG = hybrisProduct.g();
        if (listG == null) {
            listG = CollectionsKt.m();
        }
        List<HybrisCategory> list = listG;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a.b((HybrisCategory) it.next()));
        }
        boolean chokingHazard = hybrisProduct.getChokingHazard();
        List<HybrisClassification> listI = hybrisProduct.i();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listI, 10));
        Iterator<T> it2 = listI.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Jo.c.a((HybrisClassification) it2.next()));
        }
        boolean clickAndCollect = hybrisProduct.getClickAndCollect();
        String code = hybrisProduct.getCode();
        String countryOfOrigin = hybrisProduct.getCountryOfOrigin();
        String description = hybrisProduct.getDescription();
        String descriptiveFeatures = hybrisProduct.getDescriptiveFeatures();
        boolean disabled = hybrisProduct.getDisabled();
        String disclaimer = hybrisProduct.getDisclaimer();
        HybrisDiscount discount = hybrisProduct.getDiscount();
        Discount discountA = discount != null ? Lo.a.a(discount) : null;
        HybrisPrice discountedPrice = hybrisProduct.getDiscountedPrice();
        mk.b bVarA = discountedPrice != null ? Lo.b.a(discountedPrice) : null;
        boolean displayable = hybrisProduct.getDisplayable();
        NutritionLabel nutritionLabelA = null;
        String ean = hybrisProduct.getEan();
        boolean hasMPerksOffers = hybrisProduct.getHasMPerksOffers();
        boolean homeDeliveryNotAvailable = hybrisProduct.getHomeDeliveryNotAvailable();
        List<HybrisImage> listX = hybrisProduct.x();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listX, 10));
        Iterator<T> it3 = listX.iterator();
        while (it3.hasNext()) {
            arrayList3.add(c.a((HybrisImage) it3.next()));
        }
        String ingredients = hybrisProduct.getIngredients();
        String itemUnitOfMeasure = hybrisProduct.getItemUnitOfMeasure();
        String manufacturer = hybrisProduct.getManufacturer();
        boolean isMap = hybrisProduct.getIsMap();
        boolean meijerBrand = hybrisProduct.getMeijerBrand();
        String name = hybrisProduct.getName();
        Integer numberOfReviews = hybrisProduct.getNumberOfReviews();
        int iIntValue = numberOfReviews != null ? numberOfReviews.intValue() : 0;
        int orderQuantityInterval = hybrisProduct.getOrderQuantityInterval();
        boolean prepareItem = hybrisProduct.getPrepareItem();
        mk.b bVarA2 = Lo.b.a(hybrisProduct.getPrice());
        boolean priceByWeight = hybrisProduct.getPriceByWeight();
        HybrisPrice depositPrice = hybrisProduct.getDepositPrice();
        mk.b bVarA3 = depositPrice != null ? Lo.b.a(depositPrice) : null;
        String packageSize = hybrisProduct.getPackageSize();
        boolean purchasable = hybrisProduct.getPurchasable();
        double qtyIncrement = hybrisProduct.getQtyIncrement();
        boolean sale = hybrisProduct.getSale();
        StockInfo stockInfoA = e.a(hybrisProduct.getStockInfo());
        String summary = hybrisProduct.getSummary();
        String priceUnit = hybrisProduct.getPriceUnit();
        String unit = hybrisProduct.getUnit();
        String unitCode = hybrisProduct.getUnitCode();
        String upcType = hybrisProduct.getUpcType();
        boolean isEbtProduct = hybrisProduct.getIsEbtProduct();
        String url = hybrisProduct.getUrl();
        boolean validDates = hybrisProduct.getValidDates();
        HybrisNutritionLabel nutritionLabel = hybrisProduct.getNutritionLabel();
        if (nutritionLabel != null) {
            nutritionLabelA = Ko.c.a(nutritionLabel);
        }
        NutritionLabel nutritionLabel2 = nutritionLabelA;
        Integer maxOrderQuantity = hybrisProduct.getMaxOrderQuantity();
        List<Long> listA = hybrisProduct.A();
        boolean isSponsoredCriteo = hybrisProduct.getIsSponsoredCriteo();
        List<HybrisCategory> listG2 = hybrisProduct.g();
        if (listG2 == null) {
            listG2 = CollectionsKt.m();
        }
        return new ProductFullDetails(code, name, 0, ageRestricted, alcohol, chokingHazard, description, ean, arrayList3, summary, alcoholRestricted, availableForPickup, buyable, disabled, displayable, homeDeliveryNotAvailable, purchasable, bVarA2, priceByWeight, discountA, bVarA, hasMPerksOffers, itemUnitOfMeasure, isMap, orderQuantityInterval, bVarA3, qtyIncrement, maxOrderQuantity, sale, priceUnit, url, unitCode, unit, arrayList, arrayList2, countryOfOrigin, null, descriptiveFeatures, a.a(listG2), disclaimer, ingredients, isBopas, clickAndCollect, isEbtProduct, meijerBrand, isSponsoredCriteo, hybrisProduct.getIsSubscriptionAvailable(), manufacturer, listA, iIntValue, nutritionLabel2, packageSize, prepareItem, null, null, stockInfoA, upcType, validDates, null, 0, 4, 207618064, null);
    }
}
