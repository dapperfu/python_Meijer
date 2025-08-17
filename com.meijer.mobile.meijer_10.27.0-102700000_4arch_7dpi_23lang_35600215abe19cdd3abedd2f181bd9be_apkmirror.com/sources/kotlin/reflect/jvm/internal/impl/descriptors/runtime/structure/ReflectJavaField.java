package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* loaded from: classes13.dex */
public final class ReflectJavaField extends ReflectJavaMember implements JavaField {

    /* renamed from: a, reason: collision with root package name */
    private final Field f144092a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean O() {
        return false;
    }

    public ReflectJavaField(Field member) {
        Intrinsics.j(member, "member");
        this.f144092a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Field R() {
        return this.f144092a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType getType() {
        ReflectJavaType.Factory factory = ReflectJavaType.f144100a;
        Type genericType = R().getGenericType();
        Intrinsics.i(genericType, "getGenericType(...)");
        return factory.a(genericType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean J() {
        return R().isEnumConstant();
    }
}
