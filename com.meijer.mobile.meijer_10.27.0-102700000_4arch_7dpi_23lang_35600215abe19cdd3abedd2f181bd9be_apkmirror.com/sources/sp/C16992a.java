package sp;

import Co.ProductFullDetails;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kv.InterfaceC15323a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Lsp/a;", "", "Lkv/a;", "Lsp/Y;", "productStateRepositoryProvider", "<init>", "(Lkv/a;)V", "Lsp/a$a;", "listener", "", "b", "(Lsp/a$a;)V", "key", "a", "(Ljava/lang/Object;)Lsp/Y;", "", "LCo/h;", "list", "c", "(Ljava/lang/Object;Ljava/util/List;)V", "Lkv/a;", "", "Ljava/util/Map;", "getProductStateRepositories$state_release", "()Ljava/util/Map;", "productStateRepositories", "Lsp/a$a;", "repositoryCreatedListener", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16992a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15323a<Y> productStateRepositoryProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, Y> productStateRepositories;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC2509a repositoryCreatedListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lsp/a$a;", "", "key", "Lsp/Y;", "productStateRepository", "", "a", "(Ljava/lang/Object;Lsp/Y;)V", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sp.a$a, reason: collision with other inner class name */
    public interface InterfaceC2509a {
        void a(Object key, Y productStateRepository);
    }

    public C16992a(InterfaceC15323a<Y> productStateRepositoryProvider) {
        Intrinsics.j(productStateRepositoryProvider, "productStateRepositoryProvider");
        this.productStateRepositoryProvider = productStateRepositoryProvider;
        this.productStateRepositories = new LinkedHashMap();
    }

    public final Y a(Object key) {
        Intrinsics.j(key, "key");
        if (!this.productStateRepositories.containsKey(key)) {
            Y y10 = this.productStateRepositoryProvider.get();
            InterfaceC2509a interfaceC2509a = this.repositoryCreatedListener;
            if (interfaceC2509a != null) {
                Intrinsics.g(y10);
                interfaceC2509a.a(key, y10);
            }
            this.productStateRepositories.put(key, y10);
        }
        Y y11 = this.productStateRepositories.get(key);
        Intrinsics.g(y11);
        return y11;
    }

    public final void b(InterfaceC2509a listener) {
        this.repositoryCreatedListener = listener;
    }

    public final void c(Object key, List<ProductFullDetails> list) {
        Intrinsics.j(key, "key");
        Intrinsics.j(list, "list");
        a(key).m1(list);
    }
}
