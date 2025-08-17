package Hv;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "subClassName", "Lkotlin/reflect/KClass;", "baseClass", "", "a", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Void;", "subClass", "b", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Ljava/lang/Void;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: Hv.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3689c {
    @JvmName
    public static final Void a(String str, KClass<?> baseClass) {
        String str2;
        Intrinsics.j(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.u() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.u() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }

    @JvmName
    public static final Void b(KClass<?> subClass, KClass<?> baseClass) {
        Intrinsics.j(subClass, "subClass");
        Intrinsics.j(baseClass, "baseClass");
        String strU = subClass.u();
        if (strU == null) {
            strU = String.valueOf(subClass);
        }
        a(strU, baseClass);
        throw new KotlinNothingValueException();
    }
}
