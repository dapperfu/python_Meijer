package To;

import So.ProductSearchQuery;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y6.AbstractC18169C;
import y6.C18174b;
import y6.InterfaceC18173a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTo/Q0;", "", "<init>", "()V", "LC6/g;", "writer", "LSo/g;", "value", "Ly6/p;", "customScalarAdapters", "", "withDefaultValues", "", "a", "(LC6/g;LSo/g;Ly6/p;Z)V", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Q0 f35170a = new Q0();

    public final void a(C6.g writer, ProductSearchQuery value, y6.p customScalarAdapters, boolean withDefaultValues) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(value, "value");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        writer.x1("searchTerm");
        InterfaceC18173a<String> interfaceC18173a = C18174b.f170222a;
        interfaceC18173a.a(writer, customScalarAdapters, value.getSearchTerm());
        writer.x1("storeId");
        InterfaceC18173a<Integer> interfaceC18173a2 = C18174b.f170223b;
        interfaceC18173a2.a(writer, customScalarAdapters, Integer.valueOf(value.getStoreId()));
        writer.x1("first");
        interfaceC18173a2.a(writer, customScalarAdapters, Integer.valueOf(value.getFirst()));
        writer.x1("after");
        interfaceC18173a.a(writer, customScalarAdapters, value.getAfter());
        if (value.g() instanceof AbstractC18169C.Present) {
            writer.x1("filters");
            C18174b.e(C18174b.b(C18174b.a(C18174b.d(Yo.a.f40443a, false, 1, null)))).a(writer, customScalarAdapters, (AbstractC18169C.Present) value.g());
        }
        if (value.j() instanceof AbstractC18169C.Present) {
            writer.x1("sort");
            C18174b.e(C18174b.b(C18174b.d(Yo.c.f40445a, false, 1, null))).a(writer, customScalarAdapters, (AbstractC18169C.Present) value.j());
        }
        writer.x1("context");
        C18174b.d(Yo.b.f40444a, false, 1, null).a(writer, customScalarAdapters, value.getContext());
    }

    private Q0() {
    }
}
