package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class DeserializedDescriptorResolver {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f144785b = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Set<KotlinClassHeader.Kind> f144786c = SetsKt.d(KotlinClassHeader.Kind.f144868e);

    /* renamed from: d, reason: collision with root package name */
    private static final Set<KotlinClassHeader.Kind> f144787d = SetsKt.i(KotlinClassHeader.Kind.f144869f, KotlinClassHeader.Kind.f144872i);

    /* renamed from: e, reason: collision with root package name */
    private static final MetadataVersion f144788e = new MetadataVersion(1, 1, 2);

    /* renamed from: f, reason: collision with root package name */
    private static final MetadataVersion f144789f = new MetadataVersion(1, 1, 11);

    /* renamed from: g, reason: collision with root package name */
    private static final MetadataVersion f144790g = new MetadataVersion(1, 1, 13);

    /* renamed from: a, reason: collision with root package name */
    public DeserializationComponents f144791a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MetadataVersion a() {
            return DeserializedDescriptorResolver.f144790g;
        }
    }

    public final MemberScope c(PackageFragmentDescriptor descriptor, KotlinJvmBinaryClass kotlinClass) {
        String[] strArrG;
        Pair<JvmNameResolver, ProtoBuf.Package> pairM;
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f144787d);
        if (strArrM == null || (strArrG = kotlinClass.b().g()) == null) {
            return null;
        }
        try {
            try {
                pairM = JvmProtoBufUtil.m(strArrM, strArrG);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e10);
            }
        } catch (Throwable th2) {
            if (i() || kotlinClass.b().d().h(h())) {
                throw th2;
            }
            pairM = null;
        }
        if (pairM == null) {
            return null;
        }
        JvmNameResolver jvmNameResolverA = pairM.a();
        ProtoBuf.Package packageB = pairM.b();
        JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinClass, packageB, jvmNameResolverA, g(kotlinClass), k(kotlinClass), e(kotlinClass));
        return new DeserializedPackageMemberScope(descriptor, packageB, jvmNameResolverA, kotlinClass.b().d(), jvmPackagePartSource, f(), "scope for " + jvmPackagePartSource + " in " + descriptor, d.f144854a);
    }

    public final DeserializationComponents f() {
        DeserializationComponents deserializationComponents = this.f144791a;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.y("components");
        return null;
    }

    public final ClassData l(KotlinJvmBinaryClass kotlinClass) {
        String[] strArrG;
        Pair<JvmNameResolver, ProtoBuf.Class> pairI;
        Intrinsics.j(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f144786c);
        if (strArrM == null || (strArrG = kotlinClass.b().g()) == null) {
            return null;
        }
        try {
            try {
                pairI = JvmProtoBufUtil.i(strArrM, strArrG);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e10);
            }
        } catch (Throwable th2) {
            if (i() || kotlinClass.b().d().h(h())) {
                throw th2;
            }
            pairI = null;
        }
        if (pairI == null) {
            return null;
        }
        return new ClassData(pairI.a(), pairI.b(), kotlinClass.b().d(), new KotlinJvmBinarySourceElement(kotlinClass, g(kotlinClass), k(kotlinClass), e(kotlinClass)));
    }

    public final ClassDescriptor n(KotlinJvmBinaryClass kotlinClass) {
        Intrinsics.j(kotlinClass, "kotlinClass");
        ClassData classDataL = l(kotlinClass);
        if (classDataL == null) {
            return null;
        }
        return f().f().e(kotlinClass.f(), classDataL);
    }

    public final void o(DeserializationComponentsForJava components) {
        Intrinsics.j(components, "components");
        p(components.a());
    }

    public final void p(DeserializationComponents deserializationComponents) {
        Intrinsics.j(deserializationComponents, "<set-?>");
        this.f144791a = deserializationComponents;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection d() {
        return CollectionsKt.m();
    }

    private final DeserializedContainerAbiStability e(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (f().g().e()) {
            return DeserializedContainerAbiStability.f146502a;
        }
        if (kotlinJvmBinaryClass.b().j()) {
            return DeserializedContainerAbiStability.f146503b;
        }
        return DeserializedContainerAbiStability.f146502a;
    }

    private final IncompatibleVersionErrorData<MetadataVersion> g(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (!i() && !kotlinJvmBinaryClass.b().d().h(h())) {
            return new IncompatibleVersionErrorData<>(kotlinJvmBinaryClass.b().d(), MetadataVersion.f145543i, h(), h().k(kotlinJvmBinaryClass.b().d().j()), kotlinJvmBinaryClass.getLocation(), kotlinJvmBinaryClass.f());
        }
        return null;
    }

    private final MetadataVersion h() {
        return f().g().d();
    }

    private final boolean i() {
        return f().g().f();
    }

    private final boolean j(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (!f().g().b() && kotlinJvmBinaryClass.b().i() && Intrinsics.e(kotlinJvmBinaryClass.b().d(), f144789f)) {
            return true;
        }
        return false;
    }

    private final boolean k(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if ((f().g().g() && (kotlinJvmBinaryClass.b().i() || Intrinsics.e(kotlinJvmBinaryClass.b().d(), f144788e))) || j(kotlinJvmBinaryClass)) {
            return true;
        }
        return false;
    }

    private final String[] m(KotlinJvmBinaryClass kotlinJvmBinaryClass, Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader kotlinClassHeaderB = kotlinJvmBinaryClass.b();
        String[] strArrA = kotlinClassHeaderB.a();
        if (strArrA == null) {
            strArrA = kotlinClassHeaderB.b();
        }
        if (strArrA == null || !set.contains(kotlinClassHeaderB.c())) {
            return null;
        }
        return strArrA;
    }
}
