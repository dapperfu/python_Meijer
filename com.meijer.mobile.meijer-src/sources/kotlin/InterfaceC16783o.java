package kotlin;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import ov.EnumC16325a;
import pv.InterfaceC16561f;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqv/o;", "T", "Lpv/f;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lov/a;", "onBufferOverflow", "a", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)Lpv/f;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC16783o<T> extends InterfaceC16561f<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qv.o$a */
    public static final class a {
        public static /* synthetic */ InterfaceC16561f a(InterfaceC16783o interfaceC16783o, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.f143553a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                enumC16325a = EnumC16325a.f155824a;
            }
            return interfaceC16783o.a(coroutineContext, i10, enumC16325a);
        }
    }

    InterfaceC16561f<T> a(CoroutineContext context, int capacity, EnumC16325a onBufferOverflow);
}
