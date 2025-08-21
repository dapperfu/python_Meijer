package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.InterfaceC5923h;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.InterfaceC5956j;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\u001a>\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a:\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a:\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a.\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a2\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001d\u001a\u0013\u0010\"\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a\u0013\u0010%\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/f;", "direction", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "t", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "focusedItem", "l", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/geometry/Rect;ILkotlin/jvm/functions/Function1;)Z", "r", "Landroidx/compose/ui/node/j;", "LD0/c;", "accessibleChildren", "", "i", "(Landroidx/compose/ui/node/j;LD0/c;)V", "focusRect", "j", "(LD0/c;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetNode;", "proposedCandidate", "currentCandidate", "focusedRect", "m", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "source", "rect1", "rect2", "c", "s", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "h", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class P {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[F.values().length];
            try {
                iArr[F.f50801b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F.f50800a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F.f50802c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[F.f50803d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/h$a;", "", "a", "(Landroidx/compose/ui/layout/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<InterfaceC5923h.a, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f50856f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ J f50857g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f50858h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f50859i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Rect f50860j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f50861k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<FocusTargetNode, Boolean> f50862l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i10, J j10, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, Rect rect, int i11, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.f50856f = i10;
            this.f50857g = j10;
            this.f50858h = focusTargetNode;
            this.f50859i = focusTargetNode2;
            this.f50860j = rect;
            this.f50861k = i11;
            this.f50862l = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC5923h.a aVar) {
            if (this.f50856f != this.f50857g.getGeneration() || (P0.h.isTrackFocusEnabled && this.f50858h != C5957k.p(this.f50859i).getFocusOwner().h())) {
                return Boolean.TRUE;
            }
            boolean zR = P.r(this.f50859i, this.f50860j, this.f50861k, this.f50862l);
            Boolean boolValueOf = Boolean.valueOf(zR);
            if (zR || !aVar.getHasMoreContent()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final boolean d(Rect rect, int i10, Rect rect2) {
        C5905f.Companion companion = C5905f.INSTANCE;
        if (C5905f.l(i10, companion.d()) ? true : C5905f.l(i10, companion.g())) {
            return rect.i() > rect2.getTop() && rect.getTop() < rect2.i();
        }
        if (C5905f.l(i10, companion.h()) ? true : C5905f.l(i10, companion.a())) {
            return rect.l() > rect2.getLeft() && rect.getLeft() < rect2.l();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean e(Rect rect, int i10, Rect rect2) {
        C5905f.Companion companion = C5905f.INSTANCE;
        if (C5905f.l(i10, companion.d())) {
            return rect2.getLeft() >= rect.l();
        }
        if (C5905f.l(i10, companion.g())) {
            return rect2.l() <= rect.getLeft();
        }
        if (C5905f.l(i10, companion.h())) {
            return rect2.getTop() >= rect.i();
        }
        if (C5905f.l(i10, companion.a())) {
            return rect2.i() <= rect.getTop();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float f(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.f$a r0 = androidx.compose.ui.focus.C5905f.INSTANCE
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.C5905f.l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.getLeft()
            float r2 = r2.l()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.C5905f.l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.getLeft()
            float r3 = r4.l()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.C5905f.l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.getTop()
            float r2 = r2.i()
            goto L14
        L3e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.C5905f.l(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.getTop()
            float r3 = r4.i()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            return r2
        L57:
            return r3
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.P.f(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float g(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.f$a r0 = androidx.compose.ui.focus.C5905f.INSTANCE
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.C5905f.l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.getLeft()
            float r2 = r2.getLeft()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.C5905f.l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.l()
            float r3 = r4.l()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.C5905f.l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.getTop()
            float r2 = r2.getTop()
            goto L14
        L3e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.C5905f.l(r3, r0)
            if (r3 == 0) goto L59
            float r2 = r2.i()
            float r3 = r4.i()
            goto L28
        L51:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L58
            return r2
        L58:
            return r3
        L59:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.P.g(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    private static final Rect h(Rect rect) {
        return new Rect(rect.l(), rect.i(), rect.l(), rect.i());
    }

    private static final void i(InterfaceC5956j interfaceC5956j, D0.c<FocusTargetNode> cVar) {
        int iA = C5952f0.a(1024);
        if (!interfaceC5956j.getNode().getIsAttached()) {
            C14920a.b("visitChildren called on an unattached node");
        }
        D0.c cVar2 = new D0.c(new Modifier.c[16], 0);
        Modifier.c child = interfaceC5956j.getNode().getChild();
        if (child == null) {
            C5957k.c(cVar2, interfaceC5956j.getNode(), false);
        } else {
            cVar2.c(child);
        }
        while (cVar2.getSize() != 0) {
            Modifier.c cVarH = (Modifier.c) cVar2.u(cVar2.getSize() - 1);
            if ((cVarH.getAggregateChildKindSet() & iA) == 0) {
                C5957k.c(cVar2, cVarH, false);
            } else {
                while (true) {
                    if (cVarH == null) {
                        break;
                    }
                    if ((cVarH.getKindSet() & iA) != 0) {
                        D0.c cVar3 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) cVarH;
                                if (focusTargetNode.getIsAttached() && !C5957k.o(focusTargetNode).getIsDeactivated()) {
                                    if (focusTargetNode.R2().getCanFocus()) {
                                        cVar.c(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, cVar);
                                    }
                                }
                            } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                int i10 = 0;
                                for (Modifier.c delegate = ((AbstractC5959m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarH = delegate;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                cVar3.c(cVarH);
                                                cVarH = null;
                                            }
                                            cVar3.c(delegate);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarH = C5957k.h(cVar3);
                        }
                    } else {
                        cVarH = cVarH.getChild();
                    }
                }
            }
        }
    }

    private static final FocusTargetNode j(D0.c<FocusTargetNode> cVar, Rect rect, int i10) {
        Rect rectS;
        C5905f.Companion companion = C5905f.INSTANCE;
        if (C5905f.l(i10, companion.d())) {
            rectS = rect.s((rect.l() - rect.getLeft()) + 1, 0.0f);
        } else if (C5905f.l(i10, companion.g())) {
            rectS = rect.s(-((rect.l() - rect.getLeft()) + 1), 0.0f);
        } else if (C5905f.l(i10, companion.h())) {
            rectS = rect.s(0.0f, (rect.i() - rect.getTop()) + 1);
        } else {
            if (!C5905f.l(i10, companion.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            rectS = rect.s(0.0f, -((rect.i() - rect.getTop()) + 1));
        }
        FocusTargetNode[] focusTargetNodeArr = cVar.content;
        int size = cVar.getSize();
        FocusTargetNode focusTargetNode = null;
        for (int i11 = 0; i11 < size; i11++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i11];
            if (L.g(focusTargetNode2)) {
                Rect rectD = L.d(focusTargetNode2);
                if (m(rectD, rectS, rect, i10)) {
                    focusTargetNode = focusTargetNode2;
                    rectS = rectD;
                }
            }
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        Rect rectH;
        D0.c cVar = new D0.c(new FocusTargetNode[16], 0);
        i(focusTargetNode, cVar);
        if (cVar.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (cVar.getSize() == 0 ? null : cVar.content[0]);
            if (focusTargetNode2 != null) {
                return function1.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        C5905f.Companion companion = C5905f.INSTANCE;
        if (C5905f.l(i10, companion.b())) {
            i10 = companion.g();
        }
        if (C5905f.l(i10, companion.g()) ? true : C5905f.l(i10, companion.a())) {
            rectH = s(L.d(focusTargetNode));
        } else {
            if (!(C5905f.l(i10, companion.d()) ? true : C5905f.l(i10, companion.h()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            rectH = h(L.d(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeJ = j(cVar, rectH, i10);
        if (focusTargetNodeJ != null) {
            return function1.invoke(focusTargetNodeJ).booleanValue();
        }
        return false;
    }

    private static final boolean n(Rect rect, int i10, Rect rect2) {
        C5905f.Companion companion = C5905f.INSTANCE;
        if (C5905f.l(i10, companion.d())) {
            return (rect2.l() > rect.l() || rect2.getLeft() >= rect.l()) && rect2.getLeft() > rect.getLeft();
        }
        if (C5905f.l(i10, companion.g())) {
            return (rect2.getLeft() < rect.getLeft() || rect2.l() <= rect.getLeft()) && rect2.l() < rect.l();
        }
        if (C5905f.l(i10, companion.h())) {
            return (rect2.i() > rect.i() || rect2.getTop() >= rect.i()) && rect2.getTop() > rect.getTop();
        }
        if (C5905f.l(i10, companion.a())) {
            return (rect2.getTop() < rect.getTop() || rect2.i() <= rect.getTop()) && rect2.i() < rect.i();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float o(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.f$a r0 = androidx.compose.ui.focus.C5905f.INSTANCE
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.C5905f.l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.getLeft()
            float r2 = r2.l()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.C5905f.l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.getLeft()
            float r3 = r4.l()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.C5905f.l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.getTop()
            float r2 = r2.i()
            goto L14
        L3e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.C5905f.l(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.getTop()
            float r3 = r4.i()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            return r2
        L57:
            return r3
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.P.o(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    private static final float p(Rect rect, int i10, Rect rect2) {
        float f10;
        float f11;
        float left;
        float fL;
        float left2;
        C5905f.Companion companion = C5905f.INSTANCE;
        if (C5905f.l(i10, companion.d()) ? true : C5905f.l(i10, companion.g())) {
            float top = rect2.getTop();
            float fI = rect2.i() - rect2.getTop();
            f10 = 2;
            f11 = top + (fI / f10);
            left = rect.getTop();
            fL = rect.i();
            left2 = rect.getTop();
        } else {
            if (!(C5905f.l(i10, companion.h()) ? true : C5905f.l(i10, companion.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float left3 = rect2.getLeft();
            float fL2 = rect2.l() - rect2.getLeft();
            f10 = 2;
            f11 = left3 + (fL2 / f10);
            left = rect.getLeft();
            fL = rect.l();
            left2 = rect.getLeft();
        }
        return f11 - (left + ((fL - left2) / f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, Rect rect, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusTargetNode focusTargetNodeJ;
        D0.c cVar = new D0.c(new FocusTargetNode[16], 0);
        int iA = C5952f0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            C14920a.b("visitChildren called on an unattached node");
        }
        D0.c cVar2 = new D0.c(new Modifier.c[16], 0);
        Modifier.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            C5957k.c(cVar2, focusTargetNode.getNode(), false);
        } else {
            cVar2.c(child);
        }
        while (cVar2.getSize() != 0) {
            Modifier.c cVarH = (Modifier.c) cVar2.u(cVar2.getSize() - 1);
            if ((cVarH.getAggregateChildKindSet() & iA) == 0) {
                C5957k.c(cVar2, cVarH, false);
            } else {
                while (true) {
                    if (cVarH == null) {
                        break;
                    }
                    if ((cVarH.getKindSet() & iA) != 0) {
                        D0.c cVar3 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH;
                                if (focusTargetNode2.getIsAttached()) {
                                    cVar.c(focusTargetNode2);
                                }
                            } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                int i11 = 0;
                                for (Modifier.c delegate = ((AbstractC5959m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarH = delegate;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                cVar3.c(cVarH);
                                                cVarH = null;
                                            }
                                            cVar3.c(delegate);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarH = C5957k.h(cVar3);
                        }
                    } else {
                        cVarH = cVarH.getChild();
                    }
                }
            }
        }
        while (cVar.getSize() != 0 && (focusTargetNodeJ = j(cVar, rect, i10)) != null) {
            if (focusTargetNodeJ.R2().getCanFocus()) {
                return function1.invoke(focusTargetNodeJ).booleanValue();
            }
            if (l(focusTargetNodeJ, rect, i10, function1)) {
                return true;
            }
            cVar.s(focusTargetNodeJ);
        }
        return false;
    }

    private static final Rect s(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.d0() == F.f50801b) {
            FocusTargetNode focusTargetNodeB = L.b(focusTargetNode);
            if (focusTargetNodeB != null) {
                return focusTargetNodeB;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        throw new IllegalStateException("Searching for active node in inactive hierarchy");
    }

    private static final boolean c(Rect rect, Rect rect2, Rect rect3, int i10) {
        if (d(rect3, i10, rect) || !d(rect2, i10, rect)) {
            return false;
        }
        if (!e(rect3, i10, rect)) {
            return true;
        }
        C5905f.Companion companion = C5905f.INSTANCE;
        if (!C5905f.l(i10, companion.d()) && !C5905f.l(i10, companion.g()) && f(rect2, i10, rect) >= g(rect3, i10, rect)) {
            return false;
        }
        return true;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, Rect rect, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        if (r(focusTargetNode, rect, i10, function1)) {
            return true;
        }
        J jC = I.c(focusTargetNode);
        Boolean bool = (Boolean) C5900a.a(focusTargetNode, i10, new b(jC.getGeneration(), jC, C5957k.p(focusTargetNode).getFocusOwner().h(), focusTargetNode, rect, i10, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(Rect rect, Rect rect2, Rect rect3, int i10) {
        if (!n(rect, i10, rect3)) {
            return false;
        }
        if (!n(rect2, i10, rect3) || c(rect3, rect, rect2, i10)) {
            return true;
        }
        if (c(rect3, rect2, rect, i10) || q(i10, rect3, rect) >= q(i10, rect3, rect2)) {
            return false;
        }
        return true;
    }

    private static final long q(int i10, Rect rect, Rect rect2) {
        long jO = (long) o(rect2, i10, rect);
        long jP = (long) p(rect2, i10, rect);
        return (13 * jO * jO) + (jP * jP);
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i10, Rect rect, Function1<? super FocusTargetNode, Boolean> function1) {
        F fD0 = focusTargetNode.d0();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i11 = iArr[fD0.ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                if (i11 == 4) {
                    if (focusTargetNode.R2().getCanFocus()) {
                        return function1.invoke(focusTargetNode);
                    }
                    if (rect == null) {
                        return Boolean.valueOf(k(focusTargetNode, i10, function1));
                    }
                    return Boolean.valueOf(r(focusTargetNode, rect, i10, function1));
                }
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(k(focusTargetNode, i10, function1));
        }
        FocusTargetNode focusTargetNodeF = L.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            int i12 = iArr[focusTargetNodeF.d0().ordinal()];
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                if (rect == null) {
                    rect = L.d(focusTargetNodeF);
                }
                return Boolean.valueOf(l(focusTargetNode, rect, i10, function1));
            }
            Boolean boolT = t(focusTargetNodeF, i10, rect, function1);
            if (!Intrinsics.e(boolT, Boolean.FALSE)) {
                return boolT;
            }
            if (rect == null) {
                rect = L.d(b(focusTargetNodeF));
            }
            return Boolean.valueOf(l(focusTargetNode, rect, i10, function1));
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
