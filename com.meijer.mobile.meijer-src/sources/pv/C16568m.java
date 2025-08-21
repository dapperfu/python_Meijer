package pv;

import kotlin.C16775g;
import kotlin.InterfaceC16783o;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import mv.C0;
import ov.EnumC16325a;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "Lpv/f;", "", "capacity", "Lov/a;", "onBufferOverflow", "a", "(Lpv/f;ILov/a;)Lpv/f;", "d", "(Lpv/f;)Lpv/f;", "Lkotlin/coroutines/CoroutineContext;", "context", "e", "(Lpv/f;Lkotlin/coroutines/CoroutineContext;)Lpv/f;", "", "c", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: pv.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C16568m {
    public static final <T> InterfaceC16561f<T> a(InterfaceC16561f<? extends T> interfaceC16561f, int i10, EnumC16325a enumC16325a) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && enumC16325a != EnumC16325a.f155824a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            enumC16325a = EnumC16325a.f155825b;
            i10 = 0;
        }
        int i11 = i10;
        EnumC16325a enumC16325a2 = enumC16325a;
        if (interfaceC16561f instanceof InterfaceC16783o) {
            return InterfaceC16783o.a.a((InterfaceC16783o) interfaceC16561f, null, i11, enumC16325a2, 1, null);
        }
        return new C16775g(interfaceC16561f, null, i11, enumC16325a2, 2, null);
    }

    public static final <T> InterfaceC16561f<T> d(InterfaceC16561f<? extends T> interfaceC16561f) {
        return b(interfaceC16561f, -1, null, 2, null);
    }

    public static /* synthetic */ InterfaceC16561f b(InterfaceC16561f interfaceC16561f, int i10, EnumC16325a enumC16325a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            enumC16325a = EnumC16325a.f155824a;
        }
        return C16563h.d(interfaceC16561f, i10, enumC16325a);
    }

    private static final void c(CoroutineContext coroutineContext) {
        if (coroutineContext.g(C0.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC16561f<T> e(InterfaceC16561f<? extends T> interfaceC16561f, CoroutineContext coroutineContext) {
        c(coroutineContext);
        if (Intrinsics.e(coroutineContext, EmptyCoroutineContext.f143553a)) {
            return interfaceC16561f;
        }
        if (interfaceC16561f instanceof InterfaceC16783o) {
            return InterfaceC16783o.a.a((InterfaceC16783o) interfaceC16561f, coroutineContext, 0, null, 6, null);
        }
        return new C16775g(interfaceC16561f, coroutineContext, 0, null, 12, null);
    }
}
