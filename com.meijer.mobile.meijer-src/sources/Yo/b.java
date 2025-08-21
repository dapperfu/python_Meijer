package Yo;

import D6.f;
import D6.g;
import Xo.ProductQueryContextInput;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z6.AbstractC18451C;
import z6.C18453b;
import z6.InterfaceC18452a;
import z6.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LYo/b;", "Lz6/a;", "LXo/b;", "<init>", "()V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)LXo/b;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;LXo/b;)V", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements InterfaceC18452a<ProductQueryContextInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f43224a = new b();

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductQueryContextInput b(f reader, p customScalarAdapters) {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(g writer, p customScalarAdapters, ProductQueryContextInput value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.v1("storeId");
        InterfaceC18452a<Integer> interfaceC18452a = C18453b.f172409b;
        interfaceC18452a.a(writer, customScalarAdapters, Integer.valueOf(value.getStoreId()));
        if (value.a() instanceof AbstractC18451C.Present) {
            writer.v1("accountId");
            C18453b.e(C18453b.f172416i).a(writer, customScalarAdapters, (AbstractC18451C.Present) value.a());
        }
        writer.v1("constructorClientId");
        InterfaceC18452a<String> interfaceC18452a2 = C18453b.f172408a;
        interfaceC18452a2.a(writer, customScalarAdapters, value.getConstructorClientId());
        writer.v1("constructorSessionId");
        interfaceC18452a.a(writer, customScalarAdapters, Integer.valueOf(value.getConstructorSessionId()));
        if (value.e() instanceof AbstractC18451C.Present) {
            writer.v1("userSegments");
            C18453b.e(C18453b.b(C18453b.a(interfaceC18452a2))).a(writer, customScalarAdapters, (AbstractC18451C.Present) value.e());
        }
    }

    private b() {
    }
}
