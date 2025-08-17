package To;

import So.MultiUPCQuery;
import java.io.IOException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y6.C18174b;
import y6.C18178f;
import y6.InterfaceC18173a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTo/a;", "Ly6/a;", "LSo/c$a;", "<init>", "()V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)LSo/c$a;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;LSo/c$a;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: To.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5240a implements InterfaceC18173a<MultiUPCQuery.Attribute> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5240a f35187a = new C5240a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> RESPONSE_NAMES = CollectionsKt.p("disabled", "firstImageUrl", "firstProductId", "name", "selected", "products");

    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public MultiUPCQuery.Attribute b(C6.f reader, y6.p customScalarAdapters) throws IOException {
        Boolean bool;
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Boolean boolB = null;
        Boolean boolB2 = null;
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        List list = null;
        while (true) {
            int iR3 = reader.r3(RESPONSE_NAMES);
            if (iR3 != 0) {
                if (iR3 == 1) {
                    bool = boolB2;
                    strB = C18174b.f170230i.b(reader, customScalarAdapters);
                } else if (iR3 == 2) {
                    bool = boolB2;
                    strB2 = C18174b.f170230i.b(reader, customScalarAdapters);
                } else if (iR3 == 3) {
                    bool = boolB2;
                    strB3 = C18174b.f170230i.b(reader, customScalarAdapters);
                } else if (iR3 == 4) {
                    boolB2 = C18174b.f170227f.b(reader, customScalarAdapters);
                } else {
                    if (iR3 != 5) {
                        break;
                    }
                    bool = boolB2;
                    list = (List) C18174b.b(C18174b.a(C18174b.d(C5254h.f35214a, false, 1, null))).b(reader, customScalarAdapters);
                }
                boolB2 = bool;
            } else {
                boolB = C18174b.f170227f.b(reader, customScalarAdapters);
            }
        }
        Boolean bool2 = boolB2;
        if (boolB == null) {
            C18178f.a(reader, "disabled");
            throw new KotlinNothingValueException();
        }
        boolean zBooleanValue = boolB.booleanValue();
        if (bool2 != null) {
            return new MultiUPCQuery.Attribute(zBooleanValue, strB, strB2, strB3, bool2.booleanValue(), list);
        }
        C18178f.a(reader, "selected");
        throw new KotlinNothingValueException();
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, y6.p customScalarAdapters, MultiUPCQuery.Attribute value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.x1("disabled");
        InterfaceC18173a<Boolean> interfaceC18173a = C18174b.f170227f;
        interfaceC18173a.a(writer, customScalarAdapters, Boolean.valueOf(value.getDisabled()));
        writer.x1("firstImageUrl");
        y6.y<String> yVar = C18174b.f170230i;
        yVar.a(writer, customScalarAdapters, value.getFirstImageUrl());
        writer.x1("firstProductId");
        yVar.a(writer, customScalarAdapters, value.getFirstProductId());
        writer.x1("name");
        yVar.a(writer, customScalarAdapters, value.getName());
        writer.x1("selected");
        interfaceC18173a.a(writer, customScalarAdapters, Boolean.valueOf(value.getSelected()));
        writer.x1("products");
        C18174b.b(C18174b.a(C18174b.d(C5254h.f35214a, false, 1, null))).a(writer, customScalarAdapters, value.e());
    }

    private C5240a() {
    }
}
