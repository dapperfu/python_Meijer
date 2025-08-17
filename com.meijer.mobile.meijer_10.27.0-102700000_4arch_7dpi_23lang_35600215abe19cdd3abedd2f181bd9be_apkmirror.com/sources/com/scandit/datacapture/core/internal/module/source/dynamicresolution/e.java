package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.core.source.VideoResolutionUtilsKt;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f125045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f125046b;

    public e(h hVar, k kVar) {
        this.f125045a = hVar;
        this.f125046b = kVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        float f10;
        h hVar = this.f125045a;
        k kVar = this.f125046b;
        c cVar = (c) hVar.f125052f.f125035a;
        synchronized (cVar.f125038a) {
            long j10 = cVar.f125040c;
            if (j10 == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1000 / (cVar.f125039b / j10);
            }
        }
        float fA = hVar.f125052f.a();
        hVar.f125052f.b();
        String currentResolution = kVar.f125061d;
        if (f10 > kVar.f125058a && fA < kVar.f125059b) {
            MainThreadHelper mainThreadHelper = j.f125056a;
            j.a("Good performance: \n\tFps:    " + f10 + "ms\n\tOffset: " + fA + "ms");
            hVar.b(currentResolution);
            return;
        }
        VideoResolution videoResolution = VideoResolution.FULL_HD;
        if (Intrinsics.e(currentResolution, VideoResolutionUtilsKt.toJson(videoResolution))) {
            MainThreadHelper mainThreadHelper2 = j.f125056a;
            j.a("Low performance: \n\tFps:    " + f10 + "ms\n\tOffset: " + fA + "ms");
            hVar.b(VideoResolutionUtilsKt.toJson(VideoResolution.HD));
            return;
        }
        VideoResolution videoResolution2 = VideoResolution.HD;
        if (Intrinsics.e(currentResolution, VideoResolutionUtilsKt.toJson(videoResolution2))) {
            MainThreadHelper mainThreadHelper3 = j.f125056a;
            j.a("Low performance: \n\tFps:    " + f10 + "ms\n\tOffset: " + fA + "ms");
            hVar.b(currentResolution);
            return;
        }
        MainThreadHelper mainThreadHelper4 = j.f125056a;
        j.a("Low performance: \n\tFps:    " + f10 + "ms\n\tOffset: " + fA + "ms");
        Intrinsics.j(currentResolution, "currentResolution");
        hVar.a(Intrinsics.e(currentResolution, VideoResolutionUtilsKt.toJson(VideoResolution.UHD4K)) ? "quadHd" : Intrinsics.e(currentResolution, "quadHd") ? VideoResolutionUtilsKt.toJson(videoResolution) : VideoResolutionUtilsKt.toJson(videoResolution2));
    }
}
