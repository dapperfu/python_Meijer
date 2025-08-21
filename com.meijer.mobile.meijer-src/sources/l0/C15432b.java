package l0;

import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import d0.J;
import j0.InterfaceC14882C;
import kotlin.InterfaceC13930s;
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
public final class C15432b {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.b$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f148995f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15429A f148996g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f148997h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f148998i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5800d.m f148999j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e.b f149000k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC13930s f149001l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f149002m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ J f149003n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1<w, Unit> f149004o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f149005p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f149006q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, C15429A c15429a, InterfaceC14882C interfaceC14882C, boolean z10, C5800d.m mVar, e.b bVar, InterfaceC13930s interfaceC13930s, boolean z11, J j10, Function1<? super w, Unit> function1, int i10, int i11) {
            super(2);
            this.f148995f = modifier;
            this.f148996g = c15429a;
            this.f148997h = interfaceC14882C;
            this.f148998i = z10;
            this.f148999j = mVar;
            this.f149000k = bVar;
            this.f149001l = interfaceC13930s;
            this.f149002m = z11;
            this.f149003n = j10;
            this.f149004o = function1;
            this.f149005p = i10;
            this.f149006q = i11;
        }

        public final void a(Composer composer, int i10) {
            C15432b.a(this.f148995f, this.f148996g, this.f148997h, this.f148998i, this.f148999j, this.f149000k, this.f149001l, this.f149002m, this.f149003n, this.f149004o, composer, J0.a(this.f149005p | 1), this.f149006q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.b$b, reason: collision with other inner class name */
    public static final class C2287b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f149007f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15429A f149008g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f149009h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f149010i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5800d.m f149011j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e.b f149012k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC13930s f149013l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f149014m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1<w, Unit> f149015n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f149016o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f149017p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2287b(Modifier modifier, C15429A c15429a, InterfaceC14882C interfaceC14882C, boolean z10, C5800d.m mVar, e.b bVar, InterfaceC13930s interfaceC13930s, boolean z11, Function1<? super w, Unit> function1, int i10, int i11) {
            super(2);
            this.f149007f = modifier;
            this.f149008g = c15429a;
            this.f149009h = interfaceC14882C;
            this.f149010i = z10;
            this.f149011j = mVar;
            this.f149012k = bVar;
            this.f149013l = interfaceC13930s;
            this.f149014m = z11;
            this.f149015n = function1;
            this.f149016o = i10;
            this.f149017p = i11;
        }

        public final void a(Composer composer, int i10) {
            C15432b.b(this.f149007f, this.f149008g, this.f149009h, this.f149010i, this.f149011j, this.f149012k, this.f149013l, this.f149014m, this.f149015n, composer, J0.a(this.f149016o | 1), this.f149017p);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.b$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f149018f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15429A f149019g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f149020h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f149021i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5800d.e f149022j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e.c f149023k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC13930s f149024l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f149025m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ J f149026n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1<w, Unit> f149027o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f149028p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f149029q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, C15429A c15429a, InterfaceC14882C interfaceC14882C, boolean z10, C5800d.e eVar, e.c cVar, InterfaceC13930s interfaceC13930s, boolean z11, J j10, Function1<? super w, Unit> function1, int i10, int i11) {
            super(2);
            this.f149018f = modifier;
            this.f149019g = c15429a;
            this.f149020h = interfaceC14882C;
            this.f149021i = z10;
            this.f149022j = eVar;
            this.f149023k = cVar;
            this.f149024l = interfaceC13930s;
            this.f149025m = z11;
            this.f149026n = j10;
            this.f149027o = function1;
            this.f149028p = i10;
            this.f149029q = i11;
        }

        public final void a(Composer composer, int i10) {
            C15432b.c(this.f149018f, this.f149019g, this.f149020h, this.f149021i, this.f149022j, this.f149023k, this.f149024l, this.f149025m, this.f149026n, this.f149027o, composer, J0.a(this.f149028p | 1), this.f149029q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.b$d */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f149030f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15429A f149031g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f149032h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f149033i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5800d.e f149034j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e.c f149035k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC13930s f149036l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f149037m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1<w, Unit> f149038n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f149039o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f149040p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, C15429A c15429a, InterfaceC14882C interfaceC14882C, boolean z10, C5800d.e eVar, e.c cVar, InterfaceC13930s interfaceC13930s, boolean z11, Function1<? super w, Unit> function1, int i10, int i11) {
            super(2);
            this.f149030f = modifier;
            this.f149031g = c15429a;
            this.f149032h = interfaceC14882C;
            this.f149033i = z10;
            this.f149034j = eVar;
            this.f149035k = cVar;
            this.f149036l = interfaceC13930s;
            this.f149037m = z11;
            this.f149038n = function1;
            this.f149039o = i10;
            this.f149040p = i11;
        }

        public final void a(Composer composer, int i10) {
            C15432b.d(this.f149030f, this.f149031g, this.f149032h, this.f149033i, this.f149034j, this.f149035k, this.f149036l, this.f149037m, this.f149038n, composer, J0.a(this.f149039o | 1), this.f149040p);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
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
    public static final void a(androidx.compose.ui.Modifier r31, l0.C15429A r32, j0.InterfaceC14882C r33, boolean r34, androidx.compose.foundation.layout.C5800d.m r35, P0.e.b r36, kotlin.InterfaceC13930s r37, boolean r38, d0.J r39, kotlin.jvm.functions.Function1<? super l0.w, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15432b.a(androidx.compose.ui.Modifier, l0.A, j0.C, boolean, androidx.compose.foundation.layout.d$m, P0.e$b, f0.s, boolean, d0.J, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
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
    public static final /* synthetic */ void b(androidx.compose.ui.Modifier r25, l0.C15429A r26, j0.InterfaceC14882C r27, boolean r28, androidx.compose.foundation.layout.C5800d.m r29, P0.e.b r30, kotlin.InterfaceC13930s r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15432b.b(androidx.compose.ui.Modifier, l0.A, j0.C, boolean, androidx.compose.foundation.layout.d$m, P0.e$b, f0.s, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void c(androidx.compose.ui.Modifier r31, l0.C15429A r32, j0.InterfaceC14882C r33, boolean r34, androidx.compose.foundation.layout.C5800d.e r35, P0.e.c r36, kotlin.InterfaceC13930s r37, boolean r38, d0.J r39, kotlin.jvm.functions.Function1<? super l0.w, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15432b.c(androidx.compose.ui.Modifier, l0.A, j0.C, boolean, androidx.compose.foundation.layout.d$e, P0.e$c, f0.s, boolean, d0.J, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
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
    public static final /* synthetic */ void d(androidx.compose.ui.Modifier r25, l0.C15429A r26, j0.InterfaceC14882C r27, boolean r28, androidx.compose.foundation.layout.C5800d.e r29, P0.e.c r30, kotlin.InterfaceC13930s r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15432b.d(androidx.compose.ui.Modifier, l0.A, j0.C, boolean, androidx.compose.foundation.layout.d$e, P0.e$c, f0.s, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
