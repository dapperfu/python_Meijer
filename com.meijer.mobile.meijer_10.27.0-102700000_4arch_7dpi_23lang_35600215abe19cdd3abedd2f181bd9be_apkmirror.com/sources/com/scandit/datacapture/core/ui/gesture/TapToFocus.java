package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture;
import com.scandit.datacapture.core.internal.module.ui.NativeTapToFocus;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/TapToFocus;", "Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "Lcom/scandit/datacapture/core/ui/gesture/TapToFocusProxy;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;)V", "()V", "Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGesture;", "_focusGestureImpl", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGesture;", "_impl", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "point", "", "triggerFocus", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "Lcom/scandit/datacapture/core/ui/gesture/FocusGestureListener;", "listener", "addListener", "(Lcom/scandit/datacapture/core/ui/gesture/FocusGestureListener;)V", "removeListener", "", "value", "getShowUIIndicator", "()Z", "setShowUIIndicator", "(Z)V", "showUIIndicator", "com/scandit/datacapture/core/ui/gesture/c", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class TapToFocus implements FocusGesture, TapToFocusProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TapToFocusProxyAdapter f126095a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArraySet f126096b;

    /* JADX WARN: Multi-variable type inference failed */
    public TapToFocus(NativeTapToFocus impl) {
        Intrinsics.j(impl, "impl");
        this.f126095a = new TapToFocusProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.f126096b = new CopyOnWriteArraySet();
        getF126097a().addListener(new FocusGestureListenerReversedAdapter(new c(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture, com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    @NativeImpl
    /* renamed from: _focusGestureImpl */
    public NativeFocusGesture getF126099c() {
        return this.f126095a.getF126099c();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeTapToFocus getF126097a() {
        return this.f126095a.getF126097a();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture, com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    @ProxyFunction(nativeName = "toJson")
    public String toJson() {
        return this.f126095a.toJson();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture, com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    @ProxyFunction(nativeName = "triggerFocus")
    public void triggerFocus(PointWithUnit point) {
        Intrinsics.j(point, "point");
        this.f126095a.triggerFocus(point);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture
    public void addListener(FocusGestureListener listener) {
        Intrinsics.j(listener, "listener");
        this.f126096b.add(listener);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture
    public void removeListener(FocusGestureListener listener) {
        Intrinsics.j(listener, "listener");
        this.f126096b.remove(listener);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture
    public boolean getShowUIIndicator() {
        return getF126097a().getShowUIIndicator();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture
    public void setShowUIIndicator(boolean z10) {
        getF126097a().setShowUIIndicator(z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TapToFocus() {
        NativeTapToFocus nativeTapToFocusCreate = NativeTapToFocus.create(true);
        Intrinsics.i(nativeTapToFocusCreate, "create(...)");
        this(nativeTapToFocusCreate);
    }
}
