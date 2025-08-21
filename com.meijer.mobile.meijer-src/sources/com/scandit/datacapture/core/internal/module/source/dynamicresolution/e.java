package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.core.source.VideoResolutionUtilsKt;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class e extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f125997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f125998b;

    public e(h hVar, k kVar) {
        this.f125997a = hVar;
        this.f125998b = kVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        float f10;
        h hVar = this.f125997a;
        k kVar = this.f125998b;
        c cVar = (c) hVar.f126004f.f125987a;
        synchronized (cVar.f125990a) {
            long j10 = cVar.f125992c;
            if (j10 == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1000 / (cVar.f125991b / j10);
            }
        }
        float fA = hVar.f126004f.a();
        hVar.f126004f.b();
        String currentResolution = kVar.f126013d;
        if (f10 > kVar.f126010a && fA < kVar.f126011b) {
            MainThreadHelper mainThreadHelper = j.f126008a;
            j.a("Good performance: \n\tFps:    " + f10 + "ms\n\tOffset: " + fA + "ms");
            hVar.b(currentResolution);
            return;
        }
        VideoResolution videoResolution = VideoResolution.FULL_HD;
        if (Intrinsics.e(currentResolution, VideoResolutionUtilsKt.toJson(videoResolution))) {
            MainThreadHelper mainThreadHelper2 = j.f126008a;
            j.a("Low performance: \n\tFps:    " + f10 + "ms\n\tOffset: " + fA + "ms");
            hVar.b(VideoResolutionUtilsKt.toJson(VideoResolution.HD));
            return;
        }
        VideoResolution videoResolution2 = VideoResolution.HD;
        if (Intrinsics.e(currentResolution, VideoResolutionUtilsKt.toJson(videoResolution2))) {
            MainThreadHelper mainThreadHelper3 = j.f126008a;
            j.a("Low performance: \n\tFps:    " + f10 + "ms\n\tOffset: " + fA + "ms");
            hVar.b(currentResolution);
            return;
        }
        MainThreadHelper mainThreadHelper4 = j.f126008a;
        j.a("Low performance: \n\tFps:    " + f10 + "ms\n\tOffset: " + fA + "ms");
        Intrinsics.j(currentResolution, "currentResolution");
        hVar.a(Intrinsics.e(currentResolution, VideoResolutionUtilsKt.toJson(VideoResolution.UHD4K)) ? "quadHd" : Intrinsics.e(currentResolution, "quadHd") ? VideoResolutionUtilsKt.toJson(videoResolution) : VideoResolutionUtilsKt.toJson(videoResolution2));
    }
}
