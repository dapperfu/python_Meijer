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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/y0;", "Lz6/a;", "LSo/g$c;", "<init>", "()V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)LSo/g$c;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;LSo/g$c;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y0 implements InterfaceC18452a<ProductSearchQuery.Child> {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f36632a = new y0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("count", "displayName", "groupId");

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductSearchQuery.Child b(D6.f reader, z6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Integer numB = null;
        String strB = null;
        String strB2 = null;
        while (true) {
            int iR3 = reader.r3(RESPONSE_NAMES);
            if (iR3 == 0) {
                numB = C18453b.f172409b.b(reader, customScalarAdapters);
            } else if (iR3 == 1) {
                strB = C18453b.f172416i.b(reader, customScalarAdapters);
            } else {
                if (iR3 != 2) {
                    break;
                }
                strB2 = C18453b.f172408a.b(reader, customScalarAdapters);
            }
        }
        if (numB == null) {
            C18457f.a(reader, "count");
            throw new KotlinNothingValueException();
        }
        int iIntValue = numB.intValue();
        if (strB2 != null) {
            return new ProductSearchQuery.Child(iIntValue, strB, strB2);
        }
        C18457f.a(reader, "groupId");
        throw new KotlinNothingValueException();
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(D6.g writer, z6.p customScalarAdapters, ProductSearchQuery.Child value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.v1("count");
        C18453b.f172409b.a(writer, customScalarAdapters, Integer.valueOf(value.getCount()));
        writer.v1("displayName");
        C18453b.f172416i.a(writer, customScalarAdapters, value.getDisplayName());
        writer.v1("groupId");
        C18453b.f172408a.a(writer, customScalarAdapters, value.getGroupId());
    }

    private y0() {
    }
}
