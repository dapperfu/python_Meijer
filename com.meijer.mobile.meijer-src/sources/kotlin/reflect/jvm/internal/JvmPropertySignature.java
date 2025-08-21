package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "KotlinProperty", "JavaMethodProperty", "JavaField", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class JvmPropertySignature {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JavaField extends JvmPropertySignature {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Field field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaField(Field field) {
            super(null);
            Intrinsics.j(field, "field");
            this.field = field;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* renamed from: a */
        public String getString() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.field.getName();
            Intrinsics.i(name, "getName(...)");
            sb2.append(JvmAbi.b(name));
            sb2.append("()");
            Class<?> type = this.field.getType();
            Intrinsics.i(type, "getType(...)");
            sb2.append(ReflectClassUtilKt.f(type));
            return sb2.toString();
        }

        /* renamed from: b, reason: from getter */
        public final Field getField() {
            return this.field;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Ljava/lang/reflect/Method;", "getterMethod", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "c", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JavaMethodProperty extends JvmPropertySignature {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Method getterMethod;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Method setterMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethodProperty(Method getterMethod, Method method) {
            super(null);
            Intrinsics.j(getterMethod, "getterMethod");
            this.getterMethod = getterMethod;
            this.setterMethod = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* renamed from: a */
        public String getString() {
            return RuntimeTypeMapperKt.d(this.getterMethod);
        }

        /* renamed from: b, reason: from getter */
        public final Method getGetterMethod() {
            return this.getterMethod;
        }

        /* renamed from: c, reason: from getter */
        public final Method getSetterMethod() {
            return this.setterMethod;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "", "c", "()Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "b", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "d", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "e", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "f", "Ljava/lang/String;", "string", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class KotlinProperty extends JvmPropertySignature {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final PropertyDescriptor descriptor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ProtoBuf.Property proto;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final JvmProtoBuf.JvmPropertySignature signature;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final NameResolver nameResolver;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final TypeTable typeTable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinProperty(PropertyDescriptor descriptor, ProtoBuf.Property proto, JvmProtoBuf.JvmPropertySignature signature, NameResolver nameResolver, TypeTable typeTable) {
            String str;
            super(null);
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(proto, "proto");
            Intrinsics.j(signature, "signature");
            Intrinsics.j(nameResolver, "nameResolver");
            Intrinsics.j(typeTable, "typeTable");
            this.descriptor = descriptor;
            this.proto = proto;
            this.signature = signature;
            this.nameResolver = nameResolver;
            this.typeTable = typeTable;
            if (signature.H()) {
                str = nameResolver.getString(signature.C().y()) + nameResolver.getString(signature.C().x());
            } else {
                JvmMemberSignature.Field fieldD = JvmProtoBufUtil.d(JvmProtoBufUtil.f146571a, proto, nameResolver, typeTable, false, 8, null);
                if (fieldD == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + descriptor);
                }
                String strB = fieldD.b();
                str = JvmAbi.b(strB) + c() + "()" + fieldD.c();
            }
            this.string = str;
        }

        private final String c() {
            String string;
            DeclarationDescriptor declarationDescriptorB = this.descriptor.b();
            Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
            if (Intrinsics.e(this.descriptor.getVisibility(), DescriptorVisibilities.f144506d) && (declarationDescriptorB instanceof DeserializedClassDescriptor)) {
                ProtoBuf.Class classB1 = ((DeserializedClassDescriptor) declarationDescriptorB).b1();
                GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> classModuleName = JvmProtoBuf.f146468i;
                Intrinsics.i(classModuleName, "classModuleName");
                Integer num = (Integer) ProtoBufUtilKt.a(classB1, classModuleName);
                if (num == null || (string = this.nameResolver.getString(num.intValue())) == null) {
                    string = "main";
                }
                return '$' + NameUtils.b(string);
            }
            if (!Intrinsics.e(this.descriptor.getVisibility(), DescriptorVisibilities.f144503a) || !(declarationDescriptorB instanceof PackageFragmentDescriptor)) {
                return "";
            }
            PropertyDescriptor propertyDescriptor = this.descriptor;
            Intrinsics.h(propertyDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            DeserializedContainerSource deserializedContainerSourceH = ((DeserializedPropertyDescriptor) propertyDescriptor).H();
            if (!(deserializedContainerSourceH instanceof JvmPackagePartSource)) {
                return "";
            }
            JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) deserializedContainerSourceH;
            if (jvmPackagePartSource.f() == null) {
                return "";
            }
            return '$' + jvmPackagePartSource.h().b();
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* renamed from: a, reason: from getter */
        public String getString() {
            return this.string;
        }

        /* renamed from: b, reason: from getter */
        public final PropertyDescriptor getDescriptor() {
            return this.descriptor;
        }

        /* renamed from: d, reason: from getter */
        public final NameResolver getNameResolver() {
            return this.nameResolver;
        }

        /* renamed from: e, reason: from getter */
        public final ProtoBuf.Property getProto() {
            return this.proto;
        }

        /* renamed from: f, reason: from getter */
        public final JvmProtoBuf.JvmPropertySignature getSignature() {
            return this.signature;
        }

        /* renamed from: g, reason: from getter */
        public final TypeTable getTypeTable() {
            return this.typeTable;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getterSignature", "setterSignature", "<init>", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V", "", "a", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "b", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "c", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MappedKotlinProperty extends JvmPropertySignature {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final JvmFunctionSignature.KotlinFunction getterSignature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final JvmFunctionSignature.KotlinFunction setterSignature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MappedKotlinProperty(JvmFunctionSignature.KotlinFunction getterSignature, JvmFunctionSignature.KotlinFunction kotlinFunction) {
            super(null);
            Intrinsics.j(getterSignature, "getterSignature");
            this.getterSignature = getterSignature;
            this.setterSignature = kotlinFunction;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* renamed from: a */
        public String getString() {
            return this.getterSignature.get_signature();
        }

        /* renamed from: b, reason: from getter */
        public final JvmFunctionSignature.KotlinFunction getGetterSignature() {
            return this.getterSignature;
        }

        /* renamed from: c, reason: from getter */
        public final JvmFunctionSignature.KotlinFunction getSetterSignature() {
            return this.setterSignature;
        }
    }

    public /* synthetic */ JvmPropertySignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String getString();

    private JvmPropertySignature() {
    }
}
