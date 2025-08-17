package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> implements Iterable<TypeAttribute<?>>, KMappedMarker {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f146740b = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final TypeAttributes f146741c = new TypeAttributes((List<? extends TypeAttribute<?>>) CollectionsKt.m());

    @SourceDebugExtension
    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public int c(ConcurrentHashMap<String, Integer> concurrentHashMap, String key, Function1<? super String, Integer> compute) {
            int iIntValue;
            Intrinsics.j(concurrentHashMap, "<this>");
            Intrinsics.j(key, "key");
            Intrinsics.j(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Integer numInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(numInvoke.intValue()));
                        iIntValue = numInvoke.intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iIntValue;
        }

        public final TypeAttributes j(List<? extends TypeAttribute<?>> attributes) {
            Intrinsics.j(attributes, "attributes");
            return attributes.isEmpty() ? k() : new TypeAttributes(attributes, null);
        }

        public final TypeAttributes k() {
            return TypeAttributes.f146741c;
        }
    }

    public /* synthetic */ TypeAttributes(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends TypeAttribute<?>>) list);
    }

    private TypeAttributes(List<? extends TypeAttribute<?>> list) {
        for (TypeAttribute<?> typeAttribute : list) {
            k(typeAttribute.b(), typeAttribute);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    protected TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> f() {
        return f146740b;
    }

    public final TypeAttributes p(TypeAttributes other) {
        Intrinsics.j(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f146740b.h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = a().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = other.a().get(iIntValue);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.a(typeAttribute) : null : typeAttribute.a(typeAttribute2));
        }
        return f146740b.j(arrayList);
    }

    public final boolean q(TypeAttribute<?> attribute) {
        Intrinsics.j(attribute, "attribute");
        return a().get(f146740b.f(attribute.b())) != null;
    }

    public final TypeAttributes r(TypeAttributes other) {
        Intrinsics.j(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f146740b.h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = a().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = other.a().get(iIntValue);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.c(typeAttribute) : null : typeAttribute.c(typeAttribute2));
        }
        return f146740b.j(arrayList);
    }

    public final TypeAttributes s(TypeAttribute<?> attribute) {
        Intrinsics.j(attribute, "attribute");
        if (q(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(attribute);
        }
        return f146740b.j(CollectionsKt.Q0(CollectionsKt.j1(this), attribute));
    }

    public final TypeAttributes t(TypeAttribute<?> attribute) {
        Intrinsics.j(attribute, "attribute");
        if (!isEmpty()) {
            ArrayMap<TypeAttribute<?>> arrayMapA = a();
            ArrayList arrayList = new ArrayList();
            for (TypeAttribute<?> typeAttribute : arrayMapA) {
                if (!Intrinsics.e(typeAttribute, attribute)) {
                    arrayList.add(typeAttribute);
                }
            }
            if (arrayList.size() != a().a()) {
                return f146740b.j(arrayList);
            }
        }
        return this;
    }

    private TypeAttributes(TypeAttribute<?> typeAttribute) {
        this((List<? extends TypeAttribute<?>>) CollectionsKt.e(typeAttribute));
    }
}
