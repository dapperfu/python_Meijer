package Jv;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LJv/Z;", "", "", "begin", "end", "<init>", "(Ljava/lang/String;ICC)V", "a", "C", "b", "c", "d", "e", "f", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Z {

    /* renamed from: c, reason: collision with root package name */
    public static final Z f16225c = new Z("OBJ", 0, '{', '}');

    /* renamed from: d, reason: collision with root package name */
    public static final Z f16226d = new Z("LIST", 1, '[', ']');

    /* renamed from: e, reason: collision with root package name */
    public static final Z f16227e = new Z("MAP", 2, '{', '}');

    /* renamed from: f, reason: collision with root package name */
    public static final Z f16228f = new Z("POLY_OBJ", 3, '[', ']');

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ Z[] f16229g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16230h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final char begin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final char end;

    public static EnumEntries<Z> b() {
        return f16230h;
    }

    static {
        Z[] zArrA = a();
        f16229g = zArrA;
        f16230h = EnumEntriesKt.a(zArrA);
    }

    private static final /* synthetic */ Z[] a() {
        return new Z[]{f16225c, f16226d, f16227e, f16228f};
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) f16229g.clone();
    }

    private Z(String str, int i10, char c10, char c11) {
        this.begin = c10;
        this.end = c11;
    }
}
