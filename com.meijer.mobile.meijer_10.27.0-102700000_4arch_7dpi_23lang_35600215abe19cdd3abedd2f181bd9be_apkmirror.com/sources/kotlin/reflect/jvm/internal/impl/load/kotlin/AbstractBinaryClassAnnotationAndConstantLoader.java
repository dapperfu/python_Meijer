package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, AnnotationsContainerWithConstants<? extends A, ? extends C>> implements AnnotationAndConstantLoader<A, C> {

    /* renamed from: c, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<KotlinJvmBinaryClass, AnnotationsContainerWithConstants<A, C>> f144735c;

    protected abstract C I(String str, Object obj);

    protected abstract C M(C c10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader(StorageManager storageManager, KotlinClassFinder kotlinClassFinder) {
        super(kotlinClassFinder);
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(kotlinClassFinder, "kotlinClassFinder");
        this.f144735c = storageManager.i(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G(AnnotationsContainerWithConstants loadConstantFromProperty, MemberSignature it) {
        Intrinsics.j(loadConstantFromProperty, "$this$loadConstantFromProperty");
        Intrinsics.j(it, "it");
        return loadConstantFromProperty.b().get(it);
    }

    private final AnnotationsContainerWithConstants<A, C> H(final KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        final HashMap map3 = new HashMap();
        kotlinJvmBinaryClass.a(new KotlinJvmBinaryClass.MemberVisitor(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> f144736a;

            public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements KotlinJvmBinaryClass.MethodAnnotationVisitor {

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 f144741d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnnotationVisitorForMethod(AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, MemberSignature signature) {
                    super(abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, signature);
                    Intrinsics.j(signature, "signature");
                    this.f144741d = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor b(int i10, ClassId classId, SourceElement source) {
                    Intrinsics.j(classId, "classId");
                    Intrinsics.j(source, "source");
                    MemberSignature memberSignatureE = MemberSignature.f144826b.e(d(), i10);
                    Collection arrayList = (List) map.get(memberSignatureE);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(memberSignatureE, arrayList);
                    }
                    return this.f144741d.f144736a.y(classId, source, arrayList);
                }
            }

            public class MemberAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

                /* renamed from: a, reason: collision with root package name */
                private final MemberSignature f144742a;

                /* renamed from: b, reason: collision with root package name */
                private final ArrayList<A> f144743b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 f144744c;

                public MemberAnnotationVisitor(AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, MemberSignature signature) {
                    Intrinsics.j(signature, "signature");
                    this.f144744c = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1;
                    this.f144742a = signature;
                    this.f144743b = new ArrayList<>();
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void a() {
                    if (this.f144743b.isEmpty()) {
                        return;
                    }
                    map.put(this.f144742a, this.f144743b);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor c(ClassId classId, SourceElement source) {
                    Intrinsics.j(classId, "classId");
                    Intrinsics.j(source, "source");
                    return this.f144744c.f144736a.y(classId, source, this.f144743b);
                }

                protected final MemberSignature d() {
                    return this.f144742a;
                }
            }

            {
                this.f144736a = this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            public KotlinJvmBinaryClass.AnnotationVisitor a(Name name, String desc, Object obj) {
                Object objI;
                Intrinsics.j(name, "name");
                Intrinsics.j(desc, "desc");
                MemberSignature.Companion companion = MemberSignature.f144826b;
                String strB = name.b();
                Intrinsics.i(strB, "asString(...)");
                MemberSignature memberSignatureA = companion.a(strB, desc);
                if (obj != null && (objI = this.f144736a.I(desc, obj)) != null) {
                    map2.put(memberSignatureA, objI);
                }
                return new MemberAnnotationVisitor(this, memberSignatureA);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            public KotlinJvmBinaryClass.MethodAnnotationVisitor b(Name name, String desc) {
                Intrinsics.j(name, "name");
                Intrinsics.j(desc, "desc");
                MemberSignature.Companion companion = MemberSignature.f144826b;
                String strB = name.b();
                Intrinsics.i(strB, "asString(...)");
                return new AnnotationVisitorForMethod(this, companion.d(strB, desc));
            }
        }, r(kotlinJvmBinaryClass));
        return new AnnotationsContainerWithConstants<>(map, map2, map3);
    }

    private final C J(ProtoContainer protoContainer, ProtoBuf.Property property, AnnotatedCallableKind annotatedCallableKind, KotlinType kotlinType, Function2<? super AnnotationsContainerWithConstants<? extends A, ? extends C>, ? super MemberSignature, ? extends C> function2) {
        C cInvoke;
        KotlinJvmBinaryClass kotlinJvmBinaryClassP = p(protoContainer, AbstractBinaryClassAnnotationLoader.f144745b.a(protoContainer, true, true, Flags.f145498B.d(property.f0()), JvmProtoBufUtil.f(property), u(), v()));
        if (kotlinJvmBinaryClassP == null) {
            return null;
        }
        MemberSignature memberSignatureS = s(property, protoContainer.b(), protoContainer.d(), annotatedCallableKind, kotlinJvmBinaryClassP.b().d().d(DeserializedDescriptorResolver.f144785b.a()));
        if (memberSignatureS == null || (cInvoke = function2.invoke(this.f144735c.invoke(kotlinJvmBinaryClassP), memberSignatureS)) == null) {
            return null;
        }
        return UnsignedTypes.d(kotlinType) ? M(cInvoke) : cInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(AnnotationsContainerWithConstants loadConstantFromProperty, MemberSignature it) {
        Intrinsics.j(loadConstantFromProperty, "$this$loadConstantFromProperty");
        Intrinsics.j(it, "it");
        return loadConstantFromProperty.c().get(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotationsContainerWithConstants L(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, KotlinJvmBinaryClass kotlinClass) {
        Intrinsics.j(kotlinClass, "kotlinClass");
        return abstractBinaryClassAnnotationAndConstantLoader.H(kotlinClass);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public AnnotationsContainerWithConstants<A, C> q(KotlinJvmBinaryClass binaryClass) {
        Intrinsics.j(binaryClass, "binaryClass");
        return this.f144735c.invoke(binaryClass);
    }

    protected final boolean F(ClassId annotationClassId, Map<Name, ? extends ConstantValue<?>> arguments) {
        Intrinsics.j(annotationClassId, "annotationClassId");
        Intrinsics.j(arguments, "arguments");
        if (!Intrinsics.e(annotationClassId, SpecialJvmAnnotations.f143229a.a())) {
            return false;
        }
        ConstantValue<?> constantValue = arguments.get(Name.o("value"));
        KClassValue kClassValue = constantValue instanceof KClassValue ? (KClassValue) constantValue : null;
        if (kClassValue == null) {
            return false;
        }
        KClassValue.Value valueB = kClassValue.b();
        KClassValue.Value.NormalClass normalClass = valueB instanceof KClassValue.Value.NormalClass ? (KClassValue.Value.NormalClass) valueB : null;
        if (normalClass == null) {
            return false;
        }
        return w(normalClass.b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public C f(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(expectedType, "expectedType");
        return J(container, proto, AnnotatedCallableKind.PROPERTY_GETTER, expectedType, b.f144852a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public C h(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(expectedType, "expectedType");
        return J(container, proto, AnnotatedCallableKind.PROPERTY, expectedType, c.f144853a);
    }
}
