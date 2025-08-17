package y6;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y6.w;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ly6/r;", "Ly6/w;", "<init>", "()V", "Ly6/w$b;", "E", "Ly6/w$c;", "key", "c", "(Ly6/w$c;)Ly6/w$b;", "R", "initial", "Lkotlin/Function2;", "operation", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "f", "(Ly6/w;)Ly6/w;", "a", "(Ly6/w$c;)Ly6/w;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r implements w {

    /* renamed from: c, reason: collision with root package name */
    public static final r f170313c = new r();

    @Override // y6.w
    public w a(w.c<?> key) {
        Intrinsics.j(key, "key");
        return this;
    }

    @Override // y6.w
    public <R> R b(R initial, Function2<? super R, ? super w.b, ? extends R> operation) {
        Intrinsics.j(operation, "operation");
        return initial;
    }

    @Override // y6.w
    public <E extends w.b> E c(w.c<E> key) {
        Intrinsics.j(key, "key");
        return null;
    }

    @Override // y6.w
    public w f(w context) {
        Intrinsics.j(context, "context");
        return context;
    }

    private r() {
    }
}
