package j0;

import androidx.compose.foundation.layout.C5664j;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u00020\t*\u00020\tH\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010#\u001a\u00020 8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\u00020 8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Lj0/e;", "Lj0/d;", "Lj0/b;", "LH1/d;", "density", "LH1/b;", "constraints", "<init>", "(LH1/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/Modifier;", "LP0/e;", "alignment", "g", "(Landroidx/compose/ui/Modifier;LP0/e;)Landroidx/compose/ui/Modifier;", "h", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LH1/d;", "b", "J", "()J", "LH1/h;", "c", "()F", "maxWidth", "e", "maxHeight", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
final /* data */ class BoxWithConstraintsScopeImpl implements InterfaceC14812d, InterfaceC14810b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final H1.d density;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long constraints;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C5664j f139107c;

    public /* synthetic */ BoxWithConstraintsScopeImpl(H1.d dVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) other;
        return Intrinsics.e(this.density, boxWithConstraintsScopeImpl.density) && H1.b.f(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    private BoxWithConstraintsScopeImpl(H1.d dVar, long j10) {
        this.density = dVar;
        this.constraints = j10;
        this.f139107c = C5664j.f48612a;
    }

    @Override // j0.InterfaceC14812d
    /* renamed from: b, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // j0.InterfaceC14812d
    public float c() {
        return H1.b.h(getConstraints()) ? this.density.K(H1.b.l(getConstraints())) : H1.h.INSTANCE.b();
    }

    @Override // j0.InterfaceC14812d
    public float e() {
        return H1.b.g(getConstraints()) ? this.density.K(H1.b.k(getConstraints())) : H1.h.INSTANCE.b();
    }

    @Override // j0.InterfaceC14810b
    public Modifier g(Modifier modifier, P0.e eVar) {
        return this.f139107c.g(modifier, eVar);
    }

    @Override // j0.InterfaceC14810b
    public Modifier h(Modifier modifier) {
        return this.f139107c.h(modifier);
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + H1.b.o(this.constraints);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) H1.b.q(this.constraints)) + ')';
    }
}
