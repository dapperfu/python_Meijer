package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/window/r;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f53173a = new r("Inherit", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final r f53174b = new r("SecureOn", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final r f53175c = new r("SecureOff", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ r[] f53176d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f53177e;

    private static final /* synthetic */ r[] a() {
        return new r[]{f53173a, f53174b, f53175c};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f53176d.clone();
    }

    static {
        r[] rVarArrA = a();
        f53176d = rVarArrA;
        f53177e = EnumEntriesKt.a(rVarArrA);
    }

    private r(String str, int i10) {
    }
}
