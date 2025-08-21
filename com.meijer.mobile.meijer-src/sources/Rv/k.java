package Rv;

import Rv.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"LRv/k;", "LRv/v$b;", "", "e", "<init>", "(Ljava/lang/Throwable;)V", "LRv/v$a;", "h", "()LRv/v$a;", "d", "", "f", "()Ljava/lang/Void;", "c", "i", "a", "LRv/v$a;", "result", "", "b", "Z", "()Z", "isReady", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements v.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v.ConnectResult result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isReady;

    public k(Throwable e10) {
        Intrinsics.j(e10, "e");
        this.result = new v.ConnectResult(this, null, e10, 2, null);
    }

    @Override // Rv.v.b
    /* renamed from: b, reason: from getter */
    public boolean getIsReady() {
        return this.isReady;
    }

    @Override // Rv.v.b, Sv.d.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // Rv.v.b
    /* renamed from: d, reason: from getter */
    public v.ConnectResult getResult() {
        return this.result;
    }

    public final v.ConnectResult e() {
        return this.result;
    }

    public Void f() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // Rv.v.b
    public v.ConnectResult h() {
        return this.result;
    }

    public Void i() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // Rv.v.b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ p getConnection() {
        return (p) f();
    }

    @Override // Rv.v.b
    public /* bridge */ /* synthetic */ v.b g() {
        return (v.b) i();
    }
}
