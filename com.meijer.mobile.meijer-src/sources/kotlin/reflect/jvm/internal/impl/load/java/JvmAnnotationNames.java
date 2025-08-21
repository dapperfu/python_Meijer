package kotlin.reflect.jvm.internal.impl.load.java;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

/* loaded from: classes14.dex */
public final class JvmAnnotationNames {

    /* renamed from: a, reason: collision with root package name */
    public static final FqName f145128a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f145129b;

    /* renamed from: c, reason: collision with root package name */
    public static final Name f145130c;

    /* renamed from: d, reason: collision with root package name */
    public static final FqName f145131d;

    /* renamed from: e, reason: collision with root package name */
    public static final FqName f145132e;

    /* renamed from: f, reason: collision with root package name */
    public static final FqName f145133f;

    /* renamed from: g, reason: collision with root package name */
    public static final FqName f145134g;

    /* renamed from: h, reason: collision with root package name */
    public static final FqName f145135h;

    /* renamed from: i, reason: collision with root package name */
    public static final FqName f145136i;

    /* renamed from: j, reason: collision with root package name */
    public static final FqName f145137j;

    /* renamed from: k, reason: collision with root package name */
    public static final FqName f145138k;

    /* renamed from: l, reason: collision with root package name */
    public static final FqName f145139l;

    /* renamed from: m, reason: collision with root package name */
    public static final FqName f145140m;

    /* renamed from: n, reason: collision with root package name */
    public static final FqName f145141n;

    /* renamed from: o, reason: collision with root package name */
    public static final FqName f145142o;

    /* renamed from: p, reason: collision with root package name */
    public static final FqName f145143p;

    /* renamed from: q, reason: collision with root package name */
    public static final FqName f145144q;

    /* renamed from: r, reason: collision with root package name */
    public static final FqName f145145r;

    /* renamed from: s, reason: collision with root package name */
    public static final FqName f145146s;

    /* renamed from: t, reason: collision with root package name */
    public static final FqName f145147t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f145148u;

    /* renamed from: v, reason: collision with root package name */
    public static final FqName f145149v;

    /* renamed from: w, reason: collision with root package name */
    public static final FqName f145150w;

    static {
        FqName fqName = new FqName("kotlin.Metadata");
        f145128a = fqName;
        f145129b = "L" + JvmClassName.c(fqName).f() + ";";
        f145130c = Name.o("value");
        f145131d = new FqName(Target.class.getName());
        f145132e = new FqName(ElementType.class.getName());
        f145133f = new FqName(Retention.class.getName());
        f145134g = new FqName(RetentionPolicy.class.getName());
        f145135h = new FqName(Deprecated.class.getName());
        f145136i = new FqName(Documented.class.getName());
        f145137j = new FqName("java.lang.annotation.Repeatable");
        f145138k = new FqName(Override.class.getName());
        f145139l = new FqName("org.jetbrains.annotations.NotNull");
        f145140m = new FqName("org.jetbrains.annotations.Nullable");
        f145141n = new FqName("org.jetbrains.annotations.Mutable");
        f145142o = new FqName("org.jetbrains.annotations.ReadOnly");
        f145143p = new FqName("kotlin.annotations.jvm.ReadOnly");
        f145144q = new FqName("kotlin.annotations.jvm.Mutable");
        f145145r = new FqName("kotlin.jvm.PurelyImplements");
        f145146s = new FqName("kotlin.jvm.internal");
        FqName fqName2 = new FqName("kotlin.jvm.internal.SerializedIr");
        f145147t = fqName2;
        f145148u = "L" + JvmClassName.c(fqName2).f() + ";";
        f145149v = new FqName("kotlin.jvm.internal.EnhancedNullability");
        f145150w = new FqName("kotlin.jvm.internal.EnhancedMutability");
    }
}
