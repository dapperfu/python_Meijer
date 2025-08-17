package kotlin.reflect.jvm.internal.impl.serialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes13.dex */
public class SerializerExtensionProtocol {

    /* renamed from: a, reason: collision with root package name */
    private final ExtensionRegistryLite f146327a;

    /* renamed from: b, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f146328b;

    /* renamed from: c, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> f146329c;

    /* renamed from: d, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> f146330d;

    /* renamed from: e, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f146331e;

    /* renamed from: f, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f146332f;

    /* renamed from: g, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f146333g;

    /* renamed from: h, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f146334h;

    /* renamed from: i, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f146335i;

    /* renamed from: j, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f146336j;

    /* renamed from: k, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f146337k;

    /* renamed from: l, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f146338l;

    /* renamed from: m, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> f146339m;

    /* renamed from: n, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> f146340n;

    /* renamed from: o, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> f146341o;

    /* renamed from: p, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f146342p;

    /* renamed from: q, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f146343q;

    public SerializerExtensionProtocol(ExtensionRegistryLite extensionRegistry, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageFqName, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> constructorAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> classAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> generatedExtension, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyGetterAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertySetterAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension2, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension3, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension4, GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> enumEntryAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> compileTimeValue, GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> parameterAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> typeAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> typeParameterAnnotation) {
        Intrinsics.j(extensionRegistry, "extensionRegistry");
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(constructorAnnotation, "constructorAnnotation");
        Intrinsics.j(classAnnotation, "classAnnotation");
        Intrinsics.j(functionAnnotation, "functionAnnotation");
        Intrinsics.j(propertyAnnotation, "propertyAnnotation");
        Intrinsics.j(propertyGetterAnnotation, "propertyGetterAnnotation");
        Intrinsics.j(propertySetterAnnotation, "propertySetterAnnotation");
        Intrinsics.j(enumEntryAnnotation, "enumEntryAnnotation");
        Intrinsics.j(compileTimeValue, "compileTimeValue");
        Intrinsics.j(parameterAnnotation, "parameterAnnotation");
        Intrinsics.j(typeAnnotation, "typeAnnotation");
        Intrinsics.j(typeParameterAnnotation, "typeParameterAnnotation");
        this.f146327a = extensionRegistry;
        this.f146328b = packageFqName;
        this.f146329c = constructorAnnotation;
        this.f146330d = classAnnotation;
        this.f146331e = functionAnnotation;
        this.f146332f = generatedExtension;
        this.f146333g = propertyAnnotation;
        this.f146334h = propertyGetterAnnotation;
        this.f146335i = propertySetterAnnotation;
        this.f146336j = generatedExtension2;
        this.f146337k = generatedExtension3;
        this.f146338l = generatedExtension4;
        this.f146339m = enumEntryAnnotation;
        this.f146340n = compileTimeValue;
        this.f146341o = parameterAnnotation;
        this.f146342p = typeAnnotation;
        this.f146343q = typeParameterAnnotation;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> a() {
        return this.f146330d;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> b() {
        return this.f146340n;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> c() {
        return this.f146329c;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> d() {
        return this.f146339m;
    }

    public final ExtensionRegistryLite e() {
        return this.f146327a;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f() {
        return this.f146331e;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> g() {
        return this.f146332f;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> h() {
        return this.f146341o;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> i() {
        return this.f146333g;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> j() {
        return this.f146337k;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> k() {
        return this.f146338l;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> l() {
        return this.f146336j;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> m() {
        return this.f146334h;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> n() {
        return this.f146335i;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> o() {
        return this.f146342p;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> p() {
        return this.f146343q;
    }
}
