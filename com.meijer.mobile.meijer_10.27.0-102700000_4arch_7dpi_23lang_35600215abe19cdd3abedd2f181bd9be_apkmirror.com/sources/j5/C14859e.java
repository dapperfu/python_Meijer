package j5;

import j5.InterfaceC14857c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import q5.C16451c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lj5/e;", "Lj5/c;", "Lj5/h;", "strongMemoryCache", "Lj5/i;", "weakMemoryCache", "<init>", "(Lj5/h;Lj5/i;)V", "Lj5/c$b;", "key", "Lj5/c$c;", "b", "(Lj5/c$b;)Lj5/c$c;", "value", "", "d", "(Lj5/c$b;Lj5/c$c;)V", "", "level", "a", "(I)V", "Lj5/h;", "Lj5/i;", "", "c", "()Ljava/util/Set;", "keys", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: j5.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14859e implements InterfaceC14857c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h strongMemoryCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i weakMemoryCache;

    @Override // j5.InterfaceC14857c
    public void a(int level) {
        this.strongMemoryCache.a(level);
        this.weakMemoryCache.a(level);
    }

    @Override // j5.InterfaceC14857c
    public InterfaceC14857c.Value b(InterfaceC14857c.Key key) {
        InterfaceC14857c.Value valueB = this.strongMemoryCache.b(key);
        return valueB == null ? this.weakMemoryCache.b(key) : valueB;
    }

    @Override // j5.InterfaceC14857c
    public Set<InterfaceC14857c.Key> c() {
        return SetsKt.l(this.strongMemoryCache.c(), this.weakMemoryCache.c());
    }

    @Override // j5.InterfaceC14857c
    public void d(InterfaceC14857c.Key key, InterfaceC14857c.Value value) {
        this.strongMemoryCache.d(InterfaceC14857c.Key.b(key, null, C16451c.b(key.c()), 1, null), value.getBitmap(), C16451c.b(value.b()));
    }

    public C14859e(h hVar, i iVar) {
        this.strongMemoryCache = hVar;
        this.weakMemoryCache = iVar;
    }
}
