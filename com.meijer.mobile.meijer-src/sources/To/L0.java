package To;

import So.ProductSearchQuery;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import z6.C18453b;
import z6.InterfaceC18452a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/L0;", "Lz6/a;", "LSo/g$q;", "<init>", "()V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)LSo/g$q;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;LSo/g$q;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class L0 implements InterfaceC18452a<ProductSearchQuery.Search> {

    /* renamed from: a, reason: collision with root package name */
    public static final L0 f36500a = new L0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.e("__typename");

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductSearchQuery.Search b(D6.f reader, z6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        ProductSearchQuery.OnSearchProductDisplayResult onSearchProductDisplayResultB = null;
        String strB = null;
        while (reader.r3(RESPONSE_NAMES) == 0) {
            strB = C18453b.f172408a.b(reader, customScalarAdapters);
        }
        if (strB == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (z6.n.b(z6.n.f("SearchProductDisplayResult"), customScalarAdapters.falseVariables, strB, customScalarAdapters.deferredFragmentIdentifiers, null)) {
            reader.v();
            onSearchProductDisplayResultB = G0.f36481a.b(reader, customScalarAdapters);
        }
        return new ProductSearchQuery.Search(strB, onSearchProductDisplayResultB);
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(D6.g writer, z6.p customScalarAdapters, ProductSearchQuery.Search value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.v1("__typename");
        C18453b.f172408a.a(writer, customScalarAdapters, value.get__typename());
        if (value.getOnSearchProductDisplayResult() != null) {
            G0.f36481a.a(writer, customScalarAdapters, value.getOnSearchProductDisplayResult());
        }
    }

    private L0() {
    }
}
