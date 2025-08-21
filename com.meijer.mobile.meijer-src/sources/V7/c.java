package V7;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LV7/c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f39810b = new c("COLD", 0, "cold");

    /* renamed from: c, reason: collision with root package name */
    public static final c f39811c = new c("WARM", 1, "warm");

    /* renamed from: d, reason: collision with root package name */
    public static final c f39812d = new c("HOT", 2, "hot");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ c[] f39813e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f39814f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    static {
        c[] cVarArrA = a();
        f39813e = cVarArrA;
        f39814f = EnumEntriesKt.a(cVarArrA);
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f39810b, f39811c, f39812d};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f39813e.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    private c(String str, int i10, String str2) {
        this.value = str2;
    }
}
