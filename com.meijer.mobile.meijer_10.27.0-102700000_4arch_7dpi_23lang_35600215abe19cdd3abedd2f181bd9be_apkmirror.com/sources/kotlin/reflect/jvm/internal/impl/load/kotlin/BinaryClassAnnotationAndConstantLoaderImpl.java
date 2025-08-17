package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.StringsKt;

/* loaded from: classes13.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* renamed from: d, reason: collision with root package name */
    private final ModuleDescriptor f144757d;

    /* renamed from: e, reason: collision with root package name */
    private final NotFoundClasses f144758e;

    /* renamed from: f, reason: collision with root package name */
    private final AnnotationDeserializer f144759f;

    /* renamed from: g, reason: collision with root package name */
    private MetadataVersion f144760g;

    /* JADX INFO: Access modifiers changed from: private */
    abstract class AbstractAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public abstract void g(Name name, ArrayList<ConstantValue<?>> arrayList);

        public abstract void h(Name name, ConstantValue<?> constantValue);

        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void b(Name name, ClassId enumClassId, Name enumEntryName) {
            Intrinsics.j(enumClassId, "enumClassId");
            Intrinsics.j(enumEntryName, "enumEntryName");
            h(name, new EnumValue(enumClassId, enumEntryName));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor c(final Name name, ClassId classId) {
            Intrinsics.j(classId, "classId");
            final ArrayList arrayList = new ArrayList();
            BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = BinaryClassAnnotationAndConstantLoaderImpl.this;
            SourceElement NO_SOURCE = SourceElement.f143647a;
            Intrinsics.i(NO_SOURCE, "NO_SOURCE");
            final KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorX = binaryClassAnnotationAndConstantLoaderImpl.x(classId, NO_SOURCE, arrayList);
            Intrinsics.g(annotationArgumentVisitorX);
            return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1

                /* renamed from: a, reason: collision with root package name */
                private final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f144762a;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f144764c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Name f144765d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ ArrayList<AnnotationDescriptor> f144766e;

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void b(Name name2, ClassId enumClassId, Name enumEntryName) {
                    Intrinsics.j(enumClassId, "enumClassId");
                    Intrinsics.j(enumEntryName, "enumEntryName");
                    this.f144762a.b(name2, enumClassId, enumEntryName);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor c(Name name2, ClassId classId2) {
                    Intrinsics.j(classId2, "classId");
                    return this.f144762a.c(name2, classId2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void d(Name name2, ClassLiteralValue value) {
                    Intrinsics.j(value, "value");
                    this.f144762a.d(name2, value);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void e(Name name2, Object obj) {
                    this.f144762a.e(name2, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name2) {
                    return this.f144762a.f(name2);
                }

                {
                    this.f144764c = this;
                    this.f144765d = name;
                    this.f144766e = arrayList;
                    this.f144762a = this.f144763b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void a() {
                    this.f144763b.a();
                    this.f144764c.h(this.f144765d, new AnnotationValue((AnnotationDescriptor) CollectionsKt.U0(this.f144766e)));
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void d(Name name, ClassLiteralValue value) {
            Intrinsics.j(value, "value");
            h(name, new KClassValue(value));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void e(Name name, Object obj) {
            h(name, BinaryClassAnnotationAndConstantLoaderImpl.this.O(name, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
            return new BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl.this, name, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl(ModuleDescriptor module, NotFoundClasses notFoundClasses, StorageManager storageManager, KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        Intrinsics.j(module, "module");
        Intrinsics.j(notFoundClasses, "notFoundClasses");
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(kotlinClassFinder, "kotlinClassFinder");
        this.f144757d = module;
        this.f144758e = notFoundClasses;
        this.f144759f = new AnnotationDeserializer(module, notFoundClasses);
        this.f144760g = MetadataVersion.f145543i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConstantValue<?> O(Name name, Object obj) {
        ConstantValue<?> constantValueE = ConstantValueFactory.f146175a.e(obj, this.f144757d);
        if (constantValueE != null) {
            return constantValueE;
        }
        return ErrorValue.f146178b.a("Unsupported annotation argument: " + name);
    }

    private final ClassDescriptor R(ClassId classId) {
        return FindClassInModuleKt.d(this.f144757d, classId, this.f144758e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public AnnotationDescriptor i(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        return this.f144759f.a(proto, nameResolver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> I(String desc, Object initializer) {
        Intrinsics.j(desc, "desc");
        Intrinsics.j(initializer, "initializer");
        if (StringsKt.c0("ZBCS", desc, false, 2, null)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals("S")) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return ConstantValueFactory.f146175a.e(initializer, this.f144757d);
    }

    public void S(MetadataVersion metadataVersion) {
        Intrinsics.j(metadataVersion, "<set-?>");
        this.f144760g = metadataVersion;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> M(ConstantValue<?> constant) {
        Intrinsics.j(constant, "constant");
        return constant instanceof ByteValue ? new UByteValue(((ByteValue) constant).b().byteValue()) : constant instanceof ShortValue ? new UShortValue(((ShortValue) constant).b().shortValue()) : constant instanceof IntValue ? new UIntValue(((IntValue) constant).b().intValue()) : constant instanceof LongValue ? new ULongValue(((LongValue) constant).b().longValue()) : constant;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public MetadataVersion v() {
        return this.f144760g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    protected KotlinJvmBinaryClass.AnnotationArgumentVisitor x(final ClassId annotationClassId, final SourceElement source, final List<AnnotationDescriptor> result) {
        Intrinsics.j(annotationClassId, "annotationClassId");
        Intrinsics.j(source, "source");
        Intrinsics.j(result, "result");
        final ClassDescriptor classDescriptorR = R(annotationClassId);
        return new AbstractAnnotationArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1

            /* renamed from: b, reason: collision with root package name */
            private final HashMap<Name, ConstantValue<?>> f144775b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.f144775b = new HashMap<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void a() {
                if (this.f144776c.F(annotationClassId, this.f144775b) || this.f144776c.w(annotationClassId)) {
                    return;
                }
                result.add(new AnnotationDescriptorImpl(classDescriptorR.o(), this.f144775b, source));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void g(Name name, ArrayList<ConstantValue<?>> elements) {
                Intrinsics.j(elements, "elements");
                if (name == null) {
                    return;
                }
                ValueParameterDescriptor valueParameterDescriptorB = DescriptorResolverUtils.b(name, classDescriptorR);
                if (valueParameterDescriptorB != null) {
                    HashMap<Name, ConstantValue<?>> map = this.f144775b;
                    ConstantValueFactory constantValueFactory = ConstantValueFactory.f146175a;
                    List<? extends ConstantValue<?>> listC = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.c(elements);
                    KotlinType type = valueParameterDescriptorB.getType();
                    Intrinsics.i(type, "getType(...)");
                    map.put(name, constantValueFactory.c(listC, type));
                    return;
                }
                if (this.f144776c.w(annotationClassId) && Intrinsics.e(name.b(), "value")) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : elements) {
                        if (obj instanceof AnnotationValue) {
                            arrayList.add(obj);
                        }
                    }
                    List<AnnotationDescriptor> list = result;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        list.add(((AnnotationValue) it.next()).b());
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void h(Name name, ConstantValue<?> value) {
                Intrinsics.j(value, "value");
                if (name != null) {
                    this.f144775b.put(name, value);
                }
            }
        };
    }
}
