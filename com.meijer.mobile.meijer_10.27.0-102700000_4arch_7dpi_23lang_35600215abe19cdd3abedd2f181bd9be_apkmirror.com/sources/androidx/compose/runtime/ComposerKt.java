package androidx.compose.runtime;

import androidx.compose.runtime.I0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0005\u001a'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0019\u001a\u00020\u0004*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001b\u001a\u00020\u0004*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001b\u0010\u001a\u001a%\u0010\u001f\u001a\u00020\u0004*\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a7\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$\"\b\b\u0000\u0010!*\u00020\u001d\"\b\b\u0001\u0010\"*\u00020\u001d2\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&\u001a!\u0010*\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+\u001a!\u0010,\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010+\u001a3\u00100\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b0\u00101\u001a+\u00104\u001a\u0004\u0018\u00010(*\b\u0012\u0004\u0012\u00020(0'2\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u00105\u001a#\u00106\u001a\u0004\u0018\u00010(*\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u00107\u001a)\u00108\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020(0'2\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109\u001a/\u0010:\u001a\b\u0012\u0004\u0012\u00020(0'*\b\u0012\u0004\u0012\u00020(0'2\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0013\u0010<\u001a\u00020\u0006*\u00020\nH\u0002¢\u0006\u0004\b<\u0010=\u001a\u0013\u0010>\u001a\u00020\n*\u00020\u0006H\u0002¢\u0006\u0004\b>\u0010?\u001a#\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0C*\u00020@2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bD\u0010E\u001a#\u0010H\u001a\u00020\u0006*\u00020F2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010I\u001a+\u0010M\u001a\u00020\u0006*\u00020F2\u0006\u0010J\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010N\u001a\u0017\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u00020\u0002H\u0000¢\u0006\u0004\bQ\u0010R\u001a\u0017\u0010S\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0002H\u0000¢\u0006\u0004\bS\u0010T\u001a5\u0010]\u001a\u00020\\2\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u00162\f\u0010[\u001a\b\u0012\u0002\b\u0003\u0018\u00010ZH\u0000¢\u0006\u0004\b]\u0010^\" \u0010c\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bJ\u0010_\u0012\u0004\bb\u0010\u0013\u001a\u0004\b`\u0010a\" \u0010f\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bK\u0010_\u0012\u0004\be\u0010\u0013\u001a\u0004\bd\u0010a\" \u0010j\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bg\u0010_\u0012\u0004\bi\u0010\u0013\u001a\u0004\bh\u0010a\" \u0010n\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bk\u0010_\u0012\u0004\bm\u0010\u0013\u001a\u0004\bl\u0010a\" \u0010r\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bo\u0010_\u0012\u0004\bq\u0010\u0013\u001a\u0004\bp\u0010a\" \u0010X\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bs\u0010_\u0012\u0004\bu\u0010\u0013\u001a\u0004\bt\u0010a\"\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020(0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010x\"\u0018\u0010|\u001a\u00020\u0006*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{\"\u0018\u0010\u007f\u001a\u00020\n*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~\"\u0019\u0010\u007f\u001a\u00020\n*\u00020F8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b!\u0010\u0080\u0001\"\u001c\u0010\u0084\u0001\u001a\u00020\u001d*\u00030\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "composer", "", "sourceInformation", "", "(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V", "", "key", "sourceInformationMarkerStart", "(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V", "", "M", "()Z", "dirty1", "dirty2", "info", "U", "(IIILjava/lang/String;)V", "T", "()V", "sourceInformationMarkerEnd", "(Landroidx/compose/runtime/Composer;)V", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "P", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "v", "index", "", "data", "Q", "(Landroidx/compose/runtime/SlotWriter;ILjava/lang/Object;)V", "K", "V", "initialCapacity", "LD0/b;", "N", "(I)LZ/W;", "", "Landroidx/compose/runtime/S;", "location", "A", "(Ljava/util/List;I)I", "z", "Landroidx/compose/runtime/I0;", "scope", "instance", "J", "(Ljava/util/List;ILandroidx/compose/runtime/I0;Ljava/lang/Object;)V", "start", "end", "B", "(Ljava/util/List;II)Landroidx/compose/runtime/S;", "R", "(Ljava/util/List;I)Landroidx/compose/runtime/S;", "S", "(Ljava/util/List;II)V", "y", "(Ljava/util/List;II)Ljava/util/List;", "q", "(Z)I", "p", "(I)Z", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/Anchor;", "anchor", "", "r", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;)Ljava/util/List;", "Landroidx/compose/runtime/W0;", "root", "w", "(Landroidx/compose/runtime/W0;II)I", "a", "b", "common", "O", "(Landroidx/compose/runtime/W0;III)I", "message", "", "u", "(Ljava/lang/String;)Ljava/lang/Void;", "t", "(Ljava/lang/String;)V", "Landroidx/compose/runtime/z;", "composition", "Landroidx/compose/runtime/g0;", "reference", "slots", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/f0;", "x", "(Landroidx/compose/runtime/z;Landroidx/compose/runtime/g0;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;)Landroidx/compose/runtime/f0;", "Ljava/lang/Object;", "D", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "G", "getProvider$annotations", "provider", "c", "C", "getCompositionLocalMap$annotations", "compositionLocalMap", "d", "getProviderValues", "getProviderValues$annotations", "providerValues", "e", "H", "getProviderMaps$annotations", "providerMaps", "f", "I", "getReference$annotations", "Ljava/util/Comparator;", "g", "Ljava/util/Comparator;", "InvalidationLocationAscending", "F", "(Landroidx/compose/runtime/SlotWriter;)I", "nextGroup", "L", "(Landroidx/compose/runtime/SlotWriter;)Z", "isAfterFirstChild", "(Landroidx/compose/runtime/W0;)Z", "Landroidx/compose/runtime/V;", "E", "(Landroidx/compose/runtime/V;)Ljava/lang/Object;", "joinedKey", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComposerKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f49962a = new OpaqueKey("provider");

    /* renamed from: b, reason: collision with root package name */
    private static final Object f49963b = new OpaqueKey("provider");

    /* renamed from: c, reason: collision with root package name */
    private static final Object f49964c = new OpaqueKey("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    private static final Object f49965d = new OpaqueKey("providerValues");

    /* renamed from: e, reason: collision with root package name */
    private static final Object f49966e = new OpaqueKey("providers");

    /* renamed from: f, reason: collision with root package name */
    private static final Object f49967f = new OpaqueKey("reference");

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator<S> f49968g = new Comparator() { // from class: androidx.compose.runtime.i
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComposerKt.b((S) obj, (S) obj2);
        }
    };

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/compose/runtime/ComposerKt$a", "Landroidx/compose/runtime/K0;", "Landroidx/compose/runtime/I0;", "scope", "", "instance", "Landroidx/compose/runtime/T;", "k", "(Landroidx/compose/runtime/I0;Ljava/lang/Object;)Landroidx/compose/runtime/T;", "", "h", "(Landroidx/compose/runtime/I0;)V", "value", "a", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements K0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5756z f49969a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5720g0 f49970b;

        @Override // androidx.compose.runtime.K0
        public void a(Object value) {
        }

        @Override // androidx.compose.runtime.K0
        public void h(I0 scope) {
        }

        a(InterfaceC5756z interfaceC5756z, C5720g0 c5720g0) {
            this.f49969a = interfaceC5756z;
            this.f49970b = c5720g0;
        }

        @Override // androidx.compose.runtime.K0
        public T k(I0 scope, Object instance) {
            T tK;
            InterfaceC5756z interfaceC5756z = this.f49969a;
            K0 k02 = interfaceC5756z instanceof K0 ? (K0) interfaceC5756z : null;
            if (k02 == null || (tK = k02.k(scope, instance)) == null) {
                tK = T.f50152a;
            }
            if (tK != T.f50152a) {
                return tK;
            }
            C5720g0 c5720g0 = this.f49970b;
            c5720g0.i(CollectionsKt.Q0(c5720g0.d(), TuplesKt.a(scope, instance)));
            return T.f50153b;
        }
    }

    public static final boolean M() {
        return false;
    }

    public static final void T() {
    }

    public static final void U(int i10, int i11, int i12, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(boolean z10) {
        return z10 ? 1 : 0;
    }

    private static final int w(SlotReader w02, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = w02.P(i10);
            i12++;
        }
        return i12;
    }

    public static final Object C() {
        return f49964c;
    }

    public static final Object D() {
        return f49962a;
    }

    public static final Object G() {
        return f49963b;
    }

    public static final Object H() {
        return f49966e;
    }

    public static final Object I() {
        return f49967f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Z.W<Object, Object> N(int i10) {
        return D0.b.d(new Z.W(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(SlotReader w02, int i10, int i11, int i12) {
        if (i10 != i11) {
            if (i10 == i12 || i11 == i12) {
                return i12;
            }
            if (w02.P(i10) == i11) {
                return i11;
            }
            if (w02.P(i11) != i10) {
                if (w02.P(i10) == w02.P(i11)) {
                    return w02.P(i10);
                }
                int iW = w(w02, i10, i12);
                int iW2 = w(w02, i11, i12);
                int i13 = iW - iW2;
                for (int i14 = 0; i14 < i13; i14++) {
                    i10 = w02.P(i10);
                }
                int i15 = iW2 - iW;
                for (int i16 = 0; i16 < i15; i16++) {
                    i11 = w02.P(i11);
                }
                while (i10 != i11) {
                    i10 = w02.P(i10);
                    i11 = w02.P(i11);
                }
                return i10;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> r(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader w0B = slotTable.B();
        try {
            s(w0B, arrayList, slotTable.f(anchor));
            Unit unit = Unit.f142422a;
            return arrayList;
        } finally {
            w0B.d();
        }
    }

    public static final void t(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void u(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final C5718f0 x(InterfaceC5756z interfaceC5756z, C5720g0 c5720g0, SlotWriter slotWriter, Applier<?> applier) {
        SlotTable slotTable = new SlotTable();
        if (slotWriter.b0()) {
            slotTable.o();
        }
        if (slotWriter.a0()) {
            slotTable.n();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        if (applier != null && slotWriter.E0(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.t0(parent)) {
                parent = slotWriter.parent(parent);
            }
            if (parent >= 0 && slotWriter.t0(parent)) {
                Object objNode = slotWriter.node(parent);
                int i10 = parent + 1;
                int iGroupSize = parent + slotWriter.groupSize(parent);
                int iE0 = 0;
                while (i10 < iGroupSize) {
                    int iGroupSize2 = slotWriter.groupSize(i10) + i10;
                    if (iGroupSize2 > currentGroup) {
                        break;
                    }
                    iE0 += slotWriter.t0(i10) ? 1 : slotWriter.E0(i10);
                    i10 = iGroupSize2;
                }
                int iE02 = slotWriter.t0(currentGroup) ? 1 : slotWriter.E0(currentGroup);
                applier.down(objNode);
                applier.remove(iE0, iE02);
                applier.up();
            }
        }
        SlotWriter slotWriterC = slotTable.C();
        try {
            slotWriterC.H();
            slotWriterC.j1(126665345, c5720g0.c());
            SlotWriter.v0(slotWriterC, 0, 1, null);
            slotWriterC.o1(c5720g0.getParameter());
            List<Anchor> listC0 = slotWriter.C0(c5720g0.getAnchor(), 1, slotWriterC);
            slotWriterC.Y0();
            slotWriterC.T();
            slotWriterC.U();
            slotWriterC.L(true);
            C5718f0 c5718f0 = new C5718f0(slotTable);
            I0.Companion companion = I0.INSTANCE;
            if (!companion.b(slotTable, listC0)) {
                return c5718f0;
            }
            a aVar = new a(interfaceC5756z, c5720g0);
            slotWriterC = slotTable.C();
            try {
                companion.a(slotWriterC, listC0, aVar);
                Unit unit = Unit.f142422a;
                slotWriterC.L(true);
                return c5718f0;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<S> y(List<S> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int iZ = z(list, i10); iZ < list.size(); iZ++) {
            S s10 = list.get(iZ);
            if (s10.getLocation() >= i11) {
                break;
            }
            arrayList.add(s10);
        }
        return arrayList;
    }

    private static final int A(List<S> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iK = Intrinsics.k(list.get(i12).getLocation(), i10);
            if (iK < 0) {
                i11 = i12 + 1;
            } else if (iK > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S B(List<S> list, int i10, int i11) {
        int iZ = z(list, i10);
        if (iZ < list.size()) {
            S s10 = list.get(iZ);
            if (s10.getLocation() < i11) {
                return s10;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object E(V v10) {
        if (v10.getObjectKey() != null) {
            return new JoinedKey(Integer.valueOf(v10.getKey()), v10.getObjectKey());
        }
        return Integer.valueOf(v10.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(List<S> list, int i10, I0 i02, Object obj) {
        int iA = A(list, i10);
        if (iA < 0) {
            int i11 = -(iA + 1);
            if (!(obj instanceof B)) {
                obj = null;
            }
            list.add(i11, new S(i02, i10, obj));
            return;
        }
        S s10 = list.get(iA);
        if (obj instanceof B) {
            Object objA = s10.getInstances();
            if (objA == null) {
                s10.e(obj);
                return;
            } else if (objA instanceof Z.X) {
                ((Z.X) objA).h(obj);
                return;
            } else {
                s10.e(Z.k0.b(objA, obj));
                return;
            }
        }
        s10.e(null);
    }

    public static final boolean K(SlotReader w02) {
        if (w02.getCurrent() > w02.getParent() + 1) {
            return true;
        }
        return false;
    }

    public static final boolean L(SlotWriter slotWriter) {
        if (slotWriter.getCurrentGroup() > slotWriter.getParent() + 1) {
            return true;
        }
        return false;
    }

    public static final void P(SlotWriter slotWriter, RememberManager rememberManager) {
        int iH0;
        int iQ = slotWriter.Q(slotWriter.groups, slotWriter.k0(slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup())));
        for (int iQ2 = slotWriter.Q(slotWriter.groups, slotWriter.k0(slotWriter.getCurrentGroup())); iQ2 < iQ; iQ2++) {
            Object obj = slotWriter.slots[slotWriter.R(iQ2)];
            int iE = -1;
            if (obj instanceof InterfaceC5719g) {
                rememberManager.b((InterfaceC5719g) obj, slotWriter.h0() - iQ2, -1, -1);
            }
            if (obj instanceof O0) {
                int iH02 = slotWriter.h0() - iQ2;
                O0 o02 = (O0) obj;
                Anchor after = o02.getAfter();
                if (after != null && after.b()) {
                    iE = slotWriter.E(after);
                    iH0 = slotWriter.h0() - slotWriter.e1(iE);
                } else {
                    iH0 = -1;
                }
                rememberManager.d(o02, iH02, iE, iH0);
            }
            if (obj instanceof I0) {
                ((I0) obj).A();
            }
        }
        slotWriter.P0();
    }

    private static final void Q(SlotWriter slotWriter, int i10, Object obj) {
        boolean z10;
        Object objJ = slotWriter.J(i10);
        if (obj == objJ) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            t("Slot table is out of sync (expected " + obj + ", got " + objJ + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S R(List<S> list, int i10) {
        int iA = A(list, i10);
        if (iA >= 0) {
            return list.remove(iA);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(List<S> list, int i10, int i11) {
        int iZ = z(list, i10);
        while (iZ < list.size() && list.get(iZ).getLocation() < i11) {
            list.remove(iZ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(S s10, S s11) {
        return Intrinsics.k(s10.getLocation(), s11.getLocation());
    }

    private static final void s(SlotReader w02, List<Object> list, int i10) {
        if (w02.J(i10)) {
            list.add(w02.L(i10));
            return;
        }
        int iE = i10 + 1;
        int iE2 = i10 + w02.E(i10);
        while (iE < iE2) {
            s(w02, list, iE);
            iE += w02.E(iE);
        }
    }

    public static final void sourceInformation(Composer composer, String str) {
        composer.J(str);
    }

    public static final void sourceInformationMarkerEnd(Composer composer) {
        composer.S();
    }

    public static final void sourceInformationMarkerStart(Composer composer, int i10, String str) {
        composer.L(i10, str);
    }

    public static final void v(SlotWriter slotWriter, RememberManager rememberManager) {
        int iH0;
        int iQ = slotWriter.Q(slotWriter.groups, slotWriter.k0(slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup())));
        for (int iQ2 = slotWriter.Q(slotWriter.groups, slotWriter.k0(slotWriter.getCurrentGroup())); iQ2 < iQ; iQ2++) {
            Object obj = slotWriter.slots[slotWriter.R(iQ2)];
            int iE = -1;
            if (obj instanceof InterfaceC5719g) {
                rememberManager.g((InterfaceC5719g) obj, slotWriter.h0() - iQ2, -1, -1);
            } else if (obj instanceof O0) {
                O0 o02 = (O0) obj;
                if (!(o02.getWrapped() instanceof R0)) {
                    Q(slotWriter, iQ2, obj);
                    int iH02 = slotWriter.h0() - iQ2;
                    Anchor after = o02.getAfter();
                    if (after != null && after.b()) {
                        iE = slotWriter.E(after);
                        iH0 = slotWriter.h0() - slotWriter.e1(iE);
                    } else {
                        iH0 = -1;
                    }
                    rememberManager.d(o02, iH02, iE, iH0);
                }
            } else if (obj instanceof I0) {
                Q(slotWriter, iQ2, obj);
                ((I0) obj).A();
            }
        }
    }

    private static final int z(List<S> list, int i10) {
        int iA = A(list, i10);
        if (iA < 0) {
            return -(iA + 1);
        }
        return iA;
    }
}
