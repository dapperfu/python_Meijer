package kotlin;

import android.content.Context;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.InterfaceC5881q;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\"&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0002\u0010\u0004\" \u0010\f\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u000b\u0010\u0006\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/F0;", "Lf0/g;", "a", "Landroidx/compose/runtime/F0;", "()Landroidx/compose/runtime/F0;", "getLocalBringIntoViewSpec$annotations", "()V", "LocalBringIntoViewSpec", "b", "Lf0/g;", "()Lf0/g;", "getPivotBringIntoViewSpec$annotations", "PivotBringIntoViewSpec", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13919h {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<InterfaceC13918g> f131195a = r.e(a.f131197f);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC13918g f131196b = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/q;", "Lf0/g;", "a", "(Landroidx/compose/runtime/q;)Lf0/g;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.h$a */
    static final class a extends Lambda implements Function1<InterfaceC5881q, InterfaceC13918g> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f131197f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13918g invoke(InterfaceC5881q interfaceC5881q) {
            if (!((Context) interfaceC5881q.e(AndroidCompositionLocals_androidKt.g())).getPackageManager().hasSystemFeature("android.software.leanback")) {
                return InterfaceC13918g.INSTANCE.b();
            }
            return C13919h.b();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, d2 = {"f0/h$b", "Lf0/g;", "", "offset", "size", "containerSize", "a", "(FFF)F", "b", "F", "getParentFraction", "()F", "parentFraction", "c", "getChildFraction", "childFraction", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.h$b */
    public static final class b implements InterfaceC13918g {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float parentFraction = 0.3f;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float childFraction;

        @Override // kotlin.InterfaceC13918g
        public float a(float offset, float size, float containerSize) {
            float fAbs = Math.abs((size + offset) - offset);
            boolean z10 = fAbs <= containerSize;
            float f10 = (this.parentFraction * containerSize) - (this.childFraction * fAbs);
            float f11 = containerSize - f10;
            if (z10 && f11 < fAbs) {
                f10 = containerSize - fAbs;
            }
            return offset - f10;
        }

        b() {
        }
    }

    public static final F0<InterfaceC13918g> a() {
        return f131195a;
    }

    public static final InterfaceC13918g b() {
        return f131196b;
    }
}
