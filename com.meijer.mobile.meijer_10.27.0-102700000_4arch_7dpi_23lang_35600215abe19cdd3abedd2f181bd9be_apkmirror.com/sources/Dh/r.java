package Dh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\tj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LDh/r;", "", "", "preferenceTypeName", "owningProgramName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "d", "f", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final r f6567c = new r("ENROLLED_DIGITAL_RECEIPTS_EMAIL", 0, "EnrolledInDigitalReceiptsEmail", "DigitalReceipts");

    /* renamed from: d, reason: collision with root package name */
    public static final r f6568d = new r("FIRST_ENROLLED_DIGITAL_RECEIPTS", 1, "FirstEnrolledInDigitalReceipts", "DigitalReceipts");

    /* renamed from: e, reason: collision with root package name */
    public static final r f6569e = new r("SUBSTITUTIONS", 2, "Substitutions", "DigitalGrocery");

    /* renamed from: f, reason: collision with root package name */
    public static final r f6570f = new r("MOBILE_NOTIFICATIONS", 3, "MobileNotifications", "mPerks");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ r[] f6571g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6572h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String preferenceTypeName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String owningProgramName;

    static {
        r[] rVarArrA = a();
        f6571g = rVarArrA;
        f6572h = EnumEntriesKt.a(rVarArrA);
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{f6567c, f6568d, f6569e, f6570f};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f6571g.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getOwningProgramName() {
        return this.owningProgramName;
    }

    /* renamed from: e, reason: from getter */
    public final String getPreferenceTypeName() {
        return this.preferenceTypeName;
    }

    private r(String str, int i10, String str2, String str3) {
        this.preferenceTypeName = str2;
        this.owningProgramName = str3;
    }
}
