package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/room/x;", "T", "Landroidx/room/O;", "Landroidx/room/G;", "database", "Landroidx/room/m;", "container", "", "inTransaction", "", "", "tableNames", "Ljava/util/concurrent/Callable;", "callableFunction", "<init>", "(Landroidx/room/G;Landroidx/room/m;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)V", "r", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/util/concurrent/Callable;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.room.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6279x<T> extends O<T> {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Callable<T> callableFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6279x(G database, C6269m container, boolean z10, String[] tableNames, Callable<T> callableFunction) {
        super(database, container, z10, tableNames, null);
        Intrinsics.j(database, "database");
        Intrinsics.j(container, "container");
        Intrinsics.j(tableNames, "tableNames");
        Intrinsics.j(callableFunction, "callableFunction");
        this.callableFunction = callableFunction;
    }

    @Override // androidx.room.O
    public Object r(Continuation<? super T> continuation) {
        return this.callableFunction.call();
    }
}
