package S0;

import H1.r;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.A0;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.C;
import androidx.compose.ui.node.C0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.InterfaceC5956j;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00032\u00020\u0004:\u0001:BD\u0012!\b\u0002\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u001bR/\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R(\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0014R\u0014\u00108\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"LS0/d;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/B0;", "", "LS0/f;", "Lkotlin/Function2;", "LU0/f;", "", "Lkotlin/ExtensionFunctionType;", "onStartTransfer", "Lkotlin/Function1;", "LS0/b;", "onDropTargetValidate", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "u2", "()V", "LH1/r;", "size", "f", "(J)V", "startEvent", "", "K2", "(LS0/b;)Z", "event", "w0", "(LS0/b;)V", "m1", "r0", "j0", "y1", "T0", "o", "Lkotlin/jvm/functions/Function2;", "p", "Lkotlin/jvm/functions/Function1;", "q", "Ljava/lang/Object;", "Y", "()Ljava/lang/Object;", "traverseKey", "r", "LS0/d;", "lastChildDragAndDropModifierNode", "s", "LS0/f;", "thisDragAndDropTarget", "t", "J", "R2", "()J", "setSize-ozmzZPI$ui_release", "LS0/c;", "Q2", "()LS0/c;", "dragAndDropManager", "u", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d extends Modifier.c implements B0, InterfaceC5956j, f, C {

    /* renamed from: u, reason: collision with root package name */
    private static final a f34293u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f34294v = 8;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function2<Object, ? super U0.f, Unit> onStartTransfer;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Function1<S0.b, f> onDropTargetValidate;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private d lastChildDragAndDropModifierNode;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private f thisDragAndDropTarget;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long size;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LS0/d$a;", "", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LS0/d$a$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: S0.d$a$a, reason: collision with other inner class name */
        private static final class C0759a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0759a f34301a = new C0759a();

            private C0759a() {
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LS0/d;", "currentNode", "Landroidx/compose/ui/node/A0;", "a", "(LS0/d;)Landroidx/compose/ui/node/A0;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<d, A0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S0.b f34302f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f34303g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f34304h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(S0.b bVar, d dVar, Ref.BooleanRef booleanRef) {
            super(1);
            this.f34302f = bVar;
            this.f34303g = dVar;
            this.f34304h = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A0 invoke(d dVar) {
            boolean z10;
            f fVar;
            boolean z11;
            if (!dVar.getIsAttached()) {
                return A0.f51385b;
            }
            boolean z12 = false;
            if (dVar.thisDragAndDropTarget == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                C14920a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            Function1 function1 = dVar.onDropTargetValidate;
            if (function1 != null) {
                fVar = (f) function1.invoke(this.f34302f);
            } else {
                fVar = null;
            }
            dVar.thisDragAndDropTarget = fVar;
            if (dVar.thisDragAndDropTarget != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f34303g.Q2().a(dVar);
            }
            Ref.BooleanRef booleanRef = this.f34304h;
            if (booleanRef.f143735a || z11) {
                z12 = true;
            }
            booleanRef.f143735a = z12;
            return A0.f51384a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LS0/d;", "currentNode", "Landroidx/compose/ui/node/A0;", "a", "(LS0/d;)Landroidx/compose/ui/node/A0;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<d, A0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S0.b f34305f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(S0.b bVar) {
            super(1);
            this.f34305f = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A0 invoke(d dVar) {
            if (dVar.getNode().getIsAttached()) {
                f fVar = dVar.thisDragAndDropTarget;
                if (fVar != null) {
                    fVar.T0(this.f34305f);
                }
                dVar.thisDragAndDropTarget = null;
                dVar.lastChildDragAndDropModifierNode = null;
                return A0.f51384a;
            }
            return A0.f51385b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/B0;", "T", "child", "Landroidx/compose/ui/node/A0;", "a", "(Landroidx/compose/ui/node/B0;)Landroidx/compose/ui/node/A0;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: S0.d$d, reason: collision with other inner class name */
    public static final class C0760d extends Lambda implements Function1<d, A0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f34306f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f34307g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ S0.b f34308h;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A0 invoke(d dVar) {
            d dVar2 = dVar;
            if (!this.f34307g.Q2().b(dVar2) || !e.d(dVar2, h.a(this.f34308h))) {
                return A0.f51384a;
            }
            this.f34306f.f143742a = dVar;
            return A0.f51386c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0760d(Ref.ObjectRef objectRef, d dVar, S0.b bVar) {
            super(1);
            this.f34306f = objectRef;
            this.f34307g = dVar;
            this.f34308h = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    public /* synthetic */ d(Function2 function2, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function2, (i10 & 2) != 0 ? null : function1);
    }

    public boolean K2(S0.b startEvent) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        e.f(this, new b(startEvent, this, booleanRef));
        return booleanRef.f143735a;
    }

    /* renamed from: R2, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // S0.f
    public void T0(S0.b event) {
        e.f(this, new c(event));
    }

    @Override // androidx.compose.ui.node.B0
    /* renamed from: Y, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.node.C
    public void f(long size) {
        this.size = size;
    }

    @Override // S0.f
    public void j0(S0.b event) {
        f fVar = this.thisDragAndDropTarget;
        if (fVar != null) {
            fVar.j0(event);
        }
        d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            dVar.j0(event);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // S0.f
    public void m1(S0.b event) {
        f fVar = this.thisDragAndDropTarget;
        if (fVar != null) {
            fVar.m1(event);
            return;
        }
        d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            dVar.m1(event);
        }
    }

    @Override // S0.f
    public void r0(S0.b event) {
        B0 b02;
        d dVar;
        d dVar2 = this.lastChildDragAndDropModifierNode;
        if (dVar2 == null || !e.d(dVar2, h.a(event))) {
            if (getNode().getIsAttached()) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                C0.f(this, new C0760d(objectRef, this, event));
                b02 = (B0) objectRef.f143742a;
            } else {
                b02 = null;
            }
            dVar = (d) b02;
        } else {
            dVar = dVar2;
        }
        if (dVar != null && dVar2 == null) {
            e.e(dVar, event);
            f fVar = this.thisDragAndDropTarget;
            if (fVar != null) {
                fVar.j0(event);
            }
        } else if (dVar == null && dVar2 != null) {
            f fVar2 = this.thisDragAndDropTarget;
            if (fVar2 != null) {
                e.e(fVar2, event);
            }
            dVar2.j0(event);
        } else if (!Intrinsics.e(dVar, dVar2)) {
            if (dVar != null) {
                e.e(dVar, event);
            }
            if (dVar2 != null) {
                dVar2.j0(event);
            }
        } else if (dVar != null) {
            dVar.r0(event);
        } else {
            f fVar3 = this.thisDragAndDropTarget;
            if (fVar3 != null) {
                fVar3.r0(event);
            }
        }
        this.lastChildDragAndDropModifierNode = dVar;
    }

    @Override // S0.f
    public void w0(S0.b event) {
        f fVar = this.thisDragAndDropTarget;
        if (fVar != null) {
            fVar.w0(event);
            return;
        }
        d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            dVar.w0(event);
        }
    }

    @Override // S0.f
    public boolean y1(S0.b event) {
        d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            return dVar.y1(event);
        }
        f fVar = this.thisDragAndDropTarget;
        if (fVar != null) {
            return fVar.y1(event);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Function2<Object, ? super U0.f, Unit> function2, Function1<? super S0.b, ? extends f> function1) {
        this.onStartTransfer = function2;
        this.onDropTargetValidate = function1;
        this.traverseKey = a.C0759a.f34301a;
        this.size = r.INSTANCE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S0.c Q2() {
        return C5957k.p(this).getDragAndDropManager();
    }
}
