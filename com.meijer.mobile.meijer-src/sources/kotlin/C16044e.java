package kotlin;

import H1.t;
import P0.e;
import androidx.compose.ui.layout.f0;
import i0.C14592e;
import java.util.List;
import kotlin.EnumC13937z;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b,\u00101R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00102R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b*\u0010)R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010)R\u0016\u0010C\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010'R\u0018\u0010E\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010D\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Lo0/e;", "Lo0/f;", "", "index", "size", "", "Landroidx/compose/ui/layout/f0;", "placeables", "LH1/n;", "visualOffset", "", "key", "Lf0/z;", "orientation", "LP0/e$b;", "horizontalAlignment", "LP0/e$c;", "verticalAlignment", "LH1/t;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Lf0/z;LP0/e$b;LP0/e$c;LH1/t;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "e", "(I)J", "offset", "layoutWidth", "layoutHeight", "", "h", "(III)V", "Landroidx/compose/ui/layout/f0$a;", "scope", "g", "(Landroidx/compose/ui/layout/f0$a;)V", "delta", "a", "(I)V", "I", "getIndex", "()I", "b", "f", "c", "Ljava/util/List;", "d", "J", "Ljava/lang/Object;", "()Ljava/lang/Object;", "LP0/e$b;", "LP0/e$c;", "LH1/t;", "i", "Z", "j", "isVertical", "k", "crossAxisSize", "", "l", "[I", "placeableOffsets", "<set-?>", "m", "getOffset", "n", "mainAxisLayoutSize", "(Landroidx/compose/ui/layout/f0;)I", "mainAxisSize", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16044e implements InterfaceC16045f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<f0> placeables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e.b horizontalAlignment;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e.c verticalAlignment;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t layoutDirection;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int[] placeableOffsets;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int offset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    public /* synthetic */ C16044e(int i10, int i11, List list, long j10, Object obj, EnumC13937z enumC13937z, e.b bVar, e.c cVar, t tVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, list, j10, obj, enumC13937z, bVar, cVar, tVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C16044e(int i10, int i11, List<? extends f0> list, long j10, Object obj, EnumC13937z enumC13937z, e.b bVar, e.c cVar, t tVar, boolean z10) {
        this.index = i10;
        this.size = i11;
        this.placeables = list;
        this.visualOffset = j10;
        this.key = obj;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = cVar;
        this.layoutDirection = tVar;
        this.reverseLayout = z10;
        this.isVertical = enumC13937z == EnumC13937z.f131419a;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            f0 f0Var = (f0) list.get(i12);
            iMax = Math.max(iMax, !this.isVertical ? f0Var.getHeight() : f0Var.getWidth());
        }
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }

    private final int d(f0 f0Var) {
        return this.isVertical ? f0Var.getHeight() : f0Var.getWidth();
    }

    private final long e(int index) {
        int[] iArr = this.placeableOffsets;
        int i10 = index * 2;
        return H1.n.f((iArr[i10] << 32) | (iArr[i10 + 1] & 4294967295L));
    }

    /* renamed from: b, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: c, reason: from getter */
    public Object getKey() {
        return this.key;
    }

    /* renamed from: f, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final void g(f0.a scope) {
        f0.a aVar;
        int i10 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            C14592e.a("position() should be called first");
        }
        int size = this.placeables.size();
        while (i10 < size) {
            f0 f0Var = this.placeables.get(i10);
            long jE = e(i10);
            if (this.reverseLayout) {
                jE = H1.n.f(((this.isVertical ? H1.n.k(jE) : (this.mainAxisLayoutSize - H1.n.k(jE)) - d(f0Var)) << 32) | ((this.isVertical ? (this.mainAxisLayoutSize - H1.n.l(jE)) - d(f0Var) : H1.n.l(jE)) & 4294967295L));
            }
            long jO = H1.n.o(jE, this.visualOffset);
            if (this.isVertical) {
                aVar = scope;
                f0.a.y(aVar, f0Var, jO, 0.0f, null, 6, null);
            } else {
                aVar = scope;
                f0.a.s(aVar, f0Var, jO, 0.0f, null, 6, null);
            }
            i10++;
            scope = aVar;
        }
    }

    @Override // kotlin.InterfaceC16045f
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.InterfaceC16045f
    public int getOffset() {
        return this.offset;
    }

    public final void h(int offset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = offset;
        this.mainAxisLayoutSize = this.isVertical ? layoutHeight : layoutWidth;
        List<f0> list = this.placeables;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f0 f0Var = list.get(i10);
            int i11 = i10 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                e.b bVar = this.horizontalAlignment;
                if (bVar == null) {
                    C14592e.b("null horizontalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i11] = bVar.a(f0Var.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i11 + 1] = offset;
                width = f0Var.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i11] = offset;
                int i12 = i11 + 1;
                e.c cVar = this.verticalAlignment;
                if (cVar == null) {
                    C14592e.b("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr2[i12] = cVar.a(f0Var.getHeight(), layoutHeight);
                width = f0Var.getWidth();
            }
            offset += width;
        }
    }

    public final void a(int delta) {
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolean z10 = this.isVertical;
            if ((z10 && i10 % 2 == 1) || (!z10 && i10 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i10] = iArr[i10] + delta;
            }
        }
    }
}
