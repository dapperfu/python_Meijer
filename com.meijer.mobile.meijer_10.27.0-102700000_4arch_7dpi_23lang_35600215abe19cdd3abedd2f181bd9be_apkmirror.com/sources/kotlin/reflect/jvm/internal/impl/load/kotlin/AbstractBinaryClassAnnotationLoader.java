package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AnnotationsContainer<? extends A>> implements AnnotationLoader<A> {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f144745b = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final KotlinClassFinder f144746a;

    public static abstract class AnnotationsContainer<A> {
        public abstract Map<MemberSignature, List<A>> a();
    }

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KotlinJvmBinaryClass a(ProtoContainer container, boolean z10, boolean z11, Boolean bool, boolean z12, KotlinClassFinder kotlinClassFinder, MetadataVersion metadataVersion) {
            ProtoContainer.Class classH;
            Intrinsics.j(container, "container");
            Intrinsics.j(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.j(metadataVersion, "metadataVersion");
            if (z10) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof ProtoContainer.Class) {
                    ProtoContainer.Class r82 = (ProtoContainer.Class) container;
                    if (r82.g() == ProtoBuf.Class.Kind.INTERFACE) {
                        ClassId classIdE = r82.e();
                        Name nameO = Name.o("DefaultImpls");
                        Intrinsics.i(nameO, "identifier(...)");
                        return KotlinClassFinderKt.b(kotlinClassFinder, classIdE.d(nameO), metadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof ProtoContainer.Package)) {
                    SourceElement sourceElementC = container.c();
                    JvmPackagePartSource jvmPackagePartSource = sourceElementC instanceof JvmPackagePartSource ? (JvmPackagePartSource) sourceElementC : null;
                    JvmClassName jvmClassNameF = jvmPackagePartSource != null ? jvmPackagePartSource.f() : null;
                    if (jvmClassNameF != null) {
                        ClassId.Companion companion = ClassId.f145674d;
                        String strF = jvmClassNameF.f();
                        Intrinsics.i(strF, "getInternalName(...)");
                        return KotlinClassFinderKt.b(kotlinClassFinder, companion.c(new FqName(StringsKt.P(strF, '/', '.', false, 4, null))), metadataVersion);
                    }
                }
            }
            if (z11 && (container instanceof ProtoContainer.Class)) {
                ProtoContainer.Class r83 = (ProtoContainer.Class) container;
                if (r83.g() == ProtoBuf.Class.Kind.COMPANION_OBJECT && (classH = r83.h()) != null && (classH.g() == ProtoBuf.Class.Kind.CLASS || classH.g() == ProtoBuf.Class.Kind.ENUM_CLASS || (z12 && (classH.g() == ProtoBuf.Class.Kind.INTERFACE || classH.g() == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                    SourceElement sourceElementC2 = classH.c();
                    KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = sourceElementC2 instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) sourceElementC2 : null;
                    if (kotlinJvmBinarySourceElement != null) {
                        return kotlinJvmBinarySourceElement.d();
                    }
                    return null;
                }
            }
            if (!(container instanceof ProtoContainer.Package) || !(container.c() instanceof JvmPackagePartSource)) {
                return null;
            }
            SourceElement sourceElementC3 = container.c();
            Intrinsics.h(sourceElementC3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) sourceElementC3;
            KotlinJvmBinaryClass kotlinJvmBinaryClassG = jvmPackagePartSource2.g();
            return kotlinJvmBinaryClassG == null ? KotlinClassFinderKt.b(kotlinClassFinder, jvmPackagePartSource2.d(), metadataVersion) : kotlinJvmBinaryClassG;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f144747a = new a("PROPERTY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f144748b = new a("BACKING_FIELD", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f144749c = new a("DELEGATE_FIELD", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f144750d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f144751e;

        private static final /* synthetic */ a[] a() {
            return new a[]{f144747a, f144748b, f144749c};
        }

        static {
            a[] aVarArrA = a();
            f144750d = aVarArrA;
            f144751e = EnumEntriesKt.a(aVarArrA);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f144750d.clone();
        }

        private a(String str, int i10) {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public abstract A i(ProtoBuf.Annotation annotation, NameResolver nameResolver);

    protected abstract S q(KotlinJvmBinaryClass kotlinJvmBinaryClass);

    protected byte[] r(KotlinJvmBinaryClass kotlinClass) {
        Intrinsics.j(kotlinClass, "kotlinClass");
        return null;
    }

    public abstract MetadataVersion v();

    protected abstract KotlinJvmBinaryClass.AnnotationArgumentVisitor x(ClassId classId, SourceElement sourceElement, List<A> list);

    public AbstractBinaryClassAnnotationLoader(KotlinClassFinder kotlinClassFinder) {
        Intrinsics.j(kotlinClassFinder, "kotlinClassFinder");
        this.f144746a = kotlinClassFinder;
    }

    private final int m(ProtoContainer protoContainer, MessageLite messageLite) {
        if (messageLite instanceof ProtoBuf.Function) {
            return ProtoTypeTableUtilKt.g((ProtoBuf.Function) messageLite) ? 1 : 0;
        }
        if (messageLite instanceof ProtoBuf.Property) {
            return ProtoTypeTableUtilKt.h((ProtoBuf.Property) messageLite) ? 1 : 0;
        }
        if (!(messageLite instanceof ProtoBuf.Constructor)) {
            throw new UnsupportedOperationException("Unsupported message: " + messageLite.getClass());
        }
        Intrinsics.h(protoContainer, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        ProtoContainer.Class r42 = (ProtoContainer.Class) protoContainer;
        if (r42.g() == ProtoBuf.Class.Kind.ENUM_CLASS) {
            return 2;
        }
        return r42.i() ? 1 : 0;
    }

    private final List<A> n(ProtoContainer protoContainer, MemberSignature memberSignature, boolean z10, boolean z11, Boolean bool, boolean z12) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassP = p(protoContainer, f144745b.a(protoContainer, z10, z11, bool, z12, this.f144746a, v()));
        if (kotlinJvmBinaryClassP == null) {
            return CollectionsKt.m();
        }
        List<A> list = q(kotlinJvmBinaryClassP).a().get(memberSignature);
        return list == null ? CollectionsKt.m() : list;
    }

    static /* synthetic */ List o(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MemberSignature memberSignature, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            z12 = false;
        }
        return abstractBinaryClassAnnotationLoader.n(protoContainer, memberSignature, z10, z11, bool, z12);
    }

    public static /* synthetic */ MemberSignature t(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return abstractBinaryClassAnnotationLoader.s(messageLite, nameResolver, typeTable, annotatedCallableKind, z10);
    }

    private final List<A> z(ProtoContainer protoContainer, ProtoBuf.Property property, a aVar) {
        Boolean boolD = Flags.f145498B.d(property.f0());
        Intrinsics.i(boolD, "get(...)");
        boolD.booleanValue();
        boolean zF = JvmProtoBufUtil.f(property);
        if (aVar == a.f144747a) {
            MemberSignature memberSignatureB = AbstractBinaryClassAnnotationLoaderKt.b(property, protoContainer.b(), protoContainer.d(), false, true, false, 40, null);
            return memberSignatureB == null ? CollectionsKt.m() : o(this, protoContainer, memberSignatureB, true, false, boolD, zF, 8, null);
        }
        MemberSignature memberSignatureB2 = AbstractBinaryClassAnnotationLoaderKt.b(property, protoContainer.b(), protoContainer.d(), true, false, false, 48, null);
        if (memberSignatureB2 == null) {
            return CollectionsKt.m();
        }
        return StringsKt.c0(memberSignatureB2.a(), "$delegate", false, 2, null) != (aVar == a.f144749c) ? CollectionsKt.m() : n(protoContainer, memberSignatureB2, true, true, boolD, zF);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> a(ProtoContainer container, MessageLite callableProto, AnnotatedCallableKind kind, int i10, ProtoBuf.ValueParameter proto) {
        Intrinsics.j(container, "container");
        Intrinsics.j(callableProto, "callableProto");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(proto, "proto");
        MemberSignature memberSignatureT = t(this, callableProto, container.b(), container.d(), kind, false, 16, null);
        if (memberSignatureT == null) {
            return CollectionsKt.m();
        }
        return o(this, container, MemberSignature.f144826b.e(memberSignatureT, i10 + m(container, callableProto)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> b(ProtoContainer.Class container) {
        Intrinsics.j(container, "container");
        KotlinJvmBinaryClass kotlinJvmBinaryClassA = A(container);
        if (kotlinJvmBinaryClassA != null) {
            final ArrayList arrayList = new ArrayList(1);
            kotlinJvmBinaryClassA.c(new KotlinJvmBinaryClass.AnnotationVisitor(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$loadClassAnnotations$1

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractBinaryClassAnnotationLoader<A, S> f144752a;

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void a() {
                }

                {
                    this.f144752a = this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor c(ClassId classId, SourceElement source) {
                    Intrinsics.j(classId, "classId");
                    Intrinsics.j(source, "source");
                    return this.f144752a.y(classId, source, arrayList);
                }
            }, r(kotlinJvmBinaryClassA));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> c(ProtoBuf.Type proto, NameResolver nameResolver) {
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Object objU = proto.u(JvmProtoBuf.f145558f);
        Intrinsics.i(objU, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) objU;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            Intrinsics.g(annotation);
            arrayList.add(i(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> d(ProtoContainer container, ProtoBuf.EnumEntry proto) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        return o(this, container, MemberSignature.f144826b.a(container.b().getString(proto.G()), ClassMapperLite.b(((ProtoContainer.Class) container).e().b())), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> e(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(kind, "kind");
        if (kind == AnnotatedCallableKind.PROPERTY) {
            return z(container, (ProtoBuf.Property) proto, a.f144747a);
        }
        MemberSignature memberSignatureT = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return memberSignatureT == null ? CollectionsKt.m() : o(this, container, memberSignatureT, false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> g(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Object objU = proto.u(JvmProtoBuf.f145560h);
        Intrinsics.i(objU, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) objU;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            Intrinsics.g(annotation);
            arrayList.add(i(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> j(ProtoContainer container, ProtoBuf.Property proto) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        return z(container, proto, a.f144748b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> k(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(kind, "kind");
        MemberSignature memberSignatureT = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return memberSignatureT != null ? o(this, container, MemberSignature.f144826b.e(memberSignatureT, 0), false, false, null, false, 60, null) : CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> l(ProtoContainer container, ProtoBuf.Property proto) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        return z(container, proto, a.f144749c);
    }

    protected final KotlinJvmBinaryClass p(ProtoContainer container, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        Intrinsics.j(container, "container");
        if (kotlinJvmBinaryClass != null) {
            return kotlinJvmBinaryClass;
        }
        if (container instanceof ProtoContainer.Class) {
            return A((ProtoContainer.Class) container);
        }
        return null;
    }

    protected final MemberSignature s(MessageLite proto, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind kind, boolean z10) {
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        Intrinsics.j(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            MemberSignature.Companion companion = MemberSignature.f144826b;
            JvmMemberSignature.Method methodB = JvmProtoBufUtil.f145664a.b((ProtoBuf.Constructor) proto, nameResolver, typeTable);
            if (methodB == null) {
                return null;
            }
            return companion.b(methodB);
        }
        if (proto instanceof ProtoBuf.Function) {
            MemberSignature.Companion companion2 = MemberSignature.f144826b;
            JvmMemberSignature.Method methodE = JvmProtoBufUtil.f145664a.e((ProtoBuf.Function) proto, nameResolver, typeTable);
            if (methodE == null) {
                return null;
            }
            return companion2.b(methodE);
        }
        if (proto instanceof ProtoBuf.Property) {
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f145556d;
            Intrinsics.i(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.a((GeneratedMessageLite.ExtendableMessage) proto, propertySignature);
            if (jvmPropertySignature == null) {
                return null;
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return AbstractBinaryClassAnnotationLoaderKt.a((ProtoBuf.Property) proto, nameResolver, typeTable, true, true, z10);
                }
                if (!jvmPropertySignature.I()) {
                    return null;
                }
                MemberSignature.Companion companion3 = MemberSignature.f144826b;
                JvmProtoBuf.JvmMethodSignature jvmMethodSignatureD = jvmPropertySignature.D();
                Intrinsics.i(jvmMethodSignatureD, "getSetter(...)");
                return companion3.c(nameResolver, jvmMethodSignatureD);
            }
            if (jvmPropertySignature.H()) {
                MemberSignature.Companion companion4 = MemberSignature.f144826b;
                JvmProtoBuf.JvmMethodSignature jvmMethodSignatureC = jvmPropertySignature.C();
                Intrinsics.i(jvmMethodSignatureC, "getGetter(...)");
                return companion4.c(nameResolver, jvmMethodSignatureC);
            }
        }
        return null;
    }

    protected final KotlinClassFinder u() {
        return this.f144746a;
    }

    protected final boolean w(ClassId classId) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassB;
        Intrinsics.j(classId, "classId");
        return classId.e() != null && Intrinsics.e(classId.h().b(), "Container") && (kotlinJvmBinaryClassB = KotlinClassFinderKt.b(this.f144746a, classId, v())) != null && SpecialJvmAnnotations.f143229a.c(kotlinJvmBinaryClassB);
    }

    protected final KotlinJvmBinaryClass.AnnotationArgumentVisitor y(ClassId annotationClassId, SourceElement source, List<A> result) {
        Intrinsics.j(annotationClassId, "annotationClassId");
        Intrinsics.j(source, "source");
        Intrinsics.j(result, "result");
        if (SpecialJvmAnnotations.f143229a.b().contains(annotationClassId)) {
            return null;
        }
        return x(annotationClassId, source, result);
    }

    private final KotlinJvmBinaryClass A(ProtoContainer.Class r32) {
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement;
        SourceElement sourceElementC = r32.c();
        if (sourceElementC instanceof KotlinJvmBinarySourceElement) {
            kotlinJvmBinarySourceElement = (KotlinJvmBinarySourceElement) sourceElementC;
        } else {
            kotlinJvmBinarySourceElement = null;
        }
        if (kotlinJvmBinarySourceElement == null) {
            return null;
        }
        return kotlinJvmBinarySourceElement.d();
    }
}
