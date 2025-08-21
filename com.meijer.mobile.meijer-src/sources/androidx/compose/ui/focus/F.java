package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007j\u0002\b\u0006j\u0002\b\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/F;", "", "Landroidx/compose/ui/focus/E;", "<init>", "(Ljava/lang/String;I)V", "", "a", "()Z", "isFocused", "b", "hasFocus", "c", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F implements E {

    /* renamed from: a, reason: collision with root package name */
    public static final F f50800a = new F("Active", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final F f50801b = new F("ActiveParent", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final F f50802c = new F("Captured", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final F f50803d = new F("Inactive", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ F[] f50804e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f50805f;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[F.values().length];
            try {
                iArr[F.f50802c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F.f50800a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F.f50801b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[F.f50803d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ F[] e() {
        return new F[]{f50800a, f50801b, f50802c, f50803d};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f50804e.clone();
    }

    static {
        F[] fArrE = e();
        f50804e = fArrE;
        f50805f = EnumEntriesKt.a(fArrE);
    }

    @Override // androidx.compose.ui.focus.E
    public boolean a() {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.E
    public boolean b() {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private F(String str, int i10) {
    }
}
