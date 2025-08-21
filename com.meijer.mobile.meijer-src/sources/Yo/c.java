package Yo;

import D6.f;
import D6.g;
import Xo.ProductSortInput;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z6.AbstractC18451C;
import z6.C18453b;
import z6.InterfaceC18452a;
import z6.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LYo/c;", "Lz6/a;", "LXo/c;", "<init>", "()V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)LXo/c;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;LXo/c;)V", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements InterfaceC18452a<ProductSortInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f43225a = new c();

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ProductSortInput b(f reader, p customScalarAdapters) {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(g writer, p customScalarAdapters, ProductSortInput value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.v1("by");
        C18453b.f172408a.a(writer, customScalarAdapters, value.getBy());
        if (value.b() instanceof AbstractC18451C.Present) {
            writer.v1("order");
            C18453b.e(C18453b.f172416i).a(writer, customScalarAdapters, (AbstractC18451C.Present) value.b());
        }
    }

    private c() {
    }
}
