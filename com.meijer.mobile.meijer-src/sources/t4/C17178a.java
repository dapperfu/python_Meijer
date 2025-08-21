package t4;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lt4/a;", "LA4/b;", "LB4/c;", "db", "<init>", "(LB4/c;)V", "", "sql", "Lt4/e;", "b", "(Ljava/lang/String;)Lt4/e;", "", "close", "()V", "a", "LB4/c;", "()LB4/c;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17178a implements A4.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B4.c db;

    public C17178a(B4.c db2) {
        Intrinsics.j(db2, "db");
        this.db = db2;
    }

    /* renamed from: a, reason: from getter */
    public final B4.c getDb() {
        return this.db;
    }

    @Override // A4.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC17182e S3(String sql) {
        Intrinsics.j(sql, "sql");
        return AbstractC17182e.INSTANCE.a(this.db, sql);
    }

    @Override // A4.b, java.lang.AutoCloseable
    public void close() throws IOException {
        this.db.close();
    }
}
