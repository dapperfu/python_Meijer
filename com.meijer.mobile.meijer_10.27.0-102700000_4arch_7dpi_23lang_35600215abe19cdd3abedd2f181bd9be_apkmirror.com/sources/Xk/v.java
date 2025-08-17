package Xk;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kv.InterfaceC15323a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001d"}, d2 = {"LXk/v;", "", "Lkv/a;", "LXk/u;", "couponStateRepositoryProvider", "<init>", "(Lkv/a;)V", "LXk/v$a;", "listener", "", "c", "(LXk/v$a;)V", "key", "a", "(Ljava/lang/Object;)LXk/u;", "", "LOk/c;", "list", "d", "(Ljava/lang/Object;Ljava/util/List;)V", "b", "Lkv/a;", "", "Ljava/util/Map;", "getCouponStateRepositories$state_release", "()Ljava/util/Map;", "couponStateRepositories", "LXk/v$a;", "repositoryCreatedListener", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15323a<u> couponStateRepositoryProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, u> couponStateRepositories;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a repositoryCreatedListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"LXk/v$a;", "", "key", "LXk/u;", "couponStateRepository", "", "a", "(Ljava/lang/Object;LXk/u;)V", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void a(Object key, u couponStateRepository);
    }

    public v(InterfaceC15323a<u> couponStateRepositoryProvider) {
        Intrinsics.j(couponStateRepositoryProvider, "couponStateRepositoryProvider");
        this.couponStateRepositoryProvider = couponStateRepositoryProvider;
        this.couponStateRepositories = new LinkedHashMap();
    }

    public final u a(Object key) {
        Intrinsics.j(key, "key");
        if (!this.couponStateRepositories.containsKey(key)) {
            u uVar = this.couponStateRepositoryProvider.get();
            a aVar = this.repositoryCreatedListener;
            if (aVar != null) {
                Intrinsics.g(uVar);
                aVar.a(key, uVar);
            }
            this.couponStateRepositories.put(key, uVar);
        }
        u uVar2 = this.couponStateRepositories.get(key);
        Intrinsics.g(uVar2);
        return uVar2;
    }

    public final void b(Object key, List<? extends Ok.c> list) {
        Intrinsics.j(key, "key");
        Intrinsics.j(list, "list");
        a(key).R(list);
    }

    public final void c(a listener) {
        this.repositoryCreatedListener = listener;
    }

    public final void d(Object key, List<? extends Ok.c> list) {
        Intrinsics.j(key, "key");
        Intrinsics.j(list, "list");
        a(key).S(list);
    }
}
