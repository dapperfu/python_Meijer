package kotlin.reflect.jvm.internal;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.ReflectLambdaKt;

/* loaded from: classes14.dex */
public class ReflectionFactoryImpl extends ReflectionFactory {
    @Override // kotlin.jvm.internal.ReflectionFactory
    public KFunction a(FunctionReference functionReference) {
        return new KFunctionImpl(m(functionReference), functionReference.getName(), functionReference.getSignature(), functionReference.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public KMutableProperty0 d(MutablePropertyReference0 mutablePropertyReference0) {
        return new KMutableProperty0Impl(m(mutablePropertyReference0), mutablePropertyReference0.getName(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public KMutableProperty1 e(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(m(mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public KMutableProperty2 f(MutablePropertyReference2 mutablePropertyReference2) {
        return new KMutableProperty2Impl(m(mutablePropertyReference2), mutablePropertyReference2.getName(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public KProperty0 g(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(m(propertyReference0), propertyReference0.getName(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public KProperty1 h(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(m(propertyReference1), propertyReference1.getName(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public KProperty2 i(PropertyReference2 propertyReference2) {
        return new KProperty2Impl(m(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public KType l(KClassifier kClassifier, List<KTypeProjection> list, boolean z10) {
        return kClassifier instanceof ClassBasedDeclarationContainer ? CachesKt.k(((ClassBasedDeclarationContainer) kClassifier).h(), list, z10) : KClassifiers.b(kClassifier, list, z10, Collections.EMPTY_LIST);
    }

    private static KDeclarationContainerImpl m(CallableReference callableReference) {
        KDeclarationContainer owner = callableReference.getOwner();
        if (owner instanceof KDeclarationContainerImpl) {
            return (KDeclarationContainerImpl) owner;
        }
        return EmptyContainerForLocal.f143898d;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public KClass b(Class cls) {
        return CachesKt.m(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public KDeclarationContainer c(Class cls, String str) {
        return CachesKt.n(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public String j(FunctionBase functionBase) {
        KFunctionImpl kFunctionImplC;
        KFunction kFunctionA = ReflectLambdaKt.a(functionBase);
        if (kFunctionA != null && (kFunctionImplC = UtilKt.c(kFunctionA)) != null) {
            return ReflectionObjectRenderer.f144042a.h(kFunctionImplC.X());
        }
        return super.j(functionBase);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public String k(Lambda lambda) {
        return j(lambda);
    }
}
