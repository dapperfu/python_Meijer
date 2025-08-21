package com.scandit.datacapture.core.internal.module.gl;

import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeTextureBinding;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f125585a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeTextureBinding f125586b;

    /* renamed from: c, reason: collision with root package name */
    public final Size2 f125587c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f125588d;

    public j(ArrayList textureTransformation, NativeTextureBinding sourceFrame, Size2 frameSize, boolean z10) {
        Intrinsics.j(textureTransformation, "textureTransformation");
        Intrinsics.j(sourceFrame, "sourceFrame");
        Intrinsics.j(frameSize, "frameSize");
        this.f125585a = textureTransformation;
        this.f125586b = sourceFrame;
        this.f125587c = frameSize;
        this.f125588d = z10;
    }
}
