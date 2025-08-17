package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import qv.C16623P;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000eR5\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/X;", "Landroidx/compose/runtime/N0;", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "Lkotlin/Function2;", "Lqv/O;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "task", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "b", "()V", "f", "e", "a", "Lkotlin/jvm/functions/Function2;", "Lqv/O;", "scope", "Lqv/C0;", "c", "Lqv/C0;", "job", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X implements N0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function2<InterfaceC16622O, Continuation<? super Unit>, Object> task;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O scope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private qv.C0 job;

    @Override // androidx.compose.runtime.N0
    public void b() {
        qv.C0 c02 = this.job;
        if (c02 != null) {
            qv.F0.f(c02, "Old job was still running!", null, 2, null);
        }
        this.job = C16648k.d(this.scope, null, null, this.task, 3, null);
    }

    @Override // androidx.compose.runtime.N0
    public void e() {
        qv.C0 c02 = this.job;
        if (c02 != null) {
            c02.d(new Z());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.N0
    public void f() {
        qv.C0 c02 = this.job;
        if (c02 != null) {
            c02.d(new Z());
        }
        this.job = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X(CoroutineContext coroutineContext, Function2<? super InterfaceC16622O, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.task = function2;
        this.scope = C16623P.a(coroutineContext);
    }
}
