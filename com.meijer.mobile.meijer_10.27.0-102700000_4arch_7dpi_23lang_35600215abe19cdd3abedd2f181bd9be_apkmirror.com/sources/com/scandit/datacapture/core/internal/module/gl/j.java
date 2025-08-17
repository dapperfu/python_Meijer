package com.scandit.datacapture.core.internal.module.gl;

import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeTextureBinding;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f124633a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeTextureBinding f124634b;

    /* renamed from: c, reason: collision with root package name */
    public final Size2 f124635c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f124636d;

    public j(ArrayList textureTransformation, NativeTextureBinding sourceFrame, Size2 frameSize, boolean z10) {
        Intrinsics.j(textureTransformation, "textureTransformation");
        Intrinsics.j(sourceFrame, "sourceFrame");
        Intrinsics.j(frameSize, "frameSize");
        this.f124633a = textureTransformation;
        this.f124634b = sourceFrame;
        this.f124635c = frameSize;
        this.f124636d = z10;
    }
}
