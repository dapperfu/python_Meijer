package z6;

import D6.f;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000f\u0012\u000b\u0012\t\u0018\u00018\u0000¢\u0006\u0002\b\u00040\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lz6/y;", "", "T", "Lz6/a;", "Lkotlin/jvm/JvmSuppressWildcards;", "wrappedAdapter", "<init>", "(Lz6/a;)V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "b", "(LD6/f;Lz6/p;)Ljava/lang/Object;", "LD6/g;", "writer", "value", "", "a", "(LD6/g;Lz6/p;Ljava/lang/Object;)V", "Lz6/a;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class y<T> implements InterfaceC18452a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18452a<T> wrappedAdapter;

    public y(InterfaceC18452a<T> wrappedAdapter) {
        Intrinsics.j(wrappedAdapter, "wrappedAdapter");
        this.wrappedAdapter = wrappedAdapter;
        if (wrappedAdapter instanceof y) {
            throw new IllegalStateException("The adapter is already nullable");
        }
    }

    @Override // z6.InterfaceC18452a
    public void a(D6.g writer, p customScalarAdapters, T value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        if (value == null) {
            writer.C3();
        } else {
            this.wrappedAdapter.a(writer, customScalarAdapters, value);
        }
    }

    @Override // z6.InterfaceC18452a
    public T b(D6.f reader, p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        if (reader.peek() != f.a.f6003j) {
            return this.wrappedAdapter.b(reader, customScalarAdapters);
        }
        reader.skipValue();
        return null;
    }
}
