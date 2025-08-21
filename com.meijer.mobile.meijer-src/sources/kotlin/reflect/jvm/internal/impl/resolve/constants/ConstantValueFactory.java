package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ConstantValueFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final ConstantValueFactory f147082a = new ConstantValueFactory();

    private final ArrayValue b(List<?> list, ModuleDescriptor moduleDescriptor, PrimitiveType primitiveType) {
        List listJ1 = CollectionsKt.j1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listJ1.iterator();
        while (it.hasNext()) {
            ConstantValue constantValueF = f(this, it.next(), null, 2, null);
            if (constantValueF != null) {
                arrayList.add(constantValueF);
            }
        }
        if (moduleDescriptor == null) {
            return new ArrayValue(arrayList, new a(primitiveType));
        }
        SimpleType simpleTypeP = moduleDescriptor.l().P(primitiveType);
        Intrinsics.i(simpleTypeP, "getPrimitiveArrayKotlinType(...)");
        return new TypedArrayValue(arrayList, simpleTypeP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType d(PrimitiveType primitiveType, ModuleDescriptor it) {
        Intrinsics.j(it, "it");
        SimpleType simpleTypeP = it.l().P(primitiveType);
        Intrinsics.i(simpleTypeP, "getPrimitiveArrayKotlinType(...)");
        return simpleTypeP;
    }

    public static /* synthetic */ ConstantValue f(ConstantValueFactory constantValueFactory, Object obj, ModuleDescriptor moduleDescriptor, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            moduleDescriptor = null;
        }
        return constantValueFactory.e(obj, moduleDescriptor);
    }

    public final ArrayValue c(List<? extends ConstantValue<?>> value, KotlinType type) {
        Intrinsics.j(value, "value");
        Intrinsics.j(type, "type");
        return new TypedArrayValue(value, type);
    }

    public final ConstantValue<?> e(Object obj, ModuleDescriptor moduleDescriptor) {
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        if (obj instanceof byte[]) {
            return b(ArraysKt.b1((byte[]) obj), moduleDescriptor, PrimitiveType.f144166i);
        }
        if (obj instanceof short[]) {
            return b(ArraysKt.i1((short[]) obj), moduleDescriptor, PrimitiveType.f144167j);
        }
        if (obj instanceof int[]) {
            return b(ArraysKt.f1((int[]) obj), moduleDescriptor, PrimitiveType.f144168k);
        }
        if (obj instanceof long[]) {
            return b(ArraysKt.g1((long[]) obj), moduleDescriptor, PrimitiveType.f144170m);
        }
        if (obj instanceof char[]) {
            return b(ArraysKt.c1((char[]) obj), moduleDescriptor, PrimitiveType.f144165h);
        }
        if (obj instanceof float[]) {
            return b(ArraysKt.e1((float[]) obj), moduleDescriptor, PrimitiveType.f144169l);
        }
        if (obj instanceof double[]) {
            return b(ArraysKt.d1((double[]) obj), moduleDescriptor, PrimitiveType.f144171n);
        }
        if (obj instanceof boolean[]) {
            return b(ArraysKt.j1((boolean[]) obj), moduleDescriptor, PrimitiveType.f144164g);
        }
        if (obj == null) {
            return new NullValue();
        }
        return null;
    }

    private ConstantValueFactory() {
    }
}
