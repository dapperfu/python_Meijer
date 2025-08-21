package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001 B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0013R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl;", "T", "V", "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "o", "Lkotlin/Lazy;", "_getter", "Ljava/lang/reflect/Member;", "p", "delegateSource", "m0", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "getter", "Getter", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public class KProperty1Impl<T, V> extends KPropertyImpl<V> implements KProperty1<T, V> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Getter<T, V>> _getter;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Member> delegateSource;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "T", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty1$Getter;", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty1Impl;)V", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "j", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "e0", "()Lkotlin/reflect/jvm/internal/KProperty1Impl;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Getter<T, V> extends KPropertyImpl.Getter<V> implements KProperty1.Getter<T, V> {

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final KProperty1Impl<T, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(KProperty1Impl<T, ? extends V> property) {
            Intrinsics.j(property, "property");
            this.property = property;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public KProperty1Impl<T, V> a() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(T receiver) {
            return a().get(receiver);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.j(container, "container");
        Intrinsics.j(name, "name");
        Intrinsics.j(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143287b;
        this._getter = LazyKt.a(lazyThreadSafetyMode, new j0(this));
        this.delegateSource = LazyKt.a(lazyThreadSafetyMode, new k0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Getter i0(KProperty1Impl kProperty1Impl) {
        return new Getter(kProperty1Impl);
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public Getter<T, V> getGetter() {
        return this._getter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member l0(KProperty1Impl kProperty1Impl) {
        return kProperty1Impl.b0();
    }

    @Override // kotlin.reflect.KProperty1
    public V get(T receiver) {
        return getGetter().call(receiver);
    }

    @Override // kotlin.jvm.functions.Function1
    public V invoke(T receiver) {
        return get(receiver);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.j(container, "container");
        Intrinsics.j(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143287b;
        this._getter = LazyKt.a(lazyThreadSafetyMode, new j0(this));
        this.delegateSource = LazyKt.a(lazyThreadSafetyMode, new k0(this));
    }
}
