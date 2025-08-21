package w7;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lw7/a;", "", "", "protocolValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC17849a {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17849a f166972b = new EnumC17849a("PLAIN", 0, "pl");

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17849a f166973c = new EnumC17849a("XAMARIN", 1, "xm");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17849a f166974d = new EnumC17849a("CORDOVA", 2, "cd");

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17849a f166975e = new EnumC17849a("FLUTTER", 3, "fl");

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC17849a f166976f = new EnumC17849a("REACT_NATIVE", 4, "rn");

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC17849a f166977g = new EnumC17849a("JETPACK_COMPOSE", 5, "jc");

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC17849a f166978h = new EnumC17849a("MAUI", 6, "ma");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC17849a[] f166979i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f166980j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String protocolValue;

    static {
        EnumC17849a[] enumC17849aArrA = a();
        f166979i = enumC17849aArrA;
        f166980j = EnumEntriesKt.a(enumC17849aArrA);
    }

    private static final /* synthetic */ EnumC17849a[] a() {
        return new EnumC17849a[]{f166972b, f166973c, f166974d, f166975e, f166976f, f166977g, f166978h};
    }

    public static EnumC17849a valueOf(String str) {
        return (EnumC17849a) Enum.valueOf(EnumC17849a.class, str);
    }

    public static EnumC17849a[] values() {
        return (EnumC17849a[]) f166979i.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getProtocolValue() {
        return this.protocolValue;
    }

    private EnumC17849a(String str, int i10, String str2) {
        this.protocolValue = str2;
    }
}
