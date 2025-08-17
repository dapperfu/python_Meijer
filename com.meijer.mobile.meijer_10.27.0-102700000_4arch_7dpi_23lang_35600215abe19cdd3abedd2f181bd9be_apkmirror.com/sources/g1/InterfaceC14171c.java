package g1;

import androidx.compose.ui.platform.Q1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.jvm.functions.Function2;

@RestrictsSuspension
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JI\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"Lg1/c;", "LH1/d;", "Lg1/s;", "pass", "Lg1/q;", "K0", "(Lg1/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "i0", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "H0", "LH1/r;", "c", "()J", "size", "LU0/k;", "A0", "extendedTouchPadding", "a1", "()Lg1/q;", "currentEvent", "Landroidx/compose/ui/platform/Q1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC14171c extends H1.d {
    Object K0(EnumC14186s enumC14186s, Continuation<? super C14185q> continuation);

    C14185q a1();

    long c();

    Q1 getViewConfiguration();

    static /* synthetic */ Object G1(InterfaceC14171c interfaceC14171c, EnumC14186s enumC14186s, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            enumC14186s = EnumC14186s.f132679b;
        }
        return interfaceC14171c.K0(enumC14186s, continuation);
    }

    default long A0() {
        return U0.k.INSTANCE.b();
    }

    static /* synthetic */ <T> Object Y0(InterfaceC14171c interfaceC14171c, long j10, Function2<? super InterfaceC14171c, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return function2.invoke(interfaceC14171c, continuation);
    }

    static /* synthetic */ <T> Object f0(InterfaceC14171c interfaceC14171c, long j10, Function2<? super InterfaceC14171c, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return function2.invoke(interfaceC14171c, continuation);
    }

    default <T> Object H0(long j10, Function2<? super InterfaceC14171c, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return Y0(this, j10, function2, continuation);
    }

    default <T> Object i0(long j10, Function2<? super InterfaceC14171c, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return f0(this, j10, function2, continuation);
    }
}
