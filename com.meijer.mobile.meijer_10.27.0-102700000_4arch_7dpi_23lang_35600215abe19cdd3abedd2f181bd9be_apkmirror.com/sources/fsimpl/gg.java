package fsimpl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
final class gg extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    int f132325a;

    /* renamed from: b, reason: collision with root package name */
    boolean f132326b;

    /* renamed from: c, reason: collision with root package name */
    int f132327c;

    /* renamed from: d, reason: collision with root package name */
    gg f132328d;

    gg(Object obj, int i10, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        boolean z10 = obj == null;
        this.f132326b = z10;
        this.f132325a = z10 ? 0 : obj.hashCode();
        this.f132327c = i10;
    }

    public String toString() {
        return super.get() + "=" + this.f132327c;
    }
}
