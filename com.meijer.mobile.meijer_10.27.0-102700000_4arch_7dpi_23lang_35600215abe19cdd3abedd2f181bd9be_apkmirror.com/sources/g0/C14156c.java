package g0;

import kotlin.C6329l;
import kotlin.C6330m;
import kotlin.InterfaceC13787E;
import kotlin.InterfaceC6342y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JW\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lg0/c;", "Lg0/b;", "", "Lc0/m;", "Lc0/y;", "decayAnimationSpec", "<init>", "(Lc0/y;)V", "Lf0/E;", "scope", "offset", "velocity", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "delta", "", "onAnimationStep", "Lg0/a;", "b", "(Lf0/E;FFLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lc0/y;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C14156c implements InterfaceC14155b<Float, C6330m> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6342y<Float> decayAnimationSpec;

    @Override // g0.InterfaceC14155b
    public /* bridge */ /* synthetic */ Object a(InterfaceC13787E interfaceC13787E, Float f10, Float f11, Function1<? super Float, Unit> function1, Continuation continuation) {
        return b(interfaceC13787E, f10.floatValue(), f11.floatValue(), function1, continuation);
    }

    public Object b(InterfaceC13787E interfaceC13787E, float f10, float f11, Function1<? super Float, Unit> function1, Continuation<? super C14154a<Float, C6330m>> continuation) {
        Object objF = C14162i.f(interfaceC13787E, f10, C6329l.c(0.0f, f11, 0L, 0L, false, 28, null), this.decayAnimationSpec, function1, continuation);
        return objF == IntrinsicsKt.f() ? objF : (C14154a) objF;
    }

    public C14156c(InterfaceC6342y<Float> interfaceC6342y) {
        this.decayAnimationSpec = interfaceC6342y;
    }
}
