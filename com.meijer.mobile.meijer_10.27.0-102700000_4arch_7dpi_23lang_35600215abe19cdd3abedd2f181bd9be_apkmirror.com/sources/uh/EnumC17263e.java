package uh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import sh.C16975a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Luh/e;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "e", "()I", "b", "iconResourceId", "c", "d", "f", "g", "h", "i", "j", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uh.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC17263e {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17263e f162980c = new EnumC17263e("MASTER_CARD", 0, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17263e f162981d = new EnumC17263e("VISA", 1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17263e f162982e = new EnumC17263e("AMERICAN_EXPRESS", 2, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC17263e f162983f = new EnumC17263e("MEIJER_MASTER_CARD", 3, 4);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC17263e f162984g = new EnumC17263e("DISCOVER", 4, 5);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC17263e f162985h = new EnumC17263e("ALLIANCE", 5, 6);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC17263e f162986i = new EnumC17263e("MEIJER_CREDIT_CARD", 6, 7);

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC17263e f162987j = new EnumC17263e("UNKNOWN", 7, -1);

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumC17263e[] f162988k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f162989l;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uh.e$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17263e.values().length];
            try {
                iArr[EnumC17263e.f162980c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17263e.f162981d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17263e.f162982e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC17263e.f162984g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC17263e.f162983f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC17263e.f162986i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC17263e.f162987j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        EnumC17263e[] enumC17263eArrA = a();
        f162988k = enumC17263eArrA;
        f162989l = EnumEntriesKt.a(enumC17263eArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ EnumC17263e[] a() {
        return new EnumC17263e[]{f162980c, f162981d, f162982e, f162983f, f162984g, f162985h, f162986i, f162987j};
    }

    public static EnumC17263e valueOf(String str) {
        return (EnumC17263e) Enum.valueOf(EnumC17263e.class, str);
    }

    public static EnumC17263e[] values() {
        return (EnumC17263e[]) f162988k.clone();
    }

    public final int b() {
        switch (b.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return C16975a.f160529c;
            case 2:
                return C16975a.f160532f;
            case 3:
                return C16975a.f160527a;
            case 4:
                return C16975a.f160528b;
            case 5:
                return C16975a.f160531e;
            case 6:
                return C16975a.f160530d;
            default:
                return 0;
        }
    }

    /* renamed from: e, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    private EnumC17263e(String str, int i10, int i11) {
        this.value = i11;
    }
}
