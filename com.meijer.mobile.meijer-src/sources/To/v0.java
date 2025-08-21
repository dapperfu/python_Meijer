package To;

import So.ProductDetailQuery;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z6.C18453b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTo/v0;", "", "<init>", "()V", "LD6/g;", "writer", "LSo/f;", "value", "Lz6/p;", "customScalarAdapters", "", "withDefaultValues", "", "a", "(LD6/g;LSo/f;Lz6/p;Z)V", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f36621a = new v0();

    public final void a(D6.g writer, ProductDetailQuery value, z6.p customScalarAdapters, boolean withDefaultValues) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(value, "value");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        writer.v1("upc");
        C18453b.f172408a.a(writer, customScalarAdapters, value.getUpc());
        writer.v1("storeId");
        C18453b.f172409b.a(writer, customScalarAdapters, Integer.valueOf(value.getStoreId()));
    }

    private v0() {
    }
}
