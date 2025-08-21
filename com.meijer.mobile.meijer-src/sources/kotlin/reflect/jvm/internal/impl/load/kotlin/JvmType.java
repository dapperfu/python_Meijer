package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes14.dex */
public abstract class JvmType {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f145712a = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Primitive f145713b = new Primitive(JvmPrimitiveType.BOOLEAN);

    /* renamed from: c, reason: collision with root package name */
    private static final Primitive f145714c = new Primitive(JvmPrimitiveType.CHAR);

    /* renamed from: d, reason: collision with root package name */
    private static final Primitive f145715d = new Primitive(JvmPrimitiveType.BYTE);

    /* renamed from: e, reason: collision with root package name */
    private static final Primitive f145716e = new Primitive(JvmPrimitiveType.SHORT);

    /* renamed from: f, reason: collision with root package name */
    private static final Primitive f145717f = new Primitive(JvmPrimitiveType.INT);

    /* renamed from: g, reason: collision with root package name */
    private static final Primitive f145718g = new Primitive(JvmPrimitiveType.FLOAT);

    /* renamed from: h, reason: collision with root package name */
    private static final Primitive f145719h = new Primitive(JvmPrimitiveType.LONG);

    /* renamed from: i, reason: collision with root package name */
    private static final Primitive f145720i = new Primitive(JvmPrimitiveType.DOUBLE);

    public static final class Array extends JvmType {

        /* renamed from: j, reason: collision with root package name */
        private final JvmType f145721j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(JvmType elementType) {
            super(null);
            Intrinsics.j(elementType, "elementType");
            this.f145721j = elementType;
        }

        public final JvmType i() {
            return this.f145721j;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Primitive a() {
            return JvmType.f145713b;
        }

        public final Primitive b() {
            return JvmType.f145715d;
        }

        public final Primitive c() {
            return JvmType.f145714c;
        }

        public final Primitive d() {
            return JvmType.f145720i;
        }

        public final Primitive e() {
            return JvmType.f145718g;
        }

        public final Primitive f() {
            return JvmType.f145717f;
        }

        public final Primitive g() {
            return JvmType.f145719h;
        }

        public final Primitive h() {
            return JvmType.f145716e;
        }
    }

    public static final class Object extends JvmType {

        /* renamed from: j, reason: collision with root package name */
        private final String f145722j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(String internalName) {
            super(null);
            Intrinsics.j(internalName, "internalName");
            this.f145722j = internalName;
        }

        public final String i() {
            return this.f145722j;
        }
    }

    public static final class Primitive extends JvmType {

        /* renamed from: j, reason: collision with root package name */
        private final JvmPrimitiveType f145723j;

        public Primitive(JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.f145723j = jvmPrimitiveType;
        }

        public final JvmPrimitiveType i() {
            return this.f145723j;
        }
    }

    public /* synthetic */ JvmType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private JvmType() {
    }

    public String toString() {
        return JvmTypeFactoryImpl.f145724a.d(this);
    }
}
