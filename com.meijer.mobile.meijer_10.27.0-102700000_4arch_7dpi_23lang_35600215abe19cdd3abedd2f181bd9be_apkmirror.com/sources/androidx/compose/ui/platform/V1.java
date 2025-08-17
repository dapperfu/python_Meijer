package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/V1;", "T", "", "<init>", "()V", "", "a", "element", "c", "(Ljava/lang/Object;)V", "b", "()Ljava/lang/Object;", "LD0/c;", "Ljava/lang/ref/Reference;", "LD0/c;", "values", "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class V1<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D0.c<Reference<T>> values = new D0.c<>(new Reference[16], 0);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void a() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.referenceQueue.poll();
            if (referencePoll != null) {
                this.values.s(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final T b() {
        a();
        while (this.values.getSize() != 0) {
            T t10 = this.values.u(r0.getSize() - 1).get();
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public final void c(T element) {
        a();
        this.values.c(new WeakReference(element, this.referenceQueue));
    }
}
