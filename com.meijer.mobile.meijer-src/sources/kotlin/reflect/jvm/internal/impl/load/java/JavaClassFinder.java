package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public interface JavaClassFinder {

    public static final class Request {

        /* renamed from: a, reason: collision with root package name */
        private final ClassId f145081a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f145082b;

        /* renamed from: c, reason: collision with root package name */
        private final JavaClass f145083c;

        public Request(ClassId classId, byte[] bArr, JavaClass javaClass) {
            Intrinsics.j(classId, "classId");
            this.f145081a = classId;
            this.f145082b = bArr;
            this.f145083c = javaClass;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.e(this.f145081a, request.f145081a) && Intrinsics.e(this.f145082b, request.f145082b) && Intrinsics.e(this.f145083c, request.f145083c);
        }

        public int hashCode() {
            int iHashCode = this.f145081a.hashCode() * 31;
            byte[] bArr = this.f145082b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.f145083c;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f145081a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f145082b) + ", outerClass=" + this.f145083c + ')';
        }

        public final ClassId a() {
            return this.f145081a;
        }

        public /* synthetic */ Request(ClassId classId, byte[] bArr, JavaClass javaClass, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(classId, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : javaClass);
        }
    }

    JavaClass a(Request request);

    JavaPackage b(FqName fqName, boolean z10);

    Set<String> c(FqName fqName);
}
