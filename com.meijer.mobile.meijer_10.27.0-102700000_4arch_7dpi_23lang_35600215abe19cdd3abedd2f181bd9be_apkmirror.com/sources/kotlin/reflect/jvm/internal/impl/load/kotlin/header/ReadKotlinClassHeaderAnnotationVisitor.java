package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* loaded from: classes13.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

    /* renamed from: j, reason: collision with root package name */
    private static boolean f144876j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<ClassId, KotlinClassHeader.Kind> f144877k;

    /* renamed from: a, reason: collision with root package name */
    private int[] f144878a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f144879b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f144880c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f144881d = null;

    /* renamed from: e, reason: collision with root package name */
    private String[] f144882e = null;

    /* renamed from: f, reason: collision with root package name */
    private String[] f144883f = null;

    /* renamed from: g, reason: collision with root package name */
    private String[] f144884g = null;

    /* renamed from: h, reason: collision with root package name */
    private KotlinClassHeader.Kind f144885h = null;

    /* renamed from: i, reason: collision with root package name */
    private String[] f144886i = null;

    private static abstract class b implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f144887a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId) {
            if (classId != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void d(ClassId classId, Name name) {
            if (classId == null) {
                f(0);
            }
            if (name == null) {
                f(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void e(ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                f(2);
            }
        }

        protected abstract void g(String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void a() {
            g((String[]) this.f144887a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void c(Object obj) {
            if (obj instanceof String) {
                this.f144887a.add((String) obj);
            }
        }
    }

    private class c implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        class a extends b {
            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f144882e = strArr;
            }
        }

        class b extends b {
            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            b() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f144883f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void b(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                g(1);
            }
            if (name2 == null) {
                g(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor c(Name name, ClassId classId) {
            if (classId != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void d(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                g(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
            String strB = name != null ? name.b() : null;
            if ("d1".equals(strB)) {
                return h();
            }
            if ("d2".equals(strB)) {
                return i();
            }
            return null;
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor h() {
            return new a();
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor i() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void e(Name name, Object obj) {
            if (name == null) {
                return;
            }
            String strB = name.b();
            if ("k".equals(strB)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f144885h = KotlinClassHeader.Kind.e(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strB)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f144878a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    ReadKotlinClassHeaderAnnotationVisitor.this.f144879b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strB)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f144880c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strB) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f144881d = str2;
            }
        }
    }

    private class d implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        class a extends b {
            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f144886i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void b(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                g(1);
            }
            if (name2 == null) {
                g(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor c(Name name, ClassId classId) {
            if (classId != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void d(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                g(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void e(Name name, Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
            if ("b".equals(name != null ? name.b() : null)) {
                return h();
            }
            return null;
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor h() {
            return new a();
        }
    }

    private class e implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        class a extends b {
            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f144882e = strArr;
            }
        }

        class b extends b {
            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            b() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f144883f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void b(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                g(1);
            }
            if (name2 == null) {
                g(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor c(Name name, ClassId classId) {
            if (classId != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void d(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                g(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
            String strB = name != null ? name.b() : null;
            if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
                return h();
            }
            if ("strings".equals(strB)) {
                return i();
            }
            return null;
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor h() {
            return new a();
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor i() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void e(Name name, Object obj) {
            if (name == null) {
                return;
            }
            String strB = name.b();
            if ("version".equals(strB)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f144878a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strB)) {
                ReadKotlinClassHeaderAnnotationVisitor.this.f144879b = obj instanceof String ? (String) obj : null;
            }
        }
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void a() {
    }

    static {
        try {
            f144876j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f144876j = false;
        }
        HashMap map = new HashMap();
        f144877k = map;
        map.put(ClassId.k(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.f144868e);
        map.put(ClassId.k(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.f144869f);
        map.put(ClassId.k(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.f144871h);
        map.put(ClassId.k(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.f144872i);
        map.put(ClassId.k(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.f144870g);
    }

    private boolean o() {
        KotlinClassHeader.Kind kind = this.f144885h;
        return kind == KotlinClassHeader.Kind.f144868e || kind == KotlinClassHeader.Kind.f144869f || kind == KotlinClassHeader.Kind.f144872i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor c(ClassId classId, SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId == null) {
            d(0);
        }
        if (sourceElement == null) {
            d(1);
        }
        FqName fqNameA = classId.a();
        if (fqNameA.equals(JvmAnnotationNames.f144221a)) {
            return new c();
        }
        if (fqNameA.equals(JvmAnnotationNames.f144240t)) {
            return new d();
        }
        if (f144876j || this.f144885h != null || (kind = f144877k.get(classId)) == null) {
            return null;
        }
        this.f144885h = kind;
        return new e();
    }

    public KotlinClassHeader m(MetadataVersion metadataVersion) {
        if (this.f144885h == null || this.f144878a == null) {
            return null;
        }
        MetadataVersion metadataVersion2 = new MetadataVersion(this.f144878a, (this.f144880c & 8) != 0);
        if (!metadataVersion2.h(metadataVersion)) {
            this.f144884g = this.f144882e;
            this.f144882e = null;
        } else if (o() && this.f144882e == null) {
            return null;
        }
        String[] strArr = this.f144886i;
        return new KotlinClassHeader(this.f144885h, metadataVersion2, this.f144882e, this.f144884g, this.f144883f, this.f144879b, this.f144880c, this.f144881d, strArr != null ? BitEncoding.e(strArr) : null);
    }

    public KotlinClassHeader n() {
        return m(MetadataVersion.f145543i);
    }
}
