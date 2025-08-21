package V7;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"LV7/d;", "", "", "keyValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f39816b = new d("FOREGROUND", 0, "foreground");

    /* renamed from: c, reason: collision with root package name */
    public static final d f39817c = new d("BACKGROUND", 1, "background");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d[] f39818d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f39819e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String keyValue;

    static {
        d[] dVarArrA = a();
        f39818d = dVarArrA;
        f39819e = EnumEntriesKt.a(dVarArrA);
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f39816b, f39817c};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f39818d.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getKeyValue() {
        return this.keyValue;
    }

    private d(String str, int i10, String str2) {
        this.keyValue = str2;
    }
}
