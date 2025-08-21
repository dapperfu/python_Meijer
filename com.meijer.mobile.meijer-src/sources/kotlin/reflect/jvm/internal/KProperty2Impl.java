package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty2;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001 B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0013R,\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl;", "D", "E", "V", "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "n", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "o", "Lkotlin/Lazy;", "_getter", "Ljava/lang/reflect/Member;", "p", "delegateSource", "m0", "()Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "getter", "Getter", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public class KProperty2Impl<D, E, V> extends KPropertyImpl<V> implements KProperty2<D, E, V> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Getter<D, E, V>> _getter;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Member> delegateSource;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00028\u00052\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty2$Getter;", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty2Impl;)V", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "j", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "e0", "()Lkotlin/reflect/jvm/internal/KProperty2Impl;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Getter<D, E, V> extends KPropertyImpl.Getter<V> implements KProperty2.Getter<D, E, V> {

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final KProperty2Impl<D, E, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(KProperty2Impl<D, E, ? extends V> property) {
            Intrinsics.j(property, "property");
            this.property = property;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public KProperty2Impl<D, E, V> a() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function2
        public V invoke(D receiver1, E receiver2) {
            return a().n(receiver1, receiver2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(KDeclarationContainerImpl container, String name, String signature) {
        super(container, name, signature, CallableReference.NO_RECEIVER);
        Intrinsics.j(container, "container");
        Intrinsics.j(name, "name");
        Intrinsics.j(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143287b;
        this._getter = LazyKt.a(lazyThreadSafetyMode, new l0(this));
        this.delegateSource = LazyKt.a(lazyThreadSafetyMode, new m0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Getter i0(KProperty2Impl kProperty2Impl) {
        return new Getter(kProperty2Impl);
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public Getter<D, E, V> getGetter() {
        return this._getter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member l0(KProperty2Impl kProperty2Impl) {
        return kProperty2Impl.b0();
    }

    @Override // kotlin.jvm.functions.Function2
    public V invoke(D receiver1, E receiver2) {
        return n(receiver1, receiver2);
    }

    @Override // kotlin.reflect.KProperty2
    public V n(D receiver1, E receiver2) {
        return getGetter().call(receiver1, receiver2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(KDeclarationContainerImpl container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.j(container, "container");
        Intrinsics.j(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143287b;
        this._getter = LazyKt.a(lazyThreadSafetyMode, new l0(this));
        this.delegateSource = LazyKt.a(lazyThreadSafetyMode, new m0(this));
    }
}
