package To;

import So.ProductCollectionQuery;
import java.io.IOException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y6.C18174b;
import y6.C18178f;
import y6.InterfaceC18173a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/F;", "Ly6/a;", "LSo/d$p;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/d$p;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/d$p;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class F implements InterfaceC18173a<ProductCollectionQuery.SortOption> {

    /* renamed from: a, reason: collision with root package name */
    public static final F f35125a = new F();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("displayName", "sortBy", "sortOrder", "status");

    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductCollectionQuery.SortOption b(C6.f reader, y6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        String strB4 = null;
        while (true) {
            int iR3 = reader.r3(RESPONSE_NAMES);
            if (iR3 == 0) {
                strB = C18174b.f170222a.b(reader, customScalarAdapters);
            } else if (iR3 == 1) {
                strB2 = C18174b.f170222a.b(reader, customScalarAdapters);
            } else if (iR3 == 2) {
                strB3 = C18174b.f170222a.b(reader, customScalarAdapters);
            } else {
                if (iR3 != 3) {
                    break;
                }
                strB4 = C18174b.f170230i.b(reader, customScalarAdapters);
            }
        }
        if (strB == null) {
            C18178f.a(reader, "displayName");
            throw new KotlinNothingValueException();
        }
        if (strB2 == null) {
            C18178f.a(reader, "sortBy");
            throw new KotlinNothingValueException();
        }
        if (strB3 != null) {
            return new ProductCollectionQuery.SortOption(strB, strB2, strB3, strB4);
        }
        C18178f.a(reader, "sortOrder");
        throw new KotlinNothingValueException();
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, ProductCollectionQuery.SortOption value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.x1("displayName");
        InterfaceC18173a<String> interfaceC18173a = C18174b.f170222a;
        interfaceC18173a.a(writer, customScalarAdapters, value.getDisplayName());
        writer.x1("sortBy");
        interfaceC18173a.a(writer, customScalarAdapters, value.getSortBy());
        writer.x1("sortOrder");
        interfaceC18173a.a(writer, customScalarAdapters, value.getSortOrder());
        writer.x1("status");
        C18174b.f170230i.a(writer, customScalarAdapters, value.getStatus());
    }

    private F() {
    }
}
