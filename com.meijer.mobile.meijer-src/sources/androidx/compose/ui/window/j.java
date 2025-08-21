package androidx.compose.ui.window;

import H1.t;
import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.runtime.AbstractC5869k;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.T1;
import androidx.view.C6161i0;
import androidx.view.C6163j0;
import androidx.view.F;
import androidx.view.I;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p2.C16363j0;
import x4.C18093m;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010'R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00108\u001a\u0002068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/ui/window/j;", "Landroidx/activity/q;", "Landroidx/compose/ui/platform/T1;", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/h;", "properties", "Landroid/view/View;", "composeView", "LH1/t;", "layoutDirection", "LH1/d;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/h;Landroid/view/View;LH1/t;LH1/d;Ljava/util/UUID;)V", "j", "(LH1/t;)V", "Landroidx/compose/ui/window/r;", "securePolicy", "k", "(Landroidx/compose/ui/window/r;)V", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "Landroidx/compose/runtime/k;", "parentComposition", "children", "i", "(Landroidx/compose/runtime/k;Lkotlin/jvm/functions/Function2;)V", "l", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/h;LH1/t;)V", "h", "()V", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "d", "Lkotlin/jvm/functions/Function0;", "e", "Landroidx/compose/ui/window/h;", "f", "Landroid/view/View;", "Landroidx/compose/ui/window/DialogLayout;", "g", "Landroidx/compose/ui/window/DialogLayout;", "dialogLayout", "LH1/h;", "F", "maxSupportedElevation", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class j extends androidx.view.q implements T1 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onDismissRequest;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private h properties;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final DialogLayout dialogLayout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/F;", "", "a", "(Landroidx/activity/F;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<F, Unit> {
        b() {
            super(1);
        }

        public final void a(F f10) {
            if (j.this.properties.getDismissOnBackPress()) {
                j.this.onDismissRequest.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(F f10) {
            a(f10);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f13338a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f13339b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/j$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    public j(Function0<Unit> function0, h hVar, View view, t tVar, H1.d dVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), hVar.getDecorFitsSystemWindows() ? P0.m.f25272a : P0.m.f25273b), 0, 2, null);
        this.onDismissRequest = function0;
        this.properties = hVar;
        this.composeView = view;
        float fP = H1.h.p(8);
        this.maxSupportedElevation = fP;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        C16363j0.b(window, this.properties.getDecorFitsSystemWindows());
        window.setGravity(17);
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        dialogLayout.setTag(P0.k.f25222H, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(dVar.I1(fP));
        dialogLayout.setOutlineProvider(new a());
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(dialogLayout);
        C6161i0.b(dialogLayout, C6161i0.a(view));
        C6163j0.b(dialogLayout, C6163j0.a(view));
        C18093m.b(dialogLayout, C18093m.a(view));
        l(this.onDismissRequest, this.properties, tVar);
        I.b(getOnBackPressedDispatcher(), this, false, new b(), 2, null);
    }

    private final void j(t layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i10 = c.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i11);
    }

    private final void k(r securePolicy) {
        boolean zA = s.a(securePolicy, androidx.compose.ui.window.b.i(this.composeView));
        Window window = getWindow();
        Intrinsics.g(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    public final void h() {
        this.dialogLayout.e();
    }

    public final void i(AbstractC5869k parentComposition, Function2<? super Composer, ? super Integer, Unit> children) {
        this.dialogLayout.m(parentComposition, children);
    }

    public final void l(Function0<Unit> onDismissRequest, h properties, t layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        k(properties.getSecurePolicy());
        j(layoutDirection);
        boolean decorFitsSystemWindows = properties.getDecorFitsSystemWindows();
        this.dialogLayout.n(properties.getUsePlatformDefaultWidth(), decorFitsSystemWindows);
        setCanceledOnTouchOutside(properties.getDismissOnClickOutside());
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(decorFitsSystemWindows ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (!this.properties.getDismissOnBackPress() || !event.isTracking() || event.isCanceled() || keyCode != 111) {
            return super.onKeyUp(keyCode, event);
        }
        this.onDismissRequest.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (this.properties.getDismissOnClickOutside() && !this.dialogLayout.l(event)) {
            this.onDismissRequest.invoke();
            return true;
        }
        return zOnTouchEvent;
    }
}
