package com.scandit.datacapture.core.internal.module.device.profiles.camera;

import android.hardware.Camera;
import android.util.Range;
import com.google.android.gms.common.api.a;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;
import com.scandit.datacapture.core.source.CameraSettings;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* loaded from: classes12.dex */
public abstract class e implements CameraProfile {

    /* renamed from: a, reason: collision with root package name */
    public final f f125176a = new f(false, true, true, 0.0f, false, false, -1);

    /* renamed from: b, reason: collision with root package name */
    public final a f125177b = new a("continuous-picture", "continuous-video", CameraSettings.FOCUS_STRATEGY_AUTO);

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public int b() {
        return a.e.API_PRIORITY_OTHER;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean c() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean d() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean f() {
        return true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean h() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean i() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public Range b(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean a(String model) {
        Intrinsics.j(model, "model");
        return new Regex(g(), RegexOption.f148370c).j(model);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public NativeFocusStrategy e() {
        return b.a();
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean j() {
        return b.c();
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public NativeCameraApi k() {
        return b.b();
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public f a() {
        return this.f125176a;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public static void a(Camera.Parameters camParams, float f10) {
        Intrinsics.j(camParams, "camParams");
        float exposureCompensationStep = camParams.getExposureCompensationStep();
        camParams.setExposureCompensation(Math.min(camParams.getMaxExposureCompensation(), Math.max(camParams.getMinExposureCompensation(), Math.round(f10 / exposureCompensationStep))));
    }
}
