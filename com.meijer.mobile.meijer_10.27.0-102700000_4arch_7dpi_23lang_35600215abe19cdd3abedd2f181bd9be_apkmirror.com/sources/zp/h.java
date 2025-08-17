package zp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lzp/h;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "c", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f173195b = new h("ASC", 0, "ASC");

    /* renamed from: c, reason: collision with root package name */
    public static final h f173196c = new h("DESC", 1, "DESC");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h[] f173197d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f173198e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    static {
        h[] hVarArrA = a();
        f173197d = hVarArrA;
        f173198e = EnumEntriesKt.a(hVarArrA);
    }

    private static final /* synthetic */ h[] a() {
        return new h[]{f173195b, f173196c};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f173197d.clone();
    }

    private h(String str, int i10, String str2) {
        this.value = str2;
    }
}
