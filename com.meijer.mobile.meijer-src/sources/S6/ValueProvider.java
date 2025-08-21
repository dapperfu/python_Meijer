package S6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0015"}, d2 = {"LS6/g;", "T", "LS6/d;", "value", "<init>", "(Ljava/lang/Object;)V", "a", "()Ljava/lang/Object;", "get", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: S6.g, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ValueProvider<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T value;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ValueProvider) && Intrinsics.e(this.value, ((ValueProvider) other).value);
    }

    @Override // S6.d
    public T get() {
        return this.value;
    }

    public int hashCode() {
        T t10 = this.value;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public String toString() {
        return "ValueProvider(value=" + this.value + ')';
    }

    public ValueProvider(T t10) {
        this.value = t10;
    }

    @Override // S6.d
    public T a() {
        return get();
    }
}
