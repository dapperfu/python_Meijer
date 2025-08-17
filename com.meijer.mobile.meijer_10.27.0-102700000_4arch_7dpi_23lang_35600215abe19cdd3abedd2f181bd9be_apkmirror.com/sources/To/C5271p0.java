package To;

import So.ProductDetailQuery;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y6.C18174b;
import y6.InterfaceC18173a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/p0;", "Ly6/a;", "LSo/f$m;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/f$m;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/f$m;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.p0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5271p0 implements InterfaceC18173a<ProductDetailQuery.ProductStore> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5271p0 f35248a = new C5271p0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("currency", "isOnSale", "basePrice", "basePricePerSoldByUnit", "priceDescription", "priceText", "customerPricePerSoldByUnit", "savingsDescription");

    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductDetailQuery.ProductStore b(C6.f reader, y6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        String strB = null;
        Boolean boolB = null;
        Object objB = null;
        Object objB2 = null;
        String strB2 = null;
        String strB3 = null;
        Object objB3 = null;
        String strB4 = null;
        while (true) {
            switch (reader.r3(RESPONSE_NAMES)) {
                case 0:
                    strB = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 1:
                    boolB = C18174b.f170233l.b(reader, customScalarAdapters);
                    break;
                case 2:
                    objB = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 3:
                    objB2 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 4:
                    strB2 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 5:
                    strB3 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 6:
                    objB3 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 7:
                    strB4 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                default:
                    return new ProductDetailQuery.ProductStore(strB, boolB, objB, objB2, strB2, strB3, objB3, strB4);
            }
        }
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, ProductDetailQuery.ProductStore value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.x1("currency");
        y6.y<String> yVar = C18174b.f170230i;
        yVar.a(writer, customScalarAdapters, value.getCurrency());
        writer.x1("isOnSale");
        C18174b.f170233l.a(writer, customScalarAdapters, value.getIsOnSale());
        writer.x1("basePrice");
        y6.y<Object> yVar2 = C18174b.f170234m;
        yVar2.a(writer, customScalarAdapters, value.getBasePrice());
        writer.x1("basePricePerSoldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getBasePricePerSoldByUnit());
        writer.x1("priceDescription");
        yVar.a(writer, customScalarAdapters, value.getPriceDescription());
        writer.x1("priceText");
        yVar.a(writer, customScalarAdapters, value.getPriceText());
        writer.x1("customerPricePerSoldByUnit");
        yVar2.a(writer, customScalarAdapters, value.getCustomerPricePerSoldByUnit());
        writer.x1("savingsDescription");
        yVar.a(writer, customScalarAdapters, value.getSavingsDescription());
    }

    private C5271p0() {
    }
}
