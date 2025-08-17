package To;

import So.ProductDetailQuery;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y6.C18174b;
import y6.InterfaceC18173a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/l0;", "Ly6/a;", "LSo/f$i;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/f$i;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/f$i;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.l0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5263l0 implements InterfaceC18173a<ProductDetailQuery.Product2> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5263l0 f35232a = new C5263l0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("averagePoundsPerEach", "priceUnit", "storeSpecificProductDetails");

    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductDetailQuery.Product2 b(C6.f reader, y6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Object objB = null;
        String strB = null;
        ProductDetailQuery.StoreSpecificProductDetails1 storeSpecificProductDetails1 = null;
        while (true) {
            int iR3 = reader.r3(RESPONSE_NAMES);
            if (iR3 == 0) {
                objB = C18174b.f170234m.b(reader, customScalarAdapters);
            } else if (iR3 == 1) {
                strB = C18174b.f170230i.b(reader, customScalarAdapters);
            } else {
                if (iR3 != 2) {
                    return new ProductDetailQuery.Product2(objB, strB, storeSpecificProductDetails1);
                }
                storeSpecificProductDetails1 = (ProductDetailQuery.StoreSpecificProductDetails1) C18174b.b(C18174b.d(s0.f35259a, false, 1, null)).b(reader, customScalarAdapters);
            }
        }
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, ProductDetailQuery.Product2 value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.x1("averagePoundsPerEach");
        C18174b.f170234m.a(writer, customScalarAdapters, value.getAveragePoundsPerEach());
        writer.x1("priceUnit");
        C18174b.f170230i.a(writer, customScalarAdapters, value.getPriceUnit());
        writer.x1("storeSpecificProductDetails");
        C18174b.b(C18174b.d(s0.f35259a, false, 1, null)).a(writer, customScalarAdapters, value.getStoreSpecificProductDetails());
    }

    private C5263l0() {
    }
}
