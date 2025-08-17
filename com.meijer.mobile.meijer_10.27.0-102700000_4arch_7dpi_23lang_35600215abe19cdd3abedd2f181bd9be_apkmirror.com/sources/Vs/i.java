package Vs;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\u0005j\u0002\b\b¨\u0006\t"}, d2 = {"LVs/i;", "", "<init>", "(Ljava/lang/String;I)V", "LVs/t;", "b", "()LVs/t;", "a", "c", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f37901a = new i("ACCESS_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final i f37902b = new i("REFRESH_TOKEN", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final i f37903c = new i("DEVICE_SECRET", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ i[] f37904d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37905e;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.f37901a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.f37902b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.f37903c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        i[] iVarArrA = a();
        f37904d = iVarArrA;
        f37905e = EnumEntriesKt.a(iVarArrA);
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f37901a, f37902b, f37903c};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f37904d.clone();
    }

    public final t b() {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return t.f38020b;
        }
        if (i10 == 2) {
            return t.f38019a;
        }
        if (i10 == 3) {
            return t.f38022d;
        }
        throw new NoWhenBranchMatchedException();
    }

    private i(String str, int i10) {
    }
}
