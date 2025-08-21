package ov;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.UndeliveredElementException;
import ov.k;
import rv.C16987x;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lov/q;", "E", "Lov/e;", "", "capacity", "Lov/a;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILov/a;Lkotlin/jvm/functions/Function1;)V", "element", "", "isSendOp", "Lov/k;", "w1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "v1", "r", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "m", "I", "n", "Lov/a;", "A0", "()Z", "isConflatedDropOldest", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class q<E> extends e<E> {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final EnumC16325a onBufferOverflow;

    static /* synthetic */ <E> Object u1(q<E> qVar, E e10, Continuation<? super Unit> continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionC;
        Object objW1 = qVar.w1(e10, true);
        if (!(objW1 instanceof k.Closed)) {
            return Unit.f143329a;
        }
        k.e(objW1);
        Function1<E, Unit> function1 = qVar.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionC = C16987x.c(function1, e10, null, 2, null)) == null) {
            throw qVar.m0();
        }
        ExceptionsKt.a(undeliveredElementExceptionC, qVar.m0());
        throw undeliveredElementExceptionC;
    }

    @Override // ov.e, ov.w
    public Object k(E element) {
        return w1(element, false);
    }

    private final Object w1(E element, boolean isSendOp) {
        return this.onBufferOverflow == EnumC16325a.f155826c ? v1(element, isSendOp) : k1(element);
    }

    @Override // ov.e
    protected boolean A0() {
        return this.onBufferOverflow == EnumC16325a.f155825b;
    }

    public q(int i10, EnumC16325a enumC16325a, Function1<? super E, Unit> function1) {
        super(i10, function1);
        this.capacity = i10;
        this.onBufferOverflow = enumC16325a;
        if (enumC16325a != EnumC16325a.f155824a) {
            if (i10 >= 1) {
                return;
            }
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.b(e.class).u() + " instead").toString());
    }

    private final Object v1(E element, boolean isSendOp) {
        Function1<E, Unit> function1;
        UndeliveredElementException undeliveredElementExceptionC;
        Object objK = super.k(element);
        if (!k.i(objK) && !k.h(objK)) {
            if (isSendOp && (function1 = this.onUndeliveredElement) != null && (undeliveredElementExceptionC = C16987x.c(function1, element, null, 2, null)) != null) {
                throw undeliveredElementExceptionC;
            }
            return k.INSTANCE.c(Unit.f143329a);
        }
        return objK;
    }

    @Override // ov.e, ov.w
    public Object r(E e10, Continuation<? super Unit> continuation) {
        return u1(this, e10, continuation);
    }
}
