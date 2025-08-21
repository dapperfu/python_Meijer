package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LLi/q;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f19041a = new q("ToastIcon", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final q f19042b = new q("CloseButton", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final q f19043c = new q("ActionLabel", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final q f19044d = new q("TitleLabel", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final q f19045e = new q("BodyLabel", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final q f19046f = new q("DividerId", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final q f19047g = new q("Banner", 6);

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ q[] f19048h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f19049i;

    static {
        q[] qVarArrA = a();
        f19048h = qVarArrA;
        f19049i = EnumEntriesKt.a(qVarArrA);
    }

    private static final /* synthetic */ q[] a() {
        return new q[]{f19041a, f19042b, f19043c, f19044d, f19045e, f19046f, f19047g};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f19048h.clone();
    }

    private q(String str, int i10) {
    }
}
