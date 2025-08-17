package b5;

import V0.InterfaceC5316f1;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.platform.M0;
import b5.C6200f;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import l5.C15372h;
import m5.AbstractC15553c;
import m5.C15551a;
import m5.Size;
import p5.InterfaceC16262d;

@Metadata(d1 = {"\u0000i\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001$\u001am\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0015\u0010\"\u001a\u0004\u0018\u00010!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\"\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"", "model", "LZ4/h;", "imageLoader", "Lkotlin/Function1;", "Lb5/f$b;", "transform", "", "onState", "Landroidx/compose/ui/layout/k;", "contentScale", "LV0/b1;", "filterQuality", "Lb5/p;", "modelEqualityDelegate", "Lb5/f;", "c", "(Ljava/lang/Object;LZ4/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/k;ILb5/p;Landroidx/compose/runtime/Composer;II)Lb5/f;", "Lb5/i;", "state", "d", "(Lb5/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/k;ILandroidx/compose/runtime/Composer;I)Lb5/f;", "Ll5/h;", "request", "h", "(Ll5/h;)V", "", "name", "description", "", "f", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "LU0/k;", "Lm5/i;", "e", "(J)Lm5/i;", "b5/h$a", "a", "Lb5/h$a;", "fakeTransitionTarget", "coil-compose-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final a f59844a = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"b5/h$a", "Lp5/d;", "Landroid/graphics/drawable/Drawable;", "d", "()Landroid/graphics/drawable/Drawable;", "drawable", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements InterfaceC16262d {
        @Override // p5.InterfaceC16262d
        public Drawable d() {
            return null;
        }

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Size e(long j10) {
        if (j10 == U0.k.INSTANCE.a()) {
            return Size.f149852d;
        }
        if (!F.i(j10)) {
            return null;
        }
        float fI = U0.k.i(j10);
        AbstractC15553c abstractC15553cA = (Float.isInfinite(fI) || Float.isNaN(fI)) ? AbstractC15553c.b.f149837a : C15551a.a(MathKt.d(U0.k.i(j10)));
        float fG = U0.k.g(j10);
        return new Size(abstractC15553cA, (Float.isInfinite(fG) || Float.isNaN(fG)) ? AbstractC15553c.b.f149837a : C15551a.a(MathKt.d(U0.k.g(j10))));
    }

    private static final Void f(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    static /* synthetic */ Void g(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return f(str, str2);
    }

    public static final C6200f c(Object obj, Z4.h hVar, Function1<? super C6200f.b, ? extends C6200f.b> function1, Function1<? super C6200f.b, Unit> function12, InterfaceC5784k interfaceC5784k, int i10, p pVar, Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(1645646697);
        if ((i12 & 4) != 0) {
            function1 = C6200f.INSTANCE.a();
        }
        if ((i12 & 8) != 0) {
            function12 = null;
        }
        if ((i12 & 16) != 0) {
            interfaceC5784k = InterfaceC5784k.INSTANCE.e();
        }
        if ((i12 & 32) != 0) {
            i10 = X0.f.INSTANCE.b();
        }
        if ((i12 & 64) != 0) {
            pVar = q.a();
        }
        int i13 = i10;
        InterfaceC5784k interfaceC5784k2 = interfaceC5784k;
        Function1<? super C6200f.b, ? extends C6200f.b> function13 = function1;
        C6200f c6200fD = d(new i(obj, pVar, hVar), function13, function12, interfaceC5784k2, i13, composer, (i11 >> 3) & 65520);
        composer.U();
        return c6200fD;
    }

    private static final C6200f d(i iVar, Function1<? super C6200f.b, ? extends C6200f.b> function1, Function1<? super C6200f.b, Unit> function12, InterfaceC5784k interfaceC5784k, int i10, Composer composer, int i11) {
        composer.startReplaceableGroup(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            C15372h c15372hL = F.l(iVar.getModel(), composer, 8);
            h(c15372hL);
            composer.startReplaceableGroup(1094691773);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new C6200f(c15372hL, iVar.getImageLoader());
                composer.t(objB);
            }
            C6200f c6200f = (C6200f) objB;
            composer.U();
            c6200f.N(function1);
            c6200f.I(function12);
            c6200f.F(interfaceC5784k);
            c6200f.G(i10);
            c6200f.K(((Boolean) composer.o(M0.a())).booleanValue());
            c6200f.H(iVar.getImageLoader());
            c6200f.L(c15372hL);
            c6200f.b();
            composer.U();
            return c6200f;
        } finally {
            Trace.endSection();
        }
    }

    private static final void h(C15372h c15372h) {
        Object data = c15372h.getData();
        if (!(data instanceof C15372h.a)) {
            if (!(data instanceof InterfaceC5316f1)) {
                if (!(data instanceof a1.d)) {
                    if (!(data instanceof Z0.c)) {
                        if (c15372h.getTarget() == null) {
                            return;
                        } else {
                            throw new IllegalArgumentException("request.target must be null.");
                        }
                    } else {
                        g("Painter", null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                }
                g("ImageVector", null, 2, null);
                throw new KotlinNothingValueException();
            }
            g("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        f("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
        throw new KotlinNothingValueException();
    }
}
