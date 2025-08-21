package L1;

import O1.e;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\f\b'\u0018\u00002\u00020\u0001:\u0003\r\u0016\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J.\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010#\u001a\u00020\"2\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d\"\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J+\u0010%\u001a\u00020\u00102\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d\"\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b%\u0010&R,\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00120'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R(\u00100\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010,\u0012\u0004\b/\u0010\u0003\u001a\u0004\b-\u0010\n\"\u0004\b.\u0010\bR\u0014\u00101\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010,¨\u00063"}, d2 = {"LL1/k;", "", "<init>", "()V", "", "value", "", "j", "(I)V", "d", "()I", "LL1/B;", "state", "a", "(LL1/B;)V", "i", "LL1/E;", "ref", "Lkotlin/Function1;", "LL1/F;", "Lkotlin/ExtensionFunctionType;", "constrainBlock", "b", "(LL1/E;Lkotlin/jvm/functions/Function1;)LL1/F;", "", "fraction", "LL1/k$c;", "c", "(F)LL1/k$c;", "", "LL1/h;", "elements", "LL1/f;", "chainStyle", "LL1/y;", "e", "([LL1/h;LL1/f;)LL1/y;", "f", "([LL1/h;LL1/f;)LL1/E;", "", "Ljava/util/List;", "h", "()Ljava/util/List;", "tasks", "I", "g", "setHelpersHashCode", "getHelpersHashCode$annotations", "helpersHashCode", "HelpersStartId", "helperId", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int helpersHashCode;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Function1<B, Unit>> tasks = new ArrayList();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int HelpersStartId = 1000;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int helperId = 1000;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LL1/k$a;", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getId$compose_release", "()Ljava/lang/Object;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: L1.k$a, reason: from toString */
    public static final /* data */ class BaselineAnchor {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object id;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BaselineAnchor) && Intrinsics.e(this.id, ((BaselineAnchor) other).id);
        }

        public BaselineAnchor(Object id2) {
            Intrinsics.j(id2, "id");
            this.id = id2;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.id + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"LL1/k$b;", "", PreferencesHelper.PREF_ID, "", "index", "<init>", "(Ljava/lang/Object;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "I", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: L1.k$b, reason: from toString */
    public static final /* data */ class HorizontalAnchor {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int index;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) other;
            return Intrinsics.e(this.id, horizontalAnchor.id) && this.index == horizontalAnchor.index;
        }

        public HorizontalAnchor(Object id2, int i10) {
            Intrinsics.j(id2, "id");
            this.id = id2;
            this.index = i10;
        }

        /* renamed from: a, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.id + ", index=" + this.index + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"LL1/k$c;", "", PreferencesHelper.PREF_ID, "", "index", "<init>", "(Ljava/lang/Object;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "I", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: L1.k$c, reason: from toString */
    public static final /* data */ class VerticalAnchor {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int index;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) other;
            return Intrinsics.e(this.id, verticalAnchor.id) && this.index == verticalAnchor.index;
        }

        public VerticalAnchor(Object id2, int i10) {
            Intrinsics.j(id2, "id");
            this.id = id2;
            this.index = i10;
        }

        /* renamed from: a, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.id + ", index=" + this.index + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL1/B;", "state", "", "<anonymous>", "(LL1/B;)V"}, k = 3, mv = {1, 5, 1})
    static final class d extends Lambda implements Function1<B, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f17894f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f17895g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, float f10) {
            super(1);
            this.f17894f = i10;
            this.f17895g = f10;
        }

        public final void a(B state) {
            Intrinsics.j(state, "state");
            P1.f fVarO = state.o(Integer.valueOf(this.f17894f));
            float f10 = this.f17895g;
            if (state.q() == H1.t.f13338a) {
                fVarO.e(f10);
            } else {
                fVarO.e(1.0f - f10);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(B b10) {
            a(b10);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL1/B;", "state", "", "<anonymous>", "(LL1/B;)V"}, k = 3, mv = {1, 5, 1})
    static final class e extends Lambda implements Function1<B, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f17896f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h[] f17897g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C4009f f17898h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, h[] hVarArr, C4009f c4009f) {
            super(1);
            this.f17896f = i10;
            this.f17897g = hVarArr;
            this.f17898h = c4009f;
        }

        public final void a(B state) {
            Intrinsics.j(state, "state");
            O1.c cVarH = state.h(Integer.valueOf(this.f17896f), e.EnumC0378e.HORIZONTAL_CHAIN);
            if (cVarH == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.HorizontalChainReference");
            }
            P1.g gVar = (P1.g) cVarH;
            h[] hVarArr = this.f17897g;
            ArrayList arrayList = new ArrayList(hVarArr.length);
            for (h hVar : hVarArr) {
                arrayList.add(hVar.getId());
            }
            Object[] array = arrayList.toArray(new Object[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            gVar.Z(Arrays.copyOf(array, array.length));
            gVar.b0(this.f17898h.getStyle());
            gVar.apply();
            if (this.f17898h.getBias() != null) {
                state.b(this.f17897g[0].getId()).y(this.f17898h.getBias().floatValue());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(B b10) {
            a(b10);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL1/B;", "state", "", "<anonymous>", "(LL1/B;)V"}, k = 3, mv = {1, 5, 1})
    static final class f extends Lambda implements Function1<B, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f17899f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h[] f17900g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C4009f f17901h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, h[] hVarArr, C4009f c4009f) {
            super(1);
            this.f17899f = i10;
            this.f17900g = hVarArr;
            this.f17901h = c4009f;
        }

        public final void a(B state) {
            Intrinsics.j(state, "state");
            O1.c cVarH = state.h(Integer.valueOf(this.f17899f), e.EnumC0378e.VERTICAL_CHAIN);
            if (cVarH == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.VerticalChainReference");
            }
            P1.h hVar = (P1.h) cVarH;
            h[] hVarArr = this.f17900g;
            ArrayList arrayList = new ArrayList(hVarArr.length);
            for (h hVar2 : hVarArr) {
                arrayList.add(hVar2.getId());
            }
            Object[] array = arrayList.toArray(new Object[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            hVar.Z(Arrays.copyOf(array, array.length));
            hVar.b0(this.f17901h.getStyle());
            hVar.apply();
            if (this.f17901h.getBias() != null) {
                state.b(this.f17900g[0].getId()).W(this.f17901h.getBias().floatValue());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(B b10) {
            a(b10);
            return Unit.f143329a;
        }
    }

    private final int d() {
        int i10 = this.helperId;
        this.helperId = i10 + 1;
        return i10;
    }

    private final void j(int value) {
        this.helpersHashCode = ((this.helpersHashCode * 1009) + value) % 1000000007;
    }

    public final void a(B state) {
        Intrinsics.j(state, "state");
        Iterator<T> it = this.tasks.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(state);
        }
    }

    public final F b(E ref, Function1<? super F, Unit> constrainBlock) {
        Intrinsics.j(ref, "ref");
        Intrinsics.j(constrainBlock, "constrainBlock");
        F f10 = new F(ref.getId());
        constrainBlock.invoke(f10);
        h().addAll(f10.c());
        return f10;
    }

    public final y e(h[] elements, C4009f chainStyle) {
        Intrinsics.j(elements, "elements");
        Intrinsics.j(chainStyle, "chainStyle");
        int iD = d();
        this.tasks.add(new e(iD, elements, chainStyle));
        j(16);
        for (h hVar : elements) {
            j(hVar.hashCode());
        }
        j(chainStyle.hashCode());
        return new y(Integer.valueOf(iD));
    }

    public final E f(h[] elements, C4009f chainStyle) {
        Intrinsics.j(elements, "elements");
        Intrinsics.j(chainStyle, "chainStyle");
        int iD = d();
        this.tasks.add(new f(iD, elements, chainStyle));
        j(17);
        for (h hVar : elements) {
            j(hVar.hashCode());
        }
        j(chainStyle.hashCode());
        return new E(Integer.valueOf(iD));
    }

    /* renamed from: g, reason: from getter */
    public final int getHelpersHashCode() {
        return this.helpersHashCode;
    }

    protected final List<Function1<B, Unit>> h() {
        return this.tasks;
    }

    public void i() {
        this.tasks.clear();
        this.helperId = this.HelpersStartId;
        this.helpersHashCode = 0;
    }

    public final VerticalAnchor c(float fraction) {
        int iD = d();
        this.tasks.add(new d(iD, fraction));
        j(3);
        j(Float.hashCode(fraction));
        return new VerticalAnchor(Integer.valueOf(iD), 0);
    }
}
