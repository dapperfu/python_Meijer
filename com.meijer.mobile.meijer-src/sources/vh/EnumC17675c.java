package vh;

import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\r¨\u0006\u0011"}, d2 = {"Lvh/c;", "", "", "typeId", "", "typeName", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "I", "b", "()I", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "d", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC17675c {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17675c f165865c = new EnumC17675c("BILLING", 0, 2, "BillingAddress");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17675c f165866d = new EnumC17675c("SHIPPING", 1, 3, "ShippingAddress");

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17675c f165867e = new EnumC17675c("UNKNOWN", 2, 99, zzbz.UNKNOWN_CONTENT_TYPE);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC17675c[] f165868f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f165869g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int typeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String typeName;

    static {
        EnumC17675c[] enumC17675cArrA = a();
        f165868f = enumC17675cArrA;
        f165869g = EnumEntriesKt.a(enumC17675cArrA);
    }

    private static final /* synthetic */ EnumC17675c[] a() {
        return new EnumC17675c[]{f165865c, f165866d, f165867e};
    }

    public static EnumC17675c valueOf(String str) {
        return (EnumC17675c) Enum.valueOf(EnumC17675c.class, str);
    }

    public static EnumC17675c[] values() {
        return (EnumC17675c[]) f165868f.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: e, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    private EnumC17675c(String str, int i10, int i11, String str2) {
        this.typeId = i11;
        this.typeName = str2;
    }
}
