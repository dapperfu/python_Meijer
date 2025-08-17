package kotlin.reflect.jvm.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.KCallablesJvm;
import kotlin.reflect.jvm.internal.JvmPropertySignature;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.DescriptorsJvmAbiUtil;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u0000 O*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004PQRSB5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010#R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\t0\t048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010;R\u0013\u0010?\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000@8&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0018\u0010G\u001a\u0006\u0012\u0002\b\u00030D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0002\b\u0003\u0018\u00010D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010J\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010;R\u0014\u0010K\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010;R\u0014\u0010L\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010;R\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006T"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "V", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "name", "signature", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptorInitialValue", "", "rawBoundReceiver", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Member;", "b0", "()Ljava/lang/reflect/Member;", "fieldOrMethod", "receiver1", "receiver2", "d0", "(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "g", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Q", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "h", "Ljava/lang/String;", "getName", "i", "h0", "j", "Ljava/lang/Object;", "Lkotlin/Lazy;", "Ljava/lang/reflect/Field;", "k", "Lkotlin/Lazy;", "_javaField", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "l", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "_descriptor", "c0", "()Ljava/lang/Object;", "()Z", "isBound", "g0", "()Ljava/lang/reflect/Field;", "javaField", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "f0", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getter", "Lkotlin/reflect/jvm/internal/calls/Caller;", "P", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "R", "defaultCaller", "isLateinit", "isConst", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "m", "Accessor", "Getter", "Setter", "Companion", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements KProperty<V> {

    /* renamed from: n, reason: collision with root package name */
    private static final Object f143102n = new Object();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final KDeclarationContainerImpl container;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String signature;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Object rawBoundReceiver;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Field> _javaField;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal<PropertyDescriptor> _descriptor;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "g", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/Caller;", "h", "Lkotlin/Lazy;", "P", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Getter<V> extends Accessor<V, V> implements KProperty.Getter<V> {

        /* renamed from: i, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f143109i = {Reflection.j(new PropertyReference1Impl(Getter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal descriptor = ReflectProperties.c(new p0(this));

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Lazy caller = LazyKt.a(LazyThreadSafetyMode.f142380b, new q0(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final Caller b0(Getter getter) {
            return KPropertyImplKt.b(getter, true);
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public Caller<?> P() {
            return (Caller) this.caller.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* renamed from: d0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public PropertyGetterDescriptor X() {
            T tB = this.descriptor.b(this, f143109i[0]);
            Intrinsics.i(tB, "getValue(...)");
            return (PropertyGetterDescriptor) tB;
        }

        public boolean equals(Object other) {
            return (other instanceof Getter) && Intrinsics.e(a(), ((Getter) other).a());
        }

        @Override // kotlin.reflect.KCallable
        public String getName() {
            return "<get-" + a().getName() + '>';
        }

        public String toString() {
            return "getter of " + a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PropertyGetterDescriptor c0(Getter getter) {
            PropertyGetterDescriptor getter2 = getter.a().X().getGetter();
            if (getter2 == null) {
                PropertyGetterDescriptorImpl propertyGetterDescriptorImplD = DescriptorFactory.d(getter.a().X(), Annotations.f143689s3.b());
                Intrinsics.i(propertyGetterDescriptorImplD, "createDefaultGetter(...)");
                return propertyGetterDescriptorImplD;
            }
            return getter2;
        }

        public int hashCode() {
            return a().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\t¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "g", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/Caller;", "h", "Lkotlin/Lazy;", "P", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Setter<V> extends Accessor<V, Unit> implements KMutableProperty.Setter<V> {

        /* renamed from: i, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f143112i = {Reflection.j(new PropertyReference1Impl(Setter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal descriptor = ReflectProperties.c(new r0(this));

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Lazy caller = LazyKt.a(LazyThreadSafetyMode.f142380b, new s0(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final Caller b0(Setter setter) {
            return KPropertyImplKt.b(setter, false);
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public Caller<?> P() {
            return (Caller) this.caller.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* renamed from: d0, reason: merged with bridge method [inline-methods] */
        public PropertySetterDescriptor X() {
            T tB = this.descriptor.b(this, f143112i[0]);
            Intrinsics.i(tB, "getValue(...)");
            return (PropertySetterDescriptor) tB;
        }

        public boolean equals(Object other) {
            return (other instanceof Setter) && Intrinsics.e(a(), ((Setter) other).a());
        }

        @Override // kotlin.reflect.KCallable
        public String getName() {
            return "<set-" + a().getName() + '>';
        }

        public String toString() {
            return "setter of " + a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PropertySetterDescriptor c0(Setter setter) {
            PropertySetterDescriptor setter2 = setter.a().X().getSetter();
            if (setter2 == null) {
                PropertyDescriptor propertyDescriptorX = setter.a().X();
                Annotations.Companion companion = Annotations.f143689s3;
                PropertySetterDescriptorImpl propertySetterDescriptorImplE = DescriptorFactory.e(propertyDescriptorX, companion.b(), companion.b());
                Intrinsics.i(propertySetterDescriptorImplE, "createDefaultSetter(...)");
                return propertySetterDescriptorImplE;
            }
            return setter2;
        }

        public int hashCode() {
            return a().hashCode();
        }
    }

    private KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, PropertyDescriptor propertyDescriptor, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this._javaField = LazyKt.a(LazyThreadSafetyMode.f142380b, new n0(this));
        ReflectProperties.LazySoftVal<PropertyDescriptor> lazySoftValB = ReflectProperties.b(propertyDescriptor, new o0(this));
        Intrinsics.i(lazySoftValB, "lazySoft(...)");
        this._descriptor = lazySoftValB;
    }

    /* renamed from: f0 */
    public abstract Getter<V> getGetter();

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return false;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Y", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "property", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Q", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/calls/Caller;", "R", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "defaultCaller", "", "V", "()Z", "isBound", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Accessor<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements KFunction<ReturnType>, KProperty.Accessor<PropertyType> {
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public Caller<?> R() {
            return null;
        }

        public abstract PropertyAccessorDescriptor X();

        /* renamed from: Y */
        public abstract KPropertyImpl<PropertyType> a();

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* renamed from: Q */
        public KDeclarationContainerImpl getContainer() {
            return a().getContainer();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public boolean V() {
            return a().V();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isExternal() {
            return X().isExternal();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInfix() {
            return X().isInfix();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInline() {
            return X().isInline();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isOperator() {
            return X().isOperator();
        }

        @Override // kotlin.reflect.KCallable
        public boolean isSuspend() {
            return X().isSuspend();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field Y(KPropertyImpl kPropertyImpl) {
        Class<?> enclosingClass;
        JvmPropertySignature jvmPropertySignatureF = RuntimeTypeMapper.f143137a.f(kPropertyImpl.X());
        if (!(jvmPropertySignatureF instanceof JvmPropertySignature.KotlinProperty)) {
            if (jvmPropertySignatureF instanceof JvmPropertySignature.JavaField) {
                return ((JvmPropertySignature.JavaField) jvmPropertySignatureF).getField();
            }
            if ((jvmPropertySignatureF instanceof JvmPropertySignature.JavaMethodProperty) || (jvmPropertySignatureF instanceof JvmPropertySignature.MappedKotlinProperty)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureF;
        PropertyDescriptor propertyDescriptorB = kotlinProperty.getDescriptor();
        JvmMemberSignature.Field fieldD = JvmProtoBufUtil.d(JvmProtoBufUtil.f145664a, kotlinProperty.getProto(), kotlinProperty.getNameResolver(), kotlinProperty.getTypeTable(), false, 8, null);
        if (fieldD == null) {
            return null;
        }
        if (DescriptorsJvmAbiUtil.e(propertyDescriptorB) || JvmProtoBufUtil.f(kotlinProperty.getProto())) {
            enclosingClass = kPropertyImpl.getContainer().h().getEnclosingClass();
        } else {
            DeclarationDescriptor declarationDescriptorB = propertyDescriptorB.b();
            enclosingClass = declarationDescriptorB instanceof ClassDescriptor ? UtilKt.q((ClassDescriptor) declarationDescriptorB) : kPropertyImpl.getContainer().h();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(fieldD.e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: Q, reason: from getter */
    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public boolean V() {
        return this.rawBoundReceiver != CallableReference.NO_RECEIVER;
    }

    public final Object c0() {
        return ValueClassAwareCallerKt.h(this.rawBoundReceiver, X());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object d0(Member fieldOrMethod, Object receiver1, Object receiver2) throws IllegalPropertyDelegateAccessException, SecurityException {
        try {
            Object obj = f143102n;
            if ((receiver1 == obj || receiver2 == obj) && X().N() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objC0 = V() ? c0() : receiver1;
            if (objC0 == obj) {
                objC0 = null;
            }
            if (!V()) {
                receiver1 = receiver2;
            }
            if (receiver1 == obj) {
                receiver1 = null;
            }
            AccessibleObject accessibleObject = fieldOrMethod instanceof AccessibleObject ? (AccessibleObject) fieldOrMethod : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(KCallablesJvm.a(this));
            }
            if (fieldOrMethod == 0) {
                return null;
            }
            if (fieldOrMethod instanceof Field) {
                return ((Field) fieldOrMethod).get(objC0);
            }
            if (!(fieldOrMethod instanceof Method)) {
                throw new AssertionError("delegate field/method " + fieldOrMethod + " neither field nor method");
            }
            int length = ((Method) fieldOrMethod).getParameterTypes().length;
            if (length == 0) {
                return ((Method) fieldOrMethod).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) fieldOrMethod;
                if (objC0 == null) {
                    Class<?> cls = ((Method) fieldOrMethod).getParameterTypes()[0];
                    Intrinsics.i(cls, "get(...)");
                    objC0 = UtilKt.g(cls);
                }
                return method.invoke(null, objC0);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + fieldOrMethod + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) fieldOrMethod;
            if (receiver1 == null) {
                Class<?> cls2 = ((Method) fieldOrMethod).getParameterTypes()[1];
                Intrinsics.i(cls2, "get(...)");
                receiver1 = UtilKt.g(cls2);
            }
            return method2.invoke(null, objC0, receiver1);
        } catch (IllegalAccessException e10) {
            throw new IllegalPropertyDelegateAccessException(e10);
        }
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public PropertyDescriptor X() {
        PropertyDescriptor propertyDescriptorInvoke = this._descriptor.invoke();
        Intrinsics.i(propertyDescriptorInvoke, "invoke(...)");
        return propertyDescriptorInvoke;
    }

    public final Field g0() {
        return this._javaField.getValue();
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        return this.name;
    }

    /* renamed from: h0, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public String toString() {
        return ReflectionObjectRenderer.f143135a.k(X());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropertyDescriptor X(KPropertyImpl kPropertyImpl) {
        return kPropertyImpl.getContainer().B(kPropertyImpl.getName(), kPropertyImpl.signature);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public Caller<?> P() {
        return getGetter().P();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public Caller<?> R() {
        return getGetter().R();
    }

    protected final Member b0() {
        if (!X().A()) {
            return null;
        }
        JvmPropertySignature jvmPropertySignatureF = RuntimeTypeMapper.f143137a.f(X());
        if (jvmPropertySignatureF instanceof JvmPropertySignature.KotlinProperty) {
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureF;
            if (kotlinProperty.getSignature().F()) {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignatureA = kotlinProperty.getSignature().A();
                if (!jvmMethodSignatureA.A() || !jvmMethodSignatureA.z()) {
                    return null;
                }
                return getContainer().A(kotlinProperty.getNameResolver().getString(jvmMethodSignatureA.y()), kotlinProperty.getNameResolver().getString(jvmMethodSignatureA.x()));
            }
        }
        return g0();
    }

    public boolean equals(Object other) {
        KPropertyImpl<?> kPropertyImplD = UtilKt.d(other);
        if (kPropertyImplD == null || !Intrinsics.e(getContainer(), kPropertyImplD.getContainer()) || !Intrinsics.e(getName(), kPropertyImplD.getName()) || !Intrinsics.e(this.signature, kPropertyImplD.signature) || !Intrinsics.e(this.rawBoundReceiver, kPropertyImplD.rawBoundReceiver)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return X().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return X().v0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.j(container, "container");
        Intrinsics.j(name, "name");
        Intrinsics.j(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KPropertyImpl(KDeclarationContainerImpl container, PropertyDescriptor descriptor) {
        Intrinsics.j(container, "container");
        Intrinsics.j(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        Intrinsics.i(strB, "asString(...)");
        this(container, strB, RuntimeTypeMapper.f143137a.f(descriptor).getString(), descriptor, CallableReference.NO_RECEIVER);
    }
}
