package kotlin;

import java.io.Serializable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/InitializedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "<init>", "(Ljava/lang/Object;)V", "", "a", "()Z", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InitializedLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    @Override // kotlin.Lazy
    public boolean a() {
        return true;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        return this.value;
    }

    public InitializedLazyImpl(T t10) {
        this.value = t10;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
