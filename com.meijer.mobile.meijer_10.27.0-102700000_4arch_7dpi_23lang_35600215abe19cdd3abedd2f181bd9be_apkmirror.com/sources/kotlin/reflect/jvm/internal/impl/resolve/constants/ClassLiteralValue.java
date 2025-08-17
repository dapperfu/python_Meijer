package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ClassLiteralValue {

    /* renamed from: a, reason: collision with root package name */
    private final ClassId f146172a;

    /* renamed from: b, reason: collision with root package name */
    private final int f146173b;

    public final ClassId a() {
        return this.f146172a;
    }

    public final int b() {
        return this.f146173b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.e(this.f146172a, classLiteralValue.f146172a) && this.f146173b == classLiteralValue.f146173b;
    }

    public int hashCode() {
        return (this.f146172a.hashCode() * 31) + Integer.hashCode(this.f146173b);
    }

    public ClassLiteralValue(ClassId classId, int i10) {
        Intrinsics.j(classId, "classId");
        this.f146172a = classId;
        this.f146173b = i10;
    }

    public final int c() {
        return this.f146173b;
    }

    public final ClassId d() {
        return this.f146172a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f146173b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f146172a);
        int i12 = this.f146173b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        return sb2.toString();
    }
}
