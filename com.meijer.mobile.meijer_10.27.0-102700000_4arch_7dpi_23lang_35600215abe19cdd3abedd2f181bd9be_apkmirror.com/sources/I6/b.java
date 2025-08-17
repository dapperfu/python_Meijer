package I6;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import z6.C18399i;
import z6.k;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LI6/b;", "LI6/f;", "", "LI6/e;", "interceptors", "", "index", "<init>", "(Ljava/util/List;I)V", "Lz6/i;", "request", "Lz6/k;", "a", "(Lz6/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/List;", "b", "I", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<e> interceptors;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends e> interceptors, int i10) {
        Intrinsics.j(interceptors, "interceptors");
        this.interceptors = interceptors;
        this.index = i10;
    }

    @Override // I6.f
    public Object a(C18399i c18399i, Continuation<? super k> continuation) {
        if (this.index < this.interceptors.size()) {
            return this.interceptors.get(this.index).a(c18399i, new b(this.interceptors, this.index + 1), continuation);
        }
        throw new IllegalStateException("Check failed.");
    }
}
