package L1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"LL1/B;", "LO1/e;", "Landroidx/constraintlayout/compose/SolverState;", "LH1/d;", "density", "<init>", "(LH1/d;)V", "", "value", "", "c", "(Ljava/lang/Object;)I", "", "k", "()V", "LQ1/e;", "constraintWidget", "", "s", "(LQ1/e;)Z", "g", "LH1/d;", "getDensity", "()LH1/d;", "LH1/b;", "h", "J", "r", "()J", "u", "(J)V", "rootIncomingConstraints", "LH1/t;", "i", "LH1/t;", "q", "()LH1/t;", "t", "(LH1/t;)V", "layoutDirection", "", "j", "Ljava/util/List;", "getBaselineNeeded$compose_release", "()Ljava/util/List;", "baselineNeeded", "Z", "dirtyBaselineNeededWidgets", "", "l", "Ljava/util/Set;", "baselineNeededWidgets", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class B extends O1.e {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final H1.d density;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long rootIncomingConstraints;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public H1.t layoutDirection;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<Object> baselineNeeded;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean dirtyBaselineNeededWidgets;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Set<Q1.e> baselineNeededWidgets;

    public B(H1.d density) {
        Intrinsics.j(density, "density");
        this.density = density;
        this.rootIncomingConstraints = H1.c.b(0, 0, 0, 0, 15, null);
        this.baselineNeeded = new ArrayList();
        this.dirtyBaselineNeededWidgets = true;
        this.baselineNeededWidgets = new LinkedHashSet();
    }

    @Override // O1.e
    public int c(Object value) {
        return value instanceof H1.h ? this.density.E0(((H1.h) value).getValue()) : super.c(value);
    }

    @Override // O1.e
    public void k() {
        Q1.e eVarA;
        HashMap<Object, O1.d> mReferences = this.f23020a;
        Intrinsics.i(mReferences, "mReferences");
        Iterator<Map.Entry<Object, O1.d>> it = mReferences.entrySet().iterator();
        while (it.hasNext()) {
            O1.d value = it.next().getValue();
            if (value != null && (eVarA = value.a()) != null) {
                eVarA.i0();
            }
        }
        this.f23020a.clear();
        HashMap<Object, O1.d> mReferences2 = this.f23020a;
        Intrinsics.i(mReferences2, "mReferences");
        mReferences2.put(O1.e.f23019f, this.f23023d);
        this.baselineNeeded.clear();
        this.dirtyBaselineNeededWidgets = true;
        super.k();
    }

    public final H1.t q() {
        H1.t tVar = this.layoutDirection;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.x("layoutDirection");
        throw null;
    }

    /* renamed from: r, reason: from getter */
    public final long getRootIncomingConstraints() {
        return this.rootIncomingConstraints;
    }

    public final boolean s(Q1.e constraintWidget) {
        Intrinsics.j(constraintWidget, "constraintWidget");
        if (this.dirtyBaselineNeededWidgets) {
            this.baselineNeededWidgets.clear();
            Iterator<T> it = this.baselineNeeded.iterator();
            while (it.hasNext()) {
                O1.d dVar = this.f23020a.get(it.next());
                Q1.e eVarA = dVar == null ? null : dVar.a();
                if (eVarA != null) {
                    this.baselineNeededWidgets.add(eVarA);
                }
            }
            this.dirtyBaselineNeededWidgets = false;
        }
        return this.baselineNeededWidgets.contains(constraintWidget);
    }

    public final void t(H1.t tVar) {
        Intrinsics.j(tVar, "<set-?>");
        this.layoutDirection = tVar;
    }

    public final void u(long j10) {
        this.rootIncomingConstraints = j10;
    }
}
