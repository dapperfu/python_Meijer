package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0002\u0018\u0000 \u001b*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u001cB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "a", "()Z", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "", "b", "Ljava/lang/Object;", "_value", "c", "getFinal$annotations", "()V", "final", "getValue", "()Ljava/lang/Object;", "value", "d", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SafePublicationLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f143301e = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private volatile Function0<? extends T> initializer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Object _value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object final;

    public SafePublicationLazyImpl(Function0<? extends T> initializer) {
        Intrinsics.j(initializer, "initializer");
        this.initializer = initializer;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f143323a;
        this._value = uninitialized_value;
        this.final = uninitialized_value;
    }

    @Override // kotlin.Lazy
    public boolean a() {
        return this._value != UNINITIALIZED_VALUE.f143323a;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t10 = (T) this._value;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f143323a;
        if (t10 != uninitialized_value) {
            return t10;
        }
        Function0<? extends T> function0 = this.initializer;
        if (function0 != null) {
            T tInvoke = function0.invoke();
            if (androidx.concurrent.futures.b.a(f143301e, this, uninitialized_value, tInvoke)) {
                this.initializer = null;
                return tInvoke;
            }
        }
        return (T) this._value;
    }

    public String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
