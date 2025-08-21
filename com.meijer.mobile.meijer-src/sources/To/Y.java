package To;

import So.ProductDepartmentQuery;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import z6.C18453b;
import z6.C18457f;
import z6.InterfaceC18452a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/Y;", "Lz6/a;", "LSo/e$o;", "<init>", "()V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)LSo/e$o;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;LSo/e$o;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Y implements InterfaceC18452a<ProductDepartmentQuery.Pricing> {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f36533a = new Y();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("ageLimit", "alcoholAgeLimit", "avgPricingUnitsPerSoldByUnit", "avgSoldByUnitsPerPricingUnit", "basePrice", "basePricePerSoldByUnit", "buyQuantity", "clearancePrice", "clearancePricePerSoldByUnit", "cmPriceEndDate", "currency", "customerPrice", "customerPricePerSoldByUnit", "depositValue", "discountValue", "discountValuePerSoldByUnit", "dollarOff", "isEligible", "isOnSale", "isPriceDisplayable", "percentageOff", "priceChangeMethod", "priceDescription", "priceEndDate", "priceText", "priceType", "pricingUnit", "productId", "promotionPrice", "restrictedCategoryDescription", "restrictedCategoryName", "savingsDescription", "sellQuantity", "soldByUnit", "storeId", "unitOfMeasureQuantity", "upc", "upcStoreCompositeKey", "updatedAt");

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductDepartmentQuery.Pricing b(D6.f reader, z6.p customScalarAdapters) throws IOException {
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
                    numB2 = C18453b.f172418k.b(reader, customScalarAdapters);
                    break;
                case 1:
                    num = numB;
                    numB3 = C18453b.f172418k.b(reader, customScalarAdapters);
                    break;
                case 2:
                    num = numB;
                    objB = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 3:
                    num = numB;
                    objB2 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 4:
                    num = numB;
                    objB3 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 5:
                    num = numB;
                    objB4 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 6:
                    num = numB;
                    numB4 = C18453b.f172418k.b(reader, customScalarAdapters);
                    break;
                case 7:
                    num = numB;
                    objB5 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 8:
                    num = numB;
                    objB6 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 9:
                    num = numB;
                    objB7 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 10:
                    num = numB;
                    strB = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 11:
                    num = numB;
                    objB8 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 12:
                    num = numB;
                    objB9 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 13:
                    num = numB;
                    objB10 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 14:
                    num = numB;
                    objB11 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 15:
                    num = numB;
                    objB12 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 16:
                    num = numB;
                    objB13 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 17:
                    num = numB;
                    boolB = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 18:
                    num = numB;
                    boolB2 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 19:
                    num = numB;
                    boolB3 = C18453b.f172413f.b(reader, customScalarAdapters);
                    break;
                case 20:
                    num = numB;
                    objB14 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 21:
                    num = numB;
                    strB2 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    num = numB;
                    strB3 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 23:
                    num = numB;
                    objB15 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 24:
                    num = numB;
                    strB4 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 25:
                    num = numB;
                    strB5 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 26:
                    num = numB;
                    strB6 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 27:
                    num = numB;
                    strB7 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 28:
                    num = numB;
                    objB16 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 29:
                    num = numB;
                    strB8 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 30:
                    num = numB;
                    strB9 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 31:
                    num = numB;
                    strB10 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case l3.f93325e /* 32 */:
                    num = numB;
                    numB5 = C18453b.f172418k.b(reader, customScalarAdapters);
                    break;
                case 33:
                    num = numB;
                    strB11 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 34:
                    numB = C18453b.f172409b.b(reader, customScalarAdapters);
                    continue;
                case 35:
                    num = numB;
                    objB17 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 36:
                    num = numB;
                    strB12 = C18453b.f172408a.b(reader, customScalarAdapters);
                    break;
                case 37:
                    num = numB;
                    strB13 = C18453b.f172408a.b(reader, customScalarAdapters);
                    break;
                case 38:
                    num = numB;
                    objB18 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                default:
                    Integer num2 = numB;
                    if (boolB3 == null) {
                        C18457f.a(reader, "isPriceDisplayable");
                        throw new KotlinNothingValueException();
                    }
                    boolean zBooleanValue = boolB3.booleanValue();
                    if (num2 == null) {
                        C18457f.a(reader, "storeId");
                        throw new KotlinNothingValueException();
                    }
                    int iIntValue = num2.intValue();
                    if (strB12 == null) {
                        C18457f.a(reader, "upc");
                        throw new KotlinNothingValueException();
                    }
                    if (strB13 != null) {
                        return new ProductDepartmentQuery.Pricing(numB2, numB3, objB, objB2, objB3, objB4, numB4, objB5, objB6, objB7, strB, objB8, objB9, objB10, objB11, objB12, objB13, boolB, boolB2, zBooleanValue, objB14, strB2, strB3, objB15, strB4, strB5, strB6, strB7, objB16, strB8, strB9, strB10, numB5, strB11, iIntValue, objB17, strB12, strB13, objB18);
                    }
                    C18457f.a(reader, "upcStoreCompositeKey");
                    throw new KotlinNothingValueException();
            }
            numB = num;
        }
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(D6.g writer, z6.p customScalarAdapters, ProductDepartmentQuery.Pricing value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.v1("ageLimit");
        z6.y<Integer> yVar = C18453b.f172418k;
        yVar.a(writer, customScalarAdapters, value.getAgeLimit());
        writer.v1("alcoholAgeLimit");
        yVar.a(writer, customScalarAdapters, value.getAlcoholAgeLimit());
        writer.v1("avgPricingUnitsPerSoldByUnit");
        z6.y<Object> yVar2 = C18453b.f172420m;
        yVar2.a(writer, customScalarAdapters, value.getAvgPricingUnitsPerSoldByUnit());
        writer.v1("avgSoldByUnitsPerPricingUnit");
        yVar2.a(writer, customScalarAdapters, value.getAvgSoldByUnitsPerPricingUnit());
        writer.v1("basePrice");
        yVar2.a(writer, customScalarAdapters, value.getBasePrice());
        writer.v1("basePricePerSoldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getBasePricePerSoldByUnit());
        writer.v1("buyQuantity");
        yVar.a(writer, customScalarAdapters, value.getBuyQuantity());
        writer.v1("clearancePrice");
        yVar2.a(writer, customScalarAdapters, value.getClearancePrice());
        writer.v1("clearancePricePerSoldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getClearancePricePerSoldByUnit());
        writer.v1("cmPriceEndDate");
        yVar2.a(writer, customScalarAdapters, value.getCmPriceEndDate());
        writer.v1("currency");
        z6.y<String> yVar3 = C18453b.f172416i;
        yVar3.a(writer, customScalarAdapters, value.getCurrency());
        writer.v1("customerPrice");
        yVar2.a(writer, customScalarAdapters, value.getCustomerPrice());
        writer.v1("customerPricePerSoldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getCustomerPricePerSoldByUnit());
        writer.v1("depositValue");
        yVar2.a(writer, customScalarAdapters, value.getDepositValue());
        writer.v1("discountValue");
        yVar2.a(writer, customScalarAdapters, value.getDiscountValue());
        writer.v1("discountValuePerSoldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getDiscountValuePerSoldByUnit());
        writer.v1("dollarOff");
        yVar2.a(writer, customScalarAdapters, value.getDollarOff());
        writer.v1("isEligible");
        z6.y<Boolean> yVar4 = C18453b.f172419l;
        yVar4.a(writer, customScalarAdapters, value.getIsEligible());
        writer.v1("isOnSale");
        yVar4.a(writer, customScalarAdapters, value.getIsOnSale());
        writer.v1("isPriceDisplayable");
        C18453b.f172413f.a(writer, customScalarAdapters, Boolean.valueOf(value.getIsPriceDisplayable()));
        writer.v1("percentageOff");
        yVar2.a(writer, customScalarAdapters, value.getPercentageOff());
        writer.v1("priceChangeMethod");
        yVar3.a(writer, customScalarAdapters, value.getPriceChangeMethod());
        writer.v1("priceDescription");
        yVar3.a(writer, customScalarAdapters, value.getPriceDescription());
        writer.v1("priceEndDate");
        yVar2.a(writer, customScalarAdapters, value.getPriceEndDate());
        writer.v1("priceText");
        yVar3.a(writer, customScalarAdapters, value.getPriceText());
        writer.v1("priceType");
        yVar3.a(writer, customScalarAdapters, value.getPriceType());
        writer.v1("pricingUnit");
        yVar3.a(writer, customScalarAdapters, value.getPricingUnit());
        writer.v1("productId");
        yVar3.a(writer, customScalarAdapters, value.getProductId());
        writer.v1("promotionPrice");
        yVar2.a(writer, customScalarAdapters, value.getPromotionPrice());
        writer.v1("restrictedCategoryDescription");
        yVar3.a(writer, customScalarAdapters, value.getRestrictedCategoryDescription());
        writer.v1("restrictedCategoryName");
        yVar3.a(writer, customScalarAdapters, value.getRestrictedCategoryName());
        writer.v1("savingsDescription");
        yVar3.a(writer, customScalarAdapters, value.getSavingsDescription());
        writer.v1("sellQuantity");
        yVar.a(writer, customScalarAdapters, value.getSellQuantity());
        writer.v1("soldByUnit");
        yVar3.a(writer, customScalarAdapters, value.getSoldByUnit());
        writer.v1("storeId");
        C18453b.f172409b.a(writer, customScalarAdapters, Integer.valueOf(value.getStoreId()));
        writer.v1("unitOfMeasureQuantity");
        yVar2.a(writer, customScalarAdapters, value.getUnitOfMeasureQuantity());
        writer.v1("upc");
        InterfaceC18452a<String> interfaceC18452a = C18453b.f172408a;
        interfaceC18452a.a(writer, customScalarAdapters, value.getUpc());
        writer.v1("upcStoreCompositeKey");
        interfaceC18452a.a(writer, customScalarAdapters, value.getUpcStoreCompositeKey());
        writer.v1("updatedAt");
        yVar2.a(writer, customScalarAdapters, value.getUpdatedAt());
    }

    private Y() {
    }
}
