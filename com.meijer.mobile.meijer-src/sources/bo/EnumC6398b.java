package bo;

import android.content.Context;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import qk.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lbo/b;", "Lsk/b;", "", "", "resultCode", "errorResourceId", "<init>", "(Ljava/lang/String;III)V", "Landroid/content/Context;", "context", "", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "a", "I", "getResultCode", "()I", "b", "getErrorResourceId", "c", "d", "e", "f", "g", "h", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bo.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC6398b implements sk.b {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6398b f60461c = new EnumC6398b("Success", 0, 0, f.f158514l);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6398b f60462d = new EnumC6398b("UserNotFound", 1, 1, Wn.a.f41175b);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6398b f60463e = new EnumC6398b("AlreadyOptedIn", 2, 2, Wn.a.f41174a);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC6398b f60464f = new EnumC6398b("NewTermsAvailable", 3, 3, Wn.a.f41176c);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC6398b f60465g = new EnumC6398b("OptedOutLessThan48Hours", 4, 4, Wn.a.f41176c);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC6398b f60466h = new EnumC6398b("OtherError", 5, 5, Wn.a.f41176c);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC6398b[] f60467i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60468j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int resultCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int errorResourceId;

    public static EnumEntries<EnumC6398b> b() {
        return f60468j;
    }

    static {
        EnumC6398b[] enumC6398bArrA = a();
        f60467i = enumC6398bArrA;
        f60468j = EnumEntriesKt.a(enumC6398bArrA);
    }

    private static final /* synthetic */ EnumC6398b[] a() {
        return new EnumC6398b[]{f60461c, f60462d, f60463e, f60464f, f60465g, f60466h};
    }

    public static EnumC6398b valueOf(String str) {
        return (EnumC6398b) Enum.valueOf(EnumC6398b.class, str);
    }

    public static EnumC6398b[] values() {
        return (EnumC6398b[]) f60467i.clone();
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

    @Override // sk.b
    public int getResultCode() {
        return this.resultCode;
    }

    private EnumC6398b(String str, int i10, int i11, int i12) {
        this.resultCode = i11;
        this.errorResourceId = i12;
    }
}
