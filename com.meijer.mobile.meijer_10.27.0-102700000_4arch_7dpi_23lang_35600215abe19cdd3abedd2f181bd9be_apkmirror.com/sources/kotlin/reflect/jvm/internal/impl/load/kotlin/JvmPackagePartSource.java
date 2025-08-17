package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class JvmPackagePartSource implements DeserializedContainerSource {

    /* renamed from: b, reason: collision with root package name */
    private final JvmClassName f144798b;

    /* renamed from: c, reason: collision with root package name */
    private final JvmClassName f144799c;

    /* renamed from: d, reason: collision with root package name */
    private final IncompatibleVersionErrorData<MetadataVersion> f144800d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f144801e;

    /* renamed from: f, reason: collision with root package name */
    private final DeserializedContainerAbiStability f144802f;

    /* renamed from: g, reason: collision with root package name */
    private final KotlinJvmBinaryClass f144803g;

    /* renamed from: h, reason: collision with root package name */
    private final String f144804h;

    public JvmPackagePartSource(JvmClassName className, JvmClassName jvmClassName, ProtoBuf.Package packageProto, NameResolver nameResolver, IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, boolean z10, DeserializedContainerAbiStability abiStability, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String string;
        Intrinsics.j(className, "className");
        Intrinsics.j(packageProto, "packageProto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(abiStability, "abiStability");
        this.f144798b = className;
        this.f144799c = jvmClassName;
        this.f144800d = incompatibleVersionErrorData;
        this.f144801e = z10;
        this.f144802f = abiStability;
        this.f144803g = kotlinJvmBinaryClass;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageModuleName = JvmProtoBuf.f145565m;
        Intrinsics.i(packageModuleName, "packageModuleName");
        Integer num = (Integer) ProtoBufUtilKt.a(packageProto, packageModuleName);
        this.f144804h = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public String a() {
        return "Class '" + d().a().a() + '\'';
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile b() {
        SourceFile NO_SOURCE_FILE = SourceFile.f143648a;
        Intrinsics.i(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final ClassId d() {
        FqName fqNameG = e().g();
        Intrinsics.i(fqNameG, "getPackageFqName(...)");
        return new ClassId(fqNameG, h());
    }

    public JvmClassName e() {
        return this.f144798b;
    }

    public JvmClassName f() {
        return this.f144799c;
    }

    public final KotlinJvmBinaryClass g() {
        return this.f144803g;
    }

    public String toString() {
        return JvmPackagePartSource.class.getSimpleName() + ": " + e();
    }

    public final Name h() {
        String strF = e().f();
        Intrinsics.i(strF, "getInternalName(...)");
        Name nameO = Name.o(StringsKt.n1(strF, '/', null, 2, null));
        Intrinsics.i(nameO, "identifier(...)");
        return nameO;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmPackagePartSource(KotlinJvmBinaryClass kotlinClass, ProtoBuf.Package packageProto, NameResolver nameResolver, IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, boolean z10, DeserializedContainerAbiStability abiStability) {
        Intrinsics.j(kotlinClass, "kotlinClass");
        Intrinsics.j(packageProto, "packageProto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(abiStability, "abiStability");
        JvmClassName jvmClassNameB = JvmClassName.b(kotlinClass.f());
        Intrinsics.i(jvmClassNameB, "byClassId(...)");
        String strE = kotlinClass.b().e();
        JvmClassName jvmClassNameD = null;
        if (strE != null && strE.length() > 0) {
            jvmClassNameD = JvmClassName.d(strE);
        }
        this(jvmClassNameB, jvmClassNameD, packageProto, nameResolver, incompatibleVersionErrorData, z10, abiStability, kotlinClass);
    }
}
