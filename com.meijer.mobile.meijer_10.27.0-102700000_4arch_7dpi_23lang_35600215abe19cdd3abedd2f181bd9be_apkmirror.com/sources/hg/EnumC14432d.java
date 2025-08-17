package hg;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\t¨\u0006\u0010"}, d2 = {"Lhg/d;", "LDf/f;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "a", "I", "g", "()I", "b", "c", "d", "e", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: hg.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC14432d implements Df.f {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC14432d f134893b = new EnumC14432d("COLLECTION_UNKNOWN", 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC14432d f134894c = new EnumC14432d("COLLECTION_SDK_NOT_INSTALLED", 1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC14432d f134895d = new EnumC14432d("COLLECTION_ENABLED", 2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC14432d f134896e = new EnumC14432d("COLLECTION_DISABLED", 3, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC14432d f134897f = new EnumC14432d("COLLECTION_DISABLED_REMOTE", 4, 4);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC14432d f134898g = new EnumC14432d("COLLECTION_SAMPLED", 5, 5);

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumC14432d[] f134899h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f134900i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int number;

    static {
        EnumC14432d[] enumC14432dArrA = a();
        f134899h = enumC14432dArrA;
        f134900i = EnumEntriesKt.a(enumC14432dArrA);
    }

    private static final /* synthetic */ EnumC14432d[] a() {
        return new EnumC14432d[]{f134893b, f134894c, f134895d, f134896e, f134897f, f134898g};
    }

    public static EnumC14432d valueOf(String str) {
        return (EnumC14432d) Enum.valueOf(EnumC14432d.class, str);
    }

    public static EnumC14432d[] values() {
        return (EnumC14432d[]) f134899h.clone();
    }

    @Override // Df.f
    /* renamed from: g, reason: from getter */
    public int getNumber() {
        return this.number;
    }

    private EnumC14432d(String str, int i10, int i11) {
        this.number = i11;
    }
}
