package rk;

import android.content.Context;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import pk.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lrk/c;", "Lrk/b;", "", "", "errorResourceId", "<init>", "(Ljava/lang/String;II)V", "Landroid/content/Context;", "context", "", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "a", "I", "getErrorResourceId", "()I", "getResultCode", "resultCode", "b", "c", "d", "e", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final c f159047c = new c("NETWORK_ERROR", 0, f.f155801o);

    /* renamed from: d, reason: collision with root package name */
    public static final c f159048d = new c("RECEIPT_SERVICE_UNAVAILABLE", 1, f.f155804r);

    /* renamed from: e, reason: collision with root package name */
    public static final c f159049e = new c("UNKNOWN_ERROR", 2, f.f155801o);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ c[] f159050f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f159051g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int errorResourceId;

    @Override // rk.b
    public int getResultCode() {
        return -1;
    }

    static {
        c[] cVarArrA = a();
        f159050f = cVarArrA;
        f159051g = EnumEntriesKt.a(cVarArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f159047c, f159048d, f159049e};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f159050f.clone();
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

    private c(String str, int i10, int i11) {
        this.errorResourceId = i11;
    }
}
