package F1;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LF1/i;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f8930a = new i("Ltr", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final i f8931b = new i("Rtl", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ i[] f8932c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8933d;

    static {
        i[] iVarArrA = a();
        f8932c = iVarArrA;
        f8933d = EnumEntriesKt.a(iVarArrA);
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f8930a, f8931b};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f8932c.clone();
    }

    private i(String str, int i10) {
    }
}
