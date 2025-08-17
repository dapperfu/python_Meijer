package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes13.dex */
public abstract class JvmType {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f144805a = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Primitive f144806b = new Primitive(JvmPrimitiveType.BOOLEAN);

    /* renamed from: c, reason: collision with root package name */
    private static final Primitive f144807c = new Primitive(JvmPrimitiveType.CHAR);

    /* renamed from: d, reason: collision with root package name */
    private static final Primitive f144808d = new Primitive(JvmPrimitiveType.BYTE);

    /* renamed from: e, reason: collision with root package name */
    private static final Primitive f144809e = new Primitive(JvmPrimitiveType.SHORT);

    /* renamed from: f, reason: collision with root package name */
    private static final Primitive f144810f = new Primitive(JvmPrimitiveType.INT);

    /* renamed from: g, reason: collision with root package name */
    private static final Primitive f144811g = new Primitive(JvmPrimitiveType.FLOAT);

    /* renamed from: h, reason: collision with root package name */
    private static final Primitive f144812h = new Primitive(JvmPrimitiveType.LONG);

    /* renamed from: i, reason: collision with root package name */
    private static final Primitive f144813i = new Primitive(JvmPrimitiveType.DOUBLE);

    public static final class Array extends JvmType {

        /* renamed from: j, reason: collision with root package name */
        private final JvmType f144814j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(JvmType elementType) {
            super(null);
            Intrinsics.j(elementType, "elementType");
            this.f144814j = elementType;
        }

        public final JvmType i() {
            return this.f144814j;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Primitive a() {
            return JvmType.f144806b;
        }

        public final Primitive b() {
            return JvmType.f144808d;
        }

        public final Primitive c() {
            return JvmType.f144807c;
        }

        public final Primitive d() {
            return JvmType.f144813i;
        }

        public final Primitive e() {
            return JvmType.f144811g;
        }

        public final Primitive f() {
            return JvmType.f144810f;
        }

        public final Primitive g() {
            return JvmType.f144812h;
        }

        public final Primitive h() {
            return JvmType.f144809e;
        }
    }

    public static final class Object extends JvmType {

        /* renamed from: j, reason: collision with root package name */
        private final String f144815j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(String internalName) {
            super(null);
            Intrinsics.j(internalName, "internalName");
            this.f144815j = internalName;
        }

        public final String i() {
            return this.f144815j;
        }
    }

    public static final class Primitive extends JvmType {

        /* renamed from: j, reason: collision with root package name */
        private final JvmPrimitiveType f144816j;

        public Primitive(JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.f144816j = jvmPrimitiveType;
        }

        public final JvmPrimitiveType i() {
            return this.f144816j;
        }
    }

    public /* synthetic */ JvmType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private JvmType() {
    }

    public String toString() {
        return JvmTypeFactoryImpl.f144817a.d(this);
    }
}
