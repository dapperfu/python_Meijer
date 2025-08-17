package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class AnnotationArgumentsRenderingPolicy {

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationArgumentsRenderingPolicy f145975c = new AnnotationArgumentsRenderingPolicy("NO_ARGUMENTS", 0, false, false, 3, null);

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotationArgumentsRenderingPolicy f145976d = new AnnotationArgumentsRenderingPolicy("UNLESS_EMPTY", 1, true, false, 2, null);

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotationArgumentsRenderingPolicy f145977e = new AnnotationArgumentsRenderingPolicy("ALWAYS_PARENTHESIZED", 2, true, true);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] f145978f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f145979g;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f145980a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f145981b;

    private AnnotationArgumentsRenderingPolicy(String str, int i10, boolean z10, boolean z11) {
        this.f145980a = z10;
        this.f145981b = z11;
    }

    private static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] a() {
        return new AnnotationArgumentsRenderingPolicy[]{f145975c, f145976d, f145977e};
    }

    static {
        AnnotationArgumentsRenderingPolicy[] annotationArgumentsRenderingPolicyArrA = a();
        f145978f = annotationArgumentsRenderingPolicyArrA;
        f145979g = EnumEntriesKt.a(annotationArgumentsRenderingPolicyArrA);
    }

    public static AnnotationArgumentsRenderingPolicy valueOf(String str) {
        return (AnnotationArgumentsRenderingPolicy) Enum.valueOf(AnnotationArgumentsRenderingPolicy.class, str);
    }

    public static AnnotationArgumentsRenderingPolicy[] values() {
        return (AnnotationArgumentsRenderingPolicy[]) f145978f.clone();
    }

    public final boolean b() {
        return this.f145980a;
    }

    public final boolean e() {
        return this.f145981b;
    }

    /* synthetic */ AnnotationArgumentsRenderingPolicy(String str, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11);
    }
}
