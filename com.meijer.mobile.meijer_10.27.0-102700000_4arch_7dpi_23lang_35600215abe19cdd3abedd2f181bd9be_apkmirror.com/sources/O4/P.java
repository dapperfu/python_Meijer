package O4;

import W4.C5413o;
import android.content.Context;
import android.database.SQLException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LO4/P;", "Lu4/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LA4/c;", "db", "", "migrate", "(LA4/c;)V", "a", "Landroid/content/Context;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class P extends u4.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Context context) {
        super(9, 10);
        Intrinsics.j(context, "context");
        this.context = context;
    }

    @Override // u4.b
    public void migrate(A4.c db2) throws SQLException {
        Intrinsics.j(db2, "db");
        db2.S("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        W4.B.c(this.context, db2);
        C5413o.c(this.context, db2);
    }
}
