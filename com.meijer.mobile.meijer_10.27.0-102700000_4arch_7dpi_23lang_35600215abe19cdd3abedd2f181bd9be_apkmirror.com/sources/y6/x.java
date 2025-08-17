package y6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u00030\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ly6/x;", "T", "Ly6/a;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "wrappedAdapter", "<init>", "(Ly6/a;)V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "c", "(LC6/f;Ly6/p;)Ljava/util/List;", "LC6/g;", "writer", "value", "", "d", "(LC6/g;Ly6/p;Ljava/util/List;)V", "a", "Ly6/a;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class x<T> implements InterfaceC18173a<List<T>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18173a<T> wrappedAdapter;

    public x(InterfaceC18173a<T> wrappedAdapter) {
        Intrinsics.j(wrappedAdapter, "wrappedAdapter");
        this.wrappedAdapter = wrappedAdapter;
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<T> b(C6.f reader, p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        reader.y();
        ArrayList arrayList = new ArrayList();
        while (reader.hasNext()) {
            arrayList.add(this.wrappedAdapter.b(reader, customScalarAdapters));
        }
        reader.x();
        return arrayList;
    }

    @Override // y6.InterfaceC18173a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(C6.g writer, p customScalarAdapters, List<? extends T> value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        writer.y();
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            this.wrappedAdapter.a(writer, customScalarAdapters, it.next());
        }
        writer.x();
    }
}
