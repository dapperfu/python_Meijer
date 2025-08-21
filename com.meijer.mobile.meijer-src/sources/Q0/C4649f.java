package Q0;

import Z.d0;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.focus.InterfaceC5913n;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AnnotatedString;
import com.fullstory.FS;
import j1.C14920a;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.AccessibilityAction;
import r1.C16822p;
import r1.InterfaceC16816j;
import r1.InterfaceC16818l;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b'\u0010&J\u001f\u0010*\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b,\u0010&J\u0017\u0010-\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b-\u0010&J\u000f\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b.\u0010/R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010:R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010E¨\u0006G"}, d2 = {"LQ0/f;", "LQ0/H;", "Lr1/l;", "Landroidx/compose/ui/focus/n;", "LQ0/P;", "platformAutofillManager", "Lr1/p;", "semanticsOwner", "Landroid/view/View;", "view", "Ls1/b;", "rectManager", "", "packageName", "<init>", "(LQ0/P;Lr1/p;Landroid/view/View;Ls1/b;Ljava/lang/String;)V", "Landroidx/compose/ui/focus/G;", "previous", "current", "", "b", "(Landroidx/compose/ui/focus/G;Landroidx/compose/ui/focus/G;)V", "Lr1/j;", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "previousSemanticsConfiguration", "a", "(Lr1/j;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "Landroid/view/ViewStructure;", "rootViewStructure", "l", "(Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "k", "(Landroid/util/SparseArray;)V", "m", "(Lr1/j;)V", "i", "", "previousSemanticsId", "j", "(Lr1/j;I)V", "h", "f", "g", "()V", "LQ0/P;", "e", "()LQ0/P;", "setPlatformAutofillManager", "(LQ0/P;)V", "Lr1/p;", "c", "Landroid/view/View;", "d", "Ls1/b;", "Ljava/lang/String;", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "reusableRect", "Landroid/view/autofill/AutofillId;", "Landroid/view/autofill/AutofillId;", "rootAutofillId", "LZ/L;", "LZ/L;", "currentlyDisplayedIDs", "", "Z", "pendingAutofillCommit", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Q0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4649f extends H implements InterfaceC16818l, InterfaceC5913n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private P platformAutofillManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16822p semanticsOwner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s1.b rectManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Rect reusableRect = new Rect();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private AutofillId rootAutofillId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Z.L currentlyDisplayedIDs;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean pendingAutofillCommit;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "l", "t", "r", "b", "", "a", "(IIII)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: Q0.f$a */
    static final class a extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f27501g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(4);
            this.f27501g = i10;
        }

        public final void a(int i10, int i11, int i12, int i13) {
            C4649f.this.getPlatformAutofillManager().e(C4649f.this.view, this.f27501g, new Rect(i10, i11, i12, i13));
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            a(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "l", "t", "r", "b", "", "a", "(IIII)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: Q0.f$b */
    static final class b extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f27503g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(4);
            this.f27503g = i10;
        }

        public final void a(int i10, int i11, int i12, int i13) {
            C4649f.this.getPlatformAutofillManager().e(C4649f.this.view, this.f27503g, new Rect(i10, i11, i12, i13));
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            a(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "left", "top", "right", "bottom", "", "a", "(IIII)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: Q0.f$c */
    static final class c extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC16816j f27505g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC16816j interfaceC16816j) {
            super(4);
            this.f27505g = interfaceC16816j;
        }

        public final void a(int i10, int i11, int i12, int i13) {
            C4649f.this.reusableRect.set(i10, i11, i12, i13);
            C4649f.this.getPlatformAutofillManager().c(C4649f.this.view, this.f27505g.getSemanticsId(), C4649f.this.reusableRect);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            a(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.f143329a;
        }
    }

    @Override // androidx.compose.ui.focus.InterfaceC5913n
    public void b(androidx.compose.ui.focus.G previous, androidx.compose.ui.focus.G current) {
        InterfaceC16816j interfaceC16816jQ;
        SemanticsConfiguration semanticsConfiguration;
        InterfaceC16816j interfaceC16816jQ2;
        SemanticsConfiguration semanticsConfiguration2;
        if (previous != null && (interfaceC16816jQ2 = C5957k.q(previous)) != null && (semanticsConfiguration2 = interfaceC16816jQ2.getSemanticsConfiguration()) != null && C4650g.d(semanticsConfiguration2)) {
            this.platformAutofillManager.b(this.view, interfaceC16816jQ2.getSemanticsId());
        }
        if (current == null || (interfaceC16816jQ = C5957k.q(current)) == null || (semanticsConfiguration = interfaceC16816jQ.getSemanticsConfiguration()) == null || !C4650g.d(semanticsConfiguration)) {
            return;
        }
        int semanticsId = interfaceC16816jQ.getSemanticsId();
        this.rectManager.getRects().l(semanticsId, new a(semanticsId));
    }

    /* renamed from: e, reason: from getter */
    public final P getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void f(InterfaceC16816j semanticsInfo) {
        if (this.currentlyDisplayedIDs.r(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.d(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void g() {
        if (this.currentlyDisplayedIDs.c() && this.pendingAutofillCommit) {
            this.platformAutofillManager.commit();
            this.pendingAutofillCommit = false;
        }
        if (this.currentlyDisplayedIDs.d()) {
            this.pendingAutofillCommit = true;
        }
    }

    public final void h(InterfaceC16816j semanticsInfo) {
        if (this.currentlyDisplayedIDs.r(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.d(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void j(InterfaceC16816j semanticsInfo, int previousSemanticsId) {
        if (this.currentlyDisplayedIDs.r(previousSemanticsId)) {
            this.platformAutofillManager.d(this.view, previousSemanticsId, false);
        }
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration == null || !C4650g.e(semanticsConfiguration)) {
            return;
        }
        this.currentlyDisplayedIDs.g(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.d(this.view, semanticsInfo.getSemanticsId(), true);
    }

    public final void l(ViewStructure rootViewStructure) {
        y yVar = y.f27509a;
        InterfaceC16816j interfaceC16816jC = this.semanticsOwner.c();
        X.a(rootViewStructure, interfaceC16816jC, this.rootAutofillId, this.packageName, this.rectManager);
        Z.T tH = d0.h(interfaceC16816jC, rootViewStructure);
        while (tH.h()) {
            Object objA = tH.A(tH._size - 1);
            Intrinsics.h(objA, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure = (ViewStructure) objA;
            Object objA2 = tH.A(tH._size - 1);
            Intrinsics.h(objA2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List<InterfaceC16816j> listM = ((InterfaceC16816j) objA2).m();
            int size = listM.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC16816j interfaceC16816j = listM.get(i10);
                if (!interfaceC16816j.getIsDeactivated() && interfaceC16816j.isAttached() && interfaceC16816j.f()) {
                    SemanticsConfiguration semanticsConfiguration = interfaceC16816j.getSemanticsConfiguration();
                    if (semanticsConfiguration == null || !C4650g.f(semanticsConfiguration)) {
                        tH.n(interfaceC16816j);
                        tH.n(viewStructure);
                    } else {
                        ViewStructure viewStructureG = yVar.g(viewStructure, yVar.a(viewStructure, 1));
                        X.a(viewStructureG, interfaceC16816j, this.rootAutofillId, this.packageName, this.rectManager);
                        tH.n(interfaceC16816j);
                        tH.n(viewStructureG);
                    }
                }
            }
        }
    }

    public final void m(InterfaceC16816j semanticsInfo) {
        this.rectManager.getRects().l(semanticsInfo.getSemanticsId(), new c(semanticsInfo));
    }

    public C4649f(P p10, C16822p c16822p, View view, s1.b bVar, String str) {
        AutofillId autofillIdA;
        this.platformAutofillManager = p10;
        this.semanticsOwner = c16822p;
        this.view = view;
        this.rectManager = bVar;
        this.packageName = str;
        view.setImportantForAutofill(1);
        n1.b bVarA = n1.e.a(view);
        if (bVarA != null) {
            autofillIdA = bVarA.a();
        } else {
            autofillIdA = null;
        }
        if (autofillIdA != null) {
            this.rootAutofillId = autofillIdA;
            this.currentlyDisplayedIDs = new Z.L(0, 1, null);
        } else {
            C14920a.c("Required value was null.");
            throw new KotlinNothingValueException();
        }
    }

    @Override // r1.InterfaceC16818l
    public void a(InterfaceC16816j semanticsInfo, SemanticsConfiguration previousSemanticsConfiguration) {
        String text;
        String text2;
        boolean z10;
        Boolean bool;
        AnnotatedString annotatedString;
        AnnotatedString annotatedString2;
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        int semanticsId = semanticsInfo.getSemanticsId();
        Boolean bool2 = null;
        if (previousSemanticsConfiguration != null && (annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.getOrNull(previousSemanticsConfiguration, SemanticsProperties.INSTANCE.k())) != null) {
            text = annotatedString2.getText();
        } else {
            text = null;
        }
        if (semanticsConfiguration != null && (annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.k())) != null) {
            text2 = annotatedString.getText();
        } else {
            text2 = null;
        }
        boolean z11 = false;
        if (text != text2) {
            if (text == null) {
                this.platformAutofillManager.d(this.view, semanticsId, true);
            } else if (text2 == null) {
                this.platformAutofillManager.d(this.view, semanticsId, false);
            } else if (Intrinsics.e((L) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.c()), L.INSTANCE.a())) {
                this.platformAutofillManager.a(this.view, semanticsId, y.f27509a.b(text2.toString()));
            }
        }
        if (!P0.h.isTrackFocusEnabled) {
            if (previousSemanticsConfiguration != null) {
                bool = (Boolean) SemanticsConfigurationKt.getOrNull(previousSemanticsConfiguration, SemanticsProperties.INSTANCE.getFocused());
            } else {
                bool = null;
            }
            if (semanticsConfiguration != null) {
                bool2 = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getFocused());
            }
            Boolean bool3 = Boolean.TRUE;
            if (!Intrinsics.e(bool, bool3) && Intrinsics.e(bool2, bool3) && C4650g.d(semanticsConfiguration)) {
                this.rectManager.getRects().l(semanticsId, new b(semanticsId));
            }
            if (Intrinsics.e(bool, bool3) && !Intrinsics.e(bool2, bool3) && C4650g.d(previousSemanticsConfiguration)) {
                this.platformAutofillManager.b(this.view, semanticsId);
            }
        }
        if (previousSemanticsConfiguration != null && C4650g.e(previousSemanticsConfiguration)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (semanticsConfiguration != null && C4650g.e(semanticsConfiguration)) {
            z11 = true;
        }
        if (z10 != z11) {
            if (z11) {
                this.currentlyDisplayedIDs.g(semanticsId);
            } else {
                this.currentlyDisplayedIDs.r(semanticsId);
            }
        }
    }

    public final void i(InterfaceC16816j semanticsInfo) {
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null && C4650g.e(semanticsConfiguration)) {
            this.currentlyDisplayedIDs.g(semanticsInfo.getSemanticsId());
            this.platformAutofillManager.d(this.view, semanticsInfo.getSemanticsId(), true);
        }
    }

    public final void k(SparseArray<AutofillValue> values) {
        SemanticsConfiguration semanticsConfiguration;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        int size = values.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = values.keyAt(i10);
            AutofillValue autofillValueA = C4648e.a(values.get(iKeyAt));
            y yVar = y.f27509a;
            if (yVar.e(autofillValueA)) {
                InterfaceC16816j interfaceC16816jA = this.semanticsOwner.a(iKeyAt);
                if (interfaceC16816jA != null && (semanticsConfiguration = interfaceC16816jA.getSemanticsConfiguration()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.k())) != null && (function1 = (Function1) accessibilityAction.a()) != null) {
                }
            } else if (yVar.c(autofillValueA)) {
                FS.log_w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (yVar.d(autofillValueA)) {
                FS.log_w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (yVar.f(autofillValueA)) {
                FS.log_w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }
}
