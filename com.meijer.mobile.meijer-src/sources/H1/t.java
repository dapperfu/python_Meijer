package H1;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LH1/t;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f13338a = new t("Ltr", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final t f13339b = new t("Rtl", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ t[] f13340c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13341d;

    static {
        t[] tVarArrA = a();
        f13340c = tVarArrA;
        f13341d = EnumEntriesKt.a(tVarArrA);
    }

    private static final /* synthetic */ t[] a() {
        return new t[]{f13338a, f13339b};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f13340c.clone();
    }

    private t(String str, int i10) {
    }
}
