package p1;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import io.constructor.data.local.PreferencesHelper;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", PreferencesHelper.PREF_ID, "", "c", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "", "", "formatArgs", "d", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "b", "(ILandroidx/compose/runtime/Composer;I)[Ljava/lang/String;", "count", "a", "(II[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: p1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16193g {
    public static final String a(int i10, int i11, Object[] objArr, Composer composer, int i12) throws Resources.NotFoundException {
        if (ComposerKt.M()) {
            ComposerKt.U(523207213, i12, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = C16192f.a(composer, 0).getQuantityString(i10, i11, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return quantityString;
    }

    public static final String[] b(int i10, Composer composer, int i11) throws Resources.NotFoundException {
        if (ComposerKt.M()) {
            ComposerKt.U(1562162650, i11, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] stringArray = C16192f.a(composer, 0).getStringArray(i10);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return stringArray;
    }

    public static final String c(int i10, Composer composer, int i11) {
        if (ComposerKt.M()) {
            ComposerKt.U(1223887937, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = C16192f.a(composer, 0).getString(i10);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return string;
    }

    public static final String d(int i10, Object[] objArr, Composer composer, int i11) throws Resources.NotFoundException {
        if (ComposerKt.M()) {
            ComposerKt.U(2071230100, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = C16192f.a(composer, 0).getString(i10, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return string;
    }
}
