package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.CharDirectionality;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lkotlin/text/CharDirectionality;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "getValue", "()I", "b", "Companion", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CharDirectionality {

    /* renamed from: c, reason: collision with root package name */
    private static final Lazy<Map<Integer, CharDirectionality>> f147365c;

    /* renamed from: d, reason: collision with root package name */
    public static final CharDirectionality f147366d = new CharDirectionality("UNDEFINED", 0, -1);

    /* renamed from: e, reason: collision with root package name */
    public static final CharDirectionality f147367e = new CharDirectionality("LEFT_TO_RIGHT", 1, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final CharDirectionality f147368f = new CharDirectionality("RIGHT_TO_LEFT", 2, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final CharDirectionality f147369g = new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final CharDirectionality f147370h = new CharDirectionality("EUROPEAN_NUMBER", 4, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final CharDirectionality f147371i = new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);

    /* renamed from: j, reason: collision with root package name */
    public static final CharDirectionality f147372j = new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);

    /* renamed from: k, reason: collision with root package name */
    public static final CharDirectionality f147373k = new CharDirectionality("ARABIC_NUMBER", 7, 6);

    /* renamed from: l, reason: collision with root package name */
    public static final CharDirectionality f147374l = new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);

    /* renamed from: m, reason: collision with root package name */
    public static final CharDirectionality f147375m = new CharDirectionality("NONSPACING_MARK", 9, 8);

    /* renamed from: n, reason: collision with root package name */
    public static final CharDirectionality f147376n = new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);

    /* renamed from: o, reason: collision with root package name */
    public static final CharDirectionality f147377o = new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);

    /* renamed from: p, reason: collision with root package name */
    public static final CharDirectionality f147378p = new CharDirectionality("SEGMENT_SEPARATOR", 12, 11);

    /* renamed from: q, reason: collision with root package name */
    public static final CharDirectionality f147379q = new CharDirectionality("WHITESPACE", 13, 12);

    /* renamed from: r, reason: collision with root package name */
    public static final CharDirectionality f147380r = new CharDirectionality("OTHER_NEUTRALS", 14, 13);

    /* renamed from: s, reason: collision with root package name */
    public static final CharDirectionality f147381s = new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);

    /* renamed from: t, reason: collision with root package name */
    public static final CharDirectionality f147382t = new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);

    /* renamed from: u, reason: collision with root package name */
    public static final CharDirectionality f147383u = new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);

    /* renamed from: v, reason: collision with root package name */
    public static final CharDirectionality f147384v = new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);

    /* renamed from: w, reason: collision with root package name */
    public static final CharDirectionality f147385w = new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);

    /* renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ CharDirectionality[] f147386x;

    /* renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f147387y;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    private static final /* synthetic */ CharDirectionality[] b() {
        return new CharDirectionality[]{f147366d, f147367e, f147368f, f147369g, f147370h, f147371i, f147372j, f147373k, f147374l, f147375m, f147376n, f147377o, f147378p, f147379q, f147380r, f147381s, f147382t, f147383u, f147384v, f147385w};
    }

    public static EnumEntries<CharDirectionality> l() {
        return f147387y;
    }

    static {
        CharDirectionality[] charDirectionalityArrB = b();
        f147386x = charDirectionalityArrB;
        f147387y = EnumEntriesKt.a(charDirectionalityArrB);
        INSTANCE = new Companion(null);
        f147365c = LazyKt.b(new Function0() { // from class: ov.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CharDirectionality.e();
            }
        });
    }

    public static CharDirectionality valueOf(String str) {
        return (CharDirectionality) Enum.valueOf(CharDirectionality.class, str);
    }

    public static CharDirectionality[] values() {
        return (CharDirectionality[]) f147386x.clone();
    }

    private CharDirectionality(String str, int i10, int i11) {
        this.value = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map e() {
        EnumEntries<CharDirectionality> enumEntriesL = l();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(enumEntriesL, 10)), 16));
        for (CharDirectionality charDirectionality : enumEntriesL) {
            linkedHashMap.put(Integer.valueOf(charDirectionality.value), charDirectionality);
        }
        return linkedHashMap;
    }
}
