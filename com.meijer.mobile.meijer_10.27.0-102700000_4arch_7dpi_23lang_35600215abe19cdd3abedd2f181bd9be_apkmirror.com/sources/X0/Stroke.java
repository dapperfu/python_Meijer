package X0;

import V0.F1;
import V0.G1;
import V0.r1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0018B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u0014R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"LX0/k;", "LX0/g;", "", "width", "miter", "LV0/F1;", "cap", "LV0/G1;", "join", "LV0/r1;", "pathEffect", "<init>", "(FFIILV0/r1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "f", "()F", "b", "d", "c", "I", "e", "LV0/r1;", "()LV0/r1;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: X0.k, reason: from toString */
/* loaded from: classes.dex */
public final class Stroke extends g {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final int f39074g = F1.INSTANCE.a();

    /* renamed from: h, reason: collision with root package name */
    private static final int f39075h = G1.INSTANCE.b();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float miter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int join;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final r1 pathEffect;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"LX0/k$a;", "", "<init>", "()V", "LV0/F1;", "DefaultCap", "I", "a", "()I", "", "DefaultMiter", "F", "HairlineWidth", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: X0.k$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int a() {
            return Stroke.f39074g;
        }
    }

    public /* synthetic */ Stroke(float f10, float f11, int i10, int i11, r1 r1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i10, i11, r1Var);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) other;
        return this.width == stroke.width && this.miter == stroke.miter && F1.e(this.cap, stroke.cap) && G1.e(this.join, stroke.join) && Intrinsics.e(this.pathEffect, stroke.pathEffect);
    }

    public /* synthetic */ Stroke(float f10, float f11, int i10, int i11, r1 r1Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? f39074g : i10, (i12 & 8) != 0 ? f39075h : i11, (i12 & 16) != 0 ? null : r1Var, null);
    }

    /* renamed from: b, reason: from getter */
    public final int getCap() {
        return this.cap;
    }

    /* renamed from: c, reason: from getter */
    public final int getJoin() {
        return this.join;
    }

    /* renamed from: d, reason: from getter */
    public final float getMiter() {
        return this.miter;
    }

    /* renamed from: e, reason: from getter */
    public final r1 getPathEffect() {
        return this.pathEffect;
    }

    /* renamed from: f, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.miter)) * 31) + F1.f(this.cap)) * 31) + G1.f(this.join)) * 31;
        r1 r1Var = this.pathEffect;
        return iHashCode + (r1Var != null ? r1Var.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) F1.g(this.cap)) + ", join=" + ((Object) G1.g(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    private Stroke(float f10, float f11, int i10, int i11, r1 r1Var) {
        super(null);
        this.width = f10;
        this.miter = f11;
        this.cap = i10;
        this.join = i11;
        this.pathEffect = r1Var;
    }
}
