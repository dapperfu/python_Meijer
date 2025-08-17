package kotlin;

import V0.C5346q0;
import V0.C5349s0;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\b\"\u001a\u0010\u000e\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/F0;", "Lw0/V;", "a", "Landroidx/compose/runtime/F0;", "b", "()Landroidx/compose/runtime/F0;", "LocalTextSelectionColors", "LV0/q0;", "J", "DefaultSelectionColor", "c", "Lw0/V;", "getDefaultTextSelectionColors$annotations", "()V", "DefaultTextSelectionColors", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17713W {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<SelectionColors> f165455a = r.d(null, a.f165458f, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f165456b;

    /* renamed from: c, reason: collision with root package name */
    private static final SelectionColors f165457c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw0/V;", "c", "()Lw0/V;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.W$a */
    static final class a extends Lambda implements Function0<SelectionColors> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f165458f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final SelectionColors invoke() {
            return C17713W.f165457c;
        }
    }

    static {
        long jD = C5349s0.d(4282550004L);
        f165456b = jD;
        f165457c = new SelectionColors(jD, C5346q0.q(jD, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final F0<SelectionColors> b() {
        return f165455a;
    }
}
