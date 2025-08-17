package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\b\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/text/RegexOption;", "Lkotlin/text/c;", "", "", "value", "mask", "<init>", "(Ljava/lang/String;III)V", "a", "I", "getValue", "()I", "b", "c", "d", "e", "f", "g", "h", "i", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RegexOption implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final RegexOption f147463c = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);

    /* renamed from: d, reason: collision with root package name */
    public static final RegexOption f147464d = new RegexOption("MULTILINE", 1, 8, 0, 2, null);

    /* renamed from: e, reason: collision with root package name */
    public static final RegexOption f147465e = new RegexOption("LITERAL", 2, 16, 0, 2, null);

    /* renamed from: f, reason: collision with root package name */
    public static final RegexOption f147466f = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);

    /* renamed from: g, reason: collision with root package name */
    public static final RegexOption f147467g = new RegexOption("COMMENTS", 4, 4, 0, 2, null);

    /* renamed from: h, reason: collision with root package name */
    public static final RegexOption f147468h = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);

    /* renamed from: i, reason: collision with root package name */
    public static final RegexOption f147469i = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ RegexOption[] f147470j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f147471k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    private RegexOption(String str, int i10, int i11, int i12) {
        this.value = i11;
        this.mask = i12;
    }

    private static final /* synthetic */ RegexOption[] b() {
        return new RegexOption[]{f147463c, f147464d, f147465e, f147466f, f147467g, f147468h, f147469i};
    }

    static {
        RegexOption[] regexOptionArrB = b();
        f147470j = regexOptionArrB;
        f147471k = EnumEntriesKt.a(regexOptionArrB);
    }

    /* synthetic */ RegexOption(String str, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) f147470j.clone();
    }

    @Override // kotlin.text.c
    /* renamed from: a, reason: from getter */
    public int getMask() {
        return this.mask;
    }

    @Override // kotlin.text.c
    public int getValue() {
        return this.value;
    }
}
