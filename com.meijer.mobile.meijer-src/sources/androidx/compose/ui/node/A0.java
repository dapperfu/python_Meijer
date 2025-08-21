package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/A0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public static final A0 f51384a = new A0("ContinueTraversal", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final A0 f51385b = new A0("SkipSubtreeAndContinueTraversal", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final A0 f51386c = new A0("CancelTraversal", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ A0[] f51387d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f51388e;

    private static final /* synthetic */ A0[] a() {
        return new A0[]{f51384a, f51385b, f51386c};
    }

    public static A0 valueOf(String str) {
        return (A0) Enum.valueOf(A0.class, str);
    }

    public static A0[] values() {
        return (A0[]) f51387d.clone();
    }

    static {
        A0[] a0ArrA = a();
        f51387d = a0ArrA;
        f51388e = EnumEntriesKt.a(a0ArrA);
    }

    private A0(String str, int i10) {
    }
}
