package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* loaded from: classes13.dex */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f146762c = new Companion(null);

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        public final TypeConstructorSubstitution c(Map<TypeConstructor, ? extends TypeProjection> map) {
            Intrinsics.j(map, "map");
            return e(this, map, false, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ TypeConstructorSubstitution e(Companion companion, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.d(map, z10);
        }

        @JvmStatic
        public final TypeSubstitution a(KotlinType kotlinType) {
            Intrinsics.j(kotlinType, "kotlinType");
            return b(kotlinType.K0(), kotlinType.I0());
        }

        @JvmStatic
        public final TypeSubstitution b(TypeConstructor typeConstructor, List<? extends TypeProjection> arguments) {
            Intrinsics.j(typeConstructor, "typeConstructor");
            Intrinsics.j(arguments, "arguments");
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.i(parameters, "getParameters(...)");
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.F0(parameters);
            if (typeParameterDescriptor == null || !typeParameterDescriptor.P()) {
                return new IndexedParametersSubstitution(parameters, arguments);
            }
            List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
            Intrinsics.i(parameters2, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters2;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).i());
            }
            return e(this, MapsKt.y(CollectionsKt.u1(arrayList, arguments)), false, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final TypeConstructorSubstitution d(final Map<TypeConstructor, ? extends TypeProjection> map, final boolean z10) {
            Intrinsics.j(map, "map");
            return new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean a() {
                    return z10;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean f() {
                    return map.isEmpty();
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                public TypeProjection k(TypeConstructor key) {
                    Intrinsics.j(key, "key");
                    return map.get(key);
                }
            };
        }
    }

    @JvmStatic
    public static final TypeSubstitution i(TypeConstructor typeConstructor, List<? extends TypeProjection> list) {
        return f146762c.b(typeConstructor, list);
    }

    @JvmStatic
    @JvmOverloads
    public static final TypeConstructorSubstitution j(Map<TypeConstructor, ? extends TypeProjection> map) {
        return f146762c.c(map);
    }

    public abstract TypeProjection k(TypeConstructor typeConstructor);

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public TypeProjection e(KotlinType key) {
        Intrinsics.j(key, "key");
        return k(key.K0());
    }
}
