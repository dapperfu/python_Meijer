package kotlin.annotation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnnotationRetention {

    /* renamed from: a, reason: collision with root package name */
    public static final AnnotationRetention f142430a = new AnnotationRetention("SOURCE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final AnnotationRetention f142431b = new AnnotationRetention("BINARY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationRetention f142432c = new AnnotationRetention("RUNTIME", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AnnotationRetention[] f142433d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f142434e;

    private static final /* synthetic */ AnnotationRetention[] a() {
        return new AnnotationRetention[]{f142430a, f142431b, f142432c};
    }

    static {
        AnnotationRetention[] annotationRetentionArrA = a();
        f142433d = annotationRetentionArrA;
        f142434e = EnumEntriesKt.a(annotationRetentionArrA);
    }

    public static AnnotationRetention valueOf(String str) {
        return (AnnotationRetention) Enum.valueOf(AnnotationRetention.class, str);
    }

    public static AnnotationRetention[] values() {
        return (AnnotationRetention[]) f142433d.clone();
    }

    private AnnotationRetention(String str, int i10) {
    }
}
