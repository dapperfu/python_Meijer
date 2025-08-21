package vh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import th.C17263a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lvh/e;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "e", "()I", "b", "iconResourceId", "c", "d", "f", "g", "h", "i", "j", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC17677e {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17677e f165881c = new EnumC17677e("MASTER_CARD", 0, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17677e f165882d = new EnumC17677e("VISA", 1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17677e f165883e = new EnumC17677e("AMERICAN_EXPRESS", 2, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC17677e f165884f = new EnumC17677e("MEIJER_MASTER_CARD", 3, 4);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC17677e f165885g = new EnumC17677e("DISCOVER", 4, 5);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC17677e f165886h = new EnumC17677e("ALLIANCE", 5, 6);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC17677e f165887i = new EnumC17677e("MEIJER_CREDIT_CARD", 6, 7);

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC17677e f165888j = new EnumC17677e("UNKNOWN", 7, -1);

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumC17677e[] f165889k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f165890l;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.e$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17677e.values().length];
            try {
                iArr[EnumC17677e.f165881c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17677e.f165882d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17677e.f165883e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC17677e.f165885g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC17677e.f165884f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC17677e.f165887i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC17677e.f165888j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        EnumC17677e[] enumC17677eArrA = a();
        f165889k = enumC17677eArrA;
        f165890l = EnumEntriesKt.a(enumC17677eArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ EnumC17677e[] a() {
        return new EnumC17677e[]{f165881c, f165882d, f165883e, f165884f, f165885g, f165886h, f165887i, f165888j};
    }

    public static EnumC17677e valueOf(String str) {
        return (EnumC17677e) Enum.valueOf(EnumC17677e.class, str);
    }

    public static EnumC17677e[] values() {
        return (EnumC17677e[]) f165889k.clone();
    }

    public final int b() {
        switch (b.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return C17263a.f163068c;
            case 2:
                return C17263a.f163071f;
            case 3:
                return C17263a.f163066a;
            case 4:
                return C17263a.f163067b;
            case 5:
                return C17263a.f163070e;
            case 6:
                return C17263a.f163069d;
            default:
                return 0;
        }
    }

    /* renamed from: e, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    private EnumC17677e(String str, int i10, int i11) {
        this.value = i11;
    }
}
