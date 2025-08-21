package androidx.room;

import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Deprecated
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H$¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0015\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/room/h;", "T", "Landroidx/room/S;", "Landroidx/room/G;", "database", "<init>", "(Landroidx/room/G;)V", "", "createQuery", "()Ljava/lang/String;", "LB4/g;", "statement", "entity", "", "bind", "(LB4/g;Ljava/lang/Object;)V", "", "handle", "(Ljava/lang/Object;)I", "", "entities", "handleMultiple", "(Ljava/lang/Iterable;)I", "", "([Ljava/lang/Object;)I", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.room.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6264h<T> extends S {
    protected abstract void bind(B4.g statement, T entity);

    @Override // androidx.room.S
    protected abstract String createQuery();

    public final int handleMultiple(Iterable<? extends T> entities) {
        Intrinsics.j(entities, "entities");
        B4.g gVarAcquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            int iA0 = 0;
            while (it.hasNext()) {
                bind(gVarAcquire, it.next());
                iA0 += gVarAcquire.a0();
            }
            return iA0;
        } finally {
            release(gVarAcquire);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6264h(G database) {
        super(database);
        Intrinsics.j(database, "database");
    }

    public final int handle(T entity) {
        B4.g gVarAcquire = acquire();
        try {
            bind(gVarAcquire, entity);
            return gVarAcquire.a0();
        } finally {
            release(gVarAcquire);
        }
    }

    public final int handleMultiple(T[] entities) {
        Intrinsics.j(entities, "entities");
        B4.g gVarAcquire = acquire();
        try {
            int iA0 = 0;
            for (T t10 : entities) {
                bind(gVarAcquire, t10);
                iA0 += gVarAcquire.a0();
            }
            return iA0;
        } finally {
            release(gVarAcquire);
        }
    }
}
