package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public abstract class JvmMemberSignature {

    public static final class Field extends JvmMemberSignature {

        /* renamed from: a, reason: collision with root package name */
        private final String f145652a;

        /* renamed from: b, reason: collision with root package name */
        private final String f145653b;

        public final String b() {
            return this.f145652a;
        }

        public final String c() {
            return this.f145653b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.e(this.f145652a, field.f145652a) && Intrinsics.e(this.f145653b, field.f145653b);
        }

        public int hashCode() {
            return (this.f145652a.hashCode() * 31) + this.f145653b.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(String name, String desc) {
            super(null);
            Intrinsics.j(name, "name");
            Intrinsics.j(desc, "desc");
            this.f145652a = name;
            this.f145653b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public String a() {
            return e() + ':' + d();
        }

        public String d() {
            return this.f145653b;
        }

        public String e() {
            return this.f145652a;
        }
    }

    public static final class Method extends JvmMemberSignature {

        /* renamed from: a, reason: collision with root package name */
        private final String f145654a;

        /* renamed from: b, reason: collision with root package name */
        private final String f145655b;

        public static /* synthetic */ Method c(Method method, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = method.f145654a;
            }
            if ((i10 & 2) != 0) {
                str2 = method.f145655b;
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
            return Intrinsics.e(this.f145654a, method.f145654a) && Intrinsics.e(this.f145655b, method.f145655b);
        }

        public int hashCode() {
            return (this.f145654a.hashCode() * 31) + this.f145655b.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(String name, String desc) {
            super(null);
            Intrinsics.j(name, "name");
            Intrinsics.j(desc, "desc");
            this.f145654a = name;
            this.f145655b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public String a() {
            return e() + d();
        }

        public String d() {
            return this.f145655b;
        }

        public String e() {
            return this.f145654a;
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
