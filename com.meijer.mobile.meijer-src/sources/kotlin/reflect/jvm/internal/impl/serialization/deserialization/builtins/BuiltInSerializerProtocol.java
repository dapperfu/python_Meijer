package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class BuiltInSerializerProtocol extends SerializerExtensionProtocol {

    /* renamed from: r, reason: collision with root package name */
    public static final BuiltInSerializerProtocol f147358r = new BuiltInSerializerProtocol();

    public final String q(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return s(fqName) + ".kotlin_builtins";
    }

    public final String r(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return StringsKt.P(fqName.a(), '.', '/', false, 4, null) + '/' + q(fqName);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BuiltInSerializerProtocol() {
        ExtensionRegistryLite extensionRegistryLiteD = ExtensionRegistryLite.d();
        BuiltInsProtoBuf.a(extensionRegistryLiteD);
        Intrinsics.i(extensionRegistryLiteD, "apply(...)");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageFqName = BuiltInsProtoBuf.f146386a;
        Intrinsics.i(packageFqName, "packageFqName");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> constructorAnnotation = BuiltInsProtoBuf.f146388c;
        Intrinsics.i(constructorAnnotation, "constructorAnnotation");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> classAnnotation = BuiltInsProtoBuf.f146387b;
        Intrinsics.i(classAnnotation, "classAnnotation");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionAnnotation = BuiltInsProtoBuf.f146389d;
        Intrinsics.i(functionAnnotation, "functionAnnotation");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyAnnotation = BuiltInsProtoBuf.f146390e;
        Intrinsics.i(propertyAnnotation, "propertyAnnotation");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyGetterAnnotation = BuiltInsProtoBuf.f146391f;
        Intrinsics.i(propertyGetterAnnotation, "propertyGetterAnnotation");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertySetterAnnotation = BuiltInsProtoBuf.f146392g;
        Intrinsics.i(propertySetterAnnotation, "propertySetterAnnotation");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> enumEntryAnnotation = BuiltInsProtoBuf.f146394i;
        Intrinsics.i(enumEntryAnnotation, "enumEntryAnnotation");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> compileTimeValue = BuiltInsProtoBuf.f146393h;
        Intrinsics.i(compileTimeValue, "compileTimeValue");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> parameterAnnotation = BuiltInsProtoBuf.f146395j;
        Intrinsics.i(parameterAnnotation, "parameterAnnotation");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> typeAnnotation = BuiltInsProtoBuf.f146396k;
        Intrinsics.i(typeAnnotation, "typeAnnotation");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> typeParameterAnnotation = BuiltInsProtoBuf.f146397l;
        Intrinsics.i(typeParameterAnnotation, "typeParameterAnnotation");
        super(extensionRegistryLiteD, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, null, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, null, null, null, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    private final String s(FqName fqName) {
        if (fqName.c()) {
            return "default-package";
        }
        String strB = fqName.f().b();
        Intrinsics.i(strB, "asString(...)");
        return strB;
    }
}
