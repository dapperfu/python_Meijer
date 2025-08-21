package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes14.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinBuiltIns f144600a;

    /* renamed from: b, reason: collision with root package name */
    private final FqName f144601b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Name, ConstantValue<?>> f144602c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f144603d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f144604e;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(KotlinBuiltIns builtIns, FqName fqName, Map<Name, ? extends ConstantValue<?>> allValueArguments, boolean z10) {
        Intrinsics.j(builtIns, "builtIns");
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(allValueArguments, "allValueArguments");
        this.f144600a = builtIns;
        this.f144601b = fqName;
        this.f144602c = allValueArguments;
        this.f144603d = z10;
        this.f144604e = LazyKt.a(LazyThreadSafetyMode.f143287b, new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType c(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        return builtInAnnotationDescriptor.f144600a.p(builtInAnnotationDescriptor.e()).o();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> a() {
        return this.f144602c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName e() {
        return this.f144601b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement g() {
        SourceElement NO_SOURCE = SourceElement.f144554a;
        Intrinsics.i(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public KotlinType getType() {
        Object value = this.f144604e.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (KotlinType) value;
    }

    public /* synthetic */ BuiltInAnnotationDescriptor(KotlinBuiltIns kotlinBuiltIns, FqName fqName, Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinBuiltIns, fqName, map, (i10 & 8) != 0 ? false : z10);
    }
}
