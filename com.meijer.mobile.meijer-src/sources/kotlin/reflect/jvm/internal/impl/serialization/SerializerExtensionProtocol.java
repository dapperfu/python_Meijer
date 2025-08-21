package kotlin.reflect.jvm.internal.impl.serialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes14.dex */
public class SerializerExtensionProtocol {

    /* renamed from: a, reason: collision with root package name */
    private final ExtensionRegistryLite f147234a;

    /* renamed from: b, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f147235b;

    /* renamed from: c, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> f147236c;

    /* renamed from: d, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> f147237d;

    /* renamed from: e, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f147238e;

    /* renamed from: f, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f147239f;

    /* renamed from: g, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f147240g;

    /* renamed from: h, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f147241h;

    /* renamed from: i, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f147242i;

    /* renamed from: j, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f147243j;

    /* renamed from: k, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f147244k;

    /* renamed from: l, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f147245l;

    /* renamed from: m, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> f147246m;

    /* renamed from: n, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> f147247n;

    /* renamed from: o, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> f147248o;

    /* renamed from: p, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f147249p;

    /* renamed from: q, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f147250q;

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
        this.f147234a = extensionRegistry;
        this.f147235b = packageFqName;
        this.f147236c = constructorAnnotation;
        this.f147237d = classAnnotation;
        this.f147238e = functionAnnotation;
        this.f147239f = generatedExtension;
        this.f147240g = propertyAnnotation;
        this.f147241h = propertyGetterAnnotation;
        this.f147242i = propertySetterAnnotation;
        this.f147243j = generatedExtension2;
        this.f147244k = generatedExtension3;
        this.f147245l = generatedExtension4;
        this.f147246m = enumEntryAnnotation;
        this.f147247n = compileTimeValue;
        this.f147248o = parameterAnnotation;
        this.f147249p = typeAnnotation;
        this.f147250q = typeParameterAnnotation;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> a() {
        return this.f147237d;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> b() {
        return this.f147247n;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> c() {
        return this.f147236c;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> d() {
        return this.f147246m;
    }

    public final ExtensionRegistryLite e() {
        return this.f147234a;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f() {
        return this.f147238e;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> g() {
        return this.f147239f;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> h() {
        return this.f147248o;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> i() {
        return this.f147240g;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> j() {
        return this.f147244k;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> k() {
        return this.f147245l;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> l() {
        return this.f147243j;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> m() {
        return this.f147241h;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> n() {
        return this.f147242i;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> o() {
        return this.f147249p;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> p() {
        return this.f147250q;
    }
}
