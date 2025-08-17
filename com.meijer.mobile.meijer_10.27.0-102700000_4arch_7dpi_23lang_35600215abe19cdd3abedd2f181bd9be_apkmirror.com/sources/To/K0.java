package To;

import So.ProductSearchQuery;
import java.io.IOException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y6.C18174b;
import y6.C18178f;
import y6.InterfaceC18173a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/K0;", "Ly6/a;", "LSo/g$p;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/g$p;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/g$p;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class K0 implements InterfaceC18173a<ProductSearchQuery.ResultCounts> {

    /* renamed from: a, reason: collision with root package name */
    public static final K0 f35146a = new K0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("tokenMatch", "embeddingsMatch", "totalCount");

    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductSearchQuery.ResultCounts b(C6.f reader, y6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Integer numB = null;
        Integer numB2 = null;
        Integer numB3 = null;
        while (true) {
            int iR3 = reader.r3(RESPONSE_NAMES);
            if (iR3 == 0) {
                numB = C18174b.f170223b.b(reader, customScalarAdapters);
            } else if (iR3 == 1) {
                numB2 = C18174b.f170223b.b(reader, customScalarAdapters);
            } else {
                if (iR3 != 2) {
                    break;
                }
                numB3 = C18174b.f170223b.b(reader, customScalarAdapters);
            }
        }
        if (numB == null) {
            C18178f.a(reader, "tokenMatch");
            throw new KotlinNothingValueException();
        }
        int iIntValue = numB.intValue();
        if (numB2 == null) {
            C18178f.a(reader, "embeddingsMatch");
            throw new KotlinNothingValueException();
        }
        int iIntValue2 = numB2.intValue();
        if (numB3 != null) {
            return new ProductSearchQuery.ResultCounts(iIntValue, iIntValue2, numB3.intValue());
        }
        C18178f.a(reader, "totalCount");
        throw new KotlinNothingValueException();
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, ProductSearchQuery.ResultCounts value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.x1("tokenMatch");
        InterfaceC18173a<Integer> interfaceC18173a = C18174b.f170223b;
        interfaceC18173a.a(writer, customScalarAdapters, Integer.valueOf(value.getTokenMatch()));
        writer.x1("embeddingsMatch");
        interfaceC18173a.a(writer, customScalarAdapters, Integer.valueOf(value.getEmbeddingsMatch()));
        writer.x1("totalCount");
        interfaceC18173a.a(writer, customScalarAdapters, Integer.valueOf(value.getTotalCount()));
    }

    private K0() {
    }
}
