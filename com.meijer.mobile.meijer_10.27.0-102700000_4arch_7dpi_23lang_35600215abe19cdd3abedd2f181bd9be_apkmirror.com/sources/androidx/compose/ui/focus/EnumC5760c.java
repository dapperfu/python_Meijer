package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/focus/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.focus.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5760c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5760c f50641a = new EnumC5760c("None", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5760c f50642b = new EnumC5760c("Cancelled", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC5760c f50643c = new EnumC5760c("Redirected", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC5760c f50644d = new EnumC5760c("RedirectCancelled", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC5760c[] f50645e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f50646f;

    private static final /* synthetic */ EnumC5760c[] a() {
        return new EnumC5760c[]{f50641a, f50642b, f50643c, f50644d};
    }

    public static EnumC5760c valueOf(String str) {
        return (EnumC5760c) Enum.valueOf(EnumC5760c.class, str);
    }

    public static EnumC5760c[] values() {
        return (EnumC5760c[]) f50645e.clone();
    }

    static {
        EnumC5760c[] enumC5760cArrA = a();
        f50645e = enumC5760cArrA;
        f50646f = EnumEntriesKt.a(enumC5760cArrA);
    }

    private EnumC5760c(String str, int i10) {
    }
}
