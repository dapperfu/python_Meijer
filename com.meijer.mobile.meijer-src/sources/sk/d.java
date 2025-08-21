package sk;

import android.content.Context;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import qk.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lsk/d;", "Lsk/b;", "", "", "errorResourceId", "<init>", "(Ljava/lang/String;II)V", "Landroid/content/Context;", "context", "", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "a", "I", "getErrorResourceId", "()I", "getResultCode", "resultCode", "b", "c", "d", "e", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final d f160829b = new d("WEEKLY_AD_LOADING_PUBLICATIONS_ERROR", 0, f.f158502B);

    /* renamed from: c, reason: collision with root package name */
    public static final d f160830c = new d("WEEKLY_AD_LOADING_PRINT_ERROR", 1, f.f158501A);

    /* renamed from: d, reason: collision with root package name */
    public static final d f160831d = new d("WEEKLY_AD_LOADING_DETAIL_ERROR", 2, f.f158528z);

    /* renamed from: e, reason: collision with root package name */
    public static final d f160832e = new d("WEEKLY_AD_ERROR_LOADING_COUPONS", 3, f.f158527y);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ d[] f160833f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f160834g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int errorResourceId;

    @Override // sk.b
    public int getResultCode() {
        return -1;
    }

    static {
        d[] dVarArrA = a();
        f160833f = dVarArrA;
        f160834g = EnumEntriesKt.a(dVarArrA);
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f160829b, f160830c, f160831d, f160832e};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f160833f.clone();
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

    private d(String str, int i10, int i11) {
        this.errorResourceId = i11;
    }
}
