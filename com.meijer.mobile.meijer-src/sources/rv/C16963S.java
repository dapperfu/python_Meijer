package rv;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import mv.Y0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lrv/S;", "", "Lkotlin/coroutines/CoroutineContext;", "context", "", "n", "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "Lmv/Y0;", "element", "value", "", "a", "(Lmv/Y0;Ljava/lang/Object;)V", "b", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/CoroutineContext;", "", "[Ljava/lang/Object;", "values", "c", "[Lmv/Y0;", "elements", "d", "I", "i", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rv.S, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C16963S {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final CoroutineContext context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] values;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Y0<Object>[] elements;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int i;

    public final void a(Y0<?> element, Object value) {
        Object[] objArr = this.values;
        int i10 = this.i;
        objArr[i10] = value;
        Y0<Object>[] y0Arr = this.elements;
        this.i = i10 + 1;
        Intrinsics.h(element, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        y0Arr[i10] = element;
    }

    public final void b(CoroutineContext context) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            Y0<Object> y02 = this.elements[length];
            Intrinsics.g(y02);
            y02.Y(context, this.values[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    public C16963S(CoroutineContext coroutineContext, int i10) {
        this.context = coroutineContext;
        this.values = new Object[i10];
        this.elements = new Y0[i10];
    }
}
