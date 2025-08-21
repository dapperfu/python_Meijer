package fsimpl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
final class gg extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    int f133575a;

    /* renamed from: b, reason: collision with root package name */
    boolean f133576b;

    /* renamed from: c, reason: collision with root package name */
    int f133577c;

    /* renamed from: d, reason: collision with root package name */
    gg f133578d;

    gg(Object obj, int i10, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        boolean z10 = obj == null;
        this.f133576b = z10;
        this.f133575a = z10 ? 0 : obj.hashCode();
        this.f133577c = i10;
    }

    public String toString() {
        return super.get() + "=" + this.f133577c;
    }
}
