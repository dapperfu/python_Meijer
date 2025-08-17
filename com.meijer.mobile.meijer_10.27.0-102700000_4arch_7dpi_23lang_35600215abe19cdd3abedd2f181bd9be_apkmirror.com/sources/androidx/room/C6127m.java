package androidx.room;

import androidx.view.AbstractC5985A;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00062\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R$\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/room/m;", "", "Landroidx/room/G;", "database", "<init>", "(Landroidx/room/G;)V", "T", "", "", "tableNames", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callableFunction", "Landroidx/lifecycle/A;", "a", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/A;", "liveData", "", "b", "(Landroidx/lifecycle/A;)V", "c", "Landroidx/room/G;", "", "Ljava/util/Set;", "getLiveDataSet$room_runtime_release", "()Ljava/util/Set;", "liveDataSet", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.room.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6127m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G database;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<AbstractC5985A<?>> liveDataSet;

    public C6127m(G database) {
        Intrinsics.j(database, "database");
        this.database = database;
        Set<AbstractC5985A<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.i(setNewSetFromMap, "newSetFromMap(...)");
        this.liveDataSet = setNewSetFromMap;
    }

    public final <T> AbstractC5985A<T> a(String[] tableNames, boolean inTransaction, Callable<T> callableFunction) {
        Intrinsics.j(tableNames, "tableNames");
        Intrinsics.j(callableFunction, "callableFunction");
        return new C6137x(this.database, this, inTransaction, tableNames, callableFunction);
    }

    public final void b(AbstractC5985A<?> liveData) {
        Intrinsics.j(liveData, "liveData");
        this.liveDataSet.add(liveData);
    }

    public final void c(AbstractC5985A<?> liveData) {
        Intrinsics.j(liveData, "liveData");
        this.liveDataSet.remove(liveData);
    }
}
