package lu;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Llu/p;", "E", "Lcom/squareup/wire/ProtoAdapter;", "", "originalAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "value", "", "p", "(Ljava/util/List;)I", "tag", "q", "(ILjava/util/List;)I", "Llu/o;", "writer", "", "n", "(Llu/o;Ljava/util/List;)V", "o", "(Llu/o;ILjava/util/List;)V", "Llu/n;", "reader", "m", "(Llu/n;)Ljava/util/List;", "a0", "Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p<E> extends ProtoAdapter<List<? extends E>> {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<E> originalAdapter;

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int h(int tag, List<? extends E> value) {
        if (value == null) {
            return 0;
        }
        int size = value.size();
        int iH = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iH += this.originalAdapter.h(tag, value.get(i10));
        }
        return iH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ProtoAdapter<E> originalAdapter) {
        super(originalAdapter.getFieldEncoding(), Reflection.b(List.class), null, originalAdapter.getSyntax(), CollectionsKt.m(), null, 32, null);
        Intrinsics.j(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public List<E> d(n reader) {
        Intrinsics.j(reader, "reader");
        return CollectionsKt.e(this.originalAdapter.d(reader));
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(o writer, List<? extends E> value) {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void f(o writer, int tag, List<? extends E> value) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value == null) {
            return;
        }
        int size = value.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.originalAdapter.f(writer, tag, value.get(i10));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int g(List<? extends E> value) {
        Intrinsics.j(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }
}
