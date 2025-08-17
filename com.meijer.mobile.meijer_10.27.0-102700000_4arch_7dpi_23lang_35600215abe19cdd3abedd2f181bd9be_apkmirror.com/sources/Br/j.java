package Br;

import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import l0.C15339A;
import l0.InterfaceC15349i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001c"}, d2 = {"LBr/j;", "", "<init>", "()V", "Ll0/i;", "itemPos", "", "e", "(Ll0/i;)V", "Ll0/A;", "listState", "", "position", "d", "(Ll0/A;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/l0;", "", "a", "Landroidx/compose/runtime/l0;", "c", "()Landroidx/compose/runtime/l0;", "isSwiping", "Landroidx/compose/runtime/j0;", "b", "Landroidx/compose/runtime/j0;", "()Landroidx/compose/runtime/j0;", "firstVisibleItemIndex", "offsetInfo", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<Boolean> isSwiping = t1.e(Boolean.FALSE, null, 2, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5726j0 firstVisibleItemIndex = C5702c1.a(0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5726j0 offsetInfo = C5702c1.a(0);

    public final Object d(C15339A c15339a, int i10, Continuation<? super Unit> continuation) {
        Object objL = C15339A.l(c15339a, i10, 0, continuation, 2, null);
        return objL == IntrinsicsKt.f() ? objL : Unit.f142422a;
    }

    /* renamed from: a, reason: from getter */
    public final InterfaceC5726j0 getFirstVisibleItemIndex() {
        return this.firstVisibleItemIndex;
    }

    /* renamed from: b, reason: from getter */
    public final InterfaceC5726j0 getOffsetInfo() {
        return this.offsetInfo;
    }

    public final InterfaceC5730l0<Boolean> c() {
        return this.isSwiping;
    }

    public final void e(InterfaceC15349i itemPos) {
        if (itemPos != null) {
            this.offsetInfo.j(itemPos.getOffset());
            this.firstVisibleItemIndex.j(itemPos.getIndex());
        }
    }
}
