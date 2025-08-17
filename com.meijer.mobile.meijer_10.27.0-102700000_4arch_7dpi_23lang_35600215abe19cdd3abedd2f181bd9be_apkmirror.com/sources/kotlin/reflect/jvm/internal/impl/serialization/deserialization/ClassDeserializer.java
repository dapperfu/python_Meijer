package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ClassDeserializer {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f146362c = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Set<ClassId> f146363d = SetsKt.d(ClassId.f145674d.c(StandardNames.FqNames.f143374d.m()));

    /* renamed from: a, reason: collision with root package name */
    private final DeserializationComponents f146364a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<a, ClassDescriptor> f146365b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<ClassId> a() {
            return ClassDeserializer.f146363d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ClassId f146366a;

        /* renamed from: b, reason: collision with root package name */
        private final ClassData f146367b;

        public a(ClassId classId, ClassData classData) {
            Intrinsics.j(classId, "classId");
            this.f146366a = classId;
            this.f146367b = classData;
        }

        public final ClassData a() {
            return this.f146367b;
        }

        public final ClassId b() {
            return this.f146366a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.e(this.f146366a, ((a) obj).f146366a);
        }

        public int hashCode() {
            return this.f146366a.hashCode();
        }
    }

    public ClassDeserializer(DeserializationComponents components) {
        Intrinsics.j(components, "components");
        this.f146364a = components;
        this.f146365b = components.u().g(new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor c(ClassDeserializer classDeserializer, a key) {
        Intrinsics.j(key, "key");
        return classDeserializer.d(key);
    }

    public static /* synthetic */ ClassDescriptor f(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            classData = null;
        }
        return classDeserializer.e(classId, classData);
    }

    public final ClassDescriptor e(ClassId classId, ClassData classData) {
        Intrinsics.j(classId, "classId");
        return this.f146365b.invoke(new a(classId, classData));
    }

    private final ClassDescriptor d(a aVar) {
        Object next;
        DeserializationContext deserializationContextA;
        DeserializedClassDescriptor deserializedClassDescriptor;
        ClassId classIdB = aVar.b();
        Iterator<ClassDescriptorFactory> it = this.f146364a.l().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorC = it.next().c(classIdB);
            if (classDescriptorC != null) {
                return classDescriptorC;
            }
        }
        if (f146363d.contains(classIdB)) {
            return null;
        }
        ClassData classDataA = aVar.a();
        if (classDataA == null && (classDataA = this.f146364a.e().a(classIdB)) == null) {
            return null;
        }
        NameResolver nameResolverA = classDataA.a();
        ProtoBuf.Class classB = classDataA.b();
        BinaryVersion binaryVersionC = classDataA.c();
        SourceElement sourceElementD = classDataA.d();
        ClassId classIdE = classIdB.e();
        if (classIdE != null) {
            ClassDescriptor classDescriptorF = f(this, classIdE, null, 2, null);
            if (classDescriptorF instanceof DeserializedClassDescriptor) {
                deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptorF;
            } else {
                deserializedClassDescriptor = null;
            }
            if (deserializedClassDescriptor == null || !deserializedClassDescriptor.h1(classIdB.h())) {
                return null;
            }
            deserializationContextA = deserializedClassDescriptor.a1();
        } else {
            Iterator<T> it2 = PackageFragmentProviderKt.c(this.f146364a.s(), classIdB.f()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) next;
                    if (!(packageFragmentDescriptor instanceof DeserializedPackageFragment) || ((DeserializedPackageFragment) packageFragmentDescriptor).H0(classIdB.h())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) next;
            if (packageFragmentDescriptor2 == null) {
                return null;
            }
            DeserializationComponents deserializationComponents = this.f146364a;
            ProtoBuf.TypeTable typeTableN1 = classB.n1();
            Intrinsics.i(typeTableN1, "getTypeTable(...)");
            TypeTable typeTable = new TypeTable(typeTableN1);
            VersionRequirementTable.Companion companion = VersionRequirementTable.f145550b;
            ProtoBuf.VersionRequirementTable versionRequirementTableP1 = classB.p1();
            Intrinsics.i(versionRequirementTableP1, "getVersionRequirementTable(...)");
            deserializationContextA = deserializationComponents.a(packageFragmentDescriptor2, nameResolverA, typeTable, companion.a(versionRequirementTableP1), binaryVersionC, null);
            binaryVersionC = binaryVersionC;
        }
        return new DeserializedClassDescriptor(deserializationContextA, classB, nameResolverA, binaryVersionC, sourceElementD);
    }
}
