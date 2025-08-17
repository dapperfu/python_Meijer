package kotlin.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequireKotlinVersionKind {

    /* renamed from: a, reason: collision with root package name */
    public static final RequireKotlinVersionKind f142683a = new RequireKotlinVersionKind("LANGUAGE_VERSION", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final RequireKotlinVersionKind f142684b = new RequireKotlinVersionKind("COMPILER_VERSION", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final RequireKotlinVersionKind f142685c = new RequireKotlinVersionKind("API_VERSION", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ RequireKotlinVersionKind[] f142686d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f142687e;

    private static final /* synthetic */ RequireKotlinVersionKind[] a() {
        return new RequireKotlinVersionKind[]{f142683a, f142684b, f142685c};
    }

    static {
        RequireKotlinVersionKind[] requireKotlinVersionKindArrA = a();
        f142686d = requireKotlinVersionKindArrA;
        f142687e = EnumEntriesKt.a(requireKotlinVersionKindArrA);
    }

    public static RequireKotlinVersionKind valueOf(String str) {
        return (RequireKotlinVersionKind) Enum.valueOf(RequireKotlinVersionKind.class, str);
    }

    public static RequireKotlinVersionKind[] values() {
        return (RequireKotlinVersionKind[]) f142686d.clone();
    }

    private RequireKotlinVersionKind(String str, int i10) {
    }
}
