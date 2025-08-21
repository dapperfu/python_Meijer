package hu;

import com.squareup.wire.ProtoAdapter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u0007j\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lhu/d;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Lcom/squareup/wire/ProtoAdapter;", "e", "()Lcom/squareup/wire/ProtoAdapter;", "a", "I", "b", "()I", "c", "d", "f", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f136158c = new d("VARINT", 0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final d f136159d = new d("FIXED64", 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final d f136160e = new d("LENGTH_DELIMITED", 2, 2);

    /* renamed from: f, reason: collision with root package name */
    public static final d f136161f = new d("FIXED32", 3, 5);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ d[] f136162g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f136163h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f136158c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f136161f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f136159d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f136160e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        d[] dVarArrA = a();
        f136162g = dVarArrA;
        f136163h = EnumEntriesKt.a(dVarArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f136158c, f136159d, f136160e, f136161f};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f136162g.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final ProtoAdapter<?> e() {
        int i10 = b.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return ProtoAdapter.f127462w;
        }
        if (i10 == 2) {
            return ProtoAdapter.f127456q;
        }
        if (i10 == 3) {
            return ProtoAdapter.f127422A;
        }
        if (i10 == 4) {
            return ProtoAdapter.f127430I;
        }
        throw new NoWhenBranchMatchedException();
    }

    private d(String str, int i10, int i11) {
        this.value = i11;
    }
}
