package Ol;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LOl/f;", "", "", "status", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f24069b = new f("NEW", 0, "New");

    /* renamed from: c, reason: collision with root package name */
    public static final f f24070c = new f("IN_PROGRESS", 1, "InProgress");

    /* renamed from: d, reason: collision with root package name */
    public static final f f24071d = new f("TRANSFER_IN_PROGRESS", 2, "TransferInProgress");

    /* renamed from: e, reason: collision with root package name */
    public static final f f24072e = new f("COMPLETE", 3, "Complete");

    /* renamed from: f, reason: collision with root package name */
    public static final f f24073f = new f("CANCEL", 4, "Cancel");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ f[] f24074g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f24075h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String status;

    static {
        f[] fVarArrA = a();
        f24074g = fVarArrA;
        f24075h = EnumEntriesKt.a(fVarArrA);
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f24069b, f24070c, f24071d, f24072e, f24073f};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f24074g.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    private f(String str, int i10, String str2) {
        this.status = str2;
    }
}
