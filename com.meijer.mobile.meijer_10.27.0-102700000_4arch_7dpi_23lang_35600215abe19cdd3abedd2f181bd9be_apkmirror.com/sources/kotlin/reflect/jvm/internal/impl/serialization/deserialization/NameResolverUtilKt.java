package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes13.dex */
public final class NameResolverUtilKt {
    public static final ClassId a(NameResolver nameResolver, int i10) {
        Intrinsics.j(nameResolver, "<this>");
        return ClassId.f145674d.a(nameResolver.b(i10), nameResolver.a(i10));
    }

    public static final Name b(NameResolver nameResolver, int i10) {
        Intrinsics.j(nameResolver, "<this>");
        Name nameM = Name.m(nameResolver.getString(i10));
        Intrinsics.i(nameM, "guessByFirstCharacter(...)");
        return nameM;
    }
}
