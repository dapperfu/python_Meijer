package kotlin.jvm.internal;

import java.util.List;
import kotlin.SinceKotlin;
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

/* loaded from: classes7.dex */
public class ReflectionFactory {
    public KFunction a(FunctionReference functionReference) {
        return functionReference;
    }

    public KMutableProperty0 d(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public KMutableProperty1 e(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public KMutableProperty2 f(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public KProperty0 g(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public KProperty1 h(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public KProperty2 i(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public KClass b(Class cls) {
        return new ClassReference(cls);
    }

    public KDeclarationContainer c(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    @SinceKotlin
    public KType l(KClassifier kClassifier, List<KTypeProjection> list, boolean z10) {
        return new TypeReference(kClassifier, list, z10);
    }

    @SinceKotlin
    public String j(FunctionBase functionBase) {
        String string = functionBase.getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            return string.substring(21);
        }
        return string;
    }

    @SinceKotlin
    public String k(Lambda lambda) {
        return j(lambda);
    }
}
