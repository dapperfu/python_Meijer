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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/A;", "Lz6/a;", "LSo/d$k;", "<init>", "()V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)LSo/d$k;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;LSo/d$k;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A implements InterfaceC18452a<ProductCollectionQuery.OnFilterableProductDisplayResult> {

    /* renamed from: a, reason: collision with root package name */
    public static final A f36455a = new A();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("itemConnection", "attribution", "filterOptions", "groupFilterOptions", "sortOptions");

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductCollectionQuery.OnFilterableProductDisplayResult b(D6.f reader, z6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        ProductCollectionQuery.ItemConnection itemConnection = null;
        ProductCollectionQuery.Attribution1 attribution1 = null;
        List listB = null;
        List listB2 = null;
        List listB3 = null;
        while (true) {
            int iR3 = reader.r3(RESPONSE_NAMES);
            if (iR3 == 0) {
                itemConnection = (ProductCollectionQuery.ItemConnection) C18453b.d(C5369z.f36634a, false, 1, null).b(reader, customScalarAdapters);
            } else if (iR3 == 1) {
                attribution1 = (ProductCollectionQuery.Attribution1) C18453b.b(C18453b.d(r.f36603a, false, 1, null)).b(reader, customScalarAdapters);
            } else if (iR3 == 2) {
                listB = C18453b.a(C18453b.d(C5366w.f36622a, false, 1, null)).b(reader, customScalarAdapters);
            } else if (iR3 == 3) {
                listB2 = C18453b.a(C18453b.d(C5367x.f36626a, false, 1, null)).b(reader, customScalarAdapters);
            } else {
                if (iR3 != 4) {
                    break;
                }
                listB3 = C18453b.a(C18453b.d(F.f36475a, false, 1, null)).b(reader, customScalarAdapters);
            }
        }
        if (itemConnection == null) {
            C18457f.a(reader, "itemConnection");
            throw new KotlinNothingValueException();
        }
        if (listB == null) {
            C18457f.a(reader, "filterOptions");
            throw new KotlinNothingValueException();
        }
        if (listB2 == null) {
            C18457f.a(reader, "groupFilterOptions");
            throw new KotlinNothingValueException();
        }
        if (listB3 != null) {
            return new ProductCollectionQuery.OnFilterableProductDisplayResult(itemConnection, attribution1, listB, listB2, listB3);
        }
        C18457f.a(reader, "sortOptions");
        throw new KotlinNothingValueException();
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(D6.g writer, z6.p customScalarAdapters, ProductCollectionQuery.OnFilterableProductDisplayResult value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.v1("itemConnection");
        C18453b.d(C5369z.f36634a, false, 1, null).a(writer, customScalarAdapters, value.getItemConnection());
        writer.v1("attribution");
        C18453b.b(C18453b.d(r.f36603a, false, 1, null)).a(writer, customScalarAdapters, value.getAttribution());
        writer.v1("filterOptions");
        C18453b.a(C18453b.d(C5366w.f36622a, false, 1, null)).a(writer, customScalarAdapters, value.b());
        writer.v1("groupFilterOptions");
        C18453b.a(C18453b.d(C5367x.f36626a, false, 1, null)).a(writer, customScalarAdapters, value.c());
        writer.v1("sortOptions");
        C18453b.a(C18453b.d(F.f36475a, false, 1, null)).a(writer, customScalarAdapters, value.e());
    }

    private A() {
    }
}
