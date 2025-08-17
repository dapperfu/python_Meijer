package To;

import So.ProductDetailQuery;
import java.io.IOException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y6.C18174b;
import y6.C18178f;
import y6.InterfaceC18173a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/f0;", "Ly6/a;", "LSo/f$c;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/f$c;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/f$c;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.f0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5251f0 implements InterfaceC18173a<ProductDetailQuery.ComplexPromo> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5251f0 f35208a = new C5251f0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("promotionId", "displayText", "isDefault", "startDate", "endDate", "upc", "promotionUpcs", "rewardUpcs");

    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductDetailQuery.ComplexPromo b(C6.f reader, y6.p customScalarAdapters) throws IOException {
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
                    strB = C18174b.f170222a.b(reader, customScalarAdapters);
                    break;
                case 1:
                    strB2 = C18174b.f170222a.b(reader, customScalarAdapters);
                    break;
                case 2:
                    boolB = C18174b.f170227f.b(reader, customScalarAdapters);
                    break;
                case 3:
                    objB = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 4:
                    objB2 = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                case 5:
                    strB3 = C18174b.f170222a.b(reader, customScalarAdapters);
                    break;
                case 6:
                    listB = C18174b.a(C18174b.f170222a).b(reader, customScalarAdapters);
                    break;
                case 7:
                    listB2 = C18174b.a(C18174b.f170222a).b(reader, customScalarAdapters);
                    break;
                default:
                    if (strB == null) {
                        C18178f.a(reader, "promotionId");
                        throw new KotlinNothingValueException();
                    }
                    if (strB2 == null) {
                        C18178f.a(reader, "displayText");
                        throw new KotlinNothingValueException();
                    }
                    if (boolB == null) {
                        C18178f.a(reader, "isDefault");
                        throw new KotlinNothingValueException();
                    }
                    boolean zBooleanValue = boolB.booleanValue();
                    if (strB3 == null) {
                        C18178f.a(reader, "upc");
                        throw new KotlinNothingValueException();
                    }
                    if (listB == null) {
                        C18178f.a(reader, "promotionUpcs");
                        throw new KotlinNothingValueException();
                    }
                    if (listB2 != null) {
                        return new ProductDetailQuery.ComplexPromo(strB, strB2, zBooleanValue, objB, objB2, strB3, listB, listB2);
                    }
                    C18178f.a(reader, "rewardUpcs");
                    throw new KotlinNothingValueException();
            }
        }
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, ProductDetailQuery.ComplexPromo value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.x1("promotionId");
        InterfaceC18173a<String> interfaceC18173a = C18174b.f170222a;
        interfaceC18173a.a(writer, customScalarAdapters, value.getPromotionId());
        writer.x1("displayText");
        interfaceC18173a.a(writer, customScalarAdapters, value.getDisplayText());
        writer.x1("isDefault");
        C18174b.f170227f.a(writer, customScalarAdapters, Boolean.valueOf(value.getIsDefault()));
        writer.x1("startDate");
        y6.y<Object> yVar = C18174b.f170234m;
        yVar.a(writer, customScalarAdapters, value.getStartDate());
        writer.x1("endDate");
        yVar.a(writer, customScalarAdapters, value.getEndDate());
        writer.x1("upc");
        interfaceC18173a.a(writer, customScalarAdapters, value.getUpc());
        writer.x1("promotionUpcs");
        C18174b.a(interfaceC18173a).a(writer, customScalarAdapters, value.d());
        writer.x1("rewardUpcs");
        C18174b.a(interfaceC18173a).a(writer, customScalarAdapters, value.e());
    }

    private C5251f0() {
    }
}
