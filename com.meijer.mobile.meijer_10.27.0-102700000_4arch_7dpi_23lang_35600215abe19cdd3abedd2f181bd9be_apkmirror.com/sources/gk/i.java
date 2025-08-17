package gk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lgk/i;", "", "", "selectedType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f133766b = new i("RTS", 0, "RTS");

    /* renamed from: c, reason: collision with root package name */
    public static final i f133767c = new i("EBTSnap", 1, "EBTSnap");

    /* renamed from: d, reason: collision with root package name */
    public static final i f133768d = new i("RTS_EBT", 2, "RTS_EBT");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ i[] f133769e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f133770f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String selectedType;

    static {
        i[] iVarArrA = a();
        f133769e = iVarArrA;
        f133770f = EnumEntriesKt.a(iVarArrA);
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f133766b, f133767c, f133768d};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f133769e.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getSelectedType() {
        return this.selectedType;
    }

    private i(String str, int i10, String str2) {
        this.selectedType = str2;
    }
}
