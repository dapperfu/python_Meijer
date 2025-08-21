package Pp;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\u0005j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LPp/c;", "", "<init>", "(Ljava/lang/String;I)V", "LPp/b;", "b", "()LPp/b;", "a", "c", "d", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f26245a = new c("Proactive", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f26246b = new c("Reactive", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final c f26247c = new c("OutOfStockFindSimilar", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final c f26248d = new c("ProactiveLowStock", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ c[] f26249e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26250f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f26245a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f26246b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f26248d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.f26247c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        c[] cVarArrA = a();
        f26249e = cVarArrA;
        f26250f = EnumEntriesKt.a(cVarArrA);
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f26245a, f26246b, f26247c, f26248d};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f26249e.clone();
    }

    public final b b() {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return b.f26240c;
        }
        if (i10 == 2) {
            return b.f26241d;
        }
        if (i10 == 3) {
            return b.f26240c;
        }
        if (i10 == 4) {
            return b.f26242e;
        }
        throw new NoWhenBranchMatchedException();
    }

    private c(String str, int i10) {
    }
}
