package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, d2 = {"Landroidx/room/S;", "", "Landroidx/room/G;", "database", "<init>", "(Landroidx/room/G;)V", "LB4/g;", "createNewStatement", "()LB4/g;", "", "canUseCached", "getStmt", "(Z)LB4/g;", "", "createQuery", "()Ljava/lang/String;", "", "assertNotMainThread", "()V", "acquire", "statement", "release", "(LB4/g;)V", "Landroidx/room/G;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stmt$delegate", "Lkotlin/Lazy;", "stmt", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class S {
    private final G database;
    private final AtomicBoolean lock;

    /* renamed from: stmt$delegate, reason: from kotlin metadata */
    private final Lazy stmt;

    private final B4.g getStmt() {
        return (B4.g) this.stmt.getValue();
    }

    protected abstract String createQuery();

    public S(G database) {
        Intrinsics.j(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt = LazyKt.b(new Function0() { // from class: androidx.room.Q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f58651a.createNewStatement();
            }
        });
    }

    private final B4.g getStmt(boolean canUseCached) {
        return canUseCached ? getStmt() : createNewStatement();
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public void release(B4.g statement) {
        Intrinsics.j(statement, "statement");
        if (statement == getStmt()) {
            this.lock.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B4.g createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    public B4.g acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }
}
