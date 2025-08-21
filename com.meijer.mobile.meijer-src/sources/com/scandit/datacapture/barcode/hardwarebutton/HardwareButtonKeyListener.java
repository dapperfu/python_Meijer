package com.scandit.datacapture.barcode.hardwarebutton;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewConfiguration;
import com.scandit.datacapture.barcode.hardwarebutton.HardwareButtonKeyListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B?\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\f\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/hardwarebutton/HardwareButtonKeyListener;", "Landroid/view/View$OnUnhandledKeyEventListener;", "", "keyCode", "Lkotlin/Function1;", "Lcom/scandit/datacapture/barcode/hardwarebutton/HardwareKeyEvent;", "", "onEvent", "startAction", "endAction", "Landroid/os/Handler;", "handler", "<init>", "(ILkotlin/jvm/functions/Function1;IILandroid/os/Handler;)V", "(ILkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "v", "Landroid/view/KeyEvent;", "event", "", "onUnhandledKeyEvent", "(Landroid/view/View;Landroid/view/KeyEvent;)Z", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@TargetApi(28)
/* loaded from: classes12.dex */
public final class HardwareButtonKeyListener implements View$OnUnhandledKeyEventListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private static final long f121989i = ViewConfiguration.getLongPressTimeout();

    /* renamed from: a, reason: collision with root package name */
    private final int f121990a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f121991b;

    /* renamed from: c, reason: collision with root package name */
    private final int f121992c;

    /* renamed from: d, reason: collision with root package name */
    private final int f121993d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f121994e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f121995f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f121996g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f121997h;

    public HardwareButtonKeyListener(int i10, Function1<? super HardwareKeyEvent, Unit> onEvent, int i11, int i12, Handler handler) {
        Intrinsics.j(onEvent, "onEvent");
        Intrinsics.j(handler, "handler");
        this.f121990a = i10;
        this.f121991b = onEvent;
        this.f121992c = i11;
        this.f121993d = i12;
        this.f121994e = handler;
        this.f121997h = new Runnable() { // from class: Ft.b
            @Override // java.lang.Runnable
            public final void run() {
                HardwareButtonKeyListener.a(this.f10934a);
            }
        };
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0081\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/hardwarebutton/HardwareButtonKeyListener$Companion;", "", "", "LONG_PRESS_THRESHOLD_MS", "J", "getLONG_PRESS_THRESHOLD_MS", "()J", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final long getLONG_PRESS_THRESHOLD_MS() {
            return HardwareButtonKeyListener.f121989i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(HardwareButtonKeyListener this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.f121996g = true;
        this$0.f121991b.invoke(HardwareKeyEvent.LONG_PRESS_START);
    }

    public boolean onUnhandledKeyEvent(View v10, KeyEvent event) {
        Intrinsics.j(v10, "v");
        Intrinsics.j(event, "event");
        if (event.getKeyCode() == this.f121990a && event.getAction() == this.f121992c && !this.f121995f) {
            this.f121995f = true;
            this.f121996g = false;
            event.getEventTime();
            this.f121994e.removeCallbacksAndMessages(null);
            this.f121994e.postDelayed(this.f121997h, f121989i);
            return true;
        }
        if (event.getKeyCode() != this.f121990a || event.getAction() != this.f121993d || !this.f121995f) {
            return false;
        }
        if (this.f121996g) {
            this.f121991b.invoke(HardwareKeyEvent.LONG_PRESS_END);
        } else {
            this.f121994e.removeCallbacksAndMessages(null);
            this.f121991b.invoke(HardwareKeyEvent.CLICK);
        }
        this.f121995f = false;
        return true;
    }

    public /* synthetic */ HardwareButtonKeyListener(int i10, Function1 function1, int i11, int i12, Handler handler, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, function1, i11, i12, (i13 & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HardwareButtonKeyListener(int i10, Function1<? super HardwareKeyEvent, Unit> onEvent) {
        this(i10, onEvent, 0, 1, null, 16, null);
        Intrinsics.j(onEvent, "onEvent");
    }
}
