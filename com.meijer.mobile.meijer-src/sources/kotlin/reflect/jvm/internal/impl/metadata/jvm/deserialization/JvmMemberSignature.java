package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class JvmMemberSignature {

    public static final class Field extends JvmMemberSignature {

        /* renamed from: a, reason: collision with root package name */
        private final String f146559a;

        /* renamed from: b, reason: collision with root package name */
        private final String f146560b;

        public final String b() {
            return this.f146559a;
        }

        public final String c() {
            return this.f146560b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.e(this.f146559a, field.f146559a) && Intrinsics.e(this.f146560b, field.f146560b);
        }

        public int hashCode() {
            return (this.f146559a.hashCode() * 31) + this.f146560b.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(String name, String desc) {
            super(null);
            Intrinsics.j(name, "name");
            Intrinsics.j(desc, "desc");
            this.f146559a = name;
            this.f146560b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public String a() {
            return e() + ':' + d();
        }

        public String d() {
            return this.f146560b;
        }

        public String e() {
            return this.f146559a;
        }
    }

    public static final class Method extends JvmMemberSignature {

        /* renamed from: a, reason: collision with root package name */
        private final String f146561a;

        /* renamed from: b, reason: collision with root package name */
        private final String f146562b;

        public static /* synthetic */ Method c(Method method, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = method.f146561a;
            }
            if ((i10 & 2) != 0) {
                str2 = method.f146562b;
            }
            return method.b(str, str2);
        }

        public final Method b(String name, String desc) {
            Intrinsics.j(name, "name");
            Intrinsics.j(desc, "desc");
            return new Method(name, desc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return Intrinsics.e(this.f146561a, method.f146561a) && Intrinsics.e(this.f146562b, method.f146562b);
        }

        public int hashCode() {
            return (this.f146561a.hashCode() * 31) + this.f146562b.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(String name, String desc) {
            super(null);
            Intrinsics.j(name, "name");
            Intrinsics.j(desc, "desc");
            this.f146561a = name;
            this.f146562b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public String a() {
            return e() + d();
        }

        public String d() {
            return this.f146562b;
        }

        public String e() {
            return this.f146561a;
        }
    }

    public /* synthetic */ JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private JvmMemberSignature() {
    }

    public final String toString() {
        return a();
    }
}
