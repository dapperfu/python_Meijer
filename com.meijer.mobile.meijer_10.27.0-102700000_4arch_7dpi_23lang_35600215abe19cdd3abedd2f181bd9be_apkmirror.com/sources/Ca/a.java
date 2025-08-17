package Ca;

import F9.m;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"LCa/a;", "LF9/m;", "", "<init>", "(Ljava/lang/String;I)V", "", "getKey", "()Ljava/lang/String;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3735a = new a("REFRESH_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f3736b = new a("CONTACT_TOKEN", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f3737c = new a("CLIENT_STATE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f3738d = new a("CONTACT_FIELD_VALUE", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final a f3739e = new a("PUSH_TOKEN", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final a f3740f = new a("LOCAL_PUSH_TOKEN", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final a f3741g = new a("EVENT_SERVICE_URL", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final a f3742h = new a("CLIENT_SERVICE_URL", 7);

    /* renamed from: i, reason: collision with root package name */
    public static final a f3743i = new a("MESSAGE_INBOX_SERVICE_URL", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final a f3744j = new a("DEEPLINK_SERVICE_URL", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final a f3745k = new a("GEOFENCE_ENABLED", 10);

    /* renamed from: l, reason: collision with root package name */
    public static final a f3746l = new a("DEVICE_EVENT_STATE", 11);

    /* renamed from: m, reason: collision with root package name */
    public static final a f3747m = new a("DEVICE_INFO_HASH", 12);

    /* renamed from: n, reason: collision with root package name */
    public static final a f3748n = new a("GEOFENCE_INITIAL_ENTER_TRIGGER", 13);

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ a[] f3749o;

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f3750p;

    static {
        a[] aVarArrA = a();
        f3749o = aVarArrA;
        f3750p = EnumEntriesKt.a(aVarArrA);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f3735a, f3736b, f3737c, f3738d, f3739e, f3740f, f3741g, f3742h, f3743i, f3744j, f3745k, f3746l, f3747m, f3748n};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3749o.clone();
    }

    private a(String str, int i10) {
    }

    @Override // F9.m
    public String getKey() {
        String strName = name();
        Locale locale = Locale.getDefault();
        Intrinsics.i(locale, "getDefault(...)");
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return "mobile_engage_" + lowerCase;
    }
}
