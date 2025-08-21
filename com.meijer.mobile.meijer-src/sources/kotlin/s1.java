package kotlin;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.C18038r1;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Lx0/r1;", "string", "", "a", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class s1 {
    public static final String a(int i10, Composer composer, int i11) {
        String string;
        if (ComposerKt.M()) {
            ComposerKt.U(-726638443, i11, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        composer.o(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getResources();
        C18038r1.Companion companion = C18038r1.INSTANCE;
        if (C18038r1.j(i10, companion.e())) {
            string = resources.getString(P0.l.f25261i);
        } else if (C18038r1.j(i10, companion.a())) {
            string = resources.getString(P0.l.f25254b);
        } else if (C18038r1.j(i10, companion.b())) {
            string = resources.getString(P0.l.f25255c);
        } else if (C18038r1.j(i10, companion.c())) {
            string = resources.getString(P0.l.f25256d);
        } else if (C18038r1.j(i10, companion.d())) {
            string = resources.getString(P0.l.f25258f);
        } else if (C18038r1.j(i10, companion.g())) {
            string = resources.getString(P0.l.f25264l);
        } else if (C18038r1.j(i10, companion.f())) {
            string = resources.getString(P0.l.f25263k);
        } else if (C18038r1.j(i10, companion.h())) {
            string = resources.getString(C17974U0.f168575a);
        } else {
            string = "";
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return string;
    }
}
