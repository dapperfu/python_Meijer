package lu;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Llu/j;", "K", "V", "Lcom/squareup/wire/ProtoAdapter;", "", "keyAdapter", "valueAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)V", "value", "", "p", "(Ljava/util/Map;)I", "tag", "q", "(ILjava/util/Map;)I", "Llu/o;", "writer", "", "n", "(Llu/o;Ljava/util/Map;)V", "o", "(Llu/o;ILjava/util/Map;)V", "Llu/n;", "reader", "m", "(Llu/n;)Ljava/util/Map;", "Llu/i;", "a0", "Llu/i;", "entryAdapter", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class j<K, V> extends ProtoAdapter<Map<K, ? extends V>> {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final i<K, V> entryAdapter;

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int h(int tag, Map<K, ? extends V> value) {
        int iH = 0;
        if (value == null) {
            return 0;
        }
        Iterator<Map.Entry<K, ? extends V>> it = value.entrySet().iterator();
        while (it.hasNext()) {
            iH += this.entryAdapter.h(tag, it.next());
        }
        return iH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        super(d.f149408e, Reflection.b(Map.class), null, valueAdapter.getSyntax(), MapsKt.k(), null, 32, null);
        Intrinsics.j(keyAdapter, "keyAdapter");
        Intrinsics.j(valueAdapter, "valueAdapter");
        this.entryAdapter = new i<>(keyAdapter, valueAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Map<K, V> d(n reader) throws IOException {
        Intrinsics.j(reader, "reader");
        K kJ = this.entryAdapter.p().j();
        V vJ = this.entryAdapter.q().j();
        long jD = reader.d();
        while (true) {
            int iH = reader.h();
            if (iH == -1) {
                break;
            }
            if (iH == 1) {
                kJ = this.entryAdapter.p().d(reader);
            } else if (iH == 2) {
                vJ = this.entryAdapter.q().d(reader);
            }
        }
        reader.e(jD);
        if (kJ == null) {
            throw new IllegalStateException("Map entry with null key");
        }
        if (vJ != null) {
            return MapsKt.g(TuplesKt.a(kJ, vJ));
        }
        throw new IllegalStateException("Map entry with null value");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(o writer, Map<K, ? extends V> value) {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void f(o writer, int tag, Map<K, ? extends V> value) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value == null) {
            return;
        }
        Iterator<Map.Entry<K, ? extends V>> it = value.entrySet().iterator();
        while (it.hasNext()) {
            this.entryAdapter.f(writer, tag, it.next());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int g(Map<K, ? extends V> value) {
        Intrinsics.j(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }
}
