package c5;

import V0.InterfaceC5459f1;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.platform.M0;
import c5.C6487f;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import m5.C15669h;
import n5.AbstractC15906c;
import n5.C15904a;
import n5.Size;
import q5.InterfaceC16607d;

@Metadata(d1 = {"\u0000i\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001$\u001am\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0015\u0010\"\u001a\u0004\u0018\u00010!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\"\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"", "model", "La5/h;", "imageLoader", "Lkotlin/Function1;", "Lc5/f$b;", "transform", "", "onState", "Landroidx/compose/ui/layout/k;", "contentScale", "LV0/b1;", "filterQuality", "Lc5/p;", "modelEqualityDelegate", "Lc5/f;", "c", "(Ljava/lang/Object;La5/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/k;ILc5/p;Landroidx/compose/runtime/Composer;II)Lc5/f;", "Lc5/i;", "state", "d", "(Lc5/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/k;ILandroidx/compose/runtime/Composer;I)Lc5/f;", "Lm5/h;", "request", "h", "(Lm5/h;)V", "", "name", "description", "", "f", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "LU0/k;", "Ln5/i;", "e", "(J)Ln5/i;", "c5/h$a", "a", "Lc5/h$a;", "fakeTransitionTarget", "coil-compose-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final a f61331a = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"c5/h$a", "Lq5/d;", "Landroid/graphics/drawable/Drawable;", "d", "()Landroid/graphics/drawable/Drawable;", "drawable", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements InterfaceC16607d {
        @Override // q5.InterfaceC16607d
        public Drawable d() {
            return null;
        }

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Size e(long j10) {
        if (j10 == U0.k.INSTANCE.a()) {
            return Size.f152064d;
        }
        if (!F.i(j10)) {
            return null;
        }
        float fI = U0.k.i(j10);
        AbstractC15906c abstractC15906cA = (Float.isInfinite(fI) || Float.isNaN(fI)) ? AbstractC15906c.b.f152049a : C15904a.a(MathKt.d(U0.k.i(j10)));
        float fG = U0.k.g(j10);
        return new Size(abstractC15906cA, (Float.isInfinite(fG) || Float.isNaN(fG)) ? AbstractC15906c.b.f152049a : C15904a.a(MathKt.d(U0.k.g(j10))));
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

    public static final C6487f c(Object obj, a5.h hVar, Function1<? super C6487f.b, ? extends C6487f.b> function1, Function1<? super C6487f.b, Unit> function12, InterfaceC5926k interfaceC5926k, int i10, p pVar, Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(1645646697);
        if ((i12 & 4) != 0) {
            function1 = C6487f.INSTANCE.a();
        }
        if ((i12 & 8) != 0) {
            function12 = null;
        }
        if ((i12 & 16) != 0) {
            interfaceC5926k = InterfaceC5926k.INSTANCE.e();
        }
        if ((i12 & 32) != 0) {
            i10 = X0.f.INSTANCE.b();
        }
        if ((i12 & 64) != 0) {
            pVar = q.a();
        }
        int i13 = i10;
        InterfaceC5926k interfaceC5926k2 = interfaceC5926k;
        Function1<? super C6487f.b, ? extends C6487f.b> function13 = function1;
        C6487f c6487fD = d(new i(obj, pVar, hVar), function13, function12, interfaceC5926k2, i13, composer, (i11 >> 3) & 65520);
        composer.U();
        return c6487fD;
    }

    private static final C6487f d(i iVar, Function1<? super C6487f.b, ? extends C6487f.b> function1, Function1<? super C6487f.b, Unit> function12, InterfaceC5926k interfaceC5926k, int i10, Composer composer, int i11) {
        composer.startReplaceableGroup(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            C15669h c15669hL = F.l(iVar.getModel(), composer, 8);
            h(c15669hL);
            composer.startReplaceableGroup(1094691773);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new C6487f(c15669hL, iVar.getImageLoader());
                composer.t(objB);
            }
            C6487f c6487f = (C6487f) objB;
            composer.U();
            c6487f.N(function1);
            c6487f.I(function12);
            c6487f.F(interfaceC5926k);
            c6487f.G(i10);
            c6487f.K(((Boolean) composer.o(M0.a())).booleanValue());
            c6487f.H(iVar.getImageLoader());
            c6487f.L(c15669hL);
            c6487f.b();
            composer.U();
            return c6487f;
        } finally {
            Trace.endSection();
        }
    }

    private static final void h(C15669h c15669h) {
        Object data = c15669h.getData();
        if (!(data instanceof C15669h.a)) {
            if (!(data instanceof InterfaceC5459f1)) {
                if (!(data instanceof a1.d)) {
                    if (!(data instanceof Z0.c)) {
                        if (c15669h.getTarget() == null) {
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
