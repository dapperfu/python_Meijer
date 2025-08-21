package androidx.camera.camera2.internal.compat.quirk;

import C.P;
import F.h0;
import F.i0;
import F.l0;
import java.util.ArrayList;
import w.B;

/* loaded from: classes.dex */
public class a {
    public static l0 a(String str, B b10) {
        h0 h0VarA = i0.b().a();
        ArrayList arrayList = new ArrayList();
        if (h0VarA.a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.e(b10))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(b10));
        }
        if (h0VarA.a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.d(b10))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (h0VarA.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.c(b10))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (h0VarA.a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.c(b10))) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        if (h0VarA.a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.c(b10))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(b10));
        }
        if (h0VarA.a(CaptureNoResponseQuirk.class, CaptureNoResponseQuirk.c(b10))) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        if (h0VarA.a(LegacyCameraOutputConfigNullPointerQuirk.class, LegacyCameraOutputConfigNullPointerQuirk.c(b10))) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (h0VarA.a(LegacyCameraSurfaceCleanupQuirk.class, LegacyCameraSurfaceCleanupQuirk.d(b10))) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        if (h0VarA.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.c(b10))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (h0VarA.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.c(b10))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (h0VarA.a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.i(b10))) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (h0VarA.a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.d(b10))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (h0VarA.a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.c(b10))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (h0VarA.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.c(b10))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (h0VarA.a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.c(b10))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (h0VarA.a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.c(b10))) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (h0VarA.a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.c(b10))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (h0VarA.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.c(b10))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (h0VarA.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.c(b10))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (h0VarA.a(IncorrectCaptureStateQuirk.class, IncorrectCaptureStateQuirk.c(b10))) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (h0VarA.a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.h(b10))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(b10));
        }
        if (h0VarA.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.i())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (h0VarA.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.c())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (h0VarA.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.j())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (h0VarA.a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.d(b10))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (h0VarA.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.e())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if (h0VarA.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.d())) {
            arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        l0 l0Var = new l0(arrayList);
        P.a("CameraQuirks", "camera2 CameraQuirks = " + l0.d(l0Var));
        return l0Var;
    }
}
