package androidx.compose.foundation.text;

import android.view.KeyEvent;
import e1.C13601a;
import e1.C13604d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/u;", "a", "Landroidx/compose/foundation/text/u;", "()Landroidx/compose/foundation/text/u;", "platformDefaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5690w {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC5688u f49789a = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/w$a", "Landroidx/compose/foundation/text/u;", "Le1/b;", "event", "Landroidx/compose/foundation/text/s;", "a", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/s;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.w$a */
    public static final class a implements InterfaceC5688u {
        a() {
        }

        @Override // androidx.compose.foundation.text.InterfaceC5688u
        public EnumC5686s a(KeyEvent event) {
            EnumC5686s enumC5686s = null;
            if (C13604d.f(event) && C13604d.d(event)) {
                long jA = C13604d.a(event);
                F f10 = F.f49197a;
                if (C13601a.q(jA, f10.i())) {
                    enumC5686s = EnumC5686s.f49737P;
                } else if (C13601a.q(jA, f10.j())) {
                    enumC5686s = EnumC5686s.f49738Q;
                } else if (C13601a.q(jA, f10.k())) {
                    enumC5686s = EnumC5686s.f49729H;
                } else if (C13601a.q(jA, f10.h())) {
                    enumC5686s = EnumC5686s.f49730I;
                }
            } else if (C13604d.d(event)) {
                long jA2 = C13604d.a(event);
                F f11 = F.f49197a;
                if (C13601a.q(jA2, f11.i())) {
                    enumC5686s = EnumC5686s.f49755j;
                } else if (C13601a.q(jA2, f11.j())) {
                    enumC5686s = EnumC5686s.f49756k;
                } else if (C13601a.q(jA2, f11.k())) {
                    enumC5686s = EnumC5686s.f49761p;
                } else if (C13601a.q(jA2, f11.h())) {
                    enumC5686s = EnumC5686s.f49762q;
                }
            }
            if (enumC5686s == null) {
                return C5689v.b().a(event);
            }
            return enumC5686s;
        }
    }

    public static final InterfaceC5688u a() {
        return f49789a;
    }
}
