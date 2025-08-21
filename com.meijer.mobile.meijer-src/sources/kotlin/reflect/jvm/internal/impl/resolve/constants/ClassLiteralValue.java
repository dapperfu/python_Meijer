package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ClassLiteralValue {

    /* renamed from: a, reason: collision with root package name */
    private final ClassId f147079a;

    /* renamed from: b, reason: collision with root package name */
    private final int f147080b;

    public final ClassId a() {
        return this.f147079a;
    }

    public final int b() {
        return this.f147080b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.e(this.f147079a, classLiteralValue.f147079a) && this.f147080b == classLiteralValue.f147080b;
    }

    public int hashCode() {
        return (this.f147079a.hashCode() * 31) + Integer.hashCode(this.f147080b);
    }

    public ClassLiteralValue(ClassId classId, int i10) {
        Intrinsics.j(classId, "classId");
        this.f147079a = classId;
        this.f147080b = i10;
    }

    public final int c() {
        return this.f147080b;
    }

    public final ClassId d() {
        return this.f147079a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f147080b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f147079a);
        int i12 = this.f147080b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        return sb2.toString();
    }
}
