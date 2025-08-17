package bo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lbo/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bo.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC6273c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6273c f60499a = new EnumC6273c("All", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6273c f60500b = new EnumC6273c("FreeItems", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6273c f60501c = new EnumC6273c("Fuel", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6273c f60502d = new EnumC6273c("TotalPurchase", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6273c f60503e = new EnumC6273c("AutoClaim", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC6273c[] f60504f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60505g;

    static {
        EnumC6273c[] enumC6273cArrA = a();
        f60504f = enumC6273cArrA;
        f60505g = EnumEntriesKt.a(enumC6273cArrA);
    }

    private static final /* synthetic */ EnumC6273c[] a() {
        return new EnumC6273c[]{f60499a, f60500b, f60501c, f60502d, f60503e};
    }

    public static EnumC6273c valueOf(String str) {
        return (EnumC6273c) Enum.valueOf(EnumC6273c.class, str);
    }

    public static EnumC6273c[] values() {
        return (EnumC6273c[]) f60504f.clone();
    }

    private EnumC6273c(String str, int i10) {
    }
}
