package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* loaded from: classes13.dex */
public final class TypeAliasExpansion {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f146734e = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final TypeAliasExpansion f146735a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAliasDescriptor f146736b;

    /* renamed from: c, reason: collision with root package name */
    private final List<TypeProjection> f146737c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<TypeParameterDescriptor, TypeProjection> f146738d;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TypeAliasExpansion a(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> arguments) {
            Intrinsics.j(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.j(arguments, "arguments");
            List<TypeParameterDescriptor> parameters = typeAliasDescriptor.i().getParameters();
            Intrinsics.i(parameters, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).H0());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, arguments, MapsKt.y(CollectionsKt.u1(arrayList, arguments)), null);
        }
    }

    public /* synthetic */ TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeAliasExpansion, typeAliasDescriptor, list, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> list, Map<TypeParameterDescriptor, ? extends TypeProjection> map) {
        this.f146735a = typeAliasExpansion;
        this.f146736b = typeAliasDescriptor;
        this.f146737c = list;
        this.f146738d = map;
    }

    public final List<TypeProjection> a() {
        return this.f146737c;
    }

    public final TypeAliasDescriptor b() {
        return this.f146736b;
    }

    public final TypeProjection c(TypeConstructor constructor) {
        Intrinsics.j(constructor, "constructor");
        ClassifierDescriptor classifierDescriptorD = constructor.d();
        if (classifierDescriptorD instanceof TypeParameterDescriptor) {
            return this.f146738d.get(classifierDescriptorD);
        }
        return null;
    }

    public final boolean d(TypeAliasDescriptor descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        if (Intrinsics.e(this.f146736b, descriptor)) {
            return true;
        }
        TypeAliasExpansion typeAliasExpansion = this.f146735a;
        return typeAliasExpansion != null ? typeAliasExpansion.d(descriptor) : false;
    }
}
