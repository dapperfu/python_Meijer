package J0;

import androidx.compose.runtime.N0;
import androidx.compose.runtime.O0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"LJ0/e;", "Landroidx/compose/runtime/N0;", "", "b", "()V", "f", "e", "", "a", "Ljava/util/Set;", "abandoning", "LD0/c;", "Landroidx/compose/runtime/O0;", "LD0/c;", "()LD0/c;", "pausedRemembers", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e implements N0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<N0> abandoning;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D0.c<O0> pausedRemembers;

    @Override // androidx.compose.runtime.N0
    public void e() {
    }

    @Override // androidx.compose.runtime.N0
    public void f() {
    }

    public final D0.c<O0> a() {
        return this.pausedRemembers;
    }

    @Override // androidx.compose.runtime.N0
    public void b() {
        D0.c<O0> cVar = this.pausedRemembers;
        O0[] o0Arr = cVar.content;
        int size = cVar.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            N0 wrapped = o0Arr[i10].getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.b();
        }
    }
}
