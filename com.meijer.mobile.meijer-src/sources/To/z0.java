package To;

import So.ProductSearchQuery;
import java.io.IOException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import z6.C18453b;
import z6.C18457f;
import z6.InterfaceC18452a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/z0;", "Lz6/a;", "LSo/g$e;", "<init>", "()V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)LSo/g$e;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;LSo/g$e;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class z0 implements InterfaceC18452a<ProductSearchQuery.ComplexPromo> {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f36636a = new z0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("promotionId", "displayText", "isDefault", "startDate", "endDate", "upc", "promotionUpcs", "rewardUpcs");

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductSearchQuery.ComplexPromo b(D6.f reader, z6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Boolean boolB = null;
        String strB = null;
        String strB2 = null;
        Object objB = null;
        Object objB2 = null;
        String strB3 = null;
        List listB = null;
        List listB2 = null;
        while (true) {
            switch (reader.r3(RESPONSE_NAMES)) {
                case 0:
                    strB = C18453b.f172408a.b(reader, customScalarAdapters);
                    break;
                case 1:
                    strB2 = C18453b.f172408a.b(reader, customScalarAdapters);
                    break;
                case 2:
                    boolB = C18453b.f172413f.b(reader, customScalarAdapters);
                    break;
                case 3:
                    objB = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 4:
                    objB2 = C18453b.f172420m.b(reader, customScalarAdapters);
                    break;
                case 5:
                    strB3 = C18453b.f172408a.b(reader, customScalarAdapters);
                    break;
                case 6:
                    listB = C18453b.a(C18453b.f172408a).b(reader, customScalarAdapters);
                    break;
                case 7:
                    listB2 = C18453b.a(C18453b.f172408a).b(reader, customScalarAdapters);
                    break;
                default:
                    if (strB == null) {
                        C18457f.a(reader, "promotionId");
                        throw new KotlinNothingValueException();
                    }
                    if (strB2 == null) {
                        C18457f.a(reader, "displayText");
                        throw new KotlinNothingValueException();
                    }
                    if (boolB == null) {
                        C18457f.a(reader, "isDefault");
                        throw new KotlinNothingValueException();
                    }
                    boolean zBooleanValue = boolB.booleanValue();
                    if (strB3 == null) {
                        C18457f.a(reader, "upc");
                        throw new KotlinNothingValueException();
                    }
                    if (listB == null) {
                        C18457f.a(reader, "promotionUpcs");
                        throw new KotlinNothingValueException();
                    }
                    if (listB2 != null) {
                        return new ProductSearchQuery.ComplexPromo(strB, strB2, zBooleanValue, objB, objB2, strB3, listB, listB2);
                    }
                    C18457f.a(reader, "rewardUpcs");
                    throw new KotlinNothingValueException();
            }
        }
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(D6.g writer, z6.p customScalarAdapters, ProductSearchQuery.ComplexPromo value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.v1("promotionId");
        InterfaceC18452a<String> interfaceC18452a = C18453b.f172408a;
        interfaceC18452a.a(writer, customScalarAdapters, value.getPromotionId());
        writer.v1("displayText");
        interfaceC18452a.a(writer, customScalarAdapters, value.getDisplayText());
        writer.v1("isDefault");
        C18453b.f172413f.a(writer, customScalarAdapters, Boolean.valueOf(value.getIsDefault()));
        writer.v1("startDate");
        z6.y<Object> yVar = C18453b.f172420m;
        yVar.a(writer, customScalarAdapters, value.getStartDate());
        writer.v1("endDate");
        yVar.a(writer, customScalarAdapters, value.getEndDate());
        writer.v1("upc");
        interfaceC18452a.a(writer, customScalarAdapters, value.getUpc());
        writer.v1("promotionUpcs");
        C18453b.a(interfaceC18452a).a(writer, customScalarAdapters, value.d());
        writer.v1("rewardUpcs");
        C18453b.a(interfaceC18452a).a(writer, customScalarAdapters, value.e());
    }

    private z0() {
    }
}
