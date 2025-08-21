package kotlin.io.path;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/path/OnErrorResult;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalPathApi
/* loaded from: classes12.dex */
public final class OnErrorResult {

    /* renamed from: a, reason: collision with root package name */
    public static final OnErrorResult f143673a = new OnErrorResult("SKIP_SUBTREE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final OnErrorResult f143674b = new OnErrorResult("TERMINATE", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ OnErrorResult[] f143675c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143676d;

    private static final /* synthetic */ OnErrorResult[] a() {
        return new OnErrorResult[]{f143673a, f143674b};
    }

    static {
        OnErrorResult[] onErrorResultArrA = a();
        f143675c = onErrorResultArrA;
        f143676d = EnumEntriesKt.a(onErrorResultArrA);
    }

    public static OnErrorResult valueOf(String str) {
        return (OnErrorResult) Enum.valueOf(OnErrorResult.class, str);
    }

    public static OnErrorResult[] values() {
        return (OnErrorResult[]) f143675c.clone();
    }

    private OnErrorResult(String str, int i10) {
    }
}
