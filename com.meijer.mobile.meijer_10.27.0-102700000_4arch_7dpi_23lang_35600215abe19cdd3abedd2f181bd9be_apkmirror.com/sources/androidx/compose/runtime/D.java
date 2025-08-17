package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bR%\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/D;", "Landroidx/compose/runtime/N0;", "Lkotlin/Function1;", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "Lkotlin/ExtensionFunctionType;", "effect", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "b", "()V", "f", "e", "a", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/E;", "onDispose", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class D implements N0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<F, E> effect;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private E onDispose;

    @Override // androidx.compose.runtime.N0
    public void e() {
    }

    @Override // androidx.compose.runtime.N0
    public void b() {
        this.onDispose = this.effect.invoke(J.f50001a);
    }

    @Override // androidx.compose.runtime.N0
    public void f() {
        E e10 = this.onDispose;
        if (e10 != null) {
            e10.dispose();
        }
        this.onDispose = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D(Function1<? super F, ? extends E> function1) {
        this.effect = function1;
    }
}
