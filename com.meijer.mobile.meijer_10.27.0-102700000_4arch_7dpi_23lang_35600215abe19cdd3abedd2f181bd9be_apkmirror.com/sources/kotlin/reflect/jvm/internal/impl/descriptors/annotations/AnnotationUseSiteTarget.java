package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class AnnotationUseSiteTarget {

    /* renamed from: b, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f143671b = new AnnotationUseSiteTarget("ALL", 0, null, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f143672c = new AnnotationUseSiteTarget("FIELD", 1, null, 1, null);

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f143673d = new AnnotationUseSiteTarget("FILE", 2, null, 1, null);

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f143674e = new AnnotationUseSiteTarget("PROPERTY", 3, null, 1, null);

    /* renamed from: f, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f143675f = new AnnotationUseSiteTarget("PROPERTY_GETTER", 4, "get");

    /* renamed from: g, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f143676g = new AnnotationUseSiteTarget("PROPERTY_SETTER", 5, "set");

    /* renamed from: h, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f143677h = new AnnotationUseSiteTarget("RECEIVER", 6, null, 1, null);

    /* renamed from: i, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f143678i = new AnnotationUseSiteTarget("CONSTRUCTOR_PARAMETER", 7, "param");

    /* renamed from: j, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f143679j = new AnnotationUseSiteTarget("SETTER_PARAMETER", 8, "setparam");

    /* renamed from: k, reason: collision with root package name */
    public static final AnnotationUseSiteTarget f143680k = new AnnotationUseSiteTarget("PROPERTY_DELEGATE_FIELD", 9, "delegate");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AnnotationUseSiteTarget[] f143681l;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143682m;

    /* renamed from: a, reason: collision with root package name */
    private final String f143683a;

    private AnnotationUseSiteTarget(String str, int i10, String str2) {
        this.f143683a = str2 == null ? CapitalizeDecapitalizeKt.f(name()) : str2;
    }

    private static final /* synthetic */ AnnotationUseSiteTarget[] a() {
        return new AnnotationUseSiteTarget[]{f143671b, f143672c, f143673d, f143674e, f143675f, f143676g, f143677h, f143678i, f143679j, f143680k};
    }

    static {
        AnnotationUseSiteTarget[] annotationUseSiteTargetArrA = a();
        f143681l = annotationUseSiteTargetArrA;
        f143682m = EnumEntriesKt.a(annotationUseSiteTargetArrA);
    }

    public static AnnotationUseSiteTarget valueOf(String str) {
        return (AnnotationUseSiteTarget) Enum.valueOf(AnnotationUseSiteTarget.class, str);
    }

    public static AnnotationUseSiteTarget[] values() {
        return (AnnotationUseSiteTarget[]) f143681l.clone();
    }

    public final String b() {
        return this.f143683a;
    }

    /* synthetic */ AnnotationUseSiteTarget(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? null : str2);
    }
}
