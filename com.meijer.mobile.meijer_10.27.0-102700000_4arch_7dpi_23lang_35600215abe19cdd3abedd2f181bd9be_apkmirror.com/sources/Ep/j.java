package Ep;

import android.content.Context;
import android.content.res.Resources;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012j\u0002\b\u001cj\u0002\b\tj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006'"}, d2 = {"LEp/j;", "Lrk/b;", "", "", "resultCode", "<init>", "(Ljava/lang/String;II)V", "", "message", "e", "(Ljava/lang/String;)LEp/j;", "Landroid/content/Context;", "context", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "a", "I", "getResultCode", "()I", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getErrorResourceId", "errorResourceId", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements rk.b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    public static final j f9490d = new j("SUCCESS", 0, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final j f9491e = new j("TRANSACTION_ALREADY_CREATED_DIFFERENT_ACCOUNT", 1, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final j f9492f = new j("TRANSACTION_ALREADY_CREATED_SAME_ACCOUNT", 2, 2);

    /* renamed from: g, reason: collision with root package name */
    public static final j f9493g = new j("TIME_LESS_THAN_24_HOURS", 3, 3);

    /* renamed from: h, reason: collision with root package name */
    public static final j f9494h = new j("MONTHLY_SUBMISSION_LIMIT_EXCEEDED", 4, 4);

    /* renamed from: i, reason: collision with root package name */
    public static final j f9495i = new j("SPENDING_AMOUNT_EXCEEDED", 5, 5);

    /* renamed from: j, reason: collision with root package name */
    public static final j f9496j = new j("NOT_AUTHORIZED_FOR_SUBMISSION", 6, 6);

    /* renamed from: k, reason: collision with root package name */
    public static final j f9497k = new j("TRANSACTION_NOT_FOUND", 7, 7);

    /* renamed from: l, reason: collision with root package name */
    public static final j f9498l = new j("TRANSACTION_OVER_DATE_LIMIT", 8, 8);

    /* renamed from: m, reason: collision with root package name */
    public static final j f9499m = new j("SHOPPER_NOT_FOUND", 9, 9);

    /* renamed from: n, reason: collision with root package name */
    public static final j f9500n = new j("OTHER_ERROR", 10, 99);

    /* renamed from: o, reason: collision with root package name */
    public static final j f9501o = new j("UNKNOWN_ERROR", 11, -1);

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ j[] f9502p;

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f9503q;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int resultCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String message;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LEp/j$a;", "", "<init>", "()V", "", "value", "LEp/j;", "a", "(I)LEp/j;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ep.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final j a(int value) {
            j next;
            Iterator<j> it = j.b().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.getResultCode() == value) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            j jVar = next;
            if (jVar == null) {
                return j.f9501o;
            }
            return jVar;
        }
    }

    public static EnumEntries<j> b() {
        return f9503q;
    }

    @Override // rk.b
    public int getErrorResourceId() {
        return 0;
    }

    static {
        j[] jVarArrA = a();
        f9502p = jVarArrA;
        f9503q = EnumEntriesKt.a(jVarArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ j[] a() {
        return new j[]{f9490d, f9491e, f9492f, f9493g, f9494h, f9495i, f9496j, f9497k, f9498l, f9499m, f9500n, f9501o};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f9502p.clone();
    }

    public final j e(String message) {
        this.message = message;
        return this;
    }

    @Override // rk.b
    public String getErrorString(Context context) throws Resources.NotFoundException {
        String str;
        Intrinsics.j(context, "context");
        if (getResultCode() != -1 || (str = this.message) == null || StringsKt.r0(str)) {
            String str2 = this.message;
            return str2 == null ? "" : str2;
        }
        String string = context.getResources().getString(Ap.a.f1450a);
        Intrinsics.g(string);
        return string;
    }

    @Override // rk.b
    public int getResultCode() {
        return this.resultCode;
    }

    private j(String str, int i10, int i11) {
        this.resultCode = i11;
    }
}
