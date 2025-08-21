package androidx.compose.foundation.text;

import android.view.KeyEvent;
import e1.C13749a;
import e1.C13750b;
import e1.C13752d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Le1/b;", "", "shortcutModifier", "Landroidx/compose/foundation/text/u;", "a", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/u;", "Landroidx/compose/foundation/text/u;", "b", "()Landroidx/compose/foundation/text/u;", "defaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5831v {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC5830u f50006a = new c(a(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.v.b
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        public Object get(Object obj) {
            return Boolean.valueOf(C13752d.e(((C13750b) obj).getNativeKeyEvent()));
        }
    }));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/v$a", "Landroidx/compose/foundation/text/u;", "Le1/b;", "event", "Landroidx/compose/foundation/text/s;", "a", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/s;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.v$a */
    public static final class a implements InterfaceC5830u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<C13750b, Boolean> f50007a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super C13750b, Boolean> function1) {
            this.f50007a = function1;
        }

        @Override // androidx.compose.foundation.text.InterfaceC5830u
        public EnumC5828s a(KeyEvent event) {
            if (this.f50007a.invoke(C13750b.a(event)).booleanValue() && C13752d.f(event)) {
                if (C13749a.q(C13752d.a(event), F.f49421a.y())) {
                    return EnumC5828s.f49967V;
                }
                return null;
            }
            if (this.f50007a.invoke(C13750b.a(event)).booleanValue()) {
                long jA = C13752d.a(event);
                F f10 = F.f49421a;
                if (C13749a.q(jA, f10.d()) ? true : C13749a.q(jA, f10.n())) {
                    return EnumC5828s.f49987r;
                }
                if (C13749a.q(jA, f10.v())) {
                    return EnumC5828s.f49988s;
                }
                if (C13749a.q(jA, f10.w())) {
                    return EnumC5828s.f49989t;
                }
                if (C13749a.q(jA, f10.a())) {
                    return EnumC5828s.f49946A;
                }
                if (C13749a.q(jA, f10.x())) {
                    return EnumC5828s.f49967V;
                }
                if (C13749a.q(jA, f10.y())) {
                    return EnumC5828s.f49966U;
                }
                return null;
            }
            if (C13752d.e(event)) {
                return null;
            }
            if (C13752d.f(event)) {
                long jA2 = C13752d.a(event);
                F f11 = F.f49421a;
                if (C13749a.q(jA2, f11.i())) {
                    return EnumC5828s.f49947B;
                }
                if (C13749a.q(jA2, f11.j())) {
                    return EnumC5828s.f49948C;
                }
                if (C13749a.q(jA2, f11.k())) {
                    return EnumC5828s.f49949D;
                }
                if (C13749a.q(jA2, f11.h())) {
                    return EnumC5828s.f49950E;
                }
                if (C13749a.q(jA2, f11.s())) {
                    return EnumC5828s.f49951F;
                }
                if (C13749a.q(jA2, f11.r())) {
                    return EnumC5828s.f49952G;
                }
                if (C13749a.q(jA2, f11.p())) {
                    return EnumC5828s.f49959N;
                }
                if (C13749a.q(jA2, f11.o())) {
                    return EnumC5828s.f49960O;
                }
                if (C13749a.q(jA2, f11.n())) {
                    return EnumC5828s.f49988s;
                }
                return null;
            }
            long jA3 = C13752d.a(event);
            F f12 = F.f49421a;
            if (C13749a.q(jA3, f12.i())) {
                return EnumC5828s.f49971b;
            }
            if (C13749a.q(jA3, f12.j())) {
                return EnumC5828s.f49972c;
            }
            if (C13749a.q(jA3, f12.k())) {
                return EnumC5828s.f49981l;
            }
            if (C13749a.q(jA3, f12.h())) {
                return EnumC5828s.f49982m;
            }
            if (C13749a.q(jA3, f12.s())) {
                return EnumC5828s.f49983n;
            }
            if (C13749a.q(jA3, f12.r())) {
                return EnumC5828s.f49984o;
            }
            if (C13749a.q(jA3, f12.p())) {
                return EnumC5828s.f49977h;
            }
            if (C13749a.q(jA3, f12.o())) {
                return EnumC5828s.f49978i;
            }
            if (C13749a.q(jA3, f12.l()) ? true : C13749a.q(jA3, f12.q())) {
                return EnumC5828s.f49964S;
            }
            if (C13749a.q(jA3, f12.c())) {
                return EnumC5828s.f49990u;
            }
            if (C13749a.q(jA3, f12.g())) {
                return EnumC5828s.f49991v;
            }
            if (C13749a.q(jA3, f12.t())) {
                return EnumC5828s.f49988s;
            }
            if (C13749a.q(jA3, f12.f())) {
                return EnumC5828s.f49989t;
            }
            if (C13749a.q(jA3, f12.e())) {
                return EnumC5828s.f49987r;
            }
            if (C13749a.q(jA3, f12.u())) {
                return EnumC5828s.f49965T;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/v$c", "Landroidx/compose/foundation/text/u;", "Le1/b;", "event", "Landroidx/compose/foundation/text/s;", "a", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/s;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.v$c */
    public static final class c implements InterfaceC5830u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5830u f50009a;

        c(InterfaceC5830u interfaceC5830u) {
            this.f50009a = interfaceC5830u;
        }

        @Override // androidx.compose.foundation.text.InterfaceC5830u
        public EnumC5828s a(KeyEvent event) {
            EnumC5828s enumC5828s = null;
            if (C13752d.f(event) && C13752d.e(event)) {
                long jA = C13752d.a(event);
                F f10 = F.f49421a;
                if (C13749a.q(jA, f10.i())) {
                    enumC5828s = EnumC5828s.f49955J;
                } else if (C13749a.q(jA, f10.j())) {
                    enumC5828s = EnumC5828s.f49956K;
                } else if (C13749a.q(jA, f10.k())) {
                    enumC5828s = EnumC5828s.f49958M;
                } else if (C13749a.q(jA, f10.h())) {
                    enumC5828s = EnumC5828s.f49957L;
                }
            } else if (C13752d.e(event)) {
                long jA2 = C13752d.a(event);
                F f11 = F.f49421a;
                if (C13749a.q(jA2, f11.i())) {
                    enumC5828s = EnumC5828s.f49974e;
                } else if (C13749a.q(jA2, f11.j())) {
                    enumC5828s = EnumC5828s.f49973d;
                } else if (C13749a.q(jA2, f11.k())) {
                    enumC5828s = EnumC5828s.f49976g;
                } else if (C13749a.q(jA2, f11.h())) {
                    enumC5828s = EnumC5828s.f49975f;
                } else if (C13749a.q(jA2, f11.m())) {
                    enumC5828s = EnumC5828s.f49990u;
                } else if (C13749a.q(jA2, f11.g())) {
                    enumC5828s = EnumC5828s.f49993x;
                } else if (C13749a.q(jA2, f11.c())) {
                    enumC5828s = EnumC5828s.f49992w;
                } else if (C13749a.q(jA2, f11.b())) {
                    enumC5828s = EnumC5828s.f49963R;
                }
            } else if (C13752d.f(event)) {
                long jA3 = C13752d.a(event);
                F f12 = F.f49421a;
                if (C13749a.q(jA3, f12.p())) {
                    enumC5828s = EnumC5828s.f49959N;
                } else if (C13749a.q(jA3, f12.o())) {
                    enumC5828s = EnumC5828s.f49960O;
                }
            } else if (C13752d.d(event)) {
                long jA4 = C13752d.a(event);
                F f13 = F.f49421a;
                if (C13749a.q(jA4, f13.c())) {
                    enumC5828s = EnumC5828s.f49994y;
                } else if (C13749a.q(jA4, f13.g())) {
                    enumC5828s = EnumC5828s.f49995z;
                }
            }
            if (enumC5828s == null) {
                return this.f50009a.a(event);
            }
            return enumC5828s;
        }
    }

    public static final InterfaceC5830u a(Function1<? super C13750b, Boolean> function1) {
        return new a(function1);
    }

    public static final InterfaceC5830u b() {
        return f50006a;
    }
}
