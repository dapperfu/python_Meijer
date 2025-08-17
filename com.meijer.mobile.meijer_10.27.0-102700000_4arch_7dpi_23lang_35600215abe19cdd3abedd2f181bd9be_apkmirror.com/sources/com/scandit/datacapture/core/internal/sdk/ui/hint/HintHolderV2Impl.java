package com.scandit.datacapture.core.internal.sdk.ui.hint;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter;
import com.scandit.datacapture.core.internal.module.ui.hint.E;
import com.scandit.datacapture.core.internal.module.ui.hint.HintView;
import com.scandit.datacapture.core.internal.module.ui.hint.n;
import com.scandit.datacapture.core.internal.module.ui.hint.p;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2Impl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R/\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl;", "Landroid/widget/RelativeLayout;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "toast", "", "showToast", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;)V", "hideToast", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "guidance", "showGuidance", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;)V", "hideGuidance", "Landroid/view/View;", "asView", "()Landroid/view/View;", "Lcom/scandit/datacapture/core/internal/module/ui/hint/HintView;", "anyToastView$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/ui/hint/HintView;", "anyToastView", "Lcom/scandit/datacapture/core/common/geometry/Rect;", "<set-?>", "a", "Lkotlin/properties/ReadWriteProperty;", "getViewFinderRect", "()Lcom/scandit/datacapture/core/common/geometry/Rect;", "setViewFinderRect", "(Lcom/scandit/datacapture/core/common/geometry/Rect;)V", "viewFinderRect", "Lcom/scandit/datacapture/core/internal/module/ui/NativePlatformHintPresenter;", "b", "Lcom/scandit/datacapture/core/internal/module/ui/NativePlatformHintPresenter;", "getPlatformHintPresenter", "()Lcom/scandit/datacapture/core/internal/module/ui/NativePlatformHintPresenter;", "platformHintPresenter", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HideHintListener;", "c", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HideHintListener;", "getHideHintListener", "()Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HideHintListener;", "setHideHintListener", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HideHintListener;)V", "hideHintListener", "Operation", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class HintHolderV2Impl extends RelativeLayout implements HintHolderV2 {

    @Deprecated
    public static final int POST_OPERATION_ID = 1;

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f125723h = {Reflection.f(new MutablePropertyReference1Impl(Reflection.b(HintHolderV2Impl.class), "viewFinderRect", "getViewFinderRect()Lcom/scandit/datacapture/core/common/geometry/Rect;"))};

    /* renamed from: a, reason: collision with root package name */
    private final HintHolderV2Impl$special$$inlined$distinctObservable$1 f125724a;

    /* renamed from: b, reason: collision with root package name */
    private final E f125725b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private HideHintListener hideHintListener;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashMap f125727d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f125728e;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedList f125729f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f125730g;

    public interface Operation {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation$HideGuidance;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "guidance", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;)V", "a", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "getGuidance", "()Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
        public static final class HideGuidance implements Operation {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final GuidanceHint guidance;

            public HideGuidance(GuidanceHint guidance) {
                Intrinsics.j(guidance, "guidance");
                this.guidance = guidance;
            }

            public final GuidanceHint getGuidance() {
                return this.guidance;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation$HideToast;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "toast", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;)V", "a", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "getToast", "()Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
        public static final class HideToast implements Operation {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final ToastHint toast;

            public HideToast(ToastHint toast) {
                Intrinsics.j(toast, "toast");
                this.toast = toast;
            }

            public final ToastHint getToast() {
                return this.toast;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation$ShowGuidance;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "guidance", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;)V", "a", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "getGuidance", "()Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
        public static final class ShowGuidance implements Operation {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final GuidanceHint guidance;

            public ShowGuidance(GuidanceHint guidance) {
                Intrinsics.j(guidance, "guidance");
                this.guidance = guidance;
            }

            public final GuidanceHint getGuidance() {
                return this.guidance;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation$ShowToast;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "toast", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;)V", "a", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "getToast", "()Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
        public static final class ShowToast implements Operation {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final ToastHint toast;

            public ShowToast(ToastHint toast) {
                Intrinsics.j(toast, "toast");
                this.toast = toast;
            }

            public final ToastHint getToast() {
                return this.toast;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation$UpdateAnchoring;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation;", "Lcom/scandit/datacapture/core/common/geometry/Rect;", "viewFinderRect", "<init>", "(Lcom/scandit/datacapture/core/common/geometry/Rect;)V", "a", "Lcom/scandit/datacapture/core/common/geometry/Rect;", "getViewFinderRect", "()Lcom/scandit/datacapture/core/common/geometry/Rect;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
        public static final class UpdateAnchoring implements Operation {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Rect viewFinderRect;

            public final Rect getViewFinderRect() {
                return this.viewFinderRect;
            }

            public UpdateAnchoring(Rect rect) {
                this.viewFinderRect = rect;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(HintHolderV2Impl this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.a();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    public View asView() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2Impl$special$$inlined$distinctObservable$1] */
    public HintHolderV2Impl(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        Delegates delegates = Delegates.f142874a;
        final Object obj = null;
        this.f125724a = new ObservableProperty<Rect>(obj) { // from class: com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2Impl$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Rect oldValue, Rect newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                HintHolderV2Impl hintHolderV2Impl = this;
                hintHolderV2Impl.a(new HintHolderV2Impl.Operation.UpdateAnchoring(hintHolderV2Impl.getViewFinderRect()));
            }
        };
        this.f125725b = new E(this);
        this.f125727d = new LinkedHashMap();
        this.f125728e = new LinkedHashMap();
        this.f125729f = new LinkedList();
        this.f125730g = new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.ui.hint.g
            @Override // java.lang.Runnable
            public final void run() {
                HintHolderV2Impl.a(this.f125753a);
            }
        };
    }

    private final void a(ToastHint toast) {
        LinkedHashMap linkedHashMap = this.f125727d;
        Object obj = linkedHashMap.get(toast);
        Object obj2 = obj;
        if (obj == null) {
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            HintView hintView = new HintView(context);
            addView(hintView);
            linkedHashMap.put(toast, hintView);
            obj2 = hintView;
        }
        HintView hintView2 = (HintView) obj2;
        hintView2.a(toast.getText());
        Rect viewFinderRect = getViewFinderRect();
        Intrinsics.j(toast, "toast");
        hintView2.c(toast.getHintStyle(), viewFinderRect, false);
        p.b(hintView2, toast.getHintStyle().isAnimatedIntoView(), new d(this));
        hintView2.a(new e(this, toast));
    }

    public final HintView anyToastView$scandit_capture_core() {
        return (HintView) CollectionsKt.t0(this.f125727d.values());
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    public HideHintListener getHideHintListener() {
        return this.hideHintListener;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    public NativePlatformHintPresenter getPlatformHintPresenter() {
        return this.f125725b;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    public Rect getViewFinderRect() {
        return getValue(this, f125723h[0]);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    public void hideGuidance(GuidanceHint guidance) {
        Intrinsics.j(guidance, "guidance");
        a(new Operation.HideGuidance(guidance));
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    public void hideToast(ToastHint toast) {
        Intrinsics.j(toast, "toast");
        a(new Operation.HideToast(toast));
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    public void setHideHintListener(HideHintListener hideHintListener) {
        this.hideHintListener = hideHintListener;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    public void setViewFinderRect(Rect rect) {
        setValue(this, f125723h[0], rect);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    public void showGuidance(GuidanceHint guidance) {
        Intrinsics.j(guidance, "guidance");
        a(new Operation.ShowGuidance(guidance));
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    public void showToast(ToastHint toast) {
        Intrinsics.j(toast, "toast");
        a(new Operation.ShowToast(toast));
    }

    private final void a(GuidanceHint guidance) {
        Integer num;
        LinkedHashMap linkedHashMap = this.f125728e;
        Object obj = linkedHashMap.get(guidance);
        Object obj2 = obj;
        if (obj == null) {
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            HintView hintView = new HintView(context);
            Iterator it = this.f125727d.values().iterator();
            if (it.hasNext()) {
                Integer numValueOf = Integer.valueOf(indexOfChild((HintView) it.next()));
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(indexOfChild((HintView) it.next()));
                    if (numValueOf.compareTo(numValueOf2) > 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            addView(hintView, RangesKt.f(num != null ? num.intValue() : 0, 0));
            linkedHashMap.put(guidance, hintView);
            obj2 = hintView;
        }
        HintView hintView2 = (HintView) obj2;
        hintView2.a(guidance.getText());
        Rect viewFinderRect = getViewFinderRect();
        Intrinsics.j(guidance, "guidance");
        hintView2.c(guidance.getHintStyle(), viewFinderRect, true);
        boolean zIsAnimatedIntoView = guidance.getHintStyle().isAnimatedIntoView();
        int i10 = p.f125279a;
        p.b(hintView2, zIsAnimatedIntoView, n.f125276a);
        hintView2.a(new c(this, guidance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Operation operation) {
        synchronized (this.f125729f) {
            this.f125729f.addLast(operation);
            Unit unit = Unit.f142422a;
        }
        Handler handler = getHandler();
        if (handler == null) {
            return;
        }
        if (Intrinsics.e(Looper.myLooper(), Looper.getMainLooper())) {
            handler.removeMessages(1);
            a();
        } else {
            if (handler.hasMessages(1)) {
                return;
            }
            Message messageObtain = Message.obtain(handler, this.f125730g);
            messageObtain.what = 1;
            handler.sendMessage(messageObtain);
        }
    }

    private final void a() {
        synchronized (this.f125729f) {
            while (!this.f125729f.isEmpty()) {
                try {
                    Operation operation = (Operation) this.f125729f.removeFirst();
                    if (operation instanceof Operation.ShowGuidance) {
                        a(((Operation.ShowGuidance) operation).getGuidance());
                    } else if (operation instanceof Operation.HideGuidance) {
                        GuidanceHint guidance = ((Operation.HideGuidance) operation).getGuidance();
                        HintView hintView = (HintView) this.f125728e.get(guidance);
                        if (hintView != null) {
                            p.a(hintView, guidance.getHintStyle().isAnimatedIntoView(), new a(this, hintView, guidance));
                        }
                    } else if (operation instanceof Operation.ShowToast) {
                        a(((Operation.ShowToast) operation).getToast());
                    } else if (operation instanceof Operation.HideToast) {
                        ToastHint toast = ((Operation.HideToast) operation).getToast();
                        HintView hintView2 = (HintView) this.f125727d.get(toast);
                        if (hintView2 != null) {
                            p.a(hintView2, toast.getHintStyle().isAnimatedIntoView(), new b(this, hintView2, toast));
                        }
                    } else if (operation instanceof Operation.UpdateAnchoring) {
                        ViewExtensionsKt.runOnMainThread(this, new f(this, ((Operation.UpdateAnchoring) operation).getViewFinderRect()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Unit unit = Unit.f142422a;
        }
    }
}
