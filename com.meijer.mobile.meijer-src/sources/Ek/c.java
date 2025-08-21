package Ek;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LEk/c;", "LEk/b;", "oldState", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes8.dex */
public final class c extends b<Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Object> f7734b;

    public c(Function1<Object, Object> function1) {
        this.f7734b = function1;
    }

    @Override // Ek.b
    public Object b(Object oldState) {
        return this.f7734b.invoke(oldState);
    }
}
