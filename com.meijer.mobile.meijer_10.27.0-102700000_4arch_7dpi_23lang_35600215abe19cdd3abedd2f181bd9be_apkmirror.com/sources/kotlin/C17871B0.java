package kotlin;

import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.r;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "d", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/F0;", "", "a", "Landroidx/compose/runtime/F0;", "b", "()Landroidx/compose/runtime/F0;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "LocalMinimumInteractiveComponentEnforcement", "c", "getLocalMinimumTouchTargetEnforcement$annotations", "LocalMinimumTouchTargetEnforcement", "LH1/k;", "J", "minimumInteractiveComponentSize", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.B0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17871B0 {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<Boolean> f166727a;

    /* renamed from: b, reason: collision with root package name */
    private static final F0<Boolean> f166728b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f166729c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.B0$a */
    static final class a extends Lambda implements Function0<Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f166730f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static {
        F0<Boolean> f0F = r.f(a.f166730f);
        f166727a = f0F;
        f166728b = f0F;
        float f10 = 48;
        f166729c = H1.i.b(H1.h.p(f10), H1.h.p(f10));
    }

    public static final F0<Boolean> b() {
        return f166727a;
    }

    public static final F0<Boolean> c() {
        return f166728b;
    }

    public static final Modifier d(Modifier modifier) {
        return modifier.then(MinimumInteractiveModifier.f49813b);
    }
}
