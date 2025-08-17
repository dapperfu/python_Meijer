package l0;

import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import d0.J;
import j0.InterfaceC14794C;
import kotlin.InterfaceC13820s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0084\u0001\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0084\u0001\u0010\u001c\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ax\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001ax\u0010 \u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll0/A;", "state", "Lj0/C;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "LP0/e$c;", "verticalAlignment", "Lf0/s;", "flingBehavior", "userScrollEnabled", "Ld0/J;", "overscrollEffect", "Lkotlin/Function1;", "Ll0/w;", "", "Lkotlin/ExtensionFunctionType;", "content", "c", "(Landroidx/compose/ui/Modifier;Ll0/A;Lj0/C;ZLandroidx/compose/foundation/layout/d$e;LP0/e$c;Lf0/s;ZLd0/J;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "LP0/e$b;", "horizontalAlignment", "a", "(Landroidx/compose/ui/Modifier;Ll0/A;Lj0/C;ZLandroidx/compose/foundation/layout/d$m;LP0/e$b;Lf0/s;ZLd0/J;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "b", "(Landroidx/compose/ui/Modifier;Ll0/A;Lj0/C;ZLandroidx/compose/foundation/layout/d$m;LP0/e$b;Lf0/s;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "d", "(Landroidx/compose/ui/Modifier;Ll0/A;Lj0/C;ZLandroidx/compose/foundation/layout/d$e;LP0/e$c;Lf0/s;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15342b {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.b$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f148208f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15339A f148209g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f148210h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f148211i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5658d.m f148212j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e.b f148213k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC13820s f148214l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f148215m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ J f148216n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1<w, Unit> f148217o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f148218p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f148219q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, C15339A c15339a, InterfaceC14794C interfaceC14794C, boolean z10, C5658d.m mVar, e.b bVar, InterfaceC13820s interfaceC13820s, boolean z11, J j10, Function1<? super w, Unit> function1, int i10, int i11) {
            super(2);
            this.f148208f = modifier;
            this.f148209g = c15339a;
            this.f148210h = interfaceC14794C;
            this.f148211i = z10;
            this.f148212j = mVar;
            this.f148213k = bVar;
            this.f148214l = interfaceC13820s;
            this.f148215m = z11;
            this.f148216n = j10;
            this.f148217o = function1;
            this.f148218p = i10;
            this.f148219q = i11;
        }

        public final void a(Composer composer, int i10) {
            C15342b.a(this.f148208f, this.f148209g, this.f148210h, this.f148211i, this.f148212j, this.f148213k, this.f148214l, this.f148215m, this.f148216n, this.f148217o, composer, J0.a(this.f148218p | 1), this.f148219q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.b$b, reason: collision with other inner class name */
    public static final class C2279b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f148220f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15339A f148221g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f148222h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f148223i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5658d.m f148224j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e.b f148225k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC13820s f148226l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f148227m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1<w, Unit> f148228n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f148229o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f148230p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2279b(Modifier modifier, C15339A c15339a, InterfaceC14794C interfaceC14794C, boolean z10, C5658d.m mVar, e.b bVar, InterfaceC13820s interfaceC13820s, boolean z11, Function1<? super w, Unit> function1, int i10, int i11) {
            super(2);
            this.f148220f = modifier;
            this.f148221g = c15339a;
            this.f148222h = interfaceC14794C;
            this.f148223i = z10;
            this.f148224j = mVar;
            this.f148225k = bVar;
            this.f148226l = interfaceC13820s;
            this.f148227m = z11;
            this.f148228n = function1;
            this.f148229o = i10;
            this.f148230p = i11;
        }

        public final void a(Composer composer, int i10) {
            C15342b.b(this.f148220f, this.f148221g, this.f148222h, this.f148223i, this.f148224j, this.f148225k, this.f148226l, this.f148227m, this.f148228n, composer, J0.a(this.f148229o | 1), this.f148230p);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.b$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f148231f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15339A f148232g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f148233h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f148234i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5658d.e f148235j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e.c f148236k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC13820s f148237l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f148238m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ J f148239n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1<w, Unit> f148240o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f148241p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f148242q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, C15339A c15339a, InterfaceC14794C interfaceC14794C, boolean z10, C5658d.e eVar, e.c cVar, InterfaceC13820s interfaceC13820s, boolean z11, J j10, Function1<? super w, Unit> function1, int i10, int i11) {
            super(2);
            this.f148231f = modifier;
            this.f148232g = c15339a;
            this.f148233h = interfaceC14794C;
            this.f148234i = z10;
            this.f148235j = eVar;
            this.f148236k = cVar;
            this.f148237l = interfaceC13820s;
            this.f148238m = z11;
            this.f148239n = j10;
            this.f148240o = function1;
            this.f148241p = i10;
            this.f148242q = i11;
        }

        public final void a(Composer composer, int i10) {
            C15342b.c(this.f148231f, this.f148232g, this.f148233h, this.f148234i, this.f148235j, this.f148236k, this.f148237l, this.f148238m, this.f148239n, this.f148240o, composer, J0.a(this.f148241p | 1), this.f148242q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.b$d */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f148243f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15339A f148244g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f148245h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f148246i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5658d.e f148247j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e.c f148248k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC13820s f148249l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f148250m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1<w, Unit> f148251n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f148252o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f148253p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, C15339A c15339a, InterfaceC14794C interfaceC14794C, boolean z10, C5658d.e eVar, e.c cVar, InterfaceC13820s interfaceC13820s, boolean z11, Function1<? super w, Unit> function1, int i10, int i11) {
            super(2);
            this.f148243f = modifier;
            this.f148244g = c15339a;
            this.f148245h = interfaceC14794C;
            this.f148246i = z10;
            this.f148247j = eVar;
            this.f148248k = cVar;
            this.f148249l = interfaceC13820s;
            this.f148250m = z11;
            this.f148251n = function1;
            this.f148252o = i10;
            this.f148253p = i11;
        }

        public final void a(Composer composer, int i10) {
            C15342b.d(this.f148243f, this.f148244g, this.f148245h, this.f148246i, this.f148247j, this.f148248k, this.f148249l, this.f148250m, this.f148251n, composer, J0.a(this.f148252o | 1), this.f148253p);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r31, l0.C15339A r32, j0.InterfaceC14794C r33, boolean r34, androidx.compose.foundation.layout.C5658d.m r35, P0.e.b r36, kotlin.InterfaceC13820s r37, boolean r38, d0.J r39, kotlin.jvm.functions.Function1<? super l0.w, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15342b.a(androidx.compose.ui.Modifier, l0.A, j0.C, boolean, androidx.compose.foundation.layout.d$m, P0.e$b, f0.s, boolean, d0.J, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void b(androidx.compose.ui.Modifier r25, l0.C15339A r26, j0.InterfaceC14794C r27, boolean r28, androidx.compose.foundation.layout.C5658d.m r29, P0.e.b r30, kotlin.InterfaceC13820s r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15342b.b(androidx.compose.ui.Modifier, l0.A, j0.C, boolean, androidx.compose.foundation.layout.d$m, P0.e$b, f0.s, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.Modifier r31, l0.C15339A r32, j0.InterfaceC14794C r33, boolean r34, androidx.compose.foundation.layout.C5658d.e r35, P0.e.c r36, kotlin.InterfaceC13820s r37, boolean r38, d0.J r39, kotlin.jvm.functions.Function1<? super l0.w, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15342b.c(androidx.compose.ui.Modifier, l0.A, j0.C, boolean, androidx.compose.foundation.layout.d$e, P0.e$c, f0.s, boolean, d0.J, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void d(androidx.compose.ui.Modifier r25, l0.C15339A r26, j0.InterfaceC14794C r27, boolean r28, androidx.compose.foundation.layout.C5658d.e r29, P0.e.c r30, kotlin.InterfaceC13820s r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15342b.d(androidx.compose.ui.Modifier, l0.A, j0.C, boolean, androidx.compose.foundation.layout.d$e, P0.e$c, f0.s, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
