package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class JavaAnnotationTargetMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaAnnotationTargetMapper f145240a = new JavaAnnotationTargetMapper();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, EnumSet<KotlinTarget>> f145241b = MapsKt.o(TuplesKt.a("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), TuplesKt.a("TYPE", EnumSet.of(KotlinTarget.f144669t, KotlinTarget.f144620G)), TuplesKt.a("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.f144670u)), TuplesKt.a("TYPE_PARAMETER", EnumSet.of(KotlinTarget.f144671v)), TuplesKt.a("FIELD", EnumSet.of(KotlinTarget.f144673x)), TuplesKt.a("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.f144674y)), TuplesKt.a("PARAMETER", EnumSet.of(KotlinTarget.f144675z)), TuplesKt.a("CONSTRUCTOR", EnumSet.of(KotlinTarget.f144614A)), TuplesKt.a("METHOD", EnumSet.of(KotlinTarget.f144615B, KotlinTarget.f144616C, KotlinTarget.f144617D)), TuplesKt.a("TYPE_USE", EnumSet.of(KotlinTarget.f144618E)));

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, KotlinRetention> f145242c = MapsKt.o(TuplesKt.a("RUNTIME", KotlinRetention.f144609a), TuplesKt.a("CLASS", KotlinRetention.f144610b), TuplesKt.a("SOURCE", KotlinRetention.f144611c));

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType e(ModuleDescriptor module) {
        KotlinType type;
        Intrinsics.j(module, "module");
        ValueParameterDescriptor valueParameterDescriptorB = DescriptorResolverUtils.b(JavaAnnotationMapper.f145235a.d(), module.l().p(StandardNames.FqNames.f144241H));
        return (valueParameterDescriptorB == null || (type = valueParameterDescriptorB.getType()) == null) ? ErrorUtils.d(ErrorTypeKind.f147815C0, new String[0]) : type;
    }

    public final ConstantValue<?> b(JavaAnnotationArgument javaAnnotationArgument) {
        JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? (JavaEnumValueAnnotationArgument) javaAnnotationArgument : null;
        if (javaEnumValueAnnotationArgument != null) {
            Map<String, KotlinRetention> map = f145242c;
            Name nameD = javaEnumValueAnnotationArgument.d();
            KotlinRetention kotlinRetention = map.get(nameD != null ? nameD.b() : null);
            if (kotlinRetention != null) {
                ClassId classIdC = ClassId.f146581d.c(StandardNames.FqNames.f144247K);
                Name nameO = Name.o(kotlinRetention.name());
                Intrinsics.i(nameO, "identifier(...)");
                return new EnumValue(classIdC, nameO);
            }
        }
        return null;
    }

    public final Set<KotlinTarget> c(String str) {
        EnumSet<KotlinTarget> enumSet = f145241b.get(str);
        return enumSet != null ? enumSet : SetsKt.e();
    }

    public final ConstantValue<?> d(List<? extends JavaAnnotationArgument> arguments) {
        Intrinsics.j(arguments, "arguments");
        ArrayList<JavaEnumValueAnnotationArgument> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList();
        for (JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument : arrayList) {
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = f145240a;
            Name nameD = javaEnumValueAnnotationArgument.d();
            CollectionsKt.C(arrayList2, javaAnnotationTargetMapper.c(nameD != null ? nameD.b() : null));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            ClassId classIdC = ClassId.f146581d.c(StandardNames.FqNames.f144245J);
            Name nameO = Name.o(kotlinTarget.name());
            Intrinsics.i(nameO, "identifier(...)");
            arrayList3.add(new EnumValue(classIdC, nameO));
        }
        return new ArrayValue(arrayList3, b.f145260a);
    }

    private JavaAnnotationTargetMapper() {
    }
}
