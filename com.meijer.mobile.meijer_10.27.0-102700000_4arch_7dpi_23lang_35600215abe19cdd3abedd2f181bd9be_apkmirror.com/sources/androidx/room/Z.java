package androidx.room;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z4.InterfaceC18382d;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/v;", "", "sql", "", "b", "(Landroidx/room/v;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Z {
    public static final Object b(InterfaceC6135v interfaceC6135v, String str, Continuation<? super Unit> continuation) {
        Object objD = interfaceC6135v.d(str, new Function1() { // from class: androidx.room.Y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Z.c((InterfaceC18382d) obj));
            }
        }, continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(InterfaceC18382d it) {
        Intrinsics.j(it, "it");
        return it.N3();
    }
}
