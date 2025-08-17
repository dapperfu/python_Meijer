package uh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Luh/d;", "", "", "validationCode", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "e", "f", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uh.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC17262d {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17262d f162971b = new EnumC17262d("UNVERIFIED", 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17262d f162972c = new EnumC17262d("USPS_VERIFIED", 1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17262d f162973d = new EnumC17262d("GOOGLE_VERIFIED", 2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17262d f162974e = new EnumC17262d("FAILED_VERIFY", 3, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC17262d f162975f = new EnumC17262d("VERTEX_VERIFIED", 4, 4);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC17262d[] f162976g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f162977h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int validationCode;

    static {
        EnumC17262d[] enumC17262dArrA = a();
        f162976g = enumC17262dArrA;
        f162977h = EnumEntriesKt.a(enumC17262dArrA);
    }

    private static final /* synthetic */ EnumC17262d[] a() {
        return new EnumC17262d[]{f162971b, f162972c, f162973d, f162974e, f162975f};
    }

    public static EnumC17262d valueOf(String str) {
        return (EnumC17262d) Enum.valueOf(EnumC17262d.class, str);
    }

    public static EnumC17262d[] values() {
        return (EnumC17262d[]) f162976g.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getValidationCode() {
        return this.validationCode;
    }

    private EnumC17262d(String str, int i10, int i11) {
        this.validationCode = i11;
    }
}
