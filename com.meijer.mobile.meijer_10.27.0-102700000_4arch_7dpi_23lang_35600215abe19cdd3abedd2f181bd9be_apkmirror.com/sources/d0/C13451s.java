package d0;

import android.content.Context;
import android.widget.EdgeEffect;
import kotlin.EnumC13827z;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0012J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0012J\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012J\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u001fJ\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\u001fJ\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\u001fJ\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\u001fJ\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\u001fJ\u0018\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00102R\u0018\u00108\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00102R\u0018\u00109\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00102R\u0018\u0010:\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00102R\u001a\u0010=\u001a\u00020\u0010*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010?\u001a\u00020\u0010*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Ld0/s;", "", "Landroid/content/Context;", "context", "", "glowColor", "<init>", "(Landroid/content/Context;I)V", "Lf0/z;", "orientation", "Landroid/widget/EdgeEffect;", "e", "(Lf0/z;)Landroid/widget/EdgeEffect;", "", "f", "()V", "", "B", "()Z", "r", "u", "x", "A", "q", "t", "w", "z", "p", "s", "v", "m", "()Landroid/widget/EdgeEffect;", "g", "i", "k", "n", "h", "j", "l", "LH1/r;", "size", "C", "(J)V", "a", "Landroid/content/Context;", "b", "I", "c", "J", "d", "Landroid/widget/EdgeEffect;", "topEffect", "bottomEffect", "leftEffect", "rightEffect", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "y", "(Landroid/widget/EdgeEffect;)Z", "isStretched", "o", "isAnimating", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C13451s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int glowColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long size = H1.r.INSTANCE.a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect topEffect;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect bottomEffect;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect leftEffect;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect rightEffect;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect topEffectNegation;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect bottomEffectNegation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect leftEffectNegation;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect rightEffectNegation;

    private final boolean y(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(C13450q.f126991a.c(edgeEffect) == 0.0f);
    }

    private final EdgeEffect e(EnumC13827z orientation) {
        EdgeEffect edgeEffectB = C13450q.f126991a.b(this.context);
        edgeEffectB.setColor(this.glowColor);
        if (!H1.r.e(this.size, H1.r.INSTANCE.a())) {
            if (orientation == EnumC13827z.f130585a) {
                long j10 = this.size;
                edgeEffectB.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
                return edgeEffectB;
            }
            long j11 = this.size;
            edgeEffectB.setSize((int) (j11 & 4294967295L), (int) (j11 >> 32));
        }
        return edgeEffectB;
    }

    private final boolean o(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final boolean A() {
        return y(this.topEffectNegation);
    }

    public final boolean B() {
        return y(this.topEffect);
    }

    public final void C(long size) {
        this.size = size;
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (4294967295L & size), (int) (size >> 32));
        }
    }

    public final void f() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.bottomEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(EnumC13827z.f130585a);
        this.bottomEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.bottomEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(EnumC13827z.f130585a);
        this.bottomEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.leftEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(EnumC13827z.f130586b);
        this.leftEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect j() {
        EdgeEffect edgeEffect = this.leftEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(EnumC13827z.f130586b);
        this.leftEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect k() {
        EdgeEffect edgeEffect = this.rightEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(EnumC13827z.f130586b);
        this.rightEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect l() {
        EdgeEffect edgeEffect = this.rightEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(EnumC13827z.f130586b);
        this.rightEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect m() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(EnumC13827z.f130585a);
        this.topEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect n() {
        EdgeEffect edgeEffect = this.topEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(EnumC13827z.f130585a);
        this.topEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final boolean p() {
        return o(this.bottomEffect);
    }

    public final boolean q() {
        return y(this.bottomEffectNegation);
    }

    public final boolean r() {
        return y(this.bottomEffect);
    }

    public final boolean s() {
        return o(this.leftEffect);
    }

    public final boolean t() {
        return y(this.leftEffectNegation);
    }

    public final boolean u() {
        return y(this.leftEffect);
    }

    public final boolean v() {
        return o(this.rightEffect);
    }

    public final boolean w() {
        return y(this.rightEffectNegation);
    }

    public final boolean x() {
        return y(this.rightEffect);
    }

    public final boolean z() {
        return o(this.topEffect);
    }

    public C13451s(Context context, int i10) {
        this.context = context;
        this.glowColor = i10;
    }
}
