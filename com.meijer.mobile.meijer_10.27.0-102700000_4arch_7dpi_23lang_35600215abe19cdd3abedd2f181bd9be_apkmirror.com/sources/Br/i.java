package Br;

import H1.y;
import f1.C13832e;
import f1.InterfaceC13828a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l0.C15339A;
import l0.InterfaceC15349i;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LBr/i;", "Lf1/a;", "LBr/j;", "state", "Ll0/A;", "listState", "Lkotlin/Function0;", "", "scrollTo", "<init>", "(LBr/j;Ll0/A;Lkotlin/jvm/functions/Function0;)V", "LU0/f;", "a", "()J", "available", "Lf1/e;", "source", "E1", "(JI)J", "consumed", "L0", "(JJI)J", "LH1/y;", "b0", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LBr/j;", "b", "Ll0/A;", "c", "Lkotlin/jvm/functions/Function0;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements InterfaceC13828a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15339A listState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> scrollTo;

    public i(j state, C15339A listState, Function0<Unit> scrollTo) {
        Intrinsics.j(state, "state");
        Intrinsics.j(listState, "listState");
        Intrinsics.j(scrollTo, "scrollTo");
        this.state = state;
        this.listState = listState;
        this.scrollTo = scrollTo;
    }

    private final long a() {
        this.state.c().setValue(Boolean.TRUE);
        return U0.f.INSTANCE.c();
    }

    @Override // f1.InterfaceC13828a
    public long E1(long available, int source) {
        return C13832e.f(source, C13832e.INSTANCE.a()) ? a() : U0.f.INSTANCE.c();
    }

    @Override // f1.InterfaceC13828a
    public long L0(long consumed, long available, int source) {
        return C13832e.f(source, C13832e.INSTANCE.a()) ? a() : U0.f.INSTANCE.c();
    }

    @Override // f1.InterfaceC13828a
    public Object b0(long j10, long j11, Continuation<? super y> continuation) {
        long jA;
        if (this.state.c().getValue().booleanValue()) {
            this.state.e((InterfaceC15349i) CollectionsKt.u0(this.listState.x().h()));
            this.scrollTo.invoke();
            jA = y.INSTANCE.a();
        } else {
            jA = y.INSTANCE.a();
        }
        y yVarB = y.b(jA);
        yVarB.getPackedValue();
        this.state.c().setValue(Boxing.a(false));
        return yVarB;
    }
}
