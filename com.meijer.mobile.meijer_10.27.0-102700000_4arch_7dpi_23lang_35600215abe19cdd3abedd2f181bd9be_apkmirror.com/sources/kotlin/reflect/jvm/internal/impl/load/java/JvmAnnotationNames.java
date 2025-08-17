package kotlin.reflect.jvm.internal.impl.load.java;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

/* loaded from: classes13.dex */
public final class JvmAnnotationNames {

    /* renamed from: a, reason: collision with root package name */
    public static final FqName f144221a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f144222b;

    /* renamed from: c, reason: collision with root package name */
    public static final Name f144223c;

    /* renamed from: d, reason: collision with root package name */
    public static final FqName f144224d;

    /* renamed from: e, reason: collision with root package name */
    public static final FqName f144225e;

    /* renamed from: f, reason: collision with root package name */
    public static final FqName f144226f;

    /* renamed from: g, reason: collision with root package name */
    public static final FqName f144227g;

    /* renamed from: h, reason: collision with root package name */
    public static final FqName f144228h;

    /* renamed from: i, reason: collision with root package name */
    public static final FqName f144229i;

    /* renamed from: j, reason: collision with root package name */
    public static final FqName f144230j;

    /* renamed from: k, reason: collision with root package name */
    public static final FqName f144231k;

    /* renamed from: l, reason: collision with root package name */
    public static final FqName f144232l;

    /* renamed from: m, reason: collision with root package name */
    public static final FqName f144233m;

    /* renamed from: n, reason: collision with root package name */
    public static final FqName f144234n;

    /* renamed from: o, reason: collision with root package name */
    public static final FqName f144235o;

    /* renamed from: p, reason: collision with root package name */
    public static final FqName f144236p;

    /* renamed from: q, reason: collision with root package name */
    public static final FqName f144237q;

    /* renamed from: r, reason: collision with root package name */
    public static final FqName f144238r;

    /* renamed from: s, reason: collision with root package name */
    public static final FqName f144239s;

    /* renamed from: t, reason: collision with root package name */
    public static final FqName f144240t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f144241u;

    /* renamed from: v, reason: collision with root package name */
    public static final FqName f144242v;

    /* renamed from: w, reason: collision with root package name */
    public static final FqName f144243w;

    static {
        FqName fqName = new FqName("kotlin.Metadata");
        f144221a = fqName;
        f144222b = "L" + JvmClassName.c(fqName).f() + ";";
        f144223c = Name.o("value");
        f144224d = new FqName(Target.class.getName());
        f144225e = new FqName(ElementType.class.getName());
        f144226f = new FqName(Retention.class.getName());
        f144227g = new FqName(RetentionPolicy.class.getName());
        f144228h = new FqName(Deprecated.class.getName());
        f144229i = new FqName(Documented.class.getName());
        f144230j = new FqName("java.lang.annotation.Repeatable");
        f144231k = new FqName(Override.class.getName());
        f144232l = new FqName("org.jetbrains.annotations.NotNull");
        f144233m = new FqName("org.jetbrains.annotations.Nullable");
        f144234n = new FqName("org.jetbrains.annotations.Mutable");
        f144235o = new FqName("org.jetbrains.annotations.ReadOnly");
        f144236p = new FqName("kotlin.annotations.jvm.ReadOnly");
        f144237q = new FqName("kotlin.annotations.jvm.Mutable");
        f144238r = new FqName("kotlin.jvm.PurelyImplements");
        f144239s = new FqName("kotlin.jvm.internal");
        FqName fqName2 = new FqName("kotlin.jvm.internal.SerializedIr");
        f144240t = fqName2;
        f144241u = "L" + JvmClassName.c(fqName2).f() + ";";
        f144242v = new FqName("kotlin.jvm.internal.EnhancedNullability");
        f144243w = new FqName("kotlin.jvm.internal.EnhancedMutability");
    }
}
