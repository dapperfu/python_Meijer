package rk;

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
import pk.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b\u000fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006'"}, d2 = {"Lrk/a;", "Lrk/b;", "", "", "serviceErrorString", "", "errorResourceId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Landroid/content/Context;", "context", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "b", "I", "getErrorResourceId", "()I", "getResultCode", "resultCode", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rk.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC16795a implements b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC16795a f159026d = new EnumC16795a("INVALID_CREDENTIALS", 0, "Invalid username & password", f.f155795i);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC16795a f159027e = new EnumC16795a("INVALID_REFRESH_TOKEN", 1, "unknown, invalid, or expired refresh token", f.f155796j);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC16795a f159028f = new EnumC16795a("ACCOUNT_LOCKED", 2, "Account Locked", f.f155791e);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC16795a f159029g = new EnumC16795a("TOKEN_ERROR", 3, "token error", f.f155802p);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC16795a f159030h = new EnumC16795a("NO_ACCOUNT_WITH_THIS_EMAIL", 4, "We didn't recognize the username or password you entered. Please try again.", f.f155795i);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC16795a f159031i = new EnumC16795a("RESET_PASSWORD_ACCOUNT_NOT_VALID", 5, "Account is not valid", f.f155793g);

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC16795a f159032j = new EnumC16795a("RESET_PASSWORD_EMAIL_NOT_FOUND", 6, "Email not found", f.f155793g);

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC16795a f159033k = new EnumC16795a("ACCOUNT_UPDATE_ERROR", 7, "update account failed", f.f155809w);

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC16795a f159034l = new EnumC16795a("CREATE_MPERKS_ALREADY_EXISTS", 8, "already exist", f.f155799m);

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC16795a f159035m = new EnumC16795a("BARCODE_UNAVAILABLE_ERROR", 9, "barcode unavailable", f.f155790d);

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC16795a f159036n = new EnumC16795a("BILLING_ADDRESS_ERROR", 10, "todo: MAU-4521 unknown", f.f155787a);

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC16795a f159037o = new EnumC16795a("UPDATE_VEHICLE_INFORMATION_ERROR", 11, "todo: MAU-4521 unknown", f.f155810x);

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC16795a f159038p = new EnumC16795a("INVALID_EMAIL_FORMAT_ERROR", 12, "Email Format Needs To Be Valid.", f.f155794h);

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC16795a f159039q = new EnumC16795a("UPDATE_STORE_ERROR", 13, "todo: MAU-4521 unknown", f.f155807u);

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC16795a f159040r = new EnumC16795a("UPDATE_PIN_ERROR", 14, "Pin associated with the account is not valid.", f.f155800n);

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC16795a f159041s = new EnumC16795a("UNKNOWN_ERROR", 15, "unknown error", f.f155788b);

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ EnumC16795a[] f159042t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f159043u;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serviceErrorString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int errorResourceId;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrk/a$a;", "", "<init>", "()V", "", "errorString", "Lrk/a;", "a", "(Ljava/lang/String;)Lrk/a;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: rk.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EnumC16795a a(String errorString) {
            EnumC16795a enumC16795a;
            Intrinsics.j(errorString, "errorString");
            Iterator<EnumC16795a> it = EnumC16795a.e().iterator();
            while (true) {
                enumC16795a = null;
                if (!it.hasNext()) {
                    break;
                }
                EnumC16795a next = it.next();
                if (StringsKt.c0(errorString, next.getServiceErrorString(), false, 2, null)) {
                    enumC16795a = next;
                    break;
                }
            }
            EnumC16795a enumC16795a2 = enumC16795a;
            return enumC16795a2 == null ? EnumC16795a.f159041s : enumC16795a2;
        }
    }

    @JvmStatic
    public static final EnumC16795a b(String str) {
        return INSTANCE.a(str);
    }

    public static EnumEntries<EnumC16795a> e() {
        return f159043u;
    }

    @Override // rk.b
    public int getResultCode() {
        return -1;
    }

    static {
        EnumC16795a[] enumC16795aArrA = a();
        f159042t = enumC16795aArrA;
        f159043u = EnumEntriesKt.a(enumC16795aArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ EnumC16795a[] a() {
        return new EnumC16795a[]{f159026d, f159027e, f159028f, f159029g, f159030h, f159031i, f159032j, f159033k, f159034l, f159035m, f159036n, f159037o, f159038p, f159039q, f159040r, f159041s};
    }

    public static EnumC16795a valueOf(String str) {
        return (EnumC16795a) Enum.valueOf(EnumC16795a.class, str);
    }

    public static EnumC16795a[] values() {
        return (EnumC16795a[]) f159042t.clone();
    }

    @Override // rk.b
    public int getErrorResourceId() {
        return this.errorResourceId;
    }

    @Override // rk.b
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

    private EnumC16795a(String str, int i10, String str2, int i11) {
        this.serviceErrorString = str2;
        this.errorResourceId = i11;
    }
}
