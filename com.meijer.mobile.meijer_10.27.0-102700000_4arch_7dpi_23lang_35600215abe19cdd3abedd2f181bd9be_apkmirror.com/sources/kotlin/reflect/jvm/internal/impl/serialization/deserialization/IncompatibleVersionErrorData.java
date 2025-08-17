package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes13.dex */
public final class IncompatibleVersionErrorData<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f146413a;

    /* renamed from: b, reason: collision with root package name */
    private final T f146414b;

    /* renamed from: c, reason: collision with root package name */
    private final T f146415c;

    /* renamed from: d, reason: collision with root package name */
    private final T f146416d;

    /* renamed from: e, reason: collision with root package name */
    private final String f146417e;

    /* renamed from: f, reason: collision with root package name */
    private final ClassId f146418f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.e(this.f146413a, incompatibleVersionErrorData.f146413a) && Intrinsics.e(this.f146414b, incompatibleVersionErrorData.f146414b) && Intrinsics.e(this.f146415c, incompatibleVersionErrorData.f146415c) && Intrinsics.e(this.f146416d, incompatibleVersionErrorData.f146416d) && Intrinsics.e(this.f146417e, incompatibleVersionErrorData.f146417e) && Intrinsics.e(this.f146418f, incompatibleVersionErrorData.f146418f);
    }

    public int hashCode() {
        T t10 = this.f146413a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f146414b;
        int iHashCode2 = (iHashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        T t12 = this.f146415c;
        int iHashCode3 = (iHashCode2 + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.f146416d;
        return ((((iHashCode3 + (t13 != null ? t13.hashCode() : 0)) * 31) + this.f146417e.hashCode()) * 31) + this.f146418f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f146413a + ", compilerVersion=" + this.f146414b + ", languageVersion=" + this.f146415c + ", expectedVersion=" + this.f146416d + ", filePath=" + this.f146417e + ", classId=" + this.f146418f + ')';
    }

    public IncompatibleVersionErrorData(T t10, T t11, T t12, T t13, String filePath, ClassId classId) {
        Intrinsics.j(filePath, "filePath");
        Intrinsics.j(classId, "classId");
        this.f146413a = t10;
        this.f146414b = t11;
        this.f146415c = t12;
        this.f146416d = t13;
        this.f146417e = filePath;
        this.f146418f = classId;
    }
}
