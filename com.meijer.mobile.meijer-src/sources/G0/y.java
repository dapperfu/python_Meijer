package G0;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LG0/y;", "K", "V", "LG0/u;", "", "LG0/i;", "parentIterator", "<init>", "(LG0/i;)V", "q", "()Ljava/util/Map$Entry;", "d", "LG0/i;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i<K, V> parentIterator;

    public y(i<K, V> iVar) {
        this.parentIterator = iVar;
    }

    @Override // java.util.Iterator
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        I0.a.a(g());
        p(getIndex() + 2);
        return new c(this.parentIterator, getBuffer()[getIndex() - 2], getBuffer()[getIndex() - 1]);
    }
}
