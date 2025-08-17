package t4;

import androidx.room.X;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s4.InterfaceC16865b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, d2 = {"Lt4/b;", "Ls4/b;", "Lt4/c;", "supportDriver", "<init>", "(Lt4/c;)V", "R", "", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/X;", "Lkotlin/coroutines/Continuation;", "", "block", "o0", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "a", "Lt4/c;", "b", "()Lt4/c;", "Lt4/d;", "()Lt4/d;", "supportConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: t4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17060b implements InterfaceC16865b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17061c supportDriver;

    public C17060b(C17061c supportDriver) {
        Intrinsics.j(supportDriver, "supportDriver");
        this.supportDriver = supportDriver;
    }

    private final C17062d a() {
        String name = this.supportDriver.getOpenHelper().getName();
        if (name == null) {
            name = ":memory:";
        }
        return new C17062d(this.supportDriver.a(name));
    }

    /* renamed from: b, reason: from getter */
    public final C17061c getSupportDriver() {
        return this.supportDriver;
    }

    @Override // s4.InterfaceC16865b, java.lang.AutoCloseable
    public void close() {
        this.supportDriver.getOpenHelper().close();
    }

    @Override // s4.InterfaceC16865b
    public <R> Object o0(boolean z10, Function2<? super X, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return function2.invoke(a(), continuation);
    }
}
