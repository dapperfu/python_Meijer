package Rh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LRh/w0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f33177a = new w0("EMAIL_WITH_HIDDEN_PASSWORD_FIELDS_UI", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f33178b = new w0("EMAIL_AND_PASSWORD_FIELDS_UI", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f33179c = new w0("FORGOT_PASSWORD_UI", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final w0 f33180d = new w0("FORGOT_PASSWORD_EMAIL_SENT_UI", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final w0 f33181e = new w0("RESEND_EMAIL_FAILED", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ w0[] f33182f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f33183g;

    static {
        w0[] w0VarArrA = a();
        f33182f = w0VarArrA;
        f33183g = EnumEntriesKt.a(w0VarArrA);
    }

    private static final /* synthetic */ w0[] a() {
        return new w0[]{f33177a, f33178b, f33179c, f33180d, f33181e};
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) f33182f.clone();
    }

    private w0(String str, int i10) {
    }
}
