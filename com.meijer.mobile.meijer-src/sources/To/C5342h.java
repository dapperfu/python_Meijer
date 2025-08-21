package To;

import So.MultiUPCQuery;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import z6.C18453b;
import z6.InterfaceC18452a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/h;", "Lz6/a;", "LSo/c$i;", "<init>", "()V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)LSo/c$i;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;LSo/c$i;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5342h implements InterfaceC18452a<MultiUPCQuery.Product> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5342h f36564a = new C5342h();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("imageUrl", "productId", "product");

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public MultiUPCQuery.Product b(D6.f reader, z6.p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        String strB = null;
        String strB2 = null;
        MultiUPCQuery.Product1 product1 = null;
        while (true) {
            int iR3 = reader.r3(RESPONSE_NAMES);
            if (iR3 == 0) {
                strB = C18453b.f172416i.b(reader, customScalarAdapters);
            } else if (iR3 == 1) {
                strB2 = C18453b.f172416i.b(reader, customScalarAdapters);
            } else {
                if (iR3 != 2) {
                    return new MultiUPCQuery.Product(strB, strB2, product1);
                }
                product1 = (MultiUPCQuery.Product1) C18453b.b(C18453b.d(C5338f.f36556a, false, 1, null)).b(reader, customScalarAdapters);
            }
        }
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(D6.g writer, z6.p customScalarAdapters, MultiUPCQuery.Product value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.v1("imageUrl");
        z6.y<String> yVar = C18453b.f172416i;
        yVar.a(writer, customScalarAdapters, value.getImageUrl());
        writer.v1("productId");
        yVar.a(writer, customScalarAdapters, value.getProductId());
        writer.v1("product");
        C18453b.b(C18453b.d(C5338f.f36556a, false, 1, null)).a(writer, customScalarAdapters, value.getProduct());
    }

    private C5342h() {
    }
}
