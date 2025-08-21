package Yk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\tj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LYk/a;", "", "", "isSuccess", "isLoading", "<init>", "(Ljava/lang/String;IZZ)V", "a", "Z", "e", "()Z", "b", "c", "d", "f", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f43121c = new a("SUCCESS", 0, true, false);

    /* renamed from: d, reason: collision with root package name */
    public static final a f43122d = new a("FAILURE", 1, false, false);

    /* renamed from: e, reason: collision with root package name */
    public static final a f43123e = new a("LOADING", 2, false, true);

    /* renamed from: f, reason: collision with root package name */
    public static final a f43124f = new a("NOT_LOADING", 3, false, false);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ a[] f43125g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f43126h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isSuccess;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isLoading;

    static {
        a[] aVarArrA = a();
        f43125g = aVarArrA;
        f43126h = EnumEntriesKt.a(aVarArrA);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f43121c, f43122d, f43123e, f43124f};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f43125g.clone();
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    private a(String str, int i10, boolean z10, boolean z11) {
        this.isSuccess = z10;
        this.isLoading = z11;
    }
}
