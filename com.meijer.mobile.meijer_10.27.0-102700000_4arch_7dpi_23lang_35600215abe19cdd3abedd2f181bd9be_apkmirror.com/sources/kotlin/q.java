package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LKi/q;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f17163a = new q("ToastIcon", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final q f17164b = new q("CloseButton", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final q f17165c = new q("ActionLabel", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final q f17166d = new q("TitleLabel", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final q f17167e = new q("BodyLabel", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final q f17168f = new q("DividerId", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final q f17169g = new q("Banner", 6);

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ q[] f17170h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f17171i;

    static {
        q[] qVarArrA = a();
        f17170h = qVarArrA;
        f17171i = EnumEntriesKt.a(qVarArrA);
    }

    private static final /* synthetic */ q[] a() {
        return new q[]{f17163a, f17164b, f17165c, f17166d, f17167e, f17168f, f17169g};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f17170h.clone();
    }

    private q(String str, int i10) {
    }
}
