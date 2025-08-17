package Wr;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LWr/b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f39001a = new b("TEXT_WITH_TAG", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f39002b = new b("TEXT_WITH_PROGRESS_BAR", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ b[] f39003c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f39004d;

    static {
        b[] bVarArrA = a();
        f39003c = bVarArrA;
        f39004d = EnumEntriesKt.a(bVarArrA);
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f39001a, f39002b};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f39003c.clone();
    }

    private b(String str, int i10) {
    }
}
