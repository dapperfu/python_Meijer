package K6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y6.C18176d;
import y6.InterfaceC18167A;
import y6.InterfaceC18167A.a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"LK6/l;", "Ly6/A$a;", "D", "LK6/a;", "Ly6/d;", "request", "<init>", "(Ly6/d;)V", "a", "Ly6/d;", "()Ly6/d;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l<D extends InterfaceC18167A.a> implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18176d<D> request;

    public l(C18176d<D> request) {
        Intrinsics.j(request, "request");
        this.request = request;
    }

    public final C18176d<D> a() {
        return this.request;
    }
}
