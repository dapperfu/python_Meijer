package E6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tv.InterfaceC17152f;
import y6.C18176d;
import y6.C18177e;
import y6.InterfaceC18167A;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LE6/c;", "LE6/b;", "", "LE6/a;", "interceptors", "", "index", "<init>", "(Ljava/util/List;I)V", "Ly6/A$a;", "D", "Ly6/d;", "request", "Ltv/f;", "Ly6/e;", "a", "(Ly6/d;)Ltv/f;", "Ljava/util/List;", "b", "I", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<a> interceptors;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends a> interceptors, int i10) {
        Intrinsics.j(interceptors, "interceptors");
        this.interceptors = interceptors;
        this.index = i10;
    }

    @Override // E6.b
    public <D extends InterfaceC18167A.a> InterfaceC17152f<C18177e<D>> a(C18176d<D> request) {
        Intrinsics.j(request, "request");
        if (this.index < this.interceptors.size()) {
            return this.interceptors.get(this.index).a(request, new c(this.interceptors, this.index + 1));
        }
        throw new IllegalStateException("Check failed.");
    }
}
