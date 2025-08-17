package ao;

import android.content.Context;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import pk.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lao/b;", "Lrk/b;", "", "", "resultCode", "errorResourceId", "<init>", "(Ljava/lang/String;III)V", "Landroid/content/Context;", "context", "", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "a", "I", "getResultCode", "()I", "b", "getErrorResourceId", "c", "d", "e", "f", "g", "h", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ao.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC6141b implements rk.b {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6141b f59388c = new EnumC6141b("Success", 0, 0, f.f155798l);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6141b f59389d = new EnumC6141b("UserNotFound", 1, 1, Vn.a.f37675b);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6141b f59390e = new EnumC6141b("AlreadyOptedIn", 2, 2, Vn.a.f37674a);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC6141b f59391f = new EnumC6141b("NewTermsAvailable", 3, 3, Vn.a.f37676c);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC6141b f59392g = new EnumC6141b("OptedOutLessThan48Hours", 4, 4, Vn.a.f37676c);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC6141b f59393h = new EnumC6141b("OtherError", 5, 5, Vn.a.f37676c);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC6141b[] f59394i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f59395j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int resultCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int errorResourceId;

    public static EnumEntries<EnumC6141b> b() {
        return f59395j;
    }

    static {
        EnumC6141b[] enumC6141bArrA = a();
        f59394i = enumC6141bArrA;
        f59395j = EnumEntriesKt.a(enumC6141bArrA);
    }

    private static final /* synthetic */ EnumC6141b[] a() {
        return new EnumC6141b[]{f59388c, f59389d, f59390e, f59391f, f59392g, f59393h};
    }

    public static EnumC6141b valueOf(String str) {
        return (EnumC6141b) Enum.valueOf(EnumC6141b.class, str);
    }

    public static EnumC6141b[] values() {
        return (EnumC6141b[]) f59394i.clone();
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

    @Override // rk.b
    public int getResultCode() {
        return this.resultCode;
    }

    private EnumC6141b(String str, int i10, int i11, int i12) {
        this.resultCode = i11;
        this.errorResourceId = i12;
    }
}
