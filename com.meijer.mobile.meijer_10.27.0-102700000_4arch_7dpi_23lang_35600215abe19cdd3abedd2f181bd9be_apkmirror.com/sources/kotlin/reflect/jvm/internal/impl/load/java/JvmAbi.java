package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;

/* loaded from: classes13.dex */
public final class JvmAbi {

    /* renamed from: a, reason: collision with root package name */
    public static final JvmAbi f144216a = new JvmAbi();

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final FqName f144217b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final ClassId f144218c;

    /* renamed from: d, reason: collision with root package name */
    private static final ClassId f144219d;

    /* renamed from: e, reason: collision with root package name */
    private static final ClassId f144220e;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        f144217b = fqName;
        ClassId.Companion companion = ClassId.f145674d;
        f144218c = companion.c(fqName);
        f144219d = companion.c(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f144220e = ClassId.Companion.b(companion, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    @JvmStatic
    public static final String b(String propertyName) {
        Intrinsics.j(propertyName, "propertyName");
        if (f(propertyName)) {
            return propertyName;
        }
        return "get" + CapitalizeDecapitalizeKt.a(propertyName);
    }

    @JvmStatic
    public static final boolean c(String name) {
        Intrinsics.j(name, "name");
        return StringsKt.W(name, "get", false, 2, null) || StringsKt.W(name, "is", false, 2, null);
    }

    @JvmStatic
    public static final boolean d(String name) {
        Intrinsics.j(name, "name");
        return StringsKt.W(name, "set", false, 2, null);
    }

    @JvmStatic
    public static final String e(String propertyName) {
        String strA;
        Intrinsics.j(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(propertyName)) {
            strA = propertyName.substring(2);
            Intrinsics.i(strA, "substring(...)");
        } else {
            strA = CapitalizeDecapitalizeKt.a(propertyName);
        }
        sb2.append(strA);
        return sb2.toString();
    }

    @JvmStatic
    public static final boolean f(String name) {
        Intrinsics.j(name, "name");
        if (!StringsKt.W(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return Intrinsics.k(97, cCharAt) > 0 || Intrinsics.k(cCharAt, 122) > 0;
    }

    public final ClassId a() {
        return f144220e;
    }

    private JvmAbi() {
    }
}
