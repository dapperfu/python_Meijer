package Js;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\bj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LJs/d;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "e", "()I", "b", "c", "d", "f", "g", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f16106b = new d("FLYER_ITEM", 0, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final d f16107c = new d("VIDEO", 1, 3);

    /* renamed from: d, reason: collision with root package name */
    public static final d f16108d = new d("WEB_LINKOUT", 2, 5);

    /* renamed from: e, reason: collision with root package name */
    public static final d f16109e = new d("FLYER_PAGE_LINK", 3, 7);

    /* renamed from: f, reason: collision with root package name */
    public static final d f16110f = new d("IFRAME", 4, 15);

    /* renamed from: g, reason: collision with root package name */
    public static final d f16111g = new d("COUPON", 5, 25);

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ d[] f16112h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16113i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    public static EnumEntries<d> b() {
        return f16113i;
    }

    static {
        d[] dVarArrA = a();
        f16112h = dVarArrA;
        f16113i = EnumEntriesKt.a(dVarArrA);
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f16106b, f16107c, f16108d, f16109e, f16110f, f16111g};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f16112h.clone();
    }

    /* renamed from: e, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    private d(String str, int i10, int i11) {
        this.value = i11;
    }
}
