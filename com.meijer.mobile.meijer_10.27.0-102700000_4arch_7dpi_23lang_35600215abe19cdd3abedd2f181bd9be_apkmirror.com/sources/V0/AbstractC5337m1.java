package V0;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"LV0/m1;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "a", "()Landroidx/compose/ui/geometry/Rect;", "bounds", "b", "c", "LV0/m1$a;", "LV0/m1$b;", "LV0/m1$c;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: V0.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5337m1 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"LV0/m1$a;", "LV0/m1;", "LV0/q1;", "path", "<init>", "(LV0/q1;)V", "a", "LV0/q1;", "b", "()LV0/q1;", "Landroidx/compose/ui/geometry/Rect;", "()Landroidx/compose/ui/geometry/Rect;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: V0.m1$a */
    public static final class a extends AbstractC5337m1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1 path;

        public a(q1 q1Var) {
            super(null);
            this.path = q1Var;
        }

        @Override // V0.AbstractC5337m1
        /* renamed from: a */
        public Rect getRect() {
            return this.path.getBounds();
        }

        /* renamed from: b, reason: from getter */
        public final q1 getPath() {
            return this.path;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"LV0/m1$b;", "LV0/m1;", "Landroidx/compose/ui/geometry/Rect;", "rect", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/ui/geometry/Rect;", "b", "()Landroidx/compose/ui/geometry/Rect;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: V0.m1$b */
    public static final class b extends AbstractC5337m1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Rect rect;

        public b(Rect rect) {
            super(null);
            this.rect = rect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && Intrinsics.e(this.rect, ((b) other).rect);
        }

        @Override // V0.AbstractC5337m1
        /* renamed from: a, reason: from getter */
        public Rect getRect() {
            return this.rect;
        }

        public final Rect b() {
            return this.rect;
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"LV0/m1$c;", "LV0/m1;", "LU0/i;", "roundRect", "<init>", "(LU0/i;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LU0/i;", "b", "()LU0/i;", "LV0/q1;", "LV0/q1;", "c", "()LV0/q1;", "roundRectPath", "Landroidx/compose/ui/geometry/Rect;", "()Landroidx/compose/ui/geometry/Rect;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: V0.m1$c */
    public static final class c extends AbstractC5337m1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final U0.i roundRect;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q1 roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(U0.i iVar) {
            super(0 == true ? 1 : 0);
            q1 q1Var = null;
            this.roundRect = iVar;
            if (!U0.j.h(iVar)) {
                q1 q1VarA = W.a();
                q1.p(q1VarA, iVar, null, 2, null);
                q1Var = q1VarA;
            }
            this.roundRectPath = q1Var;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && Intrinsics.e(this.roundRect, ((c) other).roundRect);
        }

        @Override // V0.AbstractC5337m1
        /* renamed from: a */
        public Rect getRect() {
            return U0.j.g(this.roundRect);
        }

        /* renamed from: b, reason: from getter */
        public final U0.i getRoundRect() {
            return this.roundRect;
        }

        /* renamed from: c, reason: from getter */
        public final q1 getRoundRectPath() {
            return this.roundRectPath;
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    public /* synthetic */ AbstractC5337m1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract Rect getRect();

    private AbstractC5337m1() {
    }
}
