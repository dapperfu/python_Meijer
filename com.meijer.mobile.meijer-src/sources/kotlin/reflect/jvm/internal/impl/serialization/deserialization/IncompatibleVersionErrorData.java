package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes14.dex */
public final class IncompatibleVersionErrorData<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f147320a;

    /* renamed from: b, reason: collision with root package name */
    private final T f147321b;

    /* renamed from: c, reason: collision with root package name */
    private final T f147322c;

    /* renamed from: d, reason: collision with root package name */
    private final T f147323d;

    /* renamed from: e, reason: collision with root package name */
    private final String f147324e;

    /* renamed from: f, reason: collision with root package name */
    private final ClassId f147325f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.e(this.f147320a, incompatibleVersionErrorData.f147320a) && Intrinsics.e(this.f147321b, incompatibleVersionErrorData.f147321b) && Intrinsics.e(this.f147322c, incompatibleVersionErrorData.f147322c) && Intrinsics.e(this.f147323d, incompatibleVersionErrorData.f147323d) && Intrinsics.e(this.f147324e, incompatibleVersionErrorData.f147324e) && Intrinsics.e(this.f147325f, incompatibleVersionErrorData.f147325f);
    }

    public int hashCode() {
        T t10 = this.f147320a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f147321b;
        int iHashCode2 = (iHashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        T t12 = this.f147322c;
        int iHashCode3 = (iHashCode2 + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.f147323d;
        return ((((iHashCode3 + (t13 != null ? t13.hashCode() : 0)) * 31) + this.f147324e.hashCode()) * 31) + this.f147325f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f147320a + ", compilerVersion=" + this.f147321b + ", languageVersion=" + this.f147322c + ", expectedVersion=" + this.f147323d + ", filePath=" + this.f147324e + ", classId=" + this.f147325f + ')';
    }

    public IncompatibleVersionErrorData(T t10, T t11, T t12, T t13, String filePath, ClassId classId) {
        Intrinsics.j(filePath, "filePath");
        Intrinsics.j(classId, "classId");
        this.f147320a = t10;
        this.f147321b = t11;
        this.f147322c = t12;
        this.f147323d = t13;
        this.f147324e = filePath;
        this.f147325f = classId;
    }
}
