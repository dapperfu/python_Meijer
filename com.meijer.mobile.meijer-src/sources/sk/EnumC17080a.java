package sk;

import android.content.Context;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qk.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b\u000fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006'"}, d2 = {"Lsk/a;", "Lsk/b;", "", "", "serviceErrorString", "", "errorResourceId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Landroid/content/Context;", "context", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "b", "I", "getErrorResourceId", "()I", "getResultCode", "resultCode", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sk.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC17080a implements b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17080a f160802d = new EnumC17080a("INVALID_CREDENTIALS", 0, "Invalid username & password", f.f158511i);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17080a f160803e = new EnumC17080a("INVALID_REFRESH_TOKEN", 1, "unknown, invalid, or expired refresh token", f.f158512j);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC17080a f160804f = new EnumC17080a("ACCOUNT_LOCKED", 2, "Account Locked", f.f158507e);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC17080a f160805g = new EnumC17080a("TOKEN_ERROR", 3, "token error", f.f158518p);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC17080a f160806h = new EnumC17080a("NO_ACCOUNT_WITH_THIS_EMAIL", 4, "We didn't recognize the username or password you entered. Please try again.", f.f158511i);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC17080a f160807i = new EnumC17080a("RESET_PASSWORD_ACCOUNT_NOT_VALID", 5, "Account is not valid", f.f158509g);

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC17080a f160808j = new EnumC17080a("RESET_PASSWORD_EMAIL_NOT_FOUND", 6, "Email not found", f.f158509g);

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC17080a f160809k = new EnumC17080a("ACCOUNT_UPDATE_ERROR", 7, "update account failed", f.f158525w);

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC17080a f160810l = new EnumC17080a("CREATE_MPERKS_ALREADY_EXISTS", 8, "already exist", f.f158515m);

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC17080a f160811m = new EnumC17080a("BARCODE_UNAVAILABLE_ERROR", 9, "barcode unavailable", f.f158506d);

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC17080a f160812n = new EnumC17080a("BILLING_ADDRESS_ERROR", 10, "todo: MAU-4521 unknown", f.f158503a);

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC17080a f160813o = new EnumC17080a("UPDATE_VEHICLE_INFORMATION_ERROR", 11, "todo: MAU-4521 unknown", f.f158526x);

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC17080a f160814p = new EnumC17080a("INVALID_EMAIL_FORMAT_ERROR", 12, "Email Format Needs To Be Valid.", f.f158510h);

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC17080a f160815q = new EnumC17080a("UPDATE_STORE_ERROR", 13, "todo: MAU-4521 unknown", f.f158523u);

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC17080a f160816r = new EnumC17080a("UPDATE_PIN_ERROR", 14, "Pin associated with the account is not valid.", f.f158516n);

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC17080a f160817s = new EnumC17080a("UNKNOWN_ERROR", 15, "unknown error", f.f158504b);

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ EnumC17080a[] f160818t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f160819u;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serviceErrorString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int errorResourceId;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsk/a$a;", "", "<init>", "()V", "", "errorString", "Lsk/a;", "a", "(Ljava/lang/String;)Lsk/a;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: sk.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EnumC17080a a(String errorString) {
            EnumC17080a enumC17080a;
            Intrinsics.j(errorString, "errorString");
            Iterator<EnumC17080a> it = EnumC17080a.e().iterator();
            while (true) {
                enumC17080a = null;
                if (!it.hasNext()) {
                    break;
                }
                EnumC17080a next = it.next();
                if (StringsKt.d0(errorString, next.getServiceErrorString(), false, 2, null)) {
                    enumC17080a = next;
                    break;
                }
            }
            EnumC17080a enumC17080a2 = enumC17080a;
            return enumC17080a2 == null ? EnumC17080a.f160817s : enumC17080a2;
        }
    }

    @JvmStatic
    public static final EnumC17080a b(String str) {
        return INSTANCE.a(str);
    }

    public static EnumEntries<EnumC17080a> e() {
        return f160819u;
    }

    @Override // sk.b
    public int getResultCode() {
        return -1;
    }

    static {
        EnumC17080a[] enumC17080aArrA = a();
        f160818t = enumC17080aArrA;
        f160819u = EnumEntriesKt.a(enumC17080aArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ EnumC17080a[] a() {
        return new EnumC17080a[]{f160802d, f160803e, f160804f, f160805g, f160806h, f160807i, f160808j, f160809k, f160810l, f160811m, f160812n, f160813o, f160814p, f160815q, f160816r, f160817s};
    }

    public static EnumC17080a valueOf(String str) {
        return (EnumC17080a) Enum.valueOf(EnumC17080a.class, str);
    }

    public static EnumC17080a[] values() {
        return (EnumC17080a[]) f160818t.clone();
    }

    @Override // sk.b
    public int getErrorResourceId() {
        return this.errorResourceId;
    }

    @Override // sk.b
    public String getErrorString(Context context) {
        Intrinsics.j(context, "context");
        String string = context.getString(getErrorResourceId());
        Intrinsics.i(string, "getString(...)");
        return string;
    }

    /* renamed from: l, reason: from getter */
    public final String getServiceErrorString() {
        return this.serviceErrorString;
    }

    private EnumC17080a(String str, int i10, String str2, int i11) {
        this.serviceErrorString = str2;
        this.errorResourceId = i11;
    }
}
