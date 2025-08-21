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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/w;", "Lz6/a;", "LSo/d$g;", "<init>", "()V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)LSo/d$g;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;LSo/d$g;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5366w implements InterfaceC18452a<ProductCollectionQuery.FilterOption> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5366w f36622a = new C5366w();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("displayName", "hidden", "name", "selectionType", "options");

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductCollectionQuery.FilterOption b(D6.f reader, z6.p customScalarAdapters) throws IOException {
        Boolean bool;
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Boolean boolB = null;
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        List list = null;
        while (true) {
            int iR3 = reader.r3(RESPONSE_NAMES);
            if (iR3 == 0) {
                bool = boolB;
                strB = C18453b.f172408a.b(reader, customScalarAdapters);
            } else if (iR3 == 1) {
                boolB = C18453b.f172413f.b(reader, customScalarAdapters);
            } else if (iR3 == 2) {
                bool = boolB;
                strB2 = C18453b.f172408a.b(reader, customScalarAdapters);
            } else if (iR3 == 3) {
                bool = boolB;
                strB3 = C18453b.f172416i.b(reader, customScalarAdapters);
            } else {
                if (iR3 != 4) {
                    break;
                }
                bool = boolB;
                list = (List) C18453b.b(C18453b.a(C18453b.d(C.f36463a, false, 1, null))).b(reader, customScalarAdapters);
            }
            boolB = bool;
        }
        Boolean bool2 = boolB;
        if (strB == null) {
            C18457f.a(reader, "displayName");
            throw new KotlinNothingValueException();
        }
        if (bool2 == null) {
            C18457f.a(reader, "hidden");
            throw new KotlinNothingValueException();
        }
        boolean zBooleanValue = bool2.booleanValue();
        if (strB2 != null) {
            return new ProductCollectionQuery.FilterOption(strB, zBooleanValue, strB2, strB3, list);
        }
        C18457f.a(reader, "name");
        throw new KotlinNothingValueException();
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(D6.g writer, z6.p customScalarAdapters, ProductCollectionQuery.FilterOption value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.v1("displayName");
        InterfaceC18452a<String> interfaceC18452a = C18453b.f172408a;
        interfaceC18452a.a(writer, customScalarAdapters, value.getDisplayName());
        writer.v1("hidden");
        C18453b.f172413f.a(writer, customScalarAdapters, Boolean.valueOf(value.getHidden()));
        writer.v1("name");
        interfaceC18452a.a(writer, customScalarAdapters, value.getName());
        writer.v1("selectionType");
        C18453b.f172416i.a(writer, customScalarAdapters, value.getSelectionType());
        writer.v1("options");
        C18453b.b(C18453b.a(C18453b.d(C.f36463a, false, 1, null))).a(writer, customScalarAdapters, value.d());
    }

    private C5366w() {
    }
}
