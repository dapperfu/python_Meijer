package To;

import So.MultiUPCQuery;
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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/g;", "Ly6/a;", "LSo/c$h;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/c$h;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/c$h;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5252g implements InterfaceC18173a<MultiUPCQuery.Product2> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5252g f35210a = new C5252g();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("averagePoundsPerEach", "brandDescription", "brandName", "countryOfOrigin", "descriptiveFeatures", "disclaimer", "eventType", "hasMPerks", "isAlcohol", "isBopas", "isBusinessActive", "isChokingHazard", "isCurbsideEligible", "isDisplayable", "isFoodStampEligible", "isHomeDeliveryAvailable", "isPriceByWeight", "isPriceDisplayable", "isPrimaryUpc", "isProductAgeRestricted", "maxOrderQuantity", "mPerksOfferId", "offlineDate", "priceUnit", "productDescription", "productDetails", "productId", "productName", "soldByUnit", "soldByUnitDescription", "taxonomyDescription", "taxonomyId", "taxonomyParentId", "unitOfMeasureQuantity", "upc", "upcChkDigit", "upcTypeName", "updatedAt");

    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public MultiUPCQuery.Product2 b(C6.f reader, y6.p customScalarAdapters) throws IOException {
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
                    objB = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 1:
                    strB = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 2:
                    strB2 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 3:
                    strB3 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 4:
                    strB4 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 5:
                    strB5 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 6:
                    strB6 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 7:
                    boolB2 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 8:
                    boolB3 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 9:
                    boolB4 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 10:
                    boolB5 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 11:
                    boolB6 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 12:
                    boolB7 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 13:
                    boolB8 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 14:
                    boolB9 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 15:
                    boolB10 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 16:
                    boolB11 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 17:
                    boolB = C18174b.f170227f.b(reader, customScalarAdapters);
                    break;
                case 18:
                    boolB12 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 19:
                    boolB13 = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 20:
                    numB = C18174b.f170232k.b(reader, customScalarAdapters);
                    break;
                case 21:
                    list = (List) C18174b.b(C18174b.a(C18174b.f170222a)).b(reader, customScalarAdapters);
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    objB2 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 23:
                    strB7 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 24:
                    strB8 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 25:
                    strB9 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 26:
                    strB10 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 27:
                    strB11 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 28:
                    strB12 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 29:
                    strB13 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 30:
                    strB14 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 31:
                    strB15 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case l3.f92486e /* 32 */:
                    strB16 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 33:
                    objB3 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 34:
                    strB17 = C18174b.f170222a.b(reader, customScalarAdapters);
                    break;
                case 35:
                    strB18 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 36:
                    strB19 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 37:
                    objB4 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                default:
                    if (boolB == null) {
                        C18178f.a(reader, "isPriceDisplayable");
                        throw new KotlinNothingValueException();
                    }
                    boolean zBooleanValue = boolB.booleanValue();
                    if (strB17 != null) {
                        return new MultiUPCQuery.Product2(objB, strB, strB2, strB3, strB4, strB5, strB6, boolB2, boolB3, boolB4, boolB5, boolB6, boolB7, boolB8, boolB9, boolB10, boolB11, zBooleanValue, boolB12, boolB13, numB, list, objB2, strB7, strB8, strB9, strB10, strB11, strB12, strB13, strB14, strB15, strB16, objB3, strB17, strB18, strB19, objB4);
                    }
                    C18178f.a(reader, "upc");
                    throw new KotlinNothingValueException();
            }
        }
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, MultiUPCQuery.Product2 value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.x1("averagePoundsPerEach");
        y6.y<Object> yVar = C18174b.f170234m;
        yVar.a(writer, customScalarAdapters, value.getAveragePoundsPerEach());
        writer.x1("brandDescription");
        y6.y<String> yVar2 = C18174b.f170230i;
        yVar2.a(writer, customScalarAdapters, value.getBrandDescription());
        writer.x1("brandName");
        yVar2.a(writer, customScalarAdapters, value.getBrandName());
        writer.x1("countryOfOrigin");
        yVar2.a(writer, customScalarAdapters, value.getCountryOfOrigin());
        writer.x1("descriptiveFeatures");
        yVar2.a(writer, customScalarAdapters, value.getDescriptiveFeatures());
        writer.x1("disclaimer");
        yVar2.a(writer, customScalarAdapters, value.getDisclaimer());
        writer.x1("eventType");
        yVar2.a(writer, customScalarAdapters, value.getEventType());
        writer.x1("hasMPerks");
        y6.y<Boolean> yVar3 = C18174b.f170233l;
        yVar3.a(writer, customScalarAdapters, value.getHasMPerks());
        writer.x1("isAlcohol");
        yVar3.a(writer, customScalarAdapters, value.getIsAlcohol());
        writer.x1("isBopas");
        yVar3.a(writer, customScalarAdapters, value.getIsBopas());
        writer.x1("isBusinessActive");
        yVar3.a(writer, customScalarAdapters, value.getIsBusinessActive());
        writer.x1("isChokingHazard");
        yVar3.a(writer, customScalarAdapters, value.getIsChokingHazard());
        writer.x1("isCurbsideEligible");
        yVar3.a(writer, customScalarAdapters, value.getIsCurbsideEligible());
        writer.x1("isDisplayable");
        yVar3.a(writer, customScalarAdapters, value.getIsDisplayable());
        writer.x1("isFoodStampEligible");
        yVar3.a(writer, customScalarAdapters, value.getIsFoodStampEligible());
        writer.x1("isHomeDeliveryAvailable");
        yVar3.a(writer, customScalarAdapters, value.getIsHomeDeliveryAvailable());
        writer.x1("isPriceByWeight");
        yVar3.a(writer, customScalarAdapters, value.getIsPriceByWeight());
        writer.x1("isPriceDisplayable");
        C18174b.f170227f.a(writer, customScalarAdapters, Boolean.valueOf(value.getIsPriceDisplayable()));
        writer.x1("isPrimaryUpc");
        yVar3.a(writer, customScalarAdapters, value.getIsPrimaryUpc());
        writer.x1("isProductAgeRestricted");
        yVar3.a(writer, customScalarAdapters, value.getIsProductAgeRestricted());
        writer.x1("maxOrderQuantity");
        C18174b.f170232k.a(writer, customScalarAdapters, value.getMaxOrderQuantity());
        writer.x1("mPerksOfferId");
        InterfaceC18173a<String> interfaceC18173a = C18174b.f170222a;
        C18174b.b(C18174b.a(interfaceC18173a)).a(writer, customScalarAdapters, value.i());
        writer.x1("offlineDate");
        yVar.a(writer, customScalarAdapters, value.getOfflineDate());
        writer.x1("priceUnit");
        yVar2.a(writer, customScalarAdapters, value.getPriceUnit());
        writer.x1("productDescription");
        yVar2.a(writer, customScalarAdapters, value.getProductDescription());
        writer.x1("productDetails");
        yVar2.a(writer, customScalarAdapters, value.getProductDetails());
        writer.x1("productId");
        yVar2.a(writer, customScalarAdapters, value.getProductId());
        writer.x1("productName");
        yVar2.a(writer, customScalarAdapters, value.getProductName());
        writer.x1("soldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getSoldByUnit());
        writer.x1("soldByUnitDescription");
        yVar2.a(writer, customScalarAdapters, value.getSoldByUnitDescription());
        writer.x1("taxonomyDescription");
        yVar2.a(writer, customScalarAdapters, value.getTaxonomyDescription());
        writer.x1("taxonomyId");
        yVar2.a(writer, customScalarAdapters, value.getTaxonomyId());
        writer.x1("taxonomyParentId");
        yVar2.a(writer, customScalarAdapters, value.getTaxonomyParentId());
        writer.x1("unitOfMeasureQuantity");
        yVar.a(writer, customScalarAdapters, value.getUnitOfMeasureQuantity());
        writer.x1("upc");
        interfaceC18173a.a(writer, customScalarAdapters, value.getUpc());
        writer.x1("upcChkDigit");
        yVar2.a(writer, customScalarAdapters, value.getUpcChkDigit());
        writer.x1("upcTypeName");
        yVar2.a(writer, customScalarAdapters, value.getUpcTypeName());
        writer.x1("updatedAt");
        yVar.a(writer, customScalarAdapters, value.getUpdatedAt());
    }

    private C5252g() {
    }
}
