package k5;

import java.util.Set;
import k5.InterfaceC15089c;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import r5.C16839c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Lk5/e;", "Lk5/c;", "Lk5/h;", "strongMemoryCache", "Lk5/i;", "weakMemoryCache", "<init>", "(Lk5/h;Lk5/i;)V", "Lk5/c$b;", "key", "Lk5/c$c;", "c", "(Lk5/c$b;)Lk5/c$c;", "value", "", "d", "(Lk5/c$b;Lk5/c$c;)V", "", "level", "a", "(I)V", "Lk5/h;", "b", "Lk5/i;", "", "()Ljava/util/Set;", "keys", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: k5.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15091e implements InterfaceC15089c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h strongMemoryCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i weakMemoryCache;

    @Override // k5.InterfaceC15089c
    public void a(int level) {
        this.strongMemoryCache.a(level);
        this.weakMemoryCache.a(level);
    }

    @Override // k5.InterfaceC15089c
    public Set<InterfaceC15089c.Key> b() {
        return SetsKt.l(this.strongMemoryCache.b(), this.weakMemoryCache.b());
    }

    @Override // k5.InterfaceC15089c
    public InterfaceC15089c.Value c(InterfaceC15089c.Key key) {
        InterfaceC15089c.Value valueC = this.strongMemoryCache.c(key);
        return valueC == null ? this.weakMemoryCache.c(key) : valueC;
    }

    @Override // k5.InterfaceC15089c
    public void d(InterfaceC15089c.Key key, InterfaceC15089c.Value value) {
        this.strongMemoryCache.d(InterfaceC15089c.Key.b(key, null, C16839c.b(key.c()), 1, null), value.getBitmap(), C16839c.b(value.b()));
    }

    public C15091e(h hVar, i iVar) {
        this.strongMemoryCache = hVar;
        this.weakMemoryCache = iVar;
    }
}
