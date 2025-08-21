package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import F.h0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {
    static List<g0> a(h0 h0Var) {
        ArrayList arrayList = new ArrayList();
        if (h0Var.a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.c())) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (h0Var.a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.e())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (h0Var.a(Nexus4AndroidLTargetAspectRatioQuirk.class, Nexus4AndroidLTargetAspectRatioQuirk.d())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (h0Var.a(ExcludedSupportedSizesQuirk.class, ExcludedSupportedSizesQuirk.p())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if (h0Var.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.c())) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (h0Var.a(PreviewPixelHDRnetQuirk.class, PreviewPixelHDRnetQuirk.c())) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (h0Var.a(StillCaptureFlashStopRepeatingQuirk.class, StillCaptureFlashStopRepeatingQuirk.c())) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (h0Var.a(ExtraSupportedSurfaceCombinationsQuirk.class, ExtraSupportedSurfaceCombinationsQuirk.h())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (h0Var.a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.d())) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (h0Var.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, RepeatingStreamConstraintForVideoRecordingQuirk.d())) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (h0Var.a(TextureViewIsClosedQuirk.class, TextureViewIsClosedQuirk.c())) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (h0Var.a(CaptureSessionOnClosedNotCalledQuirk.class, CaptureSessionOnClosedNotCalledQuirk.c())) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        if (h0Var.a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.c())) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (h0Var.a(ZslDisablerQuirk.class, ZslDisablerQuirk.f())) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (h0Var.a(ExtraSupportedOutputSizeQuirk.class, ExtraSupportedOutputSizeQuirk.f())) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (h0Var.a(InvalidVideoProfilesQuirk.class, InvalidVideoProfilesQuirk.p())) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (h0Var.a(Preview3AThreadCrashQuirk.class, Preview3AThreadCrashQuirk.c())) {
            arrayList.add(new Preview3AThreadCrashQuirk());
        }
        if (h0Var.a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.d())) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (h0Var.a(CaptureSessionShouldUseMrirQuirk.class, CaptureSessionShouldUseMrirQuirk.c())) {
            arrayList.add(new CaptureSessionShouldUseMrirQuirk());
        }
        return arrayList;
    }
}
