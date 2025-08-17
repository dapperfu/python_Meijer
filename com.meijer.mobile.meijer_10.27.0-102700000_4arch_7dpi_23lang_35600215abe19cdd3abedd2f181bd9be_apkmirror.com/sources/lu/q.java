package lu;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Llu/q;", "", "", "string", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", "d", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f149439c = new q("PROTO_2", 0, "proto2");

    /* renamed from: d, reason: collision with root package name */
    public static final q f149440d = new q("PROTO_3", 1, "proto3");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ q[] f149441e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f149442f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String string;

    static {
        q[] qVarArrA = a();
        f149441e = qVarArrA;
        f149442f = EnumEntriesKt.a(qVarArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ q[] a() {
        return new q[]{f149439c, f149440d};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f149441e.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.string;
    }

    private q(String str, int i10, String str2) {
        this.string = str2;
    }
}
