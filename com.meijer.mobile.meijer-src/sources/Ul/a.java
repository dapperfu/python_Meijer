package Ul;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LUl/a;", "", "", "displayName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f37566b = new a("LOAD", 0, "Load");

    /* renamed from: c, reason: collision with root package name */
    public static final a f37567c = new a("VIEW", 1, "View");

    /* renamed from: d, reason: collision with root package name */
    public static final a f37568d = new a("CLICK", 2, "Click");

    /* renamed from: e, reason: collision with root package name */
    public static final a f37569e = new a("BASKET_CHANGE", 3, "basketChange");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f37570f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37571g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String displayName;

    static {
        a[] aVarArrA = a();
        f37570f = aVarArrA;
        f37571g = EnumEntriesKt.a(aVarArrA);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f37566b, f37567c, f37568d, f37569e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f37570f.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    private a(String str, int i10, String str2) {
        this.displayName = str2;
    }
}
