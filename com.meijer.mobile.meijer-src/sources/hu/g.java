package hu;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lhu/g;", "Lcom/squareup/wire/ProtoAdapter;", "", "", "originalAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "Lhu/o;", "writer", "tag", "value", "", "o", "(Lhu/o;I[I)V", "p", "([I)I", "q", "(I[I)I", "n", "(Lhu/o;[I)V", "Lhu/n;", "reader", "m", "(Lhu/n;)[I", "a0", "Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends ProtoAdapter<int[]> {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<Integer> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ProtoAdapter<Integer> originalAdapter) {
        super(d.f136160e, Reflection.b(int[].class), null, originalAdapter.getSyntax(), new int[0], null, 32, null);
        Intrinsics.j(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int[] c(n reader) {
        Intrinsics.j(reader, "reader");
        return new int[]{this.originalAdapter.c(reader).intValue()};
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(o writer, int[] value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(value, "value");
        for (int i10 : value) {
            this.originalAdapter.e(writer, Integer.valueOf(i10));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void f(o writer, int tag, int[] value) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value != null) {
            if (value.length == 0) {
                return;
            }
            super.f(writer, tag, value);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int g(int[] value) {
        Intrinsics.j(value, "value");
        int iG = 0;
        for (int i10 : value) {
            iG += this.originalAdapter.g(Integer.valueOf(i10));
        }
        return iG;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int h(int tag, int[] value) {
        if (value == null || value.length == 0) {
            return 0;
        }
        return super.h(tag, value);
    }
}
