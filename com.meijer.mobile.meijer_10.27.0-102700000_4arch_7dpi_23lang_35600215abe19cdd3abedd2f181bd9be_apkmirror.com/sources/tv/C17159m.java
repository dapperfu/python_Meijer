package tv;

import kotlin.C17339g;
import kotlin.InterfaceC17347o;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import qv.C0;
import sv.EnumC17050a;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "Ltv/f;", "", "capacity", "Lsv/a;", "onBufferOverflow", "a", "(Ltv/f;ILsv/a;)Ltv/f;", "d", "(Ltv/f;)Ltv/f;", "Lkotlin/coroutines/CoroutineContext;", "context", "e", "(Ltv/f;Lkotlin/coroutines/CoroutineContext;)Ltv/f;", "", "c", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: tv.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final /* synthetic */ class C17159m {
    public static final <T> InterfaceC17152f<T> a(InterfaceC17152f<? extends T> interfaceC17152f, int i10, EnumC17050a enumC17050a) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && enumC17050a != EnumC17050a.f161240a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            enumC17050a = EnumC17050a.f161241b;
            i10 = 0;
        }
        int i11 = i10;
        EnumC17050a enumC17050a2 = enumC17050a;
        if (interfaceC17152f instanceof InterfaceC17347o) {
            return InterfaceC17347o.a.a((InterfaceC17347o) interfaceC17152f, null, i11, enumC17050a2, 1, null);
        }
        return new C17339g(interfaceC17152f, null, i11, enumC17050a2, 2, null);
    }

    public static final <T> InterfaceC17152f<T> d(InterfaceC17152f<? extends T> interfaceC17152f) {
        return b(interfaceC17152f, -1, null, 2, null);
    }

    public static /* synthetic */ InterfaceC17152f b(InterfaceC17152f interfaceC17152f, int i10, EnumC17050a enumC17050a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            enumC17050a = EnumC17050a.f161240a;
        }
        return C17154h.d(interfaceC17152f, i10, enumC17050a);
    }

    private static final void c(CoroutineContext coroutineContext) {
        if (coroutineContext.g(C0.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC17152f<T> e(InterfaceC17152f<? extends T> interfaceC17152f, CoroutineContext coroutineContext) {
        c(coroutineContext);
        if (Intrinsics.e(coroutineContext, EmptyCoroutineContext.f142646a)) {
            return interfaceC17152f;
        }
        if (interfaceC17152f instanceof InterfaceC17347o) {
            return InterfaceC17347o.a.a((InterfaceC17347o) interfaceC17152f, coroutineContext, 0, null, 6, null);
        }
        return new C17339g(interfaceC17152f, coroutineContext, 0, null, 12, null);
    }
}
