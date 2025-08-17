package To;

import So.ProductDetailQuery;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y6.C18174b;
import y6.C18178f;
import y6.InterfaceC18173a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/j0;", "Ly6/a;", "LSo/f$g;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/f$g;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/f$g;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.j0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5259j0 implements InterfaceC18173a<ProductDetailQuery.Pricing> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5259j0 f35224a = new C5259j0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("ageLimit", "alcoholAgeLimit", "avgPricingUnitsPerSoldByUnit", "avgSoldByUnitsPerPricingUnit", "basePrice", "basePricePerSoldByUnit", "buyQuantity", "clearancePrice", "clearancePricePerSoldByUnit", "cmPriceEndDate", "currency", "customerPrice", "customerPricePerSoldByUnit", "depositValue", "discountValue", "discountValuePerSoldByUnit", "dollarOff", "isEligible", "isOnSale", "isPriceDisplayable", "percentageOff", "priceChangeMethod", "priceDescription", "priceEndDate", "priceType", "pricingUnit", "priceText", "productId", "promotionPrice", "restrictedCategoryDescription", "restrictedCategoryName", "savingsDescription", "sellQuantity", "soldByUnit", "storeId", "unitOfMeasureQuantity", "upc", "upcStoreCompositeKey", "updatedAt");

    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductDetailQuery.Pricing b(C6.f reader, y6.p customScalarAdapters) throws IOException {
        Integer num;
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Integer numB = null;
        Integer numB2 = null;
        Integer numB3 = null;
        Object objB = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        Integer numB4 = null;
        Object objB5 = null;
        Object objB6 = null;
        Object objB7 = null;
        String strB = null;
        Object objB8 = null;
        Object objB9 = null;
        Object objB10 = null;
        Object objB11 = null;
        Object objB12 = null;
        Object objB13 = null;
        Boolean boolB = null;
        Boolean boolB2 = null;
        Boolean boolB3 = null;
        Object objB14 = null;
        String strB2 = null;
        String strB3 = null;
        Object objB15 = null;
        String strB4 = null;
        String strB5 = null;
        String strB6 = null;
        String strB7 = null;
        Object objB16 = null;
        String strB8 = null;
        String strB9 = null;
        String strB10 = null;
        Integer numB5 = null;
        String strB11 = null;
        Object objB17 = null;
        String strB12 = null;
        String strB13 = null;
        Object objB18 = null;
        while (true) {
            switch (reader.r3(RESPONSE_NAMES)) {
                case 0:
                    num = numB;
                    numB2 = C18174b.f170232k.b(reader, customScalarAdapters);
                    break;
                case 1:
                    num = numB;
                    numB3 = C18174b.f170232k.b(reader, customScalarAdapters);
                    break;
                case 2:
                    num = numB;
                    objB = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 3:
                    num = numB;
                    objB2 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 4:
                    num = numB;
                    objB3 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 5:
                    num = numB;
                    objB4 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 6:
                    num = numB;
                    numB4 = C18174b.f170232k.b(reader, customScalarAdapters);
                    break;
                case 7:
                    num = numB;
                    objB5 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 8:
                    num = numB;
                    objB6 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 9:
                    num = numB;
                    objB7 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 10:
                    num = numB;
                    strB = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 11:
                    num = numB;
                    objB8 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 12:
                    num = numB;
                    objB9 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 13:
                    num = numB;
                    objB10 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 14:
                    num = numB;
                    objB11 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 15:
                    num = numB;
                    objB12 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 16:
                    num = numB;
                    objB13 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 17:
                    num = numB;
                    boolB = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 18:
                    num = numB;
                    boolB2 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 19:
                    num = numB;
                    boolB3 = C18174b.f170227f.b(reader, customScalarAdapters);
                    break;
                case 20:
                    num = numB;
                    objB14 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 21:
                    num = numB;
                    strB2 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    num = numB;
                    strB3 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 23:
                    num = numB;
                    objB15 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 24:
                    num = numB;
                    strB4 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 25:
                    num = numB;
                    strB5 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 26:
                    num = numB;
                    strB6 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 27:
                    num = numB;
                    strB7 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 28:
                    num = numB;
                    objB16 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 29:
                    num = numB;
                    strB8 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 30:
                    num = numB;
                    strB9 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 31:
                    num = numB;
                    strB10 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case l3.f92486e /* 32 */:
                    num = numB;
                    numB5 = C18174b.f170232k.b(reader, customScalarAdapters);
                    break;
                case 33:
                    num = numB;
                    strB11 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 34:
                    numB = C18174b.f170223b.b(reader, customScalarAdapters);
                    continue;
                case 35:
                    num = numB;
                    objB17 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 36:
                    num = numB;
                    strB12 = C18174b.f170222a.b(reader, customScalarAdapters);
                    break;
                case 37:
                    num = numB;
                    strB13 = C18174b.f170222a.b(reader, customScalarAdapters);
                    break;
                case 38:
                    num = numB;
                    objB18 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                default:
                    Integer num2 = numB;
                    if (boolB3 == null) {
                        C18178f.a(reader, "isPriceDisplayable");
                        throw new KotlinNothingValueException();
                    }
                    boolean zBooleanValue = boolB3.booleanValue();
                    if (num2 == null) {
                        C18178f.a(reader, "storeId");
                        throw new KotlinNothingValueException();
                    }
                    int iIntValue = num2.intValue();
                    if (strB12 == null) {
                        C18178f.a(reader, "upc");
                        throw new KotlinNothingValueException();
                    }
                    if (strB13 != null) {
                        return new ProductDetailQuery.Pricing(numB2, numB3, objB, objB2, objB3, objB4, numB4, objB5, objB6, objB7, strB, objB8, objB9, objB10, objB11, objB12, objB13, boolB, boolB2, zBooleanValue, objB14, strB2, strB3, objB15, strB4, strB5, strB6, strB7, objB16, strB8, strB9, strB10, numB5, strB11, iIntValue, objB17, strB12, strB13, objB18);
                    }
                    C18178f.a(reader, "upcStoreCompositeKey");
                    throw new KotlinNothingValueException();
            }
            numB = num;
        }
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, ProductDetailQuery.Pricing value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.x1("ageLimit");
        y6.y<Integer> yVar = C18174b.f170232k;
        yVar.a(writer, customScalarAdapters, value.getAgeLimit());
        writer.x1("alcoholAgeLimit");
        yVar.a(writer, customScalarAdapters, value.getAlcoholAgeLimit());
        writer.x1("avgPricingUnitsPerSoldByUnit");
        y6.y<Object> yVar2 = C18174b.f170234m;
        yVar2.a(writer, customScalarAdapters, value.getAvgPricingUnitsPerSoldByUnit());
        writer.x1("avgSoldByUnitsPerPricingUnit");
        yVar2.a(writer, customScalarAdapters, value.getAvgSoldByUnitsPerPricingUnit());
        writer.x1("basePrice");
        yVar2.a(writer, customScalarAdapters, value.getBasePrice());
        writer.x1("basePricePerSoldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getBasePricePerSoldByUnit());
        writer.x1("buyQuantity");
        yVar.a(writer, customScalarAdapters, value.getBuyQuantity());
        writer.x1("clearancePrice");
        yVar2.a(writer, customScalarAdapters, value.getClearancePrice());
        writer.x1("clearancePricePerSoldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getClearancePricePerSoldByUnit());
        writer.x1("cmPriceEndDate");
        yVar2.a(writer, customScalarAdapters, value.getCmPriceEndDate());
        writer.x1("currency");
        y6.y<String> yVar3 = C18174b.f170230i;
        yVar3.a(writer, customScalarAdapters, value.getCurrency());
        writer.x1("customerPrice");
        yVar2.a(writer, customScalarAdapters, value.getCustomerPrice());
        writer.x1("customerPricePerSoldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getCustomerPricePerSoldByUnit());
        writer.x1("depositValue");
        yVar2.a(writer, customScalarAdapters, value.getDepositValue());
        writer.x1("discountValue");
        yVar2.a(writer, customScalarAdapters, value.getDiscountValue());
        writer.x1("discountValuePerSoldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getDiscountValuePerSoldByUnit());
        writer.x1("dollarOff");
        yVar2.a(writer, customScalarAdapters, value.getDollarOff());
        writer.x1("isEligible");
        y6.y<Boolean> yVar4 = C18174b.f170233l;
        yVar4.a(writer, customScalarAdapters, value.getIsEligible());
        writer.x1("isOnSale");
        yVar4.a(writer, customScalarAdapters, value.getIsOnSale());
        writer.x1("isPriceDisplayable");
        C18174b.f170227f.a(writer, customScalarAdapters, Boolean.valueOf(value.getIsPriceDisplayable()));
        writer.x1("percentageOff");
        yVar2.a(writer, customScalarAdapters, value.getPercentageOff());
        writer.x1("priceChangeMethod");
        yVar3.a(writer, customScalarAdapters, value.getPriceChangeMethod());
        writer.x1("priceDescription");
        yVar3.a(writer, customScalarAdapters, value.getPriceDescription());
        writer.x1("priceEndDate");
        yVar2.a(writer, customScalarAdapters, value.getPriceEndDate());
        writer.x1("priceType");
        yVar3.a(writer, customScalarAdapters, value.getPriceType());
        writer.x1("pricingUnit");
        yVar3.a(writer, customScalarAdapters, value.getPricingUnit());
        writer.x1("priceText");
        yVar3.a(writer, customScalarAdapters, value.getPriceText());
        writer.x1("productId");
        yVar3.a(writer, customScalarAdapters, value.getProductId());
        writer.x1("promotionPrice");
        yVar2.a(writer, customScalarAdapters, value.getPromotionPrice());
        writer.x1("restrictedCategoryDescription");
        yVar3.a(writer, customScalarAdapters, value.getRestrictedCategoryDescription());
        writer.x1("restrictedCategoryName");
        yVar3.a(writer, customScalarAdapters, value.getRestrictedCategoryName());
        writer.x1("savingsDescription");
        yVar3.a(writer, customScalarAdapters, value.getSavingsDescription());
        writer.x1("sellQuantity");
        yVar.a(writer, customScalarAdapters, value.getSellQuantity());
        writer.x1("soldByUnit");
        yVar3.a(writer, customScalarAdapters, value.getSoldByUnit());
        writer.x1("storeId");
        C18174b.f170223b.a(writer, customScalarAdapters, Integer.valueOf(value.getStoreId()));
        writer.x1("unitOfMeasureQuantity");
        yVar2.a(writer, customScalarAdapters, value.getUnitOfMeasureQuantity());
        writer.x1("upc");
        InterfaceC18173a<String> interfaceC18173a = C18174b.f170222a;
        interfaceC18173a.a(writer, customScalarAdapters, value.getUpc());
        writer.x1("upcStoreCompositeKey");
        interfaceC18173a.a(writer, customScalarAdapters, value.getUpcStoreCompositeKey());
        writer.x1("updatedAt");
        yVar2.a(writer, customScalarAdapters, value.getUpdatedAt());
    }

    private C5259j0() {
    }
}
