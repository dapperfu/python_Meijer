package androidx.compose.foundation.text;

import android.R;
import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import p1.C16338g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/M;", "", "", "stringId", "<init>", "(Ljava/lang/String;II)V", "", "b", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "a", "I", "c", "d", "e", "f", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M {

    /* renamed from: b, reason: collision with root package name */
    public static final M f49455b = new M("Cut", 0, R.string.cut);

    /* renamed from: c, reason: collision with root package name */
    public static final M f49456c = new M("Copy", 1, R.string.copy);

    /* renamed from: d, reason: collision with root package name */
    public static final M f49457d = new M("Paste", 2, R.string.paste);

    /* renamed from: e, reason: collision with root package name */
    public static final M f49458e = new M("SelectAll", 3, R.string.selectAll);

    /* renamed from: f, reason: collision with root package name */
    public static final M f49459f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ M[] f49460g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f49461h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int stringId;

    private static final /* synthetic */ M[] a() {
        return new M[]{f49455b, f49456c, f49457d, f49458e, f49459f};
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f49460g.clone();
    }

    static {
        f49459f = new M("Autofill", 4, Build.VERSION.SDK_INT <= 26 ? d0.S.f127692a : R.string.autofill);
        M[] mArrA = a();
        f49460g = mArrA;
        f49461h = EnumEntriesKt.a(mArrA);
    }

    private M(String str, int i10, int i11) {
        this.stringId = i11;
    }

    public final String b(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-309609081, i10, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:131)");
        }
        String strC = C16338g.c(this.stringId, composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return strC;
    }
}
