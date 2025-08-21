package B2;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LB2/e;", "T", "LB2/H;", "value", "", "hashCode", "version", "<init>", "(Ljava/lang/Object;II)V", "", "b", "()V", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "I", "getHashCode", "()I", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2908e<T> extends H<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int hashCode;

    public C2908e(T t10, int i10, int i11) {
        super(i11, null);
        this.value = t10;
        this.hashCode = i10;
    }

    public final void b() {
        T t10 = this.value;
        if ((t10 != null ? t10.hashCode() : 0) != this.hashCode) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final T c() {
        return this.value;
    }
}
