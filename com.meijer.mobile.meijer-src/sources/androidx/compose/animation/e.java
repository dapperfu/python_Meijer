package androidx.compose.animation;

import H1.r;
import androidx.compose.ui.Modifier;
import kotlin.C6453j;
import kotlin.E0;
import kotlin.InterfaceC6419F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a]\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012:\b\u0002\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lc0/F;", "LH1/r;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "initialValue", "targetValue", "", "finishedListener", "a", "(Landroidx/compose/ui/Modifier;Lc0/F;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "J", "c", "()J", "InvalidSize", "", "d", "(J)Z", "isValid", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final long f48030a;

    static {
        long j10 = Integer.MIN_VALUE;
        f48030a = r.c((j10 & 4294967295L) | (j10 << 32));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, InterfaceC6419F interfaceC6419F, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, r.b(E0.d(r.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        return a(modifier, interfaceC6419F, function2);
    }

    public static final long c() {
        return f48030a;
    }

    public static final boolean d(long j10) {
        return !r.e(j10, f48030a);
    }

    public static final Modifier a(Modifier modifier, InterfaceC6419F<r> interfaceC6419F, Function2<? super r, ? super r, Unit> function2) {
        return T0.e.b(modifier).then(new SizeAnimationModifierElement(interfaceC6419F, P0.e.INSTANCE.o(), function2));
    }
}
