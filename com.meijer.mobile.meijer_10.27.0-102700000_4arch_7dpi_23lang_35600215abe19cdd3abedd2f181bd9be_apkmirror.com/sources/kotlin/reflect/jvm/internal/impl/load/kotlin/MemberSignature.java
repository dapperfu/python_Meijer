package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* loaded from: classes13.dex */
public final class MemberSignature {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f144826b = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f144827a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MemberSignature a(String name, String desc) {
            Intrinsics.j(name, "name");
            Intrinsics.j(desc, "desc");
            return new MemberSignature(name + '#' + desc, null);
        }

        @JvmStatic
        public final MemberSignature b(JvmMemberSignature signature) {
            Intrinsics.j(signature, "signature");
            if (signature instanceof JvmMemberSignature.Method) {
                JvmMemberSignature.Method method = (JvmMemberSignature.Method) signature;
                return d(method.e(), method.d());
            }
            if (!(signature instanceof JvmMemberSignature.Field)) {
                throw new NoWhenBranchMatchedException();
            }
            JvmMemberSignature.Field field = (JvmMemberSignature.Field) signature;
            return a(field.e(), field.d());
        }

        @JvmStatic
        public final MemberSignature c(NameResolver nameResolver, JvmProtoBuf.JvmMethodSignature signature) {
            Intrinsics.j(nameResolver, "nameResolver");
            Intrinsics.j(signature, "signature");
            return d(nameResolver.getString(signature.y()), nameResolver.getString(signature.x()));
        }

        @JvmStatic
        public final MemberSignature d(String name, String desc) {
            Intrinsics.j(name, "name");
            Intrinsics.j(desc, "desc");
            return new MemberSignature(name + desc, null);
        }

        @JvmStatic
        public final MemberSignature e(MemberSignature signature, int i10) {
            Intrinsics.j(signature, "signature");
            return new MemberSignature(signature.a() + '@' + i10, null);
        }
    }

    public /* synthetic */ MemberSignature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && Intrinsics.e(this.f144827a, ((MemberSignature) obj).f144827a);
    }

    public int hashCode() {
        return this.f144827a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f144827a + ')';
    }

    private MemberSignature(String str) {
        this.f144827a = str;
    }

    public final String a() {
        return this.f144827a;
    }
}
