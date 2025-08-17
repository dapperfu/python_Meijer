package Ls;

import Js.WeeklyAdPublication;
import Tq.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\b\u0002\u0010\n\u001a\u00060\bj\u0002`\tH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LLs/c;", "", "LTq/j;", "storeProvider", "LKs/b;", "dataSource", "<init>", "(LTq/j;LKs/b;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "LJs/e;", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LTq/j;", "b", "LKs/b;", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ks.b dataSource;

    public c(j storeProvider, Ks.b dataSource) {
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(dataSource, "dataSource");
        this.storeProvider = storeProvider;
        this.dataSource = dataSource;
    }

    public static /* synthetic */ Object b(c cVar, int i10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cVar.storeProvider.b();
        }
        return cVar.a(i10, continuation);
    }

    public final Object a(int i10, Continuation<? super List<WeeklyAdPublication>> continuation) {
        return this.dataSource.g(i10, continuation);
    }
}
