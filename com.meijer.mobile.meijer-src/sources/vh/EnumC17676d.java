package vh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lvh/d;", "", "", "validationCode", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "e", "f", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC17676d {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17676d f165872b = new EnumC17676d("UNVERIFIED", 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17676d f165873c = new EnumC17676d("USPS_VERIFIED", 1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17676d f165874d = new EnumC17676d("GOOGLE_VERIFIED", 2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17676d f165875e = new EnumC17676d("FAILED_VERIFY", 3, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC17676d f165876f = new EnumC17676d("VERTEX_VERIFIED", 4, 4);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC17676d[] f165877g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f165878h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int validationCode;

    static {
        EnumC17676d[] enumC17676dArrA = a();
        f165877g = enumC17676dArrA;
        f165878h = EnumEntriesKt.a(enumC17676dArrA);
    }

    private static final /* synthetic */ EnumC17676d[] a() {
        return new EnumC17676d[]{f165872b, f165873c, f165874d, f165875e, f165876f};
    }

    public static EnumC17676d valueOf(String str) {
        return (EnumC17676d) Enum.valueOf(EnumC17676d.class, str);
    }

    public static EnumC17676d[] values() {
        return (EnumC17676d[]) f165877g.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getValidationCode() {
        return this.validationCode;
    }

    private EnumC17676d(String str, int i10, int i11) {
        this.validationCode = i11;
    }
}
