package kotlin;

import d0.EnumC13564E;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lf0/H;", "", "Ld0/E;", "scrollPriority", "Lkotlin/Function2;", "Lf0/E;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "f", "(F)F", "", "b", "()Z", "isScrollInProgress", "e", "canScrollForward", "d", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC13900H {
    Object a(EnumC13564E enumC13564E, Function2<? super InterfaceC13897E, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation);

    boolean b();

    default boolean d() {
        return true;
    }

    default boolean e() {
        return true;
    }

    float f(float delta);

    static /* synthetic */ Object c(InterfaceC13900H interfaceC13900H, EnumC13564E enumC13564E, Function2 function2, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i10 & 1) != 0) {
            enumC13564E = EnumC13564E.f127647a;
        }
        return interfaceC13900H.a(enumC13564E, function2, continuation);
    }
}
