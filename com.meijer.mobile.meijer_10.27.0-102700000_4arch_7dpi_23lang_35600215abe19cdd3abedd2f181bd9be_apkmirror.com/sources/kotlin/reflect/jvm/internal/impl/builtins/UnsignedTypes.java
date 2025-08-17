package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class UnsignedTypes {

    /* renamed from: a, reason: collision with root package name */
    public static final UnsignedTypes f143438a = new UnsignedTypes();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<Name> f143439b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set<Name> f143440c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<ClassId, ClassId> f143441d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap<ClassId, ClassId> f143442e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<UnsignedArrayType, Name> f143443f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<Name> f143444g;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.l());
        }
        f143439b = CollectionsKt.o1(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.b());
        }
        f143440c = CollectionsKt.o1(arrayList2);
        f143441d = new HashMap<>();
        f143442e = new HashMap<>();
        f143443f = MapsKt.m(TuplesKt.a(UnsignedArrayType.f143421c, Name.o("ubyteArrayOf")), TuplesKt.a(UnsignedArrayType.f143422d, Name.o("ushortArrayOf")), TuplesKt.a(UnsignedArrayType.f143423e, Name.o("uintArrayOf")), TuplesKt.a(UnsignedArrayType.f143424f, Name.o("ulongArrayOf")));
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.b().h());
        }
        f143444g = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f143441d.put(unsignedType3.b(), unsignedType3.e());
            f143442e.put(unsignedType3.e(), unsignedType3.b());
        }
    }

    @JvmStatic
    public static final boolean d(KotlinType type) {
        ClassifierDescriptor classifierDescriptorD;
        Intrinsics.j(type, "type");
        if (TypeUtils.w(type) || (classifierDescriptorD = type.K0().d()) == null) {
            return false;
        }
        return f143438a.c(classifierDescriptorD);
    }

    public final ClassId a(ClassId arrayClassId) {
        Intrinsics.j(arrayClassId, "arrayClassId");
        return f143441d.get(arrayClassId);
    }

    public final boolean b(Name name) {
        Intrinsics.j(name, "name");
        return f143444g.contains(name);
    }

    public final boolean c(DeclarationDescriptor descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        DeclarationDescriptor declarationDescriptorB = descriptor.b();
        return (declarationDescriptorB instanceof PackageFragmentDescriptor) && Intrinsics.e(((PackageFragmentDescriptor) declarationDescriptorB).e(), StandardNames.f143284A) && f143439b.contains(descriptor.getName());
    }

    private UnsignedTypes() {
    }
}
