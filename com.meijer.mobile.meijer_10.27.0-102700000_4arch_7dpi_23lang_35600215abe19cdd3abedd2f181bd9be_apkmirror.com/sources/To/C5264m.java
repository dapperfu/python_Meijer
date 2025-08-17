package To;

import So.MultiUPCQuery;
import java.io.IOException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y6.C18174b;
import y6.C18178f;
import y6.InterfaceC18173a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/m;", "Ly6/a;", "LSo/c$n;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/c$n;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/c$n;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5264m implements InterfaceC18173a<MultiUPCQuery.Stock> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5264m f35234a = new C5264m();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("ilcPrimary", "ilcs", "stockStatus", "storeId", "upc", "upcStoreCompositeKey", "updatedAt");

    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public MultiUPCQuery.Stock b(C6.f reader, y6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Integer numB = null;
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        String strB4 = null;
        String strB5 = null;
        Object objB = null;
        while (true) {
            switch (reader.r3(RESPONSE_NAMES)) {
                case 0:
                    strB = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 1:
                    strB2 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 2:
                    strB3 = C18174b.f170230i.b(reader, customScalarAdapters);
                    break;
                case 3:
                    numB = C18174b.f170223b.b(reader, customScalarAdapters);
                    break;
                case 4:
                    strB4 = C18174b.f170222a.b(reader, customScalarAdapters);
                    break;
                case 5:
                    strB5 = C18174b.f170222a.b(reader, customScalarAdapters);
                    break;
                case 6:
                    objB = C18174b.f170234m.b(reader, customScalarAdapters);
                    break;
                default:
                    if (numB == null) {
                        C18178f.a(reader, "storeId");
                        throw new KotlinNothingValueException();
                    }
                    int iIntValue = numB.intValue();
                    if (strB4 == null) {
                        C18178f.a(reader, "upc");
                        throw new KotlinNothingValueException();
                    }
                    if (strB5 != null) {
                        return new MultiUPCQuery.Stock(strB, strB2, strB3, iIntValue, strB4, strB5, objB);
                    }
                    C18178f.a(reader, "upcStoreCompositeKey");
                    throw new KotlinNothingValueException();
            }
        }
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, MultiUPCQuery.Stock value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.x1("ilcPrimary");
        y6.y<String> yVar = C18174b.f170230i;
        yVar.a(writer, customScalarAdapters, value.getIlcPrimary());
        writer.x1("ilcs");
        yVar.a(writer, customScalarAdapters, value.getIlcs());
        writer.x1("stockStatus");
        yVar.a(writer, customScalarAdapters, value.getStockStatus());
        writer.x1("storeId");
        C18174b.f170223b.a(writer, customScalarAdapters, Integer.valueOf(value.getStoreId()));
        writer.x1("upc");
        InterfaceC18173a<String> interfaceC18173a = C18174b.f170222a;
        interfaceC18173a.a(writer, customScalarAdapters, value.getUpc());
        writer.x1("upcStoreCompositeKey");
        interfaceC18173a.a(writer, customScalarAdapters, value.getUpcStoreCompositeKey());
        writer.x1("updatedAt");
        C18174b.f170234m.a(writer, customScalarAdapters, value.getUpdatedAt());
    }

    private C5264m() {
    }
}
