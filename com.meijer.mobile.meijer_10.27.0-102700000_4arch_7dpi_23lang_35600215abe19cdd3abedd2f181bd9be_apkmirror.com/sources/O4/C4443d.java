package O4;

import N4.InterfaceC4314b;
import androidx.room.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LO4/d;", "Landroidx/room/G$b;", "LN4/b;", "clock", "<init>", "(LN4/b;)V", "LA4/c;", "db", "", "e", "(LA4/c;)V", "a", "LN4/b;", "getClock", "()LN4/b;", "", "h", "()Ljava/lang/String;", "pruneSQL", "", "g", "()J", "pruneDate", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4443d extends G.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4314b clock;

    public C4443d(InterfaceC4314b clock) {
        Intrinsics.j(clock, "clock");
        this.clock = clock;
    }

    private final long g() {
        return this.clock.a() - H.f23117a;
    }

    private final String h() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + g() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // androidx.room.G.b
    public void e(A4.c db2) {
        Intrinsics.j(db2, "db");
        super.e(db2);
        db2.n();
        try {
            db2.S(h());
            db2.q();
        } finally {
            db2.r();
        }
    }
}
