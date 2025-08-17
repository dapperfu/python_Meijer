package Qs;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\n\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"LQs/r;", "T", "", "Lkotlin/Function0;", "factory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "a", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "b", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Lkotlin/jvm/functions/Function0;", "getFactory", "()Lkotlin/jvm/functions/Function0;", "", "Z", "hasBeenRetrieved", "c", "Ljava/lang/Object;", "instance", "d", "lock", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<T> factory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile boolean hasBeenRetrieved;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile T instance;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX WARN: Multi-variable type inference failed */
    public r(Function0<? extends T> factory) {
        Intrinsics.j(factory, "factory");
        this.factory = factory;
        this.lock = new Object();
    }

    public final T a(Object thisRef, KProperty<?> property) {
        Intrinsics.j(property, "property");
        this.hasBeenRetrieved = true;
        T t10 = this.instance;
        if (t10 != null) {
            return t10;
        }
        synchronized (this.lock) {
            T t11 = this.instance;
            if (t11 != null) {
                return t11;
            }
            T tInvoke = this.factory.invoke();
            this.instance = tInvoke;
            return tInvoke;
        }
    }

    public final void b(Object thisRef, KProperty<?> property, T value) {
        Intrinsics.j(property, "property");
        synchronized (this.lock) {
            if (this.hasBeenRetrieved) {
                throw new IllegalStateException(property.getName() + " was already accessed, and can't be set.");
            }
            this.instance = value;
            Unit unit = Unit.f142422a;
        }
    }
}
