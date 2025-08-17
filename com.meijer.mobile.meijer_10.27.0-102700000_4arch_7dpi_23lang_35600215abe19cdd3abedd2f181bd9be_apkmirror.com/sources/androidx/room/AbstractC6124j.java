package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Deprecated
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H$¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\r\u0010\u0011J\u001b\u0010\r\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0019\u0010\u001bJ#\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u001c\u0010\u001eJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b \u0010!J!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b \u0010\"¨\u0006#"}, d2 = {"Landroidx/room/j;", "T", "Landroidx/room/S;", "Landroidx/room/G;", "database", "<init>", "(Landroidx/room/G;)V", "LA4/g;", "statement", "entity", "", "bind", "(LA4/g;Ljava/lang/Object;)V", "insert", "(Ljava/lang/Object;)V", "", "entities", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "", "insertAndReturnId", "(Ljava/lang/Object;)J", "", "", "insertAndReturnIdsArray", "(Ljava/util/Collection;)[J", "([Ljava/lang/Object;)[J", "insertAndReturnIdsArrayBox", "(Ljava/util/Collection;)[Ljava/lang/Long;", "([Ljava/lang/Object;)[Ljava/lang/Long;", "", "insertAndReturnIdsList", "([Ljava/lang/Object;)Ljava/util/List;", "(Ljava/util/Collection;)Ljava/util/List;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.room.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6124j<T> extends S {
    protected abstract void bind(A4.g statement, T entity);

    public final void insert(T entity) {
        A4.g gVarAcquire = acquire();
        try {
            bind(gVarAcquire, entity);
            gVarAcquire.G1();
        } finally {
            release(gVarAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> entities) {
        Intrinsics.j(entities, "entities");
        A4.g gVarAcquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i10 = 0;
            for (T t10 : entities) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.w();
                }
                bind(gVarAcquire, t10);
                jArr[i10] = gVarAcquire.G1();
                i10 = i11;
            }
            release(gVarAcquire);
            return jArr;
        } catch (Throwable th2) {
            release(gVarAcquire);
            throw th2;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> entities) {
        Intrinsics.j(entities, "entities");
        A4.g gVarAcquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                bind(gVarAcquire, it.next());
                lArr[i10] = Long.valueOf(gVarAcquire.G1());
            }
            return lArr;
        } finally {
            release(gVarAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] entities) {
        Intrinsics.j(entities, "entities");
        A4.g gVarAcquire = acquire();
        try {
            List listC = CollectionsKt.c();
            for (T t10 : entities) {
                bind(gVarAcquire, t10);
                listC.add(Long.valueOf(gVarAcquire.G1()));
            }
            List<Long> listA = CollectionsKt.a(listC);
            release(gVarAcquire);
            return listA;
        } catch (Throwable th2) {
            release(gVarAcquire);
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6124j(G database) {
        super(database);
        Intrinsics.j(database, "database");
    }

    public final long insertAndReturnId(T entity) {
        A4.g gVarAcquire = acquire();
        try {
            bind(gVarAcquire, entity);
            return gVarAcquire.G1();
        } finally {
            release(gVarAcquire);
        }
    }

    public final void insert(T[] entities) {
        Intrinsics.j(entities, "entities");
        A4.g gVarAcquire = acquire();
        try {
            for (T t10 : entities) {
                bind(gVarAcquire, t10);
                gVarAcquire.G1();
            }
        } finally {
            release(gVarAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] entities) {
        Intrinsics.j(entities, "entities");
        A4.g gVarAcquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                bind(gVarAcquire, entities[i10]);
                jArr[i11] = gVarAcquire.G1();
                i10++;
                i11 = i12;
            }
            return jArr;
        } finally {
            release(gVarAcquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(T[] entities) {
        Intrinsics.j(entities, "entities");
        A4.g gVarAcquire = acquire();
        Iterator itA = ArrayIteratorKt.a(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bind(gVarAcquire, itA.next());
                lArr[i10] = Long.valueOf(gVarAcquire.G1());
            }
            return lArr;
        } finally {
            release(gVarAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> entities) {
        Intrinsics.j(entities, "entities");
        A4.g gVarAcquire = acquire();
        try {
            List listC = CollectionsKt.c();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(gVarAcquire, it.next());
                listC.add(Long.valueOf(gVarAcquire.G1()));
            }
            List<Long> listA = CollectionsKt.a(listC);
            release(gVarAcquire);
            return listA;
        } catch (Throwable th2) {
            release(gVarAcquire);
            throw th2;
        }
    }

    public final void insert(Iterable<? extends T> entities) {
        Intrinsics.j(entities, "entities");
        A4.g gVarAcquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(gVarAcquire, it.next());
                gVarAcquire.G1();
            }
        } finally {
            release(gVarAcquire);
        }
    }
}
