package o2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lo2/g;", "", "T", "Lo2/f;", "", "maxPoolSize", "<init>", "(I)V", "instance", "", "c", "(Ljava/lang/Object;)Z", "b", "()Ljava/lang/Object;", "a", "", "[Ljava/lang/Object;", "pool", "I", "poolSize", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class g<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object[] pool;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int poolSize;

    private final boolean c(T instance) {
        int i10 = this.poolSize;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.pool[i11] == instance) {
                return true;
            }
        }
        return false;
    }

    @Override // o2.f
    public boolean a(T instance) {
        Intrinsics.j(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.poolSize;
        Object[] objArr = this.pool;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.poolSize = i10 + 1;
        return true;
    }

    @Override // o2.f
    public T b() {
        int i10 = this.poolSize;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        T t10 = (T) this.pool[i11];
        Intrinsics.h(t10, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.pool[i11] = null;
        this.poolSize--;
        return t10;
    }

    public g(int i10) {
        if (i10 > 0) {
            this.pool = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
