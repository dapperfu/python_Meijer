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

/* loaded from: classes14.dex */
public final class TypeAliasExpansion {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f147641e = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final TypeAliasExpansion f147642a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAliasDescriptor f147643b;

    /* renamed from: c, reason: collision with root package name */
    private final List<TypeProjection> f147644c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<TypeParameterDescriptor, TypeProjection> f147645d;

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
        this.f147642a = typeAliasExpansion;
        this.f147643b = typeAliasDescriptor;
        this.f147644c = list;
        this.f147645d = map;
    }

    public final List<TypeProjection> a() {
        return this.f147644c;
    }

    public final TypeAliasDescriptor b() {
        return this.f147643b;
    }

    public final TypeProjection c(TypeConstructor constructor) {
        Intrinsics.j(constructor, "constructor");
        ClassifierDescriptor classifierDescriptorD = constructor.d();
        if (classifierDescriptorD instanceof TypeParameterDescriptor) {
            return this.f147645d.get(classifierDescriptorD);
        }
        return null;
    }

    public final boolean d(TypeAliasDescriptor descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        if (Intrinsics.e(this.f147643b, descriptor)) {
            return true;
        }
        TypeAliasExpansion typeAliasExpansion = this.f147642a;
        return typeAliasExpansion != null ? typeAliasExpansion.d(descriptor) : false;
    }
}
