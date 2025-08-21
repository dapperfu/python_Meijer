package u4;

import B4.c;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import t4.C17178a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\n\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lu4/b;", "", "", "startVersion", "endVersion", "<init>", "(II)V", "LB4/c;", "db", "", "migrate", "(LB4/c;)V", "LA4/b;", "connection", "(LA4/b;)V", "I", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17349b {

    @JvmField
    public final int endVersion;

    @JvmField
    public final int startVersion;

    public void migrate(c db2) {
        Intrinsics.j(db2, "db");
        throw new NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public AbstractC17349b(int i10, int i11) {
        this.startVersion = i10;
        this.endVersion = i11;
    }

    public void migrate(A4.b connection) {
        Intrinsics.j(connection, "connection");
        if (connection instanceof C17178a) {
            migrate(((C17178a) connection).getDb());
            return;
        }
        throw new NotImplementedError("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
