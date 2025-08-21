package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class DeprecationInfo implements Comparable<DeprecationInfo> {
    public abstract DeprecationLevelValue b();

    public abstract boolean e();

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(DeprecationInfo other) {
        Intrinsics.j(other, "other");
        int iCompareTo = b().compareTo(other.b());
        if (iCompareTo == 0 && !e() && other.e()) {
            return 1;
        }
        return iCompareTo;
    }
}
