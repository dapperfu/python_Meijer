package d0;

import V0.C5490r0;
import V0.InterfaceC5459f1;
import Z0.BitmapPainter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.semantics.Role;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ab\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aU\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"LV0/f1;", "bitmap", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "LP0/e;", "alignment", "Landroidx/compose/ui/layout/k;", "contentScale", "", "alpha", "LV0/r0;", "colorFilter", "LV0/b1;", "filterQuality", "", "b", "(LV0/f1;Ljava/lang/String;Landroidx/compose/ui/Modifier;LP0/e;Landroidx/compose/ui/layout/k;FLV0/r0;ILandroidx/compose/runtime/Composer;II)V", "LZ0/c;", PlaceTypes.PAINTER, "a", "(LZ0/c;Ljava/lang/String;Landroidx/compose/ui/Modifier;LP0/e;Landroidx/compose/ui/layout/k;FLV0/r0;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13590y {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d0.y$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Z0.c f127841f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f127842g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f127843h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ P0.e f127844i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5926k f127845j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f127846k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C5490r0 f127847l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f127848m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f127849n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Z0.c cVar, String str, Modifier modifier, P0.e eVar, InterfaceC5926k interfaceC5926k, float f10, C5490r0 c5490r0, int i10, int i11) {
            super(2);
            this.f127841f = cVar;
            this.f127842g = str;
            this.f127843h = modifier;
            this.f127844i = eVar;
            this.f127845j = interfaceC5926k;
            this.f127846k = f10;
            this.f127847l = c5490r0;
            this.f127848m = i10;
            this.f127849n = i11;
        }

        public final void a(Composer composer, int i10) {
            C13590y.a(this.f127841f, this.f127842g, this.f127843h, this.f127844i, this.f127845j, this.f127846k, this.f127847l, composer, J0.a(this.f127848m | 1), this.f127849n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d0.y$c */
    static final class c extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f127850f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f127850f = str;
        }

        public final void a(r1.u uVar) {
            r1.s.g0(uVar, this.f127850f);
            r1.s.s0(uVar, Role.INSTANCE.e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "<anonymous parameter 0>", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d0.y$a */
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final a f127839a = new a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: d0.y$a$a, reason: collision with other inner class name */
        static final class C2001a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final C2001a f127840f = new C2001a();

            C2001a() {
                super(1);
            }

            public final void a(f0.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        a() {
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, long j10) {
            return androidx.compose.ui.layout.K.G0(k10, H1.b.n(j10), H1.b.m(j10), null, C2001a.f127840f, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(Z0.c r20, java.lang.String r21, androidx.compose.ui.Modifier r22, P0.e r23, androidx.compose.ui.layout.InterfaceC5926k r24, float r25, V0.C5490r0 r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C13590y.a(Z0.c, java.lang.String, androidx.compose.ui.Modifier, P0.e, androidx.compose.ui.layout.k, float, V0.r0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(InterfaceC5459f1 interfaceC5459f1, String str, Modifier modifier, P0.e eVar, InterfaceC5926k interfaceC5926k, float f10, C5490r0 c5490r0, int i10, Composer composer, int i11, int i12) {
        Modifier modifier2 = (i12 & 4) != 0 ? Modifier.INSTANCE : modifier;
        P0.e eVarE = (i12 & 8) != 0 ? P0.e.INSTANCE.e() : eVar;
        InterfaceC5926k interfaceC5926kE = (i12 & 16) != 0 ? InterfaceC5926k.INSTANCE.e() : interfaceC5926k;
        float f11 = (i12 & 32) != 0 ? 1.0f : f10;
        C5490r0 c5490r02 = (i12 & 64) != 0 ? null : c5490r0;
        int iB = (i12 & 128) != 0 ? X0.f.INSTANCE.b() : i10;
        if (ComposerKt.M()) {
            ComposerKt.U(-1396260732, i11, -1, "androidx.compose.foundation.Image (Image.kt:156)");
        }
        boolean zV = composer.V(interfaceC5459f1);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = Z0.b.b(interfaceC5459f1, 0L, 0L, iB, 6, null);
            composer.t(objB);
        }
        a((BitmapPainter) objB, str, modifier2, eVarE, interfaceC5926kE, f11, c5490r02, composer, i11 & 4194288, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }
}
