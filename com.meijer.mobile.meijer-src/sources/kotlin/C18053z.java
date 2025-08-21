package kotlin;

import V0.V;
import V0.W;
import V0.q1;
import V0.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lx0/z;", "", "LV0/q1;", "checkPath", "LV0/t1;", "pathMeasure", "pathToDraw", "<init>", "(LV0/q1;LV0/t1;LV0/q1;)V", "a", "LV0/q1;", "()LV0/q1;", "b", "LV0/t1;", "()LV0/t1;", "c", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C18053z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q1 checkPath;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t1 pathMeasure;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q1 pathToDraw;

    public C18053z() {
        this(null, null, null, 7, null);
    }

    public C18053z(q1 q1Var, t1 t1Var, q1 q1Var2) {
        this.checkPath = q1Var;
        this.pathMeasure = t1Var;
        this.pathToDraw = q1Var2;
    }

    /* renamed from: a, reason: from getter */
    public final q1 getCheckPath() {
        return this.checkPath;
    }

    /* renamed from: b, reason: from getter */
    public final t1 getPathMeasure() {
        return this.pathMeasure;
    }

    /* renamed from: c, reason: from getter */
    public final q1 getPathToDraw() {
        return this.pathToDraw;
    }

    public /* synthetic */ C18053z(q1 q1Var, t1 t1Var, q1 q1Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? W.a() : q1Var, (i10 & 2) != 0 ? V.a() : t1Var, (i10 & 4) != 0 ? W.a() : q1Var2);
    }
}
