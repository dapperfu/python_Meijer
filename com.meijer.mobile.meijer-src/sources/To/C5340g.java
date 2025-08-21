package To;

import So.MultiUPCQuery;
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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/g;", "Lz6/a;", "LSo/c$h;", "<init>", "()V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)LSo/c$h;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;LSo/c$h;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5340g implements InterfaceC18452a<MultiUPCQuery.Product2> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5340g f36560a = new C5340g();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("averagePoundsPerEach", "brandDescription", "brandName", "countryOfOrigin", "descriptiveFeatures", "disclaimer", "eventType", "hasMPerks", "isAlcohol", "isBopas", "isBusinessActive", "isChokingHazard", "isCurbsideEligible", "isDisplayable", "isFoodStampEligible", "isHomeDeliveryAvailable", "isPriceByWeight", "isPriceDisplayable", "isPrimaryUpc", "isProductAgeRestricted", "maxOrderQuantity", "mPerksOfferId", "offlineDate", "priceUnit", "productDescription", "productDetails", "productId", "productName", "soldByUnit", "soldByUnitDescription", "taxonomyDescription", "taxonomyId", "taxonomyParentId", "unitOfMeasureQuantity", "upc", "upcChkDigit", "upcTypeName", "updatedAt");

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public MultiUPCQuery.Product2 b(D6.f reader, z6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Boolean boolB = null;
        Object objB = null;
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        String strB4 = null;
        String strB5 = null;
        String strB6 = null;
        Boolean boolB2 = null;
        Boolean boolB3 = null;
        Boolean boolB4 = null;
        Boolean boolB5 = null;
        Boolean boolB6 = null;
        Boolean boolB7 = null;
        Boolean boolB8 = null;
        Boolean boolB9 = null;
        Boolean boolB10 = null;
        Boolean boolB11 = null;
        Boolean boolB12 = null;
        Boolean boolB13 = null;
        Integer numB = null;
        List list = null;
        Object objB2 = null;
        String strB7 = null;
        String strB8 = null;
        String strB9 = null;
        String strB10 = null;
        String strB11 = null;
        String strB12 = null;
        String strB13 = null;
        String strB14 = null;
        String strB15 = null;
        String strB16 = null;
        Object objB3 = null;
        String strB17 = null;
        String strB18 = null;
        String strB19 = null;
        Object objB4 = null;
        while (true) {
            switch (reader.r3(RESPONSE_NAMES)) {
                case 0:
                    objB = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 1:
                    strB = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 2:
                    strB2 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 3:
                    strB3 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 4:
                    strB4 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 5:
                    strB5 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 6:
                    strB6 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 7:
                    boolB2 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 8:
                    boolB3 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 9:
                    boolB4 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 10:
                    boolB5 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 11:
                    boolB6 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 12:
                    boolB7 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 13:
                    boolB8 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 14:
                    boolB9 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 15:
                    boolB10 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 16:
                    boolB11 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 17:
                    boolB = C18453b.f172413f.b(reader, customScalarAdapters);
                    break;
                case 18:
                    boolB12 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 19:
                    boolB13 = C18453b.f172419l.b(reader, customScalarAdapters);
                    break;
                case 20:
                    numB = C18453b.f172418k.b(reader, customScalarAdapters);
                    break;
                case 21:
                    list = (List) C18453b.b(C18453b.a(C18453b.f172408a)).b(reader, customScalarAdapters);
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    objB2 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 23:
                    strB7 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 24:
                    strB8 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 25:
                    strB9 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 26:
                    strB10 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 27:
                    strB11 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 28:
                    strB12 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 29:
                    strB13 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 30:
                    strB14 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 31:
                    strB15 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case l3.f93325e /* 32 */:
                    strB16 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 33:
                    objB3 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 34:
                    strB17 = C18453b.f172408a.b(reader, customScalarAdapters);
                    break;
                case 35:
                    strB18 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 36:
                    strB19 = C18453b.f172416i.b(reader, customScalarAdapters);
                    break;
                case 37:
                    objB4 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                default:
                    if (boolB == null) {
                        C18457f.a(reader, "isPriceDisplayable");
                        throw new KotlinNothingValueException();
                    }
                    boolean zBooleanValue = boolB.booleanValue();
                    if (strB17 != null) {
                        return new MultiUPCQuery.Product2(objB, strB, strB2, strB3, strB4, strB5, strB6, boolB2, boolB3, boolB4, boolB5, boolB6, boolB7, boolB8, boolB9, boolB10, boolB11, zBooleanValue, boolB12, boolB13, numB, list, objB2, strB7, strB8, strB9, strB10, strB11, strB12, strB13, strB14, strB15, strB16, objB3, strB17, strB18, strB19, objB4);
                    }
                    C18457f.a(reader, "upc");
                    throw new KotlinNothingValueException();
            }
        }
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(D6.g writer, z6.p customScalarAdapters, MultiUPCQuery.Product2 value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.v1("averagePoundsPerEach");
        z6.y<Object> yVar = C18453b.f172420m;
        yVar.a(writer, customScalarAdapters, value.getAveragePoundsPerEach());
        writer.v1("brandDescription");
        z6.y<String> yVar2 = C18453b.f172416i;
        yVar2.a(writer, customScalarAdapters, value.getBrandDescription());
        writer.v1("brandName");
        yVar2.a(writer, customScalarAdapters, value.getBrandName());
        writer.v1("countryOfOrigin");
        yVar2.a(writer, customScalarAdapters, value.getCountryOfOrigin());
        writer.v1("descriptiveFeatures");
        yVar2.a(writer, customScalarAdapters, value.getDescriptiveFeatures());
        writer.v1("disclaimer");
        yVar2.a(writer, customScalarAdapters, value.getDisclaimer());
        writer.v1("eventType");
        yVar2.a(writer, customScalarAdapters, value.getEventType());
        writer.v1("hasMPerks");
        z6.y<Boolean> yVar3 = C18453b.f172419l;
        yVar3.a(writer, customScalarAdapters, value.getHasMPerks());
        writer.v1("isAlcohol");
        yVar3.a(writer, customScalarAdapters, value.getIsAlcohol());
        writer.v1("isBopas");
        yVar3.a(writer, customScalarAdapters, value.getIsBopas());
        writer.v1("isBusinessActive");
        yVar3.a(writer, customScalarAdapters, value.getIsBusinessActive());
        writer.v1("isChokingHazard");
        yVar3.a(writer, customScalarAdapters, value.getIsChokingHazard());
        writer.v1("isCurbsideEligible");
        yVar3.a(writer, customScalarAdapters, value.getIsCurbsideEligible());
        writer.v1("isDisplayable");
        yVar3.a(writer, customScalarAdapters, value.getIsDisplayable());
        writer.v1("isFoodStampEligible");
        yVar3.a(writer, customScalarAdapters, value.getIsFoodStampEligible());
        writer.v1("isHomeDeliveryAvailable");
        yVar3.a(writer, customScalarAdapters, value.getIsHomeDeliveryAvailable());
        writer.v1("isPriceByWeight");
        yVar3.a(writer, customScalarAdapters, value.getIsPriceByWeight());
        writer.v1("isPriceDisplayable");
        C18453b.f172413f.a(writer, customScalarAdapters, Boolean.valueOf(value.getIsPriceDisplayable()));
        writer.v1("isPrimaryUpc");
        yVar3.a(writer, customScalarAdapters, value.getIsPrimaryUpc());
        writer.v1("isProductAgeRestricted");
        yVar3.a(writer, customScalarAdapters, value.getIsProductAgeRestricted());
        writer.v1("maxOrderQuantity");
        C18453b.f172418k.a(writer, customScalarAdapters, value.getMaxOrderQuantity());
        writer.v1("mPerksOfferId");
        InterfaceC18452a<String> interfaceC18452a = C18453b.f172408a;
        C18453b.b(C18453b.a(interfaceC18452a)).a(writer, customScalarAdapters, value.i());
        writer.v1("offlineDate");
        yVar.a(writer, customScalarAdapters, value.getOfflineDate());
        writer.v1("priceUnit");
        yVar2.a(writer, customScalarAdapters, value.getPriceUnit());
        writer.v1("productDescription");
        yVar2.a(writer, customScalarAdapters, value.getProductDescription());
        writer.v1("productDetails");
        yVar2.a(writer, customScalarAdapters, value.getProductDetails());
        writer.v1("productId");
        yVar2.a(writer, customScalarAdapters, value.getProductId());
        writer.v1("productName");
        yVar2.a(writer, customScalarAdapters, value.getProductName());
        writer.v1("soldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getSoldByUnit());
        writer.v1("soldByUnitDescription");
        yVar2.a(writer, customScalarAdapters, value.getSoldByUnitDescription());
        writer.v1("taxonomyDescription");
        yVar2.a(writer, customScalarAdapters, value.getTaxonomyDescription());
        writer.v1("taxonomyId");
        yVar2.a(writer, customScalarAdapters, value.getTaxonomyId());
        writer.v1("taxonomyParentId");
        yVar2.a(writer, customScalarAdapters, value.getTaxonomyParentId());
        writer.v1("unitOfMeasureQuantity");
        yVar.a(writer, customScalarAdapters, value.getUnitOfMeasureQuantity());
        writer.v1("upc");
        interfaceC18452a.a(writer, customScalarAdapters, value.getUpc());
        writer.v1("upcChkDigit");
        yVar2.a(writer, customScalarAdapters, value.getUpcChkDigit());
        writer.v1("upcTypeName");
        yVar2.a(writer, customScalarAdapters, value.getUpcTypeName());
        writer.v1("updatedAt");
        yVar.a(writer, customScalarAdapters, value.getUpdatedAt());
    }

    private C5340g() {
    }
}
