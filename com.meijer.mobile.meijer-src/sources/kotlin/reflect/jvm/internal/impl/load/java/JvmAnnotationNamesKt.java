package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public final class JvmAnnotationNamesKt {

    /* renamed from: a, reason: collision with root package name */
    private static final FqName f145151a;

    /* renamed from: b, reason: collision with root package name */
    private static final FqName f145152b;

    /* renamed from: c, reason: collision with root package name */
    private static final FqName f145153c;

    /* renamed from: d, reason: collision with root package name */
    private static final FqName f145154d;

    /* renamed from: e, reason: collision with root package name */
    private static final FqName f145155e;

    /* renamed from: f, reason: collision with root package name */
    private static final FqName f145156f;

    /* renamed from: g, reason: collision with root package name */
    private static final FqName f145157g;

    /* renamed from: h, reason: collision with root package name */
    private static final FqName f145158h;

    /* renamed from: i, reason: collision with root package name */
    private static final FqName f145159i;

    /* renamed from: j, reason: collision with root package name */
    private static final FqName f145160j;

    /* renamed from: k, reason: collision with root package name */
    private static final FqName f145161k;

    /* renamed from: l, reason: collision with root package name */
    private static final FqName f145162l;

    /* renamed from: m, reason: collision with root package name */
    private static final FqName f145163m;

    /* renamed from: n, reason: collision with root package name */
    private static final FqName f145164n;

    /* renamed from: o, reason: collision with root package name */
    private static final FqName f145165o;

    /* renamed from: p, reason: collision with root package name */
    private static final FqName f145166p;

    /* renamed from: q, reason: collision with root package name */
    private static final Set<FqName> f145167q;

    /* renamed from: r, reason: collision with root package name */
    private static final Set<FqName> f145168r;

    /* renamed from: s, reason: collision with root package name */
    private static final Set<FqName> f145169s;

    /* renamed from: t, reason: collision with root package name */
    private static final Set<FqName> f145170t;

    /* renamed from: u, reason: collision with root package name */
    private static final Set<FqName> f145171u;

    /* renamed from: v, reason: collision with root package name */
    private static final Set<FqName> f145172v;

    /* renamed from: w, reason: collision with root package name */
    private static final Set<FqName> f145173w;

    /* renamed from: x, reason: collision with root package name */
    private static final Map<FqName, FqName> f145174x;

    /* renamed from: y, reason: collision with root package name */
    private static final FqName f145175y;

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        f145151a = fqName;
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        f145152b = fqName2;
        FqName fqName3 = new FqName("org.jspecify.nullness.NullnessUnspecified");
        f145153c = fqName3;
        FqName fqName4 = new FqName("org.jspecify.annotations.NonNull");
        f145154d = fqName4;
        FqName fqName5 = new FqName("org.jspecify.annotations.Nullable");
        f145155e = fqName5;
        FqName fqName6 = new FqName("org.jspecify.annotations.NullMarked");
        f145156f = fqName6;
        FqName fqName7 = new FqName("org.jspecify.annotations.NullnessUnspecified");
        f145157g = fqName7;
        FqName fqName8 = new FqName("org.jspecify.annotations.NullUnmarked");
        f145158h = fqName8;
        f145159i = new FqName("javax.annotation.meta.TypeQualifier");
        f145160j = new FqName("javax.annotation.meta.TypeQualifierNickname");
        f145161k = new FqName("javax.annotation.meta.TypeQualifierDefault");
        FqName fqName9 = new FqName("javax.annotation.Nonnull");
        f145162l = fqName9;
        FqName fqName10 = new FqName("javax.annotation.Nullable");
        f145163m = fqName10;
        FqName fqName11 = new FqName("javax.annotation.CheckForNull");
        f145164n = fqName11;
        f145165o = new FqName("javax.annotation.ParametersAreNonnullByDefault");
        f145166p = new FqName("javax.annotation.ParametersAreNullableByDefault");
        f145167q = SetsKt.i(fqName9, fqName11);
        Set<FqName> setI = SetsKt.i(JvmAnnotationNames.f145139l, fqName4, new FqName("android.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.RecentlyNonNull"), new FqName("android.support.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("lombok.NonNull"));
        f145168r = setI;
        Set<FqName> setI2 = SetsKt.i(JvmAnnotationNames.f145140m, fqName, fqName5, fqName10, fqName11, new FqName("android.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.RecentlyNullable"), new FqName("android.support.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"));
        f145169s = setI2;
        f145170t = SetsKt.i(fqName3, fqName7);
        f145171u = SetsKt.m(SetsKt.m(SetsKt.m(SetsKt.m(SetsKt.l(SetsKt.l(new LinkedHashSet(), setI), setI2), fqName9), fqName2), fqName6), fqName8);
        f145172v = SetsKt.i(JvmAnnotationNames.f145142o, JvmAnnotationNames.f145143p);
        f145173w = SetsKt.i(JvmAnnotationNames.f145141n, JvmAnnotationNames.f145144q);
        f145174x = MapsKt.o(TuplesKt.a(JvmAnnotationNames.f145131d, StandardNames.FqNames.f144241H), TuplesKt.a(JvmAnnotationNames.f145133f, StandardNames.FqNames.f144249L), TuplesKt.a(JvmAnnotationNames.f145135h, StandardNames.FqNames.f144323y), TuplesKt.a(JvmAnnotationNames.f145136i, StandardNames.FqNames.f144257P));
        f145175y = new FqName("kotlin.annotations.jvm.UnderMigration");
    }

    public static final Set<FqName> a() {
        return f145167q;
    }

    public static final Set<FqName> b() {
        return f145170t;
    }

    public static final FqName c() {
        return f145162l;
    }

    public static final FqName d() {
        return f145165o;
    }

    public static final FqName e() {
        return f145166p;
    }

    public static final FqName f() {
        return f145159i;
    }

    public static final FqName g() {
        return f145161k;
    }

    public static final FqName h() {
        return f145160j;
    }

    public static final FqName i() {
        return f145156f;
    }

    public static final FqName j() {
        return f145158h;
    }

    public static final FqName k() {
        return f145152b;
    }

    public static final Set<FqName> l() {
        return f145173w;
    }

    public static final Set<FqName> m() {
        return f145168r;
    }

    public static final Set<FqName> n() {
        return f145169s;
    }

    public static final Set<FqName> o() {
        return f145172v;
    }

    public static final FqName p() {
        return f145175y;
    }
}
