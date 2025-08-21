package z9;

import P9.g;
import P9.p;
import g9.c;
import g9.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lz9/b;", "Lz9/a;", "Lg9/c;", "LA9/c;", "Lg9/d;", "requestRepository", "Ln9/b;", "concurrentHandlerHolder", "<init>", "(Lg9/c;Ln9/b;)V", "LP9/p;", "worker", "LS8/a;", "completionHandler", "a", "(LP9/p;LS8/a;)LS8/a;", "Lg9/c;", "b", "Ln9/b;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: z9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18463b implements InterfaceC18462a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c<A9.c, d> requestRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    public C18463b(c<A9.c, d> requestRepository, n9.b concurrentHandlerHolder) {
        Intrinsics.j(requestRepository, "requestRepository");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.requestRepository = requestRepository;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
    }

    @Override // z9.InterfaceC18462a
    public S8.a a(p worker, S8.a completionHandler) {
        return new g(worker, this.requestRepository, this.concurrentHandlerHolder, completionHandler);
    }
}
