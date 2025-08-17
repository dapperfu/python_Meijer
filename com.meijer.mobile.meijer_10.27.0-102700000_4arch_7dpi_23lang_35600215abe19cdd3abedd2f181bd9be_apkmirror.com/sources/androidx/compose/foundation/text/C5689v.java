package androidx.compose.foundation.text;

import android.view.KeyEvent;
import e1.C13601a;
import e1.C13602b;
import e1.C13604d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Le1/b;", "", "shortcutModifier", "Landroidx/compose/foundation/text/u;", "a", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/u;", "Landroidx/compose/foundation/text/u;", "b", "()Landroidx/compose/foundation/text/u;", "defaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5689v {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC5688u f49782a = new c(a(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.v.b
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        public Object get(Object obj) {
            return Boolean.valueOf(C13604d.e(((C13602b) obj).getNativeKeyEvent()));
        }
    }));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/v$a", "Landroidx/compose/foundation/text/u;", "Le1/b;", "event", "Landroidx/compose/foundation/text/s;", "a", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/s;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.v$a */
    public static final class a implements InterfaceC5688u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<C13602b, Boolean> f49783a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super C13602b, Boolean> function1) {
            this.f49783a = function1;
        }

        @Override // androidx.compose.foundation.text.InterfaceC5688u
        public EnumC5686s a(KeyEvent event) {
            if (this.f49783a.invoke(C13602b.a(event)).booleanValue() && C13604d.f(event)) {
                if (C13601a.q(C13604d.a(event), F.f49197a.y())) {
                    return EnumC5686s.f49743V;
                }
                return null;
            }
            if (this.f49783a.invoke(C13602b.a(event)).booleanValue()) {
                long jA = C13604d.a(event);
                F f10 = F.f49197a;
                if (C13601a.q(jA, f10.d()) ? true : C13601a.q(jA, f10.n())) {
                    return EnumC5686s.f49763r;
                }
                if (C13601a.q(jA, f10.v())) {
                    return EnumC5686s.f49764s;
                }
                if (C13601a.q(jA, f10.w())) {
                    return EnumC5686s.f49765t;
                }
                if (C13601a.q(jA, f10.a())) {
                    return EnumC5686s.f49722A;
                }
                if (C13601a.q(jA, f10.x())) {
                    return EnumC5686s.f49743V;
                }
                if (C13601a.q(jA, f10.y())) {
                    return EnumC5686s.f49742U;
                }
                return null;
            }
            if (C13604d.e(event)) {
                return null;
            }
            if (C13604d.f(event)) {
                long jA2 = C13604d.a(event);
                F f11 = F.f49197a;
                if (C13601a.q(jA2, f11.i())) {
                    return EnumC5686s.f49723B;
                }
                if (C13601a.q(jA2, f11.j())) {
                    return EnumC5686s.f49724C;
                }
                if (C13601a.q(jA2, f11.k())) {
                    return EnumC5686s.f49725D;
                }
                if (C13601a.q(jA2, f11.h())) {
                    return EnumC5686s.f49726E;
                }
                if (C13601a.q(jA2, f11.s())) {
                    return EnumC5686s.f49727F;
                }
                if (C13601a.q(jA2, f11.r())) {
                    return EnumC5686s.f49728G;
                }
                if (C13601a.q(jA2, f11.p())) {
                    return EnumC5686s.f49735N;
                }
                if (C13601a.q(jA2, f11.o())) {
                    return EnumC5686s.f49736O;
                }
                if (C13601a.q(jA2, f11.n())) {
                    return EnumC5686s.f49764s;
                }
                return null;
            }
            long jA3 = C13604d.a(event);
            F f12 = F.f49197a;
            if (C13601a.q(jA3, f12.i())) {
                return EnumC5686s.f49747b;
            }
            if (C13601a.q(jA3, f12.j())) {
                return EnumC5686s.f49748c;
            }
            if (C13601a.q(jA3, f12.k())) {
                return EnumC5686s.f49757l;
            }
            if (C13601a.q(jA3, f12.h())) {
                return EnumC5686s.f49758m;
            }
            if (C13601a.q(jA3, f12.s())) {
                return EnumC5686s.f49759n;
            }
            if (C13601a.q(jA3, f12.r())) {
                return EnumC5686s.f49760o;
            }
            if (C13601a.q(jA3, f12.p())) {
                return EnumC5686s.f49753h;
            }
            if (C13601a.q(jA3, f12.o())) {
                return EnumC5686s.f49754i;
            }
            if (C13601a.q(jA3, f12.l()) ? true : C13601a.q(jA3, f12.q())) {
                return EnumC5686s.f49740S;
            }
            if (C13601a.q(jA3, f12.c())) {
                return EnumC5686s.f49766u;
            }
            if (C13601a.q(jA3, f12.g())) {
                return EnumC5686s.f49767v;
            }
            if (C13601a.q(jA3, f12.t())) {
                return EnumC5686s.f49764s;
            }
            if (C13601a.q(jA3, f12.f())) {
                return EnumC5686s.f49765t;
            }
            if (C13601a.q(jA3, f12.e())) {
                return EnumC5686s.f49763r;
            }
            if (C13601a.q(jA3, f12.u())) {
                return EnumC5686s.f49741T;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/v$c", "Landroidx/compose/foundation/text/u;", "Le1/b;", "event", "Landroidx/compose/foundation/text/s;", "a", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/s;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.v$c */
    public static final class c implements InterfaceC5688u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5688u f49785a;

        c(InterfaceC5688u interfaceC5688u) {
            this.f49785a = interfaceC5688u;
        }

        @Override // androidx.compose.foundation.text.InterfaceC5688u
        public EnumC5686s a(KeyEvent event) {
            EnumC5686s enumC5686s = null;
            if (C13604d.f(event) && C13604d.e(event)) {
                long jA = C13604d.a(event);
                F f10 = F.f49197a;
                if (C13601a.q(jA, f10.i())) {
                    enumC5686s = EnumC5686s.f49731J;
                } else if (C13601a.q(jA, f10.j())) {
                    enumC5686s = EnumC5686s.f49732K;
                } else if (C13601a.q(jA, f10.k())) {
                    enumC5686s = EnumC5686s.f49734M;
                } else if (C13601a.q(jA, f10.h())) {
                    enumC5686s = EnumC5686s.f49733L;
                }
            } else if (C13604d.e(event)) {
                long jA2 = C13604d.a(event);
                F f11 = F.f49197a;
                if (C13601a.q(jA2, f11.i())) {
                    enumC5686s = EnumC5686s.f49750e;
                } else if (C13601a.q(jA2, f11.j())) {
                    enumC5686s = EnumC5686s.f49749d;
                } else if (C13601a.q(jA2, f11.k())) {
                    enumC5686s = EnumC5686s.f49752g;
                } else if (C13601a.q(jA2, f11.h())) {
                    enumC5686s = EnumC5686s.f49751f;
                } else if (C13601a.q(jA2, f11.m())) {
                    enumC5686s = EnumC5686s.f49766u;
                } else if (C13601a.q(jA2, f11.g())) {
                    enumC5686s = EnumC5686s.f49769x;
                } else if (C13601a.q(jA2, f11.c())) {
                    enumC5686s = EnumC5686s.f49768w;
                } else if (C13601a.q(jA2, f11.b())) {
                    enumC5686s = EnumC5686s.f49739R;
                }
            } else if (C13604d.f(event)) {
                long jA3 = C13604d.a(event);
                F f12 = F.f49197a;
                if (C13601a.q(jA3, f12.p())) {
                    enumC5686s = EnumC5686s.f49735N;
                } else if (C13601a.q(jA3, f12.o())) {
                    enumC5686s = EnumC5686s.f49736O;
                }
            } else if (C13604d.d(event)) {
                long jA4 = C13604d.a(event);
                F f13 = F.f49197a;
                if (C13601a.q(jA4, f13.c())) {
                    enumC5686s = EnumC5686s.f49770y;
                } else if (C13601a.q(jA4, f13.g())) {
                    enumC5686s = EnumC5686s.f49771z;
                }
            }
            if (enumC5686s == null) {
                return this.f49785a.a(event);
            }
            return enumC5686s;
        }
    }

    public static final InterfaceC5688u a(Function1<? super C13602b, Boolean> function1) {
        return new a(function1);
    }

    public static final InterfaceC5688u b() {
        return f49782a;
    }
}
