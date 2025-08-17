package kotlin.io.path;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/io/path/CopyActionResult;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalPathApi
/* loaded from: classes6.dex */
public final class CopyActionResult {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyActionResult f142756a = new CopyActionResult("CONTINUE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final CopyActionResult f142757b = new CopyActionResult("SKIP_SUBTREE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final CopyActionResult f142758c = new CopyActionResult("TERMINATE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ CopyActionResult[] f142759d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f142760e;

    private static final /* synthetic */ CopyActionResult[] a() {
        return new CopyActionResult[]{f142756a, f142757b, f142758c};
    }

    static {
        CopyActionResult[] copyActionResultArrA = a();
        f142759d = copyActionResultArrA;
        f142760e = EnumEntriesKt.a(copyActionResultArrA);
    }

    public static CopyActionResult valueOf(String str) {
        return (CopyActionResult) Enum.valueOf(CopyActionResult.class, str);
    }

    public static CopyActionResult[] values() {
        return (CopyActionResult[]) f142759d.clone();
    }

    private CopyActionResult(String str, int i10) {
    }
}
