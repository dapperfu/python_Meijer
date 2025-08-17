package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public final class JvmAnnotationNamesKt {

    /* renamed from: a, reason: collision with root package name */
    private static final FqName f144244a;

    /* renamed from: b, reason: collision with root package name */
    private static final FqName f144245b;

    /* renamed from: c, reason: collision with root package name */
    private static final FqName f144246c;

    /* renamed from: d, reason: collision with root package name */
    private static final FqName f144247d;

    /* renamed from: e, reason: collision with root package name */
    private static final FqName f144248e;

    /* renamed from: f, reason: collision with root package name */
    private static final FqName f144249f;

    /* renamed from: g, reason: collision with root package name */
    private static final FqName f144250g;

    /* renamed from: h, reason: collision with root package name */
    private static final FqName f144251h;

    /* renamed from: i, reason: collision with root package name */
    private static final FqName f144252i;

    /* renamed from: j, reason: collision with root package name */
    private static final FqName f144253j;

    /* renamed from: k, reason: collision with root package name */
    private static final FqName f144254k;

    /* renamed from: l, reason: collision with root package name */
    private static final FqName f144255l;

    /* renamed from: m, reason: collision with root package name */
    private static final FqName f144256m;

    /* renamed from: n, reason: collision with root package name */
    private static final FqName f144257n;

    /* renamed from: o, reason: collision with root package name */
    private static final FqName f144258o;

    /* renamed from: p, reason: collision with root package name */
    private static final FqName f144259p;

    /* renamed from: q, reason: collision with root package name */
    private static final Set<FqName> f144260q;

    /* renamed from: r, reason: collision with root package name */
    private static final Set<FqName> f144261r;

    /* renamed from: s, reason: collision with root package name */
    private static final Set<FqName> f144262s;

    /* renamed from: t, reason: collision with root package name */
    private static final Set<FqName> f144263t;

    /* renamed from: u, reason: collision with root package name */
    private static final Set<FqName> f144264u;

    /* renamed from: v, reason: collision with root package name */
    private static final Set<FqName> f144265v;

    /* renamed from: w, reason: collision with root package name */
    private static final Set<FqName> f144266w;

    /* renamed from: x, reason: collision with root package name */
    private static final Map<FqName, FqName> f144267x;

    /* renamed from: y, reason: collision with root package name */
    private static final FqName f144268y;

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        f144244a = fqName;
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        f144245b = fqName2;
        FqName fqName3 = new FqName("org.jspecify.nullness.NullnessUnspecified");
        f144246c = fqName3;
        FqName fqName4 = new FqName("org.jspecify.annotations.NonNull");
        f144247d = fqName4;
        FqName fqName5 = new FqName("org.jspecify.annotations.Nullable");
        f144248e = fqName5;
        FqName fqName6 = new FqName("org.jspecify.annotations.NullMarked");
        f144249f = fqName6;
        FqName fqName7 = new FqName("org.jspecify.annotations.NullnessUnspecified");
        f144250g = fqName7;
        FqName fqName8 = new FqName("org.jspecify.annotations.NullUnmarked");
        f144251h = fqName8;
        f144252i = new FqName("javax.annotation.meta.TypeQualifier");
        f144253j = new FqName("javax.annotation.meta.TypeQualifierNickname");
        f144254k = new FqName("javax.annotation.meta.TypeQualifierDefault");
        FqName fqName9 = new FqName("javax.annotation.Nonnull");
        f144255l = fqName9;
        FqName fqName10 = new FqName("javax.annotation.Nullable");
        f144256m = fqName10;
        FqName fqName11 = new FqName("javax.annotation.CheckForNull");
        f144257n = fqName11;
        f144258o = new FqName("javax.annotation.ParametersAreNonnullByDefault");
        f144259p = new FqName("javax.annotation.ParametersAreNullableByDefault");
        f144260q = SetsKt.i(fqName9, fqName11);
        Set<FqName> setI = SetsKt.i(JvmAnnotationNames.f144232l, fqName4, new FqName("android.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.RecentlyNonNull"), new FqName("android.support.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("lombok.NonNull"));
        f144261r = setI;
        Set<FqName> setI2 = SetsKt.i(JvmAnnotationNames.f144233m, fqName, fqName5, fqName10, fqName11, new FqName("android.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.RecentlyNullable"), new FqName("android.support.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"));
        f144262s = setI2;
        f144263t = SetsKt.i(fqName3, fqName7);
        f144264u = SetsKt.m(SetsKt.m(SetsKt.m(SetsKt.m(SetsKt.l(SetsKt.l(new LinkedHashSet(), setI), setI2), fqName9), fqName2), fqName6), fqName8);
        f144265v = SetsKt.i(JvmAnnotationNames.f144235o, JvmAnnotationNames.f144236p);
        f144266w = SetsKt.i(JvmAnnotationNames.f144234n, JvmAnnotationNames.f144237q);
        f144267x = MapsKt.o(TuplesKt.a(JvmAnnotationNames.f144224d, StandardNames.FqNames.f143334H), TuplesKt.a(JvmAnnotationNames.f144226f, StandardNames.FqNames.f143342L), TuplesKt.a(JvmAnnotationNames.f144228h, StandardNames.FqNames.f143416y), TuplesKt.a(JvmAnnotationNames.f144229i, StandardNames.FqNames.f143350P));
        f144268y = new FqName("kotlin.annotations.jvm.UnderMigration");
    }

    public static final Set<FqName> a() {
        return f144260q;
    }

    public static final Set<FqName> b() {
        return f144263t;
    }

    public static final FqName c() {
        return f144255l;
    }

    public static final FqName d() {
        return f144258o;
    }

    public static final FqName e() {
        return f144259p;
    }

    public static final FqName f() {
        return f144252i;
    }

    public static final FqName g() {
        return f144254k;
    }

    public static final FqName h() {
        return f144253j;
    }

    public static final FqName i() {
        return f144249f;
    }

    public static final FqName j() {
        return f144251h;
    }

    public static final FqName k() {
        return f144245b;
    }

    public static final Set<FqName> l() {
        return f144266w;
    }

    public static final Set<FqName> m() {
        return f144261r;
    }

    public static final Set<FqName> n() {
        return f144262s;
    }

    public static final Set<FqName> o() {
        return f144265v;
    }

    public static final FqName p() {
        return f144268y;
    }
}
