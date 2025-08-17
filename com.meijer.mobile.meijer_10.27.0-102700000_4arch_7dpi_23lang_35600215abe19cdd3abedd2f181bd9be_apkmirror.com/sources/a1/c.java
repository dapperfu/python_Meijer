package a1;

import V0.AbstractC5324i0;
import V0.C5331k1;
import V0.C5346q0;
import V0.SolidColor;
import V0.W;
import V0.q1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0006*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R*\u00101\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R6\u0010:\u001a\b\u0012\u0004\u0012\u000203022\f\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010$\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010;\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R0\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010@8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010A\u001a\u0004\b\u001f\u0010B\"\u0004\b(\u0010CR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010AR*\u0010J\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010\u001d\"\u0004\bH\u0010IR*\u0010Q\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010T\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR*\u0010W\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010L\u001a\u0004\bU\u0010N\"\u0004\bV\u0010PR*\u0010Z\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010L\u001a\u0004\bX\u0010N\"\u0004\bY\u0010PR*\u0010]\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010L\u001a\u0004\b[\u0010N\"\u0004\b\\\u0010PR*\u0010`\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010L\u001a\u0004\b^\u0010N\"\u0004\b_\u0010PR*\u0010c\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010L\u001a\u0004\ba\u0010N\"\u0004\bb\u0010PR\u0016\u0010d\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010)R\u0014\u0010e\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010+R\u0011\u0010g\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b5\u0010f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"La1/c;", "La1/l;", "<init>", "()V", "LV0/i0;", "brush", "", "l", "(LV0/i0;)V", "LV0/q0;", "color", "m", "(J)V", "node", "n", "(La1/l;)V", "k", "x", "y", "", "index", "instance", "i", "(ILa1/l;)V", "LX0/f;", "a", "(LX0/f;)V", "", "toString", "()Ljava/lang/String;", "LV0/k1;", "b", "[F", "groupMatrix", "", "c", "Ljava/util/List;", "children", "", "<set-?>", "d", "Z", "j", "()Z", "isTintable", "e", "J", "g", "()J", "tintColor", "", "La1/h;", "value", "f", "getClipPathData", "()Ljava/util/List;", "o", "(Ljava/util/List;)V", "clipPathData", "isClipPathDirty", "LV0/q1;", "h", "LV0/q1;", "clipPath", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "invalidateListener", "wrappedListener", "Ljava/lang/String;", "getName", "p", "(Ljava/lang/String;)V", "name", "", "F", "getRotation", "()F", "s", "(F)V", "rotation", "getPivotX", "q", "pivotX", "getPivotY", "r", "pivotY", "getScaleX", "t", "scaleX", "getScaleY", "u", "scaleY", "getTranslationX", "v", "translationX", "getTranslationY", "w", "translationY", "isMatrixDirty", "willClipPath", "()I", "numChildren", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float[] groupMatrix;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<l> children;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isTintable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long tintColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<? extends h> clipPathData;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isClipPathDirty;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private q1 clipPath;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Function1<? super l, Unit> invalidateListener;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Function1<l, Unit> wrappedListener;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rotation;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float pivotX;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float pivotY;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isMatrixDirty;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La1/l;", "node", "", "a", "(La1/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<l, Unit> {
        a() {
            super(1);
        }

        public final void a(l lVar) {
            c.this.n(lVar);
            Function1<l, Unit> function1B = c.this.b();
            if (function1B != null) {
                function1B.invoke(lVar);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l lVar) {
            a(lVar);
            return Unit.f142422a;
        }
    }

    public c() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = C5346q0.INSTANCE.j();
        this.clipPathData = o.d();
        this.isClipPathDirty = true;
        this.wrappedListener = new a();
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final void k() {
        this.isTintable = false;
        this.tintColor = C5346q0.INSTANCE.j();
    }

    private final boolean h() {
        return !this.clipPathData.isEmpty();
    }

    private final void l(AbstractC5324i0 brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m(((SolidColor) brush).getValue());
            } else {
                k();
            }
        }
    }

    private final void m(long color) {
        if (this.isTintable && color != 16) {
            long j10 = this.tintColor;
            if (j10 == 16) {
                this.tintColor = color;
            } else {
                if (o.e(j10, color)) {
                    return;
                }
                k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(l node) {
        if (node instanceof g) {
            g gVar = (g) node;
            l(gVar.getFill());
            l(gVar.getStroke());
        } else if (node instanceof c) {
            c cVar = (c) node;
            if (cVar.isTintable && this.isTintable) {
                m(cVar.tintColor);
            } else {
                k();
            }
        }
    }

    private final void y() {
        float[] fArrC = this.groupMatrix;
        if (fArrC == null) {
            fArrC = C5331k1.c(null, 1, null);
            this.groupMatrix = fArrC;
        } else {
            C5331k1.h(fArrC);
        }
        float[] fArr = fArrC;
        C5331k1.o(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        C5331k1.j(fArr, this.rotation);
        C5331k1.k(fArr, this.scaleX, this.scaleY, 1.0f);
        C5331k1.o(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    @Override // a1.l
    public void a(X0.f fVar) {
        if (this.isMatrixDirty) {
            y();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            x();
            this.isClipPathDirty = false;
        }
        X0.d drawContext = fVar.getDrawContext();
        long jB = drawContext.b();
        drawContext.g().save();
        try {
            X0.h transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.a(C5331k1.a(fArr).getValues());
            }
            q1 q1Var = this.clipPath;
            if (h() && q1Var != null) {
                X0.h.h(transform, q1Var, 0, 2, null);
            }
            List<l> list = this.children;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).a(fVar);
            }
            drawContext.g().i();
            drawContext.h(jB);
        } catch (Throwable th2) {
            drawContext.g().i();
            drawContext.h(jB);
            throw th2;
        }
    }

    @Override // a1.l
    public Function1<l, Unit> b() {
        return this.invalidateListener;
    }

    @Override // a1.l
    public void d(Function1<? super l, Unit> function1) {
        this.invalidateListener = function1;
    }

    public final int f() {
        return this.children.size();
    }

    /* renamed from: g, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsTintable() {
        return this.isTintable;
    }

    public final void o(List<? extends h> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        c();
    }

    public final void p(String str) {
        this.name = str;
        c();
    }

    public final void q(float f10) {
        this.pivotX = f10;
        this.isMatrixDirty = true;
        c();
    }

    public final void r(float f10) {
        this.pivotY = f10;
        this.isMatrixDirty = true;
        c();
    }

    public final void s(float f10) {
        this.rotation = f10;
        this.isMatrixDirty = true;
        c();
    }

    public final void t(float f10) {
        this.scaleX = f10;
        this.isMatrixDirty = true;
        c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.name);
        List<l> list = this.children;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = list.get(i10);
            sb2.append("\t");
            sb2.append(lVar.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final void u(float f10) {
        this.scaleY = f10;
        this.isMatrixDirty = true;
        c();
    }

    public final void v(float f10) {
        this.translationX = f10;
        this.isMatrixDirty = true;
        c();
    }

    public final void w(float f10) {
        this.translationY = f10;
        this.isMatrixDirty = true;
        c();
    }

    private final void x() {
        if (h()) {
            q1 q1VarA = this.clipPath;
            if (q1VarA == null) {
                q1VarA = W.a();
                this.clipPath = q1VarA;
            }
            k.c(this.clipPathData, q1VarA);
        }
    }

    public final void i(int index, l instance) {
        if (index < f()) {
            this.children.set(index, instance);
        } else {
            this.children.add(instance);
        }
        n(instance);
        instance.d(this.wrappedListener);
        c();
    }
}
