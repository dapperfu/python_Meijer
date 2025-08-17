package Jv;

import Fv.m;
import Iv.AbstractC3761b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"LJv/H;", "LJv/c;", "LIv/b;", "json", "LIv/C;", "value", "", "polymorphicDiscriminator", "LFv/f;", "polyDescriptor", "<init>", "(LIv/b;LIv/C;Ljava/lang/String;LFv/f;)V", "descriptor", "", "index", "tag", "", "A0", "(LFv/f;ILjava/lang/String;)Z", "z0", "(LFv/f;I)Z", "v", "(LFv/f;)I", "B", "()Z", "d0", "(LFv/f;I)Ljava/lang/String;", "LIv/i;", "j0", "(Ljava/lang/String;)LIv/i;", "LGv/c;", "c", "(LFv/f;)LGv/c;", "", "a", "(LFv/f;)V", "g", "LIv/C;", "B0", "()LIv/C;", "h", "LFv/f;", "i", "I", "position", "j", "Z", "forceNull", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
class H extends AbstractC3920c {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Iv.C value;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Fv.f polyDescriptor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int position;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean forceNull;

    public /* synthetic */ H(AbstractC3761b abstractC3761b, Iv.C c10, String str, Fv.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3761b, c10, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : fVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(AbstractC3761b json, Iv.C value, String str, Fv.f fVar) {
        super(json, value, str, null);
        Intrinsics.j(json, "json");
        Intrinsics.j(value, "value");
        this.value = value;
        this.polyDescriptor = fVar;
    }

    @Override // Jv.AbstractC3920c, Gv.e
    public boolean B() {
        return !this.forceNull && super.B();
    }

    @Override // Jv.AbstractC3920c
    /* renamed from: B0, reason: from getter and merged with bridge method [inline-methods] */
    public Iv.C getValue() {
        return this.value;
    }

    @Override // Jv.AbstractC3920c, Gv.c
    public void a(Fv.f descriptor) {
        Set<String> setL;
        Intrinsics.j(descriptor, "descriptor");
        if (this.configuration.getIgnoreUnknownKeys() || (descriptor.getKind() instanceof Fv.d)) {
            return;
        }
        C.k(descriptor, getJson());
        if (this.configuration.getUseAlternativeNames()) {
            Set<String> setA = Hv.F.a(descriptor);
            Map map = (Map) Iv.G.a(getJson()).a(descriptor, C.g());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = SetsKt.e();
            }
            setL = SetsKt.l(setA, setKeySet);
        } else {
            setL = Hv.F.a(descriptor);
        }
        for (String str : w0().keySet()) {
            if (!setL.contains(str) && !Intrinsics.e(str, getPolymorphicDiscriminator())) {
                throw A.f(str, w0().toString());
            }
        }
    }

    @Override // Jv.AbstractC3920c, Gv.e
    public Gv.c c(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        if (descriptor != this.polyDescriptor) {
            return super.c(descriptor);
        }
        AbstractC3761b json = getJson();
        Iv.i iVarK0 = k0();
        String serialName = this.polyDescriptor.getSerialName();
        if (iVarK0 instanceof Iv.C) {
            return new H(json, (Iv.C) iVarK0, getPolymorphicDiscriminator(), this.polyDescriptor);
        }
        throw A.e(-1, "Expected " + Reflection.b(Iv.C.class).u() + ", but had " + Reflection.b(iVarK0.getClass()).u() + " as the serialized body of " + serialName + " at element: " + g0(), iVarK0.toString());
    }

    @Override // Hv.O
    protected String d0(Fv.f descriptor, int index) {
        Object next;
        Intrinsics.j(descriptor, "descriptor");
        C.k(descriptor, getJson());
        String strJ = descriptor.j(index);
        if (!this.configuration.getUseAlternativeNames() || w0().keySet().contains(strJ)) {
            return strJ;
        }
        Map<String, Integer> mapE = C.e(getJson(), descriptor);
        Iterator<T> it = w0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = mapE.get((String) next);
            if (num != null && num.intValue() == index) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strJ;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Jv.AbstractC3920c
    public Iv.i j0(String tag) {
        Intrinsics.j(tag, "tag");
        return (Iv.i) MapsKt.l(w0(), tag);
    }

    @Override // Gv.c
    public int v(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        while (this.position < descriptor.getElementsCount()) {
            int i10 = this.position;
            this.position = i10 + 1;
            String strX = X(descriptor, i10);
            int i11 = this.position - 1;
            this.forceNull = false;
            if (w0().containsKey(strX) || z0(descriptor, i11)) {
                if (!this.configuration.getCoerceInputValues() || !A0(descriptor, i11, strX)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    private final boolean A0(Fv.f descriptor, int index, String tag) {
        Iv.E e10;
        boolean z10;
        AbstractC3761b json = getJson();
        boolean zN = descriptor.n(index);
        Fv.f fVarL = descriptor.l(index);
        if (zN && !fVarL.g() && (j0(tag) instanceof Iv.z)) {
            return true;
        }
        if (!Intrinsics.e(fVarL.getKind(), m.b.f11132a) || (fVarL.g() && (j0(tag) instanceof Iv.z))) {
            return false;
        }
        Iv.i iVarJ0 = j0(tag);
        String strD = null;
        if (iVarJ0 instanceof Iv.E) {
            e10 = (Iv.E) iVarJ0;
        } else {
            e10 = null;
        }
        if (e10 != null) {
            strD = Iv.j.d(e10);
        }
        if (strD == null) {
            return false;
        }
        int i10 = C.i(fVarL, json, strD);
        if (!json.getConfiguration().getExplicitNulls() && fVarL.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == -3 && (zN || z10)) {
            return true;
        }
        return false;
    }

    private final boolean z0(Fv.f descriptor, int index) {
        boolean z10;
        if (!getJson().getConfiguration().getExplicitNulls() && !descriptor.n(index) && descriptor.l(index).g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.forceNull = z10;
        return z10;
    }
}
