package K6;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LK6/i;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f16399a = new i("Text", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final i f16400b = new i("Binary", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ i[] f16401c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16402d;

    static {
        i[] iVarArrA = a();
        f16401c = iVarArrA;
        f16402d = EnumEntriesKt.a(iVarArrA);
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f16399a, f16400b};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f16401c.clone();
    }

    private i(String str, int i10) {
    }
}
