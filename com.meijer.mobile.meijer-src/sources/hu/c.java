package hu;

import com.squareup.wire.ProtoAdapter;
import hu.r;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\fH$¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lhu/c;", "Lhu/r;", "E", "Lcom/squareup/wire/ProtoAdapter;", "Lkotlin/reflect/KClass;", "type", "Lhu/q;", "syntax", "identity", "<init>", "(Lkotlin/reflect/KClass;Lhu/q;Lhu/r;)V", "value", "", "o", "(Lhu/r;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Lhu/r;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Lhu/r;", "p", "(I)Lhu/r;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public abstract class c<E extends r> extends ProtoAdapter<E> {
    protected abstract E p(int value);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected c(KClass<E> type, q syntax, E e10) {
        super(d.f136158c, type, null, syntax, e10);
        Intrinsics.j(type, "type");
        Intrinsics.j(syntax, "syntax");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public E c(n reader) throws IOException {
        Intrinsics.j(reader, "reader");
        int iO = reader.o();
        E e10 = (E) p(iO);
        if (e10 != null) {
            return e10;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(iO, l());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(o writer, E value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(value, "value");
        writer.g(value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int g(E value) {
        Intrinsics.j(value, "value");
        return o.INSTANCE.h(value.getValue());
    }
}
