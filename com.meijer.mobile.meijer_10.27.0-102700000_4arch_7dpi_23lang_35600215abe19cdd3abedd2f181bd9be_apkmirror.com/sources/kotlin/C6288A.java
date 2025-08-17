package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00012\b\b\u0003\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc0/y;", "", "initialValue", "initialVelocity", "a", "(Lc0/y;FF)F", "T", "frictionMultiplier", "absVelocityThreshold", "b", "(FF)Lc0/y;", "Lc0/H;", "d", "(Lc0/H;)Lc0/y;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6288A {
    public static final float a(InterfaceC6342y<Float> interfaceC6342y, float f10, float f11) {
        return ((C6330m) interfaceC6342y.a(q0.i(FloatCompanionObject.f142822a)).c(C6335r.a(f10), C6335r.a(f11))).getValue();
    }

    public static final <T> InterfaceC6342y<T> b(float f10, float f11) {
        return d(new C6296I(f10, f11));
    }

    public static /* synthetic */ InterfaceC6342y c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.1f;
        }
        return b(f10, f11);
    }

    public static final <T> InterfaceC6342y<T> d(InterfaceC6295H interfaceC6295H) {
        return new C6343z(interfaceC6295H);
    }
}
