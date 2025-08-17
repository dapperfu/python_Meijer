package lu;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Llu/h;", "Lcom/squareup/wire/ProtoAdapter;", "", "", "originalAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "Llu/o;", "writer", "", "tag", "value", "", "o", "(Llu/o;I[J)V", "p", "([J)I", "q", "(I[J)I", "n", "(Llu/o;[J)V", "Llu/n;", "reader", "m", "(Llu/n;)[J", "a0", "Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends ProtoAdapter<long[]> {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<Long> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ProtoAdapter<Long> originalAdapter) {
        super(d.f149408e, Reflection.b(long[].class), null, originalAdapter.getSyntax(), new long[0], null, 32, null);
        Intrinsics.j(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public long[] d(n reader) {
        Intrinsics.j(reader, "reader");
        return new long[]{this.originalAdapter.d(reader).longValue()};
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(o writer, long[] value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(value, "value");
        for (long j10 : value) {
            this.originalAdapter.e(writer, Long.valueOf(j10));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void f(o writer, int tag, long[] value) throws IOException {
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
    public int g(long[] value) {
        Intrinsics.j(value, "value");
        int iG = 0;
        for (long j10 : value) {
            iG += this.originalAdapter.g(Long.valueOf(j10));
        }
        return iG;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int h(int tag, long[] value) {
        if (value == null || value.length == 0) {
            return 0;
        }
        return super.h(tag, value);
    }
}
