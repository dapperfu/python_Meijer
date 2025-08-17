package kotlin.io;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/OnErrorAction;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnErrorAction {

    /* renamed from: a, reason: collision with root package name */
    public static final OnErrorAction f142735a = new OnErrorAction("SKIP", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final OnErrorAction f142736b = new OnErrorAction("TERMINATE", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ OnErrorAction[] f142737c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f142738d;

    private static final /* synthetic */ OnErrorAction[] a() {
        return new OnErrorAction[]{f142735a, f142736b};
    }

    static {
        OnErrorAction[] onErrorActionArrA = a();
        f142737c = onErrorActionArrA;
        f142738d = EnumEntriesKt.a(onErrorActionArrA);
    }

    public static OnErrorAction valueOf(String str) {
        return (OnErrorAction) Enum.valueOf(OnErrorAction.class, str);
    }

    public static OnErrorAction[] values() {
        return (OnErrorAction[]) f142737c.clone();
    }

    private OnErrorAction(String str, int i10) {
    }
}
