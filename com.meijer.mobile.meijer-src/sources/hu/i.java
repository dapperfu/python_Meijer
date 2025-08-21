package hu;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lhu/i;", "K", "V", "Lcom/squareup/wire/ProtoAdapter;", "", "keyAdapter", "valueAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)V", "value", "", "o", "(Ljava/util/Map$Entry;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Ljava/util/Map$Entry;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/util/Map$Entry;", "a0", "Lcom/squareup/wire/ProtoAdapter;", "p", "()Lcom/squareup/wire/ProtoAdapter;", "b0", "q", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i<K, V> extends ProtoAdapter<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<K> keyAdapter;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<V> valueAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        super(d.f136160e, Reflection.b(Map.Entry.class), null, valueAdapter.getSyntax(), null, null, 48, null);
        Intrinsics.j(keyAdapter, "keyAdapter");
        Intrinsics.j(valueAdapter, "valueAdapter");
        this.keyAdapter = keyAdapter;
        this.valueAdapter = valueAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> c(n reader) {
        Intrinsics.j(reader, "reader");
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(o writer, Map.Entry<? extends K, ? extends V> value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(value, "value");
        this.keyAdapter.f(writer, 1, value.getKey());
        this.valueAdapter.f(writer, 2, value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int g(Map.Entry<? extends K, ? extends V> value) {
        Intrinsics.j(value, "value");
        return this.keyAdapter.h(1, value.getKey()) + this.valueAdapter.h(2, value.getValue());
    }

    public final ProtoAdapter<K> p() {
        return this.keyAdapter;
    }

    public final ProtoAdapter<V> q() {
        return this.valueAdapter;
    }
}
