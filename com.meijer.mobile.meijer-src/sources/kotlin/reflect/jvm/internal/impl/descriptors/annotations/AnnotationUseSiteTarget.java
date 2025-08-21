package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class AnnotationUseSiteTarget {

    /* renamed from: b, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f144578b = new AnnotationUseSiteTarget("ALL", 0, null, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f144579c = new AnnotationUseSiteTarget("FIELD", 1, null, 1, null);

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f144580d = new AnnotationUseSiteTarget("FILE", 2, null, 1, null);

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f144581e = new AnnotationUseSiteTarget("PROPERTY", 3, null, 1, null);

    /* renamed from: f, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f144582f = new AnnotationUseSiteTarget("PROPERTY_GETTER", 4, "get");

    /* renamed from: g, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f144583g = new AnnotationUseSiteTarget("PROPERTY_SETTER", 5, "set");

    /* renamed from: h, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f144584h = new AnnotationUseSiteTarget("RECEIVER", 6, null, 1, null);

    /* renamed from: i, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f144585i = new AnnotationUseSiteTarget("CONSTRUCTOR_PARAMETER", 7, "param");

    /* renamed from: j, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f144586j = new AnnotationUseSiteTarget("SETTER_PARAMETER", 8, "setparam");

    /* renamed from: k, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f144587k = new AnnotationUseSiteTarget("PROPERTY_DELEGATE_FIELD", 9, "delegate");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AnnotationUseSiteTarget[] f144588l;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144589m;

    /* renamed from: a, reason: collision with root package name */
    private final String f144590a;

    private AnnotationUseSiteTarget(String str, int i10, String str2) {
        this.f144590a = str2 == null ? CapitalizeDecapitalizeKt.f(name()) : str2;
    }

    private static final /* synthetic */ AnnotationUseSiteTarget[] a() {
        return new AnnotationUseSiteTarget[]{f144578b, f144579c, f144580d, f144581e, f144582f, f144583g, f144584h, f144585i, f144586j, f144587k};
    }

    static {
        AnnotationUseSiteTarget[] annotationUseSiteTargetArrA = a();
        f144588l = annotationUseSiteTargetArrA;
        f144589m = EnumEntriesKt.a(annotationUseSiteTargetArrA);
    }

    public static AnnotationUseSiteTarget valueOf(String str) {
        return (AnnotationUseSiteTarget) Enum.valueOf(AnnotationUseSiteTarget.class, str);
    }

    public static AnnotationUseSiteTarget[] values() {
        return (AnnotationUseSiteTarget[]) f144588l.clone();
    }

    public final String b() {
        return this.f144590a;
    }

    /* synthetic */ AnnotationUseSiteTarget(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? null : str2);
    }
}
