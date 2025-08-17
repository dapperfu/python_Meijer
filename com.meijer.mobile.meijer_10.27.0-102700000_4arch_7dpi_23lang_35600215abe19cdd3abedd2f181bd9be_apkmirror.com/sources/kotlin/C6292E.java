package kotlin;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\r\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010\f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\u000b\u0010\u0004¨\u0006\r"}, d2 = {"Lc0/C;", "a", "Lc0/C;", "c", "()Lc0/C;", "FastOutSlowInEasing", "b", "e", "LinearOutSlowInEasing", "getFastOutLinearInEasing", "FastOutLinearInEasing", "d", "LinearEasing", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6292E {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6290C f60887a = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC6290C f60888b = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC6290C f60889c = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC6290C f60890d = new InterfaceC6290C() { // from class: c0.D
        @Override // kotlin.InterfaceC6290C
        public final float a(float f10) {
            return C6292E.b(f10);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f10) {
        return f10;
    }

    public static final InterfaceC6290C c() {
        return f60887a;
    }

    public static final InterfaceC6290C d() {
        return f60890d;
    }

    public static final InterfaceC6290C e() {
        return f60888b;
    }
}
