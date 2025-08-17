package To;

import So.ProductDepartmentQuery;
import java.io.IOException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y6.C18174b;
import y6.C18178f;
import y6.InterfaceC18173a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/V;", "Ly6/a;", "LSo/e$l;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/e$l;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/e$l;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class V implements InterfaceC18173a<ProductDepartmentQuery.OnProductExtended> {

    /* renamed from: a, reason: collision with root package name */
    public static final V f35177a = new V();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("averagePoundsPerEach", "brandName", "brandDescription", "hasMPerks", "isAlcohol", "isCurbsideEligible", "isHomeDeliveryAvailable", "isPrimaryUpc", "isSponsored", "mPerksOfferId", "productDescription", "productDetails", "productId", "productName", "upc", "upcTypeName", "descriptiveFeatures", "priceUnit", "isPriceByWeight", "soldByUnit", "unitOfMeasureQuantity", "maxOrderQuantity", "thumbnailImage", "attribution", "storeSpecificProductDetails");

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003b. Please report as an issue. */
    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductDepartmentQuery.OnProductExtended b(C6.f reader, y6.p customScalarAdapters) throws IOException {
        ProductDepartmentQuery.StoreSpecificProductDetails storeSpecificProductDetails;
        String str;
        Boolean bool;
        Object obj;
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Boolean boolB = null;
        Object objB = null;
        String strB = null;
        String strB2 = null;
        Boolean boolB2 = null;
        Boolean boolB3 = null;
        Boolean boolB4 = null;
        Boolean boolB5 = null;
        Boolean boolB6 = null;
        List list = null;
        String strB3 = null;
        String strB4 = null;
        String strB5 = null;
        String strB6 = null;
        String strB7 = null;
        String strB8 = null;
        String strB9 = null;
        String strB10 = null;
        Boolean boolB7 = null;
        String strB11 = null;
        Object objB2 = null;
        Integer numB = null;
        ProductDepartmentQuery.ThumbnailImage thumbnailImage = null;
        ProductDepartmentQuery.Attribution attribution = null;
        ProductDepartmentQuery.StoreSpecificProductDetails storeSpecificProductDetails2 = null;
        while (true) {
            switch (reader.r3(RESPONSE_NAMES)) {
                case 0:
                    objB = C18174b.f170234m.b(reader, customScalarAdapters);
                    strB = strB;
                case 1:
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    strB = C18174b.f170230i.b(reader, customScalarAdapters);
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 2:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    strB2 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 3:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    boolB2 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 4:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    boolB3 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 5:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    boolB4 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 6:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    boolB5 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 7:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    boolB6 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 8:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    boolB = C18174b.f170227f.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 9:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    list = (List) C18174b.b(C18174b.a(C18174b.f170222a)).b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 10:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    strB3 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 11:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    strB4 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 12:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    strB5 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 13:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    strB6 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 14:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    strB7 = C18174b.f170222a.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 15:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    strB8 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 16:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    strB9 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 17:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    strB10 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 18:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    boolB7 = C18174b.f170233l.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 19:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    strB11 = C18174b.f170230i.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 20:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    objB2 = C18174b.f170234m.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 21:
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    numB = C18174b.f170232k.b(reader, customScalarAdapters);
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    bool = boolB;
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    obj = objB;
                    thumbnailImage = (ProductDepartmentQuery.ThumbnailImage) C18174b.b(C18174b.d(C5245c0.f35197a, false, 1, null)).b(reader, customScalarAdapters);
                    boolB = bool;
                    objB = obj;
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 23:
                    bool = boolB;
                    str = strB;
                    storeSpecificProductDetails = storeSpecificProductDetails2;
                    obj = objB;
                    attribution = (ProductDepartmentQuery.Attribution) C18174b.b(C18174b.d(L.f35148a, false, 1, null)).b(reader, customScalarAdapters);
                    boolB = bool;
                    objB = obj;
                    strB = str;
                    storeSpecificProductDetails2 = storeSpecificProductDetails;
                case 24:
                    boolB = boolB;
                    objB = objB;
                    strB = strB;
                    storeSpecificProductDetails2 = (ProductDepartmentQuery.StoreSpecificProductDetails) C18174b.b(C18174b.d(C5243b0.f35193a, false, 1, null)).b(reader, customScalarAdapters);
            }
            Boolean bool2 = boolB;
            if (bool2 == null) {
                C18178f.a(reader, "isSponsored");
                throw new KotlinNothingValueException();
            }
            boolean zBooleanValue = bool2.booleanValue();
            if (strB7 != null) {
                return new ProductDepartmentQuery.OnProductExtended(objB, strB, strB2, boolB2, boolB3, boolB4, boolB5, boolB6, zBooleanValue, list, strB3, strB4, strB5, strB6, strB7, strB8, strB9, strB10, boolB7, strB11, objB2, numB, thumbnailImage, attribution, storeSpecificProductDetails2);
            }
            C18178f.a(reader, "upc");
            throw new KotlinNothingValueException();
        }
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, ProductDepartmentQuery.OnProductExtended value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.x1("averagePoundsPerEach");
        y6.y<Object> yVar = C18174b.f170234m;
        yVar.a(writer, customScalarAdapters, value.getAveragePoundsPerEach());
        writer.x1("brandName");
        y6.y<String> yVar2 = C18174b.f170230i;
        yVar2.a(writer, customScalarAdapters, value.getBrandName());
        writer.x1("brandDescription");
        yVar2.a(writer, customScalarAdapters, value.getBrandDescription());
        writer.x1("hasMPerks");
        y6.y<Boolean> yVar3 = C18174b.f170233l;
        yVar3.a(writer, customScalarAdapters, value.getHasMPerks());
        writer.x1("isAlcohol");
        yVar3.a(writer, customScalarAdapters, value.getIsAlcohol());
        writer.x1("isCurbsideEligible");
        yVar3.a(writer, customScalarAdapters, value.getIsCurbsideEligible());
        writer.x1("isHomeDeliveryAvailable");
        yVar3.a(writer, customScalarAdapters, value.getIsHomeDeliveryAvailable());
        writer.x1("isPrimaryUpc");
        yVar3.a(writer, customScalarAdapters, value.getIsPrimaryUpc());
        writer.x1("isSponsored");
        C18174b.f170227f.a(writer, customScalarAdapters, Boolean.valueOf(value.getIsSponsored()));
        writer.x1("mPerksOfferId");
        InterfaceC18173a<String> interfaceC18173a = C18174b.f170222a;
        C18174b.b(C18174b.a(interfaceC18173a)).a(writer, customScalarAdapters, value.g());
        writer.x1("productDescription");
        yVar2.a(writer, customScalarAdapters, value.getProductDescription());
        writer.x1("productDetails");
        yVar2.a(writer, customScalarAdapters, value.getProductDetails());
        writer.x1("productId");
        yVar2.a(writer, customScalarAdapters, value.getProductId());
        writer.x1("productName");
        yVar2.a(writer, customScalarAdapters, value.getProductName());
        writer.x1("upc");
        interfaceC18173a.a(writer, customScalarAdapters, value.getUpc());
        writer.x1("upcTypeName");
        yVar2.a(writer, customScalarAdapters, value.getUpcTypeName());
        writer.x1("descriptiveFeatures");
        yVar2.a(writer, customScalarAdapters, value.getDescriptiveFeatures());
        writer.x1("priceUnit");
        yVar2.a(writer, customScalarAdapters, value.getPriceUnit());
        writer.x1("isPriceByWeight");
        yVar3.a(writer, customScalarAdapters, value.getIsPriceByWeight());
        writer.x1("soldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getSoldByUnit());
        writer.x1("unitOfMeasureQuantity");
        yVar.a(writer, customScalarAdapters, value.getUnitOfMeasureQuantity());
        writer.x1("maxOrderQuantity");
        C18174b.f170232k.a(writer, customScalarAdapters, value.getMaxOrderQuantity());
        writer.x1("thumbnailImage");
        C18174b.b(C18174b.d(C5245c0.f35197a, false, 1, null)).a(writer, customScalarAdapters, value.getThumbnailImage());
        writer.x1("attribution");
        C18174b.b(C18174b.d(L.f35148a, false, 1, null)).a(writer, customScalarAdapters, value.getAttribution());
        writer.x1("storeSpecificProductDetails");
        C18174b.b(C18174b.d(C5243b0.f35193a, false, 1, null)).a(writer, customScalarAdapters, value.getStoreSpecificProductDetails());
    }

    private V() {
    }
}
