package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ReflectJavaClass extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaClass {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f144081a;

    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Member, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f144082b = new a();

        a() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            Intrinsics.j(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }
    }

    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Constructor<?>, ReflectJavaConstructor> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f144083b = new b();

        b() {
            super(1, ReflectJavaConstructor.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReflectJavaConstructor invoke(Constructor<?> p02) {
            Intrinsics.j(p02, "p0");
            return new ReflectJavaConstructor(p02);
        }
    }

    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Member, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f144084b = new c();

        c() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            Intrinsics.j(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }
    }

    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Field, ReflectJavaField> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f144085b = new d();

        d() {
            super(1, ReflectJavaField.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReflectJavaField invoke(Field p02) {
            Intrinsics.j(p02, "p0");
            return new ReflectJavaField(p02);
        }
    }

    /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Method, ReflectJavaMethod> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f144086b = new e();

        e() {
            super(1, ReflectJavaMethod.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReflectJavaMethod invoke(Method p02) {
            Intrinsics.j(p02, "p0");
            return new ReflectJavaMethod(p02);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean E() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public LightClassOriginKind L() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ JavaAnnotation i(FqName fqName) {
        return i(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean r() {
        return false;
    }

    public ReflectJavaClass(Class<?> klass) {
        Intrinsics.j(klass, "klass");
        this.f144081a = klass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Sequence<JavaClassifierType> D() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?>[] clsArrC = Java16SealedRecordLoader.f144058a.c(this.f144081a);
        if (clsArrC != null) {
            ArrayList arrayList = new ArrayList(clsArrC.length);
            for (Class<?> cls : clsArrC) {
                arrayList.add(new ReflectJavaClassifierType(cls));
            }
            Sequence<JavaClassifierType> sequenceF0 = CollectionsKt.f0(arrayList);
            if (sequenceF0 != null) {
                return sequenceF0;
            }
        }
        return SequencesKt.j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean K() {
        return this.f144081a.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public List<ReflectJavaConstructor> j() throws SecurityException {
        Constructor<?>[] declaredConstructors = this.f144081a.getDeclaredConstructors();
        Intrinsics.i(declaredConstructors, "getDeclaredConstructors(...)");
        return SequencesKt.W(SequencesKt.M(SequencesKt.C(ArraysKt.T(declaredConstructors), a.f144082b), b.f144083b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public Class<?> s() {
        return this.f144081a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public List<ReflectJavaField> y() {
        Field[] declaredFields = this.f144081a.getDeclaredFields();
        Intrinsics.i(declaredFields, "getDeclaredFields(...)");
        return SequencesKt.W(SequencesKt.M(SequencesKt.C(ArraysKt.T(declaredFields), c.f144084b), d.f144085b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public List<Name> B() {
        Class<?>[] declaredClasses = this.f144081a.getDeclaredClasses();
        Intrinsics.i(declaredClasses, "getDeclaredClasses(...)");
        return SequencesKt.W(SequencesKt.N(SequencesKt.C(ArraysKt.T(declaredClasses), kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c.f144111a), kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.f144112a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection<JavaClassifierType> a() {
        Class cls;
        cls = Object.class;
        if (Intrinsics.e(this.f144081a, cls)) {
            return CollectionsKt.m();
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        Object genericSuperclass = this.f144081a.getGenericSuperclass();
        spreadBuilder.a(genericSuperclass != null ? genericSuperclass : Object.class);
        spreadBuilder.b(this.f144081a.getGenericInterfaces());
        List listP = CollectionsKt.p(spreadBuilder.d(new Type[spreadBuilder.c()]));
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReflectJavaClassifierType((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public List<ReflectJavaMethod> C() throws SecurityException {
        Method[] declaredMethods = this.f144081a.getDeclaredMethods();
        Intrinsics.i(declaredMethods, "getDeclaredMethods(...)");
        return SequencesKt.W(SequencesKt.M(SequencesKt.B(ArraysKt.T(declaredMethods), new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e(this)), e.f144086b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass l() {
        Class<?> declaringClass = this.f144081a.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public FqName e() {
        return ReflectClassUtilKt.e(this.f144081a).a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaClass) && Intrinsics.e(this.f144081a, ((ReflectJavaClass) obj).f144081a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> listB;
        AnnotatedElement annotatedElementS = s();
        return (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null || (listB = ReflectJavaAnnotationOwnerKt.b(declaredAnnotations)) == null) ? CollectionsKt.m() : listB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.f144081a.getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public Name getName() {
        if (!this.f144081a.isAnonymousClass()) {
            Name nameO = Name.o(this.f144081a.getSimpleName());
            Intrinsics.g(nameO);
            return nameO;
        }
        String name = this.f144081a.getName();
        Intrinsics.i(name, "getName(...)");
        Name nameO2 = Name.o(StringsKt.o1(name, ".", null, 2, null));
        Intrinsics.g(nameO2);
        return nameO2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f144081a.getTypeParameters();
        Intrinsics.i(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f144081a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public ReflectJavaAnnotation i(FqName fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.j(fqName, "fqName");
        AnnotatedElement annotatedElementS = s();
        if (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.a(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection<JavaRecordComponent> m() {
        Object[] objArrD = Java16SealedRecordLoader.f144058a.d(this.f144081a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new ReflectJavaRecordComponent(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean o() {
        return this.f144081a.isAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean q() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean boolE = Java16SealedRecordLoader.f144058a.e(this.f144081a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    public String toString() {
        return ReflectJavaClass.class.getName() + ": " + this.f144081a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean w() {
        return this.f144081a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean z() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean boolF = Java16SealedRecordLoader.f144058a.f(this.f144081a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(Class cls) {
        String simpleName = cls.getSimpleName();
        Intrinsics.i(simpleName, "getSimpleName(...)");
        if (simpleName.length() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Name R(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!Name.t(simpleName)) {
            simpleName = null;
        }
        if (simpleName == null) {
            return null;
        }
        return Name.o(simpleName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(ReflectJavaClass reflectJavaClass, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (!reflectJavaClass.w()) {
            return true;
        }
        Intrinsics.g(method);
        if (reflectJavaClass.c0(method)) {
            return false;
        }
        return true;
    }

    private final boolean c0(Method method) {
        String name = method.getName();
        if (Intrinsics.e(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.i(parameterTypes, "getParameterTypes(...)");
            if (parameterTypes.length != 0) {
                return false;
            }
            return true;
        }
        if (!Intrinsics.e(name, "valueOf")) {
            return false;
        }
        return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean g() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return Visibilities.Public.f143660c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return Visibilities.Private.f143657c;
        }
        if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                return JavaVisibilities.ProtectedStaticVisibility.f144033c;
            }
            return JavaVisibilities.ProtectedAndPackage.f144032c;
        }
        return JavaVisibilities.PackageVisibility.f144031c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }
}
