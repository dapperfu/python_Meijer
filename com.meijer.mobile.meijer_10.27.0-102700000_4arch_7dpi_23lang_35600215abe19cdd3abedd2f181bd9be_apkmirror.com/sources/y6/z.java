package y6;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00030\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0017"}, d2 = {"Ly6/z;", "T", "Ly6/a;", "Lkotlin/jvm/JvmSuppressWildcards;", "wrappedAdapter", "", "buffered", "<init>", "(Ly6/a;Z)V", "LC6/f;", "reader", "Ly6/p;", "customScalarAdapters", "b", "(LC6/f;Ly6/p;)Ljava/lang/Object;", "LC6/g;", "writer", "value", "", "a", "(LC6/g;Ly6/p;Ljava/lang/Object;)V", "Ly6/a;", "Z", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class z<T> implements InterfaceC18173a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18173a<T> wrappedAdapter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean buffered;

    public z(InterfaceC18173a<T> wrappedAdapter, boolean z10) {
        Intrinsics.j(wrappedAdapter, "wrappedAdapter");
        this.wrappedAdapter = wrappedAdapter;
        this.buffered = z10;
    }

    @Override // y6.InterfaceC18173a
    public void a(C6.g writer, p customScalarAdapters, T value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        if (!this.buffered || (writer instanceof C6.i)) {
            writer.s();
            this.wrappedAdapter.a(writer, customScalarAdapters, value);
            writer.F();
            return;
        }
        C6.i iVar = new C6.i();
        iVar.s();
        this.wrappedAdapter.a(iVar, customScalarAdapters, value);
        iVar.F();
        Object objC = iVar.c();
        Intrinsics.g(objC);
        C6.b.a(writer, objC);
    }

    @Override // y6.InterfaceC18173a
    public T b(C6.f reader, p customScalarAdapters) throws IOException {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        if (this.buffered) {
            reader = C6.h.INSTANCE.a(reader);
        }
        reader.s();
        T tB = this.wrappedAdapter.b(reader, customScalarAdapters);
        reader.F();
        return tB;
    }
}
