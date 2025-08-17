package Pk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LPk/b;", "", "", "isLoading", "<init>", "(Ljava/lang/String;IZ)V", "a", "Z", "b", "()Z", "c", "d", "e", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f28321b = new b("NOT_LOADING", 0, false);

    /* renamed from: c, reason: collision with root package name */
    public static final b f28322c = new b("CLIPPING", 1, true);

    /* renamed from: d, reason: collision with root package name */
    public static final b f28323d = new b("UNCLIPPING", 2, true);

    /* renamed from: e, reason: collision with root package name */
    public static final b f28324e = new b("DISMISSING", 3, true);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ b[] f28325f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f28326g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isLoading;

    static {
        b[] bVarArrA = a();
        f28325f = bVarArrA;
        f28326g = EnumEntriesKt.a(bVarArrA);
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f28321b, f28322c, f28323d, f28324e};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f28325f.clone();
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    private b(String str, int i10, boolean z10) {
        this.isLoading = z10;
    }
}
