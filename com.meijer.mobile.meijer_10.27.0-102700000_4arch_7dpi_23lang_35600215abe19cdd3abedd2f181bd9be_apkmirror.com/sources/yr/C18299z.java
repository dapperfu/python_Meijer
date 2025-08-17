package yr;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.F1;
import com.fullstory.compose.FullStoryAnnotationsKt;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16705m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "", PreferencesHelper.PREF_ID, "packageName", "e", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "", "enabled", "b", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yr.z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18299z {
    public static /* synthetic */ Modifier c(Modifier modifier, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return b(modifier, z10);
    }

    public static final Modifier b(Modifier modifier, final boolean z10) {
        Intrinsics.j(modifier, "<this>");
        return C16705m.d(modifier, false, new Function1() { // from class: yr.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C18299z.d(z10, (r1.u) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(boolean z10, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.t.a(semantics, z10);
        return Unit.f142422a;
    }

    public static final Modifier e(Modifier modifier, String id2, String str) {
        Intrinsics.j(modifier, "<this>");
        Intrinsics.j(id2, "id");
        Modifier modifierFsId = FullStoryAnnotationsKt.fsId(modifier, id2);
        if (str != null) {
            String str2 = str + ":id/" + id2;
            if (str2 != null) {
                id2 = str2;
            }
        }
        return F1.a(modifierFsId, id2);
    }

    public static /* synthetic */ Modifier f(Modifier modifier, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return e(modifier, str, str2);
    }
}
