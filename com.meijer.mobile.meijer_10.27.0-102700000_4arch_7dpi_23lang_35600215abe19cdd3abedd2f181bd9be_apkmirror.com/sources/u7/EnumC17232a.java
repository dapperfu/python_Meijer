package u7;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lu7/a;", "", "", "protocolValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: u7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC17232a {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17232a f162763b = new EnumC17232a("PLAIN", 0, "pl");

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17232a f162764c = new EnumC17232a("XAMARIN", 1, "xm");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17232a f162765d = new EnumC17232a("CORDOVA", 2, "cd");

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17232a f162766e = new EnumC17232a("FLUTTER", 3, "fl");

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC17232a f162767f = new EnumC17232a("REACT_NATIVE", 4, "rn");

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC17232a f162768g = new EnumC17232a("JETPACK_COMPOSE", 5, "jc");

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC17232a f162769h = new EnumC17232a("MAUI", 6, "ma");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC17232a[] f162770i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f162771j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String protocolValue;

    static {
        EnumC17232a[] enumC17232aArrA = a();
        f162770i = enumC17232aArrA;
        f162771j = EnumEntriesKt.a(enumC17232aArrA);
    }

    private static final /* synthetic */ EnumC17232a[] a() {
        return new EnumC17232a[]{f162763b, f162764c, f162765d, f162766e, f162767f, f162768g, f162769h};
    }

    public static EnumC17232a valueOf(String str) {
        return (EnumC17232a) Enum.valueOf(EnumC17232a.class, str);
    }

    public static EnumC17232a[] values() {
        return (EnumC17232a[]) f162770i.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getProtocolValue() {
        return this.protocolValue;
    }

    private EnumC17232a(String str, int i10, String str2) {
        this.protocolValue = str2;
    }
}
