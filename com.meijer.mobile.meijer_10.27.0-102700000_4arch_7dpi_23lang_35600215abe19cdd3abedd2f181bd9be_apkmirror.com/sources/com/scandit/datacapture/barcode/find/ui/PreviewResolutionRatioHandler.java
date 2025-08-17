package com.scandit.datacapture.barcode.find.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R5\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/find/ui/PreviewResolutionRatioHandler;", "", "closeToFourByThree", "", "getCloseToFourByThree", "()Z", "listener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "ratio", "", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "getRatio", "()F", "onResolutionChanged", "width", "", "height", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PreviewResolutionRatioHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f121001a;
    public static final float UNSET_RATIO = -1.0f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/find/ui/PreviewResolutionRatioHandler$Companion;", "", "Lcom/scandit/datacapture/barcode/find/ui/PreviewResolutionRatioHandler;", "impl", "()Lcom/scandit/datacapture/barcode/find/ui/PreviewResolutionRatioHandler;", "", "UNSET_RATIO", "F", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public static final float UNSET_RATIO = -1.0f;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f121001a = new Companion();

        public final PreviewResolutionRatioHandler impl() {
            return new e();
        }

        private Companion() {
        }
    }

    boolean getCloseToFourByThree();

    Function1<Float, Unit> getListener();

    float getRatio();

    void onResolutionChanged(int width, int height);

    void setListener(Function1<? super Float, Unit> function1);
}
