package Dh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LDh/s;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f6575b = new s("EMAIL", 0, "Email");

    /* renamed from: c, reason: collision with root package name */
    public static final s f6576c = new s("SMS", 1, "SMS");

    /* renamed from: d, reason: collision with root package name */
    public static final s f6577d = new s("TRUE", 2, "True");

    /* renamed from: e, reason: collision with root package name */
    public static final s f6578e = new s("FALSE", 3, "False");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ s[] f6579f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6580g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    static {
        s[] sVarArrA = a();
        f6579f = sVarArrA;
        f6580g = EnumEntriesKt.a(sVarArrA);
    }

    private static final /* synthetic */ s[] a() {
        return new s[]{f6575b, f6576c, f6577d, f6578e};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f6579f.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    private s(String str, int i10, String str2) {
        this.value = str2;
    }
}
