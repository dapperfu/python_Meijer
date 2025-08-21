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
/* loaded from: classes14.dex */
public final class JvmPackagePartSource implements DeserializedContainerSource {

    /* renamed from: b, reason: collision with root package name */
    private final JvmClassName f145705b;

    /* renamed from: c, reason: collision with root package name */
    private final JvmClassName f145706c;

    /* renamed from: d, reason: collision with root package name */
    private final IncompatibleVersionErrorData<MetadataVersion> f145707d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f145708e;

    /* renamed from: f, reason: collision with root package name */
    private final DeserializedContainerAbiStability f145709f;

    /* renamed from: g, reason: collision with root package name */
    private final KotlinJvmBinaryClass f145710g;

    /* renamed from: h, reason: collision with root package name */
    private final String f145711h;

    public JvmPackagePartSource(JvmClassName className, JvmClassName jvmClassName, ProtoBuf.Package packageProto, NameResolver nameResolver, IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, boolean z10, DeserializedContainerAbiStability abiStability, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String string;
        Intrinsics.j(className, "className");
        Intrinsics.j(packageProto, "packageProto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(abiStability, "abiStability");
        this.f145705b = className;
        this.f145706c = jvmClassName;
        this.f145707d = incompatibleVersionErrorData;
        this.f145708e = z10;
        this.f145709f = abiStability;
        this.f145710g = kotlinJvmBinaryClass;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageModuleName = JvmProtoBuf.f146472m;
        Intrinsics.i(packageModuleName, "packageModuleName");
        Integer num = (Integer) ProtoBufUtilKt.a(packageProto, packageModuleName);
        this.f145711h = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public String a() {
        return "Class '" + d().a().a() + '\'';
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile b() {
        SourceFile NO_SOURCE_FILE = SourceFile.f144555a;
        Intrinsics.i(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final ClassId d() {
        FqName fqNameG = e().g();
        Intrinsics.i(fqNameG, "getPackageFqName(...)");
        return new ClassId(fqNameG, h());
    }

    public JvmClassName e() {
        return this.f145705b;
    }

    public JvmClassName f() {
        return this.f145706c;
    }

    public final KotlinJvmBinaryClass g() {
        return this.f145710g;
    }

    public String toString() {
        return JvmPackagePartSource.class.getSimpleName() + ": " + e();
    }

    public final Name h() {
        String strF = e().f();
        Intrinsics.i(strF, "getInternalName(...)");
        Name nameO = Name.o(StringsKt.r1(strF, '/', null, 2, null));
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
