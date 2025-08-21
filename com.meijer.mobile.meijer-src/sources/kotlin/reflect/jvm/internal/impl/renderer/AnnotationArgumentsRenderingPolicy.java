package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class AnnotationArgumentsRenderingPolicy {

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationArgumentsRenderingPolicy f146882c = new AnnotationArgumentsRenderingPolicy("NO_ARGUMENTS", 0, false, false, 3, null);

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotationArgumentsRenderingPolicy f146883d = new AnnotationArgumentsRenderingPolicy("UNLESS_EMPTY", 1, true, false, 2, null);

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotationArgumentsRenderingPolicy f146884e = new AnnotationArgumentsRenderingPolicy("ALWAYS_PARENTHESIZED", 2, true, true);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] f146885f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146886g;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f146887a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f146888b;

    private AnnotationArgumentsRenderingPolicy(String str, int i10, boolean z10, boolean z11) {
        this.f146887a = z10;
        this.f146888b = z11;
    }

    private static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] a() {
        return new AnnotationArgumentsRenderingPolicy[]{f146882c, f146883d, f146884e};
    }

    static {
        AnnotationArgumentsRenderingPolicy[] annotationArgumentsRenderingPolicyArrA = a();
        f146885f = annotationArgumentsRenderingPolicyArrA;
        f146886g = EnumEntriesKt.a(annotationArgumentsRenderingPolicyArrA);
    }

    public static AnnotationArgumentsRenderingPolicy valueOf(String str) {
        return (AnnotationArgumentsRenderingPolicy) Enum.valueOf(AnnotationArgumentsRenderingPolicy.class, str);
    }

    public static AnnotationArgumentsRenderingPolicy[] values() {
        return (AnnotationArgumentsRenderingPolicy[]) f146885f.clone();
    }

    public final boolean b() {
        return this.f146887a;
    }

    public final boolean e() {
        return this.f146888b;
    }

    /* synthetic */ AnnotationArgumentsRenderingPolicy(String str, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11);
    }
}
