package Mv;

import Dv.h;
import Mv.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001Bî\u0001\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012*\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012.\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u0002\u0012&\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012A\u0010\u0013\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00110\bj\u0006\u0012\u0002\b\u0003`\u00120\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\"\b\b\u0000\u0010\u0019*\u00020\u00182\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011\"\b\b\u0000\u0010\u0019*\u00020\u00182\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001f\u0010 JA\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*R$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010+R8\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010+R<\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R4\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010+RO\u0010\u0013\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00110\bj\u0006\u0012\u0002\b\u0003`\u00120\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010+R\u001a\u0010\u0015\u001a\u00020\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"LMv/b;", "LMv/c;", "", "Lkotlin/reflect/KClass;", "LMv/a;", "class2ContextualFactory", "LDv/b;", "polyBase2Serializers", "Lkotlin/Function1;", "LDv/h;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "", "polyBase2NamedSerializers", "Lkotlin/ParameterName;", "name", "className", "LDv/a;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "", "hasInterfaceContextualSerializers", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V", "", "T", "baseClass", "value", "e", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)LDv/h;", "serializedClassName", "d", "(Lkotlin/reflect/KClass;Ljava/lang/String;)LDv/a;", "kClass", "", "typeArgumentsSerializers", "b", "(Lkotlin/reflect/KClass;Ljava/util/List;)LDv/b;", "LMv/f;", "collector", "", "a", "(LMv/f;)V", "Ljava/util/Map;", "c", "f", "Z", "getHasInterfaceContextualSerializers$kotlinx_serialization_core", "()Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<KClass<?>, a> class2ContextualFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Map<KClass<?>, Map<KClass<?>, Dv.b<?>>> polyBase2Serializers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<KClass<?>, Function1<?, h<?>>> polyBase2DefaultSerializerProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<KClass<?>, Map<String, Dv.b<?>>> polyBase2NamedSerializers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<KClass<?>, Function1<String, Dv.a<?>>> polyBase2DefaultDeserializerProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean hasInterfaceContextualSerializers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<KClass<?>, ? extends a> class2ContextualFactory, Map<KClass<?>, ? extends Map<KClass<?>, ? extends Dv.b<?>>> polyBase2Serializers, Map<KClass<?>, ? extends Function1<?, ? extends h<?>>> polyBase2DefaultSerializerProvider, Map<KClass<?>, ? extends Map<String, ? extends Dv.b<?>>> polyBase2NamedSerializers, Map<KClass<?>, ? extends Function1<? super String, ? extends Dv.a<?>>> polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        Intrinsics.j(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.j(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.j(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.j(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.j(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.class2ContextualFactory = class2ContextualFactory;
        this.polyBase2Serializers = polyBase2Serializers;
        this.polyBase2DefaultSerializerProvider = polyBase2DefaultSerializerProvider;
        this.polyBase2NamedSerializers = polyBase2NamedSerializers;
        this.polyBase2DefaultDeserializerProvider = polyBase2DefaultDeserializerProvider;
        this.hasInterfaceContextualSerializers = z10;
    }

    @Override // Mv.c
    public void a(f collector) {
        Intrinsics.j(collector, "collector");
        for (Map.Entry<KClass<?>, a> entry : this.class2ContextualFactory.entrySet()) {
            KClass<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C0336a) {
                Intrinsics.h(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Dv.b<?> bVarB = ((a.C0336a) value).b();
                Intrinsics.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.b(key, bVarB);
            } else {
                if (!(value instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.e(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<KClass<?>, Map<KClass<?>, Dv.b<?>>> entry2 : this.polyBase2Serializers.entrySet()) {
            KClass<?> key2 = entry2.getKey();
            for (Map.Entry<KClass<?>, Dv.b<?>> entry3 : entry2.getValue().entrySet()) {
                KClass<?> key3 = entry3.getKey();
                Dv.b<?> value2 = entry3.getValue();
                Intrinsics.h(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.h(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.h(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.d(key2, key3, value2);
            }
        }
        for (Map.Entry<KClass<?>, Function1<?, h<?>>> entry4 : this.polyBase2DefaultSerializerProvider.entrySet()) {
            KClass<?> key4 = entry4.getKey();
            Function1<?, h<?>> value3 = entry4.getValue();
            Intrinsics.h(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.h(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.c(key4, (Function1) TypeIntrinsics.f(value3, 1));
        }
        for (Map.Entry<KClass<?>, Function1<String, Dv.a<?>>> entry5 : this.polyBase2DefaultDeserializerProvider.entrySet()) {
            KClass<?> key5 = entry5.getKey();
            Function1<String, Dv.a<?>> value4 = entry5.getValue();
            Intrinsics.h(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.h(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.a(key5, (Function1) TypeIntrinsics.f(value4, 1));
        }
    }

    @Override // Mv.c
    public <T> Dv.b<T> b(KClass<T> kClass, List<? extends Dv.b<?>> typeArgumentsSerializers) {
        Intrinsics.j(kClass, "kClass");
        Intrinsics.j(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = this.class2ContextualFactory.get(kClass);
        Dv.b<T> bVar = aVar != null ? (Dv.b<T>) aVar.a(typeArgumentsSerializers) : null;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // Mv.c
    public <T> Dv.a<T> d(KClass<? super T> baseClass, String serializedClassName) {
        Intrinsics.j(baseClass, "baseClass");
        Map<String, Dv.b<?>> map = this.polyBase2NamedSerializers.get(baseClass);
        Dv.b<?> bVar = map != null ? map.get(serializedClassName) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Function1<String, Dv.a<?>> function1 = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        Function1<String, Dv.a<?>> function12 = TypeIntrinsics.m(function1, 1) ? function1 : null;
        if (function12 != null) {
            return (Dv.a) function12.invoke(serializedClassName);
        }
        return null;
    }

    @Override // Mv.c
    public <T> h<T> e(KClass<? super T> baseClass, T value) {
        Intrinsics.j(baseClass, "baseClass");
        Intrinsics.j(value, "value");
        if (!baseClass.s(value)) {
            return null;
        }
        Map<KClass<?>, Dv.b<?>> map = this.polyBase2Serializers.get(baseClass);
        Dv.b<?> bVar = map != null ? map.get(Reflection.b(value.getClass())) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Function1<?, h<?>> function1 = this.polyBase2DefaultSerializerProvider.get(baseClass);
        Function1<?, h<?>> function12 = TypeIntrinsics.m(function1, 1) ? function1 : null;
        if (function12 != null) {
            return (h) function12.invoke(value);
        }
        return null;
    }
}
