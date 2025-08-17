package m1;

import P0.l;
import android.R;
import android.os.Build;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\n\u0010\tR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\nj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lm1/b;", "", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "e", "order", "l", "titleResource", "c", "d", "f", "g", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC15542b {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC15542b f149743c = new EnumC15542b("Copy", 0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC15542b f149744d = new EnumC15542b("Paste", 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC15542b f149745e = new EnumC15542b("Cut", 2, 2);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC15542b f149746f = new EnumC15542b("SelectAll", 3, 3);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC15542b f149747g = new EnumC15542b("Autofill", 4, 4);

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumC15542b[] f149748h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f149749i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int order;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m1.b$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC15542b.values().length];
            try {
                iArr[EnumC15542b.f149743c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15542b.f149744d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC15542b.f149745e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC15542b.f149746f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC15542b.f149747g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        EnumC15542b[] enumC15542bArrA = a();
        f149748h = enumC15542bArrA;
        f149749i = EnumEntriesKt.a(enumC15542bArrA);
    }

    private static final /* synthetic */ EnumC15542b[] a() {
        return new EnumC15542b[]{f149743c, f149744d, f149745e, f149746f, f149747g};
    }

    public static EnumC15542b valueOf(String str) {
        return (EnumC15542b) Enum.valueOf(EnumC15542b.class, str);
    }

    public static EnumC15542b[] values() {
        return (EnumC15542b[]) f149748h.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    public final int l() {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return R.string.copy;
        }
        if (i10 == 2) {
            return R.string.paste;
        }
        if (i10 == 3) {
            return R.string.cut;
        }
        if (i10 == 4) {
            return R.string.selectAll;
        }
        if (i10 == 5) {
            return Build.VERSION.SDK_INT <= 26 ? l.f24555a : R.string.autofill;
        }
        throw new NoWhenBranchMatchedException();
    }

    private EnumC15542b(String str, int i10, int i11) {
        this.id = i11;
        this.order = i11;
    }
}
