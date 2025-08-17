package kotlin;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import sv.EnumC17050a;
import tv.InterfaceC17152f;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luv/o;", "T", "Ltv/f;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lsv/a;", "onBufferOverflow", "a", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)Ltv/f;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uv.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC17347o<T> extends InterfaceC17152f<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uv.o$a */
    public static final class a {
        public static /* synthetic */ InterfaceC17152f a(InterfaceC17347o interfaceC17347o, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.f142646a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                enumC17050a = EnumC17050a.f161240a;
            }
            return interfaceC17347o.a(coroutineContext, i10, enumC17050a);
        }
    }

    InterfaceC17152f<T> a(CoroutineContext context, int capacity, EnumC17050a onBufferOverflow);
}
