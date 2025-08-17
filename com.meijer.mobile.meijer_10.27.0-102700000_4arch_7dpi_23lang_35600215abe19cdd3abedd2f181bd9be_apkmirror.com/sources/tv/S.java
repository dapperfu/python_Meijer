package tv;

import kotlin.C17350r;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import sv.EnumC17050a;
import vv.C17631E;

@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "value", "Ltv/B;", "a", "(Ljava/lang/Object;)Ltv/B;", "Ltv/P;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lsv/a;", "onBufferOverflow", "Ltv/f;", "d", "(Ltv/P;Lkotlin/coroutines/CoroutineContext;ILsv/a;)Ltv/f;", "Lvv/E;", "Lvv/E;", "NONE", "b", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private static final C17631E f162167a = new C17631E("NONE");

    /* renamed from: b, reason: collision with root package name */
    private static final C17631E f162168b = new C17631E("PENDING");

    public static final <T> InterfaceC17140B<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) C17350r.f163603a;
        }
        return new Q(t10);
    }

    public static final <T> InterfaceC17152f<T> d(P<? extends T> p10, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || enumC17050a != EnumC17050a.f161241b) ? C17146H.e(p10, coroutineContext, i10, enumC17050a) : p10;
    }
}
