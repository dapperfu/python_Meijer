package Ol;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LOl/g;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f24077b = new g("QUANTITY", 0, "quantityEntered");

    /* renamed from: c, reason: collision with root package name */
    public static final g f24078c = new g("WEIGHT", 1, "weightEntered");

    /* renamed from: d, reason: collision with root package name */
    public static final g f24079d = new g("PRICE", 2, "priceEntered");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ g[] f24080e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f24081f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    static {
        g[] gVarArrA = a();
        f24080e = gVarArrA;
        f24081f = EnumEntriesKt.a(gVarArrA);
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f24077b, f24078c, f24079d};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f24080e.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    private g(String str, int i10, String str2) {
        this.type = str2;
    }
}
