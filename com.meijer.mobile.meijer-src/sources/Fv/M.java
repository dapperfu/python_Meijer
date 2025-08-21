package Fv;

import Bv.m;
import Bv.n;
import Iv.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJX\u0010\u001a\u001a\u00020\f\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n2/\u0010\u0019\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJM\u0010 \u001a\u00020\f\"\b\b\u0000\u0010\u001c*\u00020\u0010\"\b\b\u0001\u0010\u001d*\u00028\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0016¢\u0006\u0004\b \u0010!JR\u0010%\u001a\u00020\f\"\b\b\u0000\u0010\u001c*\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\n2)\u0010$\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#0\u0013H\u0016¢\u0006\u0004\b%\u0010\u001bJT\u0010)\u001a\u00020\f\"\b\b\u0000\u0010\u001c*\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\n2+\u0010(\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(&\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'0\u0013H\u0016¢\u0006\u0004\b)\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"LFv/M;", "LIv/f;", "", "useArrayPolymorphism", "", "discriminator", "<init>", "(ZLjava/lang/String;)V", "LBv/f;", "descriptor", "Lkotlin/reflect/KClass;", "actualClass", "", "g", "(LBv/f;Lkotlin/reflect/KClass;)V", "f", "", "T", "kClass", "Lkotlin/Function1;", "", "Lzv/b;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "e", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualSerializer", "a", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lzv/b;)V", "value", "Lzv/h;", "defaultSerializerProvider", "d", "className", "Lzv/a;", "defaultDeserializerProvider", "c", "Z", "b", "Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class M implements Iv.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean useArrayPolymorphism;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String discriminator;

    @Override // Iv.f
    public <Base> void c(KClass<Base> baseClass, Function1<? super String, ? extends InterfaceC18555a<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.j(baseClass, "baseClass");
        Intrinsics.j(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // Iv.f
    public <Base> void d(KClass<Base> baseClass, Function1<? super Base, ? extends zv.h<? super Base>> defaultSerializerProvider) {
        Intrinsics.j(baseClass, "baseClass");
        Intrinsics.j(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // Iv.f
    public <T> void e(KClass<T> kClass, Function1<? super List<? extends zv.b<?>>, ? extends zv.b<?>> provider) {
        Intrinsics.j(kClass, "kClass");
        Intrinsics.j(provider, "provider");
    }

    public M(boolean z10, String discriminator) {
        Intrinsics.j(discriminator, "discriminator");
        this.useArrayPolymorphism = z10;
        this.discriminator = discriminator;
    }

    @Override // Iv.f
    public <Base, Sub extends Base> void a(KClass<Base> baseClass, KClass<Sub> actualClass, zv.b<Sub> actualSerializer) {
        Intrinsics.j(baseClass, "baseClass");
        Intrinsics.j(actualClass, "actualClass");
        Intrinsics.j(actualSerializer, "actualSerializer");
        Bv.f descriptor = actualSerializer.getDescriptor();
        g(descriptor, actualClass);
        if (this.useArrayPolymorphism) {
            return;
        }
        f(descriptor, actualClass);
    }

    private final void f(Bv.f descriptor, KClass<?> actualClass) {
        int elementsCount = descriptor.getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            String strJ = descriptor.j(i10);
            if (Intrinsics.e(strJ, this.discriminator)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + strJ + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void g(Bv.f descriptor, KClass<?> actualClass) {
        Bv.m kind = descriptor.getKind();
        if (!(kind instanceof Bv.d) && !Intrinsics.e(kind, m.a.f3726a)) {
            if (!this.useArrayPolymorphism) {
                if (!Intrinsics.e(kind, n.b.f3729a) && !Intrinsics.e(kind, n.c.f3730a) && !(kind instanceof Bv.e) && !(kind instanceof m.b)) {
                    return;
                }
                throw new IllegalArgumentException("Serializer for " + actualClass.u() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
            return;
        }
        throw new IllegalArgumentException("Serializer for " + actualClass.u() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // Iv.f
    public <T> void b(KClass<T> kClass, zv.b<T> bVar) {
        f.a.b(this, kClass, bVar);
    }
}
