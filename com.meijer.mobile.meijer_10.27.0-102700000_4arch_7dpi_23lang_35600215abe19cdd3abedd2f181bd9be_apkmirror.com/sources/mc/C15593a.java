package mc;

import H1.t;
import U0.k;
import V0.C5347r0;
import V0.E;
import X0.f;
import Z0.c;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0007*\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R4\u0010/\u001a\u00020)2\u0006\u0010!\u001a\u00020)8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u00107\u001a\u00020)8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b6\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Lmc/a;", "LZ0/c;", "Landroidx/compose/runtime/N0;", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "", "b", "()V", "e", "f", "", "alpha", "", "a", "(F)Z", "LV0/r0;", "colorFilter", "c", "(LV0/r0;)Z", "LH1/t;", "layoutDirection", "d", "(LH1/t;)Z", "LX0/f;", "m", "(LX0/f;)V", "g", "Landroid/graphics/drawable/Drawable;", "s", "()Landroid/graphics/drawable/Drawable;", "", "<set-?>", "h", "Landroidx/compose/runtime/l0;", "r", "()I", "u", "(I)V", "drawInvalidateTick", "LU0/k;", "i", "t", "()J", "v", "(J)V", "drawableIntrinsicSize", "Landroid/graphics/drawable/Drawable$Callback;", "j", "Lkotlin/Lazy;", "q", "()Landroid/graphics/drawable/Drawable$Callback;", "callback", "k", "intrinsicSize", "drawablepainter_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15593a extends c implements N0 {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Drawable drawable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 drawInvalidateTick;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 drawableIntrinsicSize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy callback;

    @Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0003*\u0001\u0000\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"mc/a$b$a", "c", "()Lmc/a$b$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mc.a$b */
    static final class b extends Lambda implements Function0<C2303a> {

        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"mc/a$b$a", "Landroid/graphics/drawable/Drawable$Callback;", "Landroid/graphics/drawable/Drawable;", "d", "", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Ljava/lang/Runnable;", "what", "", "time", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "drawablepainter_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: mc.a$b$a, reason: collision with other inner class name */
        public static final class C2303a implements Drawable.Callback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C15593a f150053a;

            C2303a(C15593a c15593a) {
                this.f150053a = c15593a;
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable d10) {
                Intrinsics.j(d10, "d");
                C15593a c15593a = this.f150053a;
                c15593a.u(c15593a.r() + 1);
                C15593a c15593a2 = this.f150053a;
                c15593a2.v(C15594b.c(c15593a2.getDrawable()));
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable d10, Runnable what, long time) {
                Intrinsics.j(d10, "d");
                Intrinsics.j(what, "what");
                C15594b.d().postAtTime(what, time);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable d10, Runnable what) {
                Intrinsics.j(d10, "d");
                Intrinsics.j(what, "what");
                C15594b.d().removeCallbacks(what);
            }
        }

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C2303a invoke() {
            return new C2303a(C15593a.this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mc.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2302a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f12006a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f12007b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C15593a(Drawable drawable) {
        Intrinsics.j(drawable, "drawable");
        this.drawable = drawable;
        this.drawInvalidateTick = t1.e(0, null, 2, null);
        this.drawableIntrinsicSize = t1.e(k.c(C15594b.c(drawable)), null, 2, null);
        this.callback = LazyKt.b(new b());
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    private final Drawable.Callback q() {
        return (Drawable.Callback) this.callback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int r() {
        return ((Number) this.drawInvalidateTick.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long t() {
        return ((k) this.drawableIntrinsicSize.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(int i10) {
        this.drawInvalidateTick.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(long j10) {
        this.drawableIntrinsicSize.setValue(k.c(j10));
    }

    @Override // Z0.c
    protected boolean a(float alpha) {
        this.drawable.setAlpha(RangesKt.o(MathKt.d(alpha * l3.f92484c), 0, l3.f92484c));
        return true;
    }

    @Override // androidx.compose.runtime.N0
    public void b() {
        this.drawable.setCallback(q());
        this.drawable.setVisible(true, true);
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // Z0.c
    protected boolean c(C5347r0 colorFilter) {
        this.drawable.setColorFilter(colorFilter != null ? E.d(colorFilter) : null);
        return true;
    }

    @Override // Z0.c
    protected boolean d(t layoutDirection) {
        Intrinsics.j(layoutDirection, "layoutDirection");
        Drawable drawable = this.drawable;
        int i10 = C2302a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i11);
    }

    @Override // androidx.compose.runtime.N0
    public void f() {
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    @Override // Z0.c
    protected void m(f fVar) {
        Intrinsics.j(fVar, "<this>");
        Canvas canvasG = fVar.getDrawContext().g();
        r();
        this.drawable.setBounds(0, 0, MathKt.d(k.i(fVar.b())), MathKt.d(k.g(fVar.b())));
        try {
            canvasG.save();
            this.drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvasG));
        } finally {
            canvasG.i();
        }
    }

    /* renamed from: s, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    @Override // androidx.compose.runtime.N0
    public void e() {
        f();
    }

    @Override // Z0.c
    public long k() {
        return t();
    }
}
