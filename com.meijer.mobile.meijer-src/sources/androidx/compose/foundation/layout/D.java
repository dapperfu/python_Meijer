package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.N0;
import j0.InterfaceC14882C;
import j0.PaddingValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a>\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001a\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a:\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/Modifier;", "LH1/h;", "start", "top", "end", "bottom", "l", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "horizontal", "vertical", "j", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "all", "i", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "Lj0/C;", "paddingValues", "h", "(Landroidx/compose/ui/Modifier;Lj0/C;)Landroidx/compose/ui/Modifier;", "LH1/t;", "layoutDirection", "g", "(Lj0/C;LH1/t;)F", "f", "a", "(F)Lj0/C;", "b", "(FF)Lj0/C;", "d", "(FFFF)Lj0/C;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class D {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48636f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48637g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f48638h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f48639i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11, float f12, float f13) {
            super(1);
            this.f48636f = f10;
            this.f48637g = f11;
            this.f48638h = f12;
            this.f48639i = f13;
        }

        public final void a(N0 n02) {
            n02.b("padding");
            n02.getProperties().c("start", H1.h.l(this.f48636f));
            n02.getProperties().c("top", H1.h.l(this.f48637g));
            n02.getProperties().c("end", H1.h.l(this.f48638h));
            n02.getProperties().c("bottom", H1.h.l(this.f48639i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48640f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48641g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, float f11) {
            super(1);
            this.f48640f = f10;
            this.f48641g = f11;
        }

        public final void a(N0 n02) {
            n02.b("padding");
            n02.getProperties().c("horizontal", H1.h.l(this.f48640f));
            n02.getProperties().c("vertical", H1.h.l(this.f48641g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48642f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10) {
            super(1);
            this.f48642f = f10;
        }

        public final void a(N0 n02) {
            n02.b("padding");
            n02.c(H1.h.l(this.f48642f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f48643f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC14882C interfaceC14882C) {
            super(1);
            this.f48643f = interfaceC14882C;
        }

        public final void a(N0 n02) {
            n02.b("padding");
            n02.getProperties().c("paddingValues", this.f48643f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    public static final InterfaceC14882C a(float f10) {
        return new PaddingValues(f10, f10, f10, f10, null);
    }

    public static final InterfaceC14882C b(float f10, float f11) {
        return new PaddingValues(f10, f11, f10, f11, null);
    }

    public static /* synthetic */ InterfaceC14882C c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.p(0);
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.p(0);
        }
        return b(f10, f11);
    }

    public static final InterfaceC14882C d(float f10, float f11, float f12, float f13) {
        return new PaddingValues(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ InterfaceC14882C e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.p(0);
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.p(0);
        }
        if ((i10 & 4) != 0) {
            f12 = H1.h.p(0);
        }
        if ((i10 & 8) != 0) {
            f13 = H1.h.p(0);
        }
        return d(f10, f11, f12, f13);
    }

    public static final float f(InterfaceC14882C interfaceC14882C, H1.t tVar) {
        return tVar == H1.t.f13338a ? interfaceC14882C.c(tVar) : interfaceC14882C.b(tVar);
    }

    public static final float g(InterfaceC14882C interfaceC14882C, H1.t tVar) {
        return tVar == H1.t.f13338a ? interfaceC14882C.b(tVar) : interfaceC14882C.c(tVar);
    }

    public static final Modifier h(Modifier modifier, InterfaceC14882C interfaceC14882C) {
        return modifier.then(new PaddingValuesElement(interfaceC14882C, new d(interfaceC14882C)));
    }

    public static final Modifier i(Modifier modifier, float f10) {
        return modifier.then(new PaddingElement(f10, f10, f10, f10, true, new c(f10), null));
    }

    public static final Modifier j(Modifier modifier, float f10, float f11) {
        return modifier.then(new PaddingElement(f10, f11, f10, f11, true, new b(f10, f11), null));
    }

    public static /* synthetic */ Modifier k(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.p(0);
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.p(0);
        }
        return j(modifier, f10, f11);
    }

    public static final Modifier l(Modifier modifier, float f10, float f11, float f12, float f13) {
        return modifier.then(new PaddingElement(f10, f11, f12, f13, true, new a(f10, f11, f12, f13), null));
    }

    public static /* synthetic */ Modifier m(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.p(0);
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.p(0);
        }
        if ((i10 & 4) != 0) {
            f12 = H1.h.p(0);
        }
        if ((i10 & 8) != 0) {
            f13 = H1.h.p(0);
        }
        return l(modifier, f10, f11, f12, f13);
    }
}
