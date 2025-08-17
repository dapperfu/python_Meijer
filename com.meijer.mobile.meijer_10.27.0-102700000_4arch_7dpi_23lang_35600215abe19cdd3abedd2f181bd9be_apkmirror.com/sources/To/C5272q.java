package To;

import So.MultiUPCQuery;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y6.C18174b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTo/q;", "", "<init>", "()V", "LC6/g;", "writer", "LSo/c;", "value", "Ly6/p;", "customScalarAdapters", "", "withDefaultValues", "", "a", "(LC6/g;LSo/c;Ly6/p;Z)V", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5272q {

    /* renamed from: a, reason: collision with root package name */
    public static final C5272q f35250a = new C5272q();

    public final void a(C6.g writer, MultiUPCQuery value, y6.p customScalarAdapters, boolean withDefaultValues) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(value, "value");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        writer.x1("upcs");
        C18174b.a(C18174b.f170222a).a(writer, customScalarAdapters, value.f());
        writer.x1("storeId");
        C18174b.f170223b.a(writer, customScalarAdapters, Integer.valueOf(value.getStoreId()));
    }

    private C5272q() {
    }
}
