package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* loaded from: classes13.dex */
public interface KotlinTypeChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final KotlinTypeChecker f146816a = NewKotlinTypeChecker.f146831b.a();

    public interface TypeConstructorEquality {
        boolean a(TypeConstructor typeConstructor, TypeConstructor typeConstructor2);
    }

    boolean b(KotlinType kotlinType, KotlinType kotlinType2);

    boolean d(KotlinType kotlinType, KotlinType kotlinType2);
}
