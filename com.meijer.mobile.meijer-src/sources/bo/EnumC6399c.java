package bo;

import android.content.Context;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import qk.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lbo/c;", "Lsk/b;", "", "", "resultCode", "errorResourceId", "<init>", "(Ljava/lang/String;III)V", "Landroid/content/Context;", "context", "", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "a", "I", "getResultCode", "()I", "b", "getErrorResourceId", "c", "d", "e", "f", "g", "h", "i", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bo.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC6399c implements sk.b {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6399c f60472d = new EnumC6399c("SUCCESS", 0, 0, f.f158514l);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6399c f60473e = new EnumC6399c("INVALID_ARGUMENTS", 1, 8, Wn.a.f41176c);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC6399c f60474f = new EnumC6399c("CREDIT_CARD_NOT_FOUND", 2, 24, Wn.a.f41175b);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC6399c f60475g = new EnumC6399c("CREDIT_CARD_ALREADY_ENROLLED", 3, 22, Wn.a.f41174a);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC6399c f60476h = new EnumC6399c("OPT_IN_UNKNOWN_ERROR", 4, -2, Wn.a.f41176c);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC6399c f60477i = new EnumC6399c("OPT_OUT_UNKNOWN_ERROR", 5, -4, Wn.a.f41176c);

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC6399c[] f60478j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60479k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int resultCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int errorResourceId;

    static {
        EnumC6399c[] enumC6399cArrA = a();
        f60478j = enumC6399cArrA;
        f60479k = EnumEntriesKt.a(enumC6399cArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ EnumC6399c[] a() {
        return new EnumC6399c[]{f60472d, f60473e, f60474f, f60475g, f60476h, f60477i};
    }

    public static EnumC6399c valueOf(String str) {
        return (EnumC6399c) Enum.valueOf(EnumC6399c.class, str);
    }

    public static EnumC6399c[] values() {
        return (EnumC6399c[]) f60478j.clone();
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

    private EnumC6399c(String str, int i10, int i11, int i12) {
        this.resultCode = i11;
        this.errorResourceId = i12;
    }
}
