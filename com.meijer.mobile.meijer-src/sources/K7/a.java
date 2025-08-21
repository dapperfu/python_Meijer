package K7;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LK7/a;", "LK7/g;", "", "delegates", "<init>", "(Ljava/util/List;)V", "LX7/b;", "cache", "", "b", "(LX7/b;)V", "a", "Ljava/util/List;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<g> delegates;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends g> delegates) {
        Intrinsics.j(delegates, "delegates");
        this.delegates = delegates;
    }

    @Override // K7.g
    public void a(X7.b cache) {
        Intrinsics.j(cache, "cache");
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(cache);
        }
    }

    @Override // K7.g
    public void b(X7.b cache) {
        Intrinsics.j(cache, "cache");
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((g) it.next()).b(cache);
        }
    }
}
