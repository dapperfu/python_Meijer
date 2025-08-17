package tp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Ltp/a;", "", "", "typeId", "", "typeName", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "I", "getTypeId", "()I", "b", "Ljava/lang/String;", "getTypeName", "()Ljava/lang/String;", "c", "d", "e", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC17127a {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17127a f161939c = new EnumC17127a("RATEANDTIP", 0, 1, "RateAndTipFlow");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17127a f161940d = new EnumC17127a("RATE", 1, 2, "JustRateFlow");

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17127a f161941e = new EnumC17127a("TIP", 2, 3, "JustTipFlow");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC17127a[] f161942f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f161943g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int typeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String typeName;

    static {
        EnumC17127a[] enumC17127aArrA = a();
        f161942f = enumC17127aArrA;
        f161943g = EnumEntriesKt.a(enumC17127aArrA);
    }

    private static final /* synthetic */ EnumC17127a[] a() {
        return new EnumC17127a[]{f161939c, f161940d, f161941e};
    }

    public static EnumC17127a valueOf(String str) {
        return (EnumC17127a) Enum.valueOf(EnumC17127a.class, str);
    }

    public static EnumC17127a[] values() {
        return (EnumC17127a[]) f161942f.clone();
    }

    private EnumC17127a(String str, int i10, int i11, String str2) {
        this.typeId = i11;
        this.typeName = str2;
    }
}
