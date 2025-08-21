package Cn;

import com.meijer.mobile.meijer.Y;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\nj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"LCn/c;", "", "", "resourceID", "", "isWebPunchOut", "<init>", "(Ljava/lang/String;IIZ)V", "a", "I", "e", "()I", "b", "Z", "l", "()Z", "c", "d", "f", "g", "h", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f5239c = new c("FAQ", 0, Y.f100798Z6, true);

    /* renamed from: d, reason: collision with root package name */
    public static final c f5240d = new c("WALKTHROUGH", 1, Y.f100818a7, false);

    /* renamed from: e, reason: collision with root package name */
    public static final c f5241e = new c("TERMS", 2, Y.f100858c7, true);

    /* renamed from: f, reason: collision with root package name */
    public static final c f5242f = new c("PRIVACY", 3, Y.f100838b7, true);

    /* renamed from: g, reason: collision with root package name */
    public static final c f5243g = new c("MEIJER_ACCESSIBILITY_STATEMENT", 4, Y.f100830b, true);

    /* renamed from: h, reason: collision with root package name */
    public static final c f5244h = new c("ADD_RECEIPT", 5, Y.f100760X6, false);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ c[] f5245i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5246j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int resourceID;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isWebPunchOut;

    public static EnumEntries<c> b() {
        return f5246j;
    }

    static {
        c[] cVarArrA = a();
        f5245i = cVarArrA;
        f5246j = EnumEntriesKt.a(cVarArrA);
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f5239c, f5240d, f5241e, f5242f, f5243g, f5244h};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5245i.clone();
    }

    /* renamed from: e, reason: from getter */
    public final int getResourceID() {
        return this.resourceID;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsWebPunchOut() {
        return this.isWebPunchOut;
    }

    private c(String str, int i10, int i11, boolean z10) {
        this.resourceID = i11;
        this.isWebPunchOut = z10;
    }
}
