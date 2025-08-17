package To;

import So.ProductDetailQuery;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y6.C18174b;
import y6.InterfaceC18173a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/k0;", "Ly6/a;", "LSo/f$h;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/f$h;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/f$h;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.k0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5261k0 implements InterfaceC18173a<ProductDetailQuery.Product1> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5261k0 f35228a = new C5261k0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("imageUrl", "productId", "product");

    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductDetailQuery.Product1 b(C6.f reader, y6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        String strB = null;
        String strB2 = null;
        ProductDetailQuery.Product2 product2 = null;
        while (true) {
            int iR3 = reader.r3(RESPONSE_NAMES);
            if (iR3 == 0) {
                strB = C18174b.f170230i.b(reader, customScalarAdapters);
            } else if (iR3 == 1) {
                strB2 = C18174b.f170230i.b(reader, customScalarAdapters);
            } else {
                if (iR3 != 2) {
                    return new ProductDetailQuery.Product1(strB, strB2, product2);
                }
                product2 = (ProductDetailQuery.Product2) C18174b.b(C18174b.d(C5263l0.f35232a, false, 1, null)).b(reader, customScalarAdapters);
            }
        }
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, ProductDetailQuery.Product1 value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.x1("imageUrl");
        y6.y<String> yVar = C18174b.f170230i;
        yVar.a(writer, customScalarAdapters, value.getImageUrl());
        writer.x1("productId");
        yVar.a(writer, customScalarAdapters, value.getProductId());
        writer.x1("product");
        C18174b.b(C18174b.d(C5263l0.f35232a, false, 1, null)).a(writer, customScalarAdapters, value.getProduct());
    }

    private C5261k0() {
    }
}
