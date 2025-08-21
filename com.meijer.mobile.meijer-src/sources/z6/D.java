package z6;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z6.AbstractC18451C;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u00030\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lz6/D;", "T", "Lz6/a;", "Lz6/C$c;", "Lkotlin/jvm/JvmSuppressWildcards;", "wrappedAdapter", "<init>", "(Lz6/a;)V", "LD6/f;", "reader", "Lz6/p;", "customScalarAdapters", "c", "(LD6/f;Lz6/p;)Lz6/C$c;", "LD6/g;", "writer", "value", "", "d", "(LD6/g;Lz6/p;Lz6/C$c;)V", "a", "Lz6/a;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class D<T> implements InterfaceC18452a<AbstractC18451C.Present<T>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18452a<T> wrappedAdapter;

    public D(InterfaceC18452a<T> wrappedAdapter) {
        Intrinsics.j(wrappedAdapter, "wrappedAdapter");
        this.wrappedAdapter = wrappedAdapter;
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC18451C.Present<T> b(D6.f reader, p customScalarAdapters) {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        return new AbstractC18451C.Present<>(this.wrappedAdapter.b(reader, customScalarAdapters));
    }

    @Override // z6.InterfaceC18452a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(D6.g writer, p customScalarAdapters, AbstractC18451C.Present<T> value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Intrinsics.j(value, "value");
        this.wrappedAdapter.a(writer, customScalarAdapters, value.a());
    }
}
