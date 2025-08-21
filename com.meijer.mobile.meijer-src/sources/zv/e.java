package zv;

import Bv.d;
import Bv.l;
import Bv.m;
import Dv.AbstractC3129b;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0011\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lzv/e;", "", "T", "LDv/b;", "Lkotlin/reflect/KClass;", "baseClass", "<init>", "(Lkotlin/reflect/KClass;)V", "", "", "classAnnotations", "(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/KClass;", "j", "()Lkotlin/reflect/KClass;", "", "b", "Ljava/util/List;", "_annotations", "LBv/f;", "c", "Lkotlin/Lazy;", "()LBv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e<T> extends AbstractC3129b<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KClass<T> baseClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends Annotation> _annotations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy descriptor;

    public e(KClass<T> baseClass) {
        Intrinsics.j(baseClass, "baseClass");
        this.baseClass = baseClass;
        this._annotations = CollectionsKt.m();
        this.descriptor = LazyKt.a(LazyThreadSafetyMode.f143287b, new Function0() { // from class: zv.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.m(this.f173309a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bv.f m(final e eVar) {
        return Bv.b.c(l.c("kotlinx.serialization.Polymorphic", d.a.f3698a, new Bv.f[0], new Function1() { // from class: zv.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.n(this.f173310a, (Bv.a) obj);
            }
        }), eVar.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(e eVar, Bv.a buildSerialDescriptor) {
        Intrinsics.j(buildSerialDescriptor, "$this$buildSerialDescriptor");
        Bv.a.b(buildSerialDescriptor, "type", Av.a.D(StringCompanionObject.f143748a).getDescriptor(), null, false, 12, null);
        Bv.a.b(buildSerialDescriptor, "value", l.d("kotlinx.serialization.Polymorphic<" + eVar.j().u() + '>', m.a.f3726a, new Bv.f[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.h(eVar._annotations);
        return Unit.f143329a;
    }

    @Override // zv.b, zv.h, zv.InterfaceC18555a
    /* renamed from: a */
    public Bv.f getDescriptor() {
        return (Bv.f) this.descriptor.getValue();
    }

    @Override // Dv.AbstractC3129b
    public KClass<T> j() {
        return this.baseClass;
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + j() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @PublishedApi
    public e(KClass<T> baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        Intrinsics.j(baseClass, "baseClass");
        Intrinsics.j(classAnnotations, "classAnnotations");
        this._annotations = ArraysKt.g(classAnnotations);
    }
}
