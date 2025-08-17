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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/k;", "Ly6/a;", "LSo/c$l;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/c$l;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/c$l;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5260k implements InterfaceC18173a<MultiUPCQuery.ProductsMultiUpc> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5260k f35226a = new C5260k();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("averagePoundsPerEach", "brandDescription", "brandName", "countryOfOrigin", "descriptiveFeatures", "disclaimer", "eventType", "hasMPerks", "isAlcohol", "isBopas", "isBusinessActive", "isChokingHazard", "isCurbsideEligible", "isDisplayable", "isFoodStampEligible", "isHomeDeliveryAvailable", "isPriceByWeight", "isPrimaryUpc", "isProductAgeRestricted", "maxOrderQuantity", "mPerksOfferId", "offlineDate", "priceUnit", "productDescription", "productDetails", "productId", "productName", "soldByUnit", "soldByUnitDescription", "storeSpecificProductDetails", "taxonomyDescription", "taxonomyId", "taxonomyParentId", "unitOfMeasureQuantity", "upc", "upcChkDigit", "upcTypeName", "updatedAt", "offers", "productMedia");

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0059. Please report as an issue. */
    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public MultiUPCQuery.ProductsMultiUpc b(C6.f reader, y6.p customScalarAdapters) throws IOException {
        List list;
        String str;
        Object obj;
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Object objB = null;
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        String strB4 = null;
        String strB5 = null;
        String strB6 = null;
        Boolean boolB = null;
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
        Integer numB = null;
        List list2 = null;
        Object objB2 = null;
        String strB7 = null;
        String strB8 = null;
        String strB9 = null;
        String strB10 = null;
        String strB11 = null;
        String strB12 = null;
        String strB13 = null;
        MultiUPCQuery.StoreSpecificProductDetails storeSpecificProductDetails = null;
        String strB14 = null;
        String strB15 = null;
        String strB16 = null;
        Object objB3 = null;
        String strB17 = null;
        String strB18 = null;
        String strB19 = null;
        Object objB4 = null;
        List listB = null;
        List list3 = null;
        while (true) {
            switch (reader.r3(RESPONSE_NAMES)) {
                case 0:
                    objB = C18174b.f170234m.b(reader, customScalarAdapters);
                    strB = strB;
                case 1:
                    list = list3;
                    strB = C18174b.f170230i.b(reader, customScalarAdapters);
                    list3 = list;
                case 2:
                    str = strB;
                    list = list3;
                    strB2 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 3:
                    str = strB;
                    list = list3;
                    strB3 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 4:
                    str = strB;
                    list = list3;
                    strB4 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 5:
                    str = strB;
                    list = list3;
                    strB5 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 6:
                    str = strB;
                    list = list3;
                    strB6 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 7:
                    str = strB;
                    list = list3;
                    boolB = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 8:
                    str = strB;
                    list = list3;
                    boolB2 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 9:
                    str = strB;
                    list = list3;
                    boolB3 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 10:
                    str = strB;
                    list = list3;
                    boolB4 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 11:
                    str = strB;
                    list = list3;
                    boolB5 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 12:
                    str = strB;
                    list = list3;
                    boolB6 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 13:
                    str = strB;
                    list = list3;
                    boolB7 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 14:
                    str = strB;
                    list = list3;
                    boolB8 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 15:
                    str = strB;
                    list = list3;
                    boolB9 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 16:
                    str = strB;
                    list = list3;
                    boolB10 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 17:
                    str = strB;
                    list = list3;
                    boolB11 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 18:
                    str = strB;
                    list = list3;
                    boolB12 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 19:
                    str = strB;
                    list = list3;
                    numB = C18174b.f170232k.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 20:
                    str = strB;
                    list = list3;
                    list2 = (List) C18174b.b(C18174b.a(C18174b.f170222a)).b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 21:
                    str = strB;
                    list = list3;
                    objB2 = C18174b.f170234m.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    str = strB;
                    list = list3;
                    strB7 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 23:
                    str = strB;
                    list = list3;
                    strB8 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 24:
                    str = strB;
                    list = list3;
                    strB9 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 25:
                    str = strB;
                    list = list3;
                    strB10 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 26:
                    str = strB;
                    list = list3;
                    strB11 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 27:
                    str = strB;
                    list = list3;
                    strB12 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 28:
                    str = strB;
                    list = list3;
                    strB13 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    list3 = list;
                case 29:
                    str = strB;
                    list = list3;
                    obj = objB;
                    storeSpecificProductDetails = (MultiUPCQuery.StoreSpecificProductDetails) C18174b.b(C18174b.d(C5268o.f35242a, false, 1, null)).b(reader, customScalarAdapters);
                    objB = obj;
                    strB = str;
                    list3 = list;
                case 30:
                    list = list3;
                    strB14 = C18174b.f170230i.b(reader, customScalarAdapters);
                    list3 = list;
                case 31:
                    list = list3;
                    strB15 = C18174b.f170230i.b(reader, customScalarAdapters);
                    list3 = list;
                case l3.f92486e /* 32 */:
                    list = list3;
                    strB16 = C18174b.f170230i.b(reader, customScalarAdapters);
                    list3 = list;
                case 33:
                    list = list3;
                    objB3 = C18174b.f170234m.b(reader, customScalarAdapters);
                    list3 = list;
                case 34:
                    list = list3;
                    strB17 = C18174b.f170222a.b(reader, customScalarAdapters);
                    list3 = list;
                case 35:
                    list = list3;
                    strB18 = C18174b.f170230i.b(reader, customScalarAdapters);
                    list3 = list;
                case 36:
                    list = list3;
                    strB19 = C18174b.f170230i.b(reader, customScalarAdapters);
                    list3 = list;
                case 37:
                    list = list3;
                    objB4 = C18174b.f170234m.b(reader, customScalarAdapters);
                    list3 = list;
                case 38:
                    str = strB;
                    list = list3;
                    obj = objB;
                    listB = C18174b.a(C18174b.d(C5246d.f35199a, false, 1, null)).b(reader, customScalarAdapters);
                    objB = obj;
                    strB = str;
                    list3 = list;
                case 39:
                    objB = objB;
                    strB = strB;
                    list3 = (List) C18174b.b(C18174b.a(C18174b.b(C18174b.d(C5256i.f35218a, false, 1, null)))).b(reader, customScalarAdapters);
            }
            if (strB17 == null) {
                C18178f.a(reader, "upc");
                throw new KotlinNothingValueException();
            }
            if (listB != null) {
                return new MultiUPCQuery.ProductsMultiUpc(objB, strB, strB2, strB3, strB4, strB5, strB6, boolB, boolB2, boolB3, boolB4, boolB5, boolB6, boolB7, boolB8, boolB9, boolB10, boolB11, boolB12, numB, list2, objB2, strB7, strB8, strB9, strB10, strB11, strB12, strB13, storeSpecificProductDetails, strB14, strB15, strB16, objB3, strB17, strB18, strB19, objB4, listB, list3);
            }
            C18178f.a(reader, "offers");
            throw new KotlinNothingValueException();
        }
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, MultiUPCQuery.ProductsMultiUpc value) throws IOException {
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
        writer.x1("storeSpecificProductDetails");
        C18174b.b(C18174b.d(C5268o.f35242a, false, 1, null)).a(writer, customScalarAdapters, value.getStoreSpecificProductDetails());
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
        writer.x1("offers");
        C18174b.a(C18174b.d(C5246d.f35199a, false, 1, null)).a(writer, customScalarAdapters, value.k());
        writer.x1("productMedia");
        C18174b.b(C18174b.a(C18174b.b(C18174b.d(C5256i.f35218a, false, 1, null)))).a(writer, customScalarAdapters, value.q());
    }

    private C5260k() {
    }
}
