package Vv;

import Vv.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0003\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"LVv/k;", "LVv/v$b;", "", "e", "<init>", "(Ljava/lang/Throwable;)V", "LVv/v$a;", "h", "()LVv/v$a;", "", "f", "()Ljava/lang/Void;", "a", "i", "LVv/v$a;", "d", "result", "", "b", "Z", "()Z", "isReady", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements v.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v.ConnectResult result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isReady;

    public k(Throwable e10) {
        Intrinsics.j(e10, "e");
        this.result = new v.ConnectResult(this, null, e10, 2, null);
    }

    @Override // Vv.v.b, Wv.d.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // Vv.v.b
    /* renamed from: b, reason: from getter */
    public boolean getIsReady() {
        return this.isReady;
    }

    /* renamed from: d, reason: from getter */
    public final v.ConnectResult getResult() {
        return this.result;
    }

    @Override // Vv.v.b
    public v.ConnectResult e() {
        return this.result;
    }

    public Void f() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // Vv.v.b
    public v.ConnectResult h() {
        return this.result;
    }

    public Void i() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // Vv.v.b
    /* renamed from: c */
    public /* bridge */ /* synthetic */ p getConnection() {
        return (p) f();
    }

    @Override // Vv.v.b
    public /* bridge */ /* synthetic */ v.b g() {
        return (v.b) i();
    }
}
