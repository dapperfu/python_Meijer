package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes13.dex */
public final class AnnotationUtilKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Name f143684a;

    /* renamed from: b, reason: collision with root package name */
    private static final Name f143685b;

    /* renamed from: c, reason: collision with root package name */
    private static final Name f143686c;

    /* renamed from: d, reason: collision with root package name */
    private static final Name f143687d;

    /* renamed from: e, reason: collision with root package name */
    private static final Name f143688e;

    static {
        Name nameO = Name.o("message");
        Intrinsics.i(nameO, "identifier(...)");
        f143684a = nameO;
        Name nameO2 = Name.o("replaceWith");
        Intrinsics.i(nameO2, "identifier(...)");
        f143685b = nameO2;
        Name nameO3 = Name.o("level");
        Intrinsics.i(nameO3, "identifier(...)");
        f143686c = nameO3;
        Name nameO4 = Name.o("expression");
        Intrinsics.i(nameO4, "identifier(...)");
        f143687d = nameO4;
        Name nameO5 = Name.o("imports");
        Intrinsics.i(nameO5, "identifier(...)");
        f143688e = nameO5;
    }

    public static final AnnotationDescriptor b(KotlinBuiltIns kotlinBuiltIns, String message, String replaceWith, String level, boolean z10) {
        Intrinsics.j(kotlinBuiltIns, "<this>");
        Intrinsics.j(message, "message");
        Intrinsics.j(replaceWith, "replaceWith");
        Intrinsics.j(level, "level");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.f143322B, MapsKt.o(TuplesKt.a(f143687d, new StringValue(replaceWith)), TuplesKt.a(f143688e, new ArrayValue(CollectionsKt.m(), new a(kotlinBuiltIns)))), false, 8, null);
        FqName fqName = StandardNames.FqNames.f143416y;
        Pair pairA = TuplesKt.a(f143684a, new StringValue(message));
        Pair pairA2 = TuplesKt.a(f143685b, new AnnotationValue(builtInAnnotationDescriptor));
        Name name = f143686c;
        ClassId classIdC = ClassId.f145674d.c(StandardNames.FqNames.f143320A);
        Name nameO = Name.o(level);
        Intrinsics.i(nameO, "identifier(...)");
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, MapsKt.o(pairA, pairA2, TuplesKt.a(name, new EnumValue(classIdC, nameO))), z10);
    }

    public static /* synthetic */ AnnotationDescriptor c(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return b(kotlinBuiltIns, str, str2, str3, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType d(KotlinBuiltIns kotlinBuiltIns, ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        SimpleType simpleTypeM = module.l().m(Variance.f146796e, kotlinBuiltIns.X());
        Intrinsics.i(simpleTypeM, "getArrayType(...)");
        return simpleTypeM;
    }
}
