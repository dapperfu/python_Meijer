package b5;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.F0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038GX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0004\u0092\u0001\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\f"}, d2 = {"Lb5/s;", "", "Landroidx/compose/runtime/F0;", "LZ4/h;", "delegate", "b", "(Landroidx/compose/runtime/F0;)Landroidx/compose/runtime/F0;", "e", "(Landroidx/compose/runtime/F0;Landroidx/compose/runtime/Composer;I)LZ4/h;", "getCurrent$annotations", "()V", "current", "coil-compose-singleton_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
@JvmInline
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class s {
    public static F0<Z4.h> b(F0<Z4.h> f02) {
        return f02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z4.h d() {
        return null;
    }

    public static /* synthetic */ F0 c(F0 f02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            f02 = androidx.compose.runtime.r.f(new Function0() { // from class: b5.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.d();
                }
            });
        }
        return b(f02);
    }

    @JvmName
    public static final Z4.h e(F0<Z4.h> f02, Composer composer, int i10) {
        Z4.h hVar = (Z4.h) composer.o(f02);
        if (hVar == null) {
            return Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
        }
        return hVar;
    }
}
