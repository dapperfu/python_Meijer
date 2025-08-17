package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.PublishedApi;
import qv.C16623P;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/v;", "Landroidx/compose/runtime/N0;", "Lqv/O;", "coroutineScope", "<init>", "(Lqv/O;)V", "", "b", "()V", "f", "e", "a", "Lqv/O;", "()Lqv/O;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
/* renamed from: androidx.compose.runtime.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5748v implements N0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    @Override // androidx.compose.runtime.N0
    public void b() {
    }

    /* renamed from: a, reason: from getter */
    public final InterfaceC16622O getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.N0
    public void e() {
        InterfaceC16622O interfaceC16622O = this.coroutineScope;
        if (interfaceC16622O instanceof P0) {
            ((P0) interfaceC16622O).a();
        } else {
            C16623P.d(interfaceC16622O, new Z());
        }
    }

    @Override // androidx.compose.runtime.N0
    public void f() {
        InterfaceC16622O interfaceC16622O = this.coroutineScope;
        if (interfaceC16622O instanceof P0) {
            ((P0) interfaceC16622O).a();
        } else {
            C16623P.d(interfaceC16622O, new Z());
        }
    }

    public C5748v(InterfaceC16622O interfaceC16622O) {
        this.coroutineScope = interfaceC16622O;
    }
}
