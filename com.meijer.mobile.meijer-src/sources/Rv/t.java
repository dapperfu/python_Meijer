package Rv;

import Rv.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"LRv/t;", "LRv/v$b;", "LRv/p;", "connection", "<init>", "(LRv/p;)V", "", "e", "()Ljava/lang/Void;", "f", "a", "()LRv/p;", "c", "j", "LRv/p;", "i", "", "b", "Z", "()Z", "isReady", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t implements v.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p connection;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isReady;

    public t(p connection) {
        Intrinsics.j(connection, "connection");
        this.connection = connection;
        this.isReady = true;
    }

    @Override // Rv.v.b
    /* renamed from: a, reason: from getter */
    public p getConnection() {
        return this.connection;
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

    public Void e() {
        throw new IllegalStateException("already connected");
    }

    public Void f() {
        throw new IllegalStateException("already connected");
    }

    public final p i() {
        return this.connection;
    }

    public Void j() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // Rv.v.b
    public /* bridge */ /* synthetic */ v.ConnectResult d() {
        return (v.ConnectResult) f();
    }

    @Override // Rv.v.b
    public /* bridge */ /* synthetic */ v.b g() {
        return (v.b) j();
    }

    @Override // Rv.v.b
    public /* bridge */ /* synthetic */ v.ConnectResult h() {
        return (v.ConnectResult) e();
    }
}
