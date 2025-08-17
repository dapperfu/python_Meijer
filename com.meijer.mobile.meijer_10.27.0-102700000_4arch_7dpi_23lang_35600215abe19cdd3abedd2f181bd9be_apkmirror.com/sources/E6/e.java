package E6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tv.InterfaceC17152f;
import y6.C18176d;
import y6.C18177e;
import y6.InterfaceC18167A;
import y6.InterfaceC18171E;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"LE6/e;", "LE6/a;", "LH6/b;", "networkTransport", "subscriptionNetworkTransport", "<init>", "(LH6/b;LH6/b;)V", "Ly6/A$a;", "D", "Ly6/d;", "request", "LE6/b;", "chain", "Ltv/f;", "Ly6/e;", "a", "(Ly6/d;LE6/b;)Ltv/f;", "LH6/b;", "b", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final H6.b networkTransport;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final H6.b subscriptionNetworkTransport;

    public e(H6.b networkTransport, H6.b subscriptionNetworkTransport) {
        Intrinsics.j(networkTransport, "networkTransport");
        Intrinsics.j(subscriptionNetworkTransport, "subscriptionNetworkTransport");
        this.networkTransport = networkTransport;
        this.subscriptionNetworkTransport = subscriptionNetworkTransport;
    }

    @Override // E6.a
    public <D extends InterfaceC18167A.a> InterfaceC17152f<C18177e<D>> a(C18176d<D> request, b chain) {
        Intrinsics.j(request, "request");
        Intrinsics.j(chain, "chain");
        if (request.g() instanceof InterfaceC18171E) {
            return this.networkTransport.a(request);
        }
        throw new IllegalStateException("");
    }
}
