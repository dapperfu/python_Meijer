package To;

import So.ProductSearchQuery;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z6.AbstractC18451C;
import z6.C18453b;
import z6.InterfaceC18452a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTo/Q0;", "", "<init>", "()V", "LD6/g;", "writer", "LSo/g;", "value", "Lz6/p;", "customScalarAdapters", "", "withDefaultValues", "", "a", "(LD6/g;LSo/g;Lz6/p;Z)V", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Q0 f36520a = new Q0();

    public final void a(D6.g writer, ProductSearchQuery value, z6.p customScalarAdapters, boolean withDefaultValues) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(value, "value");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        writer.v1("searchTerm");
        InterfaceC18452a<String> interfaceC18452a = C18453b.f172408a;
        interfaceC18452a.a(writer, customScalarAdapters, value.getSearchTerm());
        writer.v1("storeId");
        InterfaceC18452a<Integer> interfaceC18452a2 = C18453b.f172409b;
        interfaceC18452a2.a(writer, customScalarAdapters, Integer.valueOf(value.getStoreId()));
        writer.v1("first");
        interfaceC18452a2.a(writer, customScalarAdapters, Integer.valueOf(value.getFirst()));
        writer.v1("after");
        interfaceC18452a.a(writer, customScalarAdapters, value.getAfter());
        if (value.g() instanceof AbstractC18451C.Present) {
            writer.v1("filters");
            C18453b.e(C18453b.b(C18453b.a(C18453b.d(Yo.a.f43223a, false, 1, null)))).a(writer, customScalarAdapters, (AbstractC18451C.Present) value.g());
        }
        if (value.j() instanceof AbstractC18451C.Present) {
            writer.v1("sort");
            C18453b.e(C18453b.b(C18453b.d(Yo.c.f43225a, false, 1, null))).a(writer, customScalarAdapters, (AbstractC18451C.Present) value.j());
        }
        writer.v1("context");
        C18453b.d(Yo.b.f43224a, false, 1, null).a(writer, customScalarAdapters, value.getContext());
    }

    private Q0() {
    }
}
