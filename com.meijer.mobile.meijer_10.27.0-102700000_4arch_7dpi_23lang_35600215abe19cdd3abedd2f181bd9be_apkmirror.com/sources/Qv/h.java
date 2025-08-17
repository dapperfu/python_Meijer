package Qv;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u008b\u0001\b\u0010\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0004\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LQv/h;", "", "LVv/q;", "delegate", "<init>", "(LVv/q;)V", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "LUv/d;", "taskRunner", "LVv/g;", "connectionListener", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "", "retryOnConnectionFailure", "fastFallback", "LVv/u;", "routeDatabase", "(IJLjava/util/concurrent/TimeUnit;LUv/d;LVv/g;IIIIIZZLVv/u;)V", "(IJLjava/util/concurrent/TimeUnit;)V", "", "c", "()V", "a", "LVv/q;", "d", "()LVv/q;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Vv.q delegate;

    public h(Vv.q delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vv.j b(Uv.d dVar, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, Vv.u uVar, Vv.q pool, okhttp3.a address, Vv.h user) {
        Intrinsics.j(pool, "pool");
        Intrinsics.j(address, "address");
        Intrinsics.j(user, "user");
        return new Vv.l(new Vv.m(new Vv.r(dVar, pool, i10, i11, i12, i13, i14, z10, z11, address, uVar, user)), dVar);
    }

    public final void c() {
        this.delegate.e();
    }

    /* renamed from: d, reason: from getter */
    public final Vv.q getDelegate() {
        return this.delegate;
    }

    public /* synthetic */ h(int i10, long j10, TimeUnit timeUnit, Uv.d dVar, Vv.g gVar, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, Vv.u uVar, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 5 : i10, (i16 & 2) != 0 ? 5L : j10, (i16 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i16 & 8) != 0 ? Uv.d.f36366m : dVar, (i16 & 16) != 0 ? Vv.g.INSTANCE.a() : gVar, (i16 & 32) != 0 ? 10000 : i11, (i16 & 64) != 0 ? 10000 : i12, (i16 & 128) != 0 ? 10000 : i13, (i16 & 256) != 0 ? 10000 : i14, (i16 & 512) == 0 ? i15 : 10000, (i16 & 1024) != 0 ? true : z10, (i16 & RecyclerView.m.FLAG_MOVED) == 0 ? z11 : true, (i16 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new Vv.u() : uVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i10, long j10, TimeUnit timeUnit, final Uv.d taskRunner, Vv.g connectionListener, final int i11, final int i12, final int i13, final int i14, final int i15, final boolean z10, final boolean z11, final Vv.u routeDatabase) {
        this(new Vv.q(taskRunner, i10, j10, timeUnit, connectionListener, new Function3() { // from class: Qv.g
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return h.b(taskRunner, i11, i12, i13, i14, i15, z10, z11, routeDatabase, (Vv.q) obj, (okhttp3.a) obj2, (Vv.h) obj3);
            }
        }));
        Intrinsics.j(timeUnit, "timeUnit");
        Intrinsics.j(taskRunner, "taskRunner");
        Intrinsics.j(connectionListener, "connectionListener");
        Intrinsics.j(routeDatabase, "routeDatabase");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i10, long j10, TimeUnit timeUnit) {
        this(i10, j10, timeUnit, Uv.d.f36366m, Vv.g.INSTANCE.a(), 0, 0, 0, 0, 0, false, false, null, 8160, null);
        Intrinsics.j(timeUnit, "timeUnit");
    }
}
