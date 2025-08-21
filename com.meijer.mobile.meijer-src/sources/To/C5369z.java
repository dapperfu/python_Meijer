package To;

import So.ProductCollectionQuery;
import java.io.IOException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import z6.C18453b;
import z6.C18457f;
import z6.InterfaceC18452a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/z;", "Lz6/a;", "LSo/d$j;", "<init>", "()V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)LSo/d$j;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;LSo/d$j;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5369z implements InterfaceC18452a<ProductCollectionQuery.ItemConnection> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5369z f36634a = new C5369z();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("items", "totalCount", "pageInfo");

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductCollectionQuery.ItemConnection b(D6.f reader, z6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        List listB = null;
        Integer numB = null;
        ProductCollectionQuery.PageInfo pageInfo = null;
        while (true) {
            int iR3 = reader.r3(RESPONSE_NAMES);
            if (iR3 == 0) {
                listB = C18453b.a(C18453b.c(C5368y.f36630a, true)).b(reader, customScalarAdapters);
            } else if (iR3 == 1) {
                numB = C18453b.f172409b.b(reader, customScalarAdapters);
            } else {
                if (iR3 != 2) {
                    break;
                }
                pageInfo = (ProductCollectionQuery.PageInfo) C18453b.d(D.f36467a, false, 1, null).b(reader, customScalarAdapters);
            }
        }
        if (listB == null) {
            C18457f.a(reader, "items");
            throw new KotlinNothingValueException();
        }
        if (numB == null) {
            C18457f.a(reader, "totalCount");
            throw new KotlinNothingValueException();
        }
        int iIntValue = numB.intValue();
        if (pageInfo != null) {
            return new ProductCollectionQuery.ItemConnection(listB, iIntValue, pageInfo);
        }
        C18457f.a(reader, "pageInfo");
        throw new KotlinNothingValueException();
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(D6.g writer, z6.p customScalarAdapters, ProductCollectionQuery.ItemConnection value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.v1("items");
        C18453b.a(C18453b.c(C5368y.f36630a, true)).a(writer, customScalarAdapters, value.a());
        writer.v1("totalCount");
        C18453b.f172409b.a(writer, customScalarAdapters, Integer.valueOf(value.getTotalCount()));
        writer.v1("pageInfo");
        C18453b.d(D.f36467a, false, 1, null).a(writer, customScalarAdapters, value.getPageInfo());
    }

    private C5369z() {
    }
}
