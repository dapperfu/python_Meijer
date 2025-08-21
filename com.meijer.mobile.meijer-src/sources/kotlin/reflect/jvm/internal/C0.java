package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\fR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0011\u0010\u0005¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/C0;", "", "Ljava/lang/ClassLoader;", "classLoader", "<init>", "(Ljava/lang/ClassLoader;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "ref", "b", "I", "getIdentityHashCode", "identityHashCode", "c", "Ljava/lang/ClassLoader;", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "temporaryStrongRef", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final class C0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<ClassLoader> ref;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int identityHashCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ClassLoader temporaryStrongRef;

    public C0(ClassLoader classLoader) {
        Intrinsics.j(classLoader, "classLoader");
        this.ref = new WeakReference<>(classLoader);
        this.identityHashCode = System.identityHashCode(classLoader);
        this.temporaryStrongRef = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.temporaryStrongRef = classLoader;
    }

    public boolean equals(Object other) {
        return (other instanceof C0) && this.ref.get() == ((C0) other).ref.get();
    }

    /* renamed from: hashCode, reason: from getter */
    public int getIdentityHashCode() {
        return this.identityHashCode;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = this.ref.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
