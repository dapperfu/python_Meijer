package kotlin.annotation;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnnotationTarget {

    /* renamed from: a, reason: collision with root package name */
    public static final AnnotationTarget f142435a = new AnnotationTarget("CLASS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final AnnotationTarget f142436b = new AnnotationTarget("ANNOTATION_CLASS", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationTarget f142437c = new AnnotationTarget("TYPE_PARAMETER", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotationTarget f142438d = new AnnotationTarget("PROPERTY", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotationTarget f142439e = new AnnotationTarget("FIELD", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final AnnotationTarget f142440f = new AnnotationTarget("LOCAL_VARIABLE", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final AnnotationTarget f142441g = new AnnotationTarget("VALUE_PARAMETER", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final AnnotationTarget f142442h = new AnnotationTarget("CONSTRUCTOR", 7);

    /* renamed from: i, reason: collision with root package name */
    public static final AnnotationTarget f142443i = new AnnotationTarget("FUNCTION", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final AnnotationTarget f142444j = new AnnotationTarget("PROPERTY_GETTER", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final AnnotationTarget f142445k = new AnnotationTarget("PROPERTY_SETTER", 10);

    /* renamed from: l, reason: collision with root package name */
    public static final AnnotationTarget f142446l = new AnnotationTarget("TYPE", 11);

    /* renamed from: m, reason: collision with root package name */
    public static final AnnotationTarget f142447m = new AnnotationTarget("EXPRESSION", 12);

    /* renamed from: n, reason: collision with root package name */
    public static final AnnotationTarget f142448n = new AnnotationTarget("FILE", 13);

    /* renamed from: o, reason: collision with root package name */
    @SinceKotlin
    public static final AnnotationTarget f142449o = new AnnotationTarget("TYPEALIAS", 14);

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ AnnotationTarget[] f142450p;

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f142451q;

    private static final /* synthetic */ AnnotationTarget[] a() {
        return new AnnotationTarget[]{f142435a, f142436b, f142437c, f142438d, f142439e, f142440f, f142441g, f142442h, f142443i, f142444j, f142445k, f142446l, f142447m, f142448n, f142449o};
    }

    static {
        AnnotationTarget[] annotationTargetArrA = a();
        f142450p = annotationTargetArrA;
        f142451q = EnumEntriesKt.a(annotationTargetArrA);
    }

    public static AnnotationTarget valueOf(String str) {
        return (AnnotationTarget) Enum.valueOf(AnnotationTarget.class, str);
    }

    public static AnnotationTarget[] values() {
        return (AnnotationTarget[]) f142450p.clone();
    }

    private AnnotationTarget(String str, int i10) {
    }
}
